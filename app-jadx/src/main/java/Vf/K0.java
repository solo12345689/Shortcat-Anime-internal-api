package Vf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5507v;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class K0 implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0 f20147a = new K0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20148b = G.a("kotlin.ULong", Sf.a.D(C5507v.f52291a));

    private K0() {
    }

    public long a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Td.F.b(decoder.z(getDescriptor()).n());
    }

    public void b(Uf.f encoder, long j10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.D(getDescriptor()).s(j10);
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return Td.F.a(a(eVar));
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20148b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Td.F) obj).n());
    }
}
