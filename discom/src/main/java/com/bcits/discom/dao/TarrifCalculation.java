package com.bcits.discom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.discom.beans.TarrifMasterBean;

@Repository
public class TarrifCalculation {

	@PersistenceUnit
	private EntityManagerFactory factory;

	public double billCalculation(double unitsConsumed, String typeOfConsumer) {
		EntityManager manager = factory.createEntityManager();

		String jpql = " from TarrifMasterBean where tarrifpk.typeOfConsumer =:consumerType ";
		Query query = manager.createQuery(jpql);
		query.setParameter("consumerType", typeOfConsumer);

		List<TarrifMasterBean> tarrifBean = query.getResultList();

		long initialRange = tarrifBean.get(0).getTarrifpk().getRange();
		long midRange = tarrifBean.get(1).getTarrifpk().getRange();
		long finalRange = tarrifBean.get(2).getTarrifpk().getRange();

		double initialAmount = tarrifBean.get(0).getAmount();
		double midAmount = tarrifBean.get(1).getAmount();
		double finalAmount = tarrifBean.get(2).getAmount();

		double bill = 0.0;

		if (unitsConsumed < initialRange) {
			bill = unitsConsumed * initialAmount;
		} else if (unitsConsumed < midRange) {
			bill = (initialRange * initialAmount) + ((unitsConsumed - initialRange) * midAmount);
		} else if (unitsConsumed > finalRange) {
			bill = (initialRange * initialAmount) + ((midRange - initialRange) * midAmount)
					+ ((unitsConsumed - midRange));

		}
		return bill;
	}//end of billCalculation()
}//End of Class
