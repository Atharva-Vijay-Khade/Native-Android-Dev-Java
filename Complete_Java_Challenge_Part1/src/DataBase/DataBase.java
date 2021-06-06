package DataBase;
import java.util.HashMap;
import java.util.Map;

// Creating a dataBase using singleTon Pattern in Java
public class DataBase {

    public static DataBase dataBase;

    private Map<String,UserInfo> map = new HashMap();

    private DataBase(String dummy,UserInfo dummy2){
        map.put(dummy,dummy2);
    }

    public static synchronized DataBase getInstance(){
        if(dataBase == null){
            UserInfo userInfo = new UserInfo();
            return (new DataBase("+",userInfo));
        }
        return dataBase;
    }

    public void addUser(String name,String phoneNumber) {
        if(map.containsKey(name))
        {
            System.out.println("The entry already exists");
        }
        else {
            UserInfo userinfo = new UserInfo();
            userinfo.phoneNumber = phoneNumber;
            map.put(name,userinfo);
        }
    }

    public void addUserContactInfo(String Username,String ContactName,String ContactNumber){
        if(!map.containsKey(Username)){
            System.out.println("the given Username does not exist");
        }
        else{
            UserInfo userinfo = map.get(Username);
            Map<String,String> cmap = userinfo.contactNumbers;
            if(cmap.containsKey(ContactName)){
                System.out.println("This contact already exists");
            }
            else{
                cmap.put(ContactName,ContactNumber);
                userinfo.contactNumbers = cmap;
            }
        }
    }

    public void addUserMessageInfo(String Username,String from,String message){
        if(!map.containsKey(Username)){
            System.out.println("the given Username does not exist");
        }
        else{
            UserInfo userinfo = map.get(Username);
            Map<String,String> mmap = userinfo.messages;
            mmap.put(from,message);
            userinfo.messages = mmap;
        }
    }

    public void printUserContactList(String Username){
        if(!map.containsKey(Username))
            return;
        else{
            System.out.println("my phone number is : " + map.get(Username).phoneNumber);
            System.out.println("Contact list is:");
            System.out.println(map.get(Username).contactNumbers);
        }
    }

    public void printUserMessageList(String Username){
        if(!map.containsKey(Username))
            return;
        else{
            System.out.println("my phone number is : " + map.get(Username).phoneNumber);
            System.out.println("Message list is:");
            System.out.println(map.get(Username).messages);
        }
    }

    public boolean searchForContact(String Username,String name) {
        if(!map.containsKey(Username)){
            System.out.println("Given username not found");
            return false;
        }
        else {
            UserInfo userInfo = map.get(Username);
            if(userInfo.contactNumbers.containsKey(name)){
                return true;
            }
            else 
                return false;
        }
    }

    public void DeleteContact(String Username,String name){
        if(!searchForContact(Username, name))
            return;
        else{
            UserInfo userInfo = map.get(Username);
            userInfo.contactNumbers.remove(name);
            System.out.println("entry removed");
        }
    }

    public void SendMessage(String Username,String to,String message) {
        if(!map.containsKey(to)) {
            System.out.println("The user does not uses phone");
        }
        else{
            UserInfo userinfo = map.get(to);
            userinfo.messages.put(Username," :"+message);
            System.out.println("Message sent successfully");
        }
    }

}
