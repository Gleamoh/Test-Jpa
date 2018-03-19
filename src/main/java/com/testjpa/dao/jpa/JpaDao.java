package com.testjpa.dao.jpa;

public interface JpaDao <T> {
	
	/**
	 * @param id
	 * @return : T
	 */
	T findById(int id);
	
}
