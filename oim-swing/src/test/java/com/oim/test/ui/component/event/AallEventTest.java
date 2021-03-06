package com.oim.test.ui.component.event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

import com.oim.swing.ui.component.BaseFrame;
import com.oim.swing.ui.component.list.IconPanel;

/**
 * @author XiaHui
 * @date 2015年1月5日 上午11:52:00
 */
public class AallEventTest extends BaseFrame {

	private static final long serialVersionUID = 1L;

	private JPanel chatPanel = new JPanel();
	private JButton grayButton = new JButton();
	private JButton drawBorderButton = new JButton();
	// private OnlyLabel head=new OnlyLabel();
	private IconPanel head = new IconPanel();

	private JButton button = new JButton();

	/**
	 * Create the frame.
	 */
	public AallEventTest() {
		initComponent();
		initEvent();
	}

	private void initComponent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new java.awt.Dimension(520, 500));
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		chatPanel.setLayout(null);

		grayButton.setText("变灰");
		drawBorderButton.setText("边框");

		grayButton.setBounds(20, 50, 120, 25);
		drawBorderButton.setBounds(20, 85, 120, 25);

		head.setBounds(20, 120, 60, 60);
		head.setImageIcon(new ImageIcon("Resources/Images/Head/User/1.png"));
		head.setStatusIcon(new ImageIcon("Resources/Images/Default/Status/FLAG/Big/MobilePhoneQQOn.png"));

		grayButton.setSelectedIcon(new ImageIcon("Resources/Images/Head/User/1.png"));

		chatPanel.add(grayButton);
		chatPanel.add(drawBorderButton);
		chatPanel.add(button);
		chatPanel.add(head);

		add(chatPanel);
		java.awt.AWTEventMulticaster.add(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e);

			}
		}, new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e);

			}
		});
	}

	private void initEvent() {
		grayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gray();
			}
		});
		drawBorderButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				drawBorder();
			}
		});
	}

	private void gray() {
		// head.setEnabled(!head.isEnabled());
		head.setGray(!head.isGray());
	}

	private void drawBorder() {
		this.showPrompt("你好吗\ntttt\ntttt\nttyy\nww\nnnnn\nhhhhhhhhhhhhhhhhhhhhhhhhhhhh\nggggggggggg\n");
		// head.setb
		// head.setDrawBorder(!head.isDrawBorder());
	}

	public void formComponentResized() {
		chatPanel.setBounds(3, 50, this.getWidth() - 6, this.getHeight() - 100);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AallEventTest frame = new AallEventTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
