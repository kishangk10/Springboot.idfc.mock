package com.jsp.idfc.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.idfc.mock.dao.MockDao;
import com.jsp.idfc.mock.dto.MockDto;

@RestController
public class MockController {
	@Autowired
	MockDao mockDao;

//	-------- Insert ---------

	@PostMapping("/mock/save")
	public String insert(@RequestBody MockDto dto) {
		String inserted = mockDao.insert(dto);
		return inserted;
	}

//	-------- remove ----------

	@DeleteMapping("mock/delete")
	public String delete(@RequestBody MockDto dto) {
		String deleted = mockDao.delete(dto);
		return deleted;
	}

//	-------- fetch -----------

	@GetMapping("/mock/fetch")
	public MockDto fetch(@RequestBody MockDto dto) {
		int id = dto.getId();
		MockDto dto2 = mockDao.fetch(id);
		return dto2;
	}
}
