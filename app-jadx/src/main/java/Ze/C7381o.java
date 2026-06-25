package ze;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ze.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7381o implements InterfaceC7374h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f66235a;

    public C7381o(List delegates) {
        AbstractC5504s.h(delegates, "delegates");
        this.f66235a = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7369c e(Xe.c cVar, InterfaceC7374h it) {
        AbstractC5504s.h(it, "it");
        return it.h(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cf.i f(InterfaceC7374h it) {
        AbstractC5504s.h(it, "it");
        return AbstractC2279u.c0(it);
    }

    @Override // ze.InterfaceC7374h
    public InterfaceC7369c h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return (InterfaceC7369c) Cf.l.D(Cf.l.L(AbstractC2279u.c0(this.f66235a), new C7379m(fqName)));
    }

    @Override // ze.InterfaceC7374h
    public boolean isEmpty() {
        List list = this.f66235a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC7374h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Cf.l.E(AbstractC2279u.c0(this.f66235a), C7380n.f66234a).iterator();
    }

    @Override // ze.InterfaceC7374h
    public boolean k0(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        Iterator it = AbstractC2279u.c0(this.f66235a).iterator();
        while (it.hasNext()) {
            if (((InterfaceC7374h) it.next()).k0(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7381o(InterfaceC7374h... delegates) {
        this(AbstractC2273n.V0(delegates));
        AbstractC5504s.h(delegates, "delegates");
    }
}
