package com.kinettik.mx.performance.logging;

public class NodeWithoutToString {
	protected String name;
	protected String ip;
	protected long childs;

	public NodeWithoutToString(final String name, final String ip,
			final long childs) {
		this.name = name;
		this.ip = ip;
		this.childs = childs;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(final String ip) {
		this.ip = ip;
	}

	public long getChilds() {
		return childs;
	}

	public void setChilds(final long childs) {
		this.childs = childs;
	}
}
