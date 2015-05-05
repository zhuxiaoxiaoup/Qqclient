package com.qq.client.view;
/*
 * @author liuyan
 * 功能：QQ客户端登陆界面
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
	//整体是一个网格布局

	//定义北部需要的组件
	JLabel jbl1;
	
	//定义中部需要的组件
	//中部有三个JPanel，有一个叫选项卡窗口管理
	JTabbedPane jtp;
	JPanel jp2, jp3, jp4;
	JLabel jp2_jbl1, jp2_jbl2, jp2_jbl3, jp2_jbl4;
	JButton jp2_jb1;
	JTextField jp2_jtf;
	JPasswordField jp2_jpf;
	JCheckBox jp2_jcb1, jp2_jcb2;
	
	
	//定义南部需要的组件
	JPanel jp1;
	JButton jp1_jb1, jp1_jb2, jp1_jb3;
	
	//构造函数
	public QqClientLogin(){
		//处理北部
		jbl1 = new JLabel(new ImageIcon("image/tou.gif"));
		
		//处理中部
		jp2 = new JPanel(new GridLayout(3,3));
		
		jp2_jbl1 = new JLabel("QQ号码",JLabel.CENTER);
		jp2_jbl2 = new JLabel("QQ密码",JLabel.CENTER);
		jp2_jbl3 = new JLabel("忘记密码",JLabel.CENTER);
		jp2_jbl3.setForeground(Color.blue);
		jp2_jbl4 = new JLabel("申请密码保护",JLabel.CENTER);
		jp2_jbl4.setForeground(Color.blue);
		jp2_jb1 = new JButton(new ImageIcon("image/clear.gif"));
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
		jp2_jcb1 = new JCheckBox("隐身登陆");
		jp2_jcb2 = new JCheckBox("记住密码");
		
		//把控件按照顺序加到jp2
		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jbl4);
			
		//创建选项卡窗口
		jtp = new JTabbedPane();
		jtp.add("QQ号码",jp2);
		jp3 = new JPanel();
		jtp.add("手机号码",jp3);
		jp4 = new JPanel();
		jtp.add("电子邮件",jp4);
	
		//处理南部
		jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp1_jb1 = new JButton(new ImageIcon("image/denglu.gif"));
		jp1_jb2 = new JButton(new ImageIcon("image/quxiao.gif"));
		jp1_jb3 = new JButton(new ImageIcon("image/xiangdao.gif"));
		//把三个按钮放入到jp1
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		
		//把jbl1放入北部
		this.add(jbl1,"North");
		//把jtp放入中部
		this.add(jtp,"Center");
		//把jp1放入南部
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
