package publishercountrygame;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publisherCountryGameRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Country Game Publisher");
		CountryGamePublish publisherGeussGame = new CountryGamePublishImpl();
		publisherCountryGameRegistration = bundleContext.registerService(
				CountryGamePublish.class.getName(),publisherGeussGame,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Country Game Publisher");
		publisherCountryGameRegistration.unregister();
	}

}
