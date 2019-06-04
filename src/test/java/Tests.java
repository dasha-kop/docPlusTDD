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

    @Test
    public void QuestionHeadTest(){
        HeadHealth headHealth = new HeadHealth();
        BackHealth backHealth = new BackHealth();
        headHealth.printQuestions();
        backHealth.printQuestions();
    }

    @Test
    public void WelcomeBackTest(){
        BackHealth backHealth = new BackHealth();
        backHealth.welcome();
    }

    @Test
    public void TherapistTest(){
        Therapist therapist = new Therapist(new HeadHealth());
        therapist.printQuestions();
    }

    @Test
    public void TitleTest(){
        HeadHealth headHealth = new HeadHealth();
        BackHealth backHealth = new BackHealth();
        headHealth.printTitle();
        backHealth.printTitle();
    }

    @Test void DiagnosesTest(){
        HeadHealth headHealth = new HeadHealth();
        BackHealth backHealth = new BackHealth();
        headHealth.diagnosis(1);
        backHealth.diagnosis(1);
    }

}
