package N;

import K.C1774y;
import N.q0;
import Td.AbstractC2163n;
import U0.T0;
import U0.W0;
import a1.C2527U;
import a1.C2551s;
import a1.C2552t;
import a1.InterfaceC2517J;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.InterfaceC2700g1;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements InterfaceC2700g1 {

    /* JADX INFO: renamed from: a */
    private final View f12538a;

    /* JADX INFO: renamed from: b */
    private final l0 f12539b;

    /* JADX INFO: renamed from: e */
    private C1774y f12542e;

    /* JADX INFO: renamed from: f */
    private Q.F f12543f;

    /* JADX INFO: renamed from: g */
    private A1 f12544g;

    /* JADX INFO: renamed from: l */
    private Rect f12549l;

    /* JADX INFO: renamed from: m */
    private final p0 f12550m;

    /* JADX INFO: renamed from: c */
    private Function1 f12540c = c.f12553a;

    /* JADX INFO: renamed from: d */
    private Function1 f12541d = d.f12554a;

    /* JADX INFO: renamed from: h */
    private C2527U f12545h = new C2527U("", W0.f18785b.a(), (W0) null, 4, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: i */
    private C2552t f12546i = C2552t.f23639g.a();

    /* JADX INFO: renamed from: j */
    private List f12547j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private final Lazy f12548k = AbstractC2163n.a(Td.q.f17463c, new a());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(s0.this.i(), false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements k0 {
        b() {
        }

        @Override // N.k0
        public void a(KeyEvent keyEvent) {
            s0.this.h().sendKeyEvent(keyEvent);
        }

        @Override // N.k0
        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            s0.this.f12550m.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // N.k0
        public void c(int i10) {
            s0.this.f12541d.invoke(C2551s.j(i10));
        }

        @Override // N.k0
        public void d(List list) {
            s0.this.f12540c.invoke(list);
        }

        @Override // N.k0
        public void e(u0 u0Var) {
            int size = s0.this.f12547j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC5504s.c(((WeakReference) s0.this.f12547j.get(i10)).get(), u0Var)) {
                    s0.this.f12547j.remove(i10);
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f12553a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Td.L.f17438a;
        }

        public final void invoke(List list) {
        }
    }

    public s0(View view, Function1 function1, l0 l0Var) {
        this.f12538a = view;
        this.f12539b = l0Var;
        this.f12550m = new p0(function1, l0Var);
    }

    public final BaseInputConnection h() {
        return (BaseInputConnection) this.f12548k.getValue();
    }

    private final void k() {
        this.f12539b.c();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2700g1
    /* JADX INFO: renamed from: g */
    public u0 a(EditorInfo editorInfo) {
        AbstractC1960z.c(editorInfo, this.f12545h.l(), this.f12545h.k(), this.f12546i, null, 8, null);
        r0.d(editorInfo);
        u0 u0Var = new u0(this.f12545h, new b(), this.f12546i.b(), this.f12542e, this.f12543f, this.f12544g);
        this.f12547j.add(new WeakReference(u0Var));
        return u0Var;
    }

    public final View i() {
        return this.f12538a;
    }

    public final void j(C6226h c6226h) {
        Rect rect;
        this.f12549l = new Rect(AbstractC5466a.d(c6226h.i()), AbstractC5466a.d(c6226h.l()), AbstractC5466a.d(c6226h.j()), AbstractC5466a.d(c6226h.e()));
        if (!this.f12547j.isEmpty() || (rect = this.f12549l) == null) {
            return;
        }
        this.f12538a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void l(C2527U c2527u, q0.a aVar, C2552t c2552t, Function1 function1, Function1 function12) {
        this.f12545h = c2527u;
        this.f12546i = c2552t;
        this.f12540c = function1;
        this.f12541d = function12;
        this.f12542e = aVar != null ? aVar.y1() : null;
        this.f12543f = aVar != null ? aVar.Y0() : null;
        this.f12544g = aVar != null ? aVar.getViewConfiguration() : null;
    }

    public final void m(C2527U c2527u, C2527U c2527u2) {
        boolean z10 = (W0.g(this.f12545h.k(), c2527u2.k()) && AbstractC5504s.c(this.f12545h.j(), c2527u2.j())) ? false : true;
        this.f12545h = c2527u2;
        int size = this.f12547j.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = (u0) ((WeakReference) this.f12547j.get(i10)).get();
            if (u0Var != null) {
                u0Var.g(c2527u2);
            }
        }
        this.f12550m.a();
        if (AbstractC5504s.c(c2527u, c2527u2)) {
            if (z10) {
                l0 l0Var = this.f12539b;
                int iL = W0.l(c2527u2.k());
                int iK = W0.k(c2527u2.k());
                W0 w0J = this.f12545h.j();
                int iL2 = w0J != null ? W0.l(w0J.r()) : -1;
                W0 w0J2 = this.f12545h.j();
                l0Var.a(iL, iK, iL2, w0J2 != null ? W0.k(w0J2.r()) : -1);
                return;
            }
            return;
        }
        if (c2527u != null && (!AbstractC5504s.c(c2527u.l(), c2527u2.l()) || (W0.g(c2527u.k(), c2527u2.k()) && !AbstractC5504s.c(c2527u.j(), c2527u2.j())))) {
            k();
            return;
        }
        int size2 = this.f12547j.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u0 u0Var2 = (u0) ((WeakReference) this.f12547j.get(i11)).get();
            if (u0Var2 != null) {
                u0Var2.h(this.f12545h, this.f12539b);
            }
        }
    }

    public final void n(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, C6226h c6226h, C6226h c6226h2) {
        this.f12550m.d(c2527u, interfaceC2517J, t02, c6226h, c6226h2);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final d f12554a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2551s) obj).p());
            return Td.L.f17438a;
        }

        public final void a(int i10) {
        }
    }
}
