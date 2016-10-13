package com.bmwmms.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.bmwmms.dao.MmsTopicDao;
import com.bmwmms.service.Manager;
import com.bmwmms.service.MmsTopicService;

@Named
@RequestScoped
public class MmsTopicServiceImpl implements MmsTopicService , Serializable, Manager {
	private static final long serialVersionUID = 4526695694344298425L;

	@Inject MmsTopicDao mmsTopicDao;

	@Inject EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public List<String> getTopicPeriods() {
		return mmsTopicDao.getTopicPeriods(entityManager);
	}

	/**
	 * successful
	 */
	@Override
	public String getTopicPeriods1() {
		System.out.println("hello world");
		return "test";
	}




}
