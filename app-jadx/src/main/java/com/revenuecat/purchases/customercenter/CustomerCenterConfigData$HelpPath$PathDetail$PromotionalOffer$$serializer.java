package com.revenuecat.purchases.customercenter;

import Rf.m;
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
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer implements E {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer", customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer, 6);
        c2337k0.g("android_offer_id", false);
        c2337k0.g("eligible", false);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("subtitle", false);
        c2337k0.g("product_mapping", false);
        c2337k0.g("cross_product_promotions", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$childSerializers;
        Rf.b bVar = bVarArr[4];
        Rf.b bVar2 = bVarArr[5];
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, C2330h.f20193a, x0Var, x0Var, bVar, bVar2};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer deserialize(e decoder) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        Map map;
        Map map2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$childSerializers;
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            boolean zW = cVarB.w(descriptor2, 1);
            String strL2 = cVarB.l(descriptor2, 2);
            String strL3 = cVarB.l(descriptor2, 3);
            Map map3 = (Map) cVarB.e(descriptor2, 4, bVarArr[4], null);
            map2 = (Map) cVarB.e(descriptor2, 5, bVarArr[5], null);
            str = strL;
            str3 = strL3;
            str2 = strL2;
            i10 = 63;
            map = map3;
            z10 = zW;
        } else {
            boolean z11 = true;
            int i11 = 0;
            String strL4 = null;
            String strL5 = null;
            String strL6 = null;
            Map map4 = null;
            Map map5 = null;
            boolean zW2 = false;
            while (z11) {
                int i12 = cVarB.i(descriptor2);
                switch (i12) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        strL4 = cVarB.l(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        zW2 = cVarB.w(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        strL5 = cVarB.l(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        strL6 = cVarB.l(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        map4 = (Map) cVarB.e(descriptor2, 4, bVarArr[4], map4);
                        i11 |= 16;
                        break;
                    case 5:
                        map5 = (Map) cVarB.e(descriptor2, 5, bVarArr[5], map5);
                        i11 |= 32;
                        break;
                    default:
                        throw new m(i12);
                }
            }
            i10 = i11;
            z10 = zW2;
            str = strL4;
            str2 = strL5;
            str3 = strL6;
            map = map4;
            map2 = map5;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer(i10, str, z10, str2, str3, map, map2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
