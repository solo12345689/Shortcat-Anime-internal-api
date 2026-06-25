package Ke;

import He.E;
import Oe.z;
import Td.AbstractC2163n;
import Td.q;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7229g;
import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final k c(k kVar, p typeParameterResolver) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(typeParameterResolver, "typeParameterResolver");
        return new k(kVar.a(), typeParameterResolver, kVar.c());
    }

    private static final k d(k kVar, InterfaceC7235m interfaceC7235m, z zVar, int i10, Lazy lazy) {
        return new k(kVar.a(), zVar != null ? new m(kVar, interfaceC7235m, zVar, i10) : kVar.f(), lazy);
    }

    public static final k e(k kVar, InterfaceC7229g containingDeclaration, z zVar, int i10) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        return d(kVar, containingDeclaration, zVar, i10, AbstractC2163n.a(q.f17463c, new a(kVar, containingDeclaration)));
    }

    public static /* synthetic */ k f(k kVar, InterfaceC7229g interfaceC7229g, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, interfaceC7229g, zVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E g(k kVar, InterfaceC7229g interfaceC7229g) {
        return j(kVar, interfaceC7229g.getAnnotations());
    }

    public static final k h(k kVar, InterfaceC7235m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(typeParameterOwner, "typeParameterOwner");
        return d(kVar, containingDeclaration, typeParameterOwner, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, InterfaceC7235m interfaceC7235m, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, interfaceC7235m, zVar, i10);
    }

    public static final E j(k kVar, InterfaceC7374h additionalAnnotations) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), additionalAnnotations);
    }

    public static final k k(k kVar, InterfaceC7374h additionalAnnotations) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), AbstractC2163n.a(q.f17463c, new b(kVar, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E l(k kVar, InterfaceC7374h interfaceC7374h) {
        return j(kVar, interfaceC7374h);
    }

    public static final k m(k kVar, d components) {
        AbstractC5504s.h(kVar, "<this>");
        AbstractC5504s.h(components, "components");
        return new k(components, kVar.f(), kVar.c());
    }
}
