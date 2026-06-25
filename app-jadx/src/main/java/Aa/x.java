package aa;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ma.InterfaceC5655b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class x implements InterfaceC5655b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f23907b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f23906a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f23906a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f23906a.iterator();
            while (it.hasNext()) {
                this.f23907b.add(((InterfaceC5655b) it.next()).get());
            }
            this.f23906a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(InterfaceC5655b interfaceC5655b) {
        try {
            if (this.f23907b == null) {
                this.f23906a.add(interfaceC5655b);
            } else {
                this.f23907b.add(interfaceC5655b.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ma.InterfaceC5655b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f23907b == null) {
            synchronized (this) {
                try {
                    if (this.f23907b == null) {
                        this.f23907b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f23907b);
    }
}
