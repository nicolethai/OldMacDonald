class Cow implements Animal 
{     
    protected String myType, mySound;
    // protected later for Cow --> NamedCow()
    public Cow(String type, String sound) 
    {
    	myType = type;
    	mySound = sound;
    }
    public Cow()
    {
    	myType = "unknown";
    	mySound = "unknown";
    }
    public String getSound() { return mySound; }
    public String getType() { return myType; }
}