package br.eti.caiooliveira.route.calculator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.eti.caiooliveira.route.calculator.model.point.Address;
import br.eti.caiooliveira.route.calculator.model.point.City;
import br.eti.caiooliveira.route.calculator.model.route.RouteTotals;
import br.eti.caiooliveira.route.calculator.model.route.TypeRoute;
import br.eti.caiooliveira.route.calculator.service.AddressServiceException;

public class RouteCalculatorService {

	@BeforeClass
	public static void beforeTest(){
		//com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump = true;
	}
	
	@Test
	public void test_calculate_totals_avoiding_default(){
		List<Address> addresses = new ArrayList<Address>();
		
		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));
		
		RouteTotals routeTotals = RouteCalculator.Builder.create()
													 .build()
													 .calculateTotals(addresses);
		
		Assert.assertNotNull(routeTotals);
		Assert.assertNotNull(routeTotals.getTotalCost());
		Assert.assertNotNull(routeTotals.getTotalDistance());
		Assert.assertNotNull(routeTotals.getTotalFuelCost());
		Assert.assertNotNull(routeTotals.getTotalTime());
	}
	
	@Test
	public void test_calculate_totals_avoiding_traffic(){
		List<Address> addresses = new ArrayList<Address>();
		
		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));
		
		RouteTotals routeTotals = RouteCalculator.Builder.create()
													 .with(TypeRoute.AVOIDING_TRAFFIC)
													 .build()
													 .calculateTotals(addresses);
		
		Assert.assertNotNull(routeTotals);
		Assert.assertNotNull(routeTotals.getTotalCost());
		Assert.assertNotNull(routeTotals.getTotalDistance());
		Assert.assertNotNull(routeTotals.getTotalFuelCost());
		Assert.assertNotNull(routeTotals.getTotalTime());
	}
	
	@Test
	public void test_calculate_totals_custom_token(){
		List<Address> addresses = new ArrayList<Address>();
		
		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));
		
		String token = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";
		RouteTotals routeTotals = RouteCalculator.Builder.create(new RouteCalculatorConfig(token))
													 .build()
													 .calculateTotals(addresses);
		
		Assert.assertNotNull(routeTotals);
		Assert.assertNotNull(routeTotals.getTotalCost());
		Assert.assertNotNull(routeTotals.getTotalDistance());
		Assert.assertNotNull(routeTotals.getTotalFuelCost());
		Assert.assertNotNull(routeTotals.getTotalTime());
	}
	
	@Test(expected=AddressServiceException.class)
	public void test_calculate_totals_custom_token_fail(){
		List<Address> addresses = new ArrayList<Address>();
		
		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));
		
		String token = "102030405060708090";
		RouteTotals routeTotals = RouteCalculator.Builder.create(new RouteCalculatorConfig(token))
													 .with(TypeRoute.AVOIDING_TRAFFIC)
													 .build()
													 .calculateTotals(addresses);
		
		Assert.assertNotNull(routeTotals);
		Assert.assertNotNull(routeTotals.getTotalCost());
		Assert.assertNotNull(routeTotals.getTotalDistance());
		Assert.assertNotNull(routeTotals.getTotalFuelCost());
		Assert.assertNotNull(routeTotals.getTotalTime());
	}
	
}
