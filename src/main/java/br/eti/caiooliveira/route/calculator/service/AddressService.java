package br.eti.caiooliveira.route.calculator.service;

import java.util.List;

import br.eti.caiooliveira.route.calculator.RouteCalculatorConfig;
import br.eti.caiooliveira.route.calculator.model.point.Address;
import br.eti.caiooliveira.route.calculator.model.point.Point;

public interface AddressService {

	List<Point> findPointsByAddresses(RouteCalculatorConfig routeCalculatorConfig, List<Address> addresses);

	Point findPointsByAddresses(RouteCalculatorConfig routeCalculatorConfig, Address address);
}
