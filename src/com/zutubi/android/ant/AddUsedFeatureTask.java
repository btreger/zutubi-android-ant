package com.zutubi.android.ant;

import org.apache.tools.ant.BuildException;

/**
 * Adds a uses-feature element with a given permission name to the manifest.
 */
public class AddUsedFeatureTask extends AbstractManifestUpdateTask {
    private String feature;
    private Boolean required;

    /**
     * Sets the name of the feature to add.
     *
     * @param feature name of the feature to add
     */
    public void setFeature(final String feature) {
    	this.feature = feature;
    }

    /**
     * @param required is the feature required
     */
    public void setRequired(final boolean required) {
    	 this.required = required;
    }

    @Override
    protected void updateManifest(final Manifest manifest) {
    	if (feature == null) {
    		throw new BuildException("paramter \"feature\" is null");
    	}
    	if (required == null) {
    		required = true;
    	}
        manifest.addUsedFeature(feature, required);
    }
}
