package com.client.view;
/**
 * ע����棬�н�ʦע�ᣬѧ��ע��
 */

import java.awt.*;
import javax.swing.*;

public class ClientRegistFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	//��ϣ�����ʦ��ѧ��panel���뵽ע��������
	private ClientRegistTeacherPanel teacherPanel = new ClientRegistTeacherPanel();
	private ClientRegistStudentPanel studentPanel = new ClientRegistStudentPanel();
    final static int width = 485, height = 529;
	//ClientRegist���췽��
	public ClientRegistFrame(){
		
		this.setBackground(Color.white);
		this.setTitle("ע��");
		//������ǩpanel
		JTabbedPane jTabbedPane = new JTabbedPane(2, JTabbedPane.CENTER);
		
		//��ѧ������ʦ��ע��panel���뵽����ǩpanel
		jTabbedPane.add("<html>��<br>ʦ<br>ע<br>��</html>", teacherPanel);
		jTabbedPane.add("<html>ѧ<br>��<br>ע<br>��</html>", studentPanel);
		
		this.add(jTabbedPane);
		//this.setResizable(false);
		this.setSize(width, height);
		//������ʾ
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Theme.beauty();
		new ClientRegistFrame();
	}
}
