package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MainFrame extends JFrame implements ActionListener, ItemListener{
	private JPanel panel1 = new JPanel();
	JLabel p1Label1 = new JLabel("        R&D Management Program");
	JButton p1btn1 = new JButton("사업개요");
	JButton p1btn2 = new JButton("참여기업관리");
	
	public MainFrame() {
		this.setBounds(200,200,500,500);
		// 패널 나누기
		panel1.setLayout(null);
		p1Label1.setBounds(150,0,200,25);
		p1Label1.setBorder(new LineBorder(Color.black));
		p1btn1.setBounds(150,125,200,100);
		p1btn2.setBounds(150,275,200,100);
		panel1.add(p1Label1);
		panel1.add(p1btn1);
		panel1.add(p1btn2);
		this.add(panel1);
		
		p1btn1.addActionListener(this);
		p1btn2.addActionListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == p1btn1) {
//			System.out.println("1번버튼");
			new OverviewFrame();
			this.setVisible(false);
		} else if (e.getSource() == p1btn2) {
//			System.out.println("2번버튼");
			new ManageFrame();
			this.setVisible(false);
		}
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
