package DesignPattern.Adapter.template;

import DesignPattern.Adapter.template.externeBibliothek.XmlDatei;

public interface ClientInterface {
    XmlDatei getFahrtZeitXml(XmlDatei xmlDaten);
}
