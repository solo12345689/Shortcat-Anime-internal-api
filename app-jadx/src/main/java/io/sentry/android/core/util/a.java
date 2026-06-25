package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f50020a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0781a f50021b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0781a {
        Object a(Context context);
    }

    public a(InterfaceC0781a interfaceC0781a) {
        this.f50021b = interfaceC0781a;
    }

    public Object a(Context context) {
        if (this.f50020a == null) {
            synchronized (this) {
                try {
                    if (this.f50020a == null) {
                        this.f50020a = this.f50021b.a(context);
                    }
                } finally {
                }
            }
        }
        return this.f50020a;
    }
}
