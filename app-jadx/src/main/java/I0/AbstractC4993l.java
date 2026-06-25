package i0;

import Ud.AbstractC2279u;
import Y.V0;
import i0.AbstractC4993l;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i0.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4993l {

    /* JADX INFO: renamed from: e */
    public static final a f48495e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f48496f = 8;

    /* JADX INFO: renamed from: a */
    private C4997p f48497a;

    /* JADX INFO: renamed from: b */
    private long f48498b;

    /* JADX INFO: renamed from: c */
    private boolean f48499c;

    /* JADX INFO: renamed from: d */
    private int f48500d;

    /* JADX INFO: renamed from: i0.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void i(Function2 function2) {
            synchronized (AbstractC5003v.O()) {
                AbstractC5003v.f48534i = AbstractC2279u.F0(AbstractC5003v.f48534i, function2);
                Td.L l10 = Td.L.f17438a;
            }
        }

        public static final void k(Function1 function1) {
            synchronized (AbstractC5003v.O()) {
                AbstractC5003v.f48535j = AbstractC2279u.F0(AbstractC5003v.f48535j, function1);
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5003v.G();
        }

        public final AbstractC4993l c() {
            return AbstractC5003v.M();
        }

        public final AbstractC4993l d() {
            return (AbstractC4993l) AbstractC5003v.f48528c.a();
        }

        public final AbstractC4993l e(AbstractC4993l abstractC4993l) {
            if (abstractC4993l instanceof C4980Y) {
                C4980Y c4980y = (C4980Y) abstractC4993l;
                if (c4980y.V() == g0.w.a()) {
                    c4980y.Y(null);
                    return abstractC4993l;
                }
            }
            if (abstractC4993l instanceof C4981Z) {
                C4981Z c4981z = (C4981Z) abstractC4993l;
                if (c4981z.C() == g0.w.a()) {
                    c4981z.F(null);
                    return abstractC4993l;
                }
            }
            AbstractC4993l abstractC4993lJ = AbstractC5003v.J(abstractC4993l, null, false, 6, null);
            abstractC4993lJ.l();
            return abstractC4993lJ;
        }

        public final void f() {
            AbstractC5003v.M().o();
        }

        public final Object g(Function1 function1, Function1 function12, InterfaceC5082a interfaceC5082a) {
            AbstractC4993l c4980y;
            if (function1 == null && function12 == null) {
                return interfaceC5082a.invoke();
            }
            AbstractC4993l abstractC4993l = (AbstractC4993l) AbstractC5003v.f48528c.a();
            if (abstractC4993l instanceof C4980Y) {
                C4980Y c4980y2 = (C4980Y) abstractC4993l;
                if (c4980y2.V() == g0.w.a()) {
                    Function1 function1G = c4980y2.g();
                    Function1 function1K = c4980y2.k();
                    try {
                        ((C4980Y) abstractC4993l).Y(AbstractC5003v.Q(function1, function1G, false, 4, null));
                        ((C4980Y) abstractC4993l).Z(AbstractC5003v.S(function12, function1K));
                        return interfaceC5082a.invoke();
                    } finally {
                        c4980y2.Y(function1G);
                        c4980y2.Z(function1K);
                    }
                }
            }
            if (abstractC4993l == null || (abstractC4993l instanceof C4985d)) {
                c4980y = new C4980Y(abstractC4993l instanceof C4985d ? (C4985d) abstractC4993l : null, function1, function12, true, false);
            } else {
                if (function1 == null) {
                    return interfaceC5082a.invoke();
                }
                c4980y = abstractC4993l.x(function1);
            }
            try {
                AbstractC4993l abstractC4993lL = c4980y.l();
                try {
                    Object objInvoke = interfaceC5082a.invoke();
                    c4980y.s(abstractC4993lL);
                    c4980y.d();
                    return objInvoke;
                } catch (Throwable th2) {
                    c4980y.s(abstractC4993lL);
                    throw th2;
                }
            } catch (Throwable th3) {
                c4980y.d();
                throw th3;
            }
        }

        public final InterfaceC4988g h(final Function2 function2) {
            AbstractC5003v.F(AbstractC5003v.f48526a);
            synchronized (AbstractC5003v.O()) {
                AbstractC5003v.f48534i = AbstractC2279u.J0(AbstractC5003v.f48534i, function2);
                Td.L l10 = Td.L.f17438a;
            }
            return new InterfaceC4988g() { // from class: i0.j
                @Override // i0.InterfaceC4988g
                public final void dispose() {
                    AbstractC4993l.a.i(function2);
                }
            };
        }

        public final InterfaceC4988g j(final Function1 function1) {
            synchronized (AbstractC5003v.O()) {
                AbstractC5003v.f48535j = AbstractC2279u.J0(AbstractC5003v.f48535j, function1);
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5003v.G();
            return new InterfaceC4988g() { // from class: i0.k
                @Override // i0.InterfaceC4988g
                public final void dispose() {
                    AbstractC4993l.a.k(function1);
                }
            };
        }

        public final void l(AbstractC4993l abstractC4993l, AbstractC4993l abstractC4993l2, Function1 function1) {
            if (abstractC4993l != abstractC4993l2) {
                abstractC4993l2.s(abstractC4993l);
                abstractC4993l2.d();
            } else if (abstractC4993l instanceof C4980Y) {
                ((C4980Y) abstractC4993l).Y(function1);
            } else {
                if (abstractC4993l instanceof C4981Z) {
                    ((C4981Z) abstractC4993l).F(function1);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC4993l).toString());
            }
        }

        public final void m() {
            boolean zI;
            synchronized (AbstractC5003v.O()) {
                zI = AbstractC5003v.f48536k.I();
            }
            if (zI) {
                AbstractC5003v.G();
            }
        }

        public final C4985d n(Function1 function1, Function1 function12) {
            C4985d c4985dR;
            AbstractC4993l abstractC4993lM = AbstractC5003v.M();
            C4985d c4985d = abstractC4993lM instanceof C4985d ? (C4985d) abstractC4993lM : null;
            if (c4985d == null || (c4985dR = c4985d.R(function1, function12)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c4985dR;
        }

        public final AbstractC4993l o(Function1 function1) {
            return AbstractC5003v.M().x(function1);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC4993l(long j10, C4997p c4997p, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, c4997p);
    }

    public final void b() {
        synchronized (AbstractC5003v.O()) {
            c();
            r();
            Td.L l10 = Td.L.f17438a;
        }
    }

    public void c() {
        AbstractC5003v.f48530e = AbstractC5003v.f48530e.n(i());
    }

    public void d() {
        this.f48499c = true;
        synchronized (AbstractC5003v.O()) {
            q();
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final boolean e() {
        return this.f48499c;
    }

    public C4997p f() {
        return this.f48497a;
    }

    public abstract Function1 g();

    public abstract boolean h();

    public long i() {
        return this.f48498b;
    }

    public int j() {
        return 0;
    }

    public abstract Function1 k();

    public AbstractC4993l l() {
        AbstractC4993l abstractC4993l = (AbstractC4993l) AbstractC5003v.f48528c.a();
        AbstractC5003v.f48528c.b(this);
        return abstractC4993l;
    }

    public abstract void m(AbstractC4993l abstractC4993l);

    public abstract void n(AbstractC4993l abstractC4993l);

    public abstract void o();

    public abstract void p(InterfaceC4976U interfaceC4976U);

    public final void q() {
        int i10 = this.f48500d;
        if (i10 >= 0) {
            AbstractC5003v.f0(i10);
            this.f48500d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(AbstractC4993l abstractC4993l) {
        AbstractC5003v.f48528c.b(abstractC4993l);
    }

    public final void t(boolean z10) {
        this.f48499c = z10;
    }

    public void u(C4997p c4997p) {
        this.f48497a = c4997p;
    }

    public void v(long j10) {
        this.f48498b = j10;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC4993l x(Function1 function1);

    public final int y() {
        int i10 = this.f48500d;
        this.f48500d = -1;
        return i10;
    }

    public final void z() {
        if (this.f48499c) {
            V0.a("Cannot use a disposed snapshot");
        }
    }

    private AbstractC4993l(long j10, C4997p c4997p) {
        this.f48497a = c4997p;
        this.f48498b = j10;
        this.f48500d = j10 != AbstractC5003v.f48527b ? AbstractC5003v.k0(j10, f()) : -1;
    }
}
