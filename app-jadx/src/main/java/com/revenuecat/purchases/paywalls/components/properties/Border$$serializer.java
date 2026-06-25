package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.C2350t;
import Vf.E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/Border.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/properties/Border;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class Border$$serializer implements E {
    public static final Border$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        Border$$serializer border$$serializer = new Border$$serializer();
        INSTANCE = border$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.properties.Border", border$$serializer, 2);
        c2337k0.g("color", false);
        c2337k0.g("width", false);
        descriptor = c2337k0;
    }

    private Border$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE, C2350t.f20233a};
    }

    @Override // Rf.a
    public Border deserialize(e decoder) {
        ColorScheme colorScheme;
        int i10;
        double dG;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            colorScheme = (ColorScheme) cVarB.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, null);
            i10 = 3;
            dG = cVarB.G(descriptor2, 1);
        } else {
            double dG2 = 0.0d;
            boolean z10 = true;
            colorScheme = null;
            i10 = 0;
            while (z10) {
                int i11 = cVarB.i(descriptor2);
                if (i11 == -1) {
                    z10 = false;
                } else if (i11 == 0) {
                    colorScheme = (ColorScheme) cVarB.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i10 |= 1;
                } else {
                    if (i11 != 1) {
                        throw new m(i11);
                    }
                    dG2 = cVarB.G(descriptor2, 1);
                    i10 |= 2;
                }
            }
            dG = dG2;
        }
        ColorScheme colorScheme2 = colorScheme;
        int i12 = i10;
        cVarB.c(descriptor2);
        return new Border(i12, colorScheme2, dG, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, Border value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        Border.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
