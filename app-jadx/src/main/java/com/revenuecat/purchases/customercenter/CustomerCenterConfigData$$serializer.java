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
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$$serializer implements E {
    public static final CustomerCenterConfigData$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$$serializer customerCenterConfigData$$serializer = new CustomerCenterConfigData$$serializer();
        INSTANCE = customerCenterConfigData$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData", customerCenterConfigData$$serializer, 5);
        c2337k0.g("screens", false);
        c2337k0.g("appearance", false);
        c2337k0.g("localization", false);
        c2337k0.g("support", false);
        c2337k0.g("last_published_app_version", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{ScreenMapSerializer.INSTANCE, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, CustomerCenterConfigData$Localization$$serializer.INSTANCE, CustomerCenterConfigData$Support$$serializer.INSTANCE, a.p(EmptyStringToNullSerializer.INSTANCE)};
    }

    @Override // Rf.a
    public CustomerCenterConfigData deserialize(e decoder) {
        int i10;
        Map map;
        CustomerCenterConfigData.Appearance appearance;
        CustomerCenterConfigData.Localization localization;
        CustomerCenterConfigData.Support support;
        String str;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Map map2 = null;
        if (cVarB.p()) {
            Map map3 = (Map) cVarB.e(descriptor2, 0, ScreenMapSerializer.INSTANCE, null);
            CustomerCenterConfigData.Appearance appearance2 = (CustomerCenterConfigData.Appearance) cVarB.e(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, null);
            CustomerCenterConfigData.Localization localization2 = (CustomerCenterConfigData.Localization) cVarB.e(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, null);
            map = map3;
            support = (CustomerCenterConfigData.Support) cVarB.e(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, null);
            str = (String) cVarB.B(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, null);
            localization = localization2;
            appearance = appearance2;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            CustomerCenterConfigData.Appearance appearance3 = null;
            CustomerCenterConfigData.Localization localization3 = null;
            CustomerCenterConfigData.Support support2 = null;
            String str2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    map2 = (Map) cVarB.e(descriptor2, 0, ScreenMapSerializer.INSTANCE, map2);
                    i11 |= 1;
                } else if (i12 == 1) {
                    appearance3 = (CustomerCenterConfigData.Appearance) cVarB.e(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, appearance3);
                    i11 |= 2;
                } else if (i12 == 2) {
                    localization3 = (CustomerCenterConfigData.Localization) cVarB.e(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, localization3);
                    i11 |= 4;
                } else if (i12 == 3) {
                    support2 = (CustomerCenterConfigData.Support) cVarB.e(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, support2);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    str2 = (String) cVarB.B(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            map = map2;
            appearance = appearance3;
            localization = localization3;
            support = support2;
            str = str2;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData(i10, map, appearance, localization, support, str, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
