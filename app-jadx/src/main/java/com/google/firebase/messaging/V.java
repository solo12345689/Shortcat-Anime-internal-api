package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import n9.InterfaceC5762f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class V {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    static void e(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(final Context context, H h10, final boolean z10) {
        if (com.google.android.gms.common.util.l.g() && !d(b(context), z10)) {
            h10.k(z10).f(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5762f() { // from class: com.google.firebase.messaging.U
                @Override // n9.InterfaceC5762f
                public final void onSuccess(Object obj) {
                    V.g(context, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
