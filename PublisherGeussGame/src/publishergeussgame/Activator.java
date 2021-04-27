package publishergeussgame;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherGeussGameRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Geuss Game Publisher");
		GeussGamePublish publisherGeussGame = new GeussGamePublishImpl();
		publisherGeussGameRegistration = context.registerService(
				GeussGamePublish.class.getName(),publisherGeussGame,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Geuss Game Publisher");
		publisherGeussGameRegistration.unregister();
	}

}
