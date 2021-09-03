package com.springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.SpringBootDTO;

@RestController
public class SpringBootAPI {
	@PostMapping(value = "/new")
	public SpringBootDTO createNew(@RequestBody SpringBootDTO model) {
		return model;
	}
	
	@PutMapping(value = "/new")
	public SpringBootDTO updateNew(@RequestBody SpringBootDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/new")
	public void deleteNew(@RequestBody long[] ids) {
		
	}
}
