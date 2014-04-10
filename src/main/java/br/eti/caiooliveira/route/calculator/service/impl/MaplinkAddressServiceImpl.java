package br.eti.caiooliveira.route.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.maplink2.webservices.AddressFinder;
import br.com.maplink2.webservices.AddressInfo;
import br.com.maplink2.webservices.AddressLocation;
import br.com.maplink2.webservices.AddressOptions;
import br.eti.caiooliveira.route.calculator.RouteCalculatorConfig;
import br.eti.caiooliveira.route.calculator.model.point.Address;
import br.eti.caiooliveira.route.calculator.model.point.City;
import br.eti.caiooliveira.route.calculator.model.point.Point;
import br.eti.caiooliveira.route.calculator.service.AddressService;
import br.eti.caiooliveira.route.calculator.service.AddressServiceException;

public class MaplinkAddressServiceImpl implements AddressService {


	public List<Point> findPointsByAddresses(RouteCalculatorConfig routeCalculatorConfig, List<Address> addresses) {
		List<Point> points = new ArrayList<Point>();
		for (Address address : addresses) {
			Point point = findPointsByAddresses(routeCalculatorConfig, address);
			points.add(point);
		}
		
		return points;
	}
	
	public Point findPointsByAddresses(RouteCalculatorConfig routeCalculatorConfig, Address address) {
		String token = routeCalculatorConfig.getToken();
		br.com.maplink2.webservices.Address addressWs = generateAddress(address);
		AddressOptions addressOptions = generateAddressOptions();
		
		try {
			AddressInfo addressInfo = new AddressFinder().getAddressFinderSoap().findAddress(addressWs, addressOptions, token);
			return generatePoint(addressInfo, address);
		} catch (Exception ex) {
			throw new AddressServiceException(ex.getMessage(), ex);
		}
	
	}

	private Point generatePoint(AddressInfo addressInfo, Address address) {
		
		if (addressInfo.getRecordCount() > 1){
			AddressLocation addressLocation = addressInfo.getAddressLocation().getAddressLocation().get(0);
			return new Point(addressLocation.getPoint().getX(), addressLocation.getPoint().getY());
		} else {
			throw new AddressServiceException("Nao foi encontrada nenhuma localizacao para o endereco:" + address);
		}

	}

	private AddressOptions generateAddressOptions() {
		AddressOptions addressOptions = new AddressOptions();
		
		addressOptions.setMatchType(1);
		addressOptions.setSearchType(2);
		addressOptions.setUsePhonetic(true);
		
		return addressOptions;
	}

	private br.com.maplink2.webservices.Address generateAddress(Address address) {
		br.com.maplink2.webservices.Address result = new br.com.maplink2.webservices.Address();
		
		result.setStreet(address.getStreet());
		result.setDistrict(address.getDistrict());
		result.setStreet(address.getStreet());
		if(address.getCity() != null){
			result.setCity(generateCity(address.getCity()));
		}
		return result;
	}

	private br.com.maplink2.webservices.City generateCity(City city) {
		br.com.maplink2.webservices.City result = new br.com.maplink2.webservices.City();
		
		result.setName(city.getName());
		result.setState(city.getState());
		
		return result;
	}

}
