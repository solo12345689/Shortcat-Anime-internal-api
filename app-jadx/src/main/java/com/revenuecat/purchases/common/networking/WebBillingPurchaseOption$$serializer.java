package com.revenuecat.purchases.common.networking;

import Rf.b;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/networking/WebBillingPurchaseOption.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class WebBillingPurchaseOption$$serializer implements E {
    public static final WebBillingPurchaseOption$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        WebBillingPurchaseOption$$serializer webBillingPurchaseOption$$serializer = new WebBillingPurchaseOption$$serializer();
        INSTANCE = webBillingPurchaseOption$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.networking.WebBillingPurchaseOption", webBillingPurchaseOption$$serializer, 4);
        c2337k0.g("base_price", true);
        c2337k0.g("base", true);
        c2337k0.g("trial", true);
        c2337k0.g("intro_price", true);
        descriptor = c2337k0;
    }

    private WebBillingPurchaseOption$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(WebBillingPrice$$serializer.INSTANCE);
        WebBillingPhase$$serializer webBillingPhase$$serializer = WebBillingPhase$$serializer.INSTANCE;
        return new b[]{bVarP, a.p(webBillingPhase$$serializer), a.p(webBillingPhase$$serializer), a.p(webBillingPhase$$serializer)};
    }

    @Override // Rf.a
    public WebBillingPurchaseOption deserialize(e decoder) {
        int i10;
        WebBillingPrice webBillingPrice;
        WebBillingPhase webBillingPhase;
        WebBillingPhase webBillingPhase2;
        WebBillingPhase webBillingPhase3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        WebBillingPrice webBillingPrice2 = null;
        if (cVarB.p()) {
            WebBillingPrice webBillingPrice3 = (WebBillingPrice) cVarB.B(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, null);
            WebBillingPhase$$serializer webBillingPhase$$serializer = WebBillingPhase$$serializer.INSTANCE;
            WebBillingPhase webBillingPhase4 = (WebBillingPhase) cVarB.B(descriptor2, 1, webBillingPhase$$serializer, null);
            WebBillingPhase webBillingPhase5 = (WebBillingPhase) cVarB.B(descriptor2, 2, webBillingPhase$$serializer, null);
            webBillingPrice = webBillingPrice3;
            webBillingPhase3 = (WebBillingPhase) cVarB.B(descriptor2, 3, webBillingPhase$$serializer, null);
            webBillingPhase2 = webBillingPhase5;
            webBillingPhase = webBillingPhase4;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            WebBillingPhase webBillingPhase6 = null;
            WebBillingPhase webBillingPhase7 = null;
            WebBillingPhase webBillingPhase8 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    webBillingPrice2 = (WebBillingPrice) cVarB.B(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPrice2);
                    i11 |= 1;
                } else if (i12 == 1) {
                    webBillingPhase6 = (WebBillingPhase) cVarB.B(descriptor2, 1, WebBillingPhase$$serializer.INSTANCE, webBillingPhase6);
                    i11 |= 2;
                } else if (i12 == 2) {
                    webBillingPhase7 = (WebBillingPhase) cVarB.B(descriptor2, 2, WebBillingPhase$$serializer.INSTANCE, webBillingPhase7);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    webBillingPhase8 = (WebBillingPhase) cVarB.B(descriptor2, 3, WebBillingPhase$$serializer.INSTANCE, webBillingPhase8);
                    i11 |= 8;
                }
            }
            i10 = i11;
            webBillingPrice = webBillingPrice2;
            webBillingPhase = webBillingPhase6;
            webBillingPhase2 = webBillingPhase7;
            webBillingPhase3 = webBillingPhase8;
        }
        cVarB.c(descriptor2);
        return new WebBillingPurchaseOption(i10, webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, WebBillingPurchaseOption value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        WebBillingPurchaseOption.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
