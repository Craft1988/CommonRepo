package com.mike.training.creational.builder.builder.impl;

import com.mike.training.creational.builder.DeploymentAction;
import com.mike.training.creational.builder.DeploymentStrategy;
import com.mike.training.creational.builder.builder.DeploymentBuilder;
import com.mike.training.creational.builder.resource.Database;
import com.mike.training.creational.builder.resource.ProjectManager;
import com.mike.training.creational.builder.resource.WebServer;
import com.mike.training.creational.builder.resource.impl.ApacheTomcat;
import com.mike.training.creational.builder.resource.impl.Maven;
import com.mike.training.creational.builder.resource.impl.Oracle;

/**
 * An implementation of a Deployment Builder
 * 
 * @author Lalit Mehra
 *
 */
public class WebDeploymentBuilder implements DeploymentBuilder {

	protected DeploymentAction action;
	protected ProjectManager projectManager;
	protected Database database;
	protected WebServer server;
	
	@Override
	public DeploymentBuilder installServer() {
		System.out.println("Configuring Apache Tomcat");
		server = new ApacheTomcat();
		return this;
	}
	
	@Override
	public DeploymentBuilder installProjectManager() {
		System.out.println("Configuring Maven");
		projectManager = new Maven();
		return this;
	}
	
	@Override
	public DeploymentBuilder installDatabase() {
		System.out.println("Configuring Oracle Database");
		database = new Oracle();
		return this;
	}
	
	@Override
	public DeploymentAction build() {
		if (null == database || null == projectManager || null == server) 
			throw new IllegalStateException();
		
		action = new DeploymentAction();
		action.setDatabase(database);
		action.setProManager(projectManager);
		action.setServer(server);
		action.setDescription(DeploymentStrategy.WEB.strategy());
		return action;
	}

}
