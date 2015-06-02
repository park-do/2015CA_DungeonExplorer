package de.windows.panels;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class BuyPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuyPanel() {
		setBackground(new Color(204, 255, 255));
		
		this.setBounds(0, 0, 434, 411);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tabbedPane.setBounds(12, 10, 410, 391);
		add(tabbedPane);
		
		JPanel BuyTab = new JPanel();
		tabbedPane.addTab("»ç±â", null, BuyTab, null);
		BuyTab.setLayout(null);
		
		JLabel lblItemInfo = new JLabel("");
		lblItemInfo.setBounds(12, 10, 133, 322);
		BuyTab.add(lblItemInfo);
		
		JList list = new JList();
		list.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(157, 10, 238, 284);
		BuyTab.add(list);
		
		JButton btnBuy = new JButton("\uC120\uD0DD\uD55C \uC544\uC774\uD15C \uC0AC\uAE30");
		btnBuy.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnBuy.setBounds(157, 304, 238, 28);
		BuyTab.add(btnBuy);
		
		JPanel SellTab = new JPanel();
		tabbedPane.addTab("ÆÈ±â", null, SellTab, null);
		
	}
}
