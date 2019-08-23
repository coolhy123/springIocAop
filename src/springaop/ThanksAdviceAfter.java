package springaop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 后置通知
* @author 何永
* @createDate 创建时间：2019年8月23日 上午8:58:54
*/
public class ThanksAdviceAfter  implements AfterReturningAdvice{
	

		@Override
		public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
			System.out.println("谢谢惠顾");
			
		};
}
