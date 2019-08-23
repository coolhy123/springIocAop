package springaop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * 通知增强类
* @author 何永
* @createDate 创建时间：2019年8月23日 上午9:37:01
*/
public class ShoppingService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("询价");
		Object obj = arg0.proceed();
		System.out.println("付款");
		return obj;
	}

	

}
