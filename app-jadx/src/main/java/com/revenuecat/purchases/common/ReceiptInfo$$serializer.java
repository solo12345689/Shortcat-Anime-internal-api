package com.revenuecat.purchases.common;

import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.C2350t;
import Vf.E;
import Vf.Q;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/ReceiptInfo.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/ReceiptInfo;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/ReceiptInfo;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ReceiptInfo$$serializer implements E {
    public static final ReceiptInfo$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        ReceiptInfo$$serializer receiptInfo$$serializer = new ReceiptInfo$$serializer();
        INSTANCE = receiptInfo$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.ReceiptInfo", receiptInfo$$serializer, 14);
        c2337k0.g("productIDs", false);
        c2337k0.g("purchaseTime", true);
        c2337k0.g("presentedOfferingContext", true);
        c2337k0.g(com.amazon.a.a.o.b.f34666x, true);
        c2337k0.g("formattedPrice", true);
        c2337k0.g(com.amazon.a.a.o.b.f34634a, true);
        c2337k0.g("period", true);
        c2337k0.g("pricingPhases", true);
        c2337k0.g("replacementMode", true);
        c2337k0.g("platformProductIds", true);
        c2337k0.g("sdkOriginated", true);
        c2337k0.g("storeUserID", true);
        c2337k0.g(com.amazon.a.a.o.b.f34655m, true);
        c2337k0.g("duration", true);
        descriptor = c2337k0;
    }

    private ReceiptInfo$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = ReceiptInfo.$childSerializers;
        Rf.b bVar = bVarArr[0];
        Rf.b bVarP = Sf.a.p(Q.f20164a);
        Rf.b bVarP2 = Sf.a.p(PresentedOfferingContextSerializer.INSTANCE);
        Rf.b bVarP3 = Sf.a.p(C2350t.f20233a);
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{bVar, bVarP, bVarP2, bVarP3, Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(PeriodSerializer.INSTANCE), Sf.a.p(bVarArr[7]), Sf.a.p(ReplacementModeSerializer.INSTANCE), bVarArr[9], C2330h.f20193a, Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(x0Var)};
    }

    @Override // Rf.a
    public ReceiptInfo deserialize(e decoder) {
        int i10;
        PresentedOfferingContext presentedOfferingContext;
        List list;
        Long l10;
        ReplacementMode replacementMode;
        List list2;
        String str;
        String str2;
        Period period;
        String str3;
        String str4;
        List list3;
        Double d10;
        String str5;
        boolean z10;
        Long l11;
        Long l12;
        Long l13;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = ReceiptInfo.$childSerializers;
        if (cVarB.p()) {
            List list4 = (List) cVarB.e(descriptor2, 0, bVarArr[0], null);
            Long l14 = (Long) cVarB.B(descriptor2, 1, Q.f20164a, null);
            presentedOfferingContext = (PresentedOfferingContext) cVarB.B(descriptor2, 2, PresentedOfferingContextSerializer.INSTANCE, null);
            Double d11 = (Double) cVarB.B(descriptor2, 3, C2350t.f20233a, null);
            x0 x0Var = x0.f20253a;
            String str6 = (String) cVarB.B(descriptor2, 4, x0Var, null);
            String str7 = (String) cVarB.B(descriptor2, 5, x0Var, null);
            Period period2 = (Period) cVarB.B(descriptor2, 6, PeriodSerializer.INSTANCE, null);
            List list5 = (List) cVarB.B(descriptor2, 7, bVarArr[7], null);
            ReplacementMode replacementMode2 = (ReplacementMode) cVarB.B(descriptor2, 8, ReplacementModeSerializer.INSTANCE, null);
            List list6 = (List) cVarB.e(descriptor2, 9, bVarArr[9], null);
            boolean zW = cVarB.w(descriptor2, 10);
            String str8 = (String) cVarB.B(descriptor2, 11, x0Var, null);
            String str9 = (String) cVarB.B(descriptor2, 12, x0Var, null);
            i10 = 16383;
            str5 = (String) cVarB.B(descriptor2, 13, x0Var, null);
            list = list4;
            l10 = l14;
            period = period2;
            list2 = list5;
            str = str7;
            d10 = d11;
            replacementMode = replacementMode2;
            str3 = str6;
            z10 = zW;
            str2 = str8;
            str4 = str9;
            list3 = list6;
        } else {
            int i11 = 1;
            int i12 = 0;
            boolean zW2 = false;
            String str10 = null;
            List list7 = null;
            Double d12 = null;
            Long l15 = null;
            ReplacementMode replacementMode3 = null;
            List list8 = null;
            String str11 = null;
            String str12 = null;
            Period period3 = null;
            String str13 = null;
            int i13 = 9;
            int i14 = 7;
            i10 = 0;
            presentedOfferingContext = null;
            String str14 = null;
            List list9 = null;
            while (i11 != 0) {
                List list10 = list7;
                int i15 = cVarB.i(descriptor2);
                switch (i15) {
                    case -1:
                        list7 = list10;
                        i11 = i12;
                        str10 = str10;
                        i14 = 7;
                        i13 = 9;
                        d12 = d12;
                        i12 = i11;
                        break;
                    case 0:
                        String str15 = str10;
                        Rf.b bVar = bVarArr[i12];
                        int i16 = i12;
                        list7 = (List) cVarB.e(descriptor2, i16, bVar, list10);
                        i10 |= 1;
                        i12 = i16;
                        d12 = d12;
                        str10 = str15;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 1:
                        l15 = (Long) cVarB.B(descriptor2, 1, Q.f20164a, l15);
                        i10 |= 2;
                        str10 = str10;
                        list7 = list10;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 2:
                        l12 = l15;
                        presentedOfferingContext = (PresentedOfferingContext) cVarB.B(descriptor2, 2, PresentedOfferingContextSerializer.INSTANCE, presentedOfferingContext);
                        i10 |= 4;
                        list7 = list10;
                        l15 = l12;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 3:
                        l12 = l15;
                        d12 = (Double) cVarB.B(descriptor2, 3, C2350t.f20233a, d12);
                        i10 |= 8;
                        list7 = list10;
                        l15 = l12;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 4:
                        l12 = l15;
                        str13 = (String) cVarB.B(descriptor2, 4, x0.f20253a, str13);
                        i10 |= 16;
                        list7 = list10;
                        l15 = l12;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 5:
                        l12 = l15;
                        str11 = (String) cVarB.B(descriptor2, 5, x0.f20253a, str11);
                        i10 |= 32;
                        list7 = list10;
                        l15 = l12;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 6:
                        l12 = l15;
                        period3 = (Period) cVarB.B(descriptor2, 6, PeriodSerializer.INSTANCE, period3);
                        i10 |= 64;
                        list7 = list10;
                        l15 = l12;
                        i14 = 7;
                        i13 = 9;
                        break;
                    case 7:
                        l13 = l15;
                        list8 = (List) cVarB.B(descriptor2, i14, bVarArr[i14], list8);
                        i10 |= 128;
                        list7 = list10;
                        l15 = l13;
                        i13 = 9;
                        break;
                    case 8:
                        l13 = l15;
                        replacementMode3 = (ReplacementMode) cVarB.B(descriptor2, 8, ReplacementModeSerializer.INSTANCE, replacementMode3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        list7 = list10;
                        l15 = l13;
                        i13 = 9;
                        break;
                    case 9:
                        l11 = l15;
                        list9 = (List) cVarB.e(descriptor2, i13, bVarArr[i13], list9);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        list7 = list10;
                        l15 = l11;
                        break;
                    case 10:
                        l11 = l15;
                        zW2 = cVarB.w(descriptor2, 10);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        list7 = list10;
                        l15 = l11;
                        break;
                    case 11:
                        l11 = l15;
                        str12 = (String) cVarB.B(descriptor2, 11, x0.f20253a, str12);
                        i10 |= 2048;
                        list7 = list10;
                        l15 = l11;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        l11 = l15;
                        str14 = (String) cVarB.B(descriptor2, 12, x0.f20253a, str14);
                        i10 |= 4096;
                        list7 = list10;
                        l15 = l11;
                        break;
                    case 13:
                        l11 = l15;
                        str10 = (String) cVarB.B(descriptor2, 13, x0.f20253a, str10);
                        i10 |= 8192;
                        list7 = list10;
                        l15 = l11;
                        break;
                    default:
                        throw new m(i15);
                }
            }
            list = list7;
            l10 = l15;
            replacementMode = replacementMode3;
            list2 = list8;
            str = str11;
            str2 = str12;
            period = period3;
            str3 = str13;
            str4 = str14;
            list3 = list9;
            d10 = d12;
            str5 = str10;
            z10 = zW2;
        }
        PresentedOfferingContext presentedOfferingContext2 = presentedOfferingContext;
        int i17 = i10;
        cVarB.c(descriptor2);
        return new ReceiptInfo(i17, list, l10, presentedOfferingContext2, d10, str3, str, period, list2, replacementMode, list3, z10, str2, str4, str5, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, ReceiptInfo value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ReceiptInfo.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
