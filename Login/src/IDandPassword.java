import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPassword(){

        loginInfo.put("Rick","pizza");
        loginInfo.put("Bob","hot-dog");
        loginInfo.put("Ricardo","hamburger");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }

}
