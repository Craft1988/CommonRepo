package com.mike.training.creational.builder;

import com.mike.training.creational.builder.resource.Database;
import com.mike.training.creational.builder.resource.MessagingQueue;
import com.mike.training.creational.builder.resource.ProjectManager;
import com.mike.training.creational.builder.resource.WebServer;
import com.mike.training.creational.builder.resource.impl.ApacheTomcat;
import com.mike.training.creational.builder.resource.impl.Maven;
import com.mike.training.creational.builder.resource.impl.Oracle;
import com.mike.training.creational.builder.resource.impl.RabbitMQ;

/**
 * @author Lalit Mehra
 *
 */
public class ImmutableDeploymentAction {

	private WebServer server;
	private Database database;
	private MessagingQueue queue;
	private ProjectManager proManager;

	public ImmutableDeploymentAction(DeploymentBuilder builder) {
		this.server = builder.server;
		this.database = builder.database;
		this.proManager = builder.proManager;
		this.queue = builder.queue;
	}

	public static class DeploymentBuilder {

		private WebServer server;
		private Database database;
		private MessagingQueue queue;
		private ProjectManager proManager;

		public DeploymentBuilder installServer() {
			this.server = new ApacheTomcat();
			return this;
		}

		public DeploymentBuilder installDatabase() {
			this.database = new Oracle();
			return this;
		}

		public DeploymentBuilder installQueue() {
			this.queue = new RabbitMQ();
			return this;
		}

		public DeploymentBuilder installProjectManager() {
			this.proManager = new Maven();
			return this;
		}

		public ImmutableDeploymentAction build() {
			return new ImmutableDeploymentAction(this);
		}

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

}
