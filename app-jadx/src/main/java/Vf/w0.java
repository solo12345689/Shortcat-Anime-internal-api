package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w0 implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f20249a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20250b = new q0("kotlin.Short", d.h.f17510a);

    private w0() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Short.valueOf(decoder.q());
    }

    public void b(Uf.f encoder, short s10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.w(s10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20250b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
