package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a */
    private static final String f35152a = "a";

    /* JADX INFO: renamed from: b */
    private static final a f35153b = new a();

    /* JADX INFO: renamed from: c */
    private static volatile b f35154c;

    private a() {
    }

    static a a() {
        return f35153b;
    }

    boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }

    b a(Context context) {
        if (f35154c == null) {
            synchronized (a.class) {
                try {
                    if (f35154c == null) {
                        if (b(context)) {
                            f35154c = new com.amazon.device.simplesignin.a.c.b();
                            com.amazon.device.simplesignin.a.d.a.a(f35152a, "SDK initialized in Sandbox mode.");
                        } else {
                            f35154c = new com.amazon.device.simplesignin.a.a.b();
                            com.amazon.device.simplesignin.a.d.a.a(f35152a, "SDK initialized in Production mode.");
                        }
                    }
                } finally {
                }
            }
        }
        return f35154c;
    }
}
