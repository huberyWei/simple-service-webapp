package com.bmwmms.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;

import org.glassfish.jersey.process.internal.RequestScoped;

//@Named
//@RequestScoped
public class MmsTopicDao implements Serializable {
	private static final long serialVersionUID = -6548127632255287104L;

	public List<String> getTopicPeriods(EntityManager entityManager) {
		return entityManager.createQuery("SELECT distinct tp.topicPeriod FROM MmsTopic tp", String.class).getResultList();
	}

}
