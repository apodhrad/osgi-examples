package org.apodhrad.example.osgi.rest;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("Starting the OSGi REST");
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the OSGi REST");
    }

}