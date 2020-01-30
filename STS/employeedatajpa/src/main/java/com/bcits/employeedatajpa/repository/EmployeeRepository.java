package com.bcits.employeedatajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer>{
	
		 
	    @Query(" FROM EmployeeInfoBean WHERE empId = :id and password =:pwd ")
	    public EmployeeInfoBean getEmployeeByIdAndPwd(int id, @Param("pwd") String password);
	    
}//End of Repository
