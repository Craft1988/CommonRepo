package com.mike.training.creational.builder;

import com.mike.training.creational.builder.builder.impl.BasicDeploymentBuilder;
import com.mike.training.creational.builder.builder.impl.ConsoleDeploymentBuilder;
import com.mike.training.creational.builder.builder.impl.WebDeploymentBuilder;
import com.mike.training.creational.builder.builder.impl.WebMQDeploymentBuilder;

/**
 * Manages and processes the deployments by leveraging the builder design pattern   
 * 
 * @author Lalit Mehra
 *
 */
public class DeploymentManager {

	public static void deploy(DeploymentStrategy scheme) {
		
		DeploymentAction action = null;
		
		switch (scheme) {
		case WEB:
			action = new WebDeploymentBuilder()
					.installServer()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		case CONSOLE:
			action = new ConsoleDeploymentBuilder()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		case WEBMQ:
			action = new WebMQDeploymentBuilder()
					.installMQ()
					.installServer()
					.installDatabase()
					.installProjectManager()
					.build();
				break;
		default:
			action = new BasicDeploymentBuilder()
					.build();
				break;
		}
		
		VMDeployer.deploy(action);
		
	}

}
