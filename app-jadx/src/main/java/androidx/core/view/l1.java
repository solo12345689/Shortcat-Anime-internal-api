package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a */
    private final g f29062a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.l1.g
        public boolean c() {
            return (this.f29063a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.l1.g
        public void e(boolean z10) {
            if (!z10) {
                l(8192);
                return;
            }
            m(67108864);
            j(Integer.MIN_VALUE);
            i(8192);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.l1.g
        public void d(boolean z10) {
            if (!z10) {
                l(16);
                return;
            }
            m(134217728);
            j(Integer.MIN_VALUE);
            i(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends d {
        e(Window window, l1 l1Var, O o10) {
            super(window, l1Var, o10);
        }

        @Override // androidx.core.view.l1.d, androidx.core.view.l1.g
        void f(int i10) {
            this.f29066b.setSystemBarsBehavior(i10);
        }

        e(WindowInsetsController windowInsetsController, l1 l1Var, O o10) {
            super(windowInsetsController, l1Var, o10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends e {
        f(Window window, l1 l1Var, O o10) {
            super(window, l1Var, o10);
        }

        @Override // androidx.core.view.l1.d, androidx.core.view.l1.g
        public boolean c() {
            return (this.f29066b.getSystemBarsAppearance() & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, l1 l1Var, O o10) {
            super(windowInsetsController, l1Var, o10);
        }
    }

    private l1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f29062a = new f(windowInsetsController, this, new O(windowInsetsController));
        } else {
            this.f29062a = new d(windowInsetsController, this, new O(windowInsetsController));
        }
    }

    public static l1 h(WindowInsetsController windowInsetsController) {
        return new l1(windowInsetsController);
    }

    public void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, D0 d02) {
        this.f29062a.a(i10, j10, interpolator, cancellationSignal, d02);
    }

    public void b(int i10) {
        this.f29062a.b(i10);
    }

    public boolean c() {
        return this.f29062a.c();
    }

    public void d(boolean z10) {
        this.f29062a.d(z10);
    }

    public void e(boolean z10) {
        this.f29062a.e(z10);
    }

    public void f(int i10) {
        this.f29062a.f(i10);
    }

    public void g(int i10) {
        this.f29062a.g(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends g {

        /* JADX INFO: renamed from: a */
        final l1 f29065a;

        /* JADX INFO: renamed from: b */
        final WindowInsetsController f29066b;

        /* JADX INFO: renamed from: c */
        final O f29067c;

        /* JADX INFO: renamed from: d */
        private final t.i0 f29068d;

        /* JADX INFO: renamed from: e */
        protected Window f29069e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a */
            private K0 f29070a = null;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ D0 f29071b;

            a(D0 d02) {
                this.f29071b = d02;
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f29071b.a(windowInsetsAnimationController == null ? null : this.f29070a);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f29071b.c(this.f29070a);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                K0 k02 = new K0(windowInsetsAnimationController);
                this.f29070a = k02;
                this.f29071b.b(k02, i10);
            }
        }

        d(Window window, l1 l1Var, O o10) {
            this(window.getInsetsController(), l1Var, o10);
            this.f29069e = window;
        }

        @Override // androidx.core.view.l1.g
        void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, D0 d02) {
            this.f29066b.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(d02));
        }

        @Override // androidx.core.view.l1.g
        void b(int i10) {
            if ((i10 & 8) != 0) {
                this.f29067c.a();
            }
            this.f29066b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.l1.g
        public boolean c() {
            this.f29066b.setSystemBarsAppearance(0, 0);
            return (this.f29066b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.l1.g
        public void d(boolean z10) {
            if (z10) {
                if (this.f29069e != null) {
                    h(16);
                }
                this.f29066b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f29069e != null) {
                    i(16);
                }
                this.f29066b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.l1.g
        public void e(boolean z10) {
            if (z10) {
                if (this.f29069e != null) {
                    h(8192);
                }
                this.f29066b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f29069e != null) {
                    i(8192);
                }
                this.f29066b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.l1.g
        void f(int i10) {
            Window window = this.f29069e;
            if (window == null) {
                this.f29066b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                i(6144);
                return;
            }
            if (i10 == 1) {
                i(4096);
                h(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                i(2048);
                h(4096);
            }
        }

        @Override // androidx.core.view.l1.g
        void g(int i10) {
            if ((i10 & 8) != 0) {
                this.f29067c.b();
            }
            this.f29066b.show(i10 & (-9));
        }

        protected void h(int i10) {
            View decorView = this.f29069e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void i(int i10) {
            View decorView = this.f29069e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, l1 l1Var, O o10) {
            this.f29068d = new t.i0();
            this.f29066b = windowInsetsController;
            this.f29065a = l1Var;
            this.f29067c = o10;
        }
    }

    public l1(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f29062a = new f(window, this, o10);
            return;
        }
        if (i10 >= 30) {
            this.f29062a = new d(window, this, o10);
        } else if (i10 >= 26) {
            this.f29062a = new c(window, o10);
        } else {
            this.f29062a = new b(window, o10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {
        g() {
        }

        abstract void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, D0 d02);

        abstract void b(int i10);

        public abstract boolean c();

        public abstract void e(boolean z10);

        abstract void f(int i10);

        abstract void g(int i10);

        public void d(boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends g {

        /* JADX INFO: renamed from: a */
        protected final Window f29063a;

        /* JADX INFO: renamed from: b */
        private final O f29064b;

        a(Window window, O o10) {
            this.f29063a = window;
            this.f29064b = o10;
        }

        private void h(int i10) {
            if (i10 == 1) {
                i(4);
            } else if (i10 == 2) {
                i(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f29064b.a();
            }
        }

        private void k(int i10) {
            if (i10 == 1) {
                l(4);
                m(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            } else if (i10 == 2) {
                l(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f29064b.b();
            }
        }

        @Override // androidx.core.view.l1.g
        void b(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    h(i11);
                }
            }
        }

        @Override // androidx.core.view.l1.g
        void f(int i10) {
            this.f29063a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                l(6144);
                return;
            }
            if (i10 == 1) {
                l(4096);
                i(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                l(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.l1.g
        void g(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    k(i11);
                }
            }
        }

        protected void i(int i10) {
            View decorView = this.f29063a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void j(int i10) {
            this.f29063a.addFlags(i10);
        }

        protected void l(int i10) {
            View decorView = this.f29063a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void m(int i10) {
            this.f29063a.clearFlags(i10);
        }

        @Override // androidx.core.view.l1.g
        void a(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, D0 d02) {
        }
    }
}
