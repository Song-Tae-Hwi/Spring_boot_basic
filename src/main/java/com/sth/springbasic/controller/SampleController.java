package com.sth.springbasic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sth.springbasic.dto.PostSample1RequestDto;
import com.sth.springbasic.servie.SampleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

  private final SampleService sampleService;

  @PostMapping("")
  public ResponseEntity<String> postSample1(
      @RequestBody @Valid PostSample1RequestDto requestBody) {
    ResponseEntity<String> response = sampleService.postSample1(requestBody);
    return response;
  }

  @DeleteMapping("/{sampleId}")
  public ResponseEntity<String> deleteSample1(
      @PathVariable("sampleId") String sampleId) {
    ResponseEntity<String> response = sampleService.deleteSample1(sampleId);
    return response;
  }

  @GetMapping("")
  public ResponseEntity<String> queryMethod() {
    ResponseEntity<String> response = sampleService.queryMethod();
    return response;
  }
}
