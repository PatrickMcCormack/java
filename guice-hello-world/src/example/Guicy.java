package example;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.lang.reflect.Constructor;

public class Guicy {

	static boolean testing=true;

	public static void main(String[] args) {
		System.out.println("Guice Example");

		Injector injector;

		// In a non-trivial example command line parameters could be used
		// to specify which version of the code to run (dev/test/prod)
		//
		// There could be many different Modules beyond Test and Production,
		// there could be a DevModule to allow running on a dev box.

		if (testing) {
			injector = Guice.createInjector(new TestModule());
		} else {
			injector = Guice.createInjector(new ProductionModule());
		}

		// Rather than using 'new' to create a Clients object we use
		// getInstance on the injector. This is because we want
		// Guice to do it's 'magic' and resolve the @inject
		// Annotations when it creates the Clients object.
		//
		Clients clients = injector.getInstance(Clients.class);

		// The clients object just holds references to the instantiated
		// concrete classes and they are referenced by accessor methods
		// like dfs()

		int fd = clients.dfs().open("ThisFile");
		clients.dfs().write(fd, "write this");
		clients.dfs().read(fd);
		clients.dfs().close(fd);

		clients.serviceDiscovery().findService("geo-location-service", 1);

	}

}
