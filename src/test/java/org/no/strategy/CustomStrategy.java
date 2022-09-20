package org.no.strategy;

import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class CustomStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {
    private static final String CONFIG_FIXED_PARALLELISM_PROPERTY_NAME = "custom.parallelism";
    private static final int KEEP_ALIVE_SECONDS = 30;
    private int parallelism;

    @Override
    public int getParallelism() {
        return parallelism;
    }

    @Override
    public int getMinimumRunnable() {
        return parallelism;
    }

    @Override
    public int getMaxPoolSize() {
        return parallelism;
    }

    @Override
    public int getCorePoolSize() {
        return parallelism;
    }

    @Override
    public int getKeepAliveSeconds() {
        return KEEP_ALIVE_SECONDS;
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        this.parallelism = configurationParameters.get(CONFIG_FIXED_PARALLELISM_PROPERTY_NAME,
                Integer::valueOf).orElseThrow(
                () -> new JUnitException(String.format("Configuration parameter '%s' must be set",
                        CONFIG_FIXED_PARALLELISM_PROPERTY_NAME)));
        return this;
    }
}
