package com.client.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class ClientLoginFrame extends JFrame {
	/**
	 * @author 王硕
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;
	//头部标签，用于显示头部图片
	JLabel jlb_headImage;
	//登入面板
	JPanel jp_id, jp_passWd, jp_control, jp_center, jp_south;
	//
	JTextField jtf_id; //文本域，用于保存用户名
	JPasswordField jpf_passWd; //密码域，用于保存密码
	JButton jb_login, jb_regeist; //登入按钮，和注册按钮
	JCheckBox jcb_remember, jcb_auto; //保存密码和自动登入
	JMenu jm_file; //菜单栏
	JMenuItem jmt_setting, jmt_end; //菜单项
	JMenuBar jbr; //存放菜单栏的面板
	final int height = 360, width = 430; //定义宽度和高度

	/*
	 * 登入界面的构造函数
	 */
	public ClientLoginFrame() {
		this.setLayout(new BorderLayout()); //设置当前窗口的布局
		//创建菜单栏
		jm_file = new JMenu("开始");
		jmt_setting = new JMenuItem("设置");
		jmt_end = new JMenuItem("退出");
		jm_file.add(jmt_setting);
		jm_file.add(jmt_end);
		jbr = new JMenuBar();
		jbr.add(jm_file);
		//创建头部标签
		jlb_headImage = new JLabel(new ImageIcon("image/head.jpg"));

		//创建面板对象
		jp_id = new JPanel();
		jp_passWd = new JPanel();
		jp_control = new JPanel();
		jp_center = new JPanel(new GridLayout(3,1));
		jp_south = new JPanel(new FlowLayout(FlowLayout.CENTER, 45, 5));

		//创建登入和注册按钮
		jb_login = new JButton("登  录");
		jb_regeist = new JButton("注  册");
        
		//创建用户栏
		jtf_id = new JTextField(20);
        
		//创建密码栏
		jpf_passWd = new JPasswordField(20);
        
		//创建复选框
		jcb_remember = new JCheckBox("记住密码");
		jcb_auto = new JCheckBox("自动登入");

		//将组件添加至面板
		jp_id.add(new JLabel("用户名",JLabel.CENTER));
		jp_id.add(jtf_id);
		jp_passWd.add(new JLabel("密   码",JLabel.CENTER));
		jp_passWd.add(jpf_passWd);
		jp_control.add(jcb_remember);
		jp_control.add(jcb_auto);
		jp_center.add(jp_id);
		jp_center.add(jp_passWd);
		jp_center.add(jp_control);   
		jp_south.add(jb_login);
		jp_south.add(jb_regeist);

		this.setJMenuBar(jbr);
		this.add(jlb_headImage, "North");
		this.add(jp_center, "Center");
		this.add(jp_south, "South");
		this.setTitle("作业批改系统");
        
		//设置大小
		this.setSize(width, height);
		//窗体居中显示
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
        Theme.beauty();
		new ClientLoginFrame();
	}
}
