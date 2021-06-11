import java.util.Map;

// Creating a dataBase using singleTon Pattern in Java
public class DataBase {

    public static DataBase dataBase;

    private Map<String,UserInfo> map;

    public static synchronized DataBase getInstance(){
        if(dataBase == null)
            return new DataBase();
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
                
            }
        }
    }

}
