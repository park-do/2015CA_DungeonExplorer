package de.windows;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import de.manager.PlayerManager;
import de.manager.WindowManager;


public class StartWindow extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	JToggleButton tglbtnClassKnight;
	
	JToggleButton tglbtnClassWarrior;
	
	JToggleButton tglbtnClassElf;
	
	JToggleButton tglbtnClassMagician;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public StartWindow() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(50, 120, 480, 350);
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[480px]", "[75px][275px]"));
		
		JPanel Name = new JPanel();
		Name.setBorder(new EmptyBorder(2, 2, 2, 2));
		panel.add(Name, "cell 0 0,grow");
		Name.setLayout(new MigLayout("", "[220px][260px]", "[75px]"));
		
		JLabel lblPlayerName = new JLabel("Player Name");
		lblPlayerName.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblPlayerName.setHorizontalAlignment(SwingConstants.CENTER);
		Name.add(lblPlayerName, "cell 0 0,growx");
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		Name.add(textField, "cell 1 0,grow");
		textField.setColumns(10);
		
		JPanel selectClass = new JPanel();
		selectClass.setBorder(new EmptyBorder(2, 2, 2, 2));
		panel.add(selectClass, "cell 0 1,grow");
		selectClass.setLayout(new MigLayout("", "[220px][260px,grow]", "[480px,grow][]"));
		
		JLabel lblSelectClass = new JLabel("Select Class");
		lblSelectClass.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblSelectClass.setHorizontalAlignment(SwingConstants.CENTER);
		selectClass.add(lblSelectClass, "cell 0 0,growx");
		
		JPanel classPanel = new JPanel();
		selectClass.add(classPanel, "cell 1 0,grow");
		classPanel.setLayout(new GridLayout(4, 1, 0, 10));
		
		tglbtnClassKnight = new JToggleButton("Knight");
		tglbtnClassKnight.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tglbtnClassKnight.addActionListener(this);
		classPanel.add(tglbtnClassKnight);
		
		tglbtnClassWarrior = new JToggleButton("Warrior");
		tglbtnClassWarrior.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tglbtnClassWarrior.addActionListener(this);
		classPanel.add(tglbtnClassWarrior);
		
		tglbtnClassElf = new JToggleButton("Elf");
		tglbtnClassElf.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tglbtnClassElf.addActionListener(this);
		classPanel.add(tglbtnClassElf);
		
		tglbtnClassMagician = new JToggleButton("Magician");
		tglbtnClassMagician.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		tglbtnClassMagician.addActionListener(this);
		classPanel.add(tglbtnClassMagician);
		
		lblNewLabel = new JLabel("Dungeon Explorer");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 15, 480, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnStrat = new JButton("Start");
		btnStrat.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnStrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int selected = 0;
				
				if(tglbtnClassKnight.isSelected())selected=0;
				if(tglbtnClassWarrior.isSelected())selected=1;
				if(tglbtnClassFairy.isSelected())selected=2;
				if(tglbtnClassWizard.isSelected())selected=3;
				
				PlayerManager.getInstance().Init(selected, Name.toString());
				
				
				WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
				WindowManager.getInstance().Hide(WindowManager.WindowID.START);
				
				
			}
		});
		btnStrat.setBounds(273, 480, 240, 50);
		contentPane.add(btnStrat);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JToggleButton)
		{
			tglbtnClassKnight.setSelected(false);
			tglbtnClassWarrior.setSelected(false);
			tglbtnClassElf.setSelected(false);
			tglbtnClassMagician.setSelected(false);
			
			((JToggleButton)e.getSource()).setSelected(true);
		}
		
		
	}
}
