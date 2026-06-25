package bf;

import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jf.C5380d;
import jf.InterfaceC5387k;
import jf.InterfaceC5390n;
import kotlin.jvm.internal.AbstractC5504s;
import ye.E;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.N;
import ye.l0;

/* JADX INFO: renamed from: bf.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3050a extends t {

    /* JADX INFO: renamed from: a */
    public static final C3050a f33289a = new C3050a();

    /* JADX INFO: renamed from: bf.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0560a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(ff.e.o((InterfaceC7227e) obj).a(), ff.e.o((InterfaceC7227e) obj2).a());
        }
    }

    private C3050a() {
    }

    private static final void b(InterfaceC7227e interfaceC7227e, LinkedHashSet linkedHashSet, InterfaceC5387k interfaceC5387k, boolean z10) {
        for (InterfaceC7235m interfaceC7235m : InterfaceC5390n.a.a(interfaceC5387k, C5380d.f51776t, null, 2, null)) {
            if (interfaceC7235m instanceof InterfaceC7227e) {
                InterfaceC7227e interfaceC7227eU = (InterfaceC7227e) interfaceC7235m;
                if (interfaceC7227eU.m0()) {
                    Xe.f name = interfaceC7227eU.getName();
                    AbstractC5504s.g(name, "getName(...)");
                    InterfaceC7230h interfaceC7230hE = interfaceC5387k.e(name, Ge.d.f7467m);
                    interfaceC7227eU = interfaceC7230hE instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE : interfaceC7230hE instanceof l0 ? ((l0) interfaceC7230hE).u() : null;
                }
                if (interfaceC7227eU != null) {
                    if (i.z(interfaceC7227eU, interfaceC7227e)) {
                        linkedHashSet.add(interfaceC7227eU);
                    }
                    if (z10) {
                        InterfaceC5387k interfaceC5387kU = interfaceC7227eU.U();
                        AbstractC5504s.g(interfaceC5387kU, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC7227e, linkedHashSet, interfaceC5387kU, z10);
                    }
                }
            }
        }
    }

    public Collection a(InterfaceC7227e sealedClass, boolean z10) {
        Object next;
        InterfaceC7235m interfaceC7235mB;
        AbstractC5504s.h(sealedClass, "sealedClass");
        if (sealedClass.r() != E.f65061c) {
            return AbstractC2279u.m();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = ff.e.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC7235m) next) instanceof N) {
                    break;
                }
            }
            interfaceC7235mB = (InterfaceC7235m) next;
        } else {
            interfaceC7235mB = sealedClass.b();
        }
        if (interfaceC7235mB instanceof N) {
            b(sealedClass, linkedHashSet, ((N) interfaceC7235mB).o(), z10);
        }
        InterfaceC5387k interfaceC5387kU = sealedClass.U();
        AbstractC5504s.g(interfaceC5387kU, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, interfaceC5387kU, true);
        return AbstractC2279u.R0(linkedHashSet, new C0560a());
    }
}
