package ye;

import Be.AbstractC1115j;
import Be.C1121p;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5870f;
import pf.InterfaceC6042g;
import qf.C6210u;
import qf.N0;
import rf.AbstractC6317g;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class M {

    /* JADX INFO: renamed from: a */
    private final pf.n f65071a;

    /* JADX INFO: renamed from: b */
    private final H f65072b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6042g f65073c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6042g f65074d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Xe.b f65075a;

        /* JADX INFO: renamed from: b */
        private final List f65076b;

        public a(Xe.b classId, List typeParametersCount) {
            AbstractC5504s.h(classId, "classId");
            AbstractC5504s.h(typeParametersCount, "typeParametersCount");
            this.f65075a = classId;
            this.f65076b = typeParametersCount;
        }

        public final Xe.b a() {
            return this.f65075a;
        }

        public final List b() {
            return this.f65076b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f65075a, aVar.f65075a) && AbstractC5504s.c(this.f65076b, aVar.f65076b);
        }

        public int hashCode() {
            return (this.f65075a.hashCode() * 31) + this.f65076b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f65075a + ", typeParametersCount=" + this.f65076b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC1115j {

        /* JADX INFO: renamed from: i */
        private final boolean f65077i;

        /* JADX INFO: renamed from: j */
        private final List f65078j;

        /* JADX INFO: renamed from: k */
        private final C6210u f65079k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pf.n storageManager, InterfaceC7235m container, Xe.f name, boolean z10, int i10) {
            super(storageManager, container, name, h0.f65112a, false);
            AbstractC5504s.h(storageManager, "storageManager");
            AbstractC5504s.h(container, "container");
            AbstractC5504s.h(name, "name");
            this.f65077i = z10;
            C5870f c5870fX = AbstractC5874j.x(0, i10);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
            Iterator it = c5870fX.iterator();
            while (it.hasNext()) {
                int iNextInt = ((Ud.O) it).nextInt();
                InterfaceC7374h interfaceC7374hB = InterfaceC7374h.f66223k0.b();
                N0 n02 = N0.f57999e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(Be.U.R0(this, interfaceC7374hB, false, n02, Xe.f.m(sb2.toString()), iNextInt, storageManager));
            }
            this.f65078j = arrayList;
            this.f65079k = new C6210u(this, q0.g(this), Ud.a0.c(ff.e.s(this).n().i()), storageManager);
        }

        @Override // ye.InterfaceC7231i
        public boolean A() {
            return this.f65077i;
        }

        @Override // ye.InterfaceC7227e
        public InterfaceC7226d D() {
            return null;
        }

        @Override // ye.InterfaceC7227e
        public boolean I0() {
            return false;
        }

        @Override // ye.InterfaceC7227e
        /* JADX INFO: renamed from: K0 */
        public InterfaceC5387k.b o0() {
            return InterfaceC5387k.b.f51800b;
        }

        @Override // ye.InterfaceC7230h
        /* JADX INFO: renamed from: L0 */
        public C6210u l() {
            return this.f65079k;
        }

        @Override // Be.z
        /* JADX INFO: renamed from: M0 */
        public InterfaceC5387k.b j0(AbstractC6317g kotlinTypeRefiner) {
            AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return InterfaceC5387k.b.f51800b;
        }

        @Override // ye.InterfaceC7227e
        public r0 V() {
            return null;
        }

        @Override // ye.D
        public boolean Y() {
            return false;
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
            return EnumC7228f.f65097b;
        }

        @Override // ye.InterfaceC7227e
        public Collection i() {
            return Ud.a0.d();
        }

        @Override // Be.AbstractC1115j, ye.D
        public boolean isExternal() {
            return false;
        }

        @Override // ye.InterfaceC7227e
        public boolean isInline() {
            return false;
        }

        @Override // ye.D
        public boolean m0() {
            return false;
        }

        @Override // ye.InterfaceC7227e
        public InterfaceC7227e p0() {
            return null;
        }

        @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
        public List q() {
            return this.f65078j;
        }

        @Override // ye.InterfaceC7227e, ye.D
        public E r() {
            return E.f65060b;
        }

        @Override // ye.InterfaceC7227e
        public boolean s() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // ye.InterfaceC7227e
        public Collection z() {
            return AbstractC2279u.m();
        }
    }

    public M(pf.n storageManager, H module) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(module, "module");
        this.f65071a = storageManager;
        this.f65072b = module;
        this.f65073c = storageManager.h(new K(this));
        this.f65074d = storageManager.h(new L(this));
    }

    public static final InterfaceC7227e c(M m10, a aVar) {
        InterfaceC7235m interfaceC7235mD;
        AbstractC5504s.h(aVar, "<destruct>");
        Xe.b bVarA = aVar.a();
        List listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        Xe.b bVarE = bVarA.e();
        if (bVarE == null || (interfaceC7235mD = m10.d(bVarE, AbstractC2279u.g0(listB, 1))) == null) {
            interfaceC7235mD = (InterfaceC7229g) m10.f65073c.invoke(bVarA.f());
        }
        InterfaceC7235m interfaceC7235m = interfaceC7235mD;
        boolean zJ = bVarA.j();
        pf.n nVar = m10.f65071a;
        Xe.f fVarH = bVarA.h();
        Integer num = (Integer) AbstractC2279u.o0(listB);
        return new b(nVar, interfaceC7235m, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    public static final N e(M m10, Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return new C1121p(m10.f65072b, fqName);
    }

    public final InterfaceC7227e d(Xe.b classId, List typeParametersCount) {
        AbstractC5504s.h(classId, "classId");
        AbstractC5504s.h(typeParametersCount, "typeParametersCount");
        return (InterfaceC7227e) this.f65074d.invoke(new a(classId, typeParametersCount));
    }
}
