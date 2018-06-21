package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User userJohn=new Millenials("Johnny Bravo");
        User userBob=new YGeneration("Bob Builder");
        User userSam=new ZGeneration("Sam Fireman");

        //When
        String johnPosting=userJohn.sharePost();
        System.out.println(johnPosting);
        String bobPosting=userBob.sharePost();
        System.out.println(bobPosting);
        String samPosting=userSam.sharePost();
        System.out.println(samPosting);

        //Then
        Assert.assertEquals("I share my posts on facebook!", johnPosting);
        Assert.assertEquals("I share my posts on twitter!", bobPosting);
        Assert.assertEquals("I share my posts on snapchat!", samPosting);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User userJohn=new Millenials("Johnny Bravo");

        //When
        String johnPosting=userJohn.sharePost();
        System.out.println(johnPosting);
        userJohn.setSocialPublisher(new SnapchatPublisher());
        System.out.println(johnPosting);
        johnPosting=userJohn.sharePost();

        //Then
        Assert.assertEquals("I share my posts on snapchat!", johnPosting);
        }
}
