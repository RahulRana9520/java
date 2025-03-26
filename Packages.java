// Save this file as MyPackageClass.java inside a folder named "mypackage"
package mypackage;  // Defining package

public class MyPackageClass {
    public void display() {
        System.out.println("This is a user-defined package.");
    }
}




// Save this in a different file in the same directory
import mypackage.MyPackageClass;  // Import the package

public class PackageDemo {
    public static void main(String[] args) {
        MyPackageClass obj = new MyPackageClass();
        obj.display();  // Calling method from user-defined package
    }
}
