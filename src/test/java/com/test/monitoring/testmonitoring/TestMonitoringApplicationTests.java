package com.test.monitoring.testmonitoring;

import com.test.monitoring.testmonitoring.controller.RequestController;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestMonitoringApplicationTests {

	@Autowired
	RequestController requestController;

	@Test
	void contextLoads() {
		assertThat(requestController).isNotNull();
	}

}
