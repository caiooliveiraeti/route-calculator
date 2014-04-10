package br.eti.caiooliveira.route.calculator.service;

import java.util.List;

import br.eti.caiooliveira.route.calculator.RouteCalculatorConfig;
import br.eti.caiooliveira.route.calculator.model.point.Point;
import br.eti.caiooliveira.route.calculator.model.route.RouteTotals;
import br.eti.caiooliveira.route.calculator.model.route.TypeRoute;

public interface RouteService {

	RouteTotals calculateTotals(RouteCalculatorConfig routeCalculatorConfig, TypeRoute typeRoute, List<Point> points);

}
