package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class L0 {

    /* JADX INFO: renamed from: b */
    public static final L0 f28953b;

    /* JADX INFO: renamed from: a */
    private final o f28954a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends c {
        d() {
        }

        @Override // androidx.core.view.L0.g
        void c(int i10, A1.b bVar) {
            this.f28962c.setInsets(q.a(i10), bVar.g());
        }

        d(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends d {
        e() {
        }

        e(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends e {
        f() {
        }

        @Override // androidx.core.view.L0.d, androidx.core.view.L0.g
        void c(int i10, A1.b bVar) {
            this.f28962c.setInsets(r.a(i10), bVar.g());
        }

        f(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {

        /* JADX INFO: renamed from: a */
        private final L0 f28963a;

        /* JADX INFO: renamed from: b */
        A1.b[] f28964b;

        g() {
            this(new L0((L0) null));
        }

        protected final void a() {
            A1.b[] bVarArr = this.f28964b;
            if (bVarArr != null) {
                A1.b bVarF = bVarArr[p.e(1)];
                A1.b bVarF2 = this.f28964b[p.e(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f28963a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f28963a.f(1);
                }
                g(A1.b.b(bVarF, bVarF2));
                A1.b bVar = this.f28964b[p.e(16)];
                if (bVar != null) {
                    f(bVar);
                }
                A1.b bVar2 = this.f28964b[p.e(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                A1.b bVar3 = this.f28964b[p.e(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        abstract L0 b();

        void c(int i10, A1.b bVar) {
            if (this.f28964b == null) {
                this.f28964b = new A1.b[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f28964b[p.e(i11)] = bVar;
                }
            }
        }

        abstract void e(A1.b bVar);

        abstract void g(A1.b bVar);

        g(L0 l02) {
            this.f28963a = l02;
        }

        void d(A1.b bVar) {
        }

        void f(A1.b bVar) {
        }

        void h(A1.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class j extends i {
        j(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.o
        L0 a() {
            return L0.z(this.f28970c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f28970c, jVar.f28970c) && Objects.equals(this.f28974g, jVar.f28974g) && h.C(this.f28975h, jVar.f28975h);
        }

        @Override // androidx.core.view.L0.o
        androidx.core.view.r f() {
            return androidx.core.view.r.g(this.f28970c.getDisplayCutout());
        }

        @Override // androidx.core.view.L0.o
        public int hashCode() {
            return this.f28970c.hashCode();
        }

        j(L0 l02, j jVar) {
            super(l02, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class l extends k {

        /* JADX INFO: renamed from: r */
        static final L0 f28980r = L0.z(WindowInsets.CONSUMED);

        l(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public A1.b g(int i10) {
            return A1.b.f(this.f28970c.getInsets(q.a(i10)));
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public A1.b h(int i10) {
            return A1.b.f(this.f28970c.getInsetsIgnoringVisibility(q.a(i10)));
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean q(int i10) {
            return this.f28970c.isVisible(q.a(i10));
        }

        l(L0 l02, l lVar) {
            super(l02, lVar);
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class m extends l {
        m(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        m(L0 l02, m mVar) {
            super(l02, mVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class n extends m {

        /* JADX INFO: renamed from: s */
        static final L0 f28981s = L0.z(WindowInsets.CONSUMED);

        n(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public A1.b g(int i10) {
            return A1.b.f(this.f28970c.getInsets(r.a(i10)));
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public A1.b h(int i10) {
            return A1.b.f(this.f28970c.getInsetsIgnoringVisibility(r.a(i10)));
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean q(int i10) {
            return this.f28970c.isVisible(r.a(i10));
        }

        n(L0 l02, n nVar) {
            super(l02, nVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p {
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 519;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class q {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class r {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f28953b = n.f28981s;
        } else if (i10 >= 30) {
            f28953b = l.f28980r;
        } else {
            f28953b = o.f28982b;
        }
    }

    private L0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f28954a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f28954a = new m(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f28954a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f28954a = new k(this, windowInsets);
        } else if (i10 >= 28) {
            this.f28954a = new j(this, windowInsets);
        } else {
            this.f28954a = new i(this, windowInsets);
        }
    }

    public static L0 A(WindowInsets windowInsets, View view) {
        L0 l02 = new L0((WindowInsets) K1.f.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            l02.v(AbstractC2747a0.F(view));
            l02.d(view.getRootView());
            l02.x(view.getWindowSystemUiVisibility());
        }
        return l02;
    }

    static A1.b p(A1.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f104a - i10);
        int iMax2 = Math.max(0, bVar.f105b - i11);
        int iMax3 = Math.max(0, bVar.f106c - i12);
        int iMax4 = Math.max(0, bVar.f107d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : A1.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static L0 z(WindowInsets windowInsets) {
        return A(windowInsets, null);
    }

    public L0 a() {
        return this.f28954a.a();
    }

    public L0 b() {
        return this.f28954a.b();
    }

    public L0 c() {
        return this.f28954a.c();
    }

    void d(View view) {
        this.f28954a.d(view);
    }

    public androidx.core.view.r e() {
        return this.f28954a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L0) {
            return K1.b.a(this.f28954a, ((L0) obj).f28954a);
        }
        return false;
    }

    public A1.b f(int i10) {
        return this.f28954a.g(i10);
    }

    public A1.b g(int i10) {
        return this.f28954a.h(i10);
    }

    public A1.b h() {
        return this.f28954a.j();
    }

    public int hashCode() {
        o oVar = this.f28954a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public A1.b i() {
        return this.f28954a.k();
    }

    public int j() {
        return this.f28954a.l().f107d;
    }

    public int k() {
        return this.f28954a.l().f104a;
    }

    public int l() {
        return this.f28954a.l().f106c;
    }

    public int m() {
        return this.f28954a.l().f105b;
    }

    public boolean n() {
        A1.b bVarF = f(p.a());
        A1.b bVar = A1.b.f103e;
        return (bVarF.equals(bVar) && g(p.a() ^ p.d()).equals(bVar) && e() == null) ? false : true;
    }

    public L0 o(int i10, int i11, int i12, int i13) {
        return this.f28954a.n(i10, i11, i12, i13);
    }

    public boolean q() {
        return this.f28954a.o();
    }

    public boolean r(int i10) {
        return this.f28954a.q(i10);
    }

    public L0 s(int i10, int i11, int i12, int i13) {
        return new a(this).d(A1.b.c(i10, i11, i12, i13)).a();
    }

    void t(A1.b[] bVarArr) {
        this.f28954a.r(bVarArr);
    }

    void u(A1.b bVar) {
        this.f28954a.s(bVar);
    }

    void v(L0 l02) {
        this.f28954a.t(l02);
    }

    void w(A1.b bVar) {
        this.f28954a.u(bVar);
    }

    void x(int i10) {
        this.f28954a.v(i10);
    }

    public WindowInsets y() {
        o oVar = this.f28954a;
        if (oVar instanceof h) {
            return ((h) oVar).f28970c;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends g {

        /* JADX INFO: renamed from: e */
        private static Field f28956e = null;

        /* JADX INFO: renamed from: f */
        private static boolean f28957f = false;

        /* JADX INFO: renamed from: g */
        private static Constructor f28958g = null;

        /* JADX INFO: renamed from: h */
        private static boolean f28959h = false;

        /* JADX INFO: renamed from: c */
        private WindowInsets f28960c;

        /* JADX INFO: renamed from: d */
        private A1.b f28961d;

        b() {
            this.f28960c = i();
        }

        private static WindowInsets i() {
            if (!f28957f) {
                try {
                    f28956e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f28957f = true;
            }
            Field field = f28956e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f28959h) {
                try {
                    f28958g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f28959h = true;
            }
            Constructor constructor = f28958g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.L0.g
        L0 b() {
            a();
            L0 l0Z = L0.z(this.f28960c);
            l0Z.t(this.f28964b);
            l0Z.w(this.f28961d);
            return l0Z;
        }

        @Override // androidx.core.view.L0.g
        void e(A1.b bVar) {
            this.f28961d = bVar;
        }

        @Override // androidx.core.view.L0.g
        void g(A1.b bVar) {
            WindowInsets windowInsets = this.f28960c;
            if (windowInsets != null) {
                this.f28960c = windowInsets.replaceSystemWindowInsets(bVar.f104a, bVar.f105b, bVar.f106c, bVar.f107d);
            }
        }

        b(L0 l02) {
            super(l02);
            this.f28960c = l02.y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends g {

        /* JADX INFO: renamed from: c */
        final WindowInsets.Builder f28962c;

        c() {
            this.f28962c = I1.j.a();
        }

        @Override // androidx.core.view.L0.g
        L0 b() {
            a();
            L0 l0Z = L0.z(this.f28962c.build());
            l0Z.t(this.f28964b);
            return l0Z;
        }

        @Override // androidx.core.view.L0.g
        void d(A1.b bVar) {
            this.f28962c.setMandatorySystemGestureInsets(bVar.g());
        }

        @Override // androidx.core.view.L0.g
        void e(A1.b bVar) {
            this.f28962c.setStableInsets(bVar.g());
        }

        @Override // androidx.core.view.L0.g
        void f(A1.b bVar) {
            this.f28962c.setSystemGestureInsets(bVar.g());
        }

        @Override // androidx.core.view.L0.g
        void g(A1.b bVar) {
            this.f28962c.setSystemWindowInsets(bVar.g());
        }

        @Override // androidx.core.view.L0.g
        void h(A1.b bVar) {
            this.f28962c.setTappableElementInsets(bVar.g());
        }

        c(L0 l02) {
            WindowInsets.Builder builderA;
            super(l02);
            WindowInsets windowInsetsY = l02.y();
            if (windowInsetsY != null) {
                builderA = R0.a(windowInsetsY);
            } else {
                builderA = I1.j.a();
            }
            this.f28962c = builderA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends h {

        /* JADX INFO: renamed from: n */
        private A1.b f28976n;

        i(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
            this.f28976n = null;
        }

        @Override // androidx.core.view.L0.o
        L0 b() {
            return L0.z(this.f28970c.consumeStableInsets());
        }

        @Override // androidx.core.view.L0.o
        L0 c() {
            return L0.z(this.f28970c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.L0.o
        final A1.b j() {
            if (this.f28976n == null) {
                this.f28976n = A1.b.c(this.f28970c.getStableInsetLeft(), this.f28970c.getStableInsetTop(), this.f28970c.getStableInsetRight(), this.f28970c.getStableInsetBottom());
            }
            return this.f28976n;
        }

        @Override // androidx.core.view.L0.o
        boolean o() {
            return this.f28970c.isConsumed();
        }

        @Override // androidx.core.view.L0.o
        public void u(A1.b bVar) {
            this.f28976n = bVar;
        }

        i(L0 l02, i iVar) {
            super(l02, iVar);
            this.f28976n = null;
            this.f28976n = iVar.f28976n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h extends o {

        /* JADX INFO: renamed from: i */
        private static boolean f28965i = false;

        /* JADX INFO: renamed from: j */
        private static Method f28966j;

        /* JADX INFO: renamed from: k */
        private static Class f28967k;

        /* JADX INFO: renamed from: l */
        private static Field f28968l;

        /* JADX INFO: renamed from: m */
        private static Field f28969m;

        /* JADX INFO: renamed from: c */
        final WindowInsets f28970c;

        /* JADX INFO: renamed from: d */
        private A1.b[] f28971d;

        /* JADX INFO: renamed from: e */
        private A1.b f28972e;

        /* JADX INFO: renamed from: f */
        private L0 f28973f;

        /* JADX INFO: renamed from: g */
        A1.b f28974g;

        /* JADX INFO: renamed from: h */
        int f28975h;

        h(L0 l02, WindowInsets windowInsets) {
            super(l02);
            this.f28972e = null;
            this.f28970c = windowInsets;
        }

        private static void B() {
            try {
                f28966j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f28967k = cls;
                f28968l = cls.getDeclaredField("mVisibleInsets");
                f28969m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f28968l.setAccessible(true);
                f28969m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f28965i = true;
        }

        static boolean C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        private A1.b w(int i10, boolean z10) {
            A1.b bVarB = A1.b.f103e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarB = A1.b.b(bVarB, x(i11, z10));
                }
            }
            return bVarB;
        }

        private A1.b y() {
            L0 l02 = this.f28973f;
            return l02 != null ? l02.h() : A1.b.f103e;
        }

        private A1.b z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f28965i) {
                B();
            }
            Method method = f28966j;
            if (method != null && f28967k != null && f28968l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f28968l.get(f28969m.get(objInvoke));
                    if (rect != null) {
                        return A1.b.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        protected boolean A(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !x(i10, false).equals(A1.b.f103e);
        }

        @Override // androidx.core.view.L0.o
        void d(View view) {
            A1.b bVarZ = z(view);
            if (bVarZ == null) {
                bVarZ = A1.b.f103e;
            }
            s(bVarZ);
        }

        @Override // androidx.core.view.L0.o
        void e(L0 l02) {
            l02.v(this.f28973f);
            l02.u(this.f28974g);
            l02.x(this.f28975h);
        }

        @Override // androidx.core.view.L0.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f28974g, hVar.f28974g) && C(this.f28975h, hVar.f28975h);
        }

        @Override // androidx.core.view.L0.o
        public A1.b g(int i10) {
            return w(i10, false);
        }

        @Override // androidx.core.view.L0.o
        public A1.b h(int i10) {
            return w(i10, true);
        }

        @Override // androidx.core.view.L0.o
        final A1.b l() {
            if (this.f28972e == null) {
                this.f28972e = A1.b.c(this.f28970c.getSystemWindowInsetLeft(), this.f28970c.getSystemWindowInsetTop(), this.f28970c.getSystemWindowInsetRight(), this.f28970c.getSystemWindowInsetBottom());
            }
            return this.f28972e;
        }

        @Override // androidx.core.view.L0.o
        L0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(L0.z(this.f28970c));
            aVar.d(L0.p(l(), i10, i11, i12, i13));
            aVar.c(L0.p(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.L0.o
        boolean p() {
            return this.f28970c.isRound();
        }

        @Override // androidx.core.view.L0.o
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !A(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.L0.o
        public void r(A1.b[] bVarArr) {
            this.f28971d = bVarArr;
        }

        @Override // androidx.core.view.L0.o
        void s(A1.b bVar) {
            this.f28974g = bVar;
        }

        @Override // androidx.core.view.L0.o
        void t(L0 l02) {
            this.f28973f = l02;
        }

        @Override // androidx.core.view.L0.o
        void v(int i10) {
            this.f28975h = i10;
        }

        protected A1.b x(int i10, boolean z10) {
            A1.b bVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? A1.b.c(0, Math.max(y().f105b, l().f105b), 0, 0) : (this.f28975h & 4) != 0 ? A1.b.f103e : A1.b.c(0, l().f105b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    A1.b bVarY = y();
                    A1.b bVarJ = j();
                    return A1.b.c(Math.max(bVarY.f104a, bVarJ.f104a), 0, Math.max(bVarY.f106c, bVarJ.f106c), Math.max(bVarY.f107d, bVarJ.f107d));
                }
                if ((this.f28975h & 2) != 0) {
                    return A1.b.f103e;
                }
                A1.b bVarL = l();
                L0 l02 = this.f28973f;
                bVarH = l02 != null ? l02.h() : null;
                int iMin = bVarL.f107d;
                if (bVarH != null) {
                    iMin = Math.min(iMin, bVarH.f107d);
                }
                return A1.b.c(bVarL.f104a, 0, bVarL.f106c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return A1.b.f103e;
                }
                L0 l03 = this.f28973f;
                androidx.core.view.r rVarE = l03 != null ? l03.e() : f();
                return rVarE != null ? A1.b.c(rVarE.c(), rVarE.e(), rVarE.d(), rVarE.b()) : A1.b.f103e;
            }
            A1.b[] bVarArr = this.f28971d;
            bVarH = bVarArr != null ? bVarArr[p.e(8)] : null;
            if (bVarH != null) {
                return bVarH;
            }
            A1.b bVarL2 = l();
            A1.b bVarY2 = y();
            int i12 = bVarL2.f107d;
            if (i12 > bVarY2.f107d) {
                return A1.b.c(0, 0, 0, i12);
            }
            A1.b bVar = this.f28974g;
            return (bVar == null || bVar.equals(A1.b.f103e) || (i11 = this.f28974g.f107d) <= bVarY2.f107d) ? A1.b.f103e : A1.b.c(0, 0, 0, i11);
        }

        h(L0 l02, h hVar) {
            this(l02, new WindowInsets(hVar.f28970c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class k extends j {

        /* JADX INFO: renamed from: o */
        private A1.b f28977o;

        /* JADX INFO: renamed from: p */
        private A1.b f28978p;

        /* JADX INFO: renamed from: q */
        private A1.b f28979q;

        k(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
            this.f28977o = null;
            this.f28978p = null;
            this.f28979q = null;
        }

        @Override // androidx.core.view.L0.o
        A1.b i() {
            if (this.f28978p == null) {
                this.f28978p = A1.b.f(this.f28970c.getMandatorySystemGestureInsets());
            }
            return this.f28978p;
        }

        @Override // androidx.core.view.L0.o
        A1.b k() {
            if (this.f28977o == null) {
                this.f28977o = A1.b.f(this.f28970c.getSystemGestureInsets());
            }
            return this.f28977o;
        }

        @Override // androidx.core.view.L0.o
        A1.b m() {
            if (this.f28979q == null) {
                this.f28979q = A1.b.f(this.f28970c.getTappableElementInsets());
            }
            return this.f28979q;
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        L0 n(int i10, int i11, int i12, int i13) {
            return L0.z(this.f28970c.inset(i10, i11, i12, i13));
        }

        k(L0 l02, k kVar) {
            super(l02, kVar);
            this.f28977o = null;
            this.f28978p = null;
            this.f28979q = null;
        }

        @Override // androidx.core.view.L0.i, androidx.core.view.L0.o
        public void u(A1.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final g f28955a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f28955a = new f();
                return;
            }
            if (i10 >= 31) {
                this.f28955a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f28955a = new d();
            } else if (i10 >= 29) {
                this.f28955a = new c();
            } else {
                this.f28955a = new b();
            }
        }

        public L0 a() {
            return this.f28955a.b();
        }

        public a b(int i10, A1.b bVar) {
            this.f28955a.c(i10, bVar);
            return this;
        }

        public a c(A1.b bVar) {
            this.f28955a.e(bVar);
            return this;
        }

        public a d(A1.b bVar) {
            this.f28955a.g(bVar);
            return this;
        }

        public a(L0 l02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f28955a = new f(l02);
                return;
            }
            if (i10 >= 31) {
                this.f28955a = new e(l02);
                return;
            }
            if (i10 >= 30) {
                this.f28955a = new d(l02);
            } else if (i10 >= 29) {
                this.f28955a = new c(l02);
            } else {
                this.f28955a = new b(l02);
            }
        }
    }

    public L0(L0 l02) {
        if (l02 != null) {
            o oVar = l02.f28954a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (oVar instanceof n)) {
                this.f28954a = new n(this, (n) oVar);
            } else if (i10 >= 31 && (oVar instanceof m)) {
                this.f28954a = new m(this, (m) oVar);
            } else if (i10 >= 30 && (oVar instanceof l)) {
                this.f28954a = new l(this, (l) oVar);
            } else if (i10 >= 29 && (oVar instanceof k)) {
                this.f28954a = new k(this, (k) oVar);
            } else if (i10 >= 28 && (oVar instanceof j)) {
                this.f28954a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f28954a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f28954a = new h(this, (h) oVar);
            } else {
                this.f28954a = new o(this);
            }
            oVar.e(this);
            return;
        }
        this.f28954a = new o(this);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class o {

        /* JADX INFO: renamed from: b */
        static final L0 f28982b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a */
        final L0 f28983a;

        o(L0 l02) {
            this.f28983a = l02;
        }

        L0 a() {
            return this.f28983a;
        }

        L0 b() {
            return this.f28983a;
        }

        L0 c() {
            return this.f28983a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p() == oVar.p() && o() == oVar.o() && K1.b.a(l(), oVar.l()) && K1.b.a(j(), oVar.j()) && K1.b.a(f(), oVar.f());
        }

        androidx.core.view.r f() {
            return null;
        }

        A1.b g(int i10) {
            return A1.b.f103e;
        }

        A1.b h(int i10) {
            if ((i10 & 8) == 0) {
                return A1.b.f103e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return K1.b.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        A1.b i() {
            return l();
        }

        A1.b j() {
            return A1.b.f103e;
        }

        A1.b k() {
            return l();
        }

        A1.b l() {
            return A1.b.f103e;
        }

        A1.b m() {
            return l();
        }

        L0 n(int i10, int i11, int i12, int i13) {
            return f28982b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        void d(View view) {
        }

        void e(L0 l02) {
        }

        public void r(A1.b[] bVarArr) {
        }

        void s(A1.b bVar) {
        }

        void t(L0 l02) {
        }

        public void u(A1.b bVar) {
        }

        void v(int i10) {
        }
    }
}
