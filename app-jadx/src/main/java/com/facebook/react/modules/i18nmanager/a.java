package com.facebook.react.modules.i18nmanager;

import Df.r;
import J1.p;
import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.b;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0620a f37029a = new C0620a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f37030b = new a();

    /* JADX INFO: renamed from: com.facebook.react.modules.i18nmanager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0620a {
        public /* synthetic */ C0620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f37030b;
        }

        private C0620a() {
        }
    }

    private a() {
    }

    private final boolean c(Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    public static final a f() {
        return f37029a.a();
    }

    private final boolean g() {
        return p.a(Locale.getAvailableLocales()[0]) == 1;
    }

    private final boolean h(Context context, String str, boolean z10) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z10);
    }

    private final boolean j(Context context) {
        return h(context, "RCTI18nUtil_allowRTL", true);
    }

    private final boolean k(Context context) {
        return h(context, "RCTI18nUtil_forceRTL", false) || r.B(System.getProperty("FORCE_RTL_FOR_TESTING", b.f34641ag), b.f34640af, true);
    }

    private final void l(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public final void b(Context context, boolean z10) {
        AbstractC5504s.h(context, "context");
        l(context, "RCTI18nUtil_allowRTL", z10);
    }

    public final boolean d(Context context) {
        AbstractC5504s.h(context, "context");
        return h(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void e(Context context, boolean z10) {
        AbstractC5504s.h(context, "context");
        l(context, "RCTI18nUtil_forceRTL", z10);
    }

    public final boolean i(Context context) {
        AbstractC5504s.h(context, "context");
        if (!c(context)) {
            return false;
        }
        if (k(context)) {
            return true;
        }
        return j(context) && g();
    }

    public final void m(Context context, boolean z10) {
        AbstractC5504s.h(context, "context");
        l(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z10);
    }
}
