package springaop;
/**
 * Ŀ����
* @author ����
* @createDate ����ʱ�䣺2019��8��23�� ����8:56:06
*/
public class ShoppingSon implements Shopping {

	@Override
	public void buyNoteBook() {
		System.out.println("��ʼǱ�");

	}

	@Override
	public void buyComputer() {
		System.out.println("��̨ʽ��");
		// TODO Auto-generated method stub

	}

}
