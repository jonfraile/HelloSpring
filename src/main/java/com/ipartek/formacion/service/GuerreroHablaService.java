package com.ipartek.formacion.service;

import com.ipartek.formacion.pojo.IGuerreroHablable;

public class GuerreroHablaService implements IGuerreroHablaService {

	private IGuerreroHablable guerrero;
	// Spring se encarga de crear el objeto
	// = new GuerreroOrco();

	public String hablar() {
		return this.guerrero.hablar();
	}

	public IGuerreroHablable getGuerrero() {
		return this.guerrero;
	}

	public void setGuerrero(IGuerreroHablable guerrero) {
		this.guerrero = guerrero;
	}

}
