package L;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f11185a;

    static {
        f11185a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f11185a;
    }
}
