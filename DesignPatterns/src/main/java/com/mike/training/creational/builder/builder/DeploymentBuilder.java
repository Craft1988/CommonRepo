package com.mike.training.creational.builder.builder;

import com.mike.training.creational.builder.DeploymentAction;

/**
 * Builder interface that provides methods to build a deployment object 
 * 
 * @author Lalit Mehra
 *
 */
public interface DeploymentBuilder {
	
	public DeploymentAction build();
	
	public default DeploymentBuilder installServer() {
		return this;
	}

	public default DeploymentBuilder installProjectManager() {
		return this;
	}
	
	public default DeploymentBuilder installDatabase() {
		return this;
	}
	
	public default DeploymentBuilder installMQ() {
		return this;
	}

}
