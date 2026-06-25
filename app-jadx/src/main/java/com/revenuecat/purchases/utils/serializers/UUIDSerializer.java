package com.revenuecat.purchases.utils.serializers;

import Rf.b;
import Tf.d;
import Tf.e;
import Tf.k;
import Uf.f;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;", "LRf/b;", "Ljava/util/UUID;", "<init>", "()V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Ljava/util/UUID;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Ljava/util/UUID;)V", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UUIDSerializer implements b {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final e descriptor = k.b("UUID", d.i.f17511a);

    private UUIDSerializer() {
    }

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.a
    public UUID deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.A());
        AbstractC5504s.g(uuidFromString, "fromString(decoder.decodeString())");
        return uuidFromString;
    }

    @Override // Rf.k
    public void serialize(f encoder, UUID value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        String string = value.toString();
        AbstractC5504s.g(string, "value.toString()");
        encoder.F(string);
    }
}
