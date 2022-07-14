package com.sample.sampledata;

import java.util.List;

public interface Services {
	public List<Devices> all();
	public void push(Devices d);
}
