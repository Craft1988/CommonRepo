package com.mike.training.creational.builder.test;

import com.mike.training.creational.builder.DeploymentAction;
import com.mike.training.creational.builder.DeploymentManager;
import com.mike.training.creational.builder.DeploymentStrategy;
import com.mike.training.creational.builder.builder.impl.ConsoleDeploymentBuilder;
import com.mike.training.creational.builder.builder.impl.WebDeploymentBuilder;

/**
 * Initiates a deployemnt
 * 
 * @author Lalit Mehra
 *
 */
public class DeploymentInitiator {
	
	public static void initiate() {
		DeploymentManager.deploy(DeploymentStrategy.WEB);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.CONSOLE);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.WEBMQ);
		System.out.println();
		DeploymentManager.deploy(DeploymentStrategy.VANILLA);
	}
	
	public static void main(String[] args) {
		initiate();
	 new StringBuilder();
	}

}