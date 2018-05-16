package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculateAdvStatisticsTestSuite {
    @Test
    public void calculateAdvStatisticsTestWithNoPosts () {

        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        usersNames.add("Zenon");
        usersNames.add("Edward");
        usersNames.add("Sulpicjusz");
        usersNames.add("Gregory");
        usersNames.add("Justyn");

        int quantityOfPosts=0;

        int quantityOfComments=0;
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //int quantityOfUsers=statisticsMock.usersNames();
        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        int numberOfComments=forumStatistics.getNumberOfComments();
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(5, numberOfComments);
        Assert.assertEquals(0, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(1, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(0, avgNumberOfCommentsPerPostTest, 000000.1);
    }


}
