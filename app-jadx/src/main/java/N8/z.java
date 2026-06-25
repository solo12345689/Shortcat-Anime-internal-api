package N8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class z extends A {
    z(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // N8.A
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new B(4, "Invalid response to one way request", null));
        }
    }

    @Override // N8.A
    final boolean b() {
        return true;
    }
}
