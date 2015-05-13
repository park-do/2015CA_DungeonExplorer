package de.manager;
import java.util.Hashtable;

import javax.swing.JFrame;

import de.windows.FightWindow;
import de.windows.MapWindow;
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
		STATUS
	}
	
	Hashtable<WindowID, JFrame> frameContainer;
	
	WindowManager()
	{
		frameContainer = new Hashtable<WindowID, JFrame>();
		
		frameContainer.put(WindowID.START, new StartWindow());
		//frameContainer.put으로 윈도우를 등록하면 아래에 있는 getFrame, Show, Hide등의 메소드들을 활용 할 수 있어요
		frameContainer.put(WindowID.MAP, new MapWindow());
		frameContainer.put(WindowID.FIGHT, new FightWindow());
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
