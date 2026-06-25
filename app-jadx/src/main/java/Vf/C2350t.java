package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2350t implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2350t f20233a = new C2350t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20234b = new q0("kotlin.Double", d.C0302d.f17506a);

    private C2350t() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Double.valueOf(decoder.s());
    }

    public void b(Uf.f encoder, double d10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.i(d10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20234b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
