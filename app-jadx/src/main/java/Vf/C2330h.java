package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2330h implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2330h f20193a = new C2330h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20194b = new q0("kotlin.Boolean", d.a.f17503a);

    private C2330h() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Boolean.valueOf(decoder.u());
    }

    public void b(Uf.f encoder, boolean z10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.x(z10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20194b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
