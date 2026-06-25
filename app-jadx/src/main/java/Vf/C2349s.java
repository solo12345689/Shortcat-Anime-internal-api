package Vf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5497k;

/* JADX INFO: renamed from: Vf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2349s extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2349s f20229c = new C2349s();

    private C2349s() {
        super(Sf.a.A(C5497k.f52288a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        AbstractC5504s.h(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, r builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(decoder.G(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public r k(double[] dArr) {
        AbstractC5504s.h(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(Uf.d encoder, double[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(getDescriptor(), i11, content[i11]);
        }
    }
}
