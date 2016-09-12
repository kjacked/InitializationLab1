package InitializationLab1;


public class InitializationLab1 {
    public static void main(String[] args) {
        ColorfulThing ct1 = new ColorfulThing(ColorfulThing.Color.Black);
        ColorfulThing ct2 = new ColorfulThing(ColorfulThing.Color.Purple);
        ColorfulThing ct3 = new ColorfulThing(ColorfulThing.Color.Yellow);
        ColorfulThing ct4 = new ColorfulThing(ColorfulThing.Color.Amber);
        ColorfulThing ct5 = new ColorfulThing(ColorfulThing.Color.Orange);
        ColorfulThing[] cts = new ColorfulThing[]{
                ct1, ct2, ct3, ct4, ct5};
        for (ColorfulThing ct : cts) {
            System.out.println(ct.getColor());
        }
    }
}


