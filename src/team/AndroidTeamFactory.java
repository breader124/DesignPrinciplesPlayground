package team;

import developer.AndroidDeveloper;
import developer.Developer;
import tester.ManualTester;
import tester.Tester;

public class AndroidTeamFactory extends AbstractTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new AndroidDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }
}
