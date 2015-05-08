package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 * @author liuyan
 * 功能：我的好友列表（包括陌生人，黑名单）
 *
 */
public class QqFriendList extends JFrame implements ActionListener,MouseListener{
	
	//处理第一张卡片 我的好友，有3个JPanel
	JPanel jphy1, jphy2, jphy3;
	JButton jphy_jb1, jphy_jb2, jphy_jb3;
	JScrollPane jsp1;//放我的好友jphy_jb2的jpanel
	
	//处理第二张卡片，陌生人
	JPanel jpmsr1, jpmsr2, jpmsr3;
	JButton jpmsr_jb1, jpmsr_jb2, jpmsr_jb3;
	JScrollPane jsp2;//放我的好友jphy_jb2的jpanel
	
	//把整个JFrame设置成CardLayout
	CardLayout cl;
	//构造函数
	public QqFriendList(){
		//处理第一张卡片，显示好友列表
		jphy1 = new JPanel(new BorderLayout());
		jphy_jb1 = new JButton("我的好友");
		jphy_jb2 = new JButton("陌生人");
		jphy_jb2.addActionListener(this);
		jphy_jb3 = new JButton("黑名单");
		//假定有50个好友,4,4代表行间距和列间距
		jphy2 = new JPanel((new GridLayout(50,1,4,4)));
		
		
		//给jphy2初始化50个好友
		JLabel []jbls = new JLabel[50];
		for( int i=0; i<jbls.length; ++i){
			jbls[i] = new JLabel(i+1+"", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jbls[i].addMouseListener(this);
			jphy2.add(jbls[i]);
		}
		jphy3 = new JPanel(new GridLayout(2,1));
		//把两个按钮放入jphy3中
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);
		jsp1 = new JScrollPane(jphy2);
		//初始化jphy1 
		jphy1.add(jphy_jb1,"North");
		jphy1.add(jsp1,"Center");
		jphy1.add(jphy3,"South");
		
		
		//处理第二张卡片
		jpmsr_jb1 = new JButton("我的好友");
		jpmsr_jb1.addActionListener(this);
		jpmsr_jb2 = new JButton("陌生人");
		jpmsr_jb3 = new JButton("黑名单");
		//假定有20个好友,4,4代表行间距和列间距
		jpmsr1 = new JPanel(new BorderLayout());
		jpmsr2 = new JPanel((new GridLayout(20,1,4,4)));
		//初始化50个好友
		JLabel []jbls2 = new JLabel[20];
		for( int i=0; i<jbls2.length; ++i){
			jbls2[i] = new JLabel(i+1+"", new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jpmsr2.add(jbls2[i]);
		}
		jpmsr3 = new JPanel(new GridLayout(2,1));
		//把两个按钮放入jphy3中
		jpmsr3.add(jpmsr_jb1);
		jpmsr3.add(jpmsr_jb2);
		jsp2 = new JScrollPane(jpmsr2);
		//初始化jphy1 
		jpmsr1.add(jpmsr3,"North");
		jpmsr1.add(jsp2,"Center");
		jpmsr1.add(jpmsr_jb3,"South");
		
		
		
		//初始化JFrame
		cl = new CardLayout();
		this.setLayout(cl);
		this.add(jphy1,"1");
		this.add(jpmsr1,"2");
		
//		this.add(jphy1,"Center");
		this.setSize(180,500);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqFriendList qqFriendList = new QqFriendList();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//如果点击了陌生人按钮，就显示第二张卡片
		if(e.getSource() == jphy_jb2){
			cl.show(this.getContentPane(), "2");
		}else if(e.getSource() == jpmsr_jb1){
			cl.show(this.getContentPane(), "1");
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//响应用户双击的事件，并得到好友的编号
		if(e.getClickCount() == 2){
			//得到该好友的编号
			String friendNo = ((JLabel)e.getSource()).getText();
			System.out.println("你希望和"+friendNo+"聊天");
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel j1 = (JLabel)e.getSource();
		j1.setForeground(Color.red);
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel j1 = (JLabel)e.getSource();
		j1.setForeground(Color.black);
	}

}
