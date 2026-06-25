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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/models/RecurrenceMode;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RecurrenceModeSerializer implements b {
    public static final RecurrenceModeSerializer INSTANCE = new RecurrenceModeSerializer();
    private static final e descriptor = k.c("RecurrenceMode", new e[0], RecurrenceModeSerializer$descriptor$1.INSTANCE);

    private RecurrenceModeSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public RecurrenceMode deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strL = "";
        while (true) {
            RecurrenceModeSerializer recurrenceModeSerializer = INSTANCE;
            int i10 = cVarB.i(recurrenceModeSerializer.getDescriptor());
            if (i10 == -1) {
                RecurrenceMode recurrenceModeValueOf = RecurrenceMode.valueOf(strL);
                cVarB.c(descriptor2);
                return recurrenceModeValueOf;
            }
            if (i10 != 0) {
                throw new IllegalStateException(("Unexpected index: " + i10).toString());
            }
            strL = cVarB.l(recurrenceModeSerializer.getDescriptor(), 0);
        }
    }

    @Override // Rf.k
    public void serialize(f encoder, RecurrenceMode value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        dVarB.k(INSTANCE.getDescriptor(), 0, value.name());
        dVarB.c(descriptor2);
    }
}
