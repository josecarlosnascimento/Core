package br.com.base.core;

import java.sql.Connection;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Transactional
public class JdbcInterceptor {
	
	@Inject
	private Connection conn;
	
	static {
		System.out.println("JdbcInterceptor");
	}

	@AroundInvoke
	public Object invoke(InvocationContext context) throws Exception {

		
		try {
			
			if(conn.isClosed()) {
				
				
			}
			
			
			return context.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fechando conexão");
			conn.close();
		}
		return null;
	}
}
