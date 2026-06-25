package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.AbstractC2747a0;
import androidx.transition.AbstractC2946k;
import b2.AbstractC2976h;
import b2.C2979k;
import b2.C2981m;
import b2.C2982n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C6551a;
import t.C6573x;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2946k implements Cloneable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Animator[] f32410Z = new Animator[0];

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f32411l0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final AbstractC2942g f32412m0 = new a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static ThreadLocal f32413n0 = new ThreadLocal();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private f f32419F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C6551a f32420G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    long f32422I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    h f32423X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    long f32424Y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f32444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f32445u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i[] f32446v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32425a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32426b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f32427c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f32428d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f32429e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f32430f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f32431g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f32432h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f32433i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f32434j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f32435k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList f32436l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f32437m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f32438n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f32439o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z f32440p = new z();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z f32441q = new z();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    w f32442r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f32443s = f32411l0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f32447w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList f32448x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Animator[] f32449y = f32410Z;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f32450z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f32414A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f32415B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private AbstractC2946k f32416C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ArrayList f32417D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ArrayList f32418E = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private AbstractC2942g f32421H = f32412m0;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2942g {
        a() {
        }

        @Override // androidx.transition.AbstractC2942g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6551a f32451a;

        b(C6551a c6551a) {
            this.f32451a = c6551a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32451a.remove(animator);
            AbstractC2946k.this.f32448x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC2946k.this.f32448x.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2946k.this.u();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f32454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f32455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        y f32456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f32457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AbstractC2946k f32458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f32459f;

        d(View view, String str, AbstractC2946k abstractC2946k, WindowId windowId, y yVar, Animator animator) {
            this.f32454a = view;
            this.f32455b = str;
            this.f32456c = yVar;
            this.f32457d = windowId;
            this.f32458e = abstractC2946k;
            this.f32459f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {
        static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends s implements v, AbstractC2976h.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f32464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C2981m f32465f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Runnable f32468i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32460a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f32461b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f32462c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private K1.a[] f32466g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final A f32467h = new A();

        h() {
        }

        public static /* synthetic */ void m(h hVar, AbstractC2976h abstractC2976h, boolean z10, float f10, float f11) {
            if (z10) {
                hVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                AbstractC2946k.this.b0(j.f32471b, false);
                return;
            }
            long jC = hVar.c();
            AbstractC2946k abstractC2946kX0 = ((w) AbstractC2946k.this).x0(0);
            AbstractC2946k abstractC2946k = abstractC2946kX0.f32416C;
            abstractC2946kX0.f32416C = null;
            AbstractC2946k.this.k0(-1L, hVar.f32460a);
            AbstractC2946k.this.k0(jC, -1L);
            hVar.f32460a = jC;
            Runnable runnable = hVar.f32468i;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC2946k.this.f32418E.clear();
            if (abstractC2946k != null) {
                abstractC2946k.b0(j.f32471b, true);
            }
        }

        private void n() {
            ArrayList arrayList = this.f32462c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f32462c.size();
            if (this.f32466g == null) {
                this.f32466g = new K1.a[size];
            }
            K1.a[] aVarArr = (K1.a[]) this.f32462c.toArray(this.f32466g);
            this.f32466g = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f32466g = aVarArr;
        }

        private void o() {
            if (this.f32465f != null) {
                return;
            }
            this.f32467h.a(AnimationUtils.currentAnimationTimeMillis(), this.f32460a);
            this.f32465f = new C2981m(new C2979k());
            C2982n c2982n = new C2982n();
            c2982n.f(1.0f);
            c2982n.h(200.0f);
            this.f32465f.z(c2982n);
            this.f32465f.o(this.f32460a);
            this.f32465f.c(this);
            this.f32465f.p(this.f32467h.b());
            this.f32465f.k(c() + 1);
            this.f32465f.l(-1.0f);
            this.f32465f.m(4.0f);
            this.f32465f.b(new AbstractC2976h.q() { // from class: androidx.transition.m
                @Override // b2.AbstractC2976h.q
                public final void a(AbstractC2976h abstractC2976h, boolean z10, float f10, float f11) {
                    AbstractC2946k.h.m(this.f32475a, abstractC2976h, z10, f10, f11);
                }
            });
        }

        @Override // b2.AbstractC2976h.r
        public void a(AbstractC2976h abstractC2976h, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(c() + 1, Math.round(f10)));
            AbstractC2946k.this.k0(jMax, this.f32460a);
            this.f32460a = jMax;
            n();
        }

        @Override // androidx.transition.v
        public long c() {
            return AbstractC2946k.this.N();
        }

        @Override // androidx.transition.v
        public void d() {
            o();
            this.f32465f.u(c() + 1);
        }

        @Override // androidx.transition.v
        public void g(long j10) {
            if (this.f32465f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f32460a || !isReady()) {
                return;
            }
            if (!this.f32464e) {
                if (j10 != 0 || this.f32460a <= 0) {
                    long jC = c();
                    if (j10 == jC && this.f32460a < jC) {
                        j10 = 1 + jC;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f32460a;
                if (j10 != j11) {
                    AbstractC2946k.this.k0(j10, j11);
                    this.f32460a = j10;
                }
            }
            n();
            this.f32467h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // androidx.transition.v
        public boolean isReady() {
            return this.f32463d;
        }

        @Override // androidx.transition.v
        public void j(Runnable runnable) {
            this.f32468i = runnable;
            o();
            this.f32465f.u(0.0f);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
            this.f32464e = true;
        }

        void p() {
            long j10 = c() == 0 ? 1L : 0L;
            AbstractC2946k.this.k0(j10, this.f32460a);
            this.f32460a = j10;
        }

        public void q() {
            this.f32463d = true;
            ArrayList arrayList = this.f32461b;
            if (arrayList != null) {
                this.f32461b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((K1.a) arrayList.get(i10)).accept(this);
                }
            }
            n();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface i {
        void b(AbstractC2946k abstractC2946k);

        void e(AbstractC2946k abstractC2946k);

        void f(AbstractC2946k abstractC2946k);

        default void h(AbstractC2946k abstractC2946k, boolean z10) {
            i(abstractC2946k);
        }

        void i(AbstractC2946k abstractC2946k);

        void k(AbstractC2946k abstractC2946k);

        default void l(AbstractC2946k abstractC2946k, boolean z10) {
            e(abstractC2946k);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f32470a = new j() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC2946k.j
            public final void b(AbstractC2946k.i iVar, AbstractC2946k abstractC2946k, boolean z10) {
                iVar.l(abstractC2946k, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f32471b = new j() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC2946k.j
            public final void b(AbstractC2946k.i iVar, AbstractC2946k abstractC2946k, boolean z10) {
                iVar.h(abstractC2946k, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f32472c = new j() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC2946k.j
            public final void b(AbstractC2946k.i iVar, AbstractC2946k abstractC2946k, boolean z10) {
                iVar.k(abstractC2946k);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f32473d = new j() { // from class: androidx.transition.q
            @Override // androidx.transition.AbstractC2946k.j
            public final void b(AbstractC2946k.i iVar, AbstractC2946k abstractC2946k, boolean z10) {
                iVar.f(abstractC2946k);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f32474e = new j() { // from class: androidx.transition.r
            @Override // androidx.transition.AbstractC2946k.j
            public final void b(AbstractC2946k.i iVar, AbstractC2946k abstractC2946k, boolean z10) {
                iVar.b(abstractC2946k);
            }
        };

        void b(i iVar, AbstractC2946k abstractC2946k, boolean z10);
    }

    private static C6551a H() {
        C6551a c6551a = (C6551a) f32413n0.get();
        if (c6551a != null) {
            return c6551a;
        }
        C6551a c6551a2 = new C6551a();
        f32413n0.set(c6551a2);
        return c6551a2;
    }

    private static boolean U(y yVar, y yVar2, String str) {
        Object obj = yVar.f32493a.get(str);
        Object obj2 = yVar2.f32493a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void V(C6551a c6551a, C6551a c6551a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && T(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && T(view)) {
                y yVar = (y) c6551a.get(view2);
                y yVar2 = (y) c6551a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f32444t.add(yVar);
                    this.f32445u.add(yVar2);
                    c6551a.remove(view2);
                    c6551a2.remove(view);
                }
            }
        }
    }

    private void W(C6551a c6551a, C6551a c6551a2) {
        y yVar;
        for (int size = c6551a.size() - 1; size >= 0; size--) {
            View view = (View) c6551a.g(size);
            if (view != null && T(view) && (yVar = (y) c6551a2.remove(view)) != null && T(yVar.f32494b)) {
                this.f32444t.add((y) c6551a.i(size));
                this.f32445u.add(yVar);
            }
        }
    }

    private void X(C6551a c6551a, C6551a c6551a2, C6573x c6573x, C6573x c6573x2) {
        View view;
        int iM = c6573x.m();
        for (int i10 = 0; i10 < iM; i10++) {
            View view2 = (View) c6573x.n(i10);
            if (view2 != null && T(view2) && (view = (View) c6573x2.e(c6573x.h(i10))) != null && T(view)) {
                y yVar = (y) c6551a.get(view2);
                y yVar2 = (y) c6551a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f32444t.add(yVar);
                    this.f32445u.add(yVar2);
                    c6551a.remove(view2);
                    c6551a2.remove(view);
                }
            }
        }
    }

    private void Y(C6551a c6551a, C6551a c6551a2, C6551a c6551a3, C6551a c6551a4) {
        View view;
        int size = c6551a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c6551a3.k(i10);
            if (view2 != null && T(view2) && (view = (View) c6551a4.get(c6551a3.g(i10))) != null && T(view)) {
                y yVar = (y) c6551a.get(view2);
                y yVar2 = (y) c6551a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f32444t.add(yVar);
                    this.f32445u.add(yVar2);
                    c6551a.remove(view2);
                    c6551a2.remove(view);
                }
            }
        }
    }

    private void Z(z zVar, z zVar2) {
        C6551a c6551a = new C6551a(zVar.f32496a);
        C6551a c6551a2 = new C6551a(zVar2.f32496a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f32443s;
            if (i10 >= iArr.length) {
                f(c6551a, c6551a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                W(c6551a, c6551a2);
            } else if (i11 == 2) {
                Y(c6551a, c6551a2, zVar.f32499d, zVar2.f32499d);
            } else if (i11 == 3) {
                V(c6551a, c6551a2, zVar.f32497b, zVar2.f32497b);
            } else if (i11 == 4) {
                X(c6551a, c6551a2, zVar.f32498c, zVar2.f32498c);
            }
            i10++;
        }
    }

    private void a0(AbstractC2946k abstractC2946k, j jVar, boolean z10) {
        AbstractC2946k abstractC2946k2 = this.f32416C;
        if (abstractC2946k2 != null) {
            abstractC2946k2.a0(abstractC2946k, jVar, z10);
        }
        ArrayList arrayList = this.f32417D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f32417D.size();
        i[] iVarArr = this.f32446v;
        if (iVarArr == null) {
            iVarArr = new i[size];
        }
        this.f32446v = null;
        i[] iVarArr2 = (i[]) this.f32417D.toArray(iVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            jVar.b(iVarArr2[i10], abstractC2946k, z10);
            iVarArr2[i10] = null;
        }
        this.f32446v = iVarArr2;
    }

    private void f(C6551a c6551a, C6551a c6551a2) {
        for (int i10 = 0; i10 < c6551a.size(); i10++) {
            y yVar = (y) c6551a.k(i10);
            if (T(yVar.f32494b)) {
                this.f32444t.add(yVar);
                this.f32445u.add(null);
            }
        }
        for (int i11 = 0; i11 < c6551a2.size(); i11++) {
            y yVar2 = (y) c6551a2.k(i11);
            if (T(yVar2.f32494b)) {
                this.f32445u.add(yVar2);
                this.f32444t.add(null);
            }
        }
    }

    private static void g(z zVar, View view, y yVar) {
        zVar.f32496a.put(view, yVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (zVar.f32497b.indexOfKey(id2) >= 0) {
                zVar.f32497b.put(id2, null);
            } else {
                zVar.f32497b.put(id2, view);
            }
        }
        String strH = AbstractC2747a0.H(view);
        if (strH != null) {
            if (zVar.f32499d.containsKey(strH)) {
                zVar.f32499d.put(strH, null);
            } else {
                zVar.f32499d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f32498c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zVar.f32498c.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) zVar.f32498c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zVar.f32498c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void i0(Animator animator, C6551a c6551a) {
        if (animator != null) {
            animator.addListener(new b(c6551a));
            h(animator);
        }
    }

    private void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f32433i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f32434j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f32435k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f32435k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    y yVar = new y(view);
                    if (z10) {
                        m(yVar);
                    } else {
                        i(yVar);
                    }
                    yVar.f32495c.add(this);
                    k(yVar);
                    if (z10) {
                        g(this.f32440p, view, yVar);
                    } else {
                        g(this.f32441q, view, yVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f32437m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f32438n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f32439o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f32439o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                j(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList x(ArrayList arrayList, Class cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public f A() {
        return this.f32419F;
    }

    public TimeInterpolator B() {
        return this.f32428d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f32445u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f32444t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (androidx.transition.y) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.transition.y C(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.w r0 = r5.f32442r
            if (r0 == 0) goto L9
            androidx.transition.y r6 = r0.C(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f32444t
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f32445u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.y r4 = (androidx.transition.y) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f32494b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f32445u
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f32444t
        L36:
            java.lang.Object r6 = r6.get(r3)
            androidx.transition.y r6 = (androidx.transition.y) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC2946k.C(android.view.View, boolean):androidx.transition.y");
    }

    public String D() {
        return this.f32425a;
    }

    public AbstractC2942g E() {
        return this.f32421H;
    }

    public u F() {
        return null;
    }

    public final AbstractC2946k G() {
        w wVar = this.f32442r;
        return wVar != null ? wVar.G() : this;
    }

    public long I() {
        return this.f32426b;
    }

    public List J() {
        return this.f32429e;
    }

    public List K() {
        return this.f32431g;
    }

    public List L() {
        return this.f32432h;
    }

    public List M() {
        return this.f32430f;
    }

    final long N() {
        return this.f32422I;
    }

    public String[] O() {
        return null;
    }

    public y P(View view, boolean z10) {
        w wVar = this.f32442r;
        if (wVar != null) {
            return wVar.P(view, z10);
        }
        return (y) (z10 ? this.f32440p : this.f32441q).f32496a.get(view);
    }

    boolean Q() {
        return !this.f32448x.isEmpty();
    }

    public boolean R() {
        return false;
    }

    public boolean S(y yVar, y yVar2) {
        if (yVar != null && yVar2 != null) {
            String[] strArrO = O();
            if (strArrO != null) {
                for (String str : strArrO) {
                    if (U(yVar, yVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = yVar.f32493a.keySet().iterator();
                while (it.hasNext()) {
                    if (U(yVar, yVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean T(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f32433i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f32434j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f32435k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f32435k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f32436l != null && AbstractC2747a0.H(view) != null && this.f32436l.contains(AbstractC2747a0.H(view))) {
            return false;
        }
        if ((this.f32429e.size() == 0 && this.f32430f.size() == 0 && (((arrayList = this.f32432h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f32431g) == null || arrayList2.isEmpty()))) || this.f32429e.contains(Integer.valueOf(id2)) || this.f32430f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f32431g;
        if (arrayList6 != null && arrayList6.contains(AbstractC2747a0.H(view))) {
            return true;
        }
        if (this.f32432h != null) {
            for (int i11 = 0; i11 < this.f32432h.size(); i11++) {
                if (((Class) this.f32432h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void b0(j jVar, boolean z10) {
        a0(this, jVar, z10);
    }

    public void c0(View view) {
        if (this.f32415B) {
            return;
        }
        int size = this.f32448x.size();
        Animator[] animatorArr = (Animator[]) this.f32448x.toArray(this.f32449y);
        this.f32449y = f32410Z;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f32449y = animatorArr;
        b0(j.f32473d, false);
        this.f32414A = true;
    }

    protected void cancel() {
        int size = this.f32448x.size();
        Animator[] animatorArr = (Animator[]) this.f32448x.toArray(this.f32449y);
        this.f32449y = f32410Z;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f32449y = animatorArr;
        b0(j.f32472c, false);
    }

    public AbstractC2946k d(i iVar) {
        if (this.f32417D == null) {
            this.f32417D = new ArrayList();
        }
        this.f32417D.add(iVar);
        return this;
    }

    void d0(ViewGroup viewGroup) {
        d dVar;
        this.f32444t = new ArrayList();
        this.f32445u = new ArrayList();
        Z(this.f32440p, this.f32441q);
        C6551a c6551aH = H();
        int size = c6551aH.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c6551aH.g(i10);
            if (animator != null && (dVar = (d) c6551aH.get(animator)) != null && dVar.f32454a != null && windowId.equals(dVar.f32457d)) {
                y yVar = dVar.f32456c;
                View view = dVar.f32454a;
                y yVarP = P(view, true);
                y yVarC = C(view, true);
                if (yVarP == null && yVarC == null) {
                    yVarC = (y) this.f32441q.f32496a.get(view);
                }
                if ((yVarP != null || yVarC != null) && dVar.f32458e.S(yVar, yVarC)) {
                    AbstractC2946k abstractC2946k = dVar.f32458e;
                    if (abstractC2946k.G().f32423X != null) {
                        animator.cancel();
                        abstractC2946k.f32448x.remove(animator);
                        c6551aH.remove(animator);
                        if (abstractC2946k.f32448x.size() == 0) {
                            abstractC2946k.b0(j.f32472c, false);
                            if (!abstractC2946k.f32415B) {
                                abstractC2946k.f32415B = true;
                                abstractC2946k.b0(j.f32471b, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c6551aH.remove(animator);
                    }
                }
            }
        }
        s(viewGroup, this.f32440p, this.f32441q, this.f32444t, this.f32445u);
        if (this.f32423X == null) {
            j0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            e0();
            this.f32423X.p();
            this.f32423X.q();
        }
    }

    public AbstractC2946k e(View view) {
        this.f32430f.add(view);
        return this;
    }

    void e0() {
        C6551a c6551aH = H();
        this.f32422I = 0L;
        for (int i10 = 0; i10 < this.f32418E.size(); i10++) {
            Animator animator = (Animator) this.f32418E.get(i10);
            d dVar = (d) c6551aH.get(animator);
            if (animator != null && dVar != null) {
                if (y() >= 0) {
                    dVar.f32459f.setDuration(y());
                }
                if (I() >= 0) {
                    dVar.f32459f.setStartDelay(I() + dVar.f32459f.getStartDelay());
                }
                if (B() != null) {
                    dVar.f32459f.setInterpolator(B());
                }
                this.f32448x.add(animator);
                this.f32422I = Math.max(this.f32422I, g.a(animator));
            }
        }
        this.f32418E.clear();
    }

    public AbstractC2946k f0(i iVar) {
        AbstractC2946k abstractC2946k;
        ArrayList arrayList = this.f32417D;
        if (arrayList != null) {
            if (!arrayList.remove(iVar) && (abstractC2946k = this.f32416C) != null) {
                abstractC2946k.f0(iVar);
            }
            if (this.f32417D.size() == 0) {
                this.f32417D = null;
            }
        }
        return this;
    }

    public AbstractC2946k g0(View view) {
        this.f32430f.remove(view);
        return this;
    }

    protected void h(Animator animator) {
        if (animator == null) {
            u();
            return;
        }
        if (y() >= 0) {
            animator.setDuration(y());
        }
        if (I() >= 0) {
            animator.setStartDelay(I() + animator.getStartDelay());
        }
        if (B() != null) {
            animator.setInterpolator(B());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void h0(View view) {
        if (this.f32414A) {
            if (!this.f32415B) {
                int size = this.f32448x.size();
                Animator[] animatorArr = (Animator[]) this.f32448x.toArray(this.f32449y);
                this.f32449y = f32410Z;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f32449y = animatorArr;
                b0(j.f32474e, false);
            }
            this.f32414A = false;
        }
    }

    public abstract void i(y yVar);

    protected void j0() {
        r0();
        C6551a c6551aH = H();
        for (Animator animator : this.f32418E) {
            if (c6551aH.containsKey(animator)) {
                r0();
                i0(animator, c6551aH);
            }
        }
        this.f32418E.clear();
        u();
    }

    void k0(long j10, long j11) {
        long jN = N();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jN && j10 <= jN)) {
            this.f32415B = false;
            b0(j.f32470a, z10);
        }
        int size = this.f32448x.size();
        Animator[] animatorArr = (Animator[]) this.f32448x.toArray(this.f32449y);
        this.f32449y = f32410Z;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            g.b(animator, Math.min(Math.max(0L, j10), g.a(animator)));
            i10++;
            jN = jN;
        }
        long j12 = jN;
        this.f32449y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f32415B = true;
        }
        b0(j.f32471b, z10);
    }

    public AbstractC2946k l0(long j10) {
        this.f32427c = j10;
        return this;
    }

    public abstract void m(y yVar);

    public void m0(f fVar) {
        this.f32419F = fVar;
    }

    void n(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C6551a c6551a;
        p(z10);
        if ((this.f32429e.size() > 0 || this.f32430f.size() > 0) && (((arrayList = this.f32431g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f32432h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f32429e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f32429e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    y yVar = new y(viewFindViewById);
                    if (z10) {
                        m(yVar);
                    } else {
                        i(yVar);
                    }
                    yVar.f32495c.add(this);
                    k(yVar);
                    if (z10) {
                        g(this.f32440p, viewFindViewById, yVar);
                    } else {
                        g(this.f32441q, viewFindViewById, yVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f32430f.size(); i11++) {
                View view = (View) this.f32430f.get(i11);
                y yVar2 = new y(view);
                if (z10) {
                    m(yVar2);
                } else {
                    i(yVar2);
                }
                yVar2.f32495c.add(this);
                k(yVar2);
                if (z10) {
                    g(this.f32440p, view, yVar2);
                } else {
                    g(this.f32441q, view, yVar2);
                }
            }
        } else {
            j(viewGroup, z10);
        }
        if (z10 || (c6551a = this.f32420G) == null) {
            return;
        }
        int size = c6551a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f32440p.f32499d.remove((String) this.f32420G.g(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f32440p.f32499d.put((String) this.f32420G.k(i13), view2);
            }
        }
    }

    public AbstractC2946k n0(TimeInterpolator timeInterpolator) {
        this.f32428d = timeInterpolator;
        return this;
    }

    public void o0(AbstractC2942g abstractC2942g) {
        if (abstractC2942g == null) {
            this.f32421H = f32412m0;
        } else {
            this.f32421H = abstractC2942g;
        }
    }

    void p(boolean z10) {
        if (z10) {
            this.f32440p.f32496a.clear();
            this.f32440p.f32497b.clear();
            this.f32440p.f32498c.a();
        } else {
            this.f32441q.f32496a.clear();
            this.f32441q.f32497b.clear();
            this.f32441q.f32498c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: q */
    public AbstractC2946k clone() {
        try {
            AbstractC2946k abstractC2946k = (AbstractC2946k) super.clone();
            abstractC2946k.f32418E = new ArrayList();
            abstractC2946k.f32440p = new z();
            abstractC2946k.f32441q = new z();
            abstractC2946k.f32444t = null;
            abstractC2946k.f32445u = null;
            abstractC2946k.f32423X = null;
            abstractC2946k.f32416C = this;
            abstractC2946k.f32417D = null;
            return abstractC2946k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public AbstractC2946k q0(long j10) {
        this.f32426b = j10;
        return this;
    }

    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        return null;
    }

    protected void r0() {
        if (this.f32450z == 0) {
            b0(j.f32470a, false);
            this.f32415B = false;
        }
        this.f32450z++;
    }

    void s(ViewGroup viewGroup, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        y yVar;
        Object obj;
        Animator animator;
        AbstractC2946k abstractC2946k = this;
        C6551a c6551aH = H();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = abstractC2946k.G().f32423X != null;
        for (int i10 = 0; i10 < size; i10++) {
            y yVar2 = (y) arrayList.get(i10);
            y yVar3 = (y) arrayList2.get(i10);
            if (yVar2 != null && !yVar2.f32495c.contains(abstractC2946k)) {
                yVar2 = null;
            }
            if (yVar3 != null && !yVar3.f32495c.contains(abstractC2946k)) {
                yVar3 = null;
            }
            if ((yVar2 != null || yVar3 != null) && (yVar2 == null || yVar3 == null || abstractC2946k.S(yVar2, yVar3))) {
                Animator animatorR = abstractC2946k.r(viewGroup, yVar2, yVar3);
                if (animatorR != null) {
                    if (yVar3 != null) {
                        view = yVar3.f32494b;
                        String[] strArrO = abstractC2946k.O();
                        if (strArrO != null && strArrO.length > 0) {
                            yVar = new y(view);
                            y yVar4 = (y) zVar2.f32496a.get(view);
                            if (yVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrO.length) {
                                    Map map = yVar.f32493a;
                                    String[] strArr = strArrO;
                                    String str = strArr[i11];
                                    map.put(str, yVar4.f32493a.get(str));
                                    i11++;
                                    strArrO = strArr;
                                    animatorR = animatorR;
                                }
                            }
                            Animator animator2 = animatorR;
                            int size2 = c6551aH.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    animator = animator2;
                                    break;
                                }
                                d dVar = (d) c6551aH.get((Animator) c6551aH.g(i12));
                                if (dVar.f32456c != null && dVar.f32454a == view && dVar.f32455b.equals(D()) && dVar.f32456c.equals(yVar)) {
                                    animator = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            animator = animatorR;
                            yVar = null;
                        }
                        animatorR = animator;
                    } else {
                        view = yVar2.f32494b;
                        yVar = null;
                    }
                    View view2 = view;
                    if (animatorR != null) {
                        Animator animator3 = animatorR;
                        abstractC2946k = this;
                        d dVar2 = new d(view2, D(), abstractC2946k, viewGroup.getWindowId(), yVar, animator3);
                        if (z10) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator3);
                            obj = animatorSet;
                        } else {
                            obj = animator3;
                        }
                        c6551aH.put(obj, dVar2);
                        abstractC2946k.f32418E.add(obj);
                    } else {
                        abstractC2946k = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar3 = (d) c6551aH.get((Animator) abstractC2946k.f32418E.get(sparseIntArray.keyAt(i13)));
                dVar3.f32459f.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + dVar3.f32459f.getStartDelay());
            }
        }
    }

    String s0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f32427c != -1) {
            sb2.append("dur(");
            sb2.append(this.f32427c);
            sb2.append(") ");
        }
        if (this.f32426b != -1) {
            sb2.append("dly(");
            sb2.append(this.f32426b);
            sb2.append(") ");
        }
        if (this.f32428d != null) {
            sb2.append("interp(");
            sb2.append(this.f32428d);
            sb2.append(") ");
        }
        if (this.f32429e.size() > 0 || this.f32430f.size() > 0) {
            sb2.append("tgts(");
            if (this.f32429e.size() > 0) {
                for (int i10 = 0; i10 < this.f32429e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f32429e.get(i10));
                }
            }
            if (this.f32430f.size() > 0) {
                for (int i11 = 0; i11 < this.f32430f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f32430f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    v t() {
        h hVar = new h();
        this.f32423X = hVar;
        d(hVar);
        return this.f32423X;
    }

    public String toString() {
        return s0("");
    }

    protected void u() {
        int i10 = this.f32450z - 1;
        this.f32450z = i10;
        if (i10 == 0) {
            b0(j.f32471b, false);
            for (int i11 = 0; i11 < this.f32440p.f32498c.m(); i11++) {
                View view = (View) this.f32440p.f32498c.n(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f32441q.f32498c.m(); i12++) {
                View view2 = (View) this.f32441q.f32498c.n(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f32415B = true;
        }
    }

    public AbstractC2946k v(Class cls, boolean z10) {
        this.f32435k = x(this.f32435k, cls, z10);
        return this;
    }

    public long y() {
        return this.f32427c;
    }

    void k(y yVar) {
    }

    public void p0(u uVar) {
    }
}
