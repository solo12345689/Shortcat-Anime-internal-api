package com.revenuecat.purchases.paywalls.events;

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
import Vf.J;
import Vf.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallPostReceiptData.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallPostReceiptData$$serializer implements E {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 7);
        c2337k0.g("paywall_id", false);
        c2337k0.g("session_id", false);
        c2337k0.g("revision", false);
        c2337k0.g("display_mode", false);
        c2337k0.g("dark_mode", false);
        c2337k0.g("locale", false);
        c2337k0.g("offering_id", false);
        descriptor = c2337k0;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new b[]{a.p(x0Var), x0Var, J.f20144a, x0Var, C2330h.f20193a, x0Var, x0Var};
    }

    @Override // Rf.a
    public PaywallPostReceiptData deserialize(e decoder) {
        boolean z10;
        int i10;
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String strL;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i12 = 6;
        if (cVarB.p()) {
            String str5 = (String) cVarB.B(descriptor2, 0, x0.f20253a, null);
            String strL2 = cVarB.l(descriptor2, 1);
            int iM = cVarB.m(descriptor2, 2);
            String strL3 = cVarB.l(descriptor2, 3);
            boolean zW = cVarB.w(descriptor2, 4);
            String strL4 = cVarB.l(descriptor2, 5);
            str = str5;
            strL = cVarB.l(descriptor2, 6);
            str4 = strL4;
            str3 = strL3;
            z10 = zW;
            i10 = iM;
            str2 = strL2;
            i11 = 127;
        } else {
            boolean z11 = true;
            boolean zW2 = false;
            int i13 = 0;
            String str6 = null;
            String strL5 = null;
            String strL6 = null;
            String strL7 = null;
            String strL8 = null;
            int iM2 = 0;
            while (z11) {
                int i14 = cVarB.i(descriptor2);
                switch (i14) {
                    case -1:
                        z11 = false;
                        i12 = 6;
                        break;
                    case 0:
                        str6 = (String) cVarB.B(descriptor2, 0, x0.f20253a, str6);
                        i13 |= 1;
                        i12 = 6;
                        break;
                    case 1:
                        strL5 = cVarB.l(descriptor2, 1);
                        i13 |= 2;
                        break;
                    case 2:
                        iM2 = cVarB.m(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        strL6 = cVarB.l(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        zW2 = cVarB.w(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        strL7 = cVarB.l(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        strL8 = cVarB.l(descriptor2, i12);
                        i13 |= 64;
                        break;
                    default:
                        throw new m(i14);
                }
            }
            z10 = zW2;
            i10 = iM2;
            i11 = i13;
            str = str6;
            str2 = strL5;
            str3 = strL6;
            str4 = strL7;
            strL = strL8;
        }
        cVarB.c(descriptor2);
        return new PaywallPostReceiptData(i11, str, str2, i10, str3, z10, str4, strL, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallPostReceiptData value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallPostReceiptData.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
