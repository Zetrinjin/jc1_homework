package lesson21;

import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomParserExample {
    public static void main(String[] args)  {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            final Document document = builder.parse(new File("c:/repo/resourses/test.xml"));

            final NodeList childNodes =  document.getChildNodes();
            for(int i=0;i<childNodes.getLength();i++){
                final Node item = childNodes.item(i);
                System.out.println(item.getNodeName() + ": "
                        + childNodes.item(i).getTextContent());
                System.out.println(item.getAttributes().getNamedItem("id").getTextContent());
            }



        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
