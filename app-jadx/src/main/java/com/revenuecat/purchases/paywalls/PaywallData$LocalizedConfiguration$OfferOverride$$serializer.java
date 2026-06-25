package com.revenuecat.purchases.paywalls;

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
import Vf.x0;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.OfferOverride.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallData$LocalizedConfiguration$OfferOverride$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$OfferOverride$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$OfferOverride$$serializer paywallData$LocalizedConfiguration$OfferOverride$$serializer = new PaywallData$LocalizedConfiguration$OfferOverride$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$OfferOverride$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride", paywallData$LocalizedConfiguration$OfferOverride$$serializer, 5);
        c2337k0.g("offer_name", false);
        c2337k0.g("offer_details", false);
        c2337k0.g("offer_details_with_intro_offer", true);
        c2337k0.g("offer_details_with_multiple_intro_offers", true);
        c2337k0.g("offer_badge", true);
        descriptor = c2337k0;
    }

    private PaywallData$LocalizedConfiguration$OfferOverride$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        b bVarP = a.p(emptyStringToNullSerializer);
        b bVarP2 = a.p(emptyStringToNullSerializer);
        b bVarP3 = a.p(emptyStringToNullSerializer);
        x0 x0Var = x0.f20253a;
        return new b[]{x0Var, x0Var, bVarP, bVarP2, bVarP3};
    }

    @Override // Rf.a
    public PaywallData.LocalizedConfiguration.OfferOverride deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            String str6 = (String) cVarB.B(descriptor2, 2, emptyStringToNullSerializer, null);
            str = strL2;
            str4 = (String) cVarB.B(descriptor2, 3, emptyStringToNullSerializer, null);
            str5 = (String) cVarB.B(descriptor2, 4, emptyStringToNullSerializer, null);
            str3 = str6;
            str2 = strL3;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String strL4 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    strL4 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else if (i12 == 2) {
                    str7 = (String) cVarB.B(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str7);
                    i11 |= 4;
                } else if (i12 == 3) {
                    str8 = (String) cVarB.B(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, str8);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    str9 = (String) cVarB.B(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = strL;
            str2 = strL4;
            str3 = str7;
            str4 = str8;
            str5 = str9;
        }
        cVarB.c(descriptor2);
        return new PaywallData.LocalizedConfiguration.OfferOverride(i10, str, str2, str3, str4, str5, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallData.LocalizedConfiguration.OfferOverride value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.LocalizedConfiguration.OfferOverride.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
