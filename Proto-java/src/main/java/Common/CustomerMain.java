package Common;

import example.customer.CustomerOuterClass;

import java.util.Arrays;

public class CustomerMain {

    private static CustomerOuterClass.User newUser(int id, String name) {
        return CustomerOuterClass.User.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    public static void main(String args[]) {
        CustomerOuterClass.Customer message = CustomerOuterClass.Customer.newBuilder()
                .setUser(newUser(1234, "Nivas"))
                .addAllUsers(Arrays.asList(
                        newUser(231, "srini"),
                        newUser(331, "vasan")
                )).build();
        System.out.println(message);
    }
}
