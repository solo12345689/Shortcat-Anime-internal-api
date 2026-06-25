package com.revenuecat.purchases.customercenter;

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
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$Support$$serializer implements E {
    public static final CustomerCenterConfigData$Support$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$Support$$serializer customerCenterConfigData$Support$$serializer = new CustomerCenterConfigData$Support$$serializer();
        INSTANCE = customerCenterConfigData$Support$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support", customerCenterConfigData$Support$$serializer, 4);
        c2337k0.g("email", true);
        c2337k0.g("should_warn_customer_to_update", true);
        c2337k0.g("display_virtual_currencies", true);
        c2337k0.g("support_tickets", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$Support$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(EmptyStringToNullSerializer.INSTANCE);
        C2330h c2330h = C2330h.f20193a;
        return new b[]{bVarP, a.p(c2330h), a.p(c2330h), CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.Support deserialize(e decoder) {
        int i10;
        String str;
        Boolean bool;
        Boolean bool2;
        CustomerCenterConfigData.Support.SupportTickets supportTickets;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String str2 = null;
        if (cVarB.p()) {
            String str3 = (String) cVarB.B(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, null);
            C2330h c2330h = C2330h.f20193a;
            Boolean bool3 = (Boolean) cVarB.B(descriptor2, 1, c2330h, null);
            Boolean bool4 = (Boolean) cVarB.B(descriptor2, 2, c2330h, null);
            str = str3;
            supportTickets = (CustomerCenterConfigData.Support.SupportTickets) cVarB.e(descriptor2, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, null);
            bool2 = bool4;
            bool = bool3;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Boolean bool5 = null;
            Boolean bool6 = null;
            CustomerCenterConfigData.Support.SupportTickets supportTickets2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    str2 = (String) cVarB.B(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, str2);
                    i11 |= 1;
                } else if (i12 == 1) {
                    bool5 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, bool5);
                    i11 |= 2;
                } else if (i12 == 2) {
                    bool6 = (Boolean) cVarB.B(descriptor2, 2, C2330h.f20193a, bool6);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    supportTickets2 = (CustomerCenterConfigData.Support.SupportTickets) cVarB.e(descriptor2, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, supportTickets2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = str2;
            bool = bool5;
            bool2 = bool6;
            supportTickets = supportTickets2;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.Support(i10, str, bool, bool2, supportTickets, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.Support value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.Support.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
