package com.sinchtest.record.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Record {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "record_seq")
    @SequenceGenerator(name = "record_seq", sequenceName = "record_seq", allocationSize = 1)
	private Long id;

	private String fileName;
	
	private LocalDateTime analysisDate;
	
	private LocalTime executionPerImage;
	
	private LocalTime wholeExecution;
	
	private String personName;
	
	private String prediction;
	
	private String age;
	
	private String sex;
	
	private String expression;

}
