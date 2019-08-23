package springaop;
/**
 * 目标类
* @author 何永
* @createDate 创建时间：2019年8月23日 上午8:56:06
*/
public class ShoppingSon implements Shopping {

	@Override
	public void buyNoteBook() {
		System.out.println("买笔记本");

	}

	@Override
	public void buyComputer() {
		System.out.println("买台式机");
		// TODO Auto-generated method stub

	}

}
