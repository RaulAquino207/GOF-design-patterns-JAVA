package com.raulaquino._1_creational._1_5_prototype._1_5_2_functionalclonebuilder;

import com.raulaquino._1_creational._1_5_prototype._1_5_2_functionalclonebuilder.models.Address;
import com.raulaquino._1_creational._1_5_prototype._1_5_2_functionalclonebuilder.models.User;

public class Client {
    public static void main(String[] args) {
        User user = new User("ToClone", 25, new Address("ABC Street", 1000));
        System.out.println(user);

        User cloneUser = user.cloneBuilder().withName("Cloned++").now();
        System.out.println(cloneUser);

        User anotherUser = cloneUser.cloneBuilder()
                .withAge(100)
                .withAddress(new Address("A Street", 500))
                .now();
        System.out.println(anotherUser);
    }
}
