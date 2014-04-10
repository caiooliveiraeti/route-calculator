package br.eti.caiooliveira.route.calculator.model.route;

public class RouteTotals {

	private String totalTime;
	private double totalDistance;
	private double totalFuelCost;
	private double totalCost;

	public RouteTotals(String totalTime, double totalDistance, double totalFuelCost, double totalCost) {
		this.totalTime = totalTime;
		this.totalDistance = totalDistance;
		this.totalFuelCost = totalFuelCost;
		this.totalCost = totalCost;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public double getTotalFuelCost() {
		return totalFuelCost;
	}

	public double getTotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "RouteTotals [totalTime=" + totalTime + ", totalDistance="
				+ totalDistance + ", totalFuelCost=" + totalFuelCost
				+ ", totalCost=" + totalCost + "]";
	}

}
