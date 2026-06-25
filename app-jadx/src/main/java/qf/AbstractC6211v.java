package qf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: qf.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6211v implements v0 {

    /* JADX INFO: renamed from: a */
    private int f58117a;

    private final boolean c(InterfaceC7230h interfaceC7230h) {
        return (sf.l.m(interfaceC7230h) || bf.i.E(interfaceC7230h)) ? false : true;
    }

    protected final boolean b(InterfaceC7230h first, InterfaceC7230h second) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        if (!AbstractC5504s.c(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC7235m interfaceC7235mB = first.b();
        for (InterfaceC7235m interfaceC7235mB2 = second.b(); interfaceC7235mB != null && interfaceC7235mB2 != null; interfaceC7235mB2 = interfaceC7235mB2.b()) {
            if (interfaceC7235mB instanceof ye.H) {
                return interfaceC7235mB2 instanceof ye.H;
            }
            if (interfaceC7235mB2 instanceof ye.H) {
                return false;
            }
            if (interfaceC7235mB instanceof ye.N) {
                return (interfaceC7235mB2 instanceof ye.N) && AbstractC5504s.c(((ye.N) interfaceC7235mB).f(), ((ye.N) interfaceC7235mB2).f());
            }
            if ((interfaceC7235mB2 instanceof ye.N) || !AbstractC5504s.c(interfaceC7235mB.getName(), interfaceC7235mB2.getName())) {
                return false;
            }
            interfaceC7235mB = interfaceC7235mB.b();
        }
        return true;
    }

    protected abstract boolean d(InterfaceC7230h interfaceC7230h);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0) || obj.hashCode() != hashCode()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC7230h interfaceC7230hP = p();
        InterfaceC7230h interfaceC7230hP2 = v0Var.p();
        if (interfaceC7230hP2 != null && c(interfaceC7230hP) && c(interfaceC7230hP2)) {
            return d(interfaceC7230hP2);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f58117a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC7230h interfaceC7230hP = p();
        int iHashCode = c(interfaceC7230hP) ? bf.i.m(interfaceC7230hP).hashCode() : System.identityHashCode(this);
        this.f58117a = iHashCode;
        return iHashCode;
    }

    @Override // qf.v0
    public abstract InterfaceC7230h p();
}
