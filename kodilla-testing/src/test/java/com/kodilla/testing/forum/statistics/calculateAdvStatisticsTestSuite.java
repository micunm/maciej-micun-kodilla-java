package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculateAdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

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
        int quantityOfComments=2;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(0, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(2, numberOfComments);
        Assert.assertEquals(0, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(0.4, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(0, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWith1000Posts () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        usersNames.add("Zenon");
        usersNames.add("Edward");
        usersNames.add("Sulpicjusz");
        usersNames.add("Gregory");
        usersNames.add("Justyn");

        int quantityOfPosts=1000;
        int quantityOfComments=200;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(200, numberOfComments);
        Assert.assertEquals(200, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(40, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(0.2, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWithNoComments () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        usersNames.add("Zenon");
        usersNames.add("Edward");
        usersNames.add("Sulpicjusz");
        usersNames.add("Gregory");
        usersNames.add("Justyn");

        int quantityOfPosts=100;
        int quantityOfComments=0;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(20, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(0, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(0, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWithLessCommentsThenPosts () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        usersNames.add("Zenon");
        usersNames.add("Edward");
        usersNames.add("Sulpicjusz");
        usersNames.add("Gregory");
        usersNames.add("Justyn");

        int quantityOfPosts=100;
        int quantityOfComments=10;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(10, numberOfComments);
        Assert.assertEquals(20, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(2, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(0.1, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWithMoreCommentsThenPosts () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        usersNames.add("Zenon");
        usersNames.add("Edward");
        usersNames.add("Sulpicjusz");
        usersNames.add("Gregory");
        usersNames.add("Justyn");

        int quantityOfPosts=100;
        int quantityOfComments=1000;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(5, numberOfUsers);
        Assert.assertEquals(1000, numberOfComments);
        Assert.assertEquals(20, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(200, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(10, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWithNoUsers () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();

        int quantityOfPosts=100;
        int quantityOfComments=1000;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(0, numberOfUsers);
        Assert.assertEquals(1000, numberOfComments);
        Assert.assertEquals(0, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(0, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(10, avgNumberOfCommentsPerPostTest, 000000.1);
    }
    @Test
    public void calculateAdvStatisticsTestWith100Users () {
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> usersNames=new ArrayList<String>();
        for (int n=0; n<20; n++) {
            usersNames.add("Zenon" +n*11);
            usersNames.add("Edward"+n*200);
            usersNames.add("Sulpicjusz"+n*1000);
            usersNames.add("Gregory"+n+2);
            usersNames.add("Justyn"+n*10);
        }
        int quantityOfPosts=100;
        int quantityOfComments=1000;

        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics forumStatistics=new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //when
        int numberOfPosts=forumStatistics.getNumberOfPosts();
        //System.out.println(numberOfPosts);
        int numberOfUsers=forumStatistics.getNumberOfUsers();
        //System.out.println(numberOfUsers);
        int numberOfComments=forumStatistics.getNumberOfComments();
        //System.out.println(numberOfComments);
        double avgNumberOfPostsPerUserTest=forumStatistics.getAvgNumberOfPostsPerUser();
        //System.out.println(avgNumberOfPostsPerUserTest);
        double avgNumberOfCommentsPerUserTest=forumStatistics.getAvgNumberOfCommentsPerUser();
        //System.out.println(avgNumberOfCommentsPerUserTest);
        double avgNumberOfCommentsPerPostTest=forumStatistics.getAvgNumberOfCommentsPerPost();
        //System.out.println(avgNumberOfCommentsPerPostTest);

        //then
        Assert.assertEquals(100, numberOfPosts);
        Assert.assertEquals(100, numberOfUsers);
        Assert.assertEquals(1000, numberOfComments);
        Assert.assertEquals(1, avgNumberOfPostsPerUserTest, 000000.1);
        Assert.assertEquals(10, avgNumberOfCommentsPerUserTest, 000000.1);
        Assert.assertEquals(10, avgNumberOfCommentsPerPostTest, 000000.1);
    }
}
