package com.ipartek.formacion.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Intercepta los metodos del GuerreroService para tracear
 *
 */
public class GuerreroServiceInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		try {
			return methodInvocation.proceed();
		} finally {
			final String metodo = methodInvocation.getMethod().getDeclaringClass().getSimpleName();
			final String clase = methodInvocation.getMethod().getName();
			System.out.println("interceptado " + clase + " " + metodo);
		}
	}

}
