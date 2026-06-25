package com.revenuecat.purchases.paywalls;

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
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallData$LocalizedConfiguration$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("subtitle", true);
        c2337k0.g("call_to_action", false);
        c2337k0.g("call_to_action_with_intro_offer", true);
        c2337k0.g("call_to_action_with_multiple_intro_offers", true);
        c2337k0.g("offer_details", true);
        c2337k0.g("offer_details_with_intro_offer", true);
        c2337k0.g("offer_details_with_multiple_intro_offers", true);
        c2337k0.g("offer_name", true);
        c2337k0.g("features", true);
        c2337k0.g("tier_name", true);
        c2337k0.g("offer_overrides", true);
        descriptor = c2337k0;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        Rf.b bVarP = a.p(emptyStringToNullSerializer);
        Rf.b bVarP2 = a.p(emptyStringToNullSerializer);
        Rf.b bVarP3 = a.p(emptyStringToNullSerializer);
        Rf.b bVarP4 = a.p(emptyStringToNullSerializer);
        Rf.b bVarP5 = a.p(emptyStringToNullSerializer);
        Rf.b bVarP6 = a.p(emptyStringToNullSerializer);
        Rf.b bVarP7 = a.p(emptyStringToNullSerializer);
        Rf.b bVar = bVarArr[9];
        Rf.b bVarP8 = a.p(emptyStringToNullSerializer);
        Rf.b bVar2 = bVarArr[11];
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, bVarP, x0Var, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, bVarP7, bVar, bVarP8, bVar2};
    }

    @Override // Rf.a
    public PaywallData.LocalizedConfiguration deserialize(e decoder) {
        int i10;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Map map;
        String str8;
        String str9;
        String str10;
        Rf.b[] bVarArr;
        Rf.b[] bVarArr2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr3 = PaywallData.LocalizedConfiguration.$childSerializers;
        if (cVarB.p()) {
            String strL = cVarB.l(descriptor2, 0);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            String str11 = (String) cVarB.B(descriptor2, 1, emptyStringToNullSerializer, null);
            String strL2 = cVarB.l(descriptor2, 2);
            String str12 = (String) cVarB.B(descriptor2, 3, emptyStringToNullSerializer, null);
            String str13 = (String) cVarB.B(descriptor2, 4, emptyStringToNullSerializer, null);
            String str14 = (String) cVarB.B(descriptor2, 5, emptyStringToNullSerializer, null);
            String str15 = (String) cVarB.B(descriptor2, 6, emptyStringToNullSerializer, null);
            String str16 = (String) cVarB.B(descriptor2, 7, emptyStringToNullSerializer, null);
            String str17 = (String) cVarB.B(descriptor2, 8, emptyStringToNullSerializer, null);
            List list2 = (List) cVarB.e(descriptor2, 9, bVarArr3[9], null);
            String str18 = (String) cVarB.B(descriptor2, 10, emptyStringToNullSerializer, null);
            i10 = 4095;
            map = (Map) cVarB.e(descriptor2, 11, bVarArr3[11], null);
            str = strL;
            list = list2;
            str3 = str16;
            str6 = str15;
            str4 = str14;
            str8 = str12;
            str2 = str17;
            str7 = str13;
            str10 = strL2;
            str5 = str18;
            str9 = str11;
        } else {
            int i11 = 11;
            String strL3 = null;
            List list3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String strL4 = null;
            int i12 = 9;
            boolean z10 = true;
            Map map2 = null;
            String str25 = null;
            i10 = 0;
            String str26 = null;
            while (z10) {
                int i13 = i11;
                int i14 = cVarB.i(descriptor2);
                switch (i14) {
                    case -1:
                        bVarArr = bVarArr3;
                        z10 = false;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 0:
                        bVarArr = bVarArr3;
                        strL3 = cVarB.l(descriptor2, 0);
                        i10 |= 1;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 1:
                        bVarArr = bVarArr3;
                        str26 = (String) cVarB.B(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, str26);
                        i10 |= 2;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 2:
                        bVarArr = bVarArr3;
                        strL4 = cVarB.l(descriptor2, 2);
                        i10 |= 4;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 3:
                        bVarArr = bVarArr3;
                        str25 = (String) cVarB.B(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, str25);
                        i10 |= 8;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 4:
                        bVarArr = bVarArr3;
                        str24 = (String) cVarB.B(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str24);
                        i10 |= 16;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 5:
                        bVarArr = bVarArr3;
                        str21 = (String) cVarB.B(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, str21);
                        i10 |= 32;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 6:
                        bVarArr = bVarArr3;
                        str23 = (String) cVarB.B(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, str23);
                        i10 |= 64;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 7:
                        bVarArr = bVarArr3;
                        str20 = (String) cVarB.B(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, str20);
                        i10 |= 128;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 8:
                        bVarArr = bVarArr3;
                        str19 = (String) cVarB.B(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, str19);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        bVarArr3 = bVarArr;
                        i11 = 11;
                        i12 = 9;
                        break;
                    case 9:
                        bVarArr2 = bVarArr3;
                        list3 = (List) cVarB.e(descriptor2, i12, bVarArr2[i12], list3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        bVarArr3 = bVarArr2;
                        i11 = 11;
                        break;
                    case 10:
                        bVarArr2 = bVarArr3;
                        str22 = (String) cVarB.B(descriptor2, 10, EmptyStringToNullSerializer.INSTANCE, str22);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        bVarArr3 = bVarArr2;
                        i11 = 11;
                        break;
                    case 11:
                        map2 = (Map) cVarB.e(descriptor2, i13, bVarArr3[i13], map2);
                        i10 |= 2048;
                        i11 = i13;
                        bVarArr3 = bVarArr3;
                        break;
                    default:
                        throw new m(i14);
                }
            }
            str = strL3;
            list = list3;
            str2 = str19;
            str3 = str20;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            str7 = str24;
            map = map2;
            str8 = str25;
            str9 = str26;
            str10 = strL4;
        }
        int i15 = i10;
        cVarB.c(descriptor2);
        return new PaywallData.LocalizedConfiguration(i15, str, str9, str10, str8, str7, str4, str6, str3, str2, list, str5, map, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallData.LocalizedConfiguration value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
