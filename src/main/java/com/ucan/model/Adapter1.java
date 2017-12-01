
package com.ucan.model;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.cxf.xjc.runtime.DataTypeAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (DataTypeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (DataTypeAdapter.printDateTime(value));
    }

}
