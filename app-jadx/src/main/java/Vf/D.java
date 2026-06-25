package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f20127a = new D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20128b = new q0("kotlin.Float", d.e.f17507a);

    private D() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Float.valueOf(decoder.r());
    }

    public void b(Uf.f encoder, float f10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.y(f10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20128b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
