import java.lang.Math;

public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

	public void setComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(real + other.real, imaginary + other.imaginary);
    }

    public void addToMe(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imaginary - other.imaginary);
    }

    public void subtractFromMe(Complex other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

    public Complex multiply(Complex other) {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    public void multiplyMe(Complex other) {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public void divideMeBy(Complex other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public double module() {
    	return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double angle() {
        return Math.atan2(imaginary, real);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2fi)", real, imaginary);
    }
}
