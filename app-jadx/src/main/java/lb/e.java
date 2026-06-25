package lb;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageInfo d(PackageManager packageManager, String str, int i10) throws f {
        try {
            PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i10)) : packageManager.getPackageInfo(str, i10);
            AbstractC5504s.e(packageInfo);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new f(e10);
        }
    }
}
