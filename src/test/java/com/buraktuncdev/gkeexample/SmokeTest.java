package com.buraktuncdev.gkeexample;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.buraktuncdev.gkeexample.controller.GreetingController;
import com.buraktuncdev.gkeexample.controller.HomeController;
import com.buraktuncdev.gkeexample.service.GreetingService;

@SpringBootTest
public class SmokeTest {

	/** A nice feature of the Spring Test support is that the application context is
	 * cached between tests. That way, if you have multiple methods in a test case or
	 * multiple test cases with the same configuration, they incur the cost of starting
	 * the applicaiton only once. You can control the cache by using the @DirtiesContext annotation.
	 */
	// with Autowired annotation controller injected before the test methods are run.
	@Autowired
	private HomeController controller;

	@Autowired
	private GreetingController greetingController;

	@Autowired
	private GreetingService greetingService;

	// the context is creating our controller test case
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
		assertThat(greetingController).isNotNull();
		assertThat(greetingService).isNotNull();
	}
}
