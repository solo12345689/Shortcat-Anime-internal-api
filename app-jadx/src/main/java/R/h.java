package r;

import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58282a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f58283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G1.d f58284c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements c {
        a() {
        }

        @Override // r.h.c
        public G1.d a() {
            return new G1.d();
        }

        @Override // r.h.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        G1.d a();

        CancellationSignal b();
    }

    h() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f58283b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f58283b = null;
        }
        G1.d dVar = this.f58284c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f58284c = null;
        }
    }

    CancellationSignal b() {
        if (this.f58283b == null) {
            this.f58283b = this.f58282a.b();
        }
        return this.f58283b;
    }

    G1.d c() {
        if (this.f58284c == null) {
            this.f58284c = this.f58282a.a();
        }
        return this.f58284c;
    }
}
