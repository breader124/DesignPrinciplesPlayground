import team.AndroidTeamFactory;
import team.CoreTeamFactory;
import team.DevTeam;

public class Main {
    public static void main(String[] args) {
        System.out.println("ANDROID TEAM");
        DevTeam androidDevTeam = new DevTeam(new AndroidTeamFactory(), 4);
        androidDevTeam.implementFunctionality();
        androidDevTeam.testIt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("CORE TEAM");
        DevTeam coreDevTeam = new DevTeam(new CoreTeamFactory(), 5);
        coreDevTeam.implementFunctionality();
        coreDevTeam.testIt();
    }
}


/*

Hierarchy:
    Dev team:
        Mobile team:
            Android developer
            Manual tester
        Core team:
            Java developer
            Test engineer

 */