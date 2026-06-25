package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2336k implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2336k f20201a = new C2336k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20202b = new q0("kotlin.Byte", d.b.f17504a);

    private C2336k() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Byte.valueOf(decoder.E());
    }

    public void b(Uf.f encoder, byte b10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.j(b10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20202b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
