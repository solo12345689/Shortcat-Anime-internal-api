package N8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C extends A {
    C(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // N8.A
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // N8.A
    final boolean b() {
        return false;
    }
}
