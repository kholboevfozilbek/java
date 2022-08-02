
public class Main
{
    public static void main(String[] args) {

        ContactBook contacts = new ContactBook("My contacts");

        contacts.add("Johny", new PhoneEntry("John Smith", "100200300"));
        contacts.add("Lisa", new EmailEntry("Lisa Wood", "lisa@gmail.com"));
        contacts.add("Andy", new AddressEntry("Andrew Fox", "Warsaw", "Green St.",7));

        contacts.display();

        try {
            System.out.println(contacts.at("Andy").getContents());
            System.out.println(contacts.at("Name").getContents());
        }
        catch(NameError e) {
            System.out.println(e);
            e.printStackTrace();
        }

        contacts.removeAll();

        contacts.display();
    }
}
