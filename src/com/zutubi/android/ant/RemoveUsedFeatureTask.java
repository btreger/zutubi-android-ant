package com.zutubi.android.ant;

/**
 * Removes a uses-permission element with a given permission name from the
 * manifest, if present.
 */
public class RemoveUsedFeatureTask extends AbstractManifestUpdateTask {
    private String feature;

    /**
     * Sets the name of the permission to remove.
     *
     * @param feature name of the feature to remove
     */
    public void setFeature(final String feature) {
        this.feature = feature;
    }

    @Override
    protected void updateManifest(final Manifest manifest) {
        manifest.removeUsedFeature(feature);
    }
}
