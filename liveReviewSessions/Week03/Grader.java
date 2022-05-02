package Week03;

public class Grader {
    public static void main(String[] args) {
      // for a given grade, assign Letter grades: 100-90(90 is inclusive):
        // A; 89-80=b; 79-70 = c; 69-60=d, below is f

int grade = 95;
// do sanity check
        if (grade>=0&& grade<=100){
            System.out.println("your grade is valid");};
        if (grade<=100&& grade>=90){
            System.out.println("A");
            System.out.println("your grade ");

            int score = 85; // 0-100 points
            boolean A = score >= 90 && score <=100;
            boolean B = score >= 80 && score <=89; // boolean B = score >= 90 && !A;
            boolean C = score >= 70 && score <=79; // boolean C = !A && !B && score <=79;
            boolean D = score >= 60 && score <=69; // boolean D = score >= 60 && !C;
            boolean F = score >= 0 && score <=59; // boolean F = !A && !B && !C && !D;

            if(A){
                System.out.println("Excellent");
            }

            if (B) {
                System.out.println("Great");
            }else
                if (C) {
                System.out.println("Good");
            } else

            if (D) {
                System.out.println("Passed");
            }else

            if (F) {
                System.out.println("Failed");
            }
// if I give values very close to limits of my tests
            //such as101,99 -1,01== is is called Boundary
        }

        }


    }

