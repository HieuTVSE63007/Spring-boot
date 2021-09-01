package com.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.SpringBootDTO;

@RestController
public class SpringBootAPI {
	@PostMapping(value = "/new")
	public SpringBootDTO createNew(@RequestBody SpringBootDTO model) {
		return model;
	}
}
