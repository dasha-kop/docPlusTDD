public class Therapist {
    private IVirtualDoctor virtualDoctor;

    public Therapist(IVirtualDoctor virtualDoctor) {
        this.virtualDoctor = virtualDoctor;
    }

    public void printQuestions(){
        virtualDoctor.printQuestions();
    }
}
