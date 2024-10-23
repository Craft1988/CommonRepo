package com.mike.training.creational.builder.builder.impl;

import com.mike.training.creational.builder.DeploymentAction;
import com.mike.training.creational.builder.builder.DeploymentBuilder;

/**
 * An implementation of a Deployment Builder
 * 
 * @author Lalit Mehra
 *
 */
public class BasicDeploymentBuilder implements DeploymentBuilder {

	private DeploymentAction action;

	public BasicDeploymentBuilder() {
		action = new DeploymentAction();
	}

	@Override
	public DeploymentAction build() {
		action.setDescription("Basic Deployment Scheme");
		return action;
	}
}
