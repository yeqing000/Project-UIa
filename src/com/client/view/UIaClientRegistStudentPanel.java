package com.client.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
/**
 * ѧ��ע��Panel
 * @author yeqing000
 *
 */

public class UIaClientRegistStudentPanel extends JPanel 
{
	//��Ϸ�ʽ��ʹ��RegistPanel
	private RegistPanel registPanel= new RegistPanel();
	//���췽��
	public UIaClientRegistStudentPanel(){
		
		//���ò��֣�BoxLayout����ֱͬ��
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//����registPanel����Ҫ��Ϣpanel
		this.add(registPanel.addImport());
		
		//������ϸ��Ϣpanel
		this.add(addDetail());
		
		//����ײ���ťpanel
		this.add(registPanel.addButton());
		
		this.setVisible(true);
		
	}
	//������ϸ��Ϣ
	public JPanel addDetail() {
		
		//ѧ��������ѧ��panel��
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_name.add(registPanel.jlb_name);
		jp_name.add(registPanel.jt_name);
		
		jp_name.add(registPanel.jlb_no);
		jp_name.add(registPanel.jt_no);
		
		//ѧ���Ա�
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(registPanel.jlb_sex);
		jp_sex.add(registPanel.jcb_man);
		jp_sex.add(registPanel.jcb_girl);
		
		//ѧ��ѧУ���༶
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_school.add(registPanel.jlb_school);
		jp_school.add(registPanel.jt_school);
		jp_school.add(registPanel.jlb_class);
		jp_school.add(registPanel.jt_class);
		
		//ѧ���ֻ���
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(registPanel.jlb_phone);
		jp_phone.add(registPanel.jt_phone);
		
		//��ϸ��Ϣpanel
	    JPanel jp_detail = new JPanel(new GridLayout(4, 1, 10, 10));
		jp_detail.add(jp_name);
		jp_detail.add(jp_sex);
		jp_detail.add(jp_school);
		jp_detail.add(jp_phone);
		
		
		//�߿��Χ��ϸ��Ϣ
		Border border2 = BorderFactory.createTitledBorder("��ϸ��Ϣ");
		jp_detail.setBorder(border2);
		
		return jp_detail;
		
	}

}
