import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musculoso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class Musculoso extends Actor
{
    GifImage myGif = new GifImage("halter-01.gif");
    

    public int speed = 3;
    private int sTimer = 0;
 
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();
    }
    
    public void movimento(){
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    else if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    
     else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
         
        sTimer ++;
        getWorld().addObject(new comidaa(), getX() - 100, getY() +30);
    }
    else {
        if (!Greenfoot.isKeyDown("f")){
            sTimer = 0;
        }
    }
}
}
