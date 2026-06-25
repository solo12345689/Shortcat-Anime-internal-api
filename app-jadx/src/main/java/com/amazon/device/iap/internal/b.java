package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    private static b f35039a = new b();

    /* JADX INFO: renamed from: b */
    private static final String f35040b = b.class.getName();

    /* JADX INFO: renamed from: c */
    private static volatile e f35041c;

    private b() {
    }

    public static b a() {
        return f35039a;
    }

    public e a(Context context) {
        if (f35041c == null) {
            synchronized (b.class) {
                try {
                    if (f35041c == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f35041c = new com.amazon.device.iap.internal.c.e();
                        } else {
                            f35041c = new com.amazon.device.iap.internal.a.d();
                        }
                    }
                } finally {
                }
            }
        }
        return f35041c;
    }
}
