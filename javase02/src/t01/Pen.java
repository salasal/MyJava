import java.util.Objects;


/**
 * Created by Alexey on 08.06.2016.
 *
 * Class of Pens
 */
public class Pen {

    public static void main(String[] args) {
        Pen pen = new Pen(Colors.Blue, Materials.Plastic, 75);
        pen.setDesign(Designs.Simple);
        pen.setModel(Models.Noname);

        Pen pen3 = new Pen(Colors.Blue, Materials.Plastic, 75);
        pen3.setDesign(Designs.Simple);
        pen3.setModel(Models.Noname);

        Pen pen2 = new Pen(Colors.Red, Materials.Wood);
        pen2.setDesign(Designs.Nib);
        pen2.setModel(Models.Bic);
        pen2.setFullness(42);

        System.out.println(pen.hashCode());
        System.out.println(pen3.hashCode());
        System.out.println(pen.equals(pen3));
        System.out.println(pen);
        System.out.println(pen3.toString());
    }

    private int fullness = 100;
    private Models model;
    private Colors color;
    private Designs design;
    private Materials material;

    Pen(){};


    Pen(Colors color) {
        this.color = color;};


    Pen(Colors color, Materials material) {
        this.color = color; this.material = material;};


    Pen (Colors color, Materials material, int fullness){
        this.color = color;
        this.material = material;
        this.fullness = fullness;
    }

    public void setColor(Colors color){
        this.color = color;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    public void setFullness(int fullness){
        this.fullness = fullness;
    }

    public void  setModel (Models model) {
        this.model = model;
    }

    public void setDesign (Designs design) {
        this.design = design;
    }

    @Override
    public int hashCode(){
        int hash = fullness + color.ordinal() + material.ordinal()*10 + design.ordinal()*100 + model.ordinal()*1000;
        return  hash;
    }

    //@Override
    public boolean equals(Pen pen){
        if (pen == null) return false;
        if (pen == this) return true;
        return  ((this.color == pen.color) && (this.model == pen.model) && (this.design == pen.design) &&
                (this.material == pen.material) && (this.fullness == pen.fullness));
    }

    @Override
    public String toString (){
        String result = this.color.toString()+ " " + this.material.toString() + " " + this.design.toString() + " pen of " +
                this.fullness + "% full produced by " + this.model.toString();
        return result;
    }
}
