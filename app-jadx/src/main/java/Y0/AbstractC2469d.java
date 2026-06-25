package Y0;

import Y0.K;
import android.content.res.AssetManager;
import java.io.File;

/* JADX INFO: renamed from: Y0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2469d {
    public static final InterfaceC2484t a(File file, L l10, int i10, K.d dVar) {
        return new C2467b(file, l10, i10, dVar, null);
    }

    public static /* synthetic */ InterfaceC2484t b(File file, L l10, int i10, K.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = L.f22613b.g();
        }
        if ((i11 & 4) != 0) {
            i10 = H.f22594b.b();
        }
        if ((i11 & 8) != 0) {
            dVar = K.f22604a.a(l10, i10, new K.a[0]);
        }
        return a(file, l10, i10, dVar);
    }

    public static final InterfaceC2484t c(String str, AssetManager assetManager, L l10, int i10, K.d dVar) {
        return new C2466a(assetManager, str, l10, i10, dVar, null);
    }

    public static /* synthetic */ InterfaceC2484t d(String str, AssetManager assetManager, L l10, int i10, K.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l10 = L.f22613b.g();
        }
        if ((i11 & 8) != 0) {
            i10 = H.f22594b.b();
        }
        if ((i11 & 16) != 0) {
            dVar = K.f22604a.a(l10, i10, new K.a[0]);
        }
        return c(str, assetManager, l10, i10, dVar);
    }
}
