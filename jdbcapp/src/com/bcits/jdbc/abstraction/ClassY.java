package com.bcits.jdbc.abstraction;

public class ClassY implements Connection{

	@Override
	public Statement createStatement() {
		return new ClassB();
	}


}
