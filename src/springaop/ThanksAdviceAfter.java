package springaop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * ����֪ͨ
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����8:58:54
*/
public class ThanksAdviceAfter  implements AfterReturningAdvice{
	

		@Override
		public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
			System.out.println("лл�ݹ�");
			
		};
}
