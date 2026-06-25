package ia;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class i implements fa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48763a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48764b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fa.c f48765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5051f f48766d;

    i(C5051f c5051f) {
        this.f48766d = c5051f;
    }

    private void b() {
        if (this.f48763a) {
            throw new fa.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f48763a = true;
    }

    @Override // fa.g
    public fa.g a(String str) throws IOException {
        b();
        this.f48766d.g(this.f48765c, str, this.f48764b);
        return this;
    }

    void c(fa.c cVar, boolean z10) {
        this.f48763a = false;
        this.f48765c = cVar;
        this.f48764b = z10;
    }

    @Override // fa.g
    public fa.g e(boolean z10) {
        b();
        this.f48766d.l(this.f48765c, z10, this.f48764b);
        return this;
    }
}
