package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }
    
    @Test
    public void checkRock() {
        Rock rock = new Rock();
        String expected = "Rock";
        String rockName = rock.getName();
        assertEquals(expected, rockName);
    }

    @Test
    public void checkPaper() {
        Paper paper = new Paper();
        String expected = "Paper";
        String paperName = paper.getName();
        assertEquals(expected, paperName);
    }

    @Test
    public void checkScissors() {
        Scissors scissors = new Scissors();
        String expected = "Scissors";
        String scissorsName = scissors.getName();
        assertEquals(expected, scissorsName);
    }

    @Test
    public void test_paper_wins_rock() {
        Game game = new Game();
        Paper element1 = new Paper();
        Rock element2 = new Rock();
        String expected = "Win " + element1.getName();
        String actual = game.play(element1.getName(), element2.getName());
        assertEquals(expected, actual);
    }

    @Test
    public void test_rock_wins_scissors() {
        Game game = new Game();
        Rock option1 = new Rock();
        Scissors option2 = new Scissors();
        String expected = "Win " + option1.getName();
        String actual = game.play(option1.getName(), option2.getName());
        assertEquals(expected, actual);
    }

    @Test
    public void test_scissors_wins_paper() {
        Game game = new Game();
        Scissors option1 = new Scissors();
        Paper option2 = new Paper();
        String expected = "Win " + option1.getName();
        String actual = game.play(option1.getName(), option2.getName());
        assertEquals(expected, actual);
    }
}
