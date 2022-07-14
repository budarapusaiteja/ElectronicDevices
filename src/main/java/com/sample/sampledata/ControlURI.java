package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlURI {
	@Autowired
	ServiceProvider s;
	@GetMapping("/all")
	public List<Devices> all() {
		return s.all();
	}
	@PostMapping("/all")
	public void a(@RequestBody Devices d) {
		s.push(d);
	}
}
