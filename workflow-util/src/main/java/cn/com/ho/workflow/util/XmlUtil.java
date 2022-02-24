package cn.com.ho.workflow.util;

import javax.xml.stream.XMLInputFactory;

public class XmlUtil {
    public XmlUtil() {
    }

    public static XMLInputFactory createSafeXmlInputFactory() {
        XMLInputFactory xif = XMLInputFactory.newInstance();
        if (xif.isPropertySupported("javax.xml.stream.isReplacingEntityReferences")) {
            xif.setProperty("javax.xml.stream.isReplacingEntityReferences", false);
        }

        if (xif.isPropertySupported("javax.xml.stream.isSupportingExternalEntities")) {
            xif.setProperty("javax.xml.stream.isSupportingExternalEntities", false);
        }

        if (xif.isPropertySupported("javax.xml.stream.supportDTD")) {
            xif.setProperty("javax.xml.stream.supportDTD", false);
        }

        return xif;
    }
}