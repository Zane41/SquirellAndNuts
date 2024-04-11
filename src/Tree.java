public class Tree {
    public Tree() {
    }
    public Nut[] createArray (int nutsQuantity){
        Nut[] array1 = new Nut[nutsQuantity];
        for (int i=0;i<nutsQuantity; i++)
            array1[i]=new Nut();
        return array1;
    }
}
