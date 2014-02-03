

/* First created by JCasGen Wed Oct 19 19:10:28 CEST 2011 */
package de.julielab.jules.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Mark A. Mandel. Integrated Annotation of Biomedical Text: Creating the PennBioIE Corpus. March 2006. Text Mining, Ontologies and Natural Language Processing in Biomedicine.
 * Updated by JCasGen Mon Oct 21 13:03:30 CEST 2013
 * XML source: /Users/richarde/dev/bluebrain/svn_nlp/UIMA/blue_uima/trunk/modules/julielab_typesystem-2.6.8/src/main/resources/typeSystem/bbp-semantics-biology-types.xml
 * @generated */
public class PennBioIEPOSTag extends POSTag {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PennBioIEPOSTag.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected PennBioIEPOSTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PennBioIEPOSTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PennBioIEPOSTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PennBioIEPOSTag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    