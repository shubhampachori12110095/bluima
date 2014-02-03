//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}annotation"/>
 *         &lt;element ref="{}article-title"/>
 *         &lt;element ref="{}chapter-title"/>
 *         &lt;element ref="{}collab"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}conf-date"/>
 *         &lt;element ref="{}conf-loc"/>
 *         &lt;element ref="{}conf-name"/>
 *         &lt;element ref="{}conf-sponsor"/>
 *         &lt;element ref="{}date"/>
 *         &lt;element ref="{}date-in-citation"/>
 *         &lt;element ref="{}day"/>
 *         &lt;element ref="{}edition"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}elocation-id"/>
 *         &lt;element ref="{}etal"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}fpage"/>
 *         &lt;element ref="{}gov"/>
 *         &lt;element ref="{}institution"/>
 *         &lt;element ref="{}isbn"/>
 *         &lt;element ref="{}issn"/>
 *         &lt;element ref="{}issue"/>
 *         &lt;element ref="{}issue-id"/>
 *         &lt;element ref="{}issue-part"/>
 *         &lt;element ref="{}issue-title"/>
 *         &lt;element ref="{}lpage"/>
 *         &lt;element ref="{}month"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}object-id"/>
 *         &lt;element ref="{}page-range"/>
 *         &lt;element ref="{}part-title"/>
 *         &lt;element ref="{}patent"/>
 *         &lt;element ref="{}person-group"/>
 *         &lt;element ref="{}pub-id"/>
 *         &lt;element ref="{}publisher-loc"/>
 *         &lt;element ref="{}publisher-name"/>
 *         &lt;element ref="{}role"/>
 *         &lt;element ref="{}season"/>
 *         &lt;element ref="{}series"/>
 *         &lt;element ref="{}size"/>
 *         &lt;element ref="{}source"/>
 *         &lt;element ref="{}std"/>
 *         &lt;element ref="{}string-name"/>
 *         &lt;element ref="{}supplement"/>
 *         &lt;element ref="{}trans-source"/>
 *         &lt;element ref="{}trans-title"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}volume"/>
 *         &lt;element ref="{}volume-id"/>
 *         &lt;element ref="{}volume-series"/>
 *         &lt;element ref="{}year"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="link-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="source-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="source-id-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="source-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="document-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="document-id-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="document-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="object-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="object-id-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="object-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "related-object")
public class RelatedObject {

