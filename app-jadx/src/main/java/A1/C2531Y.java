package a1;

import E0.InterfaceC1298h;
import Td.AbstractC2163n;
import U0.T0;
import U0.W0;
import a0.C2507c;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import be.AbstractC3048a;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ke.AbstractC5466a;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;

/* JADX INFO: renamed from: a1.Y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2531Y implements InterfaceC2520M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f23549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2554v f23550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f23551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function1 f23553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Function1 f23554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2527U f23555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2552t f23556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f23557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f23558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f23559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2537e f23560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2507c f23561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f23562n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a1.Y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23563a = new a("StartInput", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23564b = new a("StopInput", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f23565c = new a("ShowKeyboard", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f23566d = new a("HideKeyboard", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f23567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f23568f;

        static {
            a[] aVarArrA = a();
            f23567e = aVarArrA;
            f23568f = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f23563a, f23564b, f23565c, f23566d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f23567e.clone();
        }
    }

    /* JADX INFO: renamed from: a1.Y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23569a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f23563a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f23564b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f23565c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f23566d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23569a = iArr;
        }
    }

    /* JADX INFO: renamed from: a1.Y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(C2531Y.this.q(), false);
        }
    }

    /* JADX INFO: renamed from: a1.Y$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC2553u {
        d() {
        }

        @Override // a1.InterfaceC2553u
        public void a(KeyEvent keyEvent) {
            C2531Y.this.p().sendKeyEvent(keyEvent);
        }

        @Override // a1.InterfaceC2553u
        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            C2531Y.this.f23560l.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // a1.InterfaceC2553u
        public void c(int i10) {
            C2531Y.this.f23554f.invoke(C2551s.j(i10));
        }

        @Override // a1.InterfaceC2553u
        public void d(List list) {
            C2531Y.this.f23553e.invoke(list);
        }

        @Override // a1.InterfaceC2553u
        public void e(InputConnectionC2521N inputConnectionC2521N) {
            int size = C2531Y.this.f23557i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC5504s.c(((WeakReference) C2531Y.this.f23557i.get(i10)).get(), inputConnectionC2521N)) {
                    C2531Y.this.f23557i.remove(i10);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a1.Y$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f23572a = new e();

        e() {
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

    /* JADX INFO: renamed from: a1.Y$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f23574a = new g();

        g() {
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

    public C2531Y(View view, InterfaceC1298h interfaceC1298h, InterfaceC2554v interfaceC2554v, Executor executor) {
        this.f23549a = view;
        this.f23550b = interfaceC2554v;
        this.f23551c = executor;
        this.f23553e = e.f23572a;
        this.f23554f = f.f23573a;
        this.f23555g = new C2527U("", W0.f18785b.a(), (W0) null, 4, (DefaultConstructorMarker) null);
        this.f23556h = C2552t.f23639g.a();
        this.f23557i = new ArrayList();
        this.f23558j = AbstractC2163n.a(Td.q.f17463c, new c());
        this.f23560l = new C2537e(interfaceC1298h, interfaceC2554v);
        this.f23561m = new C2507c(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f23558j.getValue();
    }

    private final void s() {
        View viewFindFocus;
        if (!this.f23549a.isFocused() && (viewFindFocus = this.f23549a.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.f23561m.i();
            return;
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
        C2507c c2507c = this.f23561m;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            t((a) objArr[i10], n10, n11);
        }
        this.f23561m.i();
        if (AbstractC5504s.c(n10.f52259a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) n11.f52259a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (AbstractC5504s.c(n10.f52259a, Boolean.FALSE)) {
            u();
        }
    }

    private static final void t(a aVar, kotlin.jvm.internal.N n10, kotlin.jvm.internal.N n11) {
        int i10 = b.f23569a[aVar.ordinal()];
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            n10.f52259a = bool;
            n11.f52259a = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            n10.f52259a = bool2;
            n11.f52259a = bool2;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new Td.r();
            }
            if (AbstractC5504s.c(n10.f52259a, Boolean.FALSE)) {
                return;
            }
            n11.f52259a = Boolean.valueOf(aVar == a.f23565c);
        }
    }

    private final void u() {
        this.f23550b.c();
    }

    private final void v(a aVar) {
        this.f23561m.c(aVar);
        if (this.f23562n == null) {
            Runnable runnable = new Runnable() { // from class: a1.X
                @Override // java.lang.Runnable
                public final void run() {
                    C2531Y.w(this.f23548a);
                }
            };
            this.f23551c.execute(runnable);
            this.f23562n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C2531Y c2531y) {
        c2531y.f23562n = null;
        c2531y.s();
    }

    private final void x(boolean z10) {
        if (z10) {
            this.f23550b.d();
        } else {
            this.f23550b.e();
        }
    }

    @Override // a1.InterfaceC2520M
    public void a() {
        v(a.f23563a);
    }

    @Override // a1.InterfaceC2520M
    public void b() {
        this.f23552d = false;
        this.f23553e = g.f23574a;
        this.f23554f = h.f23575a;
        this.f23559k = null;
        v(a.f23564b);
    }

    @Override // a1.InterfaceC2520M
    public void c(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, Function1 function1, C6226h c6226h, C6226h c6226h2) {
        this.f23560l.d(c2527u, interfaceC2517J, t02, function1, c6226h, c6226h2);
    }

    @Override // a1.InterfaceC2520M
    public void d(C6226h c6226h) {
        Rect rect;
        this.f23559k = new Rect(AbstractC5466a.d(c6226h.i()), AbstractC5466a.d(c6226h.l()), AbstractC5466a.d(c6226h.j()), AbstractC5466a.d(c6226h.e()));
        if (!this.f23557i.isEmpty() || (rect = this.f23559k) == null) {
            return;
        }
        this.f23549a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // a1.InterfaceC2520M
    public void e() {
        v(a.f23566d);
    }

    @Override // a1.InterfaceC2520M
    public void f(C2527U c2527u, C2527U c2527u2) {
        boolean z10 = (W0.g(this.f23555g.k(), c2527u2.k()) && AbstractC5504s.c(this.f23555g.j(), c2527u2.j())) ? false : true;
        this.f23555g = c2527u2;
        int size = this.f23557i.size();
        for (int i10 = 0; i10 < size; i10++) {
            InputConnectionC2521N inputConnectionC2521N = (InputConnectionC2521N) ((WeakReference) this.f23557i.get(i10)).get();
            if (inputConnectionC2521N != null) {
                inputConnectionC2521N.f(c2527u2);
            }
        }
        this.f23560l.a();
        if (AbstractC5504s.c(c2527u, c2527u2)) {
            if (z10) {
                InterfaceC2554v interfaceC2554v = this.f23550b;
                int iL = W0.l(c2527u2.k());
                int iK = W0.k(c2527u2.k());
                W0 w0J = this.f23555g.j();
                int iL2 = w0J != null ? W0.l(w0J.r()) : -1;
                W0 w0J2 = this.f23555g.j();
                interfaceC2554v.a(iL, iK, iL2, w0J2 != null ? W0.k(w0J2.r()) : -1);
                return;
            }
            return;
        }
        if (c2527u != null && (!AbstractC5504s.c(c2527u.l(), c2527u2.l()) || (W0.g(c2527u.k(), c2527u2.k()) && !AbstractC5504s.c(c2527u.j(), c2527u2.j())))) {
            u();
            return;
        }
        int size2 = this.f23557i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InputConnectionC2521N inputConnectionC2521N2 = (InputConnectionC2521N) ((WeakReference) this.f23557i.get(i11)).get();
            if (inputConnectionC2521N2 != null) {
                inputConnectionC2521N2.g(this.f23555g, this.f23550b);
            }
        }
    }

    @Override // a1.InterfaceC2520M
    public void g() {
        v(a.f23565c);
    }

    @Override // a1.InterfaceC2520M
    public void h(C2527U c2527u, C2552t c2552t, Function1 function1, Function1 function12) {
        this.f23552d = true;
        this.f23555g = c2527u;
        this.f23556h = c2552t;
        this.f23553e = function1;
        this.f23554f = function12;
        v(a.f23563a);
    }

    public final InputConnection o(EditorInfo editorInfo) {
        if (!this.f23552d) {
            return null;
        }
        b0.h(editorInfo, this.f23556h, this.f23555g);
        b0.i(editorInfo);
        InputConnectionC2521N inputConnectionC2521N = new InputConnectionC2521N(this.f23555g, new d(), this.f23556h.b());
        this.f23557i.add(new WeakReference(inputConnectionC2521N));
        return inputConnectionC2521N;
    }

    public final View q() {
        return this.f23549a;
    }

    public final boolean r() {
        return this.f23552d;
    }

    public /* synthetic */ C2531Y(View view, InterfaceC1298h interfaceC1298h, InterfaceC2554v interfaceC2554v, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, interfaceC1298h, interfaceC2554v, (i10 & 8) != 0 ? b0.d(Choreographer.getInstance()) : executor);
    }

    public C2531Y(View view, InterfaceC1298h interfaceC1298h) {
        this(view, interfaceC1298h, new C2555w(view), null, 8, null);
    }

    /* JADX INFO: renamed from: a1.Y$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f23573a = new f();

        f() {
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

    /* JADX INFO: renamed from: a1.Y$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f23575a = new h();

        h() {
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
