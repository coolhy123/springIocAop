package springaop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * ֪ͨ��ǿ��
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����9:37:01
*/
public class ShoppingService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("ѯ��");
		Object obj = arg0.proceed();
		System.out.println("����");
		return obj;
	}

	

}
