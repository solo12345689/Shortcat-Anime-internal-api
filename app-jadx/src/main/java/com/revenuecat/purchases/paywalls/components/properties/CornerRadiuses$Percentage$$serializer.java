package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/CornerRadiuses.Percentage.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CornerRadiuses$Percentage$$serializer implements E {
    public static final CornerRadiuses$Percentage$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CornerRadiuses$Percentage$$serializer cornerRadiuses$Percentage$$serializer = new CornerRadiuses$Percentage$$serializer();
        INSTANCE = cornerRadiuses$Percentage$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage", cornerRadiuses$Percentage$$serializer, 4);
        c2337k0.g("top_leading", false);
        c2337k0.g("top_trailing", false);
        c2337k0.g("bottom_leading", false);
        c2337k0.g("bottom_trailing", false);
        descriptor = c2337k0;
    }

    private CornerRadiuses$Percentage$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        J j10 = J.f20144a;
        return new b[]{j10, j10, j10, j10};
    }

    @Override // Rf.a
    public CornerRadiuses.Percentage deserialize(e decoder) {
        int iM;
        int iM2;
        int i10;
        int i11;
        int i12;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            iM = cVarB.m(descriptor2, 0);
            int iM3 = cVarB.m(descriptor2, 1);
            int iM4 = cVarB.m(descriptor2, 2);
            iM2 = cVarB.m(descriptor2, 3);
            i10 = iM4;
            i11 = iM3;
            i12 = 15;
        } else {
            boolean z10 = true;
            iM = 0;
            int iM5 = 0;
            int iM6 = 0;
            int iM7 = 0;
            int i13 = 0;
            while (z10) {
                int i14 = cVarB.i(descriptor2);
                if (i14 == -1) {
                    z10 = false;
                } else if (i14 == 0) {
                    iM = cVarB.m(descriptor2, 0);
                    i13 |= 1;
                } else if (i14 == 1) {
                    iM7 = cVarB.m(descriptor2, 1);
                    i13 |= 2;
                } else if (i14 == 2) {
                    iM6 = cVarB.m(descriptor2, 2);
                    i13 |= 4;
                } else {
                    if (i14 != 3) {
                        throw new m(i14);
                    }
                    iM5 = cVarB.m(descriptor2, 3);
                    i13 |= 8;
                }
            }
            iM2 = iM5;
            i10 = iM6;
            i11 = iM7;
            i12 = i13;
        }
        int i15 = iM;
        cVarB.c(descriptor2);
        return new CornerRadiuses.Percentage(i12, i15, i11, i10, iM2, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CornerRadiuses.Percentage value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CornerRadiuses.Percentage.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
