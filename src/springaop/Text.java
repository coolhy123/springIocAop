package springaop;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����9:21:47
*/
public class Text {

	public static void main(String[] args) {

		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		System.out.println(application);
		Shopping shopping = (Shopping)application.getBean("shoppingProxy");
		shopping.buyNoteBook();
	}
}
