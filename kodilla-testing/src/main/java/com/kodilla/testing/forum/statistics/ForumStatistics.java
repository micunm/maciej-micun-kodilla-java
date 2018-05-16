package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() > 0) {
            avgNumberOfPostsPerUser = (double)statistics.postsCount() / (double)statistics.usersNames().size();
            avgNumberOfCommentsPerUser = (double)statistics.commentsCount() / (double)statistics.usersNames().size();
        } else {
            avgNumberOfPostsPerUser = 0;
            avgNumberOfCommentsPerUser = 0;
        }
        if (statistics.postsCount() > 0) {
            avgNumberOfCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        } else {
            avgNumberOfCommentsPerPost = 0;
        }
    }
        public int getNumberOfUsers () {
            return numberOfUsers;
        }
        public int getNumberOfComments () {
            return numberOfComments;
        }
        public int getNumberOfPosts () {
            return numberOfPosts;
        }
        public double getAvgNumberOfPostsPerUser () {
            return avgNumberOfPostsPerUser;
        }
        public double getAvgNumberOfCommentsPerUser () {
            return avgNumberOfCommentsPerUser;
        }
        public double getAvgNumberOfCommentsPerPost () {
            return avgNumberOfCommentsPerPost;
        }

        public void showStatistics () {
            System.out.println("numberOfUsers: "+numberOfUsers);
            System.out.println("numberOfPosts "+numberOfPosts);
            System.out.println("numberOfComments "+numberOfComments);
            System.out.println("avgNumberOfPostsPerUser "+avgNumberOfPostsPerUser);
            System.out.println("avgNumberOfCommentsPerUser "+avgNumberOfCommentsPerUser);
            System.out.println("avgNumberOfCommentsPerPost "+avgNumberOfCommentsPerPost);
        }
}
