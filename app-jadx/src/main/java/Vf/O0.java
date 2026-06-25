package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class O0 implements Rf.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0 f20159b = new O0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2321c0 f20160a = new C2321c0("kotlin.Unit", Td.L.f17438a);

    private O0() {
    }

    public void a(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        this.f20160a.deserialize(decoder);
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, Td.L value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        this.f20160a.serialize(encoder, value);
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        a(eVar);
        return Td.L.f17438a;
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return this.f20160a.getDescriptor();
    }
}
