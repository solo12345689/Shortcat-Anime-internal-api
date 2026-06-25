package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v0 extends AbstractC2347p0 implements Rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f20245c = new v0();

    private v0() {
        super(Sf.a.E(kotlin.jvm.internal.S.f52262a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        AbstractC5504s.h(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2346p, Vf.AbstractC2316a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(Uf.c decoder, int i10, u0 builder, boolean z10) {
        AbstractC5504s.h(decoder, "decoder");
        AbstractC5504s.h(builder, "builder");
        builder.e(decoder.H(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public u0 k(short[] sArr) {
        AbstractC5504s.h(sArr, "<this>");
        return new u0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2347p0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(Uf.d encoder, short[] content, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.q(getDescriptor(), i11, content[i11]);
        }
    }
}
