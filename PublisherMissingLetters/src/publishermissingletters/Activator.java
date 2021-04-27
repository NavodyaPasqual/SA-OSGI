package publishermissingletters;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherMissingLettersRegistration;;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Missing Letters Game Publisher");
		MissinglettersPublish service = new MissinglettersPublishImp();
		publisherMissingLettersRegistration = context.registerService(MissinglettersPublish.class.getName(), service, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Missing Letters Game Stop");
		publisherMissingLettersRegistration.unregister();
	}

}
