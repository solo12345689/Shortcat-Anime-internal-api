package x6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s5.InterfaceC6433d;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C {

    /* JADX INFO: renamed from: b */
    private static final Class f63932b = C.class;

    /* JADX INFO: renamed from: a */
    private Map f63933a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        AbstractC7283a.y(f63932b, "Count = %d", Integer.valueOf(this.f63933a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f63933a.values());
            this.f63933a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            E6.k kVar = (E6.k) arrayList.get(i10);
            if (kVar != null) {
                kVar.close();
            }
        }
    }

    public synchronized boolean b(InterfaceC6433d interfaceC6433d) {
        y5.k.g(interfaceC6433d);
        if (!this.f63933a.containsKey(interfaceC6433d)) {
            return false;
        }
        E6.k kVar = (E6.k) this.f63933a.get(interfaceC6433d);
        synchronized (kVar) {
            if (E6.k.Y(kVar)) {
                return true;
            }
            this.f63933a.remove(interfaceC6433d);
            AbstractC7283a.G(f63932b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), interfaceC6433d.a(), Integer.valueOf(System.identityHashCode(interfaceC6433d)));
            return false;
        }
    }

    public synchronized E6.k c(InterfaceC6433d interfaceC6433d) {
        y5.k.g(interfaceC6433d);
        E6.k kVarB = (E6.k) this.f63933a.get(interfaceC6433d);
        if (kVarB != null) {
            synchronized (kVarB) {
                if (!E6.k.Y(kVarB)) {
                    this.f63933a.remove(interfaceC6433d);
                    AbstractC7283a.G(f63932b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVarB)), interfaceC6433d.a(), Integer.valueOf(System.identityHashCode(interfaceC6433d)));
                    return null;
                }
                kVarB = E6.k.b(kVarB);
            }
        }
        return kVarB;
    }

    public synchronized void f(InterfaceC6433d interfaceC6433d, E6.k kVar) {
        y5.k.g(interfaceC6433d);
        y5.k.b(Boolean.valueOf(E6.k.Y(kVar)));
        E6.k.g((E6.k) this.f63933a.put(interfaceC6433d, E6.k.b(kVar)));
        e();
    }

    public boolean g(InterfaceC6433d interfaceC6433d) {
        E6.k kVar;
        y5.k.g(interfaceC6433d);
        synchronized (this) {
            kVar = (E6.k) this.f63933a.remove(interfaceC6433d);
        }
        if (kVar == null) {
            return false;
        }
        try {
            return kVar.S();
        } finally {
            kVar.close();
        }
    }

    public synchronized boolean h(InterfaceC6433d interfaceC6433d, E6.k kVar) {
        y5.k.g(interfaceC6433d);
        y5.k.g(kVar);
        y5.k.b(Boolean.valueOf(E6.k.Y(kVar)));
        E6.k kVar2 = (E6.k) this.f63933a.get(interfaceC6433d);
        if (kVar2 == null) {
            return false;
        }
        C5.a aVarJ = kVar2.j();
        C5.a aVarJ2 = kVar.j();
        if (aVarJ != null && aVarJ2 != null) {
            try {
                if (aVarJ.C() == aVarJ2.C()) {
                    this.f63933a.remove(interfaceC6433d);
                    C5.a.m(aVarJ2);
                    C5.a.m(aVarJ);
                    E6.k.g(kVar2);
                    e();
                    return true;
                }
            } finally {
                C5.a.m(aVarJ2);
                C5.a.m(aVarJ);
                E6.k.g(kVar2);
            }
        }
        return false;
    }
}
