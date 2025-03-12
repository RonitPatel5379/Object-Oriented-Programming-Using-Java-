class Complex {
    double real;
    double imaginary;

    // Complex() {
    //     real=0.0;
    //     imaginary=0.0;
    // }

    Complex(double real,double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    void add(Complex temp) {
        this.real=real+temp.real;
        this.imaginary=imaginary+temp.imaginary;
        System.out.println(this.real +"+" + this.imaginary +"i");
    }
}

public class Addcomplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5.5);
        Complex c2 = new Complex(3,5.5);
        c1.add(c2);
        // c1.sum(3,4.6);
        // c1.print();
    }
}