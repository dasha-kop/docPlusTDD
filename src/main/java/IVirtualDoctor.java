public interface IVirtualDoctor {

    default void welcome(){
        System.out.println("Здравствуйте, вас приветствует виртуальный доктор \"DocPlus\" ");
    }

    public void printQuestions();

}
