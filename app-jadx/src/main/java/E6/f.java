package E6;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface f extends d {
    static f E0(Bitmap bitmap, C5.h hVar, p pVar, int i10, int i11) {
        return b.S() ? new b(bitmap, hVar, pVar, i10, i11) : new i(bitmap, hVar, pVar, i10, i11);
    }

    static f U1(C5.a aVar, p pVar, int i10) {
        return W0(aVar, pVar, i10, 0);
    }

    static f W0(C5.a aVar, p pVar, int i10, int i11) {
        return b.S() ? new b(aVar, pVar, i10, i11) : new i(aVar, pVar, i10, i11);
    }

    static f z0(Bitmap bitmap, C5.h hVar, p pVar, int i10) {
        return E0(bitmap, hVar, pVar, i10, 0);
    }

    int U0();

    C5.a X();

    int h1();
}
