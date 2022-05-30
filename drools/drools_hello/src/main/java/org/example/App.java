package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        KieServices ks = KieServices.Factory.get();
        KieContainer kcontainer = ks.getKieClasspathContainer();
        KieSession ksession = kcontainer.newKieSession();

        Person john = new Person("ジョン", 25);
        ksession.insert(john);
        Person paul = new Person("ポール", 10);
        ksession.insert(paul);

        int fired = ksession.fireAllRules();

        ksession.dispose();
    }
}
