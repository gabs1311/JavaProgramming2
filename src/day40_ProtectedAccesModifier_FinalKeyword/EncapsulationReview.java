package day40_ProtectedAccesModifier_FinalKeyword;

import day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.Shape.Circle;

public class EncapsulationReview {

    private Circle circle;

    // how do I get the getter?
    public Circle getCircle(){// this is how I use the getter. Regardless of what variable is assigned
                                // to that circle, I am going to get THAT CIRCLE
        return circle;
    }

    //and how should I get the setter
    public void setCircle( Circle circle){// everytime I use teh setter, a new variable is assigned, so I must give
                            // a perimeter, and the perimeter must match the data type of the private variable

       if (circle.getRadius()<5){// if I want I can give a condition, so that if the radius is<5
           return;              // do not consider it
           
       }
        this.circle= circle;
    }


}
