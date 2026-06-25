package Qe;

import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5504s;
import qf.B0;
import qf.J0;
import qf.N0;
import qf.Q;
import qf.S;
import qf.v0;
import vf.AbstractC6867d;
import ye.EnumC7228f;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.N;
import ye.a0;
import ye.l0;
import ye.m0;

/* JADX INFO: renamed from: Qe.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2091j {
    public static final String a(InterfaceC7227e klass, G typeMappingConfiguration) {
        AbstractC5504s.h(klass, "klass");
        AbstractC5504s.h(typeMappingConfiguration, "typeMappingConfiguration");
        String strE = typeMappingConfiguration.e(klass);
        if (strE != null) {
            return strE;
        }
        InterfaceC7235m interfaceC7235mB = klass.b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        String strH = Xe.h.b(klass.getName()).h();
        AbstractC5504s.g(strH, "getIdentifier(...)");
        if (interfaceC7235mB instanceof N) {
            Xe.c cVarF = ((N) interfaceC7235mB).f();
            if (cVarF.c()) {
                return strH;
            }
            return Df.r.J(cVarF.a(), com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null) + '/' + strH;
        }
        InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
        if (interfaceC7227e == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC7235mB + " for " + klass);
        }
        String strB = typeMappingConfiguration.b(interfaceC7227e);
        if (strB == null) {
            strB = a(interfaceC7227e, typeMappingConfiguration);
        }
        return strB + '$' + strH;
    }

    public static /* synthetic */ String b(InterfaceC7227e interfaceC7227e, G g10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = H.f14806a;
        }
        return a(interfaceC7227e, g10);
    }

    public static final boolean c(InterfaceC7223a descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC7234l) {
            return true;
        }
        S returnType = descriptor.getReturnType();
        AbstractC5504s.e(returnType);
        if (!ve.i.D0(returnType)) {
            return false;
        }
        S returnType2 = descriptor.getReturnType();
        AbstractC5504s.e(returnType2);
        return (J0.l(returnType2) || (descriptor instanceof a0)) ? false : true;
    }

    public static final Object d(S kotlinType, t factory, I mode, G typeMappingConfiguration, q qVar, InterfaceC5096o writeGenericType) {
        Object objC;
        S s10;
        Object objD;
        AbstractC5504s.h(kotlinType, "kotlinType");
        AbstractC5504s.h(factory, "factory");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(typeMappingConfiguration, "typeMappingConfiguration");
        AbstractC5504s.h(writeGenericType, "writeGenericType");
        S sA = typeMappingConfiguration.a(kotlinType);
        if (sA != null) {
            return d(sA, factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        if (ve.h.r(kotlinType)) {
            return d(ve.p.a(kotlinType), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        rf.s sVar = rf.s.f58800a;
        Object objB = J.b(sVar, kotlinType, factory, mode);
        if (objB != null) {
            Object objA = J.a(factory, objB, mode.d());
            writeGenericType.invoke(kotlinType, objA, mode);
            return objA;
        }
        v0 v0VarN0 = kotlinType.N0();
        if (v0VarN0 instanceof Q) {
            Q q10 = (Q) v0VarN0;
            S sH = q10.h();
            if (sH == null) {
                sH = typeMappingConfiguration.f(q10.k());
            }
            return d(AbstractC6867d.D(sH), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
        }
        InterfaceC7230h interfaceC7230hP = v0VarN0.p();
        if (interfaceC7230hP == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (sf.l.m(interfaceC7230hP)) {
            Object objE = factory.e("error/NonExistentClass");
            typeMappingConfiguration.d(kotlinType, (InterfaceC7227e) interfaceC7230hP);
            return objE;
        }
        boolean z10 = interfaceC7230hP instanceof InterfaceC7227e;
        if (z10 && ve.i.d0(kotlinType)) {
            if (kotlinType.L0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            B0 b02 = (B0) kotlinType.L0().get(0);
            S type = b02.getType();
            AbstractC5504s.g(type, "getType(...)");
            if (b02.b() == N0.f58000f) {
                objD = factory.e("java/lang/Object");
            } else {
                N0 n0B = b02.b();
                AbstractC5504s.g(n0B, "getProjectionKind(...)");
                objD = d(type, factory, mode.f(n0B, true), typeMappingConfiguration, qVar, writeGenericType);
            }
            return factory.b('[' + factory.d(objD));
        }
        if (!z10) {
            if (interfaceC7230hP instanceof m0) {
                S sO = AbstractC6867d.o((m0) interfaceC7230hP);
                if (kotlinType.O0()) {
                    sO = AbstractC6867d.B(sO);
                }
                return d(sO, factory, mode, typeMappingConfiguration, null, Af.i.l());
            }
            if ((interfaceC7230hP instanceof l0) && mode.b()) {
                return d(((l0) interfaceC7230hP).G(), factory, mode, typeMappingConfiguration, qVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (bf.k.b(interfaceC7230hP) && !mode.c() && (s10 = (S) qf.H.a(sVar, kotlinType)) != null) {
            return d(s10, factory, mode.g(), typeMappingConfiguration, qVar, writeGenericType);
        }
        if (mode.e() && ve.i.m0((InterfaceC7227e) interfaceC7230hP)) {
            objC = factory.f();
        } else {
            InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7230hP;
            InterfaceC7227e interfaceC7227eA = interfaceC7227e.a();
            AbstractC5504s.g(interfaceC7227eA, "getOriginal(...)");
            objC = typeMappingConfiguration.c(interfaceC7227eA);
            if (objC == null) {
                if (interfaceC7227e.h() == EnumC7228f.f65100e) {
                    InterfaceC7235m interfaceC7235mB = interfaceC7227e.b();
                    AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC7227e = (InterfaceC7227e) interfaceC7235mB;
                }
                InterfaceC7227e interfaceC7227eA2 = interfaceC7227e.a();
                AbstractC5504s.g(interfaceC7227eA2, "getOriginal(...)");
                objC = factory.e(a(interfaceC7227eA2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, objC, mode);
        return objC;
    }

    public static /* synthetic */ Object e(S s10, t tVar, I i10, G g10, q qVar, InterfaceC5096o interfaceC5096o, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            interfaceC5096o = Af.i.l();
        }
        return d(s10, tVar, i10, g10, qVar, interfaceC5096o);
    }
}
