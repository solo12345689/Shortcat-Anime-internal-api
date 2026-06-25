package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N implements InterfaceC3393u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f39100a = new C6551a();

    static N b(Context context, String str, Runnable runnable) {
        if (AbstractC3370m.b()) {
            throw null;
        }
        synchronized (N.class) {
            android.support.v4.media.session.b.a(f39100a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    static synchronized void c() {
        Map map = f39100a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        map.clear();
    }
}
