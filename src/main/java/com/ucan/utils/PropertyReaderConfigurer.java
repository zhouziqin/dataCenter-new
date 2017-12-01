package com.ucan.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyReaderConfigurer extends PropertyPlaceholderConfigurer implements PropertyReader {
	
	private static final Logger LOG = LoggerFactory.getLogger(PropertyReaderConfigurer.class);

    private Map<String, String> values;

    public PropertyReaderConfigurer() {
        this.values = new HashMap<String, String>();
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess,
            Properties props) throws BeansException {
        super.processProperties( beanFactoryToProcess , props );
        if ( props == null ) {
            return;
        }
        for ( Object key : props.keySet() ) {
            String name = String.valueOf( key );
            values.put( name , props.getProperty( name ) );
        }
        logValues();
    }

    @Override
    public String getValue(String name) {
        return values.get( name );
    }

	public void logValues() {
		StringBuilder builder = new StringBuilder();
		for ( Map.Entry<String, String> entry : values.entrySet() ) {
			builder.append( entry.getKey() ).append( " = " ).append( entry.getValue() ).append( '\n' );
		}
		LOG.info( "load properties:\n{}" , builder.toString() );
	}
}
