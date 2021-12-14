package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SquadsTest {

    @Test
    public void instantiatesSquadObjectsWithHeroObjectsCorrectly_true() throws Exception {
Squads squads = new Squads("Hackers");
        assertEquals(true, squads instanceof Squads);
    }
}