package Vf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5490d;

/* JADX INFO: renamed from: Vf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2328g extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2328g f20191c = new C2328g();

    private C2328g() {
        super(Sf.a.x(C5490d.f52276a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        AbstractC5504s.h(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, C2326f builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(decoder.w(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2326f k(boolean[] zArr) {
        AbstractC5504s.h(zArr, "<this>");
        return new C2326f(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(Uf.d encoder, boolean[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.B(getDescriptor(), i11, content[i11]);
        }
    }
}
