package springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����10:25:06
*/
public class ShoppingService2 implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object obj = arg0.proceed();
		System.out.println("�����");
		return obj;
	}

}
