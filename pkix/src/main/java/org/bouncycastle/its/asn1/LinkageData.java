package org.bouncycastle.its.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     LinkageData ::= SEQUENCE {
 *         iCert IValue,
 *         linkage-value LinkageValue,
 *         group-linkage-value GroupLinkageValue OPTIONAL
 *     }
 * </pre>
 */
public class LinkageData
    extends ASN1Object
{
    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        return new DERSequence(v);
    }
}
