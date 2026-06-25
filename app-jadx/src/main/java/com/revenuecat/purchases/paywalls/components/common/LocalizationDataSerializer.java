package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Rf.j;
import Tf.c;
import Tf.e;
import Tf.k;
import Uf.f;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationDataSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "getDescriptor$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LocalizationDataSerializer implements b {
    public static final LocalizationDataSerializer INSTANCE = new LocalizationDataSerializer();
    private static final e descriptor = k.e("LocalizationData", c.a.f17502a, new e[0], null, 8, null);

    private LocalizationDataSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public LocalizationData deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        try {
            return (LocalizationData) decoder.C(LocalizationData.Text.INSTANCE.serializer());
        } catch (j unused) {
            return (LocalizationData) decoder.C(LocalizationData.Image.INSTANCE.serializer());
        }
    }

    @Override // Rf.k
    public void serialize(f encoder, LocalizationData value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }
}
