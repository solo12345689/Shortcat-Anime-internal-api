package j1;

/* JADX INFO: renamed from: j1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5329d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5329d f51597a = new C5329d();

    private C5329d() {
    }

    public final float a(float f10, float f11, float f12, float f13, float f14) {
        return b(f10, f11, Math.max(0.0f, Math.min(1.0f, c(f12, f13, f14))));
    }

    public final float b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public final float c(float f10, float f11, float f12) {
        if (f10 == f11) {
            return 0.0f;
        }
        return (f12 - f10) / (f11 - f10);
    }
}
