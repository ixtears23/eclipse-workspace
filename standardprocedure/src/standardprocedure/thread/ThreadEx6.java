package standardprocedure.thread;

import javax.swing.JOptionPane;

// �̱۾������ �ΰ��� �۾� ó��
public class ThreadEx6 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1�ʰ� �ð��� �����Ѵ�.
			} catch(Exception e) {
				
			}
		}
	}

}