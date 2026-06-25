package Y0;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f22634a = new M();

    private M() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return N.f22635a.a(context);
        }
        return 0;
    }
}
