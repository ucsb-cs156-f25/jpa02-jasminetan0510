package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
        team.addMember("test-member1");
        team.addMember("test-member2");  
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[test-member1, test-member2])", team.toString());
    }

    @Test
    public void equals_same_obj() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_diff_class() {
        String str = new String("Hello");
        assertEquals(false, team.equals(str));
    }

    @Test
    public void equals_same_name_same_members() {
        Team t = new Team();
        t.setName("test-team");
        t.addMember("test-member1");
        t.addMember("test-member2");
        assertEquals(true, team.equals(t));
    }

    @Test
    public void equals_same_name_diff_members() {
        Team t = new Team();
        t.setName("test-team");
        t.addMember("test-member3");
        assertEquals(false, team.equals(t));
    }

    @Test
    public void equals_diff_name_same_members() {
        Team t = new Team();
        t.setName("diff-test-team");
        t.addMember("test-member1");
        t.addMember("test-member2");
        assertEquals(false, team.equals(t));
    }

    @Test
    public void equals_diff_name_diff_members() {
        Team t = new Team();
        t.setName("diff-test-team");
        t.addMember("test-member3");
        assertEquals(false, team.equals(t));
    }

    @Test
    public void hashCode_returns_correct_hashcode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
        int result = t1.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);
    }
}