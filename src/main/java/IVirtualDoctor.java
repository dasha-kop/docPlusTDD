public interface IVirtualDoctor {

    default void welcome() {
        System.out.println("Здравствуйте, вас приветствует альфа версия ПО виртуальный доктор \"DocPlus\" ");
    }

    void printTitle();

    void printQuestions();

    String diagnosis(int number);

    int countQuestions();

}
