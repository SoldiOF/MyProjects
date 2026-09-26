public class RandomNumber {

    public static int newRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
