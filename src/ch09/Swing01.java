package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Swing은 내부적으로 while이 돌고 있음. 데몬 프로세스

public class Swing01 extends JFrame{
	
	public Swing01() {
		setTitle("제목");
		setSize(300, 500);
		
		// JPanel = Jframe이 기본적으로 가지고 있는 패널
		Container c = getContentPane();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		
		JPanel jp1 = new JPanel();
		jp1.add(btn6);
		
		
		c.add(btn1,BorderLayout.WEST);
		c.add(btn2,BorderLayout.EAST);
		c.add(btn3,BorderLayout.NORTH);
		c.add(jp1,BorderLayout.CENTER);
		c.add(btn5,BorderLayout.SOUTH);
		
		setVisible(true); // 화면에 표시하는 함수
	}

	//enum은 값을 여러개 가질 수 있다.
	public static void main(String[] args) {
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		System.out.println(MyLayout.WEST.value);
		new Swing01();
	}
	
}
