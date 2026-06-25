package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2351u implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2351u f20235a = new C2351u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20236b = new q0("kotlin.time.Duration", d.i.f17511a);

    private C2351u() {
    }

    public long a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Ef.a.f5961b.c(decoder.A());
    }

    public void b(Uf.f encoder, long j10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.F(Ef.a.O(j10));
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return Ef.a.k(a(eVar));
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20236b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Ef.a) obj).S());
    }
}
