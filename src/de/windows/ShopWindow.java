package de.windows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import de.item.Item;
import de.manager.ItemFactory;
import de.manager.PlayerManager;
import de.manager.WindowManager;
import de.manager.WindowManager.WindowID;

import javax.swing.SwingConstants;

public class ShopWindow extends JFrame implements ListSelectionListener, ActionListener {

	JList<String> buyList;
	
	private JPanel contentPane;
	JTabbedPane tabbedPane;
	JLabel lblItemInfo;
	JButton btnBuy;
	private JPanel panel_1;
	private JLabel lblItemInfo_Sell;
	private JScrollPane scrollPane_1;
	private JButton btnSell;
	private JList<String> sellList;

	private JLabel lblMyGold;

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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) 
			{
				ShopWindow.this.setVisible(false);;
				WindowManager.getInstance().getFrame(WindowID.MAP).setVisible(true);
			}
		});
		
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		contentPane.setBackground(new Color(204, 255, 255));
		
		contentPane.setBounds(0, 0, 434, 411);
		contentPane.setLayout(null);
		
		lblMyGold = new JLabel("My Gold :");
		lblMyGold.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMyGold.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblMyGold.setBounds(167, 362, 255, 42);
		contentPane.add(lblMyGold);
		
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
		
		buyList = new JList<String>();
		scrollPane.setViewportView(buyList);
		buyList.setToolTipText("");
		buyList.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		buyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		buyList.addListSelectionListener(this);
		
		btnBuy = new JButton("\uC120\uD0DD\uD55C \uC544\uC774\uD15C \uC0AC\uAE30");
		btnBuy.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnBuy.setBounds(157, 304, 238, 28);
		btnBuy.addActionListener(this);
		BuyTab.add(btnBuy);
		
		JPanel SellTab = new JPanel();
		tabbedPane.addTab("ÆÈ±â", null, SellTab, null);
		SellTab.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 255, 153));
		panel_1.setBounds(10, 10, 133, 322);
		SellTab.add(panel_1);
		
		lblItemInfo_Sell = new JLabel("");
		lblItemInfo_Sell.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblItemInfo_Sell.setBounds(0, 0, 133, 322);
		panel_1.add(lblItemInfo_Sell);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(155, 10, 238, 284);
		SellTab.add(scrollPane_1);
		
		sellList = new JList<String>();
		scrollPane_1.setViewportView(sellList);
		sellList.setToolTipText("");
		sellList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sellList.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		sellList.addListSelectionListener(this);
		
		btnSell = new JButton("\uC120\uD0DD\uD55C \uC544\uC774\uD15C \uD314\uAE30");
		btnSell.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnSell.setBounds(155, 304, 238, 28);
		btnSell.addActionListener(this);
		SellTab.add(btnSell);
		
		this.addComponentListener ( new ComponentAdapter ()
	    {
	        public void componentShown ( ComponentEvent e )
	        {
	        	InitLists();
	        }

	        public void componentHidden ( ComponentEvent e )
	        {
	           
	        }
	    } );
	}
	
	public void InitLists()
	{
		InitBuyList();
		InitSellList();
		RefreshGold();
	}
	
	public void InitBuyList()
	{
		sellList.setSelectedIndex(0);
		buyList.setListData(ItemFactory.getInstance().getBuyItems());
	}
	
	public void InitSellList()
	{
		sellList.setSelectedIndex(0);
		sellList.setListData(ItemFactory.getInstance().getSellItems());
	}
	
	public void RefreshGold()
	{
		lblMyGold.setText("°¡Áø µ· : "+PlayerManager.getInstance().getPlayer().getGold());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buyList)
		{
			if(buyList.getSelectedValue()==null)return;
			Item item = ItemFactory.getInstance().getItem(buyList.getSelectedValue());

			lblItemInfo.setText(item.toString());
		}
		else if(e.getSource()==sellList)
		{
			if(sellList.getSelectedValue()==null)return;
			Item item = ItemFactory.getInstance().getItem(sellList.getSelectedValue());

			lblItemInfo_Sell.setText(item.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnBuy)//»ç±â ¹öÆ° ´­·¶´Ï
		{
			Item item = ItemFactory.getInstance().getItem(buyList.getSelectedValue());
			if(PlayerManager.getInstance().getPlayer().getGold() >= item.getPrice())
			{
				PlayerManager.getInstance().getPlayer().bringItem.add(item);
				RefreshGold();
				JOptionPane.showConfirmDialog(this,item.getName()+" »ò½À´Ï´Ù!","»óÁ¡",JOptionPane.CLOSED_OPTION);
				InitSellList();
				
			}
			else
			{
				JOptionPane.showConfirmDialog(this,"µ·ÀÌ ¸ðÀÚ¶ó¿ä","»óÁ¡",JOptionPane.CLOSED_OPTION);
			}
		}
		else if(e.getSource()==btnSell)//ÆÈ±â ¹öÆ° ´­·¶´Ï
		{
			int index = sellList.getSelectedIndex();
			Item item = ItemFactory.getInstance().getItem(sellList.getSelectedValue());
			PlayerManager.getInstance().getPlayer().earnGold(item.getPrice());
			PlayerManager.getInstance().getPlayer().bringItem.remove(index);
			JOptionPane.showConfirmDialog(this,item.getName()+" ÆÈ¾Ò½À´Ï´Ù!","»óÁ¡",JOptionPane.CLOSED_OPTION);
			RefreshGold();
			InitSellList();
		}
	}
}
