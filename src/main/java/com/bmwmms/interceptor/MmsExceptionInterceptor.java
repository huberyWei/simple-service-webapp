package com.bmwmms.interceptor;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.bmwmms.servlet.BaseServlet;

public class MmsExceptionInterceptor implements Serializable {

	private static final long serialVersionUID = -4005485633217198958L;

	@AroundInvoke
	public Object manageTransaction(InvocationContext ctx) throws Exception {
		Object target = ctx.getTarget();
		String errorCode = "";
		String errorMsg = "";
		Object obj = null;
		if (target instanceof BaseServlet) {
			try {
				obj = ctx.proceed();
			} catch (Exception ex) {
/*				if(ex instanceof MmsInterfaceException){
					MmsInterfaceException mmsInterfaceException = (MmsInterfaceException)ex;
					errorMsg = mmsInterfaceException.getCause().getMessage();
					errorCode = mmsInterfaceException.getMessage();
					return new ResponseResultDTO().fail(errorCode, errorMsg);

				}
				else if(ex instanceof MultiMessageException){
					ex.printStackTrace();
					return new ResponseResultDTO().fail(errorCode, ((MultiMessageException) ex).getErrors());
				}
				else{
					ex.printStackTrace();
					errorCode = ResponseCodeEnum.SYSTEM_ERROR.getErrorCode();
					errorMsg = ResponseCodeEnum.SYSTEM_ERROR.getErrorMsg();
					return new ResponseResultDTO().fail(errorCode, errorMsg);
				}*/
			}
		}
		return obj;
	}
}