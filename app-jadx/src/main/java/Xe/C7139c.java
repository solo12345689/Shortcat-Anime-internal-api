package xe;

import Ud.AbstractC2279u;
import Xe.b;
import gf.EnumC4882e;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;
import we.AbstractC6971f;

/* JADX INFO: renamed from: xe.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7139c {

    /* JADX INFO: renamed from: a */
    public static final C7139c f64375a;

    /* JADX INFO: renamed from: b */
    private static final String f64376b;

    /* JADX INFO: renamed from: c */
    private static final String f64377c;

    /* JADX INFO: renamed from: d */
    private static final String f64378d;

    /* JADX INFO: renamed from: e */
    private static final String f64379e;

    /* JADX INFO: renamed from: f */
    private static final Xe.b f64380f;

    /* JADX INFO: renamed from: g */
    private static final Xe.c f64381g;

    /* JADX INFO: renamed from: h */
    private static final Xe.b f64382h;

    /* JADX INFO: renamed from: i */
    private static final Xe.b f64383i;

    /* JADX INFO: renamed from: j */
    private static final Xe.b f64384j;

    /* JADX INFO: renamed from: k */
    private static final HashMap f64385k;

    /* JADX INFO: renamed from: l */
    private static final HashMap f64386l;

    /* JADX INFO: renamed from: m */
    private static final HashMap f64387m;

    /* JADX INFO: renamed from: n */
    private static final HashMap f64388n;

    /* JADX INFO: renamed from: o */
    private static final HashMap f64389o;

    /* JADX INFO: renamed from: p */
    private static final HashMap f64390p;

    /* JADX INFO: renamed from: q */
    private static final List f64391q;

    /* JADX INFO: renamed from: xe.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Xe.b f64392a;

        /* JADX INFO: renamed from: b */
        private final Xe.b f64393b;

        /* JADX INFO: renamed from: c */
        private final Xe.b f64394c;

        public a(Xe.b javaClass, Xe.b kotlinReadOnly, Xe.b kotlinMutable) {
            AbstractC5504s.h(javaClass, "javaClass");
            AbstractC5504s.h(kotlinReadOnly, "kotlinReadOnly");
            AbstractC5504s.h(kotlinMutable, "kotlinMutable");
            this.f64392a = javaClass;
            this.f64393b = kotlinReadOnly;
            this.f64394c = kotlinMutable;
        }

        public final Xe.b a() {
            return this.f64392a;
        }

        public final Xe.b b() {
            return this.f64393b;
        }

        public final Xe.b c() {
            return this.f64394c;
        }

        public final Xe.b d() {
            return this.f64392a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f64392a, aVar.f64392a) && AbstractC5504s.c(this.f64393b, aVar.f64393b) && AbstractC5504s.c(this.f64394c, aVar.f64394c);
        }

        public int hashCode() {
            return (((this.f64392a.hashCode() * 31) + this.f64393b.hashCode()) * 31) + this.f64394c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f64392a + ", kotlinReadOnly=" + this.f64393b + ", kotlinMutable=" + this.f64394c + ')';
        }
    }

    static {
        C7139c c7139c = new C7139c();
        f64375a = c7139c;
        StringBuilder sb2 = new StringBuilder();
        AbstractC6971f.a aVar = AbstractC6971f.a.f63187f;
        sb2.append(aVar.b());
        sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb2.append(aVar.a());
        f64376b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC6971f.b bVar = AbstractC6971f.b.f63188f;
        sb3.append(bVar.b());
        sb3.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb3.append(bVar.a());
        f64377c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC6971f.d dVar = AbstractC6971f.d.f63190f;
        sb4.append(dVar.b());
        sb4.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb4.append(dVar.a());
        f64378d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        AbstractC6971f.c cVar = AbstractC6971f.c.f63189f;
        sb5.append(cVar.b());
        sb5.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb5.append(cVar.a());
        f64379e = sb5.toString();
        b.a aVar2 = Xe.b.f21759d;
        Xe.b bVarC = aVar2.c(new Xe.c("kotlin.jvm.functions.FunctionN"));
        f64380f = bVarC;
        f64381g = bVarC.a();
        Xe.i iVar = Xe.i.f21842a;
        f64382h = iVar.k();
        f64383i = iVar.j();
        f64384j = c7139c.g(Class.class);
        f64385k = new HashMap();
        f64386l = new HashMap();
        f64387m = new HashMap();
        f64388n = new HashMap();
        f64389o = new HashMap();
        f64390p = new HashMap();
        Xe.b bVarC2 = aVar2.c(o.a.f62227W);
        a aVar3 = new a(c7139c.g(Iterable.class), bVarC2, new Xe.b(bVarC2.f(), Xe.e.g(o.a.f62240e0, bVarC2.f()), false));
        Xe.b bVarC3 = aVar2.c(o.a.f62225V);
        a aVar4 = new a(c7139c.g(Iterator.class), bVarC3, new Xe.b(bVarC3.f(), Xe.e.g(o.a.f62238d0, bVarC3.f()), false));
        Xe.b bVarC4 = aVar2.c(o.a.f62228X);
        a aVar5 = new a(c7139c.g(Collection.class), bVarC4, new Xe.b(bVarC4.f(), Xe.e.g(o.a.f62242f0, bVarC4.f()), false));
        Xe.b bVarC5 = aVar2.c(o.a.f62229Y);
        a aVar6 = new a(c7139c.g(List.class), bVarC5, new Xe.b(bVarC5.f(), Xe.e.g(o.a.f62244g0, bVarC5.f()), false));
        Xe.b bVarC6 = aVar2.c(o.a.f62232a0);
        a aVar7 = new a(c7139c.g(Set.class), bVarC6, new Xe.b(bVarC6.f(), Xe.e.g(o.a.f62248i0, bVarC6.f()), false));
        Xe.b bVarC7 = aVar2.c(o.a.f62230Z);
        a aVar8 = new a(c7139c.g(ListIterator.class), bVarC7, new Xe.b(bVarC7.f(), Xe.e.g(o.a.f62246h0, bVarC7.f()), false));
        Xe.c cVar2 = o.a.f62234b0;
        Xe.b bVarC8 = aVar2.c(cVar2);
        a aVar9 = new a(c7139c.g(Map.class), bVarC8, new Xe.b(bVarC8.f(), Xe.e.g(o.a.f62250j0, bVarC8.f()), false));
        Xe.b bVarD = aVar2.c(cVar2).d(o.a.f62236c0.f());
        List listP = AbstractC2279u.p(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(c7139c.g(Map.Entry.class), bVarD, new Xe.b(bVarD.f(), Xe.e.g(o.a.f62252k0, bVarD.f()), false)));
        f64391q = listP;
        c7139c.f(Object.class, o.a.f62233b);
        c7139c.f(String.class, o.a.f62245h);
        c7139c.f(CharSequence.class, o.a.f62243g);
        c7139c.e(Throwable.class, o.a.f62271u);
        c7139c.f(Cloneable.class, o.a.f62237d);
        c7139c.f(Number.class, o.a.f62265r);
        c7139c.e(Comparable.class, o.a.f62273v);
        c7139c.f(Enum.class, o.a.f62267s);
        c7139c.e(Annotation.class, o.a.f62195G);
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            f64375a.d((a) it.next());
        }
        for (EnumC4882e enumC4882e : EnumC4882e.values()) {
            C7139c c7139c2 = f64375a;
            b.a aVar10 = Xe.b.f21759d;
            Xe.c cVarP = enumC4882e.p();
            AbstractC5504s.g(cVarP, "getWrapperFqName(...)");
            Xe.b bVarC9 = aVar10.c(cVarP);
            ve.l lVarM = enumC4882e.m();
            AbstractC5504s.g(lVarM, "getPrimitiveType(...)");
            c7139c2.a(bVarC9, aVar10.c(ve.o.c(lVarM)));
        }
        for (Xe.b bVar2 : ve.d.f62095a.a()) {
            f64375a.a(Xe.b.f21759d.c(new Xe.c("kotlin.jvm.internal." + bVar2.h().b() + "CompanionObject")), bVar2.d(Xe.h.f21783d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            C7139c c7139c3 = f64375a;
            c7139c3.a(Xe.b.f21759d.c(new Xe.c("kotlin.jvm.functions.Function" + i10)), ve.o.a(i10));
            c7139c3.c(new Xe.c(f64377c + i10), f64382h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            AbstractC6971f.c cVar3 = AbstractC6971f.c.f63189f;
            f64375a.c(new Xe.c((cVar3.b() + com.amazon.a.a.o.c.a.b.f34706a + cVar3.a()) + i11), f64382h);
        }
        C7139c c7139c4 = f64375a;
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicInt"), c7139c4.g(AtomicInteger.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicLong"), c7139c4.g(AtomicLong.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicBoolean"), c7139c4.g(AtomicBoolean.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicReference"), c7139c4.g(AtomicReference.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicIntArray"), c7139c4.g(AtomicIntegerArray.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicLongArray"), c7139c4.g(AtomicLongArray.class));
        c7139c4.c(new Xe.c("kotlin.concurrent.atomics.AtomicArray"), c7139c4.g(AtomicReferenceArray.class));
        c7139c4.c(o.a.f62235c.m(), c7139c4.g(Void.class));
    }

    private C7139c() {
    }

    private final void a(Xe.b bVar, Xe.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(Xe.b bVar, Xe.b bVar2) {
        f64385k.put(bVar.a().i(), bVar2);
    }

    private final void c(Xe.c cVar, Xe.b bVar) {
        f64386l.put(cVar.i(), bVar);
    }

    private final void d(a aVar) {
        Xe.b bVarA = aVar.a();
        Xe.b bVarB = aVar.b();
        Xe.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f64389o.put(bVarC, bVarB);
        f64390p.put(bVarB, bVarC);
        Xe.c cVarA = bVarB.a();
        Xe.c cVarA2 = bVarC.a();
        f64387m.put(bVarC.a().i(), cVarA);
        f64388n.put(cVarA.i(), cVarA2);
    }

    private final void e(Class cls, Xe.c cVar) {
        a(g(cls), Xe.b.f21759d.c(cVar));
    }

    private final void f(Class cls, Xe.d dVar) {
        e(cls, dVar.m());
    }

    private final Xe.b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            b.a aVar = Xe.b.f21759d;
            String canonicalName = cls.getCanonicalName();
            AbstractC5504s.g(canonicalName, "getCanonicalName(...)");
            return aVar.c(new Xe.c(canonicalName));
        }
        Xe.b bVarG = g(declaringClass);
        Xe.f fVarM = Xe.f.m(cls.getSimpleName());
        AbstractC5504s.g(fVarM, "identifier(...)");
        return bVarG.d(fVarM);
    }

    private final boolean j(Xe.d dVar, String str) {
        Integer numR;
        String strA = dVar.a();
        if (!Df.r.Q(strA, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strA.substring(str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return (Df.r.Q0(strSubstring, '0', false, 2, null) || (numR = Df.r.r(strSubstring)) == null || numR.intValue() < 23) ? false : true;
    }

    public final Xe.c h() {
        return f64381g;
    }

    public final List i() {
        return f64391q;
    }

    public final boolean k(Xe.d dVar) {
        return f64387m.containsKey(dVar);
    }

    public final boolean l(Xe.d dVar) {
        return f64388n.containsKey(dVar);
    }

    public final Xe.b m(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return (Xe.b) f64385k.get(fqName.i());
    }

    public final Xe.b n(Xe.d kotlinFqName) {
        AbstractC5504s.h(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f64376b) ? f64380f : j(kotlinFqName, f64378d) ? f64380f : j(kotlinFqName, f64377c) ? f64382h : j(kotlinFqName, f64379e) ? f64382h : (Xe.b) f64386l.get(kotlinFqName);
    }

    public final Xe.c o(Xe.d dVar) {
        return (Xe.c) f64387m.get(dVar);
    }

    public final Xe.c p(Xe.d dVar) {
        return (Xe.c) f64388n.get(dVar);
    }
}
