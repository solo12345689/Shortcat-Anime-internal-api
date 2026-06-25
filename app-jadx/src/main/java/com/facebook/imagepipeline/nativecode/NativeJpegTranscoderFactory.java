package com.facebook.imagepipeline.nativecode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeJpegTranscoderFactory implements M6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35998c;

    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f35996a = i10;
        this.f35997b = z10;
        this.f35998c = z11;
    }

    @Override // M6.d
    public M6.c createImageTranscoder(q6.c cVar, boolean z10) {
        if (cVar != q6.b.f57656b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f35996a, this.f35997b, this.f35998c);
    }
}
