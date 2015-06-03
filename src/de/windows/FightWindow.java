package de.windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import de.characters.Characters;
import de.manager.FightManager;
import de.manager.WindowManager;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;

public class FightWindow extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel enemyNameText;
	JLabel enemyHPText;


	private JLabel playerNameText;


	private JLabel playerHPText;


	private JButton btnAttack;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public FightWindow() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[484px,grow]", "[100px,grow][100px,grow][180px,grow][104px]"));
		
		JPanel enemyPanel = new JPanel();
		enemyPanel.setBackground(new Color(255, 255, 204));
		contentPane.add(enemyPanel, "cell 0 0,grow");
		enemyPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 214, 88);
		enemyPanel.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel enemyNameLabel = new JLabel("Name : ");
		enemyNameLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		enemyNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyNameLabel);
		
		enemyNameText = new JLabel("Orc");
		enemyNameText.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		panel.add(enemyNameText);
		
		JLabel enemyHPLabel = new JLabel("HP : ");
		enemyHPLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		enemyHPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyHPLabel);
		
		enemyHPText = new JLabel("10/80");
		enemyHPText.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		panel.add(enemyHPText);
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBackground(new Color(255, 255, 204));
		contentPane.add(playerPanel, "cell 0 1,grow");
		playerPanel.setLayout(null);
		
		JPanel playerInfoPanel = new JPanel();
		playerInfoPanel.setBackground(new Color(255, 255, 204));
		playerInfoPanel.setBounds(254, 0, 216, 88);
		playerPanel.add(playerInfoPanel);
		playerInfoPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("Name : ");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(label);
		
		playerNameText = new JLabel("Orc");
		playerNameText.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		playerInfoPanel.add(playerNameText);
		
		JLabel label_2 = new JLabel("HP : ");
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(label_2);
		
		playerHPText = new JLabel("10/80");
		playerHPText.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		playerInfoPanel.add(playerHPText);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2,grow");
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 153));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(8);
		flowLayout.setHgap(0);
		contentPane.add(panel_1, "cell 0 3,growx,aligny center");
		
		btnAttack = new JButton("\uC77C\uBC18 \uACF5\uACA9");
		btnAttack.setBackground(new Color(204, 255, 102));
		panel_1.add(btnAttack);
		btnAttack.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		
		JButton btnSkill = new JButton("\uC2A4\uD0AC \uC0AC\uC6A9");
		btnSkill.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnSkill.setBackground(new Color(204, 255, 102));
		panel_1.add(btnSkill);
		
		JButton btnItem = new JButton("\uC544\uC774\uD15C \uC0AC\uC6A9");
		btnItem.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnItem.setBackground(new Color(204, 255, 102));
		panel_1.add(btnItem);
		
		JButton btnDodge = new JButton("\uB3C4\uB9DD");
		btnDodge.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnDodge.setBackground(new Color(204, 255, 102));
		panel_1.add(btnDodge);
		btnAttack.addActionListener(this);
		
		
	}
	
	public void AddMessage(String str)
	{
		textArea.setText(textArea.getText()+"\n"+str);
	}
	
	public void Start()
	{
		textArea.setText("");
	}

	public void refresh() 
	{
		Characters player = FightManager.getInstance().getPlayer();
		Characters enemy = FightManager.getInstance().getEnemy(); 
		
		playerNameText.setText(player.getName());
		playerHPText.setText(getHPString(player.getMaxHp(),player.getDamagedhp()));		
		enemyNameText.setText(enemy.getName());
		enemyHPText.setText(getHPString(enemy.getMaxHp(),enemy.getDamagedhp()));
		
		if(enemy.getMaxHp()<=enemy.getDamagedhp())
		{
			FightManager.getInstance().Finish(true);
		}
	}
	
	public String getHPString(int HP, int damaged)
	{
		return (HP-damaged)+" / "+HP;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAttack)
		{
			FightManager.getInstance().BasicAttack(this);
		}
	}
}
