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
import de.classes.Characters;
import de.manager.FightManager;
import de.manager.WindowManager;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Font;

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
		contentPane.add(playerPanel, "cell 0 1,grow");
		playerPanel.setLayout(null);
		
		JPanel playerInfoPanel = new JPanel();
		playerInfoPanel.setBounds(287, 0, 183, 88);
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
		
		btnAttack = new JButton("°ø°Ý!!!!");
		btnAttack.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnAttack.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2,grow");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		contentPane.add(btnAttack, "cell 0 3");
		
		
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
		playerHPText.setText(getHPString(player.getMaxHp(),player.getDamagedhp()));		
		enemyNameText.setText(enemy.getName());
		enemyHPText.setText(getHPString(enemy.getMaxHp(),enemy.getDamagedhp()));
		
		if(enemy.getMaxHp()<=enemy.getDamagedhp())
		{
			FightManager.getInstance().Finish();
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
			Characters player = FightManager.getInstance().getPlayer();
			Characters enemy = FightManager.getInstance().getEnemy(); 
			player.Attack(enemy);
			enemy.Attack(player);
			refresh();
		}
	}
}
