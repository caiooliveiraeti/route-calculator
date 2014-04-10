package br.eti.caiooliveira.route.calculator.model.point;

public class City {

	private String name;
	private String state;

	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", state=" + state + "]";
	}

	
}
