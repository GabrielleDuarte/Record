package com.sinchtest.record.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinchtest.record.entity.Record;
import com.sinchtest.record.repository.RecordRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/apirecord")
@Api(value = "API REST Record")
public class RecordController {

	private final RecordRepository recordRepository;

	public RecordController(RecordRepository recordRepository) {
		super();
		this.recordRepository = recordRepository;
	}
	
	@PostMapping(value = "/register")
	@ApiOperation(value = "Register a new record")
	public void recordSave(@RequestBody Record record) {
		recordRepository.save(record);
	}	
}
