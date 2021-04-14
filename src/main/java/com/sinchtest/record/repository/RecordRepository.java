package com.sinchtest.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinchtest.record.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
