package frogger;

/**Add all essential actors into level2*/
public class Level2 extends Levels{

    /**speed of the actors*/
    private double speedup = 1;



    /**Constructor that adds all actors into Scene*/
    public Level2() {

        getChildren().clear();

        backgroundImage.setLevelBackgroundImage(2);
        add(backgroundImage);
        addEnd();

        add(new Log(3, 150, 0, 166, 0.75*speedup));
        add(new Log(3, 150, 440, 166, 0.75*speedup));
        add(new Log(1, 300, 0, 276, -2*speedup));
        add(new Log(1, 300, 400, 276, -2*speedup));
        add(new Log(3, 150, 50, 329, 0.75*speedup));
        add(new Log(3, 150, 270, 329, 0.75*speedup));
        add(new Log(3, 150, 490, 329, 0.75*speedup));

        add(new Turtle(500, 376, -1*speedup));
        add(new Turtle(300, 376, -1*speedup));
        add(new WetTurtle(700, 376, -1*speedup));
        add(new Turtle(600, 217, -1*speedup));
        add(new Turtle(400, 217, -1*speedup));
        add(new WetTurtle(200, 217, -1*speedup));


        addAnimal();

        add(new Vehicle(1,2, 0, 649, 1*speedup));
        add(new Vehicle(1,2, 300, 649, 1*speedup));
        add(new Vehicle(1,2, 600, 649, 1*speedup));


        add(new Vehicle(1,1, 150, 597, -1*speedup));
        add(new Vehicle(1,1, 450, 597, -1*speedup));
        add(new Vehicle(1,1, 650, 597, -1*speedup));
        add(new Vehicle(2,2, 0, 540, 1*speedup));
        add(new Vehicle(2,2, 500, 540, 1*speedup));
        add(new Vehicle(1,1, 500, 490, -5*speedup));

        addButton();
    }


}
