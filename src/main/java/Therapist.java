public class Therapist {
    private IVirtualDoctor virtualDoctor;

    public Therapist(IVirtualDoctor virtualDoctor) {
        this.virtualDoctor = virtualDoctor;
    }

    public void printQuestions(){
        virtualDoctor.printQuestions();
    }

    public int getCount(){
        return virtualDoctor.countQuestions();
    }

    public void getAnswer(int num){
        System.out.println(virtualDoctor.diagnosis(num));
    }

    public IVirtualDoctor getVirtualDoctor() {
        return virtualDoctor;
    }
}
