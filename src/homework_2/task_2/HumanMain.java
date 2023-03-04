package homework_2.task_2;

public class HumanMain {
    public static void main(String[] args) {
        Fireman fireman = new Fireman();
        fireman.work();
        Policeman policeman = new Policeman();
        policeman.work();
        Doctor doctor = new Doctor();
        doctor.work();

        Worker.canSing();

    }
}
