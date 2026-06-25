package E0;

import I0.InterfaceC1690p;
import a0.C2507c;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import t.C6543I;
import t.C6546L;

/* JADX INFO: renamed from: E0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1295e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1690p f4135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6546L f4140f = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1304n f4141g = new C1304n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6543I f4142h = new C6543I(10);

    /* JADX INFO: renamed from: E0.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f4144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e.c cVar) {
            super(0);
            this.f4144b = cVar;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            C1295e.this.g(this.f4144b);
        }
    }

    public C1295e(InterfaceC1690p interfaceC1690p) {
        this.f4135a = interfaceC1690p;
    }

    private final void f(long j10, C6546L c6546l) {
        this.f4141g.h(j10, c6546l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(e.c cVar) {
        if (!this.f4136b) {
            this.f4141g.i(cVar);
        } else {
            this.f4139e = true;
            this.f4140f.k(cVar);
        }
    }

    public final void b(long j10, List list, boolean z10) {
        Object obj;
        C1304n c1304n = this.f4141g;
        this.f4142h.g();
        int size = list.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            e.c cVar = (e.c) list.get(i10);
            if (cVar.isAttached()) {
                cVar.setDetachedListener$ui_release(new a(cVar));
                if (z11) {
                    C2507c c2507cG = c1304n.g();
                    Object[] objArr = c2507cG.f23496a;
                    int iP = c2507cG.p();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iP) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i11];
                        if (AbstractC5504s.c(((C1303m) obj).k(), cVar)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    C1303m c1303m = (C1303m) obj;
                    if (c1303m != null) {
                        c1303m.n();
                        c1303m.l().a(j10);
                        C6543I c6543i = this.f4142h;
                        Object objB = c6543i.b(j10);
                        if (objB == null) {
                            objB = new C6546L(0, 1, null);
                            c6543i.o(j10, objB);
                        }
                        ((C6546L) objB).k(c1303m);
                        c1304n = c1303m;
                    } else {
                        z11 = false;
                    }
                }
                C1303m c1303m2 = new C1303m(cVar);
                c1303m2.l().a(j10);
                C6543I c6543i2 = this.f4142h;
                Object objB2 = c6543i2.b(j10);
                if (objB2 == null) {
                    objB2 = new C6546L(0, 1, null);
                    c6543i2.o(j10, objB2);
                }
                ((C6546L) objB2).k(c1303m2);
                c1304n.g().c(c1303m2);
                c1304n = c1303m2;
            }
        }
        if (!z10) {
            return;
        }
        C6543I c6543i3 = this.f4142h;
        long[] jArr = c6543i3.f60131b;
        Object[] objArr2 = c6543i3.f60132c;
        long[] jArr2 = c6543i3.f60130a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr2[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i12 << 3) + i14;
                        f(jArr[i15], (C6546L) objArr2[i15]);
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void c() {
        if (this.f4138d) {
            this.f4138d = true;
        } else {
            this.f4141g.c();
        }
    }

    public final boolean d(C1297g c1297g, boolean z10) {
        if (!this.f4141g.a(c1297g.b(), this.f4135a, c1297g, z10)) {
            return false;
        }
        boolean z11 = true;
        this.f4136b = true;
        boolean zF = this.f4141g.f(c1297g.b(), this.f4135a, c1297g, z10);
        if (!this.f4141g.e(c1297g) && !zF) {
            z11 = false;
        }
        this.f4136b = false;
        if (this.f4139e) {
            this.f4139e = false;
            int iD = this.f4140f.d();
            for (int i10 = 0; i10 < iD; i10++) {
                g((e.c) this.f4140f.c(i10));
            }
            this.f4140f.n();
        }
        if (this.f4137c) {
            this.f4137c = false;
            e();
        }
        if (this.f4138d) {
            this.f4138d = false;
            c();
        }
        return z11;
    }

    public final void e() {
        if (this.f4136b) {
            this.f4137c = true;
        } else {
            this.f4141g.d();
            c();
        }
    }
}
