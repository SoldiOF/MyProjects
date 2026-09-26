import exercises.*;

void main(String[] args) {

    System.out.println("What exercise would you like to see?");
    Scanner keyboard = new Scanner(System.in);
    String exercise = keyboard.next();
    if (exercise.equals("1")) {
        Exercise1.useExercise1();
    }
    if (exercise.equals("2")) {
        Exercise2.useExercise2();
    }
    if (exercise.equals("3")) {
        Exercise3.useExercise3();
    }
    if (exercise.equals("4")) {
        Exercise4.useExercise4();
    }
    if (exercise.equals("5")) {
        Exercise5.useExercise5();
    }
    if (exercise.equals("6")) {
        Exercise6.useExercise6();
    }
    if (exercise.equals("7")){
       Exercise7.useExercise7();
    }




}