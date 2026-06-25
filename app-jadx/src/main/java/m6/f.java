package M6;

import kotlin.jvm.internal.AbstractC5504s;
import z6.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f12238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f12239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12240e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f12236a = i10;
        this.f12237b = z10;
        this.f12238c = dVar;
        this.f12239d = num;
        this.f12240e = z11;
    }

    private final c a(q6.c cVar, boolean z10) {
        d dVar = this.f12238c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    private final c b(q6.c cVar, boolean z10) {
        Integer num = this.f12239d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z10);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z10);
    }

    private final c c(q6.c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f12236a, this.f12237b, this.f12240e).createImageTranscoder(cVar, z10);
    }

    private final c d(q6.c cVar, boolean z10) {
        c cVarCreateImageTranscoder = new h(this.f12236a).createImageTranscoder(cVar, z10);
        AbstractC5504s.g(cVarCreateImageTranscoder, "createImageTranscoder(...)");
        return cVarCreateImageTranscoder;
    }

    @Override // M6.d
    public c createImageTranscoder(q6.c imageFormat, boolean z10) {
        AbstractC5504s.h(imageFormat, "imageFormat");
        c cVarA = a(imageFormat, z10);
        if (cVarA == null) {
            cVarA = b(imageFormat, z10);
        }
        if (cVarA == null && z.a()) {
            cVarA = c(imageFormat, z10);
        }
        return cVarA == null ? d(imageFormat, z10) : cVarA;
    }
}
