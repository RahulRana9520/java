class GarbageTest {
    int num;
    
    GarbageTest(int num) {
        this.num = num;
    }

    protected void finalize() {  // Called before object is destroyed
        System.out.println("Garbage Collected for object: " + num);
    }

    public static void main(String[] args) {
        GarbageTest obj1 = new GarbageTest(1);
        GarbageTest obj2 = new GarbageTest(2);
        
        obj1 = null;  // Eligible for GC
        obj2 = null;  // Eligible for GC

        System.gc();  // Request JVM to run garbage collector
    }
}
