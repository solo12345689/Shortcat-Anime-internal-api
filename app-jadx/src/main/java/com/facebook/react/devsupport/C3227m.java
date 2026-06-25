package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3227m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36785d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f36786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f36787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f36788c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Context context, Intent intent) {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Context context) {
            return Settings.canDrawOverlays(context);
        }

        public final void d(Context context) {
            AbstractC5504s.h(context, "context");
            if (Settings.canDrawOverlays(context)) {
                return;
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            AbstractC7283a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (b(context, intent)) {
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    public C3227m(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f36786a = reactContext;
        Object systemService = reactContext.getSystemService("window");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f36787b = (WindowManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, C3227m c3227m) {
        FrameLayout frameLayout;
        if (z10 && c3227m.f36788c == null) {
            if (!f36785d.c(c3227m.f36786a)) {
                AbstractC7283a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            } else {
                c3227m.f36788c = new C3219e0(c3227m.f36786a);
                c3227m.f36787b.addView(c3227m.f36788c, new WindowManager.LayoutParams(-1, -1, E0.f36630b, 24, -3));
                return;
            }
        }
        if (z10 || (frameLayout = c3227m.f36788c) == null) {
            return;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        c3227m.f36787b.removeView(c3227m.f36788c);
        c3227m.f36788c = null;
    }

    public final void b(final boolean z10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l
            @Override // java.lang.Runnable
            public final void run() {
                C3227m.c(z10, this);
            }
        });
    }
}
