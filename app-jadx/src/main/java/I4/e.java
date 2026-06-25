package i4;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f48664c;

    public e(int i10, Notification notification, int i11) {
        this.f48662a = i10;
        this.f48664c = notification;
        this.f48663b = i11;
    }

    public int a() {
        return this.f48663b;
    }

    public Notification b() {
        return this.f48664c;
    }

    public int c() {
        return this.f48662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f48662a == eVar.f48662a && this.f48663b == eVar.f48663b) {
            return this.f48664c.equals(eVar.f48664c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f48662a * 31) + this.f48663b) * 31) + this.f48664c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f48662a + ", mForegroundServiceType=" + this.f48663b + ", mNotification=" + this.f48664c + '}';
    }
}
