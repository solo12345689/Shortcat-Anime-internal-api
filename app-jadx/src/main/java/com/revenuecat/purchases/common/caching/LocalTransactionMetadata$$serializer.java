package com.revenuecat.purchases.common.caching;

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
import Vf.x0;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReceiptInfo$$serializer;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/caching/LocalTransactionMetadata.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class LocalTransactionMetadata$$serializer implements E {
    public static final LocalTransactionMetadata$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        LocalTransactionMetadata$$serializer localTransactionMetadata$$serializer = new LocalTransactionMetadata$$serializer();
        INSTANCE = localTransactionMetadata$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.common.caching.LocalTransactionMetadata", localTransactionMetadata$$serializer, 4);
        c2337k0.g("token", false);
        c2337k0.g("receipt_info", false);
        c2337k0.g("paywall_data", true);
        c2337k0.g("purchases_are_completed_by", false);
        descriptor = c2337k0;
    }

    private LocalTransactionMetadata$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{x0.f20253a, ReceiptInfo$$serializer.INSTANCE, a.p(PaywallPostReceiptData$$serializer.INSTANCE), LocalTransactionMetadata.$childSerializers[3]};
    }

    @Override // Rf.a
    public LocalTransactionMetadata deserialize(e decoder) {
        int i10;
        String str;
        ReceiptInfo receiptInfo;
        PaywallPostReceiptData paywallPostReceiptData;
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = LocalTransactionMetadata.$childSerializers;
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            ReceiptInfo receiptInfo2 = (ReceiptInfo) cVarB.e(descriptor2, 1, ReceiptInfo$$serializer.INSTANCE, null);
            PaywallPostReceiptData paywallPostReceiptData2 = (PaywallPostReceiptData) cVarB.B(descriptor2, 2, PaywallPostReceiptData$$serializer.INSTANCE, null);
            purchasesAreCompletedBy = (PurchasesAreCompletedBy) cVarB.e(descriptor2, 3, bVarArr[3], null);
            str = strL2;
            paywallPostReceiptData = paywallPostReceiptData2;
            i10 = 15;
            receiptInfo = receiptInfo2;
        } else {
            boolean z10 = true;
            int i11 = 0;
            ReceiptInfo receiptInfo3 = null;
            PaywallPostReceiptData paywallPostReceiptData3 = null;
            PurchasesAreCompletedBy purchasesAreCompletedBy2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    receiptInfo3 = (ReceiptInfo) cVarB.e(descriptor2, 1, ReceiptInfo$$serializer.INSTANCE, receiptInfo3);
                    i11 |= 2;
                } else if (i12 == 2) {
                    paywallPostReceiptData3 = (PaywallPostReceiptData) cVarB.B(descriptor2, 2, PaywallPostReceiptData$$serializer.INSTANCE, paywallPostReceiptData3);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    purchasesAreCompletedBy2 = (PurchasesAreCompletedBy) cVarB.e(descriptor2, 3, bVarArr[3], purchasesAreCompletedBy2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strL;
            receiptInfo = receiptInfo3;
            paywallPostReceiptData = paywallPostReceiptData3;
            purchasesAreCompletedBy = purchasesAreCompletedBy2;
        }
        cVarB.c(descriptor2);
        return new LocalTransactionMetadata(i10, str, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, LocalTransactionMetadata value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        LocalTransactionMetadata.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
