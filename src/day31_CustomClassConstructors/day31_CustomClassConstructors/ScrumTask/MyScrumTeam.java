package day31_CustomClassConstructors.day31_CustomClassConstructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        // create 4 tester's objects
Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("John", 12, "SDET", 142000);
        Tester tester3 = new Tester("Mira", 13, "SE", 135000);
        Tester tester4 = new Tester("Lina", 14, "SDET", 115000);

      Tester[] testers = {tester2,tester3,tester4};

        //5 developer's objects
Developer developer1 = new Developer("Olga", 15, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 16, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 157 ,"Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 17, "Senior Developer", 200000);


        Developer[] developers = {developer2, developer3,developer4};

        //1 ScrumTeam object

        ScrumTeam scrum= new ScrumTeam(" Maria","John", "Daniel", 14);
        scrum.addTester(tester1);
        scrum.adDeveloper(developer1);
        System.out.println(scrum);

        scrum.adTesters(testers);
        scrum.adDevelopers(developers);
        System.out.println(scrum);

        System.out.println("==================================");
        for (Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }
        for (Developer eachDeceloper: scrum.devopsList){
            System.out.println(eachDeceloper.name+ " : " + eachDeceloper.salary);
        }

        System.out.println("----------------------------------");
        scrum.removeTester(12);
        System.out.println(scrum);
        scrum.removeTester(17);
        System.out.println(scrum);





    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team


 */