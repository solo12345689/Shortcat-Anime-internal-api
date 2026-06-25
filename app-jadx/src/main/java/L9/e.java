package L9;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f11337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11338b;

    e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f11337a = pendingIntent;
        this.f11338b = z10;
    }

    @Override // L9.b
    final PendingIntent a() {
        return this.f11337a;
    }

    @Override // L9.b
    final boolean b() {
        return this.f11338b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11337a.equals(bVar.a()) && this.f11338b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11337a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f11338b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f11337a.toString() + ", isNoOp=" + this.f11338b + "}";
    }
}
