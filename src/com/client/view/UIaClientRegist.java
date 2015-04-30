package com.client.view;
/**
 * 注册界面，有教师注册，学生注册
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;



public class UIaClientRegist extends JFrame{
	
	//组合，将教师，学生panel加入到注册主界面
	private UIaClientRegistTeacherPanel ut= new UIaClientRegistTeacherPanel();
	private UIaClientRegistStudentPanel us= new UIaClientRegistStudentPanel();
    
	//UlaClientRegist构造方法
	public UIaClientRegist(){
		
		this.setBackground(Color.white);
		this.setTitle("注册");
		//创建标签panel
		JTabbedPane jTabbedPane = new JTabbedPane(2, JTabbedPane.CENTER);
		
		//将学生，教师的注册panel加入到，标签panel
		jTabbedPane.add("教师注册",ut);
		jTabbedPane.add("学生注册",us);
		
		this.add(jTabbedPane);
		//this.setResizable(false);
		this.setSize(500, 400);
		//居中显示
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Theme.beauty();
		new UIaClientRegist();
	}

}
