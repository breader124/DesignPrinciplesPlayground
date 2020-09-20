package team;

import developer.Developer;
import tester.Tester;

public abstract class AbstractTeamFactory {
    public abstract Developer createDeveloper();
    public abstract Tester createTester();
}
