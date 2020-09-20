package team;

import developer.Developer;
import tester.Tester;

import java.util.LinkedList;
import java.util.List;

public class DevTeam {
    private AbstractTeamFactory teamFactory;

    private List<Developer> developers;
    private Tester tester;

    public DevTeam(AbstractTeamFactory teamFactory, int developersNum) {
        developers = new LinkedList<>();
        for (int i = 0; i < developersNum; i++) {
            developers.add(teamFactory.createDeveloper());
        }

        this.tester = teamFactory.createTester();
    }

    public void implementFunctionality() {
        developers.forEach(Developer::implementStuff);
    }

    public void learnNewLanguage() {
        developers.forEach(Developer::learnNewLanguage);
    }

    public void testIt() {
        tester.testStuff();
        tester.proveValidity();
    }
}
