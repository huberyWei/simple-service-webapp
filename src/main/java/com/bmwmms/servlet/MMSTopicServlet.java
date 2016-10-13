package com.bmwmms.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/topic")
public class MMSTopicServlet {
	/**
	 * 查询所有用户数据
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void query() {
		final EntityManagerFactory emf = Persistence.createEntityManagerFactory("simple-service-webapp");
		long s = System.currentTimeMillis();
		// 数据库连接失败这里会抛出异常
		final EntityManager em = emf.createEntityManager();
		long e = System.currentTimeMillis();
		System.out.println("连接数据库耗时: " + (e - s) + "毫秒");
		// 获取数据
		List<String> list = em.createQuery("SELECT distinct tp.topicPeriod FROM MmsTopic tp", String.class).getResultList();
		for (String topicPeriod : list) {
			System.out.println("topic period: "+topicPeriod);
		}
		em.close();
	}
}
