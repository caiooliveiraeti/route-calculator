package br.eti.caiooliveira.route.calculator.model.route;


public enum TypeRoute {
	DEFAULT(0),
	AVOIDING_TRAFFIC(23);

	private int id;

	private TypeRoute(int id){
		this.id = id;
	} 
	
	public int getId() {
		return this.id;
	}
}
