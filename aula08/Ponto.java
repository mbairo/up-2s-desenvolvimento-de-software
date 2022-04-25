public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){

    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

        @Override
        public String toString(){
            return String.format("x = %f y = %f", x, y);
        }
    

    
} 