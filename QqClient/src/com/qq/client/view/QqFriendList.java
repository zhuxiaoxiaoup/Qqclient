package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 * @author liuyan
 * ���ܣ��ҵĺ����б�����İ���ˣ���������
 *
 */
public class QqFriendList extends JFrame{
	
	//�����һ�ſ�Ƭ �ҵĺ��ѣ���3��JPanel
	JPanel jphy1, jphy2, jphy3;
	JButton jphy_jb1, jphy_jb2, jphy_jb3;
	JScrollPane jsp1;//���ҵĺ���jphy_jb2��jpanel
	
	//����ڶ��ſ�Ƭ��İ����
	JPanel jpmsr1, jpmsr2, jpmsr3;
	JButton jpmsr_jb1, jpmsr_jb2, jpmsr_jb3;
	JScrollPane jsp2;//���ҵĺ���jphy_jb2��jpanel
	
	
	//���캯��
	public QqFriendList(){
		//�����һ�ſ�Ƭ����ʾ�����б�
		jphy1 = new JPanel(new BorderLayout());
		jphy_jb1 = new JButton("�ҵĺ���");
		jphy_jb2 = new JButton("İ����");
		jphy_jb3 = new JButton("������");
		//�ٶ���50������,4,4�����м����м��
		jphy2 = new JPanel((new GridLayout(50,1,4,4)));
		
		
		//��jphy2��ʼ��50������
		JLabel []jbls = new JLabel[50];
		for( int i=0; i<jbls.length; ++i){
			jbls[i] = new JLabel(i+1+"", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jphy2.add(jbls[i]);
		}
		jphy3 = new JPanel(new GridLayout(2,1));
		//��������ť����jphy3��
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		jsp1 = new JScrollPane(jphy2);
		//��ʼ��jphy1 
		jphy1.add(jphy_jb1,"North");
		jphy1.add(jsp1,"Center");
		jphy1.add(jphy3,"South");
		
		
		//����ڶ��ſ�Ƭ
		jpmsr_jb1 = new JButton("�ҵĺ���");
		jpmsr_jb2 = new JButton("İ����");
		jpmsr_jb3 = new JButton("������");
		//�ٶ���20������,4,4�����м����м��
		jpmsr2 = new JPanel((new GridLayout(20,1,4,4)));
		//��ʼ��50������
		JLabel []jbls2 = new JLabel[20];
		for( int i=0; i<jbls2.length; ++i){
			jbls2[i] = new JLabel(i+1+"", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jpmsr2.add(jbls2[i]);
		}
		jpmsr3 = new JPanel(new GridLayout(2,1));
		//��������ť����jphy3��
		jpmsr3.add(jpmsr_jb1);
		jpmsr3.add(jpmsr_jb2);
		jsp2 = new JScrollPane(jpmsr2);
		//��ʼ��jphy1 
		jpmsr1.add(jpmsr3,"North");
		jpmsr1.add(jsp2,"Center");
		jpmsr1.add(jphy_jb3,"South");
		
		
		//��ʼ��JFrame
		this.add(jphy1,"Center");
		this.setSize(180,500);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqFriendList qqFriendList = new QqFriendList();
	}

}
