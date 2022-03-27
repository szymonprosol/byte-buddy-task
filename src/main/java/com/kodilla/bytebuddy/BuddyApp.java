package com.kodilla.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

public class BuddyApp {

    public static void main(String[] args) throws Exception {

        User user = new User("Szymon", "Nowak", 2010);
        user.doSomething();
    }
}
