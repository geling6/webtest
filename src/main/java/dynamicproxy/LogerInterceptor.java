package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogerInterceptor implements InvocationHandler {
	private Object target;
	
	public LogerInterceptor(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("fuck liang jing .gan si ta");
		Object obj = method.invoke(target, args);
		System.out.println("gan wan qin qi gan liang jiang .shuang si");
		
		return obj;
	}

}
