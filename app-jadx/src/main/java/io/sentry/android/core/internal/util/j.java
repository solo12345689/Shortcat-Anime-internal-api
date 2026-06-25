package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import io.sentry.util.runtime.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements io.sentry.util.runtime.a {
    public static /* synthetic */ Object c(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // io.sentry.util.runtime.a
    public Object a(a.InterfaceC0806a interfaceC0806a) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return interfaceC0806a.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.a
    public void b(final Runnable runnable) {
        a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.internal.util.i
            @Override // io.sentry.util.runtime.a.InterfaceC0806a
            public final Object run() {
                return j.c(runnable);
            }
        });
    }
}
