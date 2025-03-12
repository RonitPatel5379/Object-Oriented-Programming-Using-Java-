public class Countobj {
    
    static int objectCount = 0;

    public Countobj() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        //  Countobj obji = new Countobj();
        for(int i=1;i<=5;i++) {
            Countobj obji = new Countobj();
        }
        System.out.println("Number of objects created: " + Countobj.getObjectCount());
    }
}