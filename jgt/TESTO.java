import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TESTO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TESTO extends Actor
{
    GifImage myGif = new GifImage("giphy.gif");
    GreenfootSound liqui = new GreenfootSound("liqui.mp3");
 
    public int speed = 3;
    private int sTimer = 0;
    
    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();
    }
    
    public void movimento(){
       
     if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
    }
     if (Greenfoot.isKeyDown("r")){
         getWorld().addObject(new liquido(), getX() - 98, getY() +30);
         liqui.play();
         
}
}

}

