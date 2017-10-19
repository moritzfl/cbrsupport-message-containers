package org.cbrsupport.agentinterface.transport;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Marshaller {

    public static String marshalToJson(Object object, Class javaClass) throws JAXBException {
        Map<String, Object> properties = new HashMap<>();
        properties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
        properties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, true);

        JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[]{
                javaClass}, properties);

        javax.xml.bind.Marshaller marshaller = jaxbContext.createMarshaller();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(object, baos);
        byte[] content = baos.toByteArray();
        return new String(content);
    }


    public static Object unmarshalFromJson(String json, Class javaClass) throws JAXBException {
        Map<String, Object> properties = new HashMap<>();
        properties.put(JAXBContextProperties.MEDIA_TYPE, "application/json");
        properties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, true);


        JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[]{
                javaClass}, properties);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        byte[] content = json.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(content);
        Object copy = unmarshaller.unmarshal(bais);

        return copy;
    }
}
