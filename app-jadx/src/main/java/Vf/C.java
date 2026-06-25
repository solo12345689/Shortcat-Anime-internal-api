package Vf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5498l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f20124c = new C();

    private C() {
        super(Sf.a.B(C5498l.f52289a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        AbstractC5504s.h(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, B builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(decoder.t(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public B k(float[] fArr) {
        AbstractC5504s.h(fArr, "<this>");
        return new B(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(Uf.d encoder, float[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.l(getDescriptor(), i11, content[i11]);
        }
    }
}
