package com.client.view;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * 学生注册JPanel
 * @author yeqing000
 * @version 1.0
 */

public class ClientRegistStudentPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//组合模式，使用RegistPanel
	private RegistPanelComponent component= new RegistPanelComponent();
	//构造方法
	public ClientRegistStudentPanel() {
		//设置布局，BoxLayout，垂直同步
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//加入registPanel的重要信息panel
		this.add(component.addImport());
		
		//加入详细信息panel
		this.add(addDetail());
		
		//加入底部按钮panel
		this.add(component.addButton());
	}
	//增加详细信息
	public JPanel addDetail() {
		
		//学生姓名，学号panel，
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_name.add(component.jlb_name);
		jp_name.add(component.jt_name);
		
		jp_name.add(component.jlb_no);
		jp_name.add(component.jt_no);
		
		//学生性别
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(component.jlb_sex);
		jp_sex.add(component.jrb_man);
		jp_sex.add(component.jrb_girl);
		
		//学生学校，班级
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_school.add(component.jlb_school);
		jp_school.add(component.jt_school);
		jp_school.add(component.jlb_class);
		jp_school.add(component.jt_class);
		
		//学生手机号
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(component.jlb_phone);
		jp_phone.add(component.jt_phone);
		
		//详细信息panel
	    JPanel jp_detail = new JPanel(new GridLayout(4, 1, 10, 10));
		jp_detail.add(jp_name);
		jp_detail.add(jp_sex);
		jp_detail.add(jp_school);
		jp_detail.add(jp_phone);
		
		//边框包围详细信息
		Border border2 = BorderFactory.createTitledBorder("详细信息");
		jp_detail.setBorder(border2);
		
		return jp_detail;
		
	}

}
