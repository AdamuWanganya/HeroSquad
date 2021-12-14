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
        Heroes hero = new Heroes("Adamu", 5, "accurancy", "lasting");
        assertTrue(hero instanceof Heroes);
    }


    @Test
    public void returnsHeroNameCorrectly_String() {
        Heroes hero = new Heroes("Adamu", 5, "accurancy", "lasting");
        assertEquals("Emma", hero.getName());
    }
}