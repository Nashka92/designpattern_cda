package org.example.tp_5_proxy;

public class SecuredBookProxy implements Book {
    // instance de realBook
    private RealBook realBook;

    // pour permettre d'accès en fonction de son status d'abonnement
    private boolean isUserPremium;


    public SecuredBookProxy(String title, String content, boolean isUserPremium) {
        realBook = new RealBook(title, content);
        this.isUserPremium = isUserPremium;
    }

    // ici on contrôle l'accès à la méthode (méthode propre à l'interface book)
    // en fonction du status de l'user (avec le booléen isUserPrenium)
    @Override
    public void readBook() {
        if (isUserPremium) {
            realBook.readBook();
        }else {
            System.out.print("User is not premium");
        }
    }
}

