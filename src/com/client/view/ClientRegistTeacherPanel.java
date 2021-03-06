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
 * 教师注册JPanel
 * @author yeqing000
 * @version 1.0
 */

public class ClientRegistTeacherPanel extends JPanel  {
	//组合模式，使用RegistPanel
	private RegistPanelComponent component = new RegistPanelComponent();

	//构造方法
	public ClientRegistTeacherPanel() {
		//BoxLayout,垂直同步
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		//增加详细信息，重要信息，按钮panel
		this.add(component.addImport());
		this.add(addDetail());
		this.add(component.addButton());
	}

	//增加详细信息
	public JPanel addDetail() {

		//教师姓名
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_name.add(component.jlb_name);
		jp_name.add(component.jt_name);

		//性别
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(component.jlb_sex);
		jp_sex.add(component.jrb_man);
		jp_sex.add(component.jrb_girl);

		//学校
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_school.add(component.jlb_school);
		jp_school.add(component.jt_school);

		//手机
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(component.jlb_phone);
		jp_phone.add(component.jt_phone);

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
