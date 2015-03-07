
/* First created by JCasGen Sat Mar 07 22:05:57 CET 2015 */
package de.julielab.jules.types.ace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Sat Mar 07 22:05:57 CET 2015
 * @generated */
public class EventMentionArgument_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EventMentionArgument_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EventMentionArgument_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EventMentionArgument(addr, EventMentionArgument_Type.this);
  			   EventMentionArgument_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EventMentionArgument(addr, EventMentionArgument_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EventMentionArgument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.julielab.jules.types.ace.EventMentionArgument");
 
  /** @generated */
  final Feature casFeat_ace_role;
  /** @generated */
  final int     casFeatCode_ace_role;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAce_role(int addr) {
        if (featOkTst && casFeat_ace_role == null)
      jcas.throwFeatMissing("ace_role", "de.julielab.jules.types.ace.EventMentionArgument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ace_role);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAce_role(int addr, String v) {
        if (featOkTst && casFeat_ace_role == null)
      jcas.throwFeatMissing("ace_role", "de.julielab.jules.types.ace.EventMentionArgument");
    ll_cas.ll_setStringValue(addr, casFeatCode_ace_role, v);}
    
  
 
  /** @generated */
  final Feature casFeat_refid;
  /** @generated */
  final int     casFeatCode_refid;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRefid(int addr) {
        if (featOkTst && casFeat_refid == null)
      jcas.throwFeatMissing("refid", "de.julielab.jules.types.ace.EventMentionArgument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_refid);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRefid(int addr, String v) {
        if (featOkTst && casFeat_refid == null)
      jcas.throwFeatMissing("refid", "de.julielab.jules.types.ace.EventMentionArgument");
    ll_cas.ll_setStringValue(addr, casFeatCode_refid, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EventMentionArgument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ace_role = jcas.getRequiredFeatureDE(casType, "ace_role", "uima.cas.String", featOkTst);
    casFeatCode_ace_role  = (null == casFeat_ace_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ace_role).getCode();

 
    casFeat_refid = jcas.getRequiredFeatureDE(casType, "refid", "uima.cas.String", featOkTst);
    casFeatCode_refid  = (null == casFeat_refid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_refid).getCode();

  }
}



    