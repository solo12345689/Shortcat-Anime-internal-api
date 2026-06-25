package xf;

import Ud.AbstractC2279u;
import java.util.List;
import kf.C5473e;
import kf.InterfaceC5475g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.S;
import vf.AbstractC6867d;
import xf.AbstractC7148A;
import xf.AbstractC7159k;
import xf.AbstractC7170v;
import ye.AbstractC7246y;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.l0;
import ye.t0;

/* JADX INFO: renamed from: xf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7167s extends AbstractC7150b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7167s f64505a = new C7167s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f64506b;

    static {
        Xe.f fVar = C7168t.f64550k;
        AbstractC7159k.b bVar = AbstractC7159k.b.f64494b;
        C7156h c7156h = new C7156h(fVar, new InterfaceC7154f[]{bVar, new AbstractC7148A.a(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        C7156h c7156h2 = new C7156h(C7168t.f64551l, new InterfaceC7154f[]{bVar, new AbstractC7148A.a(2)}, C7164p.f64502a);
        Xe.f fVar2 = C7168t.f64535b;
        C7161m c7161m = C7161m.f64496a;
        AbstractC7148A.a aVar = new AbstractC7148A.a(2);
        C7158j c7158j = C7158j.f64490a;
        C7156h c7156h3 = new C7156h(fVar2, new InterfaceC7154f[]{bVar, c7161m, aVar, c7158j}, (Function1) null, 4, (DefaultConstructorMarker) null);
        C7156h c7156h4 = new C7156h(C7168t.f64537c, new InterfaceC7154f[]{bVar, c7161m, new AbstractC7148A.a(3), c7158j}, (Function1) null, 4, (DefaultConstructorMarker) null);
        C7156h c7156h5 = new C7156h(C7168t.f64539d, new InterfaceC7154f[]{bVar, c7161m, new AbstractC7148A.b(2), c7158j}, (Function1) null, 4, (DefaultConstructorMarker) null);
        C7156h c7156h6 = new C7156h(C7168t.f64548i, new InterfaceC7154f[]{bVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Xe.f fVar3 = C7168t.f64547h;
        AbstractC7148A.d dVar = AbstractC7148A.d.f64469b;
        AbstractC7170v.a aVar2 = AbstractC7170v.a.f64570d;
        C7156h c7156h7 = new C7156h(fVar3, new InterfaceC7154f[]{bVar, dVar, c7161m, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Xe.f fVar4 = C7168t.f64549j;
        AbstractC7148A.c cVar = AbstractC7148A.c.f64468b;
        f64506b = AbstractC2279u.p(c7156h, c7156h2, c7156h3, c7156h4, c7156h5, c7156h6, c7156h7, new C7156h(fVar4, new InterfaceC7154f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64552m, new InterfaceC7154f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64553n, new InterfaceC7154f[]{bVar, cVar, aVar2}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64514H, new InterfaceC7154f[]{bVar, dVar, c7161m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64515I, new InterfaceC7154f[]{bVar, dVar, c7161m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64541e, new InterfaceC7154f[]{AbstractC7159k.a.f64493b}, C7165q.f64503a), new C7156h(C7168t.f64545g, new InterfaceC7154f[]{bVar, AbstractC7170v.b.f64571d, dVar, c7161m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64530X, new InterfaceC7154f[]{bVar, dVar, c7161m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64529W, new InterfaceC7154f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(AbstractC2279u.p(C7168t.f64563x, C7168t.f64564y), new InterfaceC7154f[]{bVar}, C7166r.f64504a), new C7156h(C7168t.f64538c0, new InterfaceC7154f[]{bVar, AbstractC7170v.c.f64572d, dVar, c7161m}, (Function1) null, 4, (DefaultConstructorMarker) null), new C7156h(C7168t.f64555p, new InterfaceC7154f[]{bVar, cVar}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }

    private C7167s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC7247z Checks) {
        AbstractC5504s.h(Checks, "$this$Checks");
        List listJ = Checks.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        t0 t0Var = (t0) AbstractC2279u.A0(listJ);
        boolean z10 = false;
        if (t0Var != null && !ff.e.f(t0Var) && t0Var.v0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[EDGE_INSN: B:27:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:8:0x002d->B:28:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(ye.InterfaceC7247z r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            ye.m r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            ye.z r2 = (ye.InterfaceC7247z) r2
            ye.m r2 = r2.b()
            kotlin.jvm.internal.AbstractC5504s.g(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = ye.AbstractC7240s.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            ye.m r2 = r3.b()
            kotlin.jvm.internal.AbstractC5504s.g(r2, r1)
            boolean r1 = bf.k.g(r2)
            if (r1 == 0) goto La1
            af.n r1 = af.n.f23995j
            ye.m r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.AbstractC5504s.f(r3, r2)
            ye.e r3 = (ye.InterfaceC7227e) r3
            qf.d0 r3 = r3.p()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r3, r2)
            qf.S r3 = vf.AbstractC6867d.D(r3)
            java.lang.String r3 = r1.S(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            return r3
        La6:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xf.C7167s.g(ye.z):java.lang.String");
    }

    private static final boolean h(InterfaceC7235m interfaceC7235m) {
        return (interfaceC7235m instanceof InterfaceC7227e) && ve.i.b0((InterfaceC7227e) interfaceC7235m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(InterfaceC7247z Checks) {
        boolean zW;
        AbstractC5504s.h(Checks, "$this$Checks");
        c0 c0VarK = Checks.K();
        if (c0VarK == null) {
            c0VarK = Checks.O();
        }
        C7167s c7167s = f64505a;
        boolean z10 = false;
        if (c0VarK != null) {
            S returnType = Checks.getReturnType();
            if (returnType != null) {
                S type = c0VarK.getType();
                AbstractC5504s.g(type, "getType(...)");
                zW = AbstractC6867d.w(returnType, type);
            } else {
                zW = false;
            }
            if (zW || c7167s.j(Checks, c0VarK)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(InterfaceC7247z interfaceC7247z, c0 c0Var) {
        Xe.b bVarN;
        S returnType;
        InterfaceC5475g value = c0Var.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        if (!(value instanceof C5473e)) {
            return false;
        }
        InterfaceC7227e interfaceC7227eU = ((C5473e) value).u();
        if (!interfaceC7227eU.m0() || (bVarN = ff.e.n(interfaceC7227eU)) == null) {
            return false;
        }
        InterfaceC7230h interfaceC7230hC = AbstractC7246y.c(ff.e.s(interfaceC7227eU), bVarN);
        l0 l0Var = interfaceC7230hC instanceof l0 ? (l0) interfaceC7230hC : null;
        if (l0Var == null || (returnType = interfaceC7247z.getReturnType()) == null) {
            return false;
        }
        return AbstractC6867d.w(returnType, l0Var.G());
    }

    @Override // xf.AbstractC7150b
    public List b() {
        return f64506b;
    }
}
