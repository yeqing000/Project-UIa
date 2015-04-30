package com.client.view;
import java.awt.*;
import javax.swing.*;
/**
 * @author ��˶
 * @version 1.0
 */

public class ClientLoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	//ͷ����ǩ��������ʾͷ��ͼƬ
	JLabel jlb_headImage;
	//�������
	JPanel jp_id, jp_passWd, jp_control, jp_center, jp_south;
	//
	JTextField jtf_id; //�ı������ڱ����û���
	JPasswordField jpf_passWd; //���������ڱ�������
	JButton jb_login, jb_regeist; //���밴ť����ע�ᰴť
	JCheckBox jcb_remember, jcb_auto; //����������Զ�����
	JMenu jm_file; //�˵���
	JMenuItem jmt_setting, jmt_end; //�˵���
	JMenuBar jbr; //��Ų˵��������
	final int height = 360, width = 430; //�����Ⱥ͸߶�

	/*
	 * �������Ĺ��캯��
	 */
	public ClientLoginFrame() {
		this.setLayout(new BorderLayout()); //���õ�ǰ���ڵĲ���
		//�����˵���
		jm_file = new JMenu("��ʼ");
		jmt_setting = new JMenuItem("����");
		jmt_end = new JMenuItem("�˳�");
		jm_file.add(jmt_setting);
		jm_file.add(jmt_end);
		jbr = new JMenuBar();
		jbr.add(jm_file);
		//����ͷ����ǩ
		jlb_headImage = new JLabel(new ImageIcon("image/head.jpg"));

		//����������
		jp_id = new JPanel();
		jp_passWd = new JPanel();
		jp_control = new JPanel();
		jp_center = new JPanel(new GridLayout(3,1));
		jp_south = new JPanel(new FlowLayout(FlowLayout.CENTER, 45, 5));

		//���������ע�ᰴť
		jb_login = new JButton("��  ¼");
		jb_regeist = new JButton("ע  ��");
        
		//�����û���
		jtf_id = new JTextField(20);
        
		//����������
		jpf_passWd = new JPasswordField(20);
        
		//������ѡ��
		jcb_remember = new JCheckBox("��ס����");
		jcb_auto = new JCheckBox("�Զ�����");

		//�������������
		jp_id.add(new JLabel("�û���",JLabel.CENTER));
		jp_id.add(jtf_id);
		jp_passWd.add(new JLabel("��   ��",JLabel.CENTER));
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
		this.setTitle("��ҵ����ϵͳ");
        
		//���ô�С
		this.setSize(width, height);
		//���������ʾ
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
