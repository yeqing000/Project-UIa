package com.client.view;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * ѧ��ע��JPanel
 * @author yeqing000
 * @version 1.0
 */

public class ClientRegistStudentPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//���ģʽ��ʹ��RegistPanel
	private RegistPanelComponent component= new RegistPanelComponent();
	//���췽��
	public ClientRegistStudentPanel() {
		//���ò��֣�BoxLayout����ֱͬ��
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//����registPanel����Ҫ��Ϣpanel
		this.add(component.addImport());
		
		//������ϸ��Ϣpanel
		this.add(addDetail());
		
		//����ײ���ťpanel
		this.add(component.addButton());
	}
	//������ϸ��Ϣ
	public JPanel addDetail() {
		
		//ѧ��������ѧ��panel��
		JPanel jp_name = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_name.add(component.jlb_name);
		jp_name.add(component.jt_name);
		
		jp_name.add(component.jlb_no);
		jp_name.add(component.jt_no);
		
		//ѧ���Ա�
		JPanel jp_sex = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sex.add(component.jlb_sex);
		jp_sex.add(component.jrb_man);
		jp_sex.add(component.jrb_girl);
		
		//ѧ��ѧУ���༶
		JPanel jp_school = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		jp_school.add(component.jlb_school);
		jp_school.add(component.jt_school);
		jp_school.add(component.jlb_class);
		jp_school.add(component.jt_class);
		
		//ѧ���ֻ���
		JPanel jp_phone = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_phone.add(component.jlb_phone);
		jp_phone.add(component.jt_phone);
		
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
