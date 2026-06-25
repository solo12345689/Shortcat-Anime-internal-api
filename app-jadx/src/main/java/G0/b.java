package G0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6973d;

    public b(float f10, float f11, long j10, int i10) {
        this.f6970a = f10;
        this.f6971b = f11;
        this.f6972c = j10;
        this.f6973d = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f6970a == this.f6970a && bVar.f6971b == this.f6971b && bVar.f6972c == this.f6972c && bVar.f6973d == this.f6973d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6970a) * 31) + Float.hashCode(this.f6971b)) * 31) + Long.hashCode(this.f6972c)) * 31) + Integer.hashCode(this.f6973d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f6970a + ",horizontalScrollPixels=" + this.f6971b + ",uptimeMillis=" + this.f6972c + ",deviceId=" + this.f6973d + ')';
    }
}
