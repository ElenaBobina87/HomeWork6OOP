



public class Main {
    public static void main(String[] args){
        User user = new User("Bob");
        UserPersist us = new UserPersist();
        ToTerminalReport tr = new ToTerminalReport();
        tr.report(user);
        us.save(user);
    }
}