class Complex {
    private double real;
    private double imaginary;

    // zerado ambos
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // seta apenas o real 
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    // ambos os parametros é igual
    public Complex(double real, double imaginary) {
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
    
    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imaginary - other.imaginary);
    }
    
    public Complex multiply(Complex other) {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }
    
    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = (real * other.real + imaginary * other.imaginary) / denominator;
        double newImaginary = (imaginary * other.real - real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }



    public Complex addToMe(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
        return this;
    }


    public Complex subtractFromMe(Complex other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
        return this;
    }

    public Complex multiplyMeBy(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        this.real = newReal;
        this.imaginary = newImaginary;
        return this;
    }

    public Complex divideMeBy(Complex other) {
        Complex conjugate = new Complex(other.real, -other.imaginary);
        Complex numerator = this.multiplyMeBy(conjugate);
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        this.real = numerator.real / denominator;
        this.imaginary = numerator.imaginary / denominator;
        return this;
    }


    public String toString() {
        return + real + " + " + imaginary + "i";
    }
}
