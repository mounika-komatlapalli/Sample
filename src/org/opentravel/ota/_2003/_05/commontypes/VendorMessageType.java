
package org.opentravel.ota._2003._05.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides formatted textual information that a vendor wishes to make known. The type of information is indicated.
 * 
 * <p>Java class for VendorMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}FormattedTextType">
 *       &lt;attribute name="InfoType" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorMessageType")
public class VendorMessageType
    extends FormattedTextType
{

    @XmlAttribute(name = "InfoType", required = true)
    protected String infoType;

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

}
