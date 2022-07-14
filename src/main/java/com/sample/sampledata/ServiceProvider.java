package com.sample.sampledata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceProvider implements Services{
	@Autowired
	DataAccess d;
	@Override
	public List<Devices> all() {
		// TODO Auto-generated method stub
		return d.findAll();
	}
	@Override
	public void push(Devices ed) {
		// TODO Auto-generated method stub
		d.save(ed);
	}

}
