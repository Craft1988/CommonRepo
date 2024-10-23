package com.mike.training.creational.builder.builder.impl;

import com.mike.training.creational.builder.DeploymentAction;
import com.mike.training.creational.builder.DeploymentStrategy;
import com.mike.training.creational.builder.builder.DeploymentBuilder;
import com.mike.training.creational.builder.resource.Database;
import com.mike.training.creational.builder.resource.ProjectManager;
import com.mike.training.creational.builder.resource.impl.Gradle;
import com.mike.training.creational.builder.resource.impl.MySqlDatabase;

/**
 * An implementation of a Deployment Builder
 * 
 * @author Lalit Mehra
 *
 */
public class ConsoleDeploymentBuilder implements DeploymentBuilder {

	private DeploymentAction action;
	private ProjectManager projectManager;
	private Database database;
	
	@Override
	public DeploymentBuilder installProjectManager() {
		System.out.println("Configuring Gradle");
		projectManager = new Gradle();
		return this;
	}
	
	@Override
	public DeploymentBuilder installDatabase() {
		System.out.println("Configuring MySQL Database");
		database = new MySqlDatabase();
		return this;
	}
	
	@Override
	public DeploymentAction build() {
		if(null == database || null == projectManager) 
			throw new IllegalStateException();
		
		action = new DeploymentAction();
		action.setDatabase(database);
		action.setProManager(projectManager);
		action.setDescription(DeploymentStrategy.CONSOLE.strategy());
		return action;
	}
}
