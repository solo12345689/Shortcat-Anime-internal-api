package com.revenuecat.purchases;

import Uf.c;
import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "", "OFFERING_IDENTIFIER_INDEX", "I", "PLACEMENT_IDENTIFIER_INDEX", "TARGETING_CONTEXT_INDEX", "", "nullableStringSerializer", "LRf/b;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "nullableTargetingContextSerializer", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PresentedOfferingContextSerializer implements Rf.b {
    private static final int OFFERING_IDENTIFIER_INDEX = 0;
    private static final int PLACEMENT_IDENTIFIER_INDEX = 1;
    private static final int TARGETING_CONTEXT_INDEX = 2;
    public static final PresentedOfferingContextSerializer INSTANCE = new PresentedOfferingContextSerializer();
    private static final Rf.b nullableStringSerializer = Sf.a.p(Sf.a.F(U.f52264a));
    private static final Rf.b nullableTargetingContextSerializer = Sf.a.p(TargetingContextSerializer.INSTANCE);
    private static final Tf.e descriptor = Tf.k.c("PresentedOfferingContext", new Tf.e[0], PresentedOfferingContextSerializer$descriptor$1.INSTANCE);

    private PresentedOfferingContextSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public PresentedOfferingContext deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        String strL = "";
        String str = null;
        PresentedOfferingContext.TargetingContext targetingContext = null;
        while (true) {
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
            int i10 = cVarB.i(presentedOfferingContextSerializer.getDescriptor());
            if (i10 == -1) {
                PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(strL, str, targetingContext);
                cVarB.c(descriptor2);
                return presentedOfferingContext;
            }
            if (i10 == 0) {
                strL = cVarB.l(presentedOfferingContextSerializer.getDescriptor(), 0);
            } else if (i10 == 1) {
                str = (String) c.a.c(cVarB, presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, null, 8, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(("Unexpected index: " + i10).toString());
                }
                targetingContext = (PresentedOfferingContext.TargetingContext) c.a.c(cVarB, presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, null, 8, null);
            }
        }
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, PresentedOfferingContext value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
        dVarB.k(presentedOfferingContextSerializer.getDescriptor(), 0, value.getOfferingIdentifier());
        dVarB.m(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, value.getPlacementIdentifier());
        dVarB.m(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, value.getTargetingContext());
        dVarB.c(descriptor2);
    }
}
