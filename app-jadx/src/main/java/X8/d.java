package X8;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f21686a;

    public d(Context context) {
        this.f21686a = context;
    }

    public int a(String str) {
        return this.f21686a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f21686a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f21686a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        Context context = this.f21686a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i10) {
        return this.f21686a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f21686a);
        }
        if (!l.e()) {
            return false;
        }
        Context context = this.f21686a;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final boolean g(int i10, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f21686a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
