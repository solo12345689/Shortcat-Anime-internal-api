package Z0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f23117a = new h();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23118a = new a();

        private a() {
        }

        public final Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private h() {
    }

    public final Handler a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? a.f23118a.a(looper) : new Handler(looper);
    }
}
