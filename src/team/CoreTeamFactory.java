package team;

import developer.Developer;
import developer.JavaDeveloper;
import tester.TestEngineer;
import tester.Tester;

public class CoreTeamFactory extends AbstractTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new TestEngineer();
    }
}
