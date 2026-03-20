public class Complex {
    private double real;
    private double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    public Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r,i);
    }
    @Override
    public String toString(){
        if(imag >= 0)
            return real + " + " + imag + "i";
        else
            return real + " - " + (-imag) + "i";
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(1,-4);
        System.out.println("c1: " + c1.add(c2));
        System.out.println("c2: " + c1.subtract(c2));
        System.out.println("c3: " + c1.multiply(c2));
    }
}
