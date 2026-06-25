package ye;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ye.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7246y {

    /* JADX INFO: renamed from: ye.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends kotlin.jvm.internal.F {

        /* JADX INFO: renamed from: b */
        public static final a f65153b = ;

        a() {
        }

        @Override // kotlin.jvm.internal.F, pe.InterfaceC6025o
        public Object get(Object obj) {
            return ((Xe.b) obj).e();
        }
    }

    public static final InterfaceC7227e b(H h10, Xe.b classId) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(classId, "classId");
        InterfaceC7230h interfaceC7230hC = c(h10, classId);
        if (interfaceC7230hC instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hC;
        }
        return null;
    }

    public static final InterfaceC7230h c(H h10, Xe.b classId) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(classId, "classId");
        H hA = bf.s.a(h10);
        if (hA == null) {
            V vS = h10.S(classId.f());
            List listE = classId.g().e();
            InterfaceC7230h interfaceC7230hE = vS.o().e((Xe.f) AbstractC2279u.m0(listE), Ge.d.f7472r);
            if (interfaceC7230hE == null) {
                return null;
            }
            for (Xe.f fVar : listE.subList(1, listE.size())) {
                if (!(interfaceC7230hE instanceof InterfaceC7227e)) {
                    return null;
                }
                InterfaceC7230h interfaceC7230hE2 = ((InterfaceC7227e) interfaceC7230hE).U().e(fVar, Ge.d.f7472r);
                interfaceC7230hE = interfaceC7230hE2 instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE2 : null;
                if (interfaceC7230hE == null) {
                    return null;
                }
            }
            return interfaceC7230hE;
        }
        V vS2 = hA.S(classId.f());
        List listE2 = classId.g().e();
        InterfaceC7230h interfaceC7230hE3 = vS2.o().e((Xe.f) AbstractC2279u.m0(listE2), Ge.d.f7472r);
        if (interfaceC7230hE3 == null) {
            interfaceC7230hE3 = null;
            break;
        }
        for (Xe.f fVar2 : listE2.subList(1, listE2.size())) {
            if (interfaceC7230hE3 instanceof InterfaceC7227e) {
                InterfaceC7230h interfaceC7230hE4 = ((InterfaceC7227e) interfaceC7230hE3).U().e(fVar2, Ge.d.f7472r);
                interfaceC7230hE3 = interfaceC7230hE4 instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE4 : null;
                if (interfaceC7230hE3 != null) {
                }
            }
            interfaceC7230hE3 = null;
        }
        if (interfaceC7230hE3 != null) {
            return interfaceC7230hE3;
        }
        V vS3 = h10.S(classId.f());
        List listE3 = classId.g().e();
        InterfaceC7230h interfaceC7230hE5 = vS3.o().e((Xe.f) AbstractC2279u.m0(listE3), Ge.d.f7472r);
        if (interfaceC7230hE5 == null) {
            return null;
        }
        for (Xe.f fVar3 : listE3.subList(1, listE3.size())) {
            if (!(interfaceC7230hE5 instanceof InterfaceC7227e)) {
                return null;
            }
            InterfaceC7230h interfaceC7230hE6 = ((InterfaceC7227e) interfaceC7230hE5).U().e(fVar3, Ge.d.f7472r);
            interfaceC7230hE5 = interfaceC7230hE6 instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE6 : null;
            if (interfaceC7230hE5 == null) {
                return null;
            }
        }
        return interfaceC7230hE5;
    }

    public static final InterfaceC7227e d(H h10, Xe.b classId, M notFoundClasses) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(classId, "classId");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        InterfaceC7227e interfaceC7227eB = b(h10, classId);
        return interfaceC7227eB != null ? interfaceC7227eB : notFoundClasses.d(classId, Cf.l.T(Cf.l.K(Cf.l.p(classId, a.f65153b), C7245x.f65150a)));
    }

    public static final int e(Xe.b it) {
        AbstractC5504s.h(it, "it");
        return 0;
    }

    public static final l0 f(H h10, Xe.b classId) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(classId, "classId");
        InterfaceC7230h interfaceC7230hC = c(h10, classId);
        if (interfaceC7230hC instanceof l0) {
            return (l0) interfaceC7230hC;
        }
        return null;
    }
}
