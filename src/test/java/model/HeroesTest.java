package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HeroesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Heroes.clearAllHeroes();
    }

    @Test
    public void instantiatesHeroObjectsCorrectly_true() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertTrue(hero instanceof Heroes);
    }

    @Test
    public void returnsHeroNameCorrectly_String() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertEquals("Adamu", hero.getName());
    }

    @Test
    public void returnsHeroAgeCorrectly_int() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertEquals(8, hero.getAge());
    }

    @Test
    public void returnsHeroPowerCorrectly_String() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertEquals("accuracy", hero.getPower());
    }

    @Test
    public void returnsHeroWeaknessCorrectly_String() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertEquals("playful", hero.getWeakness());
    }

    @Test
    public void allHeroesAreCorrectlyReturned_int() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        Heroes otherHero = new Heroes ("Joel", 30, "learning", "too-serious");
        assertEquals(2, Heroes.getAllInstances().size());
    }

    @Test
    public void allHeroesContainsAllHeroesObjects_true() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        Heroes otherHero = new Heroes ("Joel", 30, "learning", "too-serious");
        assertTrue(Heroes.getAllInstances().contains(hero));
        assertTrue(Heroes.getAllInstances().contains(otherHero));
    }

    @Test
    public void checkIfNewlyCreatedHeroIsSquadMember_false() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        assertFalse(hero.isSquadMember());
    }

    @Test
    public void deletesSpecifiedHero() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        Heroes otherHero = new Heroes ("Joel", 30, "learning", "too-serious");
        otherHero.deleteHero();
        assertEquals(1, Heroes.getAllInstances().size());
        assertEquals(Heroes.getAllInstances().get(0).getId(), 2);
    }

    @Test
    public void deletesAllHeroes() {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        Heroes otherHero = new Heroes ("Joel", 30, "learning", "too-serious");
        Heroes.clearAllHeroes();
        assertEquals(0, Heroes.getAllInstances().size());
    }

    @Test
    public void findHeroById() throws Exception {
        Heroes hero = new Heroes("Adamu", 8, "accuracy", "playful");
        Heroes secondHero = new Heroes ("Joel", 30, "leraning", "too-serious");
        Heroes foundHero = Heroes.findById(1);
        Heroes foundSecondHero = Heroes.findById(2);
        assertEquals(hero, foundHero);
        assertEquals(secondHero, foundSecondHero);
    }


}