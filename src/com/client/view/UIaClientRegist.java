package com.client.view;
/**
 * ע����棬�н�ʦע�ᣬѧ��ע��
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
	
	//��ϣ�����ʦ��ѧ��panel���뵽ע��������
	private UIaClientRegistTeacherPanel ut= new UIaClientRegistTeacherPanel();
	private UIaClientRegistStudentPanel us= new UIaClientRegistStudentPanel();
    
	//UlaClientRegist���췽��
	public UIaClientRegist(){
		
		this.setBackground(Color.white);
		this.setTitle("ע��");
		//������ǩpanel
		JTabbedPane jTabbedPane = new JTabbedPane(2, JTabbedPane.CENTER);
		
		//��ѧ������ʦ��ע��panel���뵽����ǩpanel
		jTabbedPane.add("��ʦע��",ut);
		jTabbedPane.add("ѧ��ע��",us);
		
		this.add(jTabbedPane);
		//this.setResizable(false);
		this.setSize(500, 400);
		//������ʾ
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Theme.beauty();
		new UIaClientRegist();
	}

}
