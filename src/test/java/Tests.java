import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class Tests {

    @Test
    public void test(){
        System.out.println("Проверка");
    }

    @Test
    public void WelcomeTest(){
        HeadHealth headHealth = new HeadHealth();
        headHealth.welcome();
    }
}
