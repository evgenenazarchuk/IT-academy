package by.academy.classwork.classwork_10;

import by.academy.classwork.classwork_10.User.Query;

public class Userdemo {
    public static void main (String[] args){
        User user =new User ("login", "123456");
      //  user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();


        Query q1 = user.new Query();
      q1.printToLog();

    }
}
