package we;

import Be.AbstractC1106a;
import Be.U;
import Td.C2160k;
import Td.L;
import Ud.AbstractC2279u;
import Ud.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;
import pf.n;
import qf.AbstractC6178b;
import qf.D0;
import qf.N0;
import qf.V;
import qf.r0;
import qf.v0;
import rf.AbstractC6317g;
import ve.o;
import we.AbstractC6971f;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.AbstractC7246y;
import ye.E;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.N;
import ye.h0;
import ye.k0;
import ye.m0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: we.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6967b extends AbstractC1106a {

    /* JADX INFO: renamed from: n */
    public static final a f63161n = new a(null);

    /* JADX INFO: renamed from: o */
    private static final Xe.b f63162o;

    /* JADX INFO: renamed from: p */
    private static final Xe.b f63163p;

    /* JADX INFO: renamed from: f */
    private final n f63164f;

    /* JADX INFO: renamed from: g */
    private final N f63165g;

    /* JADX INFO: renamed from: h */
    private final AbstractC6971f f63166h;

    /* JADX INFO: renamed from: i */
    private final int f63167i;

    /* JADX INFO: renamed from: j */
    private final C0952b f63168j;

    /* JADX INFO: renamed from: k */
    private final C6969d f63169k;

    /* JADX INFO: renamed from: l */
    private final List f63170l;

    /* JADX INFO: renamed from: m */
    private final EnumC6968c f63171m;

    /* JADX INFO: renamed from: we.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: we.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class C0952b extends AbstractC6178b {
        public C0952b() {
            super(C6967b.this.f63164f);
        }

        @Override // qf.AbstractC6211v, qf.v0
        /* JADX INFO: renamed from: J */
        public C6967b p() {
            return C6967b.this;
        }

        @Override // qf.v0
        public List getParameters() {
            return C6967b.this.f63170l;
        }

        @Override // qf.v0
        public boolean q() {
            return true;
        }

        @Override // qf.AbstractC6206p
        protected Collection r() {
            List<Xe.b> listP;
            AbstractC6971f abstractC6971fU0 = C6967b.this.U0();
            AbstractC6971f.a aVar = AbstractC6971f.a.f63187f;
            if (AbstractC5504s.c(abstractC6971fU0, aVar)) {
                listP = AbstractC2279u.e(C6967b.f63162o);
            } else if (AbstractC5504s.c(abstractC6971fU0, AbstractC6971f.b.f63188f)) {
                listP = AbstractC2279u.p(C6967b.f63163p, new Xe.b(o.f62147A, aVar.c(C6967b.this.Q0())));
            } else {
                AbstractC6971f.d dVar = AbstractC6971f.d.f63190f;
                if (AbstractC5504s.c(abstractC6971fU0, dVar)) {
                    listP = AbstractC2279u.e(C6967b.f63162o);
                } else {
                    if (!AbstractC5504s.c(abstractC6971fU0, AbstractC6971f.c.f63189f)) {
                        Bf.a.b(null, 1, null);
                        throw new C2160k();
                    }
                    listP = AbstractC2279u.p(C6967b.f63163p, new Xe.b(o.f62175s, dVar.c(C6967b.this.Q0())));
                }
            }
            H hB = C6967b.this.f63165g.b();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
            for (Xe.b bVar : listP) {
                InterfaceC7227e interfaceC7227eB = AbstractC7246y.b(hB, bVar);
                if (interfaceC7227eB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listU0 = AbstractC2279u.U0(getParameters(), interfaceC7227eB.l().getParameters().size());
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(listU0, 10));
                Iterator it = listU0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new D0(((m0) it.next()).p()));
                }
                arrayList.add(V.h(r0.f58089b.k(), interfaceC7227eB, arrayList2));
            }
            return AbstractC2279u.b1(arrayList);
        }

        public String toString() {
            return p().toString();
        }

        @Override // qf.AbstractC6206p
        protected k0 v() {
            return k0.a.f65115a;
        }
    }

    static {
        Xe.c cVar = o.f62147A;
        Xe.f fVarM = Xe.f.m("Function");
        AbstractC5504s.g(fVarM, "identifier(...)");
        f63162o = new Xe.b(cVar, fVarM);
        Xe.c cVar2 = o.f62180x;
        Xe.f fVarM2 = Xe.f.m("KFunction");
        AbstractC5504s.g(fVarM2, "identifier(...)");
        f63163p = new Xe.b(cVar2, fVarM2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6967b(n storageManager, N containingDeclaration, AbstractC6971f functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingDeclaration, "containingDeclaration");
        AbstractC5504s.h(functionTypeKind, "functionTypeKind");
        this.f63164f = storageManager;
        this.f63165g = containingDeclaration;
        this.f63166h = functionTypeKind;
        this.f63167i = i10;
        this.f63168j = new C0952b();
        this.f63169k = new C6969d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        C5870f c5870f = new C5870f(1, i10);
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(c5870f, 10));
        Iterator it = c5870f.iterator();
        while (it.hasNext()) {
            int iNextInt = ((O) it).nextInt();
            N0 n02 = N0.f58000f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            K0(arrayList, this, n02, sb2.toString());
            arrayList2.add(L.f17438a);
        }
        K0(arrayList, this, N0.f58001g, "R");
        this.f63170l = AbstractC2279u.b1(arrayList);
        this.f63171m = EnumC6968c.f63173a.a(this.f63166h);
    }

    private static final void K0(ArrayList arrayList, C6967b c6967b, N0 n02, String str) {
        arrayList.add(U.R0(c6967b, InterfaceC7374h.f66223k0.b(), false, n02, Xe.f.m(str), arrayList.size(), c6967b.f63164f));
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public /* bridge */ /* synthetic */ InterfaceC7226d D() {
        return (InterfaceC7226d) Y0();
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return false;
    }

    public final int Q0() {
        return this.f63167i;
    }

    public Void R0() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: S0 */
    public List i() {
        return AbstractC2279u.m();
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7236n, ye.InterfaceC7235m
    /* JADX INFO: renamed from: T0 */
    public N b() {
        return this.f63165g;
    }

    public final AbstractC6971f U0() {
        return this.f63166h;
    }

    @Override // ye.InterfaceC7227e
    public ye.r0 V() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: V0 */
    public List z() {
        return AbstractC2279u.m();
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: W0 */
    public InterfaceC5387k.b o0() {
        return InterfaceC5387k.b.f51800b;
    }

    @Override // Be.z
    /* JADX INFO: renamed from: X0 */
    public C6969d j0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f63169k;
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    public Void Y0() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    public boolean c0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean g0() {
        return false;
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return InterfaceC7374h.f66223k0.b();
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u PUBLIC = AbstractC7241t.f65124e;
        AbstractC5504s.g(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        return EnumC7228f.f65098c;
    }

    @Override // ye.D
    public boolean isExternal() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return false;
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        return this.f63168j;
    }

    @Override // ye.D
    public boolean m0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public /* bridge */ /* synthetic */ InterfaceC7227e p0() {
        return (InterfaceC7227e) R0();
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        return this.f63170l;
    }

    @Override // ye.InterfaceC7227e, ye.D
    public E r() {
        return E.f65063e;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return false;
    }

    public String toString() {
        String strB = getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }
}
