package org.apodhrad.example.jersey;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class JerseyActivator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("Starting the Jersey bundle");
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the Jersey bundle");
    }

}