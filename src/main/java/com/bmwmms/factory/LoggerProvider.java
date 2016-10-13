package com.bmwmms.factory;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bmwmms.annotations.ControllerLog;
import com.bmwmms.annotations.ModelLog;
import com.bmwmms.annotations.PersistenceLog;

@Dependent
public class LoggerProvider {

	@Produces @ModelLog
	public Logger getModelLogger() {
		return LoggerFactory.getLogger("com.bmw.mms.model");
	}
	
	@Produces @ControllerLog
	public Logger getControllerLogger() {
		return LoggerFactory.getLogger("com.bmw.mms.servlet");
	}
	
	@Produces @PersistenceLog
	public Logger getPersistenceLogger() {
		return LoggerFactory.getLogger("com.bmw.mms.service");
	}
}
