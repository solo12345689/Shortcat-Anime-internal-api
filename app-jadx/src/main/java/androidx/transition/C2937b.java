package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC2946k;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2937b extends AbstractC2946k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String[] f32351p0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Property f32352q0 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Property f32353r0 = new C0538b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Property f32354s0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Property f32355t0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Property f32356u0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final C2944i f32357v0 = new C2944i();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f32358o0 = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0538b extends Property {
        C0538b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32359a;
        private final i mViewBounds;

        f(i iVar) {
            this.f32359a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g extends AnimatorListenerAdapter implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f32361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f32362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f32364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f32365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f32366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f32367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f32368h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f32369i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f32370j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f32371k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f32372l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f32373m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f32374n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f32361a = view;
            this.f32362b = rect;
            this.f32363c = z10;
            this.f32364d = rect2;
            this.f32365e = z11;
            this.f32366f = i10;
            this.f32367g = i11;
            this.f32368h = i12;
            this.f32369i = i13;
            this.f32370j = i14;
            this.f32371k = i15;
            this.f32372l = i16;
            this.f32373m = i17;
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
            Rect rect = (Rect) this.f32361a.getTag(AbstractC2943h.f32406b);
            this.f32361a.setTag(AbstractC2943h.f32406b, null);
            this.f32361a.setClipBounds(rect);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
            this.f32361a.setTag(AbstractC2943h.f32406b, this.f32361a.getClipBounds());
            this.f32361a.setClipBounds(this.f32365e ? null : this.f32364d);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
            this.f32374n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f32374n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f32363c) {
                    rect = this.f32362b;
                }
            } else if (!this.f32365e) {
                rect = this.f32364d;
            }
            this.f32361a.setClipBounds(rect);
            if (z10) {
                C.d(this.f32361a, this.f32366f, this.f32367g, this.f32368h, this.f32369i);
            } else {
                C.d(this.f32361a, this.f32370j, this.f32371k, this.f32372l, this.f32373m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f32368h - this.f32366f, this.f32372l - this.f32370j);
            int iMax2 = Math.max(this.f32369i - this.f32367g, this.f32373m - this.f32371k);
            int i10 = z10 ? this.f32370j : this.f32366f;
            int i11 = z10 ? this.f32371k : this.f32367g;
            C.d(this.f32361a, i10, i11, iMax + i10, iMax2 + i11);
            this.f32361a.setClipBounds(z10 ? this.f32364d : this.f32362b);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f32375a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f32376b;

        h(ViewGroup viewGroup) {
            this.f32376b = viewGroup;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
            B.b(this.f32376b, true);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
            B.b(this.f32376b, false);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            if (!this.f32375a) {
                B.b(this.f32376b, false);
            }
            abstractC2946k.f0(this);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
            B.b(this.f32376b, false);
            this.f32375a = true;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f32380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f32381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f32382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32383g;

        i(View view) {
            this.f32381e = view;
        }

        private void b() {
            C.d(this.f32381e, this.f32377a, this.f32378b, this.f32379c, this.f32380d);
            this.f32382f = 0;
            this.f32383g = 0;
        }

        void a(PointF pointF) {
            this.f32379c = Math.round(pointF.x);
            this.f32380d = Math.round(pointF.y);
            int i10 = this.f32383g + 1;
            this.f32383g = i10;
            if (this.f32382f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f32377a = Math.round(pointF.x);
            this.f32378b = Math.round(pointF.y);
            int i10 = this.f32382f + 1;
            this.f32382f = i10;
            if (i10 == this.f32383g) {
                b();
            }
        }
    }

    private void t0(y yVar) {
        View view = yVar.f32494b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        yVar.f32493a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        yVar.f32493a.put("android:changeBounds:parent", yVar.f32494b.getParent());
        if (this.f32358o0) {
            yVar.f32493a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC2946k
    public String[] O() {
        return f32351p0;
    }

    @Override // androidx.transition.AbstractC2946k
    public boolean R() {
        return true;
    }

    @Override // androidx.transition.AbstractC2946k
    public void i(y yVar) {
        t0(yVar);
    }

    @Override // androidx.transition.AbstractC2946k
    public void m(y yVar) {
        Rect rect;
        t0(yVar);
        if (!this.f32358o0 || (rect = (Rect) yVar.f32494b.getTag(AbstractC2943h.f32406b)) == null) {
            return;
        }
        yVar.f32493a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC2946k
    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Map map = yVar.f32493a;
        Map map2 = yVar2.f32493a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = yVar2.f32494b;
        Rect rect2 = (Rect) yVar.f32493a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) yVar2.f32493a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) yVar.f32493a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) yVar2.f32493a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.f32358o0) {
            C.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = AbstractC2941f.a(view, f32356u0, E().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f32357v0, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                d(gVar);
            }
            animatorC = x.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            C.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? AbstractC2941f.a(view, f32354s0, E().a(i19, i21, i20, i22)) : AbstractC2941f.a(view, f32355t0, E().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = AbstractC2941f.a(view, f32356u0, E().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC2941f.a(iVar, f32352q0, E().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = AbstractC2941f.a(iVar, f32353r0, E().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            B.b(viewGroup4, true);
            G().d(new h(viewGroup4));
        }
        return animatorC;
    }
}
