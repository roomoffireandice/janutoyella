package guide.springboot.maven.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class VehicleControllerTest extends AbstractTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void start_car_should_success() throws Exception {
		String uri = "/vehicleapi/start/vehicle";

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
				.andReturn();

		// Get the status code
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		// Get the response message
		String content = mvcResult.getResponse().getForwardedUrl();
		assertEquals("Vehicle Started", content);
	}

	@Test
	public void stop_car_should_success() throws Exception {
		String uri = "/vehicleapi/stop/vehicle";

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
				.andReturn();

		// Get the status code
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		// Get the response message
		String content = mvcResult.getResponse().getForwardedUrl();
		assertEquals("Vehicle Stopped", content);
	}

	@Test
	public void should_fetch_all_the_benz_cars_successfully() throws Exception {
		String uri = "/vehicleapi/benz/cars";

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
				.andReturn();

		// Get the status code
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
	}
}
