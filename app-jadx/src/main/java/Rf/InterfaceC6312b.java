package rf;

import cf.C3099a;
import df.C4608q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import qf.AbstractC6183d0;
import qf.B0;
import qf.C6189g0;
import qf.C6214y;
import qf.G0;
import qf.H0;
import qf.I;
import qf.InterfaceC6177a0;
import qf.InterfaceC6181c0;
import qf.J0;
import qf.M0;
import qf.N0;
import qf.Q;
import qf.S;
import qf.V;
import qf.W;
import qf.u0;
import qf.v0;
import qf.w0;
import uf.EnumC6770b;
import uf.InterfaceC6771c;
import uf.InterfaceC6772d;
import uf.InterfaceC6773e;
import uf.InterfaceC6774f;
import ve.o;
import vf.AbstractC6867d;
import ye.C7222A;
import ye.EnumC7228f;
import ye.F;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.l0;
import ye.m0;

/* JADX INFO: renamed from: rf.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC6312b extends H0, uf.t {

    /* JADX INFO: renamed from: rf.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: rf.b$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0888a extends u0.c.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC6312b f58771a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ G0 f58772b;

            C0888a(InterfaceC6312b interfaceC6312b, G0 g02) {
                this.f58771a = interfaceC6312b;
                this.f58772b = g02;
            }

            @Override // qf.u0.c
            /* JADX INFO: renamed from: b */
            public uf.k a(u0 state, uf.i type) {
                AbstractC5504s.h(state, "state");
                AbstractC5504s.h(type, "type");
                InterfaceC6312b interfaceC6312b = this.f58771a;
                G0 g02 = this.f58772b;
                Object objV = interfaceC6312b.v(type);
                AbstractC5504s.f(objV, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                S sN = g02.n((S) objV, N0.f57999e);
                AbstractC5504s.g(sN, "safeSubstitute(...)");
                uf.k kVarD = interfaceC6312b.d((uf.i) sN);
                AbstractC5504s.e(kVarD);
                return kVarD;
            }
        }

        public static boolean A(InterfaceC6312b interfaceC6312b, uf.i receiver, Xe.c fqName) {
            AbstractC5504s.h(receiver, "$receiver");
            AbstractC5504s.h(fqName, "fqName");
            if (receiver instanceof S) {
                return ((S) receiver).getAnnotations().k0(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean B(InterfaceC6312b interfaceC6312b, uf.q receiver, uf.p pVar) {
            AbstractC5504s.h(receiver, "$receiver");
            if (!(receiver instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
            }
            m0 m0Var = (m0) receiver;
            if (pVar == null ? true : pVar instanceof v0) {
                return AbstractC6867d.r(m0Var, (v0) pVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + m0Var + ", " + O.b(m0Var.getClass())).toString());
        }

        public static boolean C(InterfaceC6312b interfaceC6312b, uf.j a10, uf.j b10) {
            AbstractC5504s.h(a10, "a");
            AbstractC5504s.h(b10, "b");
            if (!(a10 instanceof AbstractC6183d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + O.b(a10.getClass())).toString());
            }
            if (b10 instanceof AbstractC6183d0) {
                return ((AbstractC6183d0) a10).L0() == ((AbstractC6183d0) b10).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + O.b(b10.getClass())).toString());
        }

        public static uf.i D(InterfaceC6312b interfaceC6312b, Collection types) {
            AbstractC5504s.h(types, "types");
            return AbstractC6314d.a(types);
        }

        public static boolean E(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ve.i.x0((v0) receiver, o.a.f62233b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean F(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).p() instanceof InterfaceC7227e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean G(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
                return (interfaceC7227e == null || !F.a(interfaceC7227e) || interfaceC7227e.h() == EnumC7228f.f65100e || interfaceC7227e.h() == EnumC7228f.f65101f) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean H(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean I(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return W.a((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean J(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
                return (interfaceC7227e != null ? interfaceC7227e.V() : null) instanceof C7222A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean K(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof C4608q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean L(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof Q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean M(InterfaceC6312b interfaceC6312b) {
            return false;
        }

        public static boolean N(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            return (receiver instanceof AbstractC6183d0) && ((AbstractC6183d0) receiver).O0();
        }

        public static boolean O(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            return receiver instanceof InterfaceC6177a0;
        }

        public static boolean P(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ve.i.x0((v0) receiver, o.a.f62235c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean Q(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return J0.l((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean R(InterfaceC6312b interfaceC6312b, InterfaceC6772d receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            return receiver instanceof C3099a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(InterfaceC6312b interfaceC6312b, uf.k receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return ve.i.t0((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean T(InterfaceC6312b interfaceC6312b, InterfaceC6772d receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof C6319i) {
                return ((C6319i) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean U(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return receiver instanceof InterfaceC6181c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                if (W.a((S) receiver)) {
                    return false;
                }
                AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) receiver;
                if (abstractC6183d0.N0().p() instanceof l0) {
                    return false;
                }
                return abstractC6183d0.N0().p() != null || (receiver instanceof C3099a) || (receiver instanceof C6319i) || (receiver instanceof C6214y) || (abstractC6183d0.N0() instanceof C4608q) || W(interfaceC6312b, (uf.k) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        private static boolean W(InterfaceC6312b interfaceC6312b, uf.k kVar) {
            return (kVar instanceof C6189g0) && interfaceC6312b.a(((C6189g0) kVar).H0());
        }

        public static boolean X(InterfaceC6312b interfaceC6312b, uf.m receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof B0) {
                return ((B0) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                return AbstractC6867d.u((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                return AbstractC6867d.v((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean a(InterfaceC6312b interfaceC6312b, uf.p c12, uf.p c22) {
            AbstractC5504s.h(c12, "c1");
            AbstractC5504s.h(c22, "c2");
            if (!(c12 instanceof v0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + O.b(c12.getClass())).toString());
            }
            if (c22 instanceof v0) {
                return AbstractC5504s.c(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + O.b(c22.getClass())).toString());
        }

        public static boolean a0(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (!(receiver instanceof M0)) {
                return false;
            }
            ((M0) receiver).N0();
            return false;
        }

        public static int b(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean b0(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                return interfaceC7230hP != null && ve.i.C0(interfaceC7230hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.l c(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                return (uf.l) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.k c0(InterfaceC6312b interfaceC6312b, uf.g receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC6772d d(InterfaceC6312b interfaceC6312b, uf.k receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                if (receiver instanceof C6189g0) {
                    return interfaceC6312b.b(((C6189g0) receiver).H0());
                }
                if (receiver instanceof C6319i) {
                    return (C6319i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i d0(InterfaceC6312b interfaceC6312b, InterfaceC6772d receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof C6319i) {
                return ((C6319i) receiver).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC6773e e(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                if (receiver instanceof C6214y) {
                    return (C6214y) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i e0(InterfaceC6312b interfaceC6312b, uf.i receiver, boolean z10) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof M0) {
                return AbstractC6313c.b((M0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC6774f f(InterfaceC6312b interfaceC6312b, uf.g receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof I) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static u0 f0(InterfaceC6312b interfaceC6312b, boolean z10, boolean z11, boolean z12) {
            return AbstractC6311a.b(z10, z11, interfaceC6312b, null, null, 24, null);
        }

        public static uf.g g(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0Q0 = ((S) receiver).Q0();
                if (m0Q0 instanceof I) {
                    return (I) m0Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.k g0(InterfaceC6312b interfaceC6312b, InterfaceC6773e receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof C6214y) {
                return ((C6214y) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.k h(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0Q0 = ((S) receiver).Q0();
                if (m0Q0 instanceof AbstractC6183d0) {
                    return (AbstractC6183d0) m0Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static int h0(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.m i(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return AbstractC6867d.d((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static Collection i0(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            uf.p pVarE = interfaceC6312b.e(receiver);
            if (pVarE instanceof C4608q) {
                return ((C4608q) pVarE).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static AbstractC6183d0 j(InterfaceC6312b interfaceC6312b, uf.j type, EnumC6770b status) {
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(status, "status");
            if (type instanceof AbstractC6183d0) {
                return o.b((AbstractC6183d0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + O.b(type.getClass())).toString());
        }

        public static uf.m j0(InterfaceC6312b interfaceC6312b, InterfaceC6771c receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof n) {
                return ((n) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static EnumC6770b k(InterfaceC6312b interfaceC6312b, InterfaceC6772d receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof C6319i) {
                return ((C6319i) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static u0.c k0(InterfaceC6312b interfaceC6312b, uf.j type) {
            AbstractC5504s.h(type, "type");
            if (type instanceof AbstractC6183d0) {
                return new C0888a(interfaceC6312b, w0.f58118c.a((S) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + O.b(type.getClass())).toString());
        }

        public static uf.i l(InterfaceC6312b interfaceC6312b, uf.j lowerBound, uf.j upperBound) {
            AbstractC5504s.h(lowerBound, "lowerBound");
            AbstractC5504s.h(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC6183d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC6312b + ", " + O.b(interfaceC6312b.getClass())).toString());
            }
            if (upperBound instanceof AbstractC6183d0) {
                return V.e((AbstractC6183d0) lowerBound, (AbstractC6183d0) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC6312b + ", " + O.b(interfaceC6312b.getClass())).toString());
        }

        public static Collection l0(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                Collection collectionK = ((v0) receiver).k();
                AbstractC5504s.g(collectionK, "getSupertypes(...)");
                return collectionK;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.m m(InterfaceC6312b interfaceC6312b, uf.i receiver, int i10) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return (uf.m) ((S) receiver).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC6771c m0(InterfaceC6312b interfaceC6312b, InterfaceC6772d receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof C6319i) {
                return ((C6319i) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static List n(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.p n0(InterfaceC6312b interfaceC6312b, uf.j receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                return ((AbstractC6183d0) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static Xe.d o(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ff.e.p((InterfaceC7227e) interfaceC7230hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.k o0(InterfaceC6312b interfaceC6312b, uf.g receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.q p(InterfaceC6312b interfaceC6312b, uf.p receiver, int i10) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                Object obj = ((v0) receiver).getParameters().get(i10);
                AbstractC5504s.g(obj, "get(...)");
                return (uf.q) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i p0(InterfaceC6312b interfaceC6312b, uf.i receiver, boolean z10) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof uf.j) {
                return interfaceC6312b.f((uf.j) receiver, z10);
            }
            if (!(receiver instanceof uf.g)) {
                throw new IllegalStateException("sealed");
            }
            uf.g gVar = (uf.g) receiver;
            return interfaceC6312b.p(interfaceC6312b.f((uf.j) interfaceC6312b.g(gVar), z10), interfaceC6312b.f((uf.j) interfaceC6312b.h(gVar), z10));
        }

        public static List q(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                List parameters = ((v0) receiver).getParameters();
                AbstractC5504s.g(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.k q0(InterfaceC6312b interfaceC6312b, uf.j receiver, boolean z10) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof AbstractC6183d0) {
                return ((AbstractC6183d0) receiver).R0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ve.l r(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ve.i.Q((InterfaceC7227e) interfaceC7230hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ve.l s(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                AbstractC5504s.f(interfaceC7230hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ve.i.T((InterfaceC7227e) interfaceC7230hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i t(InterfaceC6312b interfaceC6312b, uf.q receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof m0) {
                return AbstractC6867d.o((m0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i u(InterfaceC6312b interfaceC6312b, uf.m receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (interfaceC6312b.c(receiver)) {
                return null;
            }
            if (receiver instanceof B0) {
                return ((B0) receiver).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.q v(InterfaceC6312b interfaceC6312b, uf.p receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC7230h interfaceC7230hP = ((v0) receiver).p();
                if (interfaceC7230hP instanceof m0) {
                    return (m0) interfaceC7230hP;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.i w(InterfaceC6312b interfaceC6312b, uf.i receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof S) {
                return bf.k.k((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static List x(InterfaceC6312b interfaceC6312b, uf.q receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof m0) {
                List upperBounds = ((m0) receiver).getUpperBounds();
                AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.v y(InterfaceC6312b interfaceC6312b, uf.m receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof B0) {
                N0 n0B = ((B0) receiver).b();
                AbstractC5504s.g(n0B, "getProjectionKind(...)");
                return uf.s.a(n0B);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static uf.v z(InterfaceC6312b interfaceC6312b, uf.q receiver) {
            AbstractC5504s.h(receiver, "$receiver");
            if (receiver instanceof m0) {
                N0 n0M = ((m0) receiver).m();
                AbstractC5504s.g(n0M, "getVariance(...)");
                return uf.s.a(n0M);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }
    }

    @Override // uf.r
    boolean a(uf.j jVar);

    @Override // uf.r
    InterfaceC6772d b(uf.k kVar);

    @Override // uf.r
    boolean c(uf.m mVar);

    @Override // uf.r
    uf.k d(uf.i iVar);

    @Override // uf.r
    uf.p e(uf.j jVar);

    @Override // uf.r
    uf.k f(uf.j jVar, boolean z10);

    @Override // uf.r
    uf.k g(uf.g gVar);

    @Override // uf.r
    uf.k h(uf.g gVar);

    uf.i p(uf.j jVar, uf.j jVar2);
}
