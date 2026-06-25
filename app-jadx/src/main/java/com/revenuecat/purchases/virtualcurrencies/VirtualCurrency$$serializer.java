package com.revenuecat.purchases.virtualcurrencies;

import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/virtualcurrencies/VirtualCurrency.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class VirtualCurrency$$serializer implements E {
    public static final VirtualCurrency$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        VirtualCurrency$$serializer virtualCurrency$$serializer = new VirtualCurrency$$serializer();
        INSTANCE = virtualCurrency$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.virtualcurrencies.VirtualCurrency", virtualCurrency$$serializer, 4);
        c2337k0.g("balance", false);
        c2337k0.g("name", false);
        c2337k0.g("code", false);
        c2337k0.g(b.f34645c, true);
        descriptor = c2337k0;
    }

    private VirtualCurrency$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{J.f20144a, x0Var, x0Var, a.p(x0Var)};
    }

    @Override // Rf.a
    public VirtualCurrency deserialize(e decoder) {
        int iM;
        int i10;
        String str;
        String str2;
        String str3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            iM = cVarB.m(descriptor2, 0);
            String strL = cVarB.l(descriptor2, 1);
            String strL2 = cVarB.l(descriptor2, 2);
            str3 = (String) cVarB.B(descriptor2, 3, x0.f20253a, null);
            str2 = strL2;
            str = strL;
            i10 = 15;
        } else {
            boolean z10 = true;
            iM = 0;
            String strL3 = null;
            String strL4 = null;
            String str4 = null;
            int i11 = 0;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    iM = cVarB.m(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    strL3 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else if (i12 == 2) {
                    strL4 = cVarB.l(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    str4 = (String) cVarB.B(descriptor2, 3, x0.f20253a, str4);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strL3;
            str2 = strL4;
            str3 = str4;
        }
        int i13 = iM;
        cVarB.c(descriptor2);
        return new VirtualCurrency(i10, i13, str, str2, str3, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, VirtualCurrency value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        VirtualCurrency.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
