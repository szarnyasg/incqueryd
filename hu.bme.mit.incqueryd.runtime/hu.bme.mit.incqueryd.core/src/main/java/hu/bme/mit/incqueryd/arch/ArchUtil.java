package hu.bme.mit.incqueryd.arch;

import hu.bme.mit.incqueryd.rete.dataunits.ReteNodeSlot;
import hu.bme.mit.incqueryd.rete.messages.SubscriptionMessage;
import infrastructure.InfrastructurePackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.rete.recipes.RecipesPackage;

import arch.ArchPackage;
import arch.Configuration;

public class ArchUtil {

	/**
	 * Extract the type name from the trace info.
	 *
	 * @param traceInfo
	 * @return
	 */
	public static String extractType(final String traceInfo) {
		final Pattern pattern = Pattern.compile(".*: (.*?) :.*");
		final Matcher matcher = pattern.matcher(traceInfo);
		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return "";
		}
	}

	public static boolean hasAttribute(final String traceInfo) {
		final Pattern pattern = Pattern.compile(".* \\[(.*?)\\].*");
		final Matcher matcher = pattern.matcher(traceInfo);
		return matcher.find();
	}

	public static String extractAttribute(final String traceInfo) {
		final Pattern pattern = Pattern.compile(".* \\[(.*?)\\].*");
		final Matcher matcher = pattern.matcher(traceInfo);
		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return "";
		}
	}

	/**
	 * Cut the proxy's name from the EMF URI.
	 *
	 * @param emfUri
	 * @return
	 */
	public static String cutProxyName(final String emfUri) {
		final Pattern pattern = Pattern.compile(".*json#(.*)");
		final Matcher matcher = pattern.matcher(emfUri);
		if (matcher.matches()) {
			// for relative URIs
			return matcher.group(1);
		} else {
			// for absoluti URIs
			return emfUri;
		}
	}

	public static String getJsonEObjectUri(final EObject eObject) {
		final URI uri = EcoreUtil.getURI(eObject);
		return cutProxyName(uri.toString());
	}

	public static SubscriptionMessage slotToMessage(final ReteNodeSlot slot) {
		switch (slot) {
		case PRIMARY:
			return SubscriptionMessage.SUBSCRIBE_PRIMARY;
		case SECONDARY:
			return SubscriptionMessage.SUBSCRIBE_SECONDARY;
		case SINGLE:
			return SubscriptionMessage.SUBSCRIBE_SINGLE;
		default:
			return null;
		}
	}

	public static Configuration loadConfiguration(final String architectureFile) {
		// initialize extension to factory map
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("arch", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("recipe", new XMIResourceFactoryImpl());

		// initialize package registry
		// initialize the RecipesPackage before the others
		RecipesPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		ArchPackage.eINSTANCE.eClass();

		// load resource
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.getResource(URI.createFileURI(architectureFile), true);

		// traverse model
		final EObject o = resource.getContents().get(0);
		return (Configuration) o;
	}

}
