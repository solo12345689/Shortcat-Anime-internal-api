package com.revenuecat.purchases.common.responses;

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
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/responses/SubscriptionInfoResponse.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class SubscriptionInfoResponse$$serializer implements E {
    public static final SubscriptionInfoResponse$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        SubscriptionInfoResponse$$serializer subscriptionInfoResponse$$serializer = new SubscriptionInfoResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse", subscriptionInfoResponse$$serializer, 17);
        c2337k0.g("purchase_date", false);
        c2337k0.g("original_purchase_date", true);
        c2337k0.g("expires_date", true);
        c2337k0.g(ProductResponseJsonKeys.STORE, false);
        c2337k0.g(ProductResponseJsonKeys.IS_SANDBOX, false);
        c2337k0.g(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, true);
        c2337k0.g(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, true);
        c2337k0.g("grace_period_expires_date", true);
        c2337k0.g(ProductResponseJsonKeys.OWNERSHIP_TYPE, true);
        c2337k0.g(ProductResponseJsonKeys.PERIOD_TYPE, false);
        c2337k0.g("refunded_at", true);
        c2337k0.g("store_transaction_id", true);
        c2337k0.g("auto_resume_date", true);
        c2337k0.g("display_name", true);
        c2337k0.g(b.f34666x, true);
        c2337k0.g("product_plan_identifier", true);
        c2337k0.g("management_url", true);
        descriptor = c2337k0;
    }

    private SubscriptionInfoResponse$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = SubscriptionInfoResponse.$childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        Rf.b bVarP = a.p(iSO8601DateSerializer);
        Rf.b bVarP2 = a.p(iSO8601DateSerializer);
        Rf.b bVarP3 = a.p(iSO8601DateSerializer);
        Rf.b bVarP4 = a.p(iSO8601DateSerializer);
        Rf.b bVarP5 = a.p(iSO8601DateSerializer);
        Rf.b bVar = bVarArr[8];
        Rf.b bVar2 = bVarArr[9];
        Rf.b bVarP6 = a.p(iSO8601DateSerializer);
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{iSO8601DateSerializer, bVarP, bVarP2, StoreSerializer.INSTANCE, C2330h.f20193a, bVarP3, bVarP4, bVarP5, bVar, bVar2, bVarP6, a.p(x0Var), a.p(iSO8601DateSerializer), a.p(x0Var), a.p(SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE), a.p(x0Var), a.p(x0Var)};
    }

    @Override // Rf.a
    public SubscriptionInfoResponse deserialize(e decoder) {
        int i10;
        Date date;
        String str;
        Store store;
        String str2;
        String str3;
        Date date2;
        PeriodType periodType;
        OwnershipType ownershipType;
        Date date3;
        Date date4;
        Date date5;
        Date date6;
        Date date7;
        Date date8;
        SubscriptionInfoResponse.PriceResponse priceResponse;
        String str4;
        boolean z10;
        Date date9;
        int i11;
        String str5;
        SubscriptionInfoResponse.PriceResponse priceResponse2;
        Date date10;
        String str6;
        Date date11;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = SubscriptionInfoResponse.$childSerializers;
        if (cVarB.p()) {
            ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
            Date date12 = (Date) cVarB.e(descriptor2, 0, iSO8601DateSerializer, null);
            Date date13 = (Date) cVarB.B(descriptor2, 1, iSO8601DateSerializer, null);
            Date date14 = (Date) cVarB.B(descriptor2, 2, iSO8601DateSerializer, null);
            Store store2 = (Store) cVarB.e(descriptor2, 3, StoreSerializer.INSTANCE, null);
            boolean zW = cVarB.w(descriptor2, 4);
            Date date15 = (Date) cVarB.B(descriptor2, 5, iSO8601DateSerializer, null);
            Date date16 = (Date) cVarB.B(descriptor2, 6, iSO8601DateSerializer, null);
            Date date17 = (Date) cVarB.B(descriptor2, 7, iSO8601DateSerializer, null);
            OwnershipType ownershipType2 = (OwnershipType) cVarB.e(descriptor2, 8, bVarArr[8], null);
            PeriodType periodType2 = (PeriodType) cVarB.e(descriptor2, 9, bVarArr[9], null);
            Date date18 = (Date) cVarB.B(descriptor2, 10, iSO8601DateSerializer, null);
            x0 x0Var = x0.f20253a;
            String str7 = (String) cVarB.B(descriptor2, 11, x0Var, null);
            Date date19 = (Date) cVarB.B(descriptor2, 12, iSO8601DateSerializer, null);
            String str8 = (String) cVarB.B(descriptor2, 13, x0Var, null);
            SubscriptionInfoResponse.PriceResponse priceResponse3 = (SubscriptionInfoResponse.PriceResponse) cVarB.B(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, null);
            String str9 = (String) cVarB.B(descriptor2, 15, x0Var, null);
            i10 = 131071;
            str2 = (String) cVarB.B(descriptor2, 16, x0Var, null);
            str3 = str9;
            date2 = date18;
            ownershipType = ownershipType2;
            date6 = date13;
            date = date12;
            store = store2;
            date5 = date17;
            date3 = date16;
            date4 = date15;
            z10 = zW;
            date7 = date14;
            priceResponse = priceResponse3;
            date8 = date19;
            str4 = str8;
            str = str7;
            periodType = periodType2;
        } else {
            int i12 = 9;
            int i13 = 8;
            boolean z11 = true;
            boolean zW2 = false;
            String str10 = null;
            SubscriptionInfoResponse.PriceResponse priceResponse4 = null;
            Date date20 = null;
            String str11 = null;
            Store store3 = null;
            String str12 = null;
            Date date21 = null;
            PeriodType periodType3 = null;
            OwnershipType ownershipType3 = null;
            Date date22 = null;
            Date date23 = null;
            Date date24 = null;
            Date date25 = null;
            Date date26 = null;
            Date date27 = null;
            i10 = 0;
            String str13 = null;
            while (z11) {
                Store store4 = store3;
                int i14 = cVarB.i(descriptor2);
                switch (i14) {
                    case -1:
                        store3 = store4;
                        z11 = false;
                        date20 = date20;
                        priceResponse4 = priceResponse4;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 0:
                        str5 = str10;
                        priceResponse2 = priceResponse4;
                        date10 = date20;
                        store3 = store4;
                        date25 = (Date) cVarB.e(descriptor2, 0, ISO8601DateSerializer.INSTANCE, date25);
                        i10 |= 1;
                        date26 = date26;
                        date20 = date10;
                        priceResponse4 = priceResponse2;
                        str10 = str5;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 1:
                        str5 = str10;
                        priceResponse2 = priceResponse4;
                        date10 = date20;
                        store3 = store4;
                        date26 = (Date) cVarB.B(descriptor2, 1, ISO8601DateSerializer.INSTANCE, date26);
                        i10 |= 2;
                        date27 = date27;
                        date20 = date10;
                        priceResponse4 = priceResponse2;
                        str10 = str5;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 2:
                        str5 = str10;
                        priceResponse2 = priceResponse4;
                        store3 = store4;
                        date10 = date20;
                        date27 = (Date) cVarB.B(descriptor2, 2, ISO8601DateSerializer.INSTANCE, date27);
                        i10 |= 4;
                        date20 = date10;
                        priceResponse4 = priceResponse2;
                        str10 = str5;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 3:
                        str5 = str10;
                        priceResponse2 = priceResponse4;
                        store3 = (Store) cVarB.e(descriptor2, 3, StoreSerializer.INSTANCE, store4);
                        i10 |= 8;
                        priceResponse4 = priceResponse2;
                        str10 = str5;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 4:
                        str6 = str10;
                        zW2 = cVarB.w(descriptor2, 4);
                        i10 |= 16;
                        str10 = str6;
                        store3 = store4;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 5:
                        str6 = str10;
                        date23 = (Date) cVarB.B(descriptor2, 5, ISO8601DateSerializer.INSTANCE, date23);
                        i10 |= 32;
                        str10 = str6;
                        store3 = store4;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 6:
                        date11 = date23;
                        date22 = (Date) cVarB.B(descriptor2, 6, ISO8601DateSerializer.INSTANCE, date22);
                        i10 |= 64;
                        store3 = store4;
                        date23 = date11;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 7:
                        date11 = date23;
                        date24 = (Date) cVarB.B(descriptor2, 7, ISO8601DateSerializer.INSTANCE, date24);
                        i10 |= 128;
                        store3 = store4;
                        date23 = date11;
                        i13 = 8;
                        i12 = 9;
                        break;
                    case 8:
                        ownershipType3 = (OwnershipType) cVarB.e(descriptor2, i13, bVarArr[i13], ownershipType3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        store3 = store4;
                        date23 = date23;
                        i12 = 9;
                        break;
                    case 9:
                        date9 = date23;
                        periodType3 = (PeriodType) cVarB.e(descriptor2, i12, bVarArr[i12], periodType3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 10:
                        date9 = date23;
                        date21 = (Date) cVarB.B(descriptor2, 10, ISO8601DateSerializer.INSTANCE, date21);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 11:
                        date9 = date23;
                        str11 = (String) cVarB.B(descriptor2, 11, x0.f20253a, str11);
                        i10 |= 2048;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        date9 = date23;
                        date20 = (Date) cVarB.B(descriptor2, 12, ISO8601DateSerializer.INSTANCE, date20);
                        i10 |= 4096;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 13:
                        date9 = date23;
                        str10 = (String) cVarB.B(descriptor2, 13, x0.f20253a, str10);
                        i10 |= 8192;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 14:
                        date9 = date23;
                        priceResponse4 = (SubscriptionInfoResponse.PriceResponse) cVarB.B(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, priceResponse4);
                        i10 |= 16384;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 15:
                        date9 = date23;
                        str12 = (String) cVarB.B(descriptor2, 15, x0.f20253a, str12);
                        i11 = 32768;
                        i10 |= i11;
                        store3 = store4;
                        date23 = date9;
                        break;
                    case 16:
                        date9 = date23;
                        str13 = (String) cVarB.B(descriptor2, 16, x0.f20253a, str13);
                        i11 = 65536;
                        i10 |= i11;
                        store3 = store4;
                        date23 = date9;
                        break;
                    default:
                        throw new m(i14);
                }
            }
            date = date25;
            str = str11;
            store = store3;
            str2 = str13;
            str3 = str12;
            date2 = date21;
            periodType = periodType3;
            ownershipType = ownershipType3;
            date3 = date22;
            date4 = date23;
            date5 = date24;
            date6 = date26;
            date7 = date27;
            date8 = date20;
            priceResponse = priceResponse4;
            str4 = str10;
            z10 = zW2;
        }
        int i15 = i10;
        cVarB.c(descriptor2);
        return new SubscriptionInfoResponse(i15, date, date6, date7, store, z10, date4, date3, date5, ownershipType, periodType, date2, str, date8, str4, priceResponse, str3, str2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, SubscriptionInfoResponse value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        SubscriptionInfoResponse.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
