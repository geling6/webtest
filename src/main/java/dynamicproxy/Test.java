package dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		UserService user = new UserServiceImpl();
		
		LogerInterceptor log = new LogerInterceptor(user);
		
		UserService proxy = 
				(UserService)Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), log);
		
		proxy.save();
		
	}

}
