package s0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final ColorFilter a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C6349e0.f58937a.a(j10, i10) : new PorterDuffColorFilter(AbstractC6387s0.k(j10), androidx.compose.ui.graphics.a.b(i10));
    }

    public static final ColorFilter b(androidx.compose.ui.graphics.d dVar) {
        return dVar.a();
    }
}
