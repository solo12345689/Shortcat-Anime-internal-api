package Nd;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f12808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f12809e;

    public f(Context context) {
        AbstractC5504s.h(context, "context");
        this.f12806b = context;
        this.f12808d = new g();
        this.f12809e = new g();
    }

    private final void f() {
        if (this.f12807c != null) {
            this.f12806b.unbindService(this);
        }
        this.f12807c = null;
        this.f12808d.b();
        this.f12809e.b();
    }

    private final void i(String str) {
        String str2 = this.f12807c;
        if (str2 != null && !AbstractC5504s.c(str2, str)) {
            f();
        }
        if (l(str)) {
            return;
        }
        androidx.browser.customtabs.c.a(this.f12806b, str, this);
        this.f12807c = str;
    }

    private final void j() {
        if (this.f12809e.e()) {
            return;
        }
        this.f12808d.c(new sb.c() { // from class: Nd.e
            @Override // sb.c
            public final void apply(Object obj) {
                f.k(this.f12805a, (androidx.browser.customtabs.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, androidx.browser.customtabs.c client) {
        AbstractC5504s.h(client, "client");
        fVar.f12809e.f(client.e(null));
    }

    private final boolean l(String str) {
        return AbstractC5504s.c(str, this.f12807c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Uri uri, androidx.browser.customtabs.f fVar) {
        if (fVar != null) {
            fVar.c(uri, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.browser.customtabs.c client) {
        AbstractC5504s.h(client, "client");
        client.g(0L);
    }

    @Override // androidx.browser.customtabs.e
    public void a(ComponentName componentName, androidx.browser.customtabs.c client) {
        AbstractC5504s.h(componentName, "componentName");
        AbstractC5504s.h(client, "client");
        String packageName = componentName.getPackageName();
        AbstractC5504s.g(packageName, "getPackageName(...)");
        if (l(packageName)) {
            this.f12808d.f(client);
        }
    }

    public final boolean g(String packageName) {
        AbstractC5504s.h(packageName, "packageName");
        if (!l(packageName)) {
            return false;
        }
        f();
        return true;
    }

    public final void h() {
        f();
    }

    public final void m(String packageName, final Uri uri) {
        AbstractC5504s.h(packageName, "packageName");
        AbstractC5504s.h(uri, "uri");
        this.f12809e.c(new sb.c() { // from class: Nd.d
            @Override // sb.c
            public final void apply(Object obj) {
                f.n(uri, (androidx.browser.customtabs.f) obj);
            }
        });
        i(packageName);
        j();
    }

    public final void o(String packageName) {
        AbstractC5504s.h(packageName, "packageName");
        this.f12808d.c(new sb.c() { // from class: Nd.c
            @Override // sb.c
            public final void apply(Object obj) {
                f.p((androidx.browser.customtabs.c) obj);
            }
        });
        i(packageName);
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        AbstractC5504s.h(componentName, "componentName");
        String packageName = componentName.getPackageName();
        AbstractC5504s.g(packageName, "getPackageName(...)");
        if (l(packageName)) {
            f();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        AbstractC5504s.h(componentName, "componentName");
        String packageName = componentName.getPackageName();
        AbstractC5504s.g(packageName, "getPackageName(...)");
        if (l(packageName)) {
            f();
        }
    }
}
