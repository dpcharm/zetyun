import com.alibaba.fastjson.JSONPath;

public class LoginCase {

    public static void main(String[] args) {

        System.out.println(JSONPath.read("login.userName.by", "D:\\workspace\\zetyun\\case\\src\\main\\resources\\Login.json"));
    }

}
