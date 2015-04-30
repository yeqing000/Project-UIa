package com.client.view;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * 教师注册Panel
 * @author yeqing000
 *
 */

public class UIaClientRegistTeacherPanel extends JPanel 
{
	//组合，使用RegistPanel
	private RegistPanel registPanel = new RegistPanel();
	
	//构造方法
	public UIaClientRegistTeacherPanel(){
		
		//BoxLayout,垂直同步
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//增加详细信息，重要信息，按钮panel
		this.add(registPanel.addImport());
		this.add(addDetail());
		this.add(registPanel.addButton());
		
		this.setVisible(true);
	}
	
	//增加详细信息
	public JPanel addDetail(){

		//教师姓名
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_name.add(registPanel.jlb_name);
		jp_name.add(registPanel.jt_name);
		
		//性别
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(registPanel.jlb_sex);
		jp_sex.add(registPanel.jcb_man);
		jp_sex.add(registPanel.jcb_girl);
		
		//学校
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_school.add(registPanel.jlb_school);
		jp_school.add(registPanel.jt_school);
		
		//手机
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(registPanel.jlb_phone);
		jp_phone.add(registPanel.jt_phone);
		
		//详细信息panel
	     JPanel jp_detail = new JPanel(new GridLayout(4, 1, 10, 10));
		jp_detail.add(jp_name);
		jp_detail.add(jp_sex);
		jp_detail.add(jp_school);
		jp_detail.add(jp_phone);
		
		//边框包围，详细信息
	   Border border2 = BorderFactory.createTitledBorder("详细信息");
		jp_detail.setBorder(border2);
		
		return jp_detail;
		
	}

	
}
