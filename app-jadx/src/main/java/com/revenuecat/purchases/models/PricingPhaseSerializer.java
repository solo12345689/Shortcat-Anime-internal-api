package com.revenuecat.purchases.models;

import Rf.b;
import Sf.a;
import Tf.e;
import Tf.k;
import Uf.c;
import Uf.d;
import Uf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhaseSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/models/PricingPhase;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/models/PricingPhase;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/models/PricingPhase;", "", "nullableIntSerializer", "LRf/b;", "BILLING_PERIOD_INDEX", "I", "RECURRENCE_MODE_INDEX", "BILLING_CYCLE_COUNT_INDEX", "PRICE_INDEX", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseSerializer implements b {
    private static final int BILLING_CYCLE_COUNT_INDEX = 2;
    private static final int BILLING_PERIOD_INDEX = 0;
    private static final int PRICE_INDEX = 3;
    private static final int RECURRENCE_MODE_INDEX = 1;
    public static final PricingPhaseSerializer INSTANCE = new PricingPhaseSerializer();
    private static final b nullableIntSerializer = a.p(a.C(r.f52290a));
    private static final e descriptor = k.c("PricingPhase", new e[0], PricingPhaseSerializer$descriptor$1.INSTANCE);

    private PricingPhaseSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public PricingPhase deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Period period = null;
        RecurrenceMode recurrenceMode = null;
        Integer num = null;
        Price price = null;
        while (true) {
            PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
            int i10 = cVarB.i(pricingPhaseSerializer.getDescriptor());
            if (i10 == -1) {
                AbstractC5504s.e(period);
                AbstractC5504s.e(recurrenceMode);
                AbstractC5504s.e(price);
                PricingPhase pricingPhase = new PricingPhase(period, recurrenceMode, num, price);
                cVarB.c(descriptor2);
                return pricingPhase;
            }
            if (i10 == 0) {
                period = (Period) c.a.c(cVarB, pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, null, 8, null);
            } else if (i10 == 1) {
                recurrenceMode = (RecurrenceMode) c.a.c(cVarB, pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, null, 8, null);
            } else if (i10 == 2) {
                num = (Integer) c.a.c(cVarB, pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, null, 8, null);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(("Unexpected index: " + i10).toString());
                }
                price = (Price) c.a.c(cVarB, pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, null, 8, null);
            }
        }
    }

    @Override // Rf.k
    public void serialize(f encoder, PricingPhase value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
        dVarB.m(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, value.getBillingPeriod());
        dVarB.m(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, value.getRecurrenceMode());
        dVarB.m(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, value.getBillingCycleCount());
        dVarB.m(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, value.getPrice());
        dVarB.c(descriptor2);
    }
}
