package com.facebook.react.views.scroll;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.F;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f38121c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f38125g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f38119a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38120b = com.facebook.react.views.scroll.k.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CopyOnWriteArrayList f38122d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CopyOnWriteArrayList f38123e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f38124f = 250;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void d(int i10, int i11);

        ValueAnimator getFlingAnimator();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        h getReactScrollViewScrollState();

        void setReactScrollViewScrollState(h hVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(int i10, int i11);

        void b(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        InterfaceC3282a0 getStateWrapper();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        void k(ViewGroup viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g extends OverScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38126a;

        public g(Context context) {
            super(context);
            this.f38126a = 250;
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f38126a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            this.f38126a = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Point f38127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Point f38129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f38131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f38132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f38133g;

        public h() {
            this(null, 0, null, false, false, 0.0f, false, 127, null);
        }

        public static /* synthetic */ h b(h hVar, Point point, int i10, Point point2, boolean z10, boolean z11, float f10, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                point = hVar.f38127a;
            }
            if ((i11 & 2) != 0) {
                i10 = hVar.f38128b;
            }
            if ((i11 & 4) != 0) {
                point2 = hVar.f38129c;
            }
            if ((i11 & 8) != 0) {
                z10 = hVar.f38130d;
            }
            if ((i11 & 16) != 0) {
                z11 = hVar.f38131e;
            }
            if ((i11 & 32) != 0) {
                f10 = hVar.f38132f;
            }
            if ((i11 & 64) != 0) {
                z12 = hVar.f38133g;
            }
            float f11 = f10;
            boolean z13 = z12;
            boolean z14 = z11;
            Point point3 = point2;
            return hVar.a(point, i10, point3, z10, z14, f11, z13);
        }

        public final h a(Point finalAnimatedPositionScroll, int i10, Point lastStateUpdateScroll, boolean z10, boolean z11, float f10, boolean z12) {
            AbstractC5504s.h(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            AbstractC5504s.h(lastStateUpdateScroll, "lastStateUpdateScroll");
            return new h(finalAnimatedPositionScroll, i10, lastStateUpdateScroll, z10, z11, f10, z12);
        }

        public final float c() {
            return this.f38132f;
        }

        public final Point d() {
            return this.f38127a;
        }

        public final Point e() {
            return this.f38129c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC5504s.c(this.f38127a, hVar.f38127a) && this.f38128b == hVar.f38128b && AbstractC5504s.c(this.f38129c, hVar.f38129c) && this.f38130d == hVar.f38130d && this.f38131e == hVar.f38131e && Float.compare(this.f38132f, hVar.f38132f) == 0 && this.f38133g == hVar.f38133g;
        }

        public final int f() {
            return this.f38128b;
        }

        public final boolean g() {
            return this.f38130d;
        }

        public final boolean h() {
            return this.f38131e;
        }

        public int hashCode() {
            return (((((((((((this.f38127a.hashCode() * 31) + Integer.hashCode(this.f38128b)) * 31) + this.f38129c.hashCode()) * 31) + Boolean.hashCode(this.f38130d)) * 31) + Boolean.hashCode(this.f38131e)) * 31) + Float.hashCode(this.f38132f)) * 31) + Boolean.hashCode(this.f38133g);
        }

        public final boolean i() {
            return this.f38133g;
        }

        public final void j(boolean z10) {
            this.f38130d = z10;
        }

        public final void k(float f10) {
            this.f38132f = f10;
        }

        public final h l(int i10, int i11) {
            this.f38127a.set(i10, i11);
            return this;
        }

        public final void m(boolean z10) {
            this.f38131e = z10;
        }

        public final h n(int i10, int i11) {
            this.f38129c.set(i10, i11);
            return this;
        }

        public final void o(int i10) {
            this.f38128b = i10;
        }

        public final void p(boolean z10) {
            this.f38133g = z10;
        }

        public String toString() {
            return "ReactScrollViewScrollState(finalAnimatedPositionScroll=" + this.f38127a + ", scrollAwayPaddingTop=" + this.f38128b + ", lastStateUpdateScroll=" + this.f38129c + ", isCanceled=" + this.f38130d + ", isFinished=" + this.f38131e + ", decelerationRate=" + this.f38132f + ", isUpdatedByScroll=" + this.f38133g + ")";
        }

        public h(Point finalAnimatedPositionScroll, int i10, Point lastStateUpdateScroll, boolean z10, boolean z11, float f10, boolean z12) {
            AbstractC5504s.h(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            AbstractC5504s.h(lastStateUpdateScroll, "lastStateUpdateScroll");
            this.f38127a = finalAnimatedPositionScroll;
            this.f38128b = i10;
            this.f38129c = lastStateUpdateScroll;
            this.f38130d = z10;
            this.f38131e = z11;
            this.f38132f = f10;
            this.f38133g = z12;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ h(android.graphics.Point r2, int r3, android.graphics.Point r4, boolean r5, boolean r6, float r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L9
                android.graphics.Point r2 = new android.graphics.Point
                r2.<init>()
            L9:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lf
                r3 = r0
            Lf:
                r10 = r9 & 4
                if (r10 == 0) goto L19
                android.graphics.Point r4 = new android.graphics.Point
                r10 = -1
                r4.<init>(r10, r10)
            L19:
                r10 = r9 & 8
                if (r10 == 0) goto L1e
                r5 = r0
            L1e:
                r10 = r9 & 16
                if (r10 == 0) goto L23
                r6 = 1
            L23:
                r10 = r9 & 32
                if (r10 == 0) goto L2a
                r7 = 1065101558(0x3f7c28f6, float:0.985)
            L2a:
                r9 = r9 & 64
                if (r9 == 0) goto L37
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3f
            L37:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.n.h.<init>(android.graphics.Point, int, android.graphics.Point, boolean, boolean, float, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface i {
        void b(ViewGroup viewGroup);

        void h(ViewGroup viewGroup, p pVar, float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f38134a;

        j(ViewGroup viewGroup) {
            this.f38134a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5504s.h(animator, "animator");
            n.l(this.f38134a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5504s.h(animator, "animator");
            n.l(this.f38134a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC5504s.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5504s.h(animator, "animator");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f38135a;

        k(ViewGroup viewGroup) {
            this.f38135a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5504s.h(animator, "animator");
            ((c) this.f38135a).getReactScrollViewScrollState().j(true);
            n.r(this.f38135a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5504s.h(animator, "animator");
            ((c) this.f38135a).getReactScrollViewScrollState().m(true);
            n.r(this.f38135a);
            n.z(this.f38135a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC5504s.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5504s.h(animator, "animator");
            h reactScrollViewScrollState = ((c) this.f38135a).getReactScrollViewScrollState();
            reactScrollViewScrollState.j(false);
            reactScrollViewScrollState.m(false);
        }
    }

    private n() {
    }

    public static final void B(ViewGroup viewGroup, float f10, float f11) {
        f38119a.A(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
        h(viewGroup, f10, f11);
    }

    public static final void a(f listener) {
        AbstractC5504s.h(listener, "listener");
        f38123e.add(new WeakReference(listener));
    }

    public static final void b(i listener) {
        AbstractC5504s.h(listener, "listener");
        f38122d.add(new WeakReference(listener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new j(viewGroup));
    }

    public static final void d(ViewGroup scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        Iterator it = f38123e.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null) {
                fVar.k(scrollView);
            }
        }
    }

    public static final void e(ViewGroup scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        Iterator it = f38122d.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.b(scrollView);
            }
        }
    }

    public static final void f(ViewGroup viewGroup) {
        f38119a.i(viewGroup, p.f38150b);
    }

    public static final void g(ViewGroup viewGroup, float f10, float f11) {
        f38119a.j(viewGroup, p.f38151c, f10, f11);
    }

    public static final void h(ViewGroup viewGroup, float f10, float f11) {
        f38119a.j(viewGroup, p.f38152d, f10, f11);
    }

    private final void i(ViewGroup viewGroup, p pVar) {
        j(viewGroup, pVar, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(ViewGroup viewGroup, p pVar, float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (pVar == p.f38152d) {
            if (r1.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - ((b) viewGroup).getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = AbstractC2279u.b1(f38122d).iterator();
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.h(viewGroup, pVar, f10, f11);
            }
        }
        Context context = viewGroup.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = f0.e(reactContext);
        EventDispatcher eventDispatcherC = f0.c(reactContext, viewGroup.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(o.f38136k.a(iE, viewGroup.getId(), pVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f10, f11, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
            if (pVar == p.f38152d) {
                ((b) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    public static final void k(ViewGroup viewGroup, int i10, int i11) {
        f38119a.j(viewGroup, p.f38153e, i10, i11);
    }

    public static final void l(ViewGroup viewGroup) {
        f38119a.i(viewGroup, p.f38154f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View m(ViewGroup host, View focused, int i10) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        int iIntValue;
        int[] relativeAncestorList;
        Set setH1;
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(focused, "focused");
        if (!(host instanceof F)) {
            return null;
        }
        Context context = host.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManagerG = f0.g((ReactContext) context, 2);
        if (uIManagerG == null || (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManagerG).findNextFocusableElement(host.getId(), focused.getId(), i10)) == null || (relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), (iIntValue = numFindNextFocusableElement.intValue()))) == null || (setH1 = AbstractC2273n.h1(relativeAncestorList)) == null) {
            return null;
        }
        setH1.add(numFindNextFocusableElement);
        ((F) host).updateClippingRect(setH1);
        return host.findViewById(iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(ViewGroup viewGroup) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        int iF = reactScrollViewScrollState.f();
        Point pointE = reactScrollViewScrollState.e();
        int i10 = pointE.x;
        int i11 = pointE.y;
        if (f38121c) {
            AbstractC7283a.u(f38120b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        InterfaceC3282a0 stateWrapper = ((e) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", B.g(i10));
            writableNativeMap.putDouble("contentOffsetTop", B.g(i11));
            writableNativeMap.putDouble("scrollAwayPaddingTop", B.g(iF));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int o(Context context) {
        if (!f38125g) {
            f38125g = true;
            try {
                f38124f = new g(context).a();
            } catch (Throwable unused) {
            }
        }
        return f38124f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int p(ViewGroup viewGroup, int i10, int i11, int i12) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.h() || (reactScrollViewScrollState.g() && ((i12 != 0 ? i12 / Math.abs(i12) : 0) * (i11 - i10) > 0))) ? i11 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(ViewGroup viewGroup, InterfaceC3282a0 stateWrapper) {
        ReadableNativeMap stateData;
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        c cVar = (c) viewGroup;
        if (cVar.getReactScrollViewScrollState().i() || (stateData = stateWrapper.getStateData()) == null) {
            return;
        }
        int iH = (int) B.h(stateData.getDouble("contentOffsetLeft"));
        int iH2 = (int) B.h(stateData.getDouble("contentOffsetTop"));
        h hVarB = h.b(cVar.getReactScrollViewScrollState(), null, (int) B.h(stateData.getDouble("scrollAwayPaddingTop")), null, false, false, 0.0f, false, 125, null);
        hVarB.n(iH, iH2);
        cVar.setReactScrollViewScrollState(hVarB);
    }

    public static final void r(ViewGroup scrollView) {
        NativeAnimatedModule nativeAnimatedModule;
        AbstractC5504s.h(scrollView, "scrollView");
        Context context = scrollView.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null) {
            return;
        }
        nativeAnimatedModule.userDrivenScrollEnded(scrollView.getId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int s(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L4c
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L4c
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4a
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wrong overScrollMode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r3)
            return r0
        L4a:
            r3 = 0
            return r3
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.n.s(java.lang.String):int");
    }

    public static final int t(String str) {
        if (str == null) {
            return 0;
        }
        if (Df.r.B("start", str, true)) {
            return 1;
        }
        if (Df.r.B("center", str, true)) {
            return 2;
        }
        if (AbstractC5504s.c("end", str)) {
            return 3;
        }
        AbstractC7283a.I("ReactNative", "wrong snap alignment value: " + str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point u(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.c());
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int height = (viewGroup.getHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop();
        Point pointD = reactScrollViewScrollState.d();
        overScroller.fling(p(viewGroup, viewGroup.getScrollX(), pointD.x, i10), p(viewGroup, viewGroup.getScrollY(), pointD.y, i11), i10, i11, 0, i12, 0, i13, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void w(f listener) {
        AbstractC5504s.h(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator it = f38123e.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            f fVar = (f) weakReference.get();
            if (fVar == null || AbstractC5504s.c(fVar, listener)) {
                arrayList.add(weakReference);
            }
        }
        f38123e.removeAll(arrayList);
    }

    public static final void x(i listener) {
        AbstractC5504s.h(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator it = f38122d.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i iVar = (i) weakReference.get();
            if (iVar == null || AbstractC5504s.c(iVar, listener)) {
                arrayList.add(weakReference);
            }
        }
        f38122d.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(ViewGroup viewGroup, int i10, int i11) {
        if (f38121c) {
            AbstractC7283a.u(f38120b, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        a aVar = (a) viewGroup;
        ValueAnimator flingAnimator = aVar.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f38119a.v(viewGroup);
        }
        ((c) viewGroup).getReactScrollViewScrollState().l(i10, i11);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i10) {
            aVar.d(scrollX, i10);
        }
        if (scrollY != i11) {
            aVar.d(scrollY, i11);
        }
    }

    public static final void z(ViewGroup viewGroup) {
        f38119a.A(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(ViewGroup viewGroup, int i10, int i11) {
        if (f38121c) {
            AbstractC7283a.u(f38120b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (C7.a.a(viewGroup.getId()) == 1 || ((e) viewGroup).getStateWrapper() == null) {
            return;
        }
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        reactScrollViewScrollState.p(true);
        if (reactScrollViewScrollState.e().equals(i10, i11)) {
            return;
        }
        reactScrollViewScrollState.n(i10, i11);
        n(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new k(viewGroup));
    }
}
