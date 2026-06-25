package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f25542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f25543b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0430d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f25546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ActivityOptions f25547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f25548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray f25549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f25550g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f25553j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f25544a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.C0429a f25545b = new a.C0429a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25551h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f25552i = true;

        private void b() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f25544a.hasExtra("com.android.browser.headers") ? this.f25544a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f25544a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25544a.putExtras(bundle);
        }

        private void e() {
            if (this.f25547d == null) {
                this.f25547d = a.a();
            }
            c.a(this.f25547d, this.f25553j);
        }

        public d a() {
            if (!this.f25544a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f25546c;
            if (arrayList != null) {
                this.f25544a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f25548e;
            if (arrayList2 != null) {
                this.f25544a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25544a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25552i);
            this.f25544a.putExtras(this.f25545b.a().a());
            Bundle bundle = this.f25550g;
            if (bundle != null) {
                this.f25544a.putExtras(bundle);
            }
            if (this.f25549f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25549f);
                this.f25544a.putExtras(bundle2);
            }
            this.f25544a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25551h);
            int i10 = Build.VERSION.SDK_INT;
            b();
            if (i10 >= 34) {
                e();
            }
            ActivityOptions activityOptions = this.f25547d;
            return new d(this.f25544a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0430d c(androidx.browser.customtabs.a aVar) {
            this.f25550g = aVar.a();
            return this;
        }

        public C0430d f(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f25551h = i10;
            if (i10 == 1) {
                this.f25544a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i10 == 2) {
                this.f25544a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f25544a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public C0430d g(boolean z10) {
            this.f25544a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0430d h(boolean z10) {
            this.f25544a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f25542a = intent;
        this.f25543b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f25542a.setData(uri);
        AbstractC7194b.o(context, this.f25542a, this.f25543b);
    }
}
