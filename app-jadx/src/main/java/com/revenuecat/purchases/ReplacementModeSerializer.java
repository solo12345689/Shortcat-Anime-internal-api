package com.revenuecat.purchases;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/ReplacementModeSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/ReplacementMode;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/ReplacementMode;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/ReplacementMode;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReplacementModeSerializer implements Rf.b {
    public static final ReplacementModeSerializer INSTANCE = new ReplacementModeSerializer();
    private static final Tf.e descriptor = Tf.k.c("ReplacementMode", new Tf.e[0], ReplacementModeSerializer$descriptor$1.INSTANCE);

    private ReplacementModeSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public ReplacementMode deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        String strL = "";
        String strL2 = "";
        while (true) {
            ReplacementModeSerializer replacementModeSerializer = INSTANCE;
            int i10 = cVarB.i(replacementModeSerializer.getDescriptor());
            if (i10 == -1) {
                if (!AbstractC5504s.c(strL, "GoogleReplacementMode")) {
                    throw new Rf.j("Unknown ReplacementMode type: " + strL);
                }
                try {
                    GoogleReplacementMode googleReplacementModeValueOf = GoogleReplacementMode.valueOf(strL2);
                    cVarB.c(descriptor2);
                    return googleReplacementModeValueOf;
                } catch (IllegalArgumentException e10) {
                    throw new Rf.j("Invalid GoogleReplacementMode name: " + strL2, e10);
                }
            }
            if (i10 == 0) {
                strL = cVarB.l(replacementModeSerializer.getDescriptor(), 0);
            } else {
                if (i10 != 1) {
                    throw new Rf.j("Unexpected index: " + i10);
                }
                strL2 = cVarB.l(replacementModeSerializer.getDescriptor(), 1);
            }
        }
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, ReplacementMode value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        if (!(value instanceof GoogleReplacementMode)) {
            throw new Rf.j("Unknown ReplacementMode type: " + O.b(value.getClass()).v());
        }
        ReplacementModeSerializer replacementModeSerializer = INSTANCE;
        dVarB.k(replacementModeSerializer.getDescriptor(), 0, "GoogleReplacementMode");
        dVarB.k(replacementModeSerializer.getDescriptor(), 1, value.getName());
        dVarB.c(descriptor2);
    }
}
