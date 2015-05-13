import java.util.Hashtable;

import javax.swing.JFrame;


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
	
	
	
	enum WindowID
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
