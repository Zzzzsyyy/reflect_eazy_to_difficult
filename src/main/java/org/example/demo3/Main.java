package org.example.demo3;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User();
        Class<? extends User> userClass = user.getClass();

        Field field = userClass.getField("fieldPublic");
        field.set(user,"[+]public");
        System.out.println(field.get(user));
        System.out.println(user.getFieldPublic());

        Field field1 = userClass.getDeclaredField("fieldPrivate");
        field1.setAccessible(true);
        field1.set(user,"[+]private");
        System.out.println(field1.get(user));
        System.out.println(user.getFieldPrivate());

        Field field2 = userClass.getDeclaredField("fieldPrivateFinal");
        field2.setAccessible(true);
        field2.set(user,"[+]privateFinal");
        System.out.println(field2.get(user));
        System.out.println(user.getFieldPrivateFinal());
    }
}
