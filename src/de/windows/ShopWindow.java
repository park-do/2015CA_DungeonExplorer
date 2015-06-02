package de.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.FlowLayout;

import javax.swing.JButton;

import de.item.Item;
import de.manager.ItemFactory;

import java.awt.GridLayout;

import javax.swing.JScrollPane;

public class ShopWindow extends JFrame implements ListSelectionListener {

	JList<String> buyList;
	
	private JPanel contentPane;
	JTabbedPane tabbedPane;
	JLabel lblItemInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopWindow frame = new ShopWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShopWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		contentPane.setBackground(new Color(204, 255, 255));
		
		contentPane.setBounds(0, 0, 434, 411);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tabbedPane.setBounds(12, 10, 410, 391);
		getContentPane().add(tabbedPane);
		
		JPanel BuyTab = new JPanel();
		tabbedPane.addTab("»ç±â", null, BuyTab, null);
		BuyTab.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 153));
		panel.setBounds(12, 10, 133, 322);
		BuyTab.add(panel);
		panel.setLayout(null);
		
		lblItemInfo = new JLabel("");
		lblItemInfo.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblItemInfo.setBounds(0, 0, 133, 322);
		panel.add(lblItemInfo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(157, 10, 238, 284);
		BuyTab.add(scrollPane);
		
		buyList = new JList<String>(ItemFactory.getInstance().getBuyItems());
		scrollPane.setViewportView(buyList);
		buyList.setToolTipText("");
		buyList.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		buyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		buyList.addListSelectionListener(this);
		
		JButton btnBuy = new JButton("\uC120\uD0DD\uD55C \uC544\uC774\uD15C \uC0AC\uAE30");
		btnBuy.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnBuy.setBounds(157, 304, 238, 28);
		BuyTab.add(btnBuy);
		
		JPanel SellTab = new JPanel();
		tabbedPane.addTab("ÆÈ±â", null, SellTab, null);
	}
	
	public void InitBuyTab()
	{
		buyList.removeAll();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		Item item = ItemFactory.getInstance().getItem(buyList.getSelectedValue());
		
		lblItemInfo.setText("<html>"+item.toString()+"</html>");
	}

}
