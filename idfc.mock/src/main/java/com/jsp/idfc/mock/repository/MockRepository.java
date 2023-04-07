package com.jsp.idfc.mock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.idfc.mock.dto.MockDto;

@Repository
public interface MockRepository extends JpaRepository<MockDto, Integer> {

}
