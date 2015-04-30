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
 * ��ʦע��Panel
 * @author yeqing000
 *
 */

public class UIaClientRegistTeacherPanel extends JPanel 
{
	//��ϣ�ʹ��RegistPanel
	private RegistPanel registPanel = new RegistPanel();
	
	//���췽��
	public UIaClientRegistTeacherPanel(){
		
		//BoxLayout,��ֱͬ��
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//������ϸ��Ϣ����Ҫ��Ϣ����ťpanel
		this.add(registPanel.addImport());
		this.add(addDetail());
		this.add(registPanel.addButton());
		
		this.setVisible(true);
	}
	
	//������ϸ��Ϣ
	public JPanel addDetail(){

		//��ʦ����
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_name.add(registPanel.jlb_name);
		jp_name.add(registPanel.jt_name);
		
		//�Ա�
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(registPanel.jlb_sex);
		jp_sex.add(registPanel.jcb_man);
		jp_sex.add(registPanel.jcb_girl);
		
		//ѧУ
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_school.add(registPanel.jlb_school);
		jp_school.add(registPanel.jt_school);
		
		//�ֻ�
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(registPanel.jlb_phone);
		jp_phone.add(registPanel.jt_phone);
		
		//��ϸ��Ϣpanel
	     JPanel jp_detail = new JPanel(new GridLayout(4, 1, 10, 10));
		jp_detail.add(jp_name);
		jp_detail.add(jp_sex);
		jp_detail.add(jp_school);
		jp_detail.add(jp_phone);
		
		//�߿��Χ����ϸ��Ϣ
	   Border border2 = BorderFactory.createTitledBorder("��ϸ��Ϣ");
		jp_detail.setBorder(border2);
		
		return jp_detail;
		
	}

	
}
