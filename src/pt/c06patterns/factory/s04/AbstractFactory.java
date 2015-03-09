package pt.c06patterns.factory.s04;

import pt.c06patterns.factory.s04.crab.CrabFactory;
import pt.c06patterns.factory.s04.fish.FishFactory;

public abstract class AbstractFactory
{
    public abstract Aquatic createAquatic();
    public abstract Aquarium createAquarium();
    
    public static AbstractFactory createFactory(String id)
    {
        AbstractFactory factory = null;
        if (id.equalsIgnoreCase("fish"))
            factory = new FishFactory();
        else if (id.equalsIgnoreCase("crab"))
            factory = new CrabFactory();
        return factory;
    }
}
