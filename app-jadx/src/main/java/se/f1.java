package se;

import Ee.AbstractC1527f;
import Ve.a;
import We.d;
import Ze.i;
import gf.EnumC4882e;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;
import of.InterfaceC5879b;
import of.InterfaceC5896t;
import se.AbstractC6503n;
import se.AbstractC6507p;
import ve.o;
import xe.C7137a;
import xe.C7139c;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f59496a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Xe.b f59497b = Xe.b.f21759d.c(new Xe.c("java.lang.Void"));

    private f1() {
    }

    private final ve.l a(Class cls) {
        if (cls.isPrimitive()) {
            return EnumC4882e.b(cls.getSimpleName()).m();
        }
        return null;
    }

    private final boolean b(InterfaceC7247z interfaceC7247z) {
        if (bf.h.p(interfaceC7247z) || bf.h.q(interfaceC7247z)) {
            return true;
        }
        return AbstractC5504s.c(interfaceC7247z.getName(), C7137a.f64371e.a()) && interfaceC7247z.j().isEmpty();
    }

    private final AbstractC6503n.e d(InterfaceC7247z interfaceC7247z) {
        return new AbstractC6503n.e(new d.b(e(interfaceC7247z), Qe.C.c(interfaceC7247z, false, false, 1, null)));
    }

    private final String e(InterfaceC7224b interfaceC7224b) {
        String strE = He.T.e(interfaceC7224b);
        if (strE != null) {
            return strE;
        }
        if (interfaceC7224b instanceof ye.a0) {
            String strB = ff.e.w(interfaceC7224b).getName().b();
            AbstractC5504s.g(strB, "asString(...)");
            return He.H.b(strB);
        }
        if (interfaceC7224b instanceof ye.b0) {
            String strB2 = ff.e.w(interfaceC7224b).getName().b();
            AbstractC5504s.g(strB2, "asString(...)");
            return He.H.e(strB2);
        }
        String strB3 = interfaceC7224b.getName().b();
        AbstractC5504s.g(strB3, "asString(...)");
        return strB3;
    }

    public final Xe.b c(Class klass) {
        Xe.b bVarM;
        AbstractC5504s.h(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            AbstractC5504s.g(componentType, "getComponentType(...)");
            ve.l lVarA = a(componentType);
            return lVarA != null ? new Xe.b(ve.o.f62147A, lVarA.m()) : Xe.b.f21759d.c(o.a.f62247i.m());
        }
        if (AbstractC5504s.c(klass, Void.TYPE)) {
            return f59497b;
        }
        ve.l lVarA2 = a(klass);
        if (lVarA2 != null) {
            return new Xe.b(ve.o.f62147A, lVarA2.q());
        }
        Xe.b bVarE = AbstractC1527f.e(klass);
        return (bVarE.i() || (bVarM = C7139c.f64375a.m(bVarE.a())) == null) ? bVarE : bVarM;
    }

    public final AbstractC6507p f(ye.Z possiblyOverriddenProperty) {
        AbstractC5504s.h(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        ye.Z zA = ((ye.Z) bf.i.L(possiblyOverriddenProperty)).a();
        AbstractC5504s.g(zA, "getOriginal(...)");
        if (zA instanceof of.N) {
            of.N n10 = (of.N) zA;
            Se.o oVarH0 = n10.h0();
            i.f propertySignature = Ve.a.f20031d;
            AbstractC5504s.g(propertySignature, "propertySignature");
            a.d dVar = (a.d) Ue.f.a(oVarH0, propertySignature);
            if (dVar != null) {
                return new AbstractC6507p.c(zA, oVarH0, dVar, n10.I(), n10.E());
            }
        } else if (zA instanceof Je.f) {
            Je.f fVar = (Je.f) zA;
            ye.h0 h0VarK = fVar.k();
            Ne.a aVar = h0VarK instanceof Ne.a ? (Ne.a) h0VarK : null;
            Oe.l lVarC = aVar != null ? aVar.c() : null;
            if (lVarC instanceof Ee.w) {
                return new AbstractC6507p.a(((Ee.w) lVarC).R());
            }
            if (lVarC instanceof Ee.z) {
                Method methodR = ((Ee.z) lVarC).R();
                ye.b0 b0VarG = fVar.g();
                ye.h0 h0VarK2 = b0VarG != null ? b0VarG.k() : null;
                Ne.a aVar2 = h0VarK2 instanceof Ne.a ? (Ne.a) h0VarK2 : null;
                Oe.l lVarC2 = aVar2 != null ? aVar2.c() : null;
                Ee.z zVar = lVarC2 instanceof Ee.z ? (Ee.z) lVarC2 : null;
                return new AbstractC6507p.b(methodR, zVar != null ? zVar.R() : null);
            }
            throw new Y0("Incorrect resolution sequence for Java field " + zA + " (source = " + lVarC + ')');
        }
        ye.a0 a0VarD = zA.d();
        AbstractC5504s.e(a0VarD);
        AbstractC6503n.e eVarD = d(a0VarD);
        ye.b0 b0VarG2 = zA.g();
        return new AbstractC6507p.d(eVarD, b0VarG2 != null ? d(b0VarG2) : null);
    }

    public final AbstractC6503n g(InterfaceC7247z possiblySubstitutedFunction) {
        Method methodR;
        d.b bVarB;
        d.b bVarE;
        AbstractC5504s.h(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC7247z interfaceC7247zA = ((InterfaceC7247z) bf.i.L(possiblySubstitutedFunction)).a();
        AbstractC5504s.g(interfaceC7247zA, "getOriginal(...)");
        if (!(interfaceC7247zA instanceof InterfaceC5879b)) {
            if (interfaceC7247zA instanceof Je.e) {
                ye.h0 h0VarK = ((Je.e) interfaceC7247zA).k();
                Ne.a aVar = h0VarK instanceof Ne.a ? (Ne.a) h0VarK : null;
                Oe.l lVarC = aVar != null ? aVar.c() : null;
                Ee.z zVar = lVarC instanceof Ee.z ? (Ee.z) lVarC : null;
                if (zVar != null && (methodR = zVar.R()) != null) {
                    return new AbstractC6503n.c(methodR);
                }
                throw new Y0("Incorrect resolution sequence for Java method " + interfaceC7247zA);
            }
            if (!(interfaceC7247zA instanceof Je.b)) {
                if (b(interfaceC7247zA)) {
                    return d(interfaceC7247zA);
                }
                throw new Y0("Unknown origin of " + interfaceC7247zA + " (" + interfaceC7247zA.getClass() + ')');
            }
            ye.h0 h0VarK2 = ((Je.b) interfaceC7247zA).k();
            Ne.a aVar2 = h0VarK2 instanceof Ne.a ? (Ne.a) h0VarK2 : null;
            Oe.l lVarC2 = aVar2 != null ? aVar2.c() : null;
            if (lVarC2 instanceof Ee.t) {
                return new AbstractC6503n.b(((Ee.t) lVarC2).R());
            }
            if (lVarC2 instanceof Ee.q) {
                Ee.q qVar = (Ee.q) lVarC2;
                if (qVar.o()) {
                    return new AbstractC6503n.a(qVar.s());
                }
            }
            throw new Y0("Incorrect resolution sequence for Java constructor " + interfaceC7247zA + " (" + lVarC2 + ')');
        }
        InterfaceC5896t interfaceC5896t = (InterfaceC5896t) interfaceC7247zA;
        Ze.p pVarH0 = interfaceC5896t.h0();
        if ((pVarH0 instanceof Se.j) && (bVarE = We.h.f20878a.e((Se.j) pVarH0, interfaceC5896t.I(), interfaceC5896t.E())) != null) {
            return new AbstractC6503n.e(bVarE);
        }
        if (!(pVarH0 instanceof Se.e) || (bVarB = We.h.f20878a.b((Se.e) pVarH0, interfaceC5896t.I(), interfaceC5896t.E())) == null) {
            return d(interfaceC7247zA);
        }
        InterfaceC7235m interfaceC7235mB = possiblySubstitutedFunction.b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        if (bf.k.b(interfaceC7235mB)) {
            return new AbstractC6503n.e(bVarB);
        }
        InterfaceC7235m interfaceC7235mB2 = possiblySubstitutedFunction.b();
        AbstractC5504s.g(interfaceC7235mB2, "getContainingDeclaration(...)");
        if (!bf.k.d(interfaceC7235mB2)) {
            return new AbstractC6503n.d(bVarB);
        }
        InterfaceC7234l interfaceC7234l = (InterfaceC7234l) possiblySubstitutedFunction;
        if (interfaceC7234l.e0()) {
            if (!AbstractC5504s.c(bVarB.e(), "constructor-impl") || !Df.r.A(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!AbstractC5504s.c(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            InterfaceC7227e interfaceC7227eF0 = interfaceC7234l.f0();
            AbstractC5504s.g(interfaceC7227eF0, "getConstructedClass(...)");
            String strU = te.o.u(interfaceC7227eF0);
            if (Df.r.A(bVarB.d(), ")V", false, 2, null)) {
                bVarB = d.b.c(bVarB, null, Df.r.D0(bVarB.d(), "V") + strU, 1, null);
            } else if (!Df.r.A(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new AbstractC6503n.e(bVarB);
    }
}
