package com.testjpa.dao.jpa;

public interface IJpaDao <T> {
	
	/**
	 * @param id
	 * @return : T
	 */
	T findById(int id);
	
}
