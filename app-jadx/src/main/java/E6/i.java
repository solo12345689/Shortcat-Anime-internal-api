package E6;

import android.graphics.Bitmap;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class i extends b {
    protected i(C5.a aVar, p pVar, int i10, int i11) {
        super(aVar, pVar, i10, i11);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        AbstractC7283a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected i(Bitmap bitmap, C5.h hVar, p pVar, int i10, int i11) {
        super(bitmap, hVar, pVar, i10, i11);
    }
}
