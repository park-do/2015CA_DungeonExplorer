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
		//frameContainer.put���� �����츦 ����ϸ� �Ʒ��� �ִ� getFrame, Show, Hide���� �޼ҵ���� Ȱ�� �� �� �־��
		
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
