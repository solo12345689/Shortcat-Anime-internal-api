package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.L0;
import h2.C4896a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import x1.AbstractC7046c;

/* JADX INFO: renamed from: androidx.core.view.p0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2777p0 {

    /* JADX INFO: renamed from: a */
    private e f29083a;

    /* JADX INFO: renamed from: androidx.core.view.p0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends e {

        /* JADX INFO: renamed from: f */
        private static final Interpolator f29086f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        private static final Interpolator f29087g = new C4896a();

        /* JADX INFO: renamed from: h */
        private static final Interpolator f29088h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        private static final Interpolator f29089i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: androidx.core.view.p0$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            final b f29090a;

            /* JADX INFO: renamed from: b */
            private L0 f29091b;

            /* JADX INFO: renamed from: androidx.core.view.p0$c$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            class C0498a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C2777p0 f29092a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ L0 f29093b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ L0 f29094c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f29095d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ View f29096e;

                C0498a(C2777p0 c2777p0, L0 l02, L0 l03, int i10, View view) {
                    this.f29092a = c2777p0;
                    this.f29093b = l02;
                    this.f29094c = l03;
                    this.f29095d = i10;
                    this.f29096e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f29092a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.f29096e, c.p(this.f29093b, this.f29094c, this.f29092a.c(), this.f29095d), Collections.singletonList(this.f29092a));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.p0$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C2777p0 f29098a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ View f29099b;

                b(C2777p0 c2777p0, View view) {
                    this.f29098a = c2777p0;
                    this.f29099b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f29098a.f(1.0f);
                    c.j(this.f29099b, this.f29098a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.p0$c$a$c */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            class RunnableC0499c implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ View f29101a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C2777p0 f29102b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ a f29103c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ ValueAnimator f29104d;

                RunnableC0499c(View view, C2777p0 c2777p0, a aVar, ValueAnimator valueAnimator) {
                    this.f29101a = view;
                    this.f29102b = c2777p0;
                    this.f29103c = aVar;
                    this.f29104d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m(this.f29101a, this.f29102b, this.f29103c);
                    this.f29104d.start();
                }
            }

            a(View view, b bVar) {
                this.f29090a = bVar;
                L0 l0F = AbstractC2747a0.F(view);
                this.f29091b = l0F != null ? new L0.a(l0F).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f29091b = L0.A(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                L0 l0A = L0.A(windowInsets, view);
                if (this.f29091b == null) {
                    this.f29091b = AbstractC2747a0.F(view);
                }
                if (this.f29091b == null) {
                    this.f29091b = l0A;
                    return c.n(view, windowInsets);
                }
                b bVarO = c.o(view);
                if (bVarO != null && Objects.equals(bVarO.mDispachedInsets, l0A)) {
                    return c.n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.f(l0A, this.f29091b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f29091b = l0A;
                    return c.n(view, windowInsets);
                }
                L0 l02 = this.f29091b;
                C2777p0 c2777p0 = new C2777p0(i12, c.h(i10, i11), (L0.p.d() & i12) != 0 ? 160L : 250L);
                c2777p0.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2777p0.b());
                a aVarG = c.g(l0A, l02, i12);
                c.k(view, c2777p0, l0A, false);
                duration.addUpdateListener(new C0498a(c2777p0, l0A, l02, i12, view));
                duration.addListener(new b(c2777p0, view));
                L.a(view, new RunnableC0499c(view, c2777p0, aVarG, duration));
                this.f29091b = l0A;
                return c.n(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static void f(L0 l02, L0 l03, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                A1.b bVarF = l02.f(i10);
                A1.b bVarF2 = l03.f(i10);
                int i11 = bVarF.f104a;
                int i12 = bVarF2.f104a;
                boolean z10 = i11 > i12 || bVarF.f105b > bVarF2.f105b || bVarF.f106c > bVarF2.f106c || bVarF.f107d > bVarF2.f107d;
                if (z10 != (i11 < i12 || bVarF.f105b < bVarF2.f105b || bVarF.f106c < bVarF2.f106c || bVarF.f107d < bVarF2.f107d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        static a g(L0 l02, L0 l03, int i10) {
            A1.b bVarF = l02.f(i10);
            A1.b bVarF2 = l03.f(i10);
            return new a(A1.b.c(Math.min(bVarF.f104a, bVarF2.f104a), Math.min(bVarF.f105b, bVarF2.f105b), Math.min(bVarF.f106c, bVarF2.f106c), Math.min(bVarF.f107d, bVarF2.f107d)), A1.b.c(Math.max(bVarF.f104a, bVarF2.f104a), Math.max(bVarF.f105b, bVarF2.f105b), Math.max(bVarF.f106c, bVarF2.f106c), Math.max(bVarF.f107d, bVarF2.f107d)));
        }

        static Interpolator h(int i10, int i11) {
            if ((L0.p.d() & i10) != 0) {
                return f29086f;
            }
            if ((L0.p.d() & i11) != 0) {
                return f29087g;
            }
            if ((i10 & L0.p.i()) != 0) {
                return f29088h;
            }
            if ((L0.p.i() & i11) != 0) {
                return f29089i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        static void j(View view, C2777p0 c2777p0) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.onEnd(c2777p0);
                if (bVarO.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c2777p0);
                }
            }
        }

        static void k(View view, C2777p0 c2777p0, L0 l02, boolean z10) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.mDispachedInsets = l02;
                if (!z10) {
                    bVarO.onPrepare(c2777p0);
                    z10 = bVarO.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), c2777p0, l02, z10);
                }
            }
        }

        static void l(View view, L0 l02, List list) {
            b bVarO = o(view);
            if (bVarO != null) {
                l02 = bVarO.onProgress(l02, list);
                if (bVarO.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), l02, list);
                }
            }
        }

        static void m(View view, C2777p0 c2777p0, a aVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.onStart(c2777p0, aVar);
                if (bVarO.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m(viewGroup.getChildAt(i10), c2777p0, aVar);
                }
            }
        }

        static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC7046c.f63619M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b o(View view) {
            Object tag = view.getTag(AbstractC7046c.f63626T);
            if (tag instanceof a) {
                return ((a) tag).f29090a;
            }
            return null;
        }

        static L0 p(L0 l02, L0 l03, float f10, int i10) {
            L0.a aVar = new L0.a(l02);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, l02.f(i11));
                } else {
                    A1.b bVarF = l02.f(i11);
                    A1.b bVarF2 = l03.f(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, L0.p(bVarF, (int) (((double) ((bVarF.f104a - bVarF2.f104a) * f11)) + 0.5d), (int) (((double) ((bVarF.f105b - bVarF2.f105b) * f11)) + 0.5d), (int) (((double) ((bVarF.f106c - bVarF2.f106c) * f11)) + 0.5d), (int) (((double) ((bVarF.f107d - bVarF2.f107d) * f11)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerI = bVar != null ? i(view, bVar) : null;
            view.setTag(AbstractC7046c.f63626T, onApplyWindowInsetsListenerI);
            if (view.getTag(AbstractC7046c.f63618L) == null && view.getTag(AbstractC7046c.f63619M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerI);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.p0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {

        /* JADX INFO: renamed from: a */
        private final int f29111a;

        /* JADX INFO: renamed from: b */
        private float f29112b;

        /* JADX INFO: renamed from: c */
        private final Interpolator f29113c;

        /* JADX INFO: renamed from: d */
        private final long f29114d;

        /* JADX INFO: renamed from: e */
        private float f29115e = 1.0f;

        e(int i10, Interpolator interpolator, long j10) {
            this.f29111a = i10;
            this.f29113c = interpolator;
            this.f29114d = j10;
        }

        public float a() {
            return this.f29115e;
        }

        public long b() {
            return this.f29114d;
        }

        public float c() {
            Interpolator interpolator = this.f29113c;
            return interpolator != null ? interpolator.getInterpolation(this.f29112b) : this.f29112b;
        }

        public int d() {
            return this.f29111a;
        }

        public void e(float f10) {
            this.f29112b = f10;
        }
    }

    public C2777p0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f29083a = new d(i10, interpolator, j10);
        } else {
            this.f29083a = new c(i10, interpolator, j10);
        }
    }

    static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    static C2777p0 g(WindowInsetsAnimation windowInsetsAnimation) {
        return new C2777p0(windowInsetsAnimation);
    }

    public float a() {
        return this.f29083a.a();
    }

    public long b() {
        return this.f29083a.b();
    }

    public float c() {
        return this.f29083a.c();
    }

    public int d() {
        return this.f29083a.d();
    }

    public void f(float f10) {
        this.f29083a.e(f10);
    }

    /* JADX INFO: renamed from: androidx.core.view.p0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends e {

        /* JADX INFO: renamed from: f */
        private final WindowInsetsAnimation f29106f;

        /* JADX INFO: renamed from: androidx.core.view.p0$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            private final b f29107a;

            /* JADX INFO: renamed from: b */
            private List f29108b;

            /* JADX INFO: renamed from: c */
            private ArrayList f29109c;

            /* JADX INFO: renamed from: d */
            private final HashMap f29110d;

            a(b bVar) {
                super(bVar.getDispatchMode());
                this.f29110d = new HashMap();
                this.f29107a = bVar;
            }

            private C2777p0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C2777p0 c2777p0 = (C2777p0) this.f29110d.get(windowInsetsAnimation);
                if (c2777p0 != null) {
                    return c2777p0;
                }
                C2777p0 c2777p0G = C2777p0.g(windowInsetsAnimation);
                this.f29110d.put(windowInsetsAnimation, c2777p0G);
                return c2777p0G;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f29107a.onEnd(a(windowInsetsAnimation));
                this.f29110d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f29107a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f29109c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f29109c = arrayList2;
                    this.f29108b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = B0.a(list.get(size));
                    C2777p0 c2777p0A = a(windowInsetsAnimationA);
                    c2777p0A.f(windowInsetsAnimationA.getFraction());
                    this.f29109c.add(c2777p0A);
                }
                return this.f29107a.onProgress(L0.z(windowInsets), this.f29108b).y();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f29107a.onStart(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f29106f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            AbstractC2794y0.a();
            return AbstractC2792x0.a(aVar.a().g(), aVar.b().g());
        }

        public static A1.b g(WindowInsetsAnimation.Bounds bounds) {
            return A1.b.f(bounds.getUpperBound());
        }

        public static A1.b h(WindowInsetsAnimation.Bounds bounds) {
            return A1.b.f(bounds.getLowerBound());
        }

        public static void i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.C2777p0.e
        public float a() {
            return this.f29106f.getAlpha();
        }

        @Override // androidx.core.view.C2777p0.e
        public long b() {
            return this.f29106f.getDurationMillis();
        }

        @Override // androidx.core.view.C2777p0.e
        public float c() {
            return this.f29106f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.C2777p0.e
        public int d() {
            return this.f29106f.getTypeMask();
        }

        @Override // androidx.core.view.C2777p0.e
        public void e(float f10) {
            this.f29106f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC2790w0.a(i10, interpolator, j10));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.p0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final A1.b f29084a;

        /* JADX INFO: renamed from: b */
        private final A1.b f29085b;

        public a(A1.b bVar, A1.b bVar2) {
            this.f29084a = bVar;
            this.f29085b = bVar2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public A1.b a() {
            return this.f29084a;
        }

        public A1.b b() {
            return this.f29085b;
        }

        public a c(A1.b bVar) {
            return new a(L0.p(this.f29084a, bVar.f104a, bVar.f105b, bVar.f106c, bVar.f107d), L0.p(this.f29085b, bVar.f104a, bVar.f105b, bVar.f106c, bVar.f107d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f29084a + " upper=" + this.f29085b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f29084a = d.h(bounds);
            this.f29085b = d.g(bounds);
        }
    }

    private C2777p0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f29083a = new d(windowInsetsAnimation);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.p0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        L0 mDispachedInsets;
        private final int mDispatchMode;

        public b(int i10) {
            this.mDispatchMode = i10;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public abstract L0 onProgress(L0 l02, List list);

        public void onEnd(C2777p0 c2777p0) {
        }

        public void onPrepare(C2777p0 c2777p0) {
        }

        public a onStart(C2777p0 c2777p0, a aVar) {
            return aVar;
        }
    }
}
