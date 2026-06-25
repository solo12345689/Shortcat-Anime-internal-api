package com.revenuecat.purchases.paywalls.components;

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
import Vf.t0;
import Vf.x0;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PackageComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PackageComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PackageComponent$$serializer implements E {
    public static final PackageComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PackageComponent$$serializer packageComponent$$serializer = new PackageComponent$$serializer();
        INSTANCE = packageComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("package", packageComponent$$serializer, 4);
        c2337k0.g("package_id", false);
        c2337k0.g("is_selected_by_default", false);
        c2337k0.g("stack", false);
        c2337k0.g("play_store_offer", true);
        descriptor = c2337k0;
    }

    private PackageComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{x0.f20253a, C2330h.f20193a, StackComponent$$serializer.INSTANCE, a.p(ResilientPromoOfferConfigSerializer.INSTANCE)};
    }

    @Override // Rf.a
    public PackageComponent deserialize(e decoder) {
        boolean z10;
        int i10;
        String str;
        StackComponent stackComponent;
        PromoOfferConfig promoOfferConfig;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            boolean zW = cVarB.w(descriptor2, 1);
            StackComponent stackComponent2 = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, null);
            str = strL;
            promoOfferConfig = (PromoOfferConfig) cVarB.B(descriptor2, 3, ResilientPromoOfferConfigSerializer.INSTANCE, null);
            stackComponent = stackComponent2;
            z10 = zW;
            i10 = 15;
        } else {
            boolean z11 = true;
            boolean zW2 = false;
            String strL2 = null;
            StackComponent stackComponent3 = null;
            PromoOfferConfig promoOfferConfig2 = null;
            int i11 = 0;
            while (z11) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z11 = false;
                } else if (i12 == 0) {
                    strL2 = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    zW2 = cVarB.w(descriptor2, 1);
                    i11 |= 2;
                } else if (i12 == 2) {
                    stackComponent3 = (StackComponent) cVarB.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    promoOfferConfig2 = (PromoOfferConfig) cVarB.B(descriptor2, 3, ResilientPromoOfferConfigSerializer.INSTANCE, promoOfferConfig2);
                    i11 |= 8;
                }
            }
            z10 = zW2;
            i10 = i11;
            str = strL2;
            stackComponent = stackComponent3;
            promoOfferConfig = promoOfferConfig2;
        }
        cVarB.c(descriptor2);
        return new PackageComponent(i10, str, z10, stackComponent, promoOfferConfig, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PackageComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PackageComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
