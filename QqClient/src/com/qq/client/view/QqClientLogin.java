package com.qq.client.view;
/*
 * @author liuyan
 * ���ܣ�QQ�ͻ��˵�½����
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
public class QqClientLogin extends JFrame{
	//������һ�����񲼾�

	//���山����Ҫ�����
	JLabel jbl1;
	
	//�����в���Ҫ�����
	//�в�������JPanel����һ����ѡ����ڹ���
	JTabbedPane jtp;
	JPanel jp2, jp3, jp4;
	JLabel jp2_jbl1, jp2_jbl2, jp2_jbl3, jp2_jbl4;
	JButton jp2_jb1;
	JTextField jp2_jtf;
	JPasswordField jp2_jpf;
	JCheckBox jp2_jcb1, jp2_jcb2;
	
	
	//�����ϲ���Ҫ�����
	JPanel jp1;
	JButton jp1_jb1, jp1_jb2, jp1_jb3;
	
	//���캯��
	public QqClientLogin(){
		//������
		jbl1 = new JLabel(new ImageIcon("image/tou.gif"));
		
		//�����в�
		jp2 = new JPanel(new GridLayout(3,3));
		
		jp2_jbl1 = new JLabel("QQ����",JLabel.CENTER);
		jp2_jbl2 = new JLabel("QQ����",JLabel.CENTER);
		jp2_jbl3 = new JLabel("��������",JLabel.CENTER);
		jp2_jbl3.setForeground(Color.blue);
		jp2_jbl4 = new JLabel("�������뱣��",JLabel.CENTER);
		jp2_jbl4.setForeground(Color.blue);
		jp2_jb1 = new JButton(new ImageIcon("image/clear.gif"));
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
		jp2_jcb1 = new JCheckBox("�����½");
		jp2_jcb2 = new JCheckBox("��ס����");
		
		//�ѿؼ�����˳��ӵ�jp2
		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jbl4);
			
		//����ѡ�����
		jtp = new JTabbedPane();
		jtp.add("QQ����",jp2);
		jp3 = new JPanel();
		jtp.add("�ֻ�����",jp3);
		jp4 = new JPanel();
		jtp.add("�����ʼ�",jp4);
	
		//�����ϲ�
		jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp1_jb1 = new JButton(new ImageIcon("image/denglu.gif"));
		jp1_jb2 = new JButton(new ImageIcon("image/quxiao.gif"));
		jp1_jb3 = new JButton(new ImageIcon("image/xiangdao.gif"));
		//��������ť���뵽jp1
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		
		//��jbl1���뱱��
		this.add(jbl1,"North");
		//��jtp�����в�
		this.add(jtp,"Center");
		//��jp1�����ϲ�
		this.add(jp1,"South");
		
		this.setSize(348,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqClientLogin qqClientLogin = new QqClientLogin();
	}

}
