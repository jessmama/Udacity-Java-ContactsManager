public class Main {
    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact number1=new Contact("Jwa","123456");
        myContactManager.addContact(number1);
        System.out.println(myContactManager.friendsCount);
    }
}
