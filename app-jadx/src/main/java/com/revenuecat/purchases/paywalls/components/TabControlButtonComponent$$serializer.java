package com.revenuecat.purchases.paywalls.components;

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
import Vf.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabControlButtonComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TabControlButtonComponent$$serializer implements E {
    public static final TabControlButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TabControlButtonComponent$$serializer tabControlButtonComponent$$serializer = new TabControlButtonComponent$$serializer();
        INSTANCE = tabControlButtonComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("tab_control_button", tabControlButtonComponent$$serializer, 3);
        c2337k0.g("tab_index", false);
        c2337k0.g("tab_id", false);
        c2337k0.g("stack", false);
        descriptor = c2337k0;
    }

    private TabControlButtonComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{J.f20144a, x0.f20253a, StackComponent$$serializer.INSTANCE};
    }

    @Override // Rf.a
    public TabControlButtonComponent deserialize(e decoder) {
        int iM;
        int i10;
        String str;
        StackComponent stackComponent;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            iM = cVarB.m(descriptor2, 0);
            String strL = cVarB.l(descriptor2, 1);
            stackComponent = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, null);
            str = strL;
            i10 = 7;
        } else {
            boolean z10 = true;
            iM = 0;
            String strL2 = null;
            StackComponent stackComponent2 = null;
            int i11 = 0;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    iM = cVarB.m(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    strL2 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (i12 != 2) {
                        throw new m(i12);
                    }
                    stackComponent2 = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strL2;
            stackComponent = stackComponent2;
        }
        int i13 = iM;
        cVarB.c(descriptor2);
        return new TabControlButtonComponent(i10, i13, str, stackComponent, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TabControlButtonComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TabControlButtonComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
