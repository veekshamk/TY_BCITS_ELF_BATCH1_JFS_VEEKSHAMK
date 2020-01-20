package com.bcits.jdbcapp.common;

import java.sql.Statement;

public interface Connection1 {
	public void print();
	/*
	 * Some abstract Methods
	 * (around 10 for example)
	 */

	public Statement createStatement();

}//End of Interface
