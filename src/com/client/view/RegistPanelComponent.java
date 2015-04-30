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
 * @author Ҷ��
 * @version 1.0
 * RegistPanelComponent��
 * 1.����ClientRegistStudentPanel,
 * ClientRegistTeacherPanel, ��Ҫ�õ��������
 * 2.��addImport()������Ҫ��Ϣ,addButton()���ӵײ���ť,��������.
 */
public class RegistPanelComponent extends JPanel{

	private static final long serialVersionUID = 1L;

	//���췽��
	public RegistPanelComponent() {
		//��ǩ
		jlb_email = new JLabel("��������*");
		jlb_key = new JLabel("��������*");
		jlb_sure = new JLabel("�ٴ�ȷ��*");
		jlb_name = new JLabel("��������*");
		jlb_sex = new JLabel("�����Ա�*");
		jlb_school = new JLabel("����ѧУ*");
		jlb_phone = new JLabel("�ֻ�����*");
		jlb_no = new JLabel("����ѧ��*");
		jlb_class = new JLabel("���İ༶*");

		//�Ա�ѡ��
        jrb_man = new JRadioButton("��");
        jrb_girl = new JRadioButton("Ů");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb_man);
        bg.add(jrb_girl);
        
		//�ײ�������ť
		jb_regist = new JButton("ȷ��ע��");
		jb_reset = new JButton("������Ϣ");

		//�ı���
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
    
	//������Ҫ��Ϣpanel
	public JPanel addImport() {
		//�ʼ�panel����jlb_email��jlb_email����һ��panel���档��ͬ
		JPanel jp_email = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_email.add(jlb_email);
		jp_email.add(jt_email);

		//����panel
		JPanel jp_key = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_key.add(jlb_key);
		jp_key.add(jt_key);

		//ȷ������panel
		JPanel jp_sure = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
		jp_sure.add(jlb_sure);
		jp_sure.add(jt_sure);

		//���ʼ������룬ȷ��panel��������Ҫ��Ϣpanel�����񲼾�
		JPanel jp_import = new JPanel(new GridLayout(3, 1, 10, 10));
		jp_import.add(jp_email);
		jp_import.add(jp_key);
		jp_import.add(jp_sure);

		//�߿��Χ��Ҫ��Ϣ
		Border border = BorderFactory.createTitledBorder("��Ҫ��Ϣ");
		jp_import.setBorder(border);

		return jp_import;
	}

	//���ӵײ�������ť�����
	public JPanel addButton() {
		JPanel jPanel_button = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

		jPanel_button.add(jb_reset);
		jPanel_button.add(jb_regist);

		return jPanel_button;
	}

	//�õ���ǩ
	JLabel jlb_email, jlb_key, jlb_sure, jlb_name,
	jlb_sex, jlb_school, jlb_phone, jlb_no, jlb_class;

    //�Ա�ѡ��
    JRadioButton jrb_man, jrb_girl;
	//��ť
	JButton jb_regist,jb_reset;

	//�ı���
	JTextField jt_email, jt_key, jt_sure, jt_detail,
	jt_name, jt_school, jt_phone, jt_no, jt_class;
}
