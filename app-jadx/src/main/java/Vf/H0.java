package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class H0 implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final H0 f20139a = new H0();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20140b = G.a("kotlin.UInt", Sf.a.C(kotlin.jvm.internal.r.f52290a));

    private H0() {
    }

    public int a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Td.D.b(decoder.z(getDescriptor()).h());
    }

    public void b(Uf.f encoder, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.D(getDescriptor()).E(i10);
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return Td.D.a(a(eVar));
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20140b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Td.D) obj).m());
    }
}
