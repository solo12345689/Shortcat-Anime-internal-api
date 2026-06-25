package aa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: aa.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2595c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f23851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f23852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f23855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f23856g;

    public static b c(C2591D c2591d) {
        return new b(c2591d, new C2591D[0]);
    }

    public static b d(C2591D c2591d, C2591D... c2591dArr) {
        return new b(c2591d, c2591dArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C2595c l(final Object obj, Class cls) {
        return m(cls).f(new g() { // from class: aa.a
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return C2595c.b(obj, interfaceC2596d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C2595c q(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new g() { // from class: aa.b
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return C2595c.a(obj, interfaceC2596d);
            }
        }).d();
    }

    public Set g() {
        return this.f23852c;
    }

    public g h() {
        return this.f23855f;
    }

    public String i() {
        return this.f23850a;
    }

    public Set j() {
        return this.f23851b;
    }

    public Set k() {
        return this.f23856g;
    }

    public boolean n() {
        return this.f23853d == 1;
    }

    public boolean o() {
        return this.f23853d == 2;
    }

    public boolean p() {
        return this.f23854e == 0;
    }

    public C2595c r(g gVar) {
        return new C2595c(this.f23850a, this.f23851b, this.f23852c, this.f23853d, this.f23854e, gVar, this.f23856g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f23851b.toArray()) + ">{" + this.f23853d + ", type=" + this.f23854e + ", deps=" + Arrays.toString(this.f23852c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: aa.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f23858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f23859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g f23862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f23863g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f23861e = 1;
            return this;
        }

        private b i(int i10) {
            AbstractC2590C.d(this.f23860d == 0, "Instantiation type has already been set.");
            this.f23860d = i10;
            return this;
        }

        private void j(C2591D c2591d) {
            AbstractC2590C.a(!this.f23858b.contains(c2591d), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            AbstractC2590C.c(qVar, "Null dependency");
            j(qVar.b());
            this.f23859c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C2595c d() {
            AbstractC2590C.d(this.f23862f != null, "Missing required property: factory.");
            return new C2595c(this.f23857a, new HashSet(this.f23858b), new HashSet(this.f23859c), this.f23860d, this.f23861e, this.f23862f, this.f23863g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f23862f = (g) AbstractC2590C.c(gVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f23857a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f23857a = null;
            HashSet hashSet = new HashSet();
            this.f23858b = hashSet;
            this.f23859c = new HashSet();
            this.f23860d = 0;
            this.f23861e = 0;
            this.f23863g = new HashSet();
            AbstractC2590C.c(cls, "Null interface");
            hashSet.add(C2591D.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC2590C.c(cls2, "Null interface");
                this.f23858b.add(C2591D.b(cls2));
            }
        }

        private b(C2591D c2591d, C2591D... c2591dArr) {
            this.f23857a = null;
            HashSet hashSet = new HashSet();
            this.f23858b = hashSet;
            this.f23859c = new HashSet();
            this.f23860d = 0;
            this.f23861e = 0;
            this.f23863g = new HashSet();
            AbstractC2590C.c(c2591d, "Null interface");
            hashSet.add(c2591d);
            for (C2591D c2591d2 : c2591dArr) {
                AbstractC2590C.c(c2591d2, "Null interface");
            }
            Collections.addAll(this.f23858b, c2591dArr);
        }
    }

    private C2595c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f23850a = str;
        this.f23851b = Collections.unmodifiableSet(set);
        this.f23852c = Collections.unmodifiableSet(set2);
        this.f23853d = i10;
        this.f23854e = i11;
        this.f23855f = gVar;
        this.f23856g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC2596d interfaceC2596d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC2596d interfaceC2596d) {
        return obj;
    }
}
