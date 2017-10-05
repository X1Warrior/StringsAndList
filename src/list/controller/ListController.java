package list.controller;

public class ListController
{
String currentCreator = "";
for (int index = 0; index < myKahoots.size(); index += 1)
{
	currentCreator = myKahoots.get(index).getCreator();
	
	Kahoot currentKahoot = myKahoots.get(index);
	String creator = currentKahoot.GetCreator();
	
	popup.displayText(myKahoots.get(index).toString());
	
	if (currentCreator.equals("nobody"))
	{
		for (int loop = 0; loob < 5; loop += 1)
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
}

	private void fillTheList()
	{
		Kahoot fiftyStates = newKahoot("Kashish", 50, "Thefifty UnitedStates");
		
		myKahoots.add(fiftyStates);
		
	}
