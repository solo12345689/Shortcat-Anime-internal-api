package fb;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: fb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4792b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4792b f46992a = new C4792b();

    private C4792b() {
    }

    public final boolean a(Context context) {
        PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.software.leanback")) ? false : true;
    }
}
