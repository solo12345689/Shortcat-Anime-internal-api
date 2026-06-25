package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: qf.l0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6199l0 {

    /* JADX INFO: renamed from: qf.l0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends w0 {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f58067d;

        a(List list) {
            this.f58067d = list;
        }

        @Override // qf.w0
        public B0 k(v0 key) {
            AbstractC5504s.h(key, "key");
            if (!this.f58067d.contains(key)) {
                return null;
            }
            InterfaceC7230h interfaceC7230hP = key.p();
            AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return J0.s((ye.m0) interfaceC7230hP);
        }
    }

    private static final S a(List list, List list2, ve.i iVar) {
        S sP = G0.g(new a(list)).p((S) AbstractC2279u.m0(list2), N0.f58001g);
        if (sP != null) {
            return sP;
        }
        AbstractC6183d0 abstractC6183d0Z = iVar.z();
        AbstractC5504s.g(abstractC6183d0Z, "getDefaultBound(...)");
        return abstractC6183d0Z;
    }

    public static final S b(ye.m0 m0Var) {
        AbstractC5504s.h(m0Var, "<this>");
        InterfaceC7235m interfaceC7235mB = m0Var.b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        if (interfaceC7235mB instanceof InterfaceC7231i) {
            List parameters = ((InterfaceC7231i) interfaceC7235mB).l().getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                v0 v0VarL = ((ye.m0) it.next()).l();
                AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
                arrayList.add(v0VarL);
            }
            List upperBounds = m0Var.getUpperBounds();
            AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, ff.e.m(m0Var));
        }
        if (!(interfaceC7235mB instanceof InterfaceC7247z)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC7247z) interfaceC7235mB).getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            v0 v0VarL2 = ((ye.m0) it2.next()).l();
            AbstractC5504s.g(v0VarL2, "getTypeConstructor(...)");
            arrayList2.add(v0VarL2);
        }
        List upperBounds2 = m0Var.getUpperBounds();
        AbstractC5504s.g(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, ff.e.m(m0Var));
    }
}
