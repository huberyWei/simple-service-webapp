package com.bmwmms.servlet;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bmwmms.service.Manager;
import com.bmwmms.service.MmsTopicService;
import com.bmwmms.service.impl.ItemProcessor;
import com.bmwmms.service.impl.MmsTopicServiceImpl;


//http://localhost:8080/simple-service-webapp/webapi/topic/selectall
@ManagedBean
@Path("/topic1")
public class MMSTopicServletViaAnnotation implements /*BaseServlet ,*/ Manager{

	
		@Inject
	private EntityManager entityManager;


	@Override
	public EntityManager getEntityManager() {
		return this.entityManager;
	}
	/**
	 * 查询数据库
	 */
	@Inject MmsTopicService mmsTopicService;
	
	@GET
	@Path("/selectDB")
	@Produces("text/plain")
	public String getTopicsByPeriod() {
		List<String> periodList = mmsTopicService.getTopicPeriods();
		for (String period : periodList) {
			System.out.println(period);
		}
		return "select oracle success";

	}
	
	/**
	 * successfull,接口或者具体类都可以注入成功
	 */
	@Inject MmsTopicService mmsTopicService2;
//	@Inject MmsTopicServiceImpl mmsTopicService2;
	@GET
	@Path("/selectall2")
	@Produces("text/plain")
	public String getTopicsByPeriod2() {
		return mmsTopicService2.getTopicPeriods1();
	}

	@Inject ItemProcessor itemProcessor;
	@GET
	@Path("/test")
	@Produces("text/plain")
	public String get(){
		 itemProcessor.execute();
		 return "success";
	}
	
}