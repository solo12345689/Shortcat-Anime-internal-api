package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.InterfaceC2962a;
import b.InterfaceC2963b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2963b f25537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f25538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f25539c;

    c(InterfaceC2963b interfaceC2963b, ComponentName componentName, Context context) {
        this.f25537a = interfaceC2963b;
        this.f25538b = componentName;
        this.f25539c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private InterfaceC2962a.AbstractBinderC0552a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean zZ2;
        InterfaceC2962a.AbstractBinderC0552a abstractBinderC0552aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zZ2 = this.f25537a.a1(abstractBinderC0552aB, bundle);
            } else {
                zZ2 = this.f25537a.z2(abstractBinderC0552aB);
            }
            if (zZ2) {
                return new f(this.f25537a, abstractBinderC0552aB, this.f25538b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j10) {
        try {
            return this.f25537a.v2(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends InterfaceC2962a.AbstractBinderC0552a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f25540a = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        @Override // b.InterfaceC2962a
        public Bundle m0(String str, Bundle bundle) {
            return null;
        }

        @Override // b.InterfaceC2962a
        public void A2(Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void c1(Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void t3(Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void x2(Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void U0(String str, Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void Y2(int i10, Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void n3(String str, Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void I2(int i10, int i11, Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void w3(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // b.InterfaceC2962a
        public void a0(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        }
    }
}
