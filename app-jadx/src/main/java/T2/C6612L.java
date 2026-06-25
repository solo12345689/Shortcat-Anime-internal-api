package t2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: t2.L */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6612L implements InterfaceC6623j {
    protected C6612L() {
    }

    @Override // t2.InterfaceC6623j
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // t2.InterfaceC6623j
    public long b() {
        return System.nanoTime();
    }

    @Override // t2.InterfaceC6623j
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // t2.InterfaceC6623j
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // t2.InterfaceC6623j
    public InterfaceC6631s e(Looper looper, Handler.Callback callback) {
        return new C6613M(new Handler(looper, callback));
    }

    @Override // t2.InterfaceC6623j
    public void f() {
    }
}
