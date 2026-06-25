package com.revenuecat.purchases.customercenter;

import Rf.b;
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
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer implements E {
    public static final CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer = new CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerDetails", customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer, 14);
        c2337k0.g("active_entitlements", true);
        c2337k0.g("app_user_id", true);
        c2337k0.g("att_consent", true);
        c2337k0.g("country", true);
        c2337k0.g("device_version", true);
        c2337k0.g("email", true);
        c2337k0.g("facebook_anon_id", true);
        c2337k0.g("idfa", true);
        c2337k0.g("idfv", true);
        c2337k0.g("ip", true);
        c2337k0.g("last_opened", true);
        c2337k0.g("last_seen_app_version", true);
        c2337k0.g("total_spent", true);
        c2337k0.g("user_since", true);
        descriptor = c2337k0;
    }

    private CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        C2330h c2330h = C2330h.f20193a;
        return new b[]{c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h, c2330h};
    }

    @Override // Rf.a
    public CustomerCenterConfigData.Support.SupportTickets.CustomerDetails deserialize(e decoder) {
        int i10;
        boolean z10;
        boolean z11;
        boolean zW;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean zW2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 0;
        if (cVarB.p()) {
            boolean zW3 = cVarB.w(descriptor2, 0);
            boolean zW4 = cVarB.w(descriptor2, 1);
            boolean zW5 = cVarB.w(descriptor2, 2);
            boolean zW6 = cVarB.w(descriptor2, 3);
            boolean zW7 = cVarB.w(descriptor2, 4);
            boolean zW8 = cVarB.w(descriptor2, 5);
            boolean zW9 = cVarB.w(descriptor2, 6);
            boolean zW10 = cVarB.w(descriptor2, 7);
            boolean zW11 = cVarB.w(descriptor2, 8);
            boolean zW12 = cVarB.w(descriptor2, 9);
            boolean zW13 = cVarB.w(descriptor2, 10);
            boolean zW14 = cVarB.w(descriptor2, 11);
            z10 = zW3;
            z11 = zW4;
            zW = cVarB.w(descriptor2, 12);
            z12 = zW14;
            z13 = zW13;
            z14 = zW12;
            z15 = zW10;
            z16 = zW9;
            z17 = zW8;
            z18 = zW6;
            z19 = zW11;
            z20 = zW7;
            z21 = zW5;
            zW2 = cVarB.w(descriptor2, 13);
            i10 = 16383;
        } else {
            int i12 = 13;
            boolean zW15 = false;
            boolean zW16 = false;
            boolean zW17 = false;
            boolean zW18 = false;
            boolean zW19 = false;
            boolean zW20 = false;
            boolean zW21 = false;
            boolean zW22 = false;
            boolean zW23 = false;
            boolean zW24 = false;
            boolean zW25 = false;
            boolean zW26 = false;
            boolean zW27 = false;
            boolean zW28 = false;
            boolean z22 = true;
            while (z22) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z22 = false;
                        i12 = 13;
                        break;
                    case 0:
                        zW15 = cVarB.w(descriptor2, 0);
                        i11 |= 1;
                        i12 = 13;
                        break;
                    case 1:
                        zW16 = cVarB.w(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        zW27 = cVarB.w(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        zW24 = cVarB.w(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        zW26 = cVarB.w(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        zW23 = cVarB.w(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        zW22 = cVarB.w(descriptor2, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        zW21 = cVarB.w(descriptor2, 7);
                        i11 |= 128;
                        break;
                    case 8:
                        zW25 = cVarB.w(descriptor2, 8);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        zW20 = cVarB.w(descriptor2, 9);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        zW19 = cVarB.w(descriptor2, 10);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    case 11:
                        zW18 = cVarB.w(descriptor2, 11);
                        i11 |= 2048;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        zW17 = cVarB.w(descriptor2, 12);
                        i11 |= 4096;
                        break;
                    case 13:
                        zW28 = cVarB.w(descriptor2, i12);
                        i11 |= 8192;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i11;
            z10 = zW15;
            z11 = zW16;
            zW = zW17;
            z12 = zW18;
            z13 = zW19;
            z14 = zW20;
            z15 = zW21;
            z16 = zW22;
            z17 = zW23;
            z18 = zW24;
            z19 = zW25;
            z20 = zW26;
            z21 = zW27;
            zW2 = zW28;
        }
        cVarB.c(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(i10, z10, z11, z21, z18, z20, z17, z16, z15, z19, z14, z13, z12, zW, zW2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CustomerCenterConfigData.Support.SupportTickets.CustomerDetails value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
