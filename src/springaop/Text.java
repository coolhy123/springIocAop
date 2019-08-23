package springaop;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 何永
* @createDate 创建时间：2019年8月23日 上午9:21:47
*/
public class Text {

	public static void main(String[] args) {

		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		System.out.println(application);
		Shopping shopping = (Shopping)application.getBean("shoppingProxy");
		shopping.buyNoteBook();
	}
}
