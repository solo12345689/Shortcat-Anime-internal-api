package df;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.B0;
import qf.D0;
import qf.N0;
import qf.S;
import qf.V;
import qf.W;
import qf.r0;
import ve.o;
import vf.AbstractC6867d;
import ye.AbstractC7246y;
import ye.H;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.m0;

/* JADX INFO: renamed from: df.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4610s extends AbstractC4598g {

    /* JADX INFO: renamed from: b */
    public static final a f45174b = new a(null);

    /* JADX INFO: renamed from: df.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC4598g a(S argumentType) {
            AbstractC5504s.h(argumentType, "argumentType");
            if (W.a(argumentType)) {
                return null;
            }
            S type = argumentType;
            int i10 = 0;
            while (ve.i.d0(type)) {
                type = ((B0) AbstractC2279u.M0(type.L0())).getType();
                AbstractC5504s.g(type, "getType(...)");
                i10++;
            }
            InterfaceC7230h interfaceC7230hP = type.N0().p();
            if (interfaceC7230hP instanceof InterfaceC7227e) {
                Xe.b bVarN = ff.e.n(interfaceC7230hP);
                return bVarN == null ? new C4610s(new b.a(argumentType)) : new C4610s(bVarN, i10);
            }
            if (interfaceC7230hP instanceof m0) {
                return new C4610s(Xe.b.f21759d.c(o.a.f62233b.m()), 0);
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: df.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: renamed from: df.s$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            private final S f45175a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(S type) {
                super(null);
                AbstractC5504s.h(type, "type");
                this.f45175a = type;
            }

            public final S a() {
                return this.f45175a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC5504s.c(this.f45175a, ((a) obj).f45175a);
            }

            public int hashCode() {
                return this.f45175a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f45175a + ')';
            }
        }

        /* JADX INFO: renamed from: df.s$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0712b extends b {

            /* JADX INFO: renamed from: a */
            private final C4597f f45176a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0712b(C4597f value) {
                super(null);
                AbstractC5504s.h(value, "value");
                this.f45176a = value;
            }

            public final int a() {
                return this.f45176a.c();
            }

            public final Xe.b b() {
                return this.f45176a.d();
            }

            public final C4597f c() {
                return this.f45176a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0712b) && AbstractC5504s.c(this.f45176a, ((C0712b) obj).f45176a);
            }

            public int hashCode() {
                return this.f45176a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f45176a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4610s(b value) {
        super(value);
        AbstractC5504s.h(value, "value");
    }

    @Override // df.AbstractC4598g
    public S a(H module) {
        AbstractC5504s.h(module, "module");
        r0 r0VarK = r0.f58089b.k();
        InterfaceC7227e interfaceC7227eF = module.n().F();
        AbstractC5504s.g(interfaceC7227eF, "getKClass(...)");
        return V.h(r0VarK, interfaceC7227eF, AbstractC2279u.e(new D0(c(module))));
    }

    public final S c(H module) {
        AbstractC5504s.h(module, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0712b)) {
            throw new Td.r();
        }
        C4597f c4597fC = ((b.C0712b) b()).c();
        Xe.b bVarA = c4597fC.a();
        int iB = c4597fC.b();
        InterfaceC7227e interfaceC7227eB = AbstractC7246y.b(module, bVarA);
        if (interfaceC7227eB == null) {
            return sf.l.d(sf.k.f59687h, bVarA.toString(), String.valueOf(iB));
        }
        AbstractC6183d0 abstractC6183d0P = interfaceC7227eB.p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        S sD = AbstractC6867d.D(abstractC6183d0P);
        for (int i10 = 0; i10 < iB; i10++) {
            sD = module.n().m(N0.f57999e, sD);
            AbstractC5504s.g(sD, "getArrayType(...)");
        }
        return sD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4610s(C4597f value) {
        this(new b.C0712b(value));
        AbstractC5504s.h(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4610s(Xe.b classId, int i10) {
        this(new C4597f(classId, i10));
        AbstractC5504s.h(classId, "classId");
    }
}
