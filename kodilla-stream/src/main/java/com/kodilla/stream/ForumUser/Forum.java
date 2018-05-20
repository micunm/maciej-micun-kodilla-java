package com.kodilla.stream.ForumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "Eddie Murphy", 'M',
                2003, 9, 3, 11));
        theForumUsersList.add(new ForumUser(2, "Thomas Eddison", 'M',
                1903, 4, 1, 1));
        theForumUsersList.add(new ForumUser(3, "Kathrein Antenna", 'F',
                1983, 1, 17, 0));
        theForumUsersList.add(new ForumUser(4, "Lara Croft", 'F',
                1991, 10, 13, 9));
        theForumUsersList.add(new ForumUser(5, "Tom Hardy", 'M',
                1981, 5, 10, 33));
        theForumUsersList.add(new ForumUser(6, "Winnie The Pooh", 'M',
                1978, 12, 10, 45));
        theForumUsersList.add(new ForumUser(7, "Janet Kite", 'F',
                1997, 11, 11, 151));
        theForumUsersList.add(new ForumUser(8, "Johny Bravo", 'M',
                1987, 3, 8,2));
        theForumUsersList.add(new ForumUser(9, "Hannah Montana", 'F',
                2000, 9, 2, 11));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }

}
