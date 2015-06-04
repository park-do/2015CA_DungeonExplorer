package de.windows;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import de.characters.Characters;
import de.characters.Elf;
import de.characters.Magician;
import de.characters.Player;
import de.characters.Warrior;
import de.manager.FightManager;
import de.manager.PlayerManager;
import de.skills.Skill;

public class FightWindow extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel enemyNameText;
	JLabel enemyHPText;


	private JLabel playerNameText;


	private JLabel playerHPText;


	private JButton btnAttack;
	private JTextArea textArea;
	private JButton btnSkill;
	private JButton btnItem;
	private JButton btnDodge;
	private JLabel enemyIcon;
	private JLabel playerIcon;
	private JLabel lblMp_1;
	private JLabel playerMPText;
	private JLabel lblMp_2;
	private JLabel enemyMPText;

	/**
	 * Create the frame.
	 */
	public FightWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[484px,grow]", "[250px,grow][250px,grow][180px,grow][104px]"));
		
		JPanel enemyPanel = new JPanel();
		enemyPanel.setBackground(new Color(255, 255, 204));
		contentPane.add(enemyPanel, "cell 0 0,grow");
		enemyPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 214, 219);
		enemyPanel.add(panel);
		panel.setLayout(new MigLayout("", "[57px][157px]", "[73px][73px][73px]"));
		
		JLabel enemyNameLabel = new JLabel("Name : ");
		enemyNameLabel.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		enemyNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyNameLabel, "cell 0 0,grow");
		
		enemyNameText = new JLabel("Orc");
		enemyNameText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel.add(enemyNameText, "cell 1 0,grow");
		
		JLabel enemyHPLabel = new JLabel("HP : ");
		enemyHPLabel.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		enemyHPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(enemyHPLabel, "cell 0 1,grow");
		
		enemyHPText = new JLabel("10/80");
		enemyHPText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel.add(enemyHPText, "cell 1 1,grow");
		
		lblMp_2 = new JLabel("MP : ");
		lblMp_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMp_2.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel.add(lblMp_2, "cell 0 2,grow");
		
		enemyMPText = new JLabel("10/80");
		enemyMPText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		panel.add(enemyMPText, "cell 1 2,grow");
		
		enemyIcon = new JLabel("");
		enemyIcon.setBounds(233, 15, 214, 203);
		enemyPanel.add(enemyIcon);
		
		JPanel playerPanel = new JPanel();
		playerPanel.setBackground(new Color(255, 255, 204));
		contentPane.add(playerPanel, "cell 0 1,grow");
		playerPanel.setLayout(null);
		
		JPanel playerInfoPanel = new JPanel();
		playerInfoPanel.setBackground(new Color(255, 255, 204));
		playerInfoPanel.setBounds(248, 0, 216, 218);
		playerPanel.add(playerInfoPanel);
		playerInfoPanel.setLayout(new MigLayout("", "[58px][158px]", "[72px][72px][72px]"));
		
		JLabel label = new JLabel("Name : ");
		label.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(label, "cell 0 0,grow");
		
		playerNameText = new JLabel("Orc");
		playerNameText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		playerInfoPanel.add(playerNameText, "cell 1 0,grow");
		
		JLabel lblMp = new JLabel("HP : ");
		lblMp.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		lblMp.setHorizontalAlignment(SwingConstants.RIGHT);
		playerInfoPanel.add(lblMp, "cell 0 1,grow");
		
		playerHPText = new JLabel("10/80");
		playerHPText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		playerInfoPanel.add(playerHPText, "cell 1 1,grow");
		
		lblMp_1 = new JLabel("MP : ");
		lblMp_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMp_1.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		playerInfoPanel.add(lblMp_1, "cell 0 2,grow");
		
		playerMPText = new JLabel("10/80");
		playerMPText.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		playerInfoPanel.add(playerMPText, "cell 1 2,grow");
		
		playerIcon = new JLabel("");
		playerIcon.setBounds(17, 15, 214, 203);
		playerPanel.add(playerIcon);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2,grow");
		
		textArea = new JTextArea();
		textArea.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 18));
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
		btnAttack.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		
		btnSkill = new JButton("\uC2A4\uD0AC \uC0AC\uC6A9");
		btnSkill.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnSkill.setBackground(new Color(204, 255, 102));
		panel_1.add(btnSkill);
		
		btnItem = new JButton("\uC544\uC774\uD15C \uC0AC\uC6A9");
		btnItem.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnItem.setBackground(new Color(204, 255, 102));
		panel_1.add(btnItem);
		
		btnDodge = new JButton("\uB3C4\uB9DD");
		btnDodge.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnDodge.setBackground(new Color(204, 255, 102));
		panel_1.add(btnDodge);
		
		btnAttack.addActionListener(this);
		btnItem.addActionListener(this);
		btnSkill.addActionListener(this);
		btnDodge.addActionListener(this);
		
		
	}
	
	public void AddMessage(String str)
	{
		textArea.setText(textArea.getText()+""+str+"\n");
	}
	
	public void Start()
	{
		textArea.setText("");
		
		Characters enemy = FightManager.getInstance().getEnemy(); 
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("resource/Fight/"+enemy.getName()+".jpg"));
		    
			this.enemyIcon.setIcon(new ImageIcon(img.getScaledInstance(enemyIcon.getWidth(), enemyIcon.getHeight(),Image.SCALE_SMOOTH)));
			
			Player player = PlayerManager.getInstance().getPlayer();
			String playerClass = "Knight";
			if(player instanceof Elf)playerClass = "Elf";
			if(player instanceof Warrior)playerClass = "Warrior";
			if(player instanceof Magician)playerClass = "Magician";
			img = ImageIO.read(new File("resource/Fight/"+playerClass+".jpg"));
			
			this.playerIcon.setIcon(new ImageIcon(img.getScaledInstance(playerIcon.getWidth(), playerIcon.getHeight(),Image.SCALE_SMOOTH)));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		
		
	}

	public void refresh() 
	{
		Characters player = FightManager.getInstance().getPlayer();
		Characters enemy = FightManager.getInstance().getEnemy(); 
		
		playerNameText.setText(player.getName());
		playerHPText.setText(getHPMPString(player.getMaxHp(),player.getDamagedhp()));
		playerMPText.setText(getHPMPString(player.getMp(),player.getUsedMp()));
		enemyNameText.setText(enemy.getName());
		enemyHPText.setText(getHPMPString(enemy.getMaxHp(),enemy.getDamagedhp()));
		enemyMPText.setText(getHPMPString(enemy.getMp(),enemy.getUsedMp()));
		
		if(enemy.getMaxHp()<=enemy.getDamagedhp())
		{
			FightManager.getInstance().Finish(true);
		}
	}
	
	public String getHPMPString(int max, int damaged)
	{
		return (max-damaged)+" / "+max;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAttack)
		{
			FightManager.getInstance().BasicAttack(this);
		}
		if(e.getSource()==btnSkill)
		{
			ArrayList<Skill> skills = PlayerManager.getInstance().getPlayer().getSkillList();
			String[] selected = new String[skills.size()];
			for(int i=0;i<skills.size();i++)selected[i] = skills.get(i).toString();
			if(selected.length>0)
			{
				int selectIndex = JOptionPane.showOptionDialog(this, "ªÁøÎ«“ Ω∫≈≥¿ª ∞Ì∏£ººø‰", "Ω∫≈≥ º±≈√", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, selected, selected[0]);
			
				if(selectIndex>=0)
				{
					boolean useSuccess = FightManager.getInstance().UseSkill(this, selectIndex);
					if(!useSuccess)
					{
						JOptionPane.showConfirmDialog(this, "∏∂≥™∞° ∫Œ¡∑«’¥œ¥Ÿ.","Ω∫≈≥ º±≈√",JOptionPane.CANCEL_OPTION);
					}
				}
			}
			else
			{
				JOptionPane.showConfirmDialog(this, "∫∏¿Ø ¡ﬂ¿Œ Ω∫≈≥¿Ã æ¯Ω¿¥œ¥Ÿ.","Ω∫≈≥ º±≈√",JOptionPane.CANCEL_OPTION);
			}
		}
	}
}
