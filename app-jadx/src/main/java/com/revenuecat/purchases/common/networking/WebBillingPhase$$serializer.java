package com.revenuecat.purchases.common.networking;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/networking/WebBillingPhase.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class WebBillingPhase$$serializer implements E {
    public static final WebBillingPhase$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        WebBillingPhase$$serializer webBillingPhase$$serializer = new WebBillingPhase$$serializer();
        INSTANCE = webBillingPhase$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.networking.WebBillingPhase", webBillingPhase$$serializer, 3);
        c2337k0.g(b.f34666x, true);
        c2337k0.g("period_duration", true);
        c2337k0.g("cycle_count", true);
        descriptor = c2337k0;
    }

    private WebBillingPhase$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        return new Rf.b[]{a.p(WebBillingPrice$$serializer.INSTANCE), a.p(x0.f20253a), J.f20144a};
    }

    @Override // Rf.a
    public WebBillingPhase deserialize(e decoder) {
        int iM;
        int i10;
        WebBillingPrice webBillingPrice;
        String str;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            WebBillingPrice webBillingPrice2 = (WebBillingPrice) cVarB.B(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, null);
            String str2 = (String) cVarB.B(descriptor2, 1, x0.f20253a, null);
            webBillingPrice = webBillingPrice2;
            iM = cVarB.m(descriptor2, 2);
            str = str2;
            i10 = 7;
        } else {
            boolean z10 = true;
            int iM2 = 0;
            WebBillingPrice webBillingPrice3 = null;
            String str3 = null;
            int i11 = 0;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    webBillingPrice3 = (WebBillingPrice) cVarB.B(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPrice3);
                    i11 |= 1;
                } else if (i12 == 1) {
                    str3 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str3);
                    i11 |= 2;
                } else {
                    if (i12 != 2) {
                        throw new m(i12);
                    }
                    iM2 = cVarB.m(descriptor2, 2);
                    i11 |= 4;
                }
            }
            iM = iM2;
            i10 = i11;
            webBillingPrice = webBillingPrice3;
            str = str3;
        }
        cVarB.c(descriptor2);
        return new WebBillingPhase(i10, webBillingPrice, str, iM, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, WebBillingPhase value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        WebBillingPhase.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
