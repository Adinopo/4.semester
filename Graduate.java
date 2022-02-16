public class Graduate extends Contact {                     // toto je subclass

    private String academicTitul;


    public Graduate(String firstName, String surname) {
        super(firstName, surname);
        this.academicTitul = " ";
    }

    public Graduate(String academicTitul, String firstName, String surname) {
        super(firstName, surname);
        this.academicTitul = academicTitul;
        this.friends = new Contact[0];
    }

//    public String akoTextsTitulom() {                                             // Ctrl + /
//        return String.format("%s %s", this.academicTitul, super.akoText());
//    }

    @Override                                       // Alt + Insert
    public String akoText() {
        return String.format("%s %s", this.academicTitul, super.akoText());          // volam rodicovsky akoText()
    }

    @Override
    public String getZnamy() {
        StringBuilder builder = new StringBuilder();
        builder.append("Moji známy:\n");
        for (int i = 0; i < this.friends.length; i++) {
            builder.append(this.friends[i].akoText());
            builder.append("\n");
        }
        return builder.toString();
    }
}
