package H9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f8192a = -1.0f;

    @Override // H9.e
    public void a(n nVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        nVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        nVar.m((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }
}
