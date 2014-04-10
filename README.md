## route-calculator

Componente para calculo de totais de rotas.

# Instalando

route-calculator.jar pode ser instalado no seu repositorio de componentes. Por exemplo: ([Nexus](http://www.sonatype.org/nexus/))

Depois de instalado basta adicionar no pom.xml
```xml
	<dependency>
		<groupId>br.eti.caiooliveira</groupId>
		<artifactId>route-calculator</artifactId>
		<version>1.0.0</version>
	</dependency>
```

# Usando

Calculando rota padrao mais rapida:
```java
@Resource
public class RouteCalculatorService {

	public void calculate() {
		List<Address> addresses = new ArrayList<Address>();

		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));

		RouteTotals routeTotals = RouteCalculator.Builder.create()
													 .build()
													 .calculateTotals(addresses);
	}

}
```

Calculando rota evitando o trânsito:
```java
@Resource
public class RouteCalculatorService {

	public void calculate() {
		List<Address> addresses = new ArrayList<Address>();

		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));

		RouteTotals routeTotals = RouteCalculator.Builder.create()
													 .with(TypeRoute.AVOIDING_TRAFFIC)
													 .build()
													 .calculateTotals(addresses);
	}

}
```

O componente ja vem com um token padrao, mas o token pode ser alterado

Calculando rota padrao mais rapida, com token proprio:
```java
@Resource
public class RouteCalculatorService {

	public void calculate() {
		List<Address> addresses = new ArrayList<Address>();

		addresses.add(new Address("Rua Barao de Iguape", "Liberdade", "495", "Sao Paulo", "SP"));
		addresses.add(new Address("Avenida Sao Luis", "Republica", new City("Sao Paulo", "SP")));

		String token = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";
		RouteTotals routeTotals = RouteCalculator.Builder.create(new RouteCalculatorConfig(token))
													 .build()
													 .calculateTotals(addresses);
	}

}
```
