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
 * ��ʦע��JPanel
 * @author yeqing000
 * @version 1.0
 */

public class ClientRegistTeacherPanel extends JPanel  {
	//���ģʽ��ʹ��RegistPanel
	private RegistPanelComponent component = new RegistPanelComponent();

	//���췽��
	public ClientRegistTeacherPanel() {
		//BoxLayout,��ֱͬ��
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		//������ϸ��Ϣ����Ҫ��Ϣ����ťpanel
		this.add(component.addImport());
		this.add(addDetail());
		this.add(component.addButton());
	}

	//������ϸ��Ϣ
	public JPanel addDetail() {

		//��ʦ����
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_name.add(component.jlb_name);
		jp_name.add(component.jt_name);

		//�Ա�
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(component.jlb_sex);
		jp_sex.add(component.jrb_man);
		jp_sex.add(component.jrb_girl);

		//ѧУ
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_school.add(component.jlb_school);
		jp_school.add(component.jt_school);

		//�ֻ�
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(component.jlb_phone);
		jp_phone.add(component.jt_phone);

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
