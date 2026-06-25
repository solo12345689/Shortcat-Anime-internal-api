package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2344o implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2344o f20219a = new C2344o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20220b = new q0("kotlin.Char", d.c.f17505a);

    private C2344o() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Character.valueOf(decoder.v());
    }

    public void b(Uf.f encoder, char c10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.z(c10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20220b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
