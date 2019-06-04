import java.util.ArrayList;
import java.util.List;

public class HeadHealth implements IVirtualDoctor {

    public static final int PLUS_ONE = 1;
    private List<String> questions;
    private final static String FORVARD_SIDE = "Боль в передней части головы?";
    private final static String BACK_SIDE = "Боль в задней части головы?";
    private final static String PERIOD_PAIN = "Переодические головные боли?";

    @Override
    public void printTitle() {
        System.out.println("Голова");
    }

    public HeadHealth() {
        questions = new ArrayList<>();
        questions.add(FORVARD_SIDE);
        questions.add(BACK_SIDE);
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
