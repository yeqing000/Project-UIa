package com.client.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 * @author 叶青
 * @version 1.0
 * RegistPanelComponent，
 * 1.包含ClientRegistStudentPanel,
 * ClientRegistTeacherPanel, 所要用到的组件。
 * 2.有addImport()增加重要信息,addButton()增加底部按钮,两个方法.
 */
public class RegistPanelComponent extends JPanel{

	private static final long serialVersionUID = 1L;

	//构造方法
	public RegistPanelComponent() {
		//标签
		jlb_email = new JLabel("您的邮箱*");
		jlb_key = new JLabel("您的密码*");
		jlb_sure = new JLabel("再次确认*");
		jlb_name = new JLabel("您的姓名*");
		jlb_sex = new JLabel("您的性别*");
		jlb_school = new JLabel("您的学校*");
		jlb_phone = new JLabel("手机号码*");
		jlb_no = new JLabel("您的学号*");
		jlb_class = new JLabel("您的班级*");

		//性别单选框
        jrb_man = new JRadioButton("男");
        jrb_girl = new JRadioButton("女");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb_man);
        bg.add(jrb_girl);
        
		//底部两个按钮
		jb_regist = new JButton("确认注册");
		jb_reset = new JButton("重置信息");

		//文本框
		jt_email = new JTextField(20);
		jt_key = new JTextField(20);
		jt_sure = new JTextField(20);
		jt_detail = new JTextField(20);
		jt_name= new JTextField(20);
		jt_school= new JTextField(20);
		jt_phone= new JTextField(20);
		jt_no= new JTextField(20);
		jt_class= new JTextField(20);
	}
    
	//增加重要信息panel
	public JPanel addImport() {
		//邮件panel，将jlb_email，jlb_email放在一个panel里面。下同
		JPanel jp_email = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_email.add(jlb_email);
		jp_email.add(jt_email);

		//密码panel
		JPanel jp_key = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_key.add(jlb_key);
		jp_key.add(jt_key);

		//确认密码panel
		JPanel jp_sure = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sure.add(jlb_sure);
		jp_sure.add(jt_sure);

		//将邮件，密码，确认panel，放入重要信息panel，网格布局
		JPanel jp_import = new JPanel(new GridLayout(3, 1, 10, 10));
		jp_import.add(jp_email);
		jp_import.add(jp_key);
		jp_import.add(jp_sure);

		//边框包围重要信息
		Border border = BorderFactory.createTitledBorder("重要信息");
		jp_import.setBorder(border);

		return jp_import;
	}

	//增加底部两个按钮的面板
	public JPanel addButton() {
		JPanel jPanel_button = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

		jPanel_button.add(jb_reset);
		jPanel_button.add(jb_regist);

		return jPanel_button;
	}

	//用到标签
	JLabel jlb_email, jlb_key, jlb_sure, jlb_name,
	jlb_sex, jlb_school, jlb_phone, jlb_no, jlb_class;

    //性别单选框
    JRadioButton jrb_man, jrb_girl;
	//按钮
	JButton jb_regist,jb_reset;

	//文本框
	JTextField jt_email, jt_key, jt_sure, jt_detail,
	jt_name, jt_school, jt_phone, jt_no, jt_class;
}
