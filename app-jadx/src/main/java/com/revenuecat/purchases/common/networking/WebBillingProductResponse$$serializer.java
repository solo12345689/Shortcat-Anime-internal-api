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
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/networking/WebBillingProductResponse.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class WebBillingProductResponse$$serializer implements E {
    public static final WebBillingProductResponse$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        WebBillingProductResponse$$serializer webBillingProductResponse$$serializer = new WebBillingProductResponse$$serializer();
        INSTANCE = webBillingProductResponse$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.networking.WebBillingProductResponse", webBillingProductResponse$$serializer, 6);
        c2337k0.g("identifier", false);
        c2337k0.g(DiagnosticsTracker.PRODUCT_TYPE_KEY, false);
        c2337k0.g(b.f34626S, false);
        c2337k0.g(b.f34645c, true);
        c2337k0.g("default_purchase_option_id", true);
        c2337k0.g("purchase_options", false);
        descriptor = c2337k0;
    }

    private WebBillingProductResponse$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = WebBillingProductResponse.$childSerializers;
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, x0Var, x0Var, a.p(x0Var), a.p(x0Var), bVarArr[5]};
    }

    @Override // Rf.a
    public WebBillingProductResponse deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map map;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = WebBillingProductResponse.$childSerializers;
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            String strL4 = cVarB.l(descriptor2, 2);
            x0 x0Var = x0.f20253a;
            String str6 = (String) cVarB.B(descriptor2, 3, x0Var, null);
            String str7 = (String) cVarB.B(descriptor2, 4, x0Var, null);
            map = (Map) cVarB.e(descriptor2, 5, bVarArr[5], null);
            str = strL2;
            str4 = str6;
            str5 = str7;
            str3 = strL4;
            i10 = 63;
            str2 = strL3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strL5 = null;
            String strL6 = null;
            String str8 = null;
            String str9 = null;
            Map map2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                switch (i12) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strL = cVarB.l(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        strL5 = cVarB.l(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        strL6 = cVarB.l(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str8 = (String) cVarB.B(descriptor2, 3, x0.f20253a, str8);
                        i11 |= 8;
                        break;
                    case 4:
                        str9 = (String) cVarB.B(descriptor2, 4, x0.f20253a, str9);
                        i11 |= 16;
                        break;
                    case 5:
                        map2 = (Map) cVarB.e(descriptor2, 5, bVarArr[5], map2);
                        i11 |= 32;
                        break;
                    default:
                        throw new m(i12);
                }
            }
            i10 = i11;
            str = strL;
            str2 = strL5;
            str3 = strL6;
            str4 = str8;
            str5 = str9;
            map = map2;
        }
        cVarB.c(descriptor2);
        return new WebBillingProductResponse(i10, str, str2, str3, str4, str5, map, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, WebBillingProductResponse value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        WebBillingProductResponse.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
