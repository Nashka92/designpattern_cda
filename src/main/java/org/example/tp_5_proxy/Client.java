package org.example.tp_5_proxy;

public class Client {
    public static void main(String[] args) {
        // avec abonnement prenium il se différencie avec le booléen isUserPrenium
        SecuredBookProxy preniumUserBook = new SecuredBookProxy("Harry Potter", "Fableuse histoire", true );
        preniumUserBook.readBook();

         // sans abonnement prenium il se différencie avec le booléen isUserPrenium
        SecuredBookProxy notPreniumUser = new SecuredBookProxy("Harry Potter", "Fableuse histoire", false );
        notPreniumUser.readBook();
    }
}

