package com.bmwmms.servlet;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/cdibean")
public class CdiBeanResource {
    @Inject MyOtherCdiBean bean;// CDI injected bean
 
    @GET
    @Produces("text/plain")
    public String getIt() {
        return bean.getName();
    }
}