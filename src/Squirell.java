public class Squirell {
    public Squirell() {
    }
    public double collectNuts (Nut [] array){
        double totalWeight = 0;
        for (Nut x:array) {
            System.out.println("yay, 1 more nut ^^");
            totalWeight+=x.getWeight();
        }
    return totalWeight;
    }
    public void say (double weight){
        System.out.println("'proud' I've take a lot of nuts. Their mass is "+weight);
    }
}
