package com.jsp.idfc.mock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.idfc.mock.dto.MockDto;
import com.jsp.idfc.mock.repository.MockRepository;

@Component
public class MockDao {
	@Autowired
	MockRepository mockRepository;

//	------- Insert ---------
	public String insert(MockDto dto) {
		mockRepository.save(dto);
		return "Data saved sucessfully :- " + dto;
	}

//	------- remove ----------

	public String delete(MockDto dto) {
		mockRepository.delete(dto);
		return "data is deleted sucessfully :- " + dto;
	}

	public MockDto fetch(int id) {
		Optional<MockDto> dto = mockRepository.findById(id);
		return dto.get();
	}
}
