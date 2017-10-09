package tools.controller;

import java.util.List;

public class ListController
{
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
String currentCreator = "";
for (int index = 0; index < myKahoots.size(); index += 1)
{
	currentCreator = myKahoots.get(index).getCreator();
	
	Kahoot currentKahoot = myKahoots.get(index);
	String creator = currentKahoot.GetCreator();
	
	popup.displayText(myKahoots.get(index).toString());
	
	if (currentCreator.equals("nobody"))
	{
		for (int loop = 0; loop < 5; loop += 1)
		{
			popup.displayText("wow nobody does a lot")
			
		}
	}
	for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
	{
		popup.dispyText(currentCreator.substring(currentLetterIndex,  currentLetterIndex + 1));
	}
	String topic = currentKahoot.getTopic
	for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
	{
		popup.displayText(topic.substring(letter, letter + 1));
	}
}
 public void start
 private void fillTheList()
	{
		Kahoot fiftyStates = newKahoot("Kashish", 50, "Thefifty UnitedStates");
		
		myKahoots.add(fiftyStates);
		
	}

private void changeTheList()
{
	popup.displayText("The current list size is: " + myKahoots.size());
	Kahoot removed = myKahoots.remove(3);
	popup.displayText("I removed the Kahoot by " + removed.getCreator());
	popup.displayText("The list now has: " + myKahoots.size()+ " items inside.");
	myKahoots.add(0, removed);
	
	popup.displayText("The list is still: " + myKahoots.size() + "items big.");
	removed = myKahoots.set(2, new Kahoot())
	popup.displayText("the kahoot by " + removed.getCreator() + " was replaced with on by: " + myKahoots.get(2).getCreator());
	
}

public PopupDisplay getPopup()
{
	return popup
}

	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots;
	}
}
