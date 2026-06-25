package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class G0 extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G0 f20136c = new G0();

    private G0() {
        super(Sf.a.t(Td.D.f17422b));
    }

    @Override // Vf.AbstractC2316a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((Td.E) obj).A());
    }

    @Override // Vf.AbstractC2316a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((Td.E) obj).A());
    }

    @Override // Vf.AbstractC2347p0
    public /* bridge */ /* synthetic */ Object r() {
        return Td.E.b(w());
    }

    @Override // Vf.AbstractC2347p0
    public /* bridge */ /* synthetic */ void u(Uf.d dVar, Object obj, int i10) {
        z(dVar, ((Td.E) obj).A(), i10);
    }

    protected int v(int[] collectionSize) {
        AbstractC5504s.h(collectionSize, "$this$collectionSize");
        return Td.E.t(collectionSize);
    }

    protected int[] w() {
        return Td.E.d(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, F0 builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(Td.D.b(decoder.y(getDescriptor(), i10).h()));
    }

    protected F0 y(int[] toBuilder) {
        AbstractC5504s.h(toBuilder, "$this$toBuilder");
        return new F0(toBuilder, null);
    }

    protected void z(Uf.d encoder, int[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11).E(Td.E.p(content, i11));
        }
    }
}
