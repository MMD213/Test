public class Calc {
    private double a;
    private double b;

    public  Calc(){
        this.a=0;
        this.b=0;
    }
    public Calc(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double plus(double a, double b){
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
    public double umn(double a, double b){
        return a*b;
    }
    public double del(double a, double b){
        return a/b;
    }
    public double Pcvadrat(double a, double b){
        return (a+b)*2;
    }
}
