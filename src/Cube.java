public class Cube {
    private double ribs;

    public Cube(double ribs){
        this.ribs = ribs;
    }

    public double getTotalSurfaceArea(){ //сумарна площа граней
        return 6 * (ribs * ribs);
    }

    public double cubeVolume(){//об'єм
        return ribs * ribs * ribs;
    }

    public double largDiagonalLengh(){//довжина найдовшої діагоналі
        return ribs*Math.sqrt(3);
    }
}
