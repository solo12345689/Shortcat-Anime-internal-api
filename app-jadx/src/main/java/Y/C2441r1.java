package Y;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6539E;
import t.C6546L;

/* JADX INFO: renamed from: Y.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2441r1 implements InterfaceC2398d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22480d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22481e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6539E f22482a = new C6539E(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6546L f22483b = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f22484c;

    /* JADX INFO: renamed from: Y.r1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2441r1(Object obj) {
        this.f22484c = obj;
    }

    @Override // Y.InterfaceC2398d
    public Object a() {
        return this.f22484c;
    }

    @Override // Y.InterfaceC2398d
    public void b(int i10, int i11) {
        this.f22482a.h(2);
        this.f22482a.h(i10);
        this.f22482a.h(i11);
    }

    @Override // Y.InterfaceC2398d
    public void c(int i10, int i11, int i12) {
        this.f22482a.h(3);
        this.f22482a.h(i10);
        this.f22482a.h(i11);
        this.f22482a.h(i12);
    }

    @Override // Y.InterfaceC2398d
    public void clear() {
        this.f22482a.h(4);
    }

    @Override // Y.InterfaceC2398d
    public void d(Function2 function2, Object obj) {
        this.f22482a.h(7);
        this.f22483b.k(function2);
        this.f22483b.k(obj);
    }

    @Override // Y.InterfaceC2398d
    public void e(int i10, Object obj) {
        this.f22482a.h(6);
        this.f22482a.h(i10);
        this.f22483b.k(obj);
    }

    @Override // Y.InterfaceC2398d
    public void g(int i10, Object obj) {
        this.f22482a.h(5);
        this.f22482a.h(i10);
        this.f22483b.k(obj);
    }

    @Override // Y.InterfaceC2398d
    public void h(Object obj) {
        this.f22482a.h(1);
        this.f22483b.k(obj);
    }

    @Override // Y.InterfaceC2398d
    public void i() {
        this.f22482a.h(8);
    }

    @Override // Y.InterfaceC2398d
    public void k() {
        this.f22482a.h(0);
    }

    public final void l(InterfaceC2398d interfaceC2398d, g0.q qVar) {
        Exception exc;
        int i10;
        int i11;
        C6539E c6539e = this.f22482a;
        int i12 = c6539e.f60103b;
        C6546L c6546l = this.f22483b;
        C6546L c6546l2 = new C6546L(0, 1, null);
        interfaceC2398d.j();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i13 + 1;
            try {
                try {
                    switch (c6539e.b(i13)) {
                        case 0:
                            interfaceC2398d.k();
                            i13 = i15;
                            break;
                        case 1:
                            int i16 = i14 + 1;
                            interfaceC2398d.h(c6546l.c(i14));
                            i14 = i16;
                            i13 = i15;
                            break;
                        case 2:
                            int i17 = i13 + 2;
                            i13 += 3;
                            interfaceC2398d.b(c6539e.b(i15), c6539e.b(i17));
                            break;
                        case 3:
                            int i18 = i13 + 2;
                            try {
                                i10 = i13 + 3;
                            } catch (Exception e10) {
                                exc = e10;
                                i13 = i18;
                            }
                            try {
                                i13 += 4;
                                interfaceC2398d.c(c6539e.b(i15), c6539e.b(i18), c6539e.b(i10));
                            } catch (Exception e11) {
                                exc = e11;
                                i13 = i10;
                                throw new C2416j(c6546l, c6546l2, c6539e, i13, exc);
                            }
                            break;
                        case 4:
                            interfaceC2398d.clear();
                            i13 = i15;
                            break;
                        case 5:
                            i13 += 2;
                            i11 = i14 + 1;
                            interfaceC2398d.g(c6539e.b(i15), c6546l.c(i14));
                            i14 = i11;
                            break;
                        case 6:
                            i13 += 2;
                            try {
                                i11 = i14 + 1;
                                interfaceC2398d.e(c6539e.b(i15), c6546l.c(i14));
                                i14 = i11;
                            } catch (Exception e12) {
                                exc = e12;
                                throw new C2416j(c6546l, c6546l2, c6539e, i13, exc);
                            }
                            break;
                        case 7:
                            int i19 = i14 + 1;
                            Object objC = c6546l.c(i14);
                            AbstractC5504s.f(objC, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i14 += 2;
                            interfaceC2398d.d((Function2) kotlin.jvm.internal.V.e(objC, 2), c6546l.c(i19));
                            i13 = i15;
                            break;
                        case 8:
                            Object objA = interfaceC2398d.a();
                            if (objA instanceof InterfaceC2413i) {
                                qVar.k((InterfaceC2413i) objA);
                            }
                            c6546l2.k(objA);
                            interfaceC2398d.i();
                            i13 = i15;
                            break;
                        default:
                            i13 = i15;
                            break;
                    }
                } catch (Throwable th2) {
                    interfaceC2398d.f();
                    throw th2;
                }
            } catch (Exception e13) {
                exc = e13;
                i13 = i15;
            }
        }
        if (!(i14 == c6546l.d())) {
            AbstractC2454w.t("Applier operation size mismatch");
        }
        c6546l.n();
        c6539e.j();
        interfaceC2398d.f();
    }
}
