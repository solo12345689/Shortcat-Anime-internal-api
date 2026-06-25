package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class w {

    /* JADX INFO: renamed from: A */
    private boolean f31557A;

    /* JADX INFO: renamed from: B */
    private boolean f31558B;

    /* JADX INFO: renamed from: a */
    private final C2926d f31560a;

    /* JADX INFO: renamed from: b */
    private final View f31561b;

    /* JADX INFO: renamed from: c */
    private final ViewGroup f31562c;

    /* JADX INFO: renamed from: d */
    private final ViewGroup f31563d;

    /* JADX INFO: renamed from: e */
    private final ViewGroup f31564e;

    /* JADX INFO: renamed from: f */
    private final ViewGroup f31565f;

    /* JADX INFO: renamed from: g */
    private final ViewGroup f31566g;

    /* JADX INFO: renamed from: h */
    private final ViewGroup f31567h;

    /* JADX INFO: renamed from: i */
    private final ViewGroup f31568i;

    /* JADX INFO: renamed from: j */
    private final View f31569j;

    /* JADX INFO: renamed from: k */
    private final View f31570k;

    /* JADX INFO: renamed from: l */
    private final AnimatorSet f31571l;

    /* JADX INFO: renamed from: m */
    private final AnimatorSet f31572m;

    /* JADX INFO: renamed from: n */
    private final AnimatorSet f31573n;

    /* JADX INFO: renamed from: o */
    private final AnimatorSet f31574o;

    /* JADX INFO: renamed from: p */
    private final AnimatorSet f31575p;

    /* JADX INFO: renamed from: q */
    private final ValueAnimator f31576q;

    /* JADX INFO: renamed from: r */
    private final ValueAnimator f31577r;

    /* JADX INFO: renamed from: s */
    private final Runnable f31578s = new Runnable() { // from class: androidx.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f31544a.Y();
        }
    };

    /* JADX INFO: renamed from: t */
    private final Runnable f31579t = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f31550a.D();
        }
    };

    /* JADX INFO: renamed from: u */
    private final Runnable f31580u = new Runnable() { // from class: androidx.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f31551a.H();
        }
    };

    /* JADX INFO: renamed from: v */
    private final Runnable f31581v = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f31552a.G();
        }
    };

    /* JADX INFO: renamed from: w */
    private final Runnable f31582w = new Runnable() { // from class: androidx.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f31553a.E();
        }
    };

    /* JADX INFO: renamed from: x */
    private final View.OnLayoutChangeListener f31583x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f31554a.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* JADX INFO: renamed from: C */
    private boolean f31559C = true;

    /* JADX INFO: renamed from: z */
    private int f31585z = 0;

    /* JADX INFO: renamed from: y */
    private final List f31584y = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f31561b != null) {
                w.this.f31561b.setVisibility(4);
            }
            if (w.this.f31562c != null) {
                w.this.f31562c.setVisibility(4);
            }
            if (w.this.f31564e != null) {
                w.this.f31564e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.f31569j instanceof C2924b) || w.this.f31557A) {
                return;
            }
            ((C2924b) w.this.f31569j).h(250L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f31561b != null) {
                w.this.f31561b.setVisibility(0);
            }
            if (w.this.f31562c != null) {
                w.this.f31562c.setVisibility(0);
            }
            if (w.this.f31564e != null) {
                w.this.f31564e.setVisibility(w.this.f31557A ? 0 : 4);
            }
            if (!(w.this.f31569j instanceof C2924b) || w.this.f31557A) {
                return;
            }
            ((C2924b) w.this.f31569j).s(250L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2926d f31588a;

        c(C2926d c2926d) {
            this.f31588a = c2926d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(1);
            if (w.this.f31558B) {
                this.f31588a.post(w.this.f31578s);
                w.this.f31558B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2926d f31590a;

        d(C2926d c2926d) {
            this.f31590a = c2926d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.f31558B) {
                this.f31590a.post(w.this.f31578s);
                w.this.f31558B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2926d f31592a;

        e(C2926d c2926d) {
            this.f31592a = c2926d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.f31558B) {
                this.f31592a.post(w.this.f31578s);
                w.this.f31558B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f31565f != null) {
                w.this.f31565f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f31567h != null) {
                w.this.f31567h.setVisibility(0);
                w.this.f31567h.setTranslationX(w.this.f31567h.getWidth());
                w.this.f31567h.scrollTo(w.this.f31567h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f31567h != null) {
                w.this.f31567h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f31565f != null) {
                w.this.f31565f.setVisibility(0);
            }
        }
    }

    public w(C2926d c2926d) {
        this.f31560a = c2926d;
        this.f31561b = c2926d.findViewById(G3.x.f7205l);
        this.f31562c = (ViewGroup) c2926d.findViewById(G3.x.f7200g);
        this.f31564e = (ViewGroup) c2926d.findViewById(G3.x.f7216w);
        ViewGroup viewGroup = (ViewGroup) c2926d.findViewById(G3.x.f7198e);
        this.f31563d = viewGroup;
        this.f31568i = (ViewGroup) c2926d.findViewById(G3.x.f7192S);
        View viewFindViewById = c2926d.findViewById(G3.x.f7180G);
        this.f31569j = viewFindViewById;
        this.f31565f = (ViewGroup) c2926d.findViewById(G3.x.f7197d);
        this.f31566g = (ViewGroup) c2926d.findViewById(G3.x.f7208o);
        this.f31567h = (ViewGroup) c2926d.findViewById(G3.x.f7209p);
        View viewFindViewById2 = c2926d.findViewById(G3.x.f7174A);
        this.f31570k = viewFindViewById2;
        View viewFindViewById3 = c2926d.findViewById(G3.x.f7219z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31555a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31555a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.d(this.f31556a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.f(this.f31545a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = c2926d.getResources();
        float dimension = resources.getDimension(G3.u.f7149b) - resources.getDimension(G3.u.f7150c);
        float dimension2 = resources.getDimension(G3.u.f7149b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31571l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(c2926d));
        animatorSet.play(valueAnimatorOfFloat).with(J(0.0f, dimension, viewFindViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31572m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(c2926d));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f31573n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(c2926d));
        animatorSet3.play(valueAnimatorOfFloat).with(J(0.0f, dimension2, viewFindViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f31574o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, 0.0f, viewFindViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f31575p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, 0.0f, viewFindViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f31576q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.a(this.f31548a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f31577r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.l(this.f31549a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public void D() {
        this.f31573n.start();
    }

    public void E() {
        V(2);
    }

    public void G() {
        this.f31571l.start();
        Q(this.f31580u, 2000L);
    }

    public void H() {
        this.f31572m.start();
    }

    private static ObjectAnimator J(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zA0 = a0();
        if (this.f31557A != zA0) {
            this.f31557A = zA0;
            view.post(new Runnable() { // from class: androidx.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31546a.Z();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.f31557A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f31547a.O();
            }
        });
    }

    public void O() {
        int i10;
        if (this.f31565f == null || this.f31566g == null) {
            return;
        }
        int width = (this.f31560a.getWidth() - this.f31560a.getPaddingLeft()) - this.f31560a.getPaddingRight();
        while (true) {
            if (this.f31566g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f31566g.getChildCount() - 2;
            View childAt = this.f31566g.getChildAt(childCount);
            this.f31566g.removeViewAt(childCount);
            this.f31565f.addView(childAt, 0);
        }
        View view = this.f31570k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f31568i);
        int childCount2 = this.f31565f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f31565f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f31567h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f31577r.isStarted()) {
                return;
            }
            this.f31576q.cancel();
            this.f31577r.start();
            return;
        }
        View view2 = this.f31570k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f31570k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f31565f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f31565f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f31566g.addView((View) arrayList.get(i10), this.f31566g.getChildCount() - 1);
        }
    }

    public void P(View view) {
        S();
        if (view.getId() == G3.x.f7174A) {
            this.f31576q.start();
        } else if (view.getId() == G3.x.f7219z) {
            this.f31577r.start();
        }
    }

    private void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f31560a.postDelayed(runnable, j10);
        }
    }

    public void V(int i10) {
        int i11 = this.f31585z;
        this.f31585z = i10;
        if (i10 == 2) {
            this.f31560a.setVisibility(8);
        } else if (i11 == 2) {
            this.f31560a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f31560a.o0();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        return id2 == G3.x.f7198e || id2 == G3.x.f7179F || id2 == G3.x.f7218y || id2 == G3.x.f7183J || id2 == G3.x.f7184K || id2 == G3.x.f7210q || id2 == G3.x.f7211r;
    }

    public void Y() {
        if (!this.f31559C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f31585z;
        if (i10 == 1) {
            this.f31574o.start();
        } else if (i10 == 2) {
            this.f31575p.start();
        } else if (i10 == 3) {
            this.f31558B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    public void Z() {
        ViewGroup viewGroup = this.f31564e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f31557A ? 0 : 4);
        }
        if (this.f31569j != null) {
            int dimensionPixelSize = this.f31560a.getResources().getDimensionPixelSize(G3.u.f7151d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31569j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f31557A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f31569j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f31569j;
            if (view instanceof C2924b) {
                C2924b c2924b = (C2924b) view;
                if (this.f31557A) {
                    c2924b.i(true);
                } else {
                    int i10 = this.f31585z;
                    if (i10 == 1) {
                        c2924b.i(false);
                    } else if (i10 != 3) {
                        c2924b.r();
                    }
                }
            }
        }
        for (View view2 : this.f31584y) {
            view2.setVisibility((this.f31557A && W(view2)) ? 4 : 0);
        }
    }

    public static /* synthetic */ void a(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private boolean a0() {
        int width = (this.f31560a.getWidth() - this.f31560a.getPaddingLeft()) - this.f31560a.getPaddingRight();
        int height = (this.f31560a.getHeight() - this.f31560a.getPaddingBottom()) - this.f31560a.getPaddingTop();
        int iB = B(this.f31562c);
        ViewGroup viewGroup = this.f31562c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f31562c.getPaddingRight() : 0);
        int iZ = z(this.f31562c);
        ViewGroup viewGroup2 = this.f31562c;
        return width <= Math.max(paddingLeft, B(this.f31568i) + B(this.f31570k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f31562c.getPaddingBottom() : 0)) + (z(this.f31563d) * 2);
    }

    public static /* synthetic */ void d(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f31561b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f31562c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f31564e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void f(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f31561b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f31562c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f31564e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void l(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f10) {
        if (this.f31567h != null) {
            this.f31567h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f31568i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f31565f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f31584y.contains(view);
    }

    public void C() {
        int i10 = this.f31585z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.f31559C) {
            E();
        } else if (this.f31585z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f31585z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f31585z == 0 && this.f31560a.n0();
    }

    public void K() {
        this.f31560a.addOnLayoutChangeListener(this.f31583x);
    }

    public void L() {
        this.f31560a.removeOnLayoutChangeListener(this.f31583x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f31561b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void R() {
        this.f31560a.removeCallbacks(this.f31582w);
        this.f31560a.removeCallbacks(this.f31579t);
        this.f31560a.removeCallbacks(this.f31581v);
        this.f31560a.removeCallbacks(this.f31580u);
    }

    public void S() {
        if (this.f31585z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f31560a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f31559C) {
                Q(this.f31582w, showTimeoutMs);
            } else if (this.f31585z == 1) {
                Q(this.f31580u, 2000L);
            } else {
                Q(this.f31581v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.f31559C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f31584y.remove(view);
            return;
        }
        if (this.f31557A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f31584y.add(view);
    }

    public void X() throws IllegalAccessException, InvocationTargetException {
        if (!this.f31560a.n0()) {
            this.f31560a.setVisibility(0);
            this.f31560a.w0();
            this.f31560a.t0();
        }
        Y();
    }
}
