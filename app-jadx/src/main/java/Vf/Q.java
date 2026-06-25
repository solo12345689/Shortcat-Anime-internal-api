package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f20164a = new Q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20165b = new q0("kotlin.Long", d.g.f17509a);

    private Q() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Long.valueOf(decoder.n());
    }

    public void b(Uf.f encoder, long j10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.s(j10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20165b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
