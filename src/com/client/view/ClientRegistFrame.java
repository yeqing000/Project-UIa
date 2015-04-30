package com.client.view;
/**
 * 注册界面，有教师注册，学生注册
 */

import java.awt.*;
import javax.swing.*;

public class ClientRegistFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	//组合，将教师，学生panel加入到注册主界面
	private ClientRegistTeacherPanel teacherPanel = new ClientRegistTeacherPanel();
	private ClientRegistStudentPanel studentPanel = new ClientRegistStudentPanel();
    final static int width = 485, height = 529;
	//ClientRegist构造方法
	public ClientRegistFrame(){
		
		this.setBackground(Color.white);
		this.setTitle("注册");
		//创建标签panel
		JTabbedPane jTabbedPane = new JTabbedPane(2, JTabbedPane.CENTER);
		
		//将学生，教师的注册panel加入到，标签panel
		jTabbedPane.add("<html>教<br>师<br>注<br>册</html>", teacherPanel);
		jTabbedPane.add("<html>学<br>生<br>注<br>册</html>", studentPanel);
		
		this.add(jTabbedPane);
		//this.setResizable(false);
		this.setSize(width, height);
		//居中显示
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Theme.beauty();
		new ClientRegistFrame();
	}
}
