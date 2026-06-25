package com.revenuecat.purchases.customercenter;

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
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Screen.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$Screen$$serializer implements E {
    public static final CustomerCenterConfigData$Screen$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$Screen$$serializer customerCenterConfigData$Screen$$serializer = new CustomerCenterConfigData$Screen$$serializer();
        INSTANCE = customerCenterConfigData$Screen$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen", customerCenterConfigData$Screen$$serializer, 5);
        c2337k0.g("type", false);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("subtitle", true);
        c2337k0.g("paths", false);
        c2337k0.g("offering", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$Screen$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        return new Rf.b[]{CustomerCenterConfigData.Screen.$childSerializers[0], x0.f20253a, a.p(EmptyStringToNullSerializer.INSTANCE), HelpPathsSerializer.INSTANCE, a.p(CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.Screen deserialize(e decoder) {
        int i10;
        CustomerCenterConfigData.Screen.ScreenType screenType;
        String str;
        String str2;
        List list;
        CustomerCenterConfigData.ScreenOffering screenOffering;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = CustomerCenterConfigData.Screen.$childSerializers;
        int i11 = 0;
        CustomerCenterConfigData.Screen.ScreenType screenType2 = null;
        if (cVarB.p()) {
            CustomerCenterConfigData.Screen.ScreenType screenType3 = (CustomerCenterConfigData.Screen.ScreenType) cVarB.e(descriptor2, 0, bVarArr[0], null);
            String strL = cVarB.l(descriptor2, 1);
            String str3 = (String) cVarB.B(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, null);
            screenType = screenType3;
            str = strL;
            list = (List) cVarB.e(descriptor2, 3, HelpPathsSerializer.INSTANCE, null);
            screenOffering = (CustomerCenterConfigData.ScreenOffering) cVarB.B(descriptor2, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, null);
            str2 = str3;
            i10 = 31;
        } else {
            int i12 = 1;
            int i13 = 0;
            String strL2 = null;
            String str4 = null;
            List list2 = null;
            CustomerCenterConfigData.ScreenOffering screenOffering2 = null;
            while (i12 != 0) {
                int i14 = cVarB.i(descriptor2);
                int i15 = i11;
                if (i14 == -1) {
                    i11 = i15;
                    i12 = i11;
                } else if (i14 != 0) {
                    if (i14 == 1) {
                        strL2 = cVarB.l(descriptor2, 1);
                        i13 |= 2;
                    } else if (i14 == 2) {
                        str4 = (String) cVarB.B(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str4);
                        i13 |= 4;
                    } else if (i14 == 3) {
                        list2 = (List) cVarB.e(descriptor2, 3, HelpPathsSerializer.INSTANCE, list2);
                        i13 |= 8;
                    } else {
                        if (i14 != 4) {
                            throw new m(i14);
                        }
                        screenOffering2 = (CustomerCenterConfigData.ScreenOffering) cVarB.B(descriptor2, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, screenOffering2);
                        i13 |= 16;
                    }
                    i11 = i15;
                } else {
                    screenType2 = (CustomerCenterConfigData.Screen.ScreenType) cVarB.e(descriptor2, i15, bVarArr[i15], screenType2);
                    i13 |= 1;
                    i11 = i15;
                }
            }
            i10 = i13;
            screenType = screenType2;
            str = strL2;
            str2 = str4;
            list = list2;
            screenOffering = screenOffering2;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.Screen(i10, screenType, str, str2, list, screenOffering, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.Screen value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.Screen.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
