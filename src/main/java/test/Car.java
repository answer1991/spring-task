package test;


public class Car {
	private Engine engine = new EnglishEngine();

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void run() {
		engine.start();
	}
	
}
