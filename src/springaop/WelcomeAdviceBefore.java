package springaop;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
* @author 何永
* @createDate 创建时间：2019年8月23日 上午9:03:29
*/
public class WelcomeAdviceBefore implements MethodBeforeAdvice{
	

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("欢迎光临");
	}
}
