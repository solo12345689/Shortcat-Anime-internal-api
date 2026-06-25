package com.revenuecat.purchases.paywalls;

import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.Feature.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("content", true);
        c2337k0.g("icon_id", true);
        descriptor = c2337k0;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, a.p(x0Var), a.p(x0Var)};
    }

    @Override // Rf.a
    public PaywallData.LocalizedConfiguration.Feature deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            x0 x0Var = x0.f20253a;
            String str4 = (String) cVarB.B(descriptor2, 1, x0Var, null);
            str = strL2;
            str3 = (String) cVarB.B(descriptor2, 2, x0Var, null);
            str2 = str4;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str5 = null;
            String str6 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    str5 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str5);
                    i11 |= 2;
                } else {
                    if (i12 != 2) {
                        throw new m(i12);
                    }
                    str6 = (String) cVarB.B(descriptor2, 2, x0.f20253a, str6);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = strL;
            str2 = str5;
            str3 = str6;
        }
        cVarB.c(descriptor2);
        return new PaywallData.LocalizedConfiguration.Feature(i10, str, str2, str3, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallData.LocalizedConfiguration.Feature value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
