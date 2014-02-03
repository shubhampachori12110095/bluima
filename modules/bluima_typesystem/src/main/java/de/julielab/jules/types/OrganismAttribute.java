

/* First created by JCasGen Wed Oct 19 19:10:28 CEST 2011 */
package de.julielab.jules.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** attributes to an organism such as e.g. sex, developmental stage, transplantation type ...
 * Updated by JCasGen Mon Oct 21 13:03:30 CEST 2013
 * XML source: /Users/richarde/dev/bluebrain/svn_nlp/UIMA/blue_uima/trunk/modules/julielab_typesystem-2.6.8/src/main/resources/typeSystem/bbp-semantics-biology-types.xml
 * @generated */
public class OrganismAttribute extends BioEntityMention {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(OrganismAttribute.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected OrganismAttribute() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public OrganismAttribute(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public OrganismAttribute(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public OrganismAttribute(JCas jcas, int begin, int end) {
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

    