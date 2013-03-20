
/* First created by JCasGen Wed Mar 20 15:51:19 GMT 2013 */
package ac.uk.susx.tag;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Mar 20 15:51:19 GMT 2013
 * @generated */
public class PoSTag_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PoSTag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PoSTag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PoSTag(addr, PoSTag_Type.this);
  			   PoSTag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PoSTag(addr, PoSTag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PoSTag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("ac.uk.susx.tag.PoSTag");
 
  /** @generated */
  final Feature casFeat_postag;
  /** @generated */
  final int     casFeatCode_postag;
  /** @generated */ 
  public String getPostag(int addr) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "ac.uk.susx.tag.PoSTag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_postag);
  }
  /** @generated */    
  public void setPostag(int addr, String v) {
        if (featOkTst && casFeat_postag == null)
      jcas.throwFeatMissing("postag", "ac.uk.susx.tag.PoSTag");
    ll_cas.ll_setStringValue(addr, casFeatCode_postag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PoSTag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_postag = jcas.getRequiredFeatureDE(casType, "postag", "uima.cas.String", featOkTst);
    casFeatCode_postag  = (null == casFeat_postag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_postag).getCode();

  }
}



    