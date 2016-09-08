package com.ipartek.formacion.service;

import com.ipartek.formacion.pojo.IGuerreroHablable;

public interface IGuerreroHablaService {

	String hablar();

	IGuerreroHablable getGuerrero();

	void setGuerrero(IGuerreroHablable guerrero);
}
