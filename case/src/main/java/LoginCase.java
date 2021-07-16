import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONReader;
import com.datacanvas.superion.base.BaseCase;
import com.datacanvas.superion.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class LoginCase extends BaseCase {

    String userName;
    String userNameBy;
    String userNamePath;

    String passwd;
    String passwdBy;
    String passwdPath;

    String login;
    String loginBy;
    String loginPath;


    @BeforeClass
    public void getAllElement() {

        WebDriver driver = new ChromeDriver();
        By by = By.xpath("");
        String loginPageElementJsonPath = String.format("%s%s%s", "element_v610\\login", File.separator, "Login.json");
        String loginPageElementJson = FileUtil.readFromFilePath(loginPageElementJsonPath);

        String userNameBy = JSONPath.read(loginPageElementJson, "$.login.loginUserName.by").toString();

        System.out.println(userName);


    }

    @Test
    public void login() {


        System.out.println("111");


    }

}
