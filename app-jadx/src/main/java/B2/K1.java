package B2;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K1 f868d = new K1("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f871c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f872a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            AbstractC6614a.g(this.f872a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f872a = logSessionId;
        }
    }

    public K1(String str) {
        this.f869a = str;
        this.f870b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f871c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) AbstractC6614a.e(this.f870b)).f872a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) AbstractC6614a.e(this.f870b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        return Objects.equals(this.f869a, k12.f869a) && Objects.equals(this.f870b, k12.f870b) && Objects.equals(this.f871c, k12.f871c);
    }

    public int hashCode() {
        return Objects.hash(this.f869a, this.f870b, this.f871c);
    }
}
