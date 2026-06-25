package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialTimelineComponentItem$$serializer implements E {
    public static final PartialTimelineComponentItem$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialTimelineComponentItem$$serializer partialTimelineComponentItem$$serializer = new PartialTimelineComponentItem$$serializer();
        INSTANCE = partialTimelineComponentItem$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponentItem", partialTimelineComponentItem$$serializer, 2);
        c2337k0.g("visible", true);
        c2337k0.g("connector", true);
        descriptor = c2337k0;
    }

    private PartialTimelineComponentItem$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{a.p(C2330h.f20193a), a.p(TimelineComponent$Connector$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public PartialTimelineComponentItem deserialize(e decoder) {
        Boolean bool;
        TimelineComponent.Connector connector;
        int i10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            connector = (TimelineComponent.Connector) cVarB.B(descriptor2, 1, TimelineComponent$Connector$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            bool = null;
            TimelineComponent.Connector connector2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool);
                    i11 |= 1;
                } else {
                    if (i12 != 1) {
                        throw new m(i12);
                    }
                    connector2 = (TimelineComponent.Connector) cVarB.B(descriptor2, 1, TimelineComponent$Connector$$serializer.INSTANCE, connector2);
                    i11 |= 2;
                }
            }
            connector = connector2;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new PartialTimelineComponentItem(i10, bool, connector, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialTimelineComponentItem value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialTimelineComponentItem.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
