package com.bmwmms.interceptor;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;

import com.bmwmms.service.Manager;


//@Transactional
@Interceptor
@ManagedBean
public class TransactionalInterceptor implements Serializable {

	private static final long serialVersionUID = -4005485633217198958L;

	@AroundInvoke
	public Object manageTransaction(InvocationContext ctx) throws Exception {
		Object target = ctx.getTarget();
		if(!(target instanceof Manager)){
			throw new RuntimeException("Transactional annotation can only apply to Manager.");
		}
		Manager manager = (Manager) target;
		EntityManager em = manager.getEntityManager();
		Object obj = null;
		try {
			em.getTransaction().begin();
			obj = ctx.proceed();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			try {
				em.getTransaction().rollback();
			} catch (RuntimeException rex) {
				rex.printStackTrace();
			}
			throw ex;
		}
		return obj;
	}
}