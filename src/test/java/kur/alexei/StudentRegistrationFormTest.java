package kur.alexei;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;


public class StudentRegistrationFormTest {
    String firstName = "Alexei";
    String lastName = "Kurochkin";
    String email = "my@mail.com";
    String gender = "Male";
    int mobile = 1234567890;
    String dateOfBirth = "03.30.1974";
    String subjects = "comp";
    String hobbies = "Music";
    String currentAddress = "Students Street 9";
    String state = "NCR";
    String city = "Delhi";


    @BeforeAll
    public static void beforeTest() {
        //Configuration.timeout=30000;
        //Configuration.pageLoadTimeout=50000;
        Configuration.startMaximized=true;
    }

    @BeforeEach
    void openTestPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void name() {

    }
}