    @XmlElementRefs({
        @XmlElementRef(name = "issue-title", type = IssueTitle.class),
        @XmlElementRef(name = "comment", type = Comment.class),
        @XmlElementRef(name = "volume-series", type = VolumeSeries.class),
        @XmlElementRef(name = "size", type = Size.class),
        @XmlElementRef(name = "date", type = Date.class),
        @XmlElementRef(name = "month", type = Month.class),
        @XmlElementRef(name = "named-content", type = NamedContent.class),
        @XmlElementRef(name = "object-id", type = ObjectId.class),
        @XmlElementRef(name = "gov", type = Gov.class),
        @XmlElementRef(name = "uri", type = Uri.class),
        @XmlElementRef(name = "part-title", type = PartTitle.class),
        @XmlElementRef(name = "string-name", type = StringName.class),
        @XmlElementRef(name = "issn", type = Issn.class),
        @XmlElementRef(name = "sub", type = Sub.class),
        @XmlElementRef(name = "volume", type = Volume.class),
        @XmlElementRef(name = "issue-part", type = JAXBElement.class),
        @XmlElementRef(name = "publisher-loc", type = PublisherLoc.class),
        @XmlElementRef(name = "pub-id", type = PubId.class),
        @XmlElementRef(name = "issue-id", type = IssueId.class),
        @XmlElementRef(name = "isbn", type = Isbn.class),
        @XmlElementRef(name = "etal", type = JAXBElement.class),
        @XmlElementRef(name = "person-group", type = PersonGroup.class),
        @XmlElementRef(name = "collab", type = Collab.class),
        @XmlElementRef(name = "role", type = Role.class),
        @XmlElementRef(name = "series", type = Series.class),
        @XmlElementRef(name = "ext-link", type = ExtLink.class),
        @XmlElementRef(name = "issue", type = Issue.class),
        @XmlElementRef(name = "annotation", type = Annotation.class),
        @XmlElementRef(name = "trans-source", type = TransSource.class),
        @XmlElementRef(name = "strike", type = Strike.class),
        @XmlElementRef(name = "conf-date", type = ConfDate.class),
        @XmlElementRef(name = "name", type = Name.class),
        @XmlElementRef(name = "overline", type = Overline.class),
        @XmlElementRef(name = "elocation-id", type = ElocationId.class),
        @XmlElementRef(name = "source", type = Source.class),
        @XmlElementRef(name = "underline", type = Underline.class),
        @XmlElementRef(name = "bold", type = Bold.class),
        @XmlElementRef(name = "monospace", type = Monospace.class),
        @XmlElementRef(name = "day", type = Day.class),
        @XmlElementRef(name = "date-in-citation", type = DateInCitation.class),
        @XmlElementRef(name = "sup", type = Sup.class),
        @XmlElementRef(name = "styled-content", type = StyledContent.class),
        @XmlElementRef(name = "institution", type = Institution.class),
        @XmlElementRef(name = "roman", type = Roman.class),
        @XmlElementRef(name = "patent", type = Patent.class),
        @XmlElementRef(name = "sc", type = Sc.class),
        @XmlElementRef(name = "publisher-name", type = JAXBElement.class),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class),
        @XmlElementRef(name = "chapter-title", type = ChapterTitle.class),
        @XmlElementRef(name = "edition", type = Edition.class),
        @XmlElementRef(name = "conf-sponsor", type = ConfSponsor.class),
        @XmlElementRef(name = "year", type = Year.class),
        @XmlElementRef(name = "volume-id", type = VolumeId.class),
        @XmlElementRef(name = "email", type = Email.class),
        @XmlElementRef(name = "page-range", type = PageRange.class),
        @XmlElementRef(name = "supplement", type = Supplement.class),
        @XmlElementRef(name = "conf-loc", type = ConfLoc.class),
        @XmlElementRef(name = "fpage", type = Fpage.class),
        @XmlElementRef(name = "article-title", type = ArticleTitle.class),
        @XmlElementRef(name = "lpage", type = Lpage.class),
        @XmlElementRef(name = "std", type = Std.class),
        @XmlElementRef(name = "season", type = Season.class),
        @XmlElementRef(name = "italic", type = Italic.class),
        @XmlElementRef(name = "conf-name", type = ConfName.class),
        @XmlElementRef(name = "trans-title", type = TransTitle.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "link-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkType;
    @XmlAttribute(name = "source-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceId;
    @XmlAttribute(name = "source-id-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceIdType;
    @XmlAttribute(name = "source-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourceType;
    @XmlAttribute(name = "document-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentId;
    @XmlAttribute(name = "document-id-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentIdType;
    @XmlAttribute(name = "document-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String documentType;
    @XmlAttribute(name = "object-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String objectId;
    @XmlAttribute(name = "object-id-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String objectIdType;
    @XmlAttribute(name = "object-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String objectType;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueTitle }
     * {@link Comment }
     * {@link VolumeSeries }
     * {@link Size }
     * {@link Date }
     * {@link Month }
     * {@link NamedContent }
     * {@link Gov }
     * {@link ObjectId }
     * {@link String }
     * {@link Uri }
     * {@link PartTitle }
     * {@link StringName }
     * {@link Issn }
     * {@link Sub }
     * {@link Volume }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PublisherLoc }
     * {@link IssueId }
     * {@link PubId }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Isbn }
     * {@link Role }
     * {@link Collab }
     * {@link PersonGroup }
     * {@link ExtLink }
     * {@link Series }
     * {@link Issue }
     * {@link Annotation }
     * {@link Strike }
     * {@link TransSource }
     * {@link ConfDate }
     * {@link Name }
     * {@link Overline }
     * {@link ElocationId }
     * {@link Underline }
     * {@link Source }
     * {@link Monospace }
     * {@link Bold }
     * {@link Sup }
     * {@link DateInCitation }
     * {@link Day }
     * {@link Institution }
     * {@link StyledContent }
     * {@link Patent }
     * {@link Roman }
     * {@link Sc }
     * {@link SansSerif }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ChapterTitle }
     * {@link Edition }
     * {@link ConfSponsor }
     * {@link Year }
     * {@link VolumeId }
     * {@link Email }
     * {@link Supplement }
     * {@link PageRange }
     * {@link ConfLoc }
     * {@link Fpage }
     * {@link Lpage }
     * {@link ArticleTitle }
     * {@link Std }
     * {@link Season }
     * {@link ConfName }
     * {@link Italic }
     * {@link TransTitle }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdType() {
        return sourceIdType;
    }

    /**
     * Sets the value of the sourceIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdType(String value) {
        this.sourceIdType = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIdType() {
        return documentIdType;
    }

    /**
     * Sets the value of the documentIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIdType(String value) {
        this.documentIdType = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the objectIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdType() {
        return objectIdType;
    }

    /**
     * Sets the value of the objectIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdType(String value) {
        this.objectIdType = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}