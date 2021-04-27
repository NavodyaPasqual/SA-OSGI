package publisherquestionnaire;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherQuestionnaireRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Quesionnaire Publisher");
		QuestionnairePublish questionnairePublish = new QuestionnairePublishImpl();
		publisherQuestionnaireRegistration = bundleContext.registerService(QuestionnairePublish.class.getName(),
				questionnairePublish, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Stop Quesionnaire Publisher");
		publisherQuestionnaireRegistration.unregister();
	}

}
