package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private static a f34941a = new a();

    /* JADX INFO: renamed from: b */
    private static volatile c f34942b;

    private a() {
    }

    public static a a() {
        return f34941a;
    }

    public c a(Context context) {
        if (f34942b == null) {
            synchronized (a.class) {
                try {
                    if (f34942b == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f34942b = new com.amazon.device.drm.a.d.c();
                        } else {
                            f34942b = new com.amazon.device.drm.a.b.c();
                        }
                    }
                } finally {
                }
            }
        }
        return f34942b;
    }
}
