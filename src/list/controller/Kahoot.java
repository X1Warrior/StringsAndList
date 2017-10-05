package list.controller;

public class Kahoot
{
private int questionCount;
private int level;
private String creator;
private boolean isJumble;
private String topic;

public Kahoot()
{
	this.questionCount = 0;
	this.level = 1;
	this.creator = "nobody";
	this.isJumble = false;
	this.topic = "some topic";
}
public Kahoot(String creator, int questionCount, String topic)
{
	this();
	this.creator = creator;
	this.questionCount = questionCount;
	this.topic = topic;
}

public String toString()
{
	
}
}