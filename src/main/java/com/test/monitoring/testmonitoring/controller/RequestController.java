package com.test.monitoring.testmonitoring.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

  private Counter requestCounter = Metrics.counter("request.counter");

  @GetMapping("request")
  public String request() {
    requestCounter.increment();
    return "response";
  }
}
