package agh.optional;

import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Identity;
import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.Util;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int status = 0;
        Communicator communicator = null;

        try {
            communicator = Util.initialize(args);
            ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("Adapter1", "tcp -h 127.0.0.1 -p 9092");
            var testServant = new DemoServiceImpl();
            adapter.add(testServant, new Identity("test1", "test"));
            adapter.activate();

            System.out.println("Entering event processing loop...");

            communicator.waitForShutdown();

        } catch (Exception e) {
            e.printStackTrace(System.err);
            status = 1;
        }
        if (communicator != null) {
            try {
                communicator.destroy();
            } catch (Exception e) {
                e.printStackTrace(System.err);
                status = 1;
            }
        }
        System.exit(status);
    }
}