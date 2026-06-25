package x0;

import Td.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6358h0;
import s0.C6356g1;
import s0.C6385r0;
import s0.F1;
import s0.InterfaceC6374m1;
import s0.V;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import u0.InterfaceC6713h;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7031c extends AbstractC7040l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f63416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f63417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f63420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC6374m1 f63422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Function1 f63423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Function1 f63424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f63425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f63426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f63427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f63428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f63429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f63430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f63431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f63432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f63433s;

    /* JADX INFO: renamed from: x0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(AbstractC7040l abstractC7040l) {
            C7031c.this.n(abstractC7040l);
            Function1 function1B = C7031c.this.b();
            if (function1B != null) {
                function1B.invoke(abstractC7040l);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC7040l) obj);
            return L.f17438a;
        }
    }

    public C7031c() {
        super(null);
        this.f63417c = new ArrayList();
        this.f63418d = true;
        this.f63419e = C6385r0.f58985b.j();
        this.f63420f = AbstractC7043o.d();
        this.f63421g = true;
        this.f63424j = new a();
        this.f63425k = "";
        this.f63429o = 1.0f;
        this.f63430p = 1.0f;
        this.f63433s = true;
    }

    private final boolean h() {
        return !this.f63420f.isEmpty();
    }

    private final void k() {
        this.f63418d = false;
        this.f63419e = C6385r0.f58985b.j();
    }

    private final void l(AbstractC6358h0 abstractC6358h0) {
        if (this.f63418d && abstractC6358h0 != null) {
            if (abstractC6358h0 instanceof F1) {
                m(((F1) abstractC6358h0).a());
            } else {
                k();
            }
        }
    }

    private final void m(long j10) {
        if (this.f63418d && j10 != 16) {
            long j11 = this.f63419e;
            if (j11 == 16) {
                this.f63419e = j10;
            } else {
                if (AbstractC7043o.e(j11, j10)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(AbstractC7040l abstractC7040l) {
        if (abstractC7040l instanceof C7035g) {
            C7035g c7035g = (C7035g) abstractC7040l;
            l(c7035g.e());
            l(c7035g.g());
        } else if (abstractC7040l instanceof C7031c) {
            C7031c c7031c = (C7031c) abstractC7040l;
            if (c7031c.f63418d && this.f63418d) {
                m(c7031c.f63419e);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            InterfaceC6374m1 interfaceC6374m1A = this.f63422h;
            if (interfaceC6374m1A == null) {
                interfaceC6374m1A = V.a();
                this.f63422h = interfaceC6374m1A;
            }
            AbstractC7039k.c(this.f63420f, interfaceC6374m1A);
        }
    }

    private final void y() {
        float[] fArrC = this.f63416b;
        if (fArrC == null) {
            fArrC = C6356g1.c(null, 1, null);
            this.f63416b = fArrC;
        } else {
            C6356g1.h(fArrC);
        }
        float[] fArr = fArrC;
        C6356g1.o(fArr, this.f63427m + this.f63431q, this.f63428n + this.f63432r, 0.0f, 4, null);
        C6356g1.j(fArr, this.f63426l);
        C6356g1.k(fArr, this.f63429o, this.f63430p, 1.0f);
        C6356g1.o(fArr, -this.f63427m, -this.f63428n, 0.0f, 4, null);
    }

    @Override // x0.AbstractC7040l
    public void a(InterfaceC6711f interfaceC6711f) {
        if (this.f63433s) {
            y();
            this.f63433s = false;
        }
        if (this.f63421g) {
            x();
            this.f63421g = false;
        }
        InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
        long jF = interfaceC6709dN1.f();
        interfaceC6709dN1.b().p();
        try {
            InterfaceC6713h interfaceC6713hA = interfaceC6709dN1.a();
            float[] fArr = this.f63416b;
            if (fArr != null) {
                interfaceC6713hA.a(C6356g1.a(fArr).p());
            }
            InterfaceC6374m1 interfaceC6374m1 = this.f63422h;
            if (h() && interfaceC6374m1 != null) {
                InterfaceC6713h.h(interfaceC6713hA, interfaceC6374m1, 0, 2, null);
            }
            List list = this.f63417c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC7040l) list.get(i10)).a(interfaceC6711f);
            }
            interfaceC6709dN1.b().k();
            interfaceC6709dN1.e(jF);
        } catch (Throwable th2) {
            interfaceC6709dN1.b().k();
            interfaceC6709dN1.e(jF);
            throw th2;
        }
    }

    @Override // x0.AbstractC7040l
    public Function1 b() {
        return this.f63423i;
    }

    @Override // x0.AbstractC7040l
    public void d(Function1 function1) {
        this.f63423i = function1;
    }

    public final int f() {
        return this.f63417c.size();
    }

    public final long g() {
        return this.f63419e;
    }

    public final void i(int i10, AbstractC7040l abstractC7040l) {
        if (i10 < f()) {
            this.f63417c.set(i10, abstractC7040l);
        } else {
            this.f63417c.add(abstractC7040l);
        }
        n(abstractC7040l);
        abstractC7040l.d(this.f63424j);
        c();
    }

    public final boolean j() {
        return this.f63418d;
    }

    public final void o(List list) {
        this.f63420f = list;
        this.f63421g = true;
        c();
    }

    public final void p(String str) {
        this.f63425k = str;
        c();
    }

    public final void q(float f10) {
        this.f63427m = f10;
        this.f63433s = true;
        c();
    }

    public final void r(float f10) {
        this.f63428n = f10;
        this.f63433s = true;
        c();
    }

    public final void s(float f10) {
        this.f63426l = f10;
        this.f63433s = true;
        c();
    }

    public final void t(float f10) {
        this.f63429o = f10;
        this.f63433s = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f63425k);
        List list = this.f63417c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC7040l abstractC7040l = (AbstractC7040l) list.get(i10);
            sb2.append("\t");
            sb2.append(abstractC7040l.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.f63430p = f10;
        this.f63433s = true;
        c();
    }

    public final void v(float f10) {
        this.f63431q = f10;
        this.f63433s = true;
        c();
    }

    public final void w(float f10) {
        this.f63432r = f10;
        this.f63433s = true;
        c();
    }
}
