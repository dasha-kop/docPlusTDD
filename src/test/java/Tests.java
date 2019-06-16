import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

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
        assertEquals(headHealth.countQuestions(), 3);
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
        assertEquals(backHealth.countQuestions(), 3);
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

    @Test
    public void DiagnosesTest(){
        HeadHealth headHealth = new HeadHealth();
        BackHealth backHealth = new BackHealth();
        String headDiagnose = headHealth.diagnosis(1);
        assertEquals(headDiagnose,"Поздравляем у вас Алкогольная энцефалопатия");
        String backDiagnose = backHealth.diagnosis(1);
        assertEquals(backDiagnose, "Поздравляем у вас Артроз позвоночника");
    }

    @Test
    public void TherapistKindTest(){
        Therapist therapist = new Therapist(new HeadHealth());
        assertEquals(therapist.getVirtualDoctor().getClass(), HeadHealth.class);
        therapist = new Therapist(new BackHealth());
        assertEquals(therapist.getVirtualDoctor().getClass(), BackHealth.class);
    }

}
