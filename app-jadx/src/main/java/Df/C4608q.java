package df;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import be.AbstractC3048a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.D0;
import qf.F0;
import qf.N0;
import qf.S;
import qf.V;
import qf.r0;
import qf.v0;
import rf.AbstractC6317g;
import ye.H;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: df.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4608q implements v0 {

    /* JADX INFO: renamed from: f */
    public static final a f45163f = new a(null);

    /* JADX INFO: renamed from: a */
    private final long f45164a;

    /* JADX INFO: renamed from: b */
    private final H f45165b;

    /* JADX INFO: renamed from: c */
    private final Set f45166c;

    /* JADX INFO: renamed from: d */
    private final AbstractC6183d0 f45167d;

    /* JADX INFO: renamed from: e */
    private final Lazy f45168e;

    /* JADX INFO: renamed from: df.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: df.q$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class EnumC0711a extends Enum {

            /* JADX INFO: renamed from: a */
            public static final EnumC0711a f45169a = new EnumC0711a("COMMON_SUPER_TYPE", 0);

            /* JADX INFO: renamed from: b */
            public static final EnumC0711a f45170b = new EnumC0711a("INTERSECTION_TYPE", 1);

            /* JADX INFO: renamed from: c */
            private static final /* synthetic */ EnumC0711a[] f45171c;

            /* JADX INFO: renamed from: d */
            private static final /* synthetic */ EnumEntries f45172d;

            static {
                EnumC0711a[] enumC0711aArrA = a();
                f45171c = enumC0711aArrA;
                f45172d = AbstractC3048a.a(enumC0711aArrA);
            }

            private EnumC0711a(String str, int i10) {
                super(str, i10);
            }

            private static final /* synthetic */ EnumC0711a[] a() {
                return new EnumC0711a[]{f45169a, f45170b};
            }

            public static EnumC0711a valueOf(String str) {
                return (EnumC0711a) Enum.valueOf(EnumC0711a.class, str);
            }

            public static EnumC0711a[] values() {
                return (EnumC0711a[]) f45171c.clone();
            }
        }

        /* JADX INFO: renamed from: df.q$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f45173a;

            static {
                int[] iArr = new int[EnumC0711a.values().length];
                try {
                    iArr[EnumC0711a.f45169a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0711a.f45170b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f45173a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbstractC6183d0 a(Collection collection, EnumC0711a enumC0711a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) it.next();
                next = C4608q.f45163f.e((AbstractC6183d0) next, abstractC6183d0, enumC0711a);
            }
            return (AbstractC6183d0) next;
        }

        private final AbstractC6183d0 c(C4608q c4608q, C4608q c4608q2, EnumC0711a enumC0711a) {
            Set setS0;
            int i10 = b.f45173a[enumC0711a.ordinal()];
            if (i10 == 1) {
                setS0 = AbstractC2279u.s0(c4608q.f(), c4608q2.f());
            } else {
                if (i10 != 2) {
                    throw new Td.r();
                }
                setS0 = AbstractC2279u.g1(c4608q.f(), c4608q2.f());
            }
            return V.f(r0.f58089b.k(), new C4608q(c4608q.f45164a, c4608q.f45165b, setS0, null), false);
        }

        private final AbstractC6183d0 d(C4608q c4608q, AbstractC6183d0 abstractC6183d0) {
            if (c4608q.f().contains(abstractC6183d0)) {
                return abstractC6183d0;
            }
            return null;
        }

        private final AbstractC6183d0 e(AbstractC6183d0 abstractC6183d0, AbstractC6183d0 abstractC6183d02, EnumC0711a enumC0711a) {
            if (abstractC6183d0 != null && abstractC6183d02 != null) {
                v0 v0VarN0 = abstractC6183d0.N0();
                v0 v0VarN02 = abstractC6183d02.N0();
                boolean z10 = v0VarN0 instanceof C4608q;
                if (z10 && (v0VarN02 instanceof C4608q)) {
                    return c((C4608q) v0VarN0, (C4608q) v0VarN02, enumC0711a);
                }
                if (z10) {
                    return d((C4608q) v0VarN0, abstractC6183d02);
                }
                if (v0VarN02 instanceof C4608q) {
                    return d((C4608q) v0VarN02, abstractC6183d0);
                }
            }
            return null;
        }

        public final AbstractC6183d0 b(Collection types) {
            AbstractC5504s.h(types, "types");
            return a(types, EnumC0711a.f45170b);
        }

        private a() {
        }
    }

    public /* synthetic */ C4608q(long j10, H h10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, h10, set);
    }

    private final List g() {
        return (List) this.f45168e.getValue();
    }

    private final boolean h() {
        Collection collectionA = AbstractC4613v.a(this.f45165b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f45166c.contains((S) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final List i(C4608q c4608q) {
        AbstractC6183d0 abstractC6183d0P = c4608q.n().y().p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        List listS = AbstractC2279u.s(F0.f(abstractC6183d0P, AbstractC2279u.e(new D0(N0.f58000f, c4608q.f45167d)), null, 2, null));
        if (!c4608q.h()) {
            listS.add(c4608q.n().M());
        }
        return listS;
    }

    private final String j() {
        return '[' + AbstractC2279u.w0(this.f45166c, com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, C4607p.f45162a, 30, null) + ']';
    }

    public static final CharSequence l(S it) {
        AbstractC5504s.h(it, "it");
        return it.toString();
    }

    public final Set f() {
        return this.f45166c;
    }

    @Override // qf.v0
    public List getParameters() {
        return AbstractC2279u.m();
    }

    @Override // qf.v0
    public Collection k() {
        return g();
    }

    @Override // qf.v0
    public ve.i n() {
        return this.f45165b.n();
    }

    @Override // qf.v0
    public v0 o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // qf.v0
    public InterfaceC7230h p() {
        return null;
    }

    @Override // qf.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + j();
    }

    private C4608q(long j10, H h10, Set set) {
        this.f45167d = V.f(r0.f58089b.k(), this, false);
        this.f45168e = AbstractC2163n.b(new C4606o(this));
        this.f45164a = j10;
        this.f45165b = h10;
        this.f45166c = set;
    }
}
