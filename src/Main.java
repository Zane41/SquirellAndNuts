import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int min =1; int max =50;
      int b = (int) (Math.random() * (max - min)) +min;

      Tree testTree = new Tree();
      Squirell testSquirell = new Squirell();
      double x= testSquirell.collectNuts(testTree.createArray(b));

      testSquirell.say(x);
    }
}