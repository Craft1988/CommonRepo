package com.mike.training.structural.adapter.modern;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mike.training.structural.adapter.exception.DataStorageException;
import com.mike.training.structural.adapter.util.StorageType;

/**
 * Describes the functionalities provided by a modern data analyser 
 * 
 * @author Lalit Mehra
 *
 */
public interface ModernDataAnalyser {

	public void store(StorageType storage, Map<String, String> data) throws IllegalArgumentException, DataStorageException;
	
	public List<String> fetch(StorageType storage, Set<String> searchKeys) throws IllegalArgumentException, DataStorageException;
	
}
