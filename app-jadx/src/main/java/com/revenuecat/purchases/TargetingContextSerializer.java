package com.revenuecat.purchases;

import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/TargetingContextSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "", "REVISION_INDEX", "I", "RULE_ID_INDEX", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TargetingContextSerializer implements Rf.b {
    private static final int REVISION_INDEX = 0;
    private static final int RULE_ID_INDEX = 1;
    public static final TargetingContextSerializer INSTANCE = new TargetingContextSerializer();
    private static final Tf.e descriptor = Tf.k.c("TargetingContext", new Tf.e[0], TargetingContextSerializer$descriptor$1.INSTANCE);

    private TargetingContextSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public PresentedOfferingContext.TargetingContext deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        String strL = "";
        int iM = 0;
        while (true) {
            TargetingContextSerializer targetingContextSerializer = INSTANCE;
            int i10 = cVarB.i(targetingContextSerializer.getDescriptor());
            if (i10 == -1) {
                PresentedOfferingContext.TargetingContext targetingContext = new PresentedOfferingContext.TargetingContext(iM, strL);
                cVarB.c(descriptor2);
                return targetingContext;
            }
            if (i10 == 0) {
                iM = cVarB.m(targetingContextSerializer.getDescriptor(), 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException(("Unexpected index: " + i10).toString());
                }
                strL = cVarB.l(targetingContextSerializer.getDescriptor(), 1);
            }
        }
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, PresentedOfferingContext.TargetingContext value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        TargetingContextSerializer targetingContextSerializer = INSTANCE;
        dVarB.p(targetingContextSerializer.getDescriptor(), 0, value.getRevision());
        dVarB.k(targetingContextSerializer.getDescriptor(), 1, value.getRuleId());
        dVarB.c(descriptor2);
    }
}
