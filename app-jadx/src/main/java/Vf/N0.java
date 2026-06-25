package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class N0 implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f20155a = new N0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20156b = G.a("kotlin.UShort", Sf.a.E(kotlin.jvm.internal.S.f52262a));

    private N0() {
    }

    public short a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Td.I.b(decoder.z(getDescriptor()).q());
    }

    public void b(Uf.f encoder, short s10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.D(getDescriptor()).w(s10);
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return Td.I.a(a(eVar));
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20156b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Td.I) obj).m());
    }
}
