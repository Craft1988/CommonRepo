package com.mike.training.creational.builder;

import com.mike.training.creational.builder.resource.Database;
import com.mike.training.creational.builder.resource.MessagingQueue;
import com.mike.training.creational.builder.resource.ProjectManager;
import com.mike.training.creational.builder.resource.WebServer;

/**
 * Describes the deployment action constructed by the builders
 * 
 * @author Lalit Mehra
 *
 */
public class DeploymentAction {

	private WebServer server;
	private Database database;
	private MessagingQueue queue;
	private ProjectManager proManager;

	private String description;

	public DeploymentAction() {
	}

	public WebServer getServer() {
		return server;
	}

	public void setServer(WebServer server) {
		this.server = server;
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public MessagingQueue getQueue() {
		return queue;
	}

	public void setQueue(MessagingQueue queue) {
		this.queue = queue;
	}

	public ProjectManager getProManager() {
		return proManager;
	}

	public void setProManager(ProjectManager proManager) {
		this.proManager = proManager;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
