package br.eti.caiooliveira.route.calculator;

import java.util.List;

import br.eti.caiooliveira.route.calculator.model.point.Address;
import br.eti.caiooliveira.route.calculator.model.point.Point;
import br.eti.caiooliveira.route.calculator.model.route.RouteTotals;
import br.eti.caiooliveira.route.calculator.model.route.TypeRoute;
import br.eti.caiooliveira.route.calculator.service.AddressService;
import br.eti.caiooliveira.route.calculator.service.RouteService;
import br.eti.caiooliveira.route.calculator.service.impl.MaplinkAddressServiceImpl;
import br.eti.caiooliveira.route.calculator.service.impl.MaplinkRouteServiceImpl;

public class RouteCalculator {

	private TypeRoute typeRoute;
	private AddressService addressService;
	private RouteService routeService;
	private RouteCalculatorConfig routeCalculatorConfig;

	public RouteCalculator(Builder builder) {
		this.addressService = builder.addressService;
		this.routeService = builder.routeService;
		this.typeRoute = builder.typeRoute;
		this.routeCalculatorConfig = builder.routeCalculatorConfig;
	}

	static class Builder {
		private TypeRoute typeRoute = TypeRoute.DEFAULT;
		private AddressService addressService = new MaplinkAddressServiceImpl();
		private RouteService routeService = new MaplinkRouteServiceImpl();
		private RouteCalculatorConfig routeCalculatorConfig;

		public Builder(RouteCalculatorConfig routeCalculatorConfig) {
			this.routeCalculatorConfig = routeCalculatorConfig;
		}

		public static Builder create() {
			return new Builder(new RouteCalculatorConfig("c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK="));
		}

		public static Builder create(RouteCalculatorConfig routeCalculatorConfig) {
			return new Builder(routeCalculatorConfig);
		}
		
		public Builder with(TypeRoute typeRoute) {
			this.typeRoute = typeRoute;
			return this;
		}

		public Builder with(AddressService addressService) {
			this.addressService = addressService;
			return this;
		}

		public Builder with(RouteService routeService) {
			this.routeService = routeService;
			return this;
		}

		public RouteCalculator build() {
			return new RouteCalculator(this);
		}

	}

	public RouteTotals calculateTotals(List<Address> addresses) {
		List<Point> points = addressService.findPointsByAddresses(routeCalculatorConfig, addresses);
		return routeService.calculateTotals(routeCalculatorConfig, typeRoute, points);
	}

}
