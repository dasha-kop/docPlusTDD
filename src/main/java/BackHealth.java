import java.util.ArrayList;
import java.util.List;

public class BackHealth implements IVirtualDoctor {
    public static final int PLUS_ONE = 1;
    private List<String> questions;
    private final static String LOIN_PAIN = "Боль в пояснице?";
    private final static String STRESS_PAIN = "Боль в спине при нагрузке";
    private final static String PERIOD_PAIN = "Переодические головные боли?";
    @Override
    public void printTitle() {
        System.out.println("Спина");
    }

    public BackHealth() {
        questions = new ArrayList<>();
        questions.add(LOIN_PAIN);
        questions.add(STRESS_PAIN);
        questions.add(PERIOD_PAIN);
    }

    @Override
    public void printQuestions() {
        int i = 0;
        for (String each :
                questions) {
            System.out.println(i++ + PLUS_ONE + ") " + each);
        }
    }

    @Override
    public void diagnosis(int number) {

    }
}
