package de.manager;
import java.util.Hashtable;

import javax.swing.JFrame;

import de.windows.FightWindow;
import de.windows.InventoryWindowT;
import de.windows.MapWindow;
import de.windows.ShopWindow;
import de.windows.StartWindow;


public class WindowManager 
{
	static WindowManager instance;
	
	public static WindowManager getInstance()
	{
		if(instance==null)
		{
			instance = new WindowManager();
		}
		return instance;
	}
	
	
	
	public enum WindowID
	{
		START,
		MAP,
		FIGHT,
		ITEM,
		STATUS,
		SHOP
	}
	
	Hashtable<WindowID, JFrame> frameContainer;
	
	WindowManager()
	{
		frameContainer = new Hashtable<WindowID, JFrame>();
		
		frameContainer.put(WindowID.START, new StartWindow());
		//frameContainer.put���� �����츦 ����ϸ� �Ʒ��� �ִ� getFrame, Show, Hide���� �޼ҵ���� Ȱ�� �� �� �־��
		frameContainer.put(WindowID.MAP, new MapWindow());
		frameContainer.put(WindowID.FIGHT, new FightWindow());
		frameContainer.put(WindowID.SHOP, new ShopWindow());
		frameContainer.put(WindowID.STATUS, new InventoryWindowT());
	}
	
	public JFrame getFrame(WindowID id)
	{
		return frameContainer.get(id);
	}
	
	public void Show(WindowID id)
	{
		frameContainer.get(id).setVisible(true);
	}
	
	public void Hide(WindowID id)
	{
		frameContainer.get(id).setVisible(false);
	}
}
