package n5;

import S4.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5751a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f53994a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static f c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f53994a;
        f fVar = (f) concurrentMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        f fVarD = d(context);
        f fVar2 = (f) concurrentMap.putIfAbsent(packageName, fVarD);
        return fVar2 == null ? fVarD : fVar2;
    }

    private static f d(Context context) {
        return new c(b(a(context)));
    }
}
