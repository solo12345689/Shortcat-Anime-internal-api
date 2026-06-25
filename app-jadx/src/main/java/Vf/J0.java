package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class J0 extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J0 f20146c = new J0();

    private J0() {
        super(Sf.a.u(Td.F.f17427b));
    }

    @Override // Vf.AbstractC2316a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((Td.G) obj).A());
    }

    @Override // Vf.AbstractC2316a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((Td.G) obj).A());
    }

    @Override // Vf.AbstractC2347p0
    public /* bridge */ /* synthetic */ Object r() {
        return Td.G.b(w());
    }

    @Override // Vf.AbstractC2347p0
    public /* bridge */ /* synthetic */ void u(Uf.d dVar, Object obj, int i10) {
        z(dVar, ((Td.G) obj).A(), i10);
    }

    protected int v(long[] collectionSize) {
        AbstractC5504s.h(collectionSize, "$this$collectionSize");
        return Td.G.t(collectionSize);
    }

    protected long[] w() {
        return Td.G.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, I0 builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(Td.F.b(decoder.y(getDescriptor(), i10).n()));
    }

    protected I0 y(long[] toBuilder) {
        AbstractC5504s.h(toBuilder, "$this$toBuilder");
        return new I0(toBuilder, null);
    }

    protected void z(Uf.d encoder, long[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11).s(Td.G.p(content, i11));
        }
    }
}
