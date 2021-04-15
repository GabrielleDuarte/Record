package com.sinchtest.record.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
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

	@Column(name = "fileName")
	private String fileName;
	
	@Column(name = "analysisDate")
	private LocalDateTime analysisDate;
	
	@Column(name = "executionPerImage")
	private String executionPerImage;
	
	@Column(name = "wholeExecution")
	private String wholeExecution;
	
	@Column(name = "personName")
	private String personName;
	
	@Column(name = "prediction")
	private String prediction;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "expression")
	private String expression;

	public Record(String fileName, LocalDateTime analysisDate, String executionPerImage, String wholeExecution,
			String personName, String prediction, String age, String sex, String expression) {
		super();
		this.fileName = fileName;
		this.analysisDate = analysisDate;
		this.executionPerImage = executionPerImage;
		this.wholeExecution = wholeExecution;
		this.personName = personName;
		this.prediction = prediction;
		this.age = age;
		this.sex = sex;
		this.expression = expression;
	}
	
	

}
