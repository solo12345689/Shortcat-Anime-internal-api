package o2;

import Td.L;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: o2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5808g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5807f f54231a = new C5807f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f54232b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f54233c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f54234d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                z1.e.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(AutoCloseable closeable) {
        AbstractC5504s.h(closeable, "closeable");
        if (this.f54234d) {
            g(closeable);
            return;
        }
        synchronized (this.f54231a) {
            this.f54233c.add(closeable);
            L l10 = L.f17438a;
        }
    }

    public final void e(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(closeable, "closeable");
        if (this.f54234d) {
            g(closeable);
            return;
        }
        synchronized (this.f54231a) {
            autoCloseable = (AutoCloseable) this.f54232b.put(key, closeable);
        }
        g(autoCloseable);
    }

    public final void f() {
        if (this.f54234d) {
            return;
        }
        this.f54234d = true;
        synchronized (this.f54231a) {
            try {
                Iterator it = this.f54232b.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it2 = this.f54233c.iterator();
                while (it2.hasNext()) {
                    g((AutoCloseable) it2.next());
                }
                this.f54233c.clear();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AutoCloseable h(String key) {
        AutoCloseable autoCloseable;
        AbstractC5504s.h(key, "key");
        synchronized (this.f54231a) {
            autoCloseable = (AutoCloseable) this.f54232b.get(key);
        }
        return autoCloseable;
    }
}
