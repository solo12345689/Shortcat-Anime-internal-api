package za;

import android.os.Build;

/* JADX INFO: renamed from: za.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7346a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7346a f66025a = new C7346a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f66026b;

    static {
        f66026b = Build.VERSION.SDK_INT < 30;
    }

    private C7346a() {
    }

    public final boolean a() {
        return f66026b;
    }
}
