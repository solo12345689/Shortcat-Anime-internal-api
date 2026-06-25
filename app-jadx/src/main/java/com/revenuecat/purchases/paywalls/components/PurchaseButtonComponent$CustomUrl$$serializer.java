package com.revenuecat.purchases.paywalls.components;

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
import Vf.x0;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PurchaseButtonComponent.CustomUrl.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PurchaseButtonComponent$CustomUrl$$serializer implements E {
    public static final PurchaseButtonComponent$CustomUrl$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PurchaseButtonComponent$CustomUrl$$serializer purchaseButtonComponent$CustomUrl$$serializer = new PurchaseButtonComponent$CustomUrl$$serializer();
        INSTANCE = purchaseButtonComponent$CustomUrl$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl", purchaseButtonComponent$CustomUrl$$serializer, 2);
        c2337k0.g("url_lid", false);
        c2337k0.g("package_param", true);
        descriptor = c2337k0;
    }

    private PurchaseButtonComponent$CustomUrl$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{LocalizationKey$$serializer.INSTANCE, a.p(x0.f20253a)};
    }

    @Override // Rf.a
    public PurchaseButtonComponent.CustomUrl deserialize(e decoder) {
        String strM349unboximpl;
        String str;
        int i10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            LocalizationKey localizationKey = (LocalizationKey) cVarB.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, null);
            strM349unboximpl = localizationKey != null ? localizationKey.m349unboximpl() : null;
            str = (String) cVarB.B(descriptor2, 1, x0.f20253a, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strM349unboximpl = null;
            String str2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    LocalizationKey localizationKey2 = (LocalizationKey) cVarB.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, strM349unboximpl != null ? LocalizationKey.m343boximpl(strM349unboximpl) : null);
                    strM349unboximpl = localizationKey2 != null ? localizationKey2.m349unboximpl() : null;
                    i11 |= 1;
                } else {
                    if (i12 != 1) {
                        throw new m(i12);
                    }
                    str2 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str2);
                    i11 |= 2;
                }
            }
            str = str2;
            i10 = i11;
        }
        String str3 = strM349unboximpl;
        cVarB.c(descriptor2);
        return new PurchaseButtonComponent.CustomUrl(i10, str3, str, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PurchaseButtonComponent.CustomUrl value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PurchaseButtonComponent.CustomUrl.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
