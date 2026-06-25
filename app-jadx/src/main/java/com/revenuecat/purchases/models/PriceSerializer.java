package com.revenuecat.purchases.models;

import Rf.b;
import Tf.e;
import Tf.k;
import Uf.c;
import Uf.d;
import Uf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/models/PriceSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/models/Price;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/models/Price;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/models/Price;", "", "FORMATTED_INDEX", "I", "AMOUNT_MICROS_INDEX", "CURRENCY_CODE_INDEX", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PriceSerializer implements b {
    private static final int AMOUNT_MICROS_INDEX = 1;
    private static final int CURRENCY_CODE_INDEX = 2;
    private static final int FORMATTED_INDEX = 0;
    public static final PriceSerializer INSTANCE = new PriceSerializer();
    private static final e descriptor = k.c("Price", new e[0], PriceSerializer$descriptor$1.INSTANCE);

    private PriceSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public Price deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strL = "";
        long jO = 0;
        String strL2 = "";
        while (true) {
            PriceSerializer priceSerializer = INSTANCE;
            int i10 = cVarB.i(priceSerializer.getDescriptor());
            if (i10 == -1) {
                Price price = new Price(strL, jO, strL2);
                cVarB.c(descriptor2);
                return price;
            }
            if (i10 == 0) {
                strL = cVarB.l(priceSerializer.getDescriptor(), 0);
            } else if (i10 == 1) {
                jO = cVarB.o(priceSerializer.getDescriptor(), 1);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(("Unexpected index: " + i10).toString());
                }
                strL2 = cVarB.l(priceSerializer.getDescriptor(), 2);
            }
        }
    }

    @Override // Rf.k
    public void serialize(f encoder, Price value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PriceSerializer priceSerializer = INSTANCE;
        dVarB.k(priceSerializer.getDescriptor(), 0, value.getFormatted());
        dVarB.o(priceSerializer.getDescriptor(), 1, value.getAmountMicros());
        dVarB.k(priceSerializer.getDescriptor(), 2, value.getCurrencyCode());
        dVarB.c(descriptor2);
    }
}
