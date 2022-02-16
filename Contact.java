/*
            môžem dediť len z 1 triedy
            .toString() má každý objekt
            abstract -> neda sa z nej urobiť inštancia
            abstractne triedy -> triedy, ktoré obsahuju aspoň 1 abstract metodu
 */

public abstract class Contact implements Znamy {                      // toto je superclass

    private String firstName;
    private String surname;

    Contact[] friends;

    public Contact(String fullName) {
        String[] parts = fullName.split(" ");
        firstName = parts[0];
    }

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Contact(Contact other) {
        this.firstName = other.firstName;
        this.surname = other.surname;
    }

    public void setFriends(Contact... newFriends) {
        this.friends = newFriends;
    }

    public void setFriendsFromArray(Contact[] newFriend) {
        this.friends = newFriend;
    }

    public String akoText() {                                           // Tuto pretazujem v Graduate
        return String.format("%s %s", this.firstName, this.surname);
    }

    public abstract String getZnamy();

    @Override
    public String toString() {
        return String.format("%s\n%s", this.akoText(), this.getZnamy());
    }

}
