import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("sound.mp3");
   

    public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Musculoso musculoso = new Musculoso();
        addObject(musculoso,92,213);
        TESTO tESTO = new TESTO();
        addObject(tESTO,317,272);

        Musculoso musculoso2 = new Musculoso();
        addObject(musculoso2,433,336);
        musculoso2.setLocation(426,345);
        musculoso2.setLocation(935,292);
        removeObject(musculoso2);
        Counter counter = new Counter();
        addObject(counter,384,36);
    }
}
