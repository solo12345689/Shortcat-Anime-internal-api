package N8;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f12695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n9.j f12696b = new n9.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f12698d;

    A(int i10, int i11, Bundle bundle) {
        this.f12695a = i10;
        this.f12697c = i11;
        this.f12698d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b10.toString());
        }
        this.f12696b.b(b10);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f12696b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f12697c + " id=" + this.f12695a + " oneWay=" + b() + "}";
    }
}
