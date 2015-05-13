package de.windows;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import de.classes.Characters;
import de.manager.FightManager;

public class FightWindow extends JFrame {

	private JPanel contentPane;
	

	JTextArea textArea;
	JLabel enemyNameText;
	JLabel enemyHPText;


	private JLabel playerNameText;


	private JLabel playerHPText;

	/**
	 * Create the frame.
	 */
	public FightWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[484px,grow]", "[100px,grow][100px,grow][104px,grow][180px]"));
		
		JPanel enemyPanel = new JPanel();
		contentPane.add(enemyPanel, "cell 0 0,grow");
		enemyPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 183, 88);
		enemyPanel.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel enemyNameLabel = new JLabel("Name : ");
		enemyNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyNameLabel);
		
		enemyNameText = new JLabel("Orc");
		panel.add(enemyNameText);
		
		JLabel enemyHPLabel = new JLabel("HP : ");
		enemyHPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyHPLabel);
		
		enemyHPText = new JLabel("10/80");
		panel.add(enemyHPText);
		
		JPanel playerPanel = new JPanel();
		contentPane.add(playerPanel, "cell 0 1,grow");
		playerPanel.setLayout(null);
		
		JPanel playerInfoPanel = new JPanel();
		playerInfoPanel.setBounds(287, 0, 183, 88);
		playerPanel.add(playerInfoPanel);
		playerInfoPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("Name : ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(label);
		
		playerNameText = new JLabel("Orc");
		playerInfoPanel.add(playerNameText);
		
		JLabel label_2 = new JLabel("HP : ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(label_2);
		
		playerHPText = new JLabel("10/80");
		playerInfoPanel.add(playerHPText);
		
		textArea = new JTextArea();
		contentPane.add(textArea, "cell 0 2,grow");
		
	}
	
	public void AddMessage(String str)
	{
		textArea.setText(textArea.getText()+"\n"+str);
	}

	public void refresh() 
	{
		Characters player = FightManager.getInstance().getPlayer();
		Characters enemy = FightManager.getInstance().getEnemy(); 
		
		playerNameText.setText(player.getName());
		playerHPText.setText(getHPString(player.getHp(),player.getDamagedhp()));		
		enemyNameText.setText(enemy.getName());
		enemyHPText.setText(getHPString(enemy.getHp(),enemy.getDamagedhp()));
	}
	
	public String getHPString(int HP, int damaged)
	{
		return (HP-damaged)+" / "+HP;
	}
}
