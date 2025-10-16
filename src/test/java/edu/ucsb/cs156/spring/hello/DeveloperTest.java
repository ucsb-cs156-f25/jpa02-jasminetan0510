package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Jasmine", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("jasminetan0510", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("f25-05", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Brian Patrick"), "Team should contain Brian");
        assertTrue(t.getMembers().contains("Hechenjin"), "Team should contain Hechenjin");
        assertTrue(t.getMembers().contains("Jasmine"), "Team should contain Jasmine");
        assertTrue(t.getMembers().contains("Kennedy"), "Team should contain Kennedy");
        assertTrue(t.getMembers().contains("Melvin Anthony"), "Team should contain Melvin");
        assertTrue(t.getMembers().contains("Mon Raphael"), "Team should contain Mon");
    }

    @Test
    public void getTeam_returns_team_with_Brian() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Brian Patrick"), "Team should contain Brian");
    }

    @Test
    public void getTeam_returns_team_with_Hechenjin() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Hechenjin"), "Team should contain Hechenjin");
    }

    @Test
    public void getTeam_returns_team_with_Jasmine() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jasmine"), "Team should contain Jasmine");
    }

    @Test
    public void getTeam_returns_team_with_Kennedy() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kennedy"), "Team should contain Kennedy");
    }

    @Test
    public void getTeam_returns_team_with_Melvin() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Melvin Anthony"), "Team should contain Melvin");
    }

    @Test
    public void getTeam_returns_team_with_Mon() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Mon Raphael"), "Team should contain Mon");
    }

}