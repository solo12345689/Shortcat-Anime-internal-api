package com.revenuecat.purchases.customercenter;

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
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Appearance.ColorInformation.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$Appearance$ColorInformation$$serializer implements E {
    public static final CustomerCenterConfigData$Appearance$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = new CustomerCenterConfigData$Appearance$ColorInformation$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$ColorInformation$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation", customerCenterConfigData$Appearance$ColorInformation$$serializer, 5);
        c2337k0.g("accent_color", true);
        c2337k0.g("text_color", true);
        c2337k0.g("background_color", true);
        c2337k0.g("button_text_color", true);
        c2337k0.g("button_background_color", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$Appearance$ColorInformation$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer)};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.Appearance.ColorInformation deserialize(e decoder) {
        int i10;
        PaywallColor paywallColor;
        PaywallColor paywallColor2;
        PaywallColor paywallColor3;
        PaywallColor paywallColor4;
        PaywallColor paywallColor5;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        PaywallColor paywallColor6 = null;
        if (cVarB.p()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            PaywallColor paywallColor7 = (PaywallColor) cVarB.B(descriptor2, 0, serializer, null);
            PaywallColor paywallColor8 = (PaywallColor) cVarB.B(descriptor2, 1, serializer, null);
            PaywallColor paywallColor9 = (PaywallColor) cVarB.B(descriptor2, 2, serializer, null);
            PaywallColor paywallColor10 = (PaywallColor) cVarB.B(descriptor2, 3, serializer, null);
            paywallColor5 = (PaywallColor) cVarB.B(descriptor2, 4, serializer, null);
            paywallColor4 = paywallColor10;
            i10 = 31;
            paywallColor3 = paywallColor9;
            paywallColor2 = paywallColor8;
            paywallColor = paywallColor7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            PaywallColor paywallColor11 = null;
            PaywallColor paywallColor12 = null;
            PaywallColor paywallColor13 = null;
            PaywallColor paywallColor14 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    paywallColor6 = (PaywallColor) cVarB.B(descriptor2, 0, PaywallColor.Serializer.INSTANCE, paywallColor6);
                    i11 |= 1;
                } else if (i12 == 1) {
                    paywallColor11 = (PaywallColor) cVarB.B(descriptor2, 1, PaywallColor.Serializer.INSTANCE, paywallColor11);
                    i11 |= 2;
                } else if (i12 == 2) {
                    paywallColor12 = (PaywallColor) cVarB.B(descriptor2, 2, PaywallColor.Serializer.INSTANCE, paywallColor12);
                    i11 |= 4;
                } else if (i12 == 3) {
                    paywallColor13 = (PaywallColor) cVarB.B(descriptor2, 3, PaywallColor.Serializer.INSTANCE, paywallColor13);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    paywallColor14 = (PaywallColor) cVarB.B(descriptor2, 4, PaywallColor.Serializer.INSTANCE, paywallColor14);
                    i11 |= 16;
                }
            }
            i10 = i11;
            paywallColor = paywallColor6;
            paywallColor2 = paywallColor11;
            paywallColor3 = paywallColor12;
            paywallColor4 = paywallColor13;
            paywallColor5 = paywallColor14;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.Appearance.ColorInformation(i10, paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.Appearance.ColorInformation value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.Appearance.ColorInformation.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
