package guide.springboot.maven.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guide.springboot.maven.model.Benz;

@RestController
@RequestMapping("/vehicleapi")
public class VehicleController {

	@RequestMapping("/start/vehicle")
	public String startVehicle() {

		return "Vehicle Started";
	}

	@RequestMapping("/stop/vehicle")
	public String stopVehicle() {

		return "Vehicle Stopped";
	}

	@RequestMapping("/benz/cars")
	public List<Benz> getBenzCars() {

		return Arrays.asList(new Benz("Mercedes Benz - A Class ", 1997), new Benz("Mercedes Benz - A Class ", 1997),
				new Benz("Mercedes Benz - B Class ", 2005), new Benz("Mercedes Benz - C Class ", 2013),
				new Benz("Mercedes Benz - CLA", 2004), new Benz("Mercedes Benz - E Class ", 1953),
				new Benz("Mercedes Benz - G Class ", 1972), new Benz("Mercedes Benz - GLA ", 2013),
				new Benz("Mercedes Benz - GLB ", 2019), new Benz("Mercedes Benz - GLC ", 2015),
				new Benz("Mercedes Benz - GLE ", 1997), new Benz("Mercedes Benz - GLS ", 2006),
				new Benz("Mercedes Benz - S Class ", 1972), new Benz("Mercedes Benz - SL Class ", 1954),
				new Benz("Mercedes Benz - SLC ", 1996), new Benz("Mercedes Benz - V Class ", 2004),
				new Benz("Mercedes Benz - AMG GT ", 2014), new Benz("Mercedes Benz - AMG GT4 ", 2018),
				new Benz("Mercedes Benz - X Class0 ", 2017), new Benz("Mercedes Benz - EQC ", 2019),
				new Benz("Mercedes Benz - EQV ", 2014));
	}
}
