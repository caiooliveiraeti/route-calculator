package br.eti.caiooliveira.route.calculator.service.impl;

import java.util.List;

import br.com.maplink2.webservices.ArrayOfRouteStop;
import br.com.maplink2.webservices.Route;
import br.com.maplink2.webservices.RouteDetails;
import br.com.maplink2.webservices.RouteOptions;
import br.com.maplink2.webservices.RouteStop;
import br.eti.caiooliveira.route.calculator.RouteCalculatorConfig;
import br.eti.caiooliveira.route.calculator.model.point.Point;
import br.eti.caiooliveira.route.calculator.model.route.RouteTotals;
import br.eti.caiooliveira.route.calculator.model.route.TypeRoute;
import br.eti.caiooliveira.route.calculator.service.RouteService;
import br.eti.caiooliveira.route.calculator.service.RouteServiceException;

public class MaplinkRouteServiceImpl implements RouteService {

	public RouteTotals calculateTotals(RouteCalculatorConfig routeCalculatorConfig, TypeRoute typeRoute, List<Point> points) {
		
		String token = routeCalculatorConfig.getToken();
		ArrayOfRouteStop arrayOfRouteStop = generateListRouteStop(points);
		RouteOptions routeOptions = generateRouteOptions(typeRoute);
		
		try {
			br.com.maplink2.webservices.RouteTotals routeTotals = new Route().getRouteSoap().getRouteTotals(arrayOfRouteStop, routeOptions, token);
			return generateRouteTotals(routeTotals);	
		} catch (Exception ex) {
			throw new RouteServiceException(ex.getMessage(), ex);
		}
	}

	private RouteTotals generateRouteTotals(br.com.maplink2.webservices.RouteTotals routeTotals) {
		return new RouteTotals(routeTotals.getTotalTime(), routeTotals.getTotalDistance(), routeTotals.getTotalfuelCost(), routeTotals.getTotalCost());
	}

	private RouteOptions generateRouteOptions(TypeRoute typeRoute) {
		RouteOptions routeOptions = new RouteOptions();
		routeOptions.setRouteDetails(new RouteDetails());
		routeOptions.getRouteDetails().setRouteType(typeRoute.getId());
		return routeOptions;
	}

	private ArrayOfRouteStop generateListRouteStop(List<Point> points) {
		ArrayOfRouteStop arrayOfRouteStop = new ArrayOfRouteStop();
		for (Point point : points) {
			arrayOfRouteStop.getRouteStop().add(generateRouteStop(point));
		}
		
		return arrayOfRouteStop;
	}

	private RouteStop generateRouteStop(Point point) {
		RouteStop routeStop = new RouteStop();
		
		routeStop.setPoint(new br.com.maplink2.webservices.Point());
		routeStop.getPoint().setX(point.getX());
		routeStop.getPoint().setY(point.getY());
		
		return routeStop;
	}

}
