package h5;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k5.InterfaceC5451c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f47629a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f47630b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47631c;

    public boolean a(InterfaceC5451c interfaceC5451c) {
        boolean z10 = true;
        if (interfaceC5451c == null) {
            return true;
        }
        boolean zRemove = this.f47629a.remove(interfaceC5451c);
        if (!this.f47630b.remove(interfaceC5451c) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC5451c.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = o5.l.k(this.f47629a).iterator();
        while (it.hasNext()) {
            a((InterfaceC5451c) it.next());
        }
        this.f47630b.clear();
    }

    public void c() {
        this.f47631c = true;
        for (InterfaceC5451c interfaceC5451c : o5.l.k(this.f47629a)) {
            if (interfaceC5451c.isRunning() || interfaceC5451c.isComplete()) {
                interfaceC5451c.clear();
                this.f47630b.add(interfaceC5451c);
            }
        }
    }

    public void d() {
        this.f47631c = true;
        for (InterfaceC5451c interfaceC5451c : o5.l.k(this.f47629a)) {
            if (interfaceC5451c.isRunning()) {
                interfaceC5451c.pause();
                this.f47630b.add(interfaceC5451c);
            }
        }
    }

    public void e() {
        for (InterfaceC5451c interfaceC5451c : o5.l.k(this.f47629a)) {
            if (!interfaceC5451c.isComplete() && !interfaceC5451c.isCleared()) {
                interfaceC5451c.clear();
                if (this.f47631c) {
                    this.f47630b.add(interfaceC5451c);
                } else {
                    interfaceC5451c.begin();
                }
            }
        }
    }

    public void f() {
        this.f47631c = false;
        for (InterfaceC5451c interfaceC5451c : o5.l.k(this.f47629a)) {
            if (!interfaceC5451c.isComplete() && !interfaceC5451c.isRunning()) {
                interfaceC5451c.begin();
            }
        }
        this.f47630b.clear();
    }

    public void g(InterfaceC5451c interfaceC5451c) {
        this.f47629a.add(interfaceC5451c);
        if (!this.f47631c) {
            interfaceC5451c.begin();
            return;
        }
        interfaceC5451c.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f47630b.add(interfaceC5451c);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f47629a.size() + ", isPaused=" + this.f47631c + "}";
    }
}
