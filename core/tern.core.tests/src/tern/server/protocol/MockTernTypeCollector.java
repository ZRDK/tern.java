package tern.server.protocol;

import tern.server.ITernServer;
import tern.server.protocol.type.ITernTypeCollector;

public class MockTernTypeCollector implements ITernTypeCollector {

	private String type;
	private boolean guess;
	private String name;
	private String exprName;
	private String doc;
	private String url;
	private String origin;
	private Object item;
	private ITernServer ternServer;

	@Override
	public void setType(String type, boolean guess, String name,
			String exprName, String doc, String url, String origin,
			Object item, ITernServer ternServer) {
		this.type = type;
		this.guess = guess;
		this.name = name;
		this.exprName = exprName;
		this.doc = doc;
		this.url = url;
		this.origin = origin;
		this.item = item;
		this.ternServer = ternServer;
	}

	public String getType() {
		return type;
	}

	public boolean isGuess() {
		return guess;
	}

	public String getName() {
		return name;
	}

	public String getExprName() {
		return exprName;
	}

	public String getDoc() {
		return doc;
	}

	public String getUrl() {
		return url;
	}

	public String getOrigin() {
		return origin;
	}

	public Object getItem() {
		return item;
	}

	public ITernServer getTernServer() {
		return ternServer;
	}
}
