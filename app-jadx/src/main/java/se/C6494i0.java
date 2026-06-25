package se;

import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import gf.AbstractC4879b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5492f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC5500n;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;
import pe.InterfaceC6023m;
import se.AbstractC6503n;
import se.InterfaceC6499l;
import se.a1;
import te.C6670a;
import te.i;
import te.n;
import ye.InterfaceC7234l;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: se.i0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6494i0 extends AbstractC6453A implements InterfaceC5500n, InterfaceC6018h, InterfaceC6499l {

    /* JADX INFO: renamed from: m */
    static final /* synthetic */ InterfaceC6023m[] f59509m = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C6494i0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: g */
    private final AbstractC6484d0 f59510g;

    /* JADX INFO: renamed from: h */
    private final String f59511h;

    /* JADX INFO: renamed from: i */
    private final Object f59512i;

    /* JADX INFO: renamed from: j */
    private final a1.a f59513j;

    /* JADX INFO: renamed from: k */
    private final Lazy f59514k;

    /* JADX INFO: renamed from: l */
    private final Lazy f59515l;

    /* synthetic */ C6494i0(AbstractC6484d0 abstractC6484d0, String str, String str2, InterfaceC7247z interfaceC7247z, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6484d0, str, str2, interfaceC7247z, (i10 & 16) != 0 ? AbstractC5492f.NO_RECEIVER : obj);
    }

    public static final te.h e0(C6494i0 c6494i0) {
        Object objD;
        te.h hVarG0;
        AbstractC6503n abstractC6503nG = f1.f59496a.g(c6494i0.b0());
        if (abstractC6503nG instanceof AbstractC6503n.d) {
            if (c6494i0.Y()) {
                Class clsJ = c6494i0.U().j();
                List parameters = c6494i0.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((InterfaceC6022l) it.next()).getName();
                    AbstractC5504s.e(name);
                    arrayList.add(name);
                }
                return new C6670a(clsJ, arrayList, C6670a.EnumC0910a.f60910b, C6670a.b.f60914b, null, 16, null);
            }
            objD = c6494i0.U().y(((AbstractC6503n.d) abstractC6503nG).b());
        } else if (abstractC6503nG instanceof AbstractC6503n.e) {
            InterfaceC7247z interfaceC7247zB0 = c6494i0.b0();
            InterfaceC7235m interfaceC7235mB = interfaceC7247zB0.b();
            AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
            if (bf.k.d(interfaceC7235mB) && (interfaceC7247zB0 instanceof InterfaceC7234l) && ((InterfaceC7234l) interfaceC7247zB0).e0()) {
                InterfaceC7247z interfaceC7247zB02 = c6494i0.b0();
                AbstractC6484d0 abstractC6484d0U = c6494i0.U();
                String strB = ((AbstractC6503n.e) abstractC6503nG).b();
                List listJ = c6494i0.b0().j();
                AbstractC5504s.g(listJ, "getValueParameters(...)");
                return new n.b(interfaceC7247zB02, abstractC6484d0U, strB, listJ);
            }
            AbstractC6503n.e eVar = (AbstractC6503n.e) abstractC6503nG;
            objD = c6494i0.U().D(eVar.c(), eVar.b());
        } else if (abstractC6503nG instanceof AbstractC6503n.c) {
            objD = ((AbstractC6503n.c) abstractC6503nG).b();
            AbstractC5504s.f(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(abstractC6503nG instanceof AbstractC6503n.b)) {
                if (!(abstractC6503nG instanceof AbstractC6503n.a)) {
                    throw new Td.r();
                }
                List listD = ((AbstractC6503n.a) abstractC6503nG).d();
                Class clsJ2 = c6494i0.U().j();
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(listD, 10));
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new C6670a(clsJ2, arrayList2, C6670a.EnumC0910a.f60910b, C6670a.b.f60913a, listD);
            }
            objD = ((AbstractC6503n.b) abstractC6503nG).d();
            AbstractC5504s.f(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            hVarG0 = c6494i0.f0((Constructor) objD, c6494i0.b0(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new Y0("Could not compute caller for function: " + c6494i0.b0() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            hVarG0 = !Modifier.isStatic(method.getModifiers()) ? c6494i0.g0(method) : c6494i0.b0().getAnnotations().h(j1.j()) != null ? c6494i0.h0(method) : c6494i0.i0(method, false);
        }
        return te.o.j(hVarG0, c6494i0.b0(), false, 2, null);
    }

    private final te.i f0(Constructor constructor, InterfaceC7247z interfaceC7247z, boolean z10) {
        return (z10 || !AbstractC4879b.f(interfaceC7247z)) ? Z() ? new i.c(constructor, l0()) : new i.e(constructor) : Z() ? new i.a(constructor, l0()) : new i.b(constructor);
    }

    private final i.h g0(Method method) {
        return Z() ? new i.h.a(method, l0()) : new i.h.e(method);
    }

    private final i.h h0(Method method) {
        return Z() ? new i.h.b(method) : new i.h.f(method);
    }

    private final te.h i0(Method method, boolean z10) {
        if (Z()) {
            return new i.h.c(method, z10, o0(method) ? this.f59512i : l0());
        }
        return new i.h.g(method);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final te.h j0(se.C6494i0 r11) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: se.C6494i0.j0(se.i0):te.h");
    }

    public static final InterfaceC7247z k0(C6494i0 c6494i0, String str) {
        return c6494i0.U().B(str, c6494i0.f59511h);
    }

    private final Object l0() {
        return te.o.h(this.f59512i, b0());
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ye.InterfaceC7247z n0(ye.InterfaceC7247z r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.j()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            r2 = 0
            if (r0 == 0) goto L13
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L13
            goto L2a
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            ye.t0 r3 = (ye.t0) r3
            boolean r3 = r3.B0()
            if (r3 == 0) goto L17
            goto L93
        L2a:
            ye.m r0 = r6.b()
            java.lang.String r3 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r3)
            boolean r0 = bf.k.g(r0)
            if (r0 == 0) goto L93
            te.h r0 = r5.T()
            java.lang.reflect.Member r0 = r0.b()
            kotlin.jvm.internal.AbstractC5504s.e(r0)
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L93
            r0 = 0
            Cf.i r6 = ff.e.z(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r6.next()
            r3 = r0
            ye.b r3 = (ye.InterfaceC7224b) r3
            java.util.List r3 = r3.j()
            kotlin.jvm.internal.AbstractC5504s.g(r3, r1)
            if (r3 == 0) goto L74
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L74
            goto L57
        L74:
            java.util.Iterator r3 = r3.iterator()
        L78:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            ye.t0 r4 = (ye.t0) r4
            boolean r4 = r4.B0()
            if (r4 == 0) goto L78
            goto L8c
        L8b:
            r0 = r2
        L8c:
            boolean r6 = r0 instanceof ye.InterfaceC7247z
            if (r6 == 0) goto L93
            ye.z r0 = (ye.InterfaceC7247z) r0
            return r0
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: se.C6494i0.n0(ye.z):ye.z");
    }

    private final boolean o0(Method method) {
        qf.S type;
        ye.c0 c0VarK = b0().K();
        if (c0VarK == null || (type = c0VarK.getType()) == null || !bf.k.c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) AbstractC2273n.Y(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // se.AbstractC6453A
    public te.h T() {
        return (te.h) this.f59514k.getValue();
    }

    @Override // se.AbstractC6453A
    public AbstractC6484d0 U() {
        return this.f59510g;
    }

    @Override // se.AbstractC6453A
    public te.h V() {
        return (te.h) this.f59515l.getValue();
    }

    @Override // se.AbstractC6453A
    public boolean Z() {
        return this.f59512i != AbstractC5492f.NO_RECEIVER;
    }

    public boolean equals(Object obj) {
        C6494i0 c6494i0C = j1.c(obj);
        return c6494i0C != null && AbstractC5504s.c(U(), c6494i0C.U()) && AbstractC5504s.c(getName(), c6494i0C.getName()) && AbstractC5504s.c(this.f59511h, c6494i0C.f59511h) && AbstractC5504s.c(this.f59512i, c6494i0C.f59512i);
    }

    @Override // kotlin.jvm.internal.InterfaceC5500n
    public int getArity() {
        return te.j.a(T());
    }

    @Override // pe.InterfaceC6013c
    public String getName() {
        String strB = b0().getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }

    public int hashCode() {
        return (((U().hashCode() * 31) + getName().hashCode()) * 31) + this.f59511h.hashCode();
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return InterfaceC6499l.a.a(this);
    }

    @Override // pe.InterfaceC6018h
    public boolean isExternal() {
        return b0().isExternal();
    }

    @Override // pe.InterfaceC6018h
    public boolean isInfix() {
        return b0().isInfix();
    }

    @Override // pe.InterfaceC6018h
    public boolean isInline() {
        return b0().isInline();
    }

    @Override // pe.InterfaceC6018h
    public boolean isOperator() {
        return b0().isOperator();
    }

    @Override // pe.InterfaceC6013c, pe.InterfaceC6018h
    public boolean isSuspend() {
        return b0().isSuspend();
    }

    @Override // ie.r
    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC6499l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // ie.s
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return InterfaceC6499l.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // se.AbstractC6453A
    /* JADX INFO: renamed from: m0 */
    public InterfaceC7247z b0() {
        Object objB = this.f59513j.b(this, f59509m[0]);
        AbstractC5504s.g(objB, "getValue(...)");
        return (InterfaceC7247z) objB;
    }

    public String toString() {
        return e1.f59490a.f(b0());
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return InterfaceC6499l.a.b(this, obj);
    }

    private C6494i0(AbstractC6484d0 abstractC6484d0, String str, String str2, InterfaceC7247z interfaceC7247z, Object obj) {
        this.f59510g = abstractC6484d0;
        this.f59511h = str2;
        this.f59512i = obj;
        this.f59513j = a1.c(interfaceC7247z, new C6488f0(this, str));
        Td.q qVar = Td.q.f17462b;
        this.f59514k = AbstractC2163n.a(qVar, new C6490g0(this));
        this.f59515l = AbstractC2163n.a(qVar, new C6492h0(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC6499l.a.c(this, obj, obj2);
    }

    @Override // ie.InterfaceC5096o
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return InterfaceC6499l.a.d(this, obj, obj2, obj3);
    }

    @Override // ie.p
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC6499l.a.e(this, obj, obj2, obj3, obj4);
    }

    @Override // ie.q
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC6499l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6494i0(AbstractC6484d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6494i0(AbstractC6484d0 container, InterfaceC7247z descriptor) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        this(container, strB, f1.f59496a.g(descriptor).a(), descriptor, null, 16, null);
    }
}
