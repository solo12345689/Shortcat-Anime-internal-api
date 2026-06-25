package F8;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzav;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: g */
    private static volatile n f6584g;

    /* JADX INFO: renamed from: a */
    private final Context f6585a;

    /* JADX INFO: renamed from: b */
    private final List f6586b;

    /* JADX INFO: renamed from: c */
    private final e f6587c;

    /* JADX INFO: renamed from: d */
    private final j f6588d;

    /* JADX INFO: renamed from: e */
    private volatile zzav f6589e;

    /* JADX INFO: renamed from: f */
    private Thread.UncaughtExceptionHandler f6590f;

    n(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC2115p.l(applicationContext);
        this.f6585a = applicationContext;
        this.f6588d = new j(this);
        this.f6586b = new CopyOnWriteArrayList();
        this.f6587c = new e();
    }

    public static n a(Context context) {
        AbstractC2115p.l(context);
        if (f6584g == null) {
            synchronized (n.class) {
                try {
                    if (f6584g == null) {
                        f6584g = new n(context);
                    }
                } finally {
                }
            }
        }
        return f6584g;
    }

    public static void d() {
        if (!(Thread.currentThread() instanceof m)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final zzav b() {
        String packageName;
        if (this.f6589e == null) {
            synchronized (this) {
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    String strValueOf = String.valueOf(packageName);
                    Log.e("GAv4", strValueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(strValueOf) : new String("Error retrieving package info: appName set to "));
                } finally {
                }
                if (this.f6589e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.f6585a.getPackageManager();
                    packageName = this.f6585a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f6585a.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            packageName = applicationLabel.toString();
                        }
                        str = packageInfo.versionName;
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str);
                    this.f6589e = zzavVar;
                }
            }
        }
        return this.f6589e;
    }

    public final void e(Runnable runnable) {
        AbstractC2115p.l(runnable);
        this.f6588d.submit(runnable);
    }

    public final void f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6590f = uncaughtExceptionHandler;
    }
}
