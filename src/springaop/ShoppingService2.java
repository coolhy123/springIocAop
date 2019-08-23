package springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
* @author 何永
* @createDate 创建时间：2019年8月23日 上午10:25:06
*/
public class ShoppingService2 implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object obj = arg0.proceed();
		System.out.println("送鼠标");
		return obj;
	}

}
