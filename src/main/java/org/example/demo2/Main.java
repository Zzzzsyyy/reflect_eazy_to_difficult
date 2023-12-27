package org.example.demo2;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //kind1: use getClass
        User user = new User();
        Class userClass = user.getClass();
        System.out.println(userClass);

        //kind2: use .class
        Class<User> userClass1 = User.class;
        System.out.println(userClass1);

        //kind3: use Class.forName()
        Class<?> userClass2 = Class.forName("org.example.demo1.User");
        System.out.println(userClass2);

        User userInstance = (User) userClass.newInstance();
        userInstance.sayHello();
    }
}
