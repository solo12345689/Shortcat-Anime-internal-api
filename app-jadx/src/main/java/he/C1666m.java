package He;

import Ud.AbstractC2279u;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7224b;

/* JADX INFO: renamed from: He.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1666m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1666m f8568a = new C1666m();

    private C1666m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        return f8568a.d(it);
    }

    private final boolean e(InterfaceC7224b interfaceC7224b) {
        if (AbstractC2279u.e0(C1663j.f8561a.c(), ff.e.k(interfaceC7224b)) && interfaceC7224b.j().isEmpty()) {
            return true;
        }
        if (!ve.i.h0(interfaceC7224b)) {
            return false;
        }
        Collection collectionE = interfaceC7224b.e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC7224b> collection = collectionE;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC7224b interfaceC7224b2 : collection) {
            C1666m c1666m = f8568a;
            AbstractC5504s.e(interfaceC7224b2);
            if (c1666m.d(interfaceC7224b2)) {
                return true;
            }
        }
        return false;
    }

    public final String b(InterfaceC7224b interfaceC7224b) {
        Xe.f fVar;
        AbstractC5504s.h(interfaceC7224b, "<this>");
        ve.i.h0(interfaceC7224b);
        InterfaceC7224b interfaceC7224bI = ff.e.i(ff.e.w(interfaceC7224b), false, C1665l.f8567a, 1, null);
        if (interfaceC7224bI == null || (fVar = (Xe.f) C1663j.f8561a.a().get(ff.e.o(interfaceC7224bI))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean d(InterfaceC7224b callableMemberDescriptor) {
        AbstractC5504s.h(callableMemberDescriptor, "callableMemberDescriptor");
        if (C1663j.f8561a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }
}
