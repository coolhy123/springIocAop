package springaop;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * ǰ��֪ͨ
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����9:03:29
*/
public class WelcomeAdviceBefore implements MethodBeforeAdvice{
	

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("��ӭ����");
	}
}
