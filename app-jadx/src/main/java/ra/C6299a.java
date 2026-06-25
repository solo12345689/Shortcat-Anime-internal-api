package ra;

import X9.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ja.C5356a;
import ja.InterfaceC5358c;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: ra.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6299a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f58727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f58728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5358c f58729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f58730d;

    public C6299a(Context context, String str, InterfaceC5358c interfaceC5358c) {
        Context contextA = a(context);
        this.f58727a = contextA;
        this.f58728b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f58729c = interfaceC5358c;
        this.f58730d = c();
    }

    private static Context a(Context context) {
        return AbstractC7194b.b(context);
    }

    private boolean c() {
        return this.f58728b.contains("firebase_data_collection_default_enabled") ? this.f58728b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f58727a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f58727a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f58730d != z10) {
            this.f58730d = z10;
            this.f58729c.b(new C5356a(b.class, new b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f58730d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f58728b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f58728b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
