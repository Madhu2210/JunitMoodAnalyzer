package com.bridglabz;

import org.junit.Assert;
import org.junit.*;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood()throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "sad";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood()throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenContainsAnyMoodItShouldReturnAnyMood()throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String actualResult = moodAnalyzer.moodAnalyzer();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("null");
        String actualResult;
        try {
            actualResult = moodAnalyzer.moodAnalyzer();
        }
        catch (MoodAnalyzerException e){
            String expectedMood="happy";
            Assert.assertEquals(expectedMood,e.message);
        }
    }
}

