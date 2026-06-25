package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Sf.a;
import Tf.e;
import Uf.f;
import com.revenuecat.purchases.paywalls.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/RgbaStringArgbColorIntDeserializer;", "LRf/b;", "", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;I)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/lang/Integer;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RgbaStringArgbColorIntDeserializer implements b {
    public static final RgbaStringArgbColorIntDeserializer INSTANCE = new RgbaStringArgbColorIntDeserializer();
    private static final e descriptor = a.C(r.f52290a).getDescriptor();

    private RgbaStringArgbColorIntDeserializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    @Override // Rf.a
    public Integer deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Integer.valueOf(ColorUtilsKt.parseRGBAColor(decoder.A()));
    }

    public void serialize(f encoder, int value) {
        AbstractC5504s.h(encoder, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
