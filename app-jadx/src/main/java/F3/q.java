package F3;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f6476b = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6477c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile q f6478d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f6479a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final boolean f6480c = q.f6476b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f6481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ContentResolver f6482b;

        a(Context context) {
            this.f6481a = context;
            this.f6482b = context.getContentResolver();
        }

        private boolean a(c cVar) {
            return this.f6481a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.a(), cVar.s()) == 0;
        }

        private boolean c(c cVar, String str) {
            return cVar.a() < 0 ? this.f6481a.getPackageManager().checkPermission(str, cVar.r()) == 0 : this.f6481a.checkPermission(str, cVar.a(), cVar.s()) == 0;
        }

        boolean b(c cVar) {
            String string = Settings.Secure.getString(this.f6482b, "enabled_notification_listeners");
            if (string != null) {
                for (String str : string.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                    if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(cVar.r())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean d(c cVar) {
            if (a(cVar)) {
                return true;
            }
            try {
                if (this.f6481a.getPackageManager().getApplicationInfo(cVar.r(), 0) == null) {
                    return false;
                }
                return c(cVar, "android.permission.STATUS_BAR_SERVICE") || c(cVar, "android.permission.MEDIA_CONTENT_CONTROL") || cVar.s() == 1000 || b(cVar);
            } catch (PackageManager.NameNotFoundException unused) {
                if (f6480c) {
                    Log.d("MediaSessionManager", "Package " + cVar.r() + " doesn't exist");
                }
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        int a();

        String r();

        int s();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends e {
        d(String str, int i10, int i11) {
            super(str, i10, i11);
        }

        static String b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6486c;

        e(String str, int i10, int i11) {
            this.f6484a = str;
            this.f6485b = i10;
            this.f6486c = i11;
        }

        @Override // F3.q.c
        public int a() {
            return this.f6485b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return (this.f6485b < 0 || eVar.f6485b < 0) ? TextUtils.equals(this.f6484a, eVar.f6484a) && this.f6486c == eVar.f6486c : TextUtils.equals(this.f6484a, eVar.f6484a) && this.f6485b == eVar.f6485b && this.f6486c == eVar.f6486c;
        }

        public int hashCode() {
            return K1.b.b(this.f6484a, Integer.valueOf(this.f6486c));
        }

        @Override // F3.q.c
        public String r() {
            return this.f6484a;
        }

        @Override // F3.q.c
        public int s() {
            return this.f6486c;
        }
    }

    private q(Context context) {
        this.f6479a = new a(context);
    }

    public static q a(Context context) {
        q qVar;
        synchronized (f6477c) {
            try {
                if (f6478d == null) {
                    f6478d = new q(context.getApplicationContext());
                }
                qVar = f6478d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public boolean b(b bVar) {
        return this.f6479a.d(bVar.f6483a);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f6483a;

        public b(String str, int i10, int i11) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f6483a = new d(str, i10, i11);
            } else {
                this.f6483a = new e(str, i10, i11);
            }
        }

        public String a() {
            return this.f6483a.r();
        }

        public int b() {
            return this.f6483a.a();
        }

        public int c() {
            return this.f6483a.s();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f6483a.equals(((b) obj).f6483a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6483a.hashCode();
        }

        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strB = d.b(remoteUserInfo);
            if (strB != null) {
                if (!TextUtils.isEmpty(strB)) {
                    this.f6483a = new d(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
