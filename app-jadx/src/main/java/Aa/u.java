package aa;

import ja.C5356a;
import ja.InterfaceC5357b;
import ja.InterfaceC5358c;
import ja.InterfaceC5359d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class u implements InterfaceC5359d, InterfaceC5358c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23900a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f23901b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f23902c;

    u(Executor executor) {
        this.f23902c = executor;
    }

    private synchronized Set g(C5356a c5356a) {
        Map map;
        try {
            map = (Map) this.f23900a.get(c5356a.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    @Override // ja.InterfaceC5359d
    public synchronized void a(Class cls, Executor executor, InterfaceC5357b interfaceC5357b) {
        try {
            AbstractC2590C.b(cls);
            AbstractC2590C.b(interfaceC5357b);
            AbstractC2590C.b(executor);
            if (!this.f23900a.containsKey(cls)) {
                this.f23900a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f23900a.get(cls)).put(interfaceC5357b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ja.InterfaceC5358c
    public void b(final C5356a c5356a) {
        AbstractC2590C.b(c5356a);
        synchronized (this) {
            try {
                Queue queue = this.f23901b;
                if (queue != null) {
                    queue.add(c5356a);
                    return;
                }
                for (final Map.Entry entry : g(c5356a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: aa.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC5357b) entry.getKey()).a(c5356a);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ja.InterfaceC5359d
    public synchronized void c(Class cls, InterfaceC5357b interfaceC5357b) {
        AbstractC2590C.b(cls);
        AbstractC2590C.b(interfaceC5357b);
        if (this.f23900a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f23900a.get(cls);
            concurrentHashMap.remove(interfaceC5357b);
            if (concurrentHashMap.isEmpty()) {
                this.f23900a.remove(cls);
            }
        }
    }

    @Override // ja.InterfaceC5359d
    public void d(Class cls, InterfaceC5357b interfaceC5357b) {
        a(cls, this.f23902c, interfaceC5357b);
    }

    void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f23901b;
                if (queue != null) {
                    this.f23901b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                b((C5356a) it.next());
            }
        }
    }
}
