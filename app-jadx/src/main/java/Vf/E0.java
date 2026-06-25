package Vf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5491e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class E0 implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f20130a = new E0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20131b = G.a("kotlin.UByte", Sf.a.y(C5491e.f52277a));

    private E0() {
    }

    public byte a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Td.B.b(decoder.z(getDescriptor()).E());
    }

    public void b(Uf.f encoder, byte b10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.D(getDescriptor()).j(b10);
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return Td.B.a(a(eVar));
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20131b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Td.B) obj).m());
    }
}
