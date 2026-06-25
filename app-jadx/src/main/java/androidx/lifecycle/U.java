package androidx.lifecycle;

import Td.InterfaceC2154e;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC5504s;
import o2.C5808g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    private final C5808g impl = new C5808g();

    public final void addCloseable(String key, AutoCloseable closeable) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(closeable, "closeable");
        C5808g c5808g = this.impl;
        if (c5808g != null) {
            c5808g.e(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C5808g c5808g = this.impl;
        if (c5808g != null) {
            c5808g.f();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        AbstractC5504s.h(key, "key");
        C5808g c5808g = this.impl;
        if (c5808g != null) {
            return (T) c5808g.h(key);
        }
        return null;
    }

    public void addCloseable(AutoCloseable closeable) {
        AbstractC5504s.h(closeable, "closeable");
        C5808g c5808g = this.impl;
        if (c5808g != null) {
            c5808g.d(closeable);
        }
    }

    @InterfaceC2154e
    public /* synthetic */ void addCloseable(Closeable closeable) {
        AbstractC5504s.h(closeable, "closeable");
        C5808g c5808g = this.impl;
        if (c5808g != null) {
            c5808g.d(closeable);
        }
    }

    protected void onCleared() {
    }
}
