package Q;

import Q.C2051k;
import Q.q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14142a = a.f14143a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f14143a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final q f14144b = new q() { // from class: Q.l
            @Override // Q.q
            public final C2051k a(w wVar) {
                return q.a.h(wVar);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final q f14145c = new q() { // from class: Q.m
            @Override // Q.q
            public final C2051k a(w wVar) {
                return q.a.f(wVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final q f14146d = new q() { // from class: Q.n
            @Override // Q.q
            public final C2051k a(w wVar) {
                return q.a.j(wVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final q f14147e = new q() { // from class: Q.o
            @Override // Q.q
            public final C2051k a(w wVar) {
                return q.a.i(wVar);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final q f14148f = new q() { // from class: Q.p
            @Override // Q.q
            public final C2051k a(w wVar) {
                return q.a.g(wVar);
            }
        };

        /* JADX INFO: renamed from: Q.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0238a implements InterfaceC2043c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0238a f14149a = new C0238a();

            C0238a() {
            }

            @Override // Q.InterfaceC2043c
            public final long a(C2050j c2050j, int i10) {
                return K.C.c(c2050j.c(), i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b implements InterfaceC2043c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f14150a = new b();

            b() {
            }

            @Override // Q.InterfaceC2043c
            public final long a(C2050j c2050j, int i10) {
                return c2050j.k().C(i10);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051k f(w wVar) {
            return r.h(f14144b.a(wVar), wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051k g(w wVar) {
            C2051k.a aVarC;
            C2051k.a aVarL;
            C2051k.a aVarE;
            C2051k.a aVarC2;
            C2051k c2051kH = wVar.h();
            if (c2051kH == null) {
                return f14146d.a(wVar);
            }
            if (wVar.a()) {
                aVarC = c2051kH.e();
                aVarL = r.l(wVar, wVar.j(), aVarC);
                aVarC2 = c2051kH.c();
                aVarE = aVarL;
            } else {
                aVarC = c2051kH.c();
                aVarL = r.l(wVar, wVar.i(), aVarC);
                aVarE = c2051kH.e();
                aVarC2 = aVarL;
            }
            if (AbstractC5504s.c(aVarL, aVarC)) {
                return c2051kH;
            }
            return r.h(new C2051k(aVarE, aVarC2, wVar.e() == EnumC2045e.CROSSED || (wVar.e() == EnumC2045e.COLLAPSED && aVarE.c() > aVarC2.c())), wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051k h(w wVar) {
            return new C2051k(wVar.j().a(wVar.j().g()), wVar.i().a(wVar.i().e()), wVar.e() == EnumC2045e.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051k i(w wVar) {
            return r.e(wVar, C0238a.f14149a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C2051k j(w wVar) {
            return r.e(wVar, b.f14150a);
        }

        public final q k() {
            return f14148f;
        }

        public final q l() {
            return f14144b;
        }

        public final q m() {
            return f14147e;
        }

        public final q n() {
            return f14146d;
        }
    }

    C2051k a(w wVar);
}
