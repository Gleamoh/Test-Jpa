package com.testjpa.tp3.dao.jpa;

public interface JpaDao <T> {
	
	/**
	 * @param id
	 * @return : T
	 */
	T findById(int id);
	
}
