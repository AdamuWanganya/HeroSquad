package model;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class HeroesTest {


    @Test
    public void NewHeroesInstantiatesHeroObjectsCorrectly_true() {
        Heroes hero = new Heroes("Adamu", 5, "first", "fighter");
        assertTrue(hero instanceof Heroes);
    }

}