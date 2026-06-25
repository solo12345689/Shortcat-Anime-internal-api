package v4;

import A4.i;
import G4.m;
import Td.z;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.i;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6842a {

    /* JADX INFO: renamed from: a */
    private final List f61900a;

    /* JADX INFO: renamed from: b */
    private final List f61901b;

    /* JADX INFO: renamed from: c */
    private final List f61902c;

    /* JADX INFO: renamed from: d */
    private final List f61903d;

    /* JADX INFO: renamed from: e */
    private final List f61904e;

    public /* synthetic */ C6842a(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.f61904e;
    }

    public final List b() {
        return this.f61903d;
    }

    public final List c() {
        return this.f61900a;
    }

    public final List d() {
        return this.f61902c;
    }

    public final List e() {
        return this.f61901b;
    }

    public final String f(Object obj, m mVar) {
        List list = this.f61902c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            C4.b bVar = (C4.b) pair.getFirst();
            if (((Class) pair.getSecond()).isAssignableFrom(obj.getClass())) {
                AbstractC5504s.f(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVar.a(obj, mVar);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        List list = this.f61901b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            D4.d dVar = (D4.d) pair.getFirst();
            if (((Class) pair.getSecond()).isAssignableFrom(obj.getClass())) {
                AbstractC5504s.f(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVar.a(obj, mVar);
                if (objA != null) {
                    obj = objA;
                }
            }
        }
        return obj;
    }

    public final C0928a h() {
        return new C0928a(this);
    }

    public final Pair i(A4.m mVar, m mVar2, InterfaceC6845d interfaceC6845d, int i10) {
        int size = this.f61904e.size();
        while (i10 < size) {
            i iVarA = ((i.a) this.f61904e.get(i10)).a(mVar, mVar2, interfaceC6845d);
            if (iVarA != null) {
                return z.a(iVarA, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final Pair j(Object obj, m mVar, InterfaceC6845d interfaceC6845d, int i10) {
        int size = this.f61903d.size();
        while (i10 < size) {
            Pair pair = (Pair) this.f61903d.get(i10);
            i.a aVar = (i.a) pair.getFirst();
            if (((Class) pair.getSecond()).isAssignableFrom(obj.getClass())) {
                AbstractC5504s.f(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                A4.i iVarA = aVar.a(obj, mVar, interfaceC6845d);
                if (iVarA != null) {
                    return z.a(iVarA, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    private C6842a(List list, List list2, List list3, List list4, List list5) {
        this.f61900a = list;
        this.f61901b = list2;
        this.f61902c = list3;
        this.f61903d = list4;
        this.f61904e = list5;
    }

    /* JADX INFO: renamed from: v4.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0928a {

        /* JADX INFO: renamed from: a */
        private final List f61905a;

        /* JADX INFO: renamed from: b */
        private final List f61906b;

        /* JADX INFO: renamed from: c */
        private final List f61907c;

        /* JADX INFO: renamed from: d */
        private final List f61908d;

        /* JADX INFO: renamed from: e */
        private final List f61909e;

        public C0928a() {
            this.f61905a = new ArrayList();
            this.f61906b = new ArrayList();
            this.f61907c = new ArrayList();
            this.f61908d = new ArrayList();
            this.f61909e = new ArrayList();
        }

        public final C0928a a(i.a aVar, Class cls) {
            this.f61908d.add(z.a(aVar, cls));
            return this;
        }

        public final C0928a b(B4.b bVar) {
            this.f61905a.add(bVar);
            return this;
        }

        public final C0928a c(C4.b bVar, Class cls) {
            this.f61907c.add(z.a(bVar, cls));
            return this;
        }

        public final C0928a d(D4.d dVar, Class cls) {
            this.f61906b.add(z.a(dVar, cls));
            return this;
        }

        public final C0928a e(i.a aVar) {
            this.f61909e.add(aVar);
            return this;
        }

        public final C6842a f() {
            return new C6842a(L4.c.a(this.f61905a), L4.c.a(this.f61906b), L4.c.a(this.f61907c), L4.c.a(this.f61908d), L4.c.a(this.f61909e), null);
        }

        public final List g() {
            return this.f61909e;
        }

        public final List h() {
            return this.f61908d;
        }

        public C0928a(C6842a c6842a) {
            this.f61905a = AbstractC2279u.d1(c6842a.c());
            this.f61906b = AbstractC2279u.d1(c6842a.e());
            this.f61907c = AbstractC2279u.d1(c6842a.d());
            this.f61908d = AbstractC2279u.d1(c6842a.b());
            this.f61909e = AbstractC2279u.d1(c6842a.a());
        }
    }

    public C6842a() {
        this(AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m());
    }
}
