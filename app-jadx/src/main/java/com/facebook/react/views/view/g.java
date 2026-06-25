package com.facebook.react.views.view;

import H7.k;
import H7.t;
import H7.v;
import Td.InterfaceC2154e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3287d;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.C3306w;
import com.facebook.react.uimanager.E;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.F;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends ViewGroup implements A7.d, F, L, A7.c, U, K {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final b Companion = new b(null);
    private static final ViewGroup.LayoutParams defaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private p0 _drawingOrderHelper;
    private v _overflow;
    private boolean _removeClippedSubviews;
    private AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private View[] allChildren;
    private int allChildrenCount;
    private List<String> axOrderList;
    private float backfaceOpacity;
    private boolean backfaceVisible;
    private a childrenLayoutChangeListener;
    private Set<Integer> childrenRemovedWhileTransitioning;
    private Rect clippingRect;
    private boolean focusOnAttach;
    private Rect hitSlopRect;
    private volatile boolean inSubviewClippingLoop;
    private boolean needsOffscreenAlphaCompositing;
    private A7.b onInterceptTouchEventListener;
    private final Rect overflowInset;
    private C pointerEvents;
    private int recycleCount;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        private g f38491a;

        public a(g gVar) {
            this.f38491a = gVar;
        }

        public final void a() {
            this.f38491a = null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            g gVar;
            AbstractC5504s.h(v10, "v");
            g gVar2 = this.f38491a;
            if (gVar2 == null || !gVar2.getRemoveClippedSubviews() || (gVar = this.f38491a) == null) {
                return;
            }
            gVar.A(v10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(View view, boolean z10) {
            view.setTag(AbstractC3247l.f36905F, Boolean.valueOf(z10));
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38492a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.f8137c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.f8138d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.f8136b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38492a = iArr;
        }
    }

    public g(Context context) {
        super(context);
        this.overflowInset = new Rect();
        this.pointerEvents = C.f37391e;
        s();
    }

    public final void A(View view) {
        g gVar;
        if (this._removeClippedSubviews && getParent() != null) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            View[] viewArr = this.allChildren;
            if (viewArr == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != (!u(view, null))) {
                this.inSubviewClippingLoop = true;
                int i10 = this.allChildrenCount;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= i10) {
                        gVar = this;
                        break;
                    }
                    View view2 = viewArr[i11];
                    if (view2 == view) {
                        updateSubviewClipStatus$default(this, rect, i11, i12, null, 8, null);
                        gVar = this;
                        break;
                    }
                    int i13 = i11;
                    Rect rect2 = rect;
                    if (u(view2, Integer.valueOf(i13))) {
                        i12++;
                    }
                    rect = rect2;
                    i11 = i13 + 1;
                }
                gVar.inSubviewClippingLoop = false;
            }
        }
    }

    private final p0 getDrawingOrderHelper() {
        if (this._drawingOrderHelper == null) {
            this._drawingOrderHelper = new p0(this);
        }
        p0 p0Var = this._drawingOrderHelper;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void n(g gVar, boolean z10) {
        if (z10) {
            return;
        }
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gVar.getChildAt(i10);
            AbstractC5504s.g(childAt, "getChildAt(...)");
            E.d(childAt);
        }
    }

    private final void o(View view, int i10) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i11 = this.allChildrenCount;
        int length = viewArr.length;
        if (i10 == i11) {
            if (length == i11) {
                View[] viewArr2 = new View[length + 12];
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                this.allChildren = viewArr2;
                viewArr = viewArr2;
            }
            int i12 = this.allChildrenCount;
            this.allChildrenCount = i12 + 1;
            viewArr[i12] = view;
            return;
        }
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index=" + i10 + " count=" + i11);
        }
        if (length == i11) {
            View[] viewArr3 = new View[length + 12];
            System.arraycopy(viewArr, 0, viewArr3, 0, i10);
            System.arraycopy(viewArr, i10, viewArr3, i10 + 1, i11 - i10);
            this.allChildren = viewArr3;
            viewArr = viewArr3;
        } else {
            System.arraycopy(viewArr, i10, viewArr, i10 + 1, i11 - i10);
        }
        viewArr[i10] = view;
        this.allChildrenCount++;
    }

    private final void p(View view, boolean z10) {
        if (this.inSubviewClippingLoop) {
            Object tag = view.getTag(AbstractC3247l.f36905F);
            if (!AbstractC5504s.c(Boolean.valueOf(z10), tag)) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_ON_VIEW_REMOVED, new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + z10));
            }
        }
        if (this._removeClippedSubviews) {
            view.setTag(AbstractC3247l.f36905F, Boolean.valueOf(z10));
        } else {
            view.setTag(AbstractC3247l.f36905F, null);
        }
    }

    private final boolean q() {
        return getId() != -1 && C7.a.a(getId()) == 2;
    }

    private final int r(View view) {
        int i10 = this.allChildrenCount;
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == view) {
                return i11;
            }
        }
        return -1;
    }

    private final void s() {
        setClipChildren(false);
        this._removeClippedSubviews = false;
        this.inSubviewClippingLoop = false;
        this.allChildren = null;
        this.allChildrenCount = 0;
        this.clippingRect = null;
        setHitSlopRect(null);
        this._overflow = v.f8136b;
        setPointerEvents(C.f37391e);
        this.childrenLayoutChangeListener = null;
        this.onInterceptTouchEventListener = null;
        this.needsOffscreenAlphaCompositing = false;
        this._drawingOrderHelper = null;
        this.backfaceOpacity = 1.0f;
        this.backfaceVisible = true;
        this.childrenRemovedWhileTransitioning = null;
    }

    private final boolean t(View view) {
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(view.getId()));
    }

    private final boolean u(View view, Integer num) {
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object tag = view.getTag(AbstractC3247l.f36905F);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zT = t(view);
        if (num != null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_IS_VIEW_CLIPPED, new ReactNoCrashSoftException("View missing clipping tag: index=" + num + " parentNull=" + (parent == null) + " parentThis=" + (parent == this) + " transitioning=" + zT));
        }
        if (parent == null || zT) {
            return true;
        }
        if (parent == this) {
            return false;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateClippingToRect$ReactAndroid_release$default(g gVar, Rect rect, Set set, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClippingToRect");
        }
        if ((i10 & 2) != 0) {
            set = null;
        }
        gVar.updateClippingToRect$ReactAndroid_release(rect, set);
    }

    static /* synthetic */ void updateSubviewClipStatus$default(g gVar, Rect rect, int i10, int i11, Set set, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubviewClipStatus");
        }
        if ((i12 & 8) != 0) {
            set = null;
        }
        gVar.z(rect, i10, i11, set);
    }

    private final void v(int i10) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i11 = this.allChildrenCount;
        if (i10 == i11 - 1) {
            int i12 = i11 - 1;
            this.allChildrenCount = i12;
            viewArr[i12] = null;
        } else {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i10 + 1, viewArr, i10, (i11 - i10) - 1);
            int i13 = this.allChildrenCount - 1;
            this.allChildrenCount = i13;
            viewArr[i13] = null;
        }
    }

    private final void w() {
        setPointerEvents(C.f37391e);
    }

    private final void x(int i10) {
        if (this.childrenRemovedWhileTransitioning == null) {
            this.childrenRemovedWhileTransitioning = new LinkedHashSet();
        }
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.add(Integer.valueOf(i10));
        }
    }

    private final void y(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(android.graphics.Rect r9, int r10, int r11, java.util.Set r12) {
        /*
            r8 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.view.View[] r0 = r8.allChildren
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r0[r10]
            goto Lc
        Lb:
            r0 = r1
        Lc:
            if (r0 == 0) goto Laf
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            boolean r9 = r9.intersects(r2, r3, r4, r5)
            android.view.animation.Animation r2 = r0.getAnimation()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            boolean r2 = r2.hasEnded()
            if (r2 != 0) goto L32
            r2 = r4
            goto L33
        L32:
            r2 = r3
        L33:
            if (r12 == 0) goto L45
            int r5 = r0.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r12.contains(r5)
            if (r5 != r4) goto L45
            r5 = r4
            goto L46
        L45:
            r5 = r3
        L46:
            if (r12 == 0) goto L4a
            r6 = r4
            goto L4b
        L4a:
            r6 = r3
        L4b:
            if (r9 != 0) goto L6b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            boolean r7 = r8.u(r0, r7)
            if (r7 != 0) goto L6b
            if (r2 != 0) goto L6b
            android.view.View r2 = r8.getFocusedChild()
            if (r0 == r2) goto L6b
            if (r5 != 0) goto L6b
            com.facebook.react.views.view.g$b r9 = com.facebook.react.views.view.g.Companion
            com.facebook.react.views.view.g.b.a(r9, r0, r4)
            r8.removeViewInLayout(r0)
        L69:
            r6 = r4
            goto L95
        L6b:
            if (r5 != 0) goto L6f
            if (r9 == 0) goto L92
        L6f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            boolean r2 = r8.u(r0, r2)
            if (r2 == 0) goto L92
            int r10 = r10 - r11
            if (r10 < 0) goto L8a
            com.facebook.react.views.view.g$b r9 = com.facebook.react.views.view.g.Companion
            com.facebook.react.views.view.g.b.a(r9, r0, r3)
            android.view.ViewGroup$LayoutParams r9 = com.facebook.react.views.view.g.defaultLayoutParam
            r8.addViewInLayout(r0, r10, r9, r4)
            r8.invalidate()
            goto L69
        L8a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)
            throw r9
        L92:
            if (r9 == 0) goto L95
            goto L69
        L95:
            if (r6 == 0) goto Lae
            boolean r9 = r0 instanceof com.facebook.react.uimanager.F
            if (r9 == 0) goto L9e
            r1 = r0
            com.facebook.react.uimanager.F r1 = (com.facebook.react.uimanager.F) r1
        L9e:
            if (r1 == 0) goto La7
            boolean r9 = r1.getRemoveClippedSubviews()
            if (r9 != r4) goto La7
            r3 = r4
        La7:
            if (r3 == 0) goto Lae
            com.facebook.react.uimanager.F r0 = (com.facebook.react.uimanager.F) r0
            r0.updateClippingRect(r12)
        Lae:
            return
        Laf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.g.z(android.graphics.Rect, int, int, java.util.Set):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        AbstractC5504s.h(outChildren, "outChildren");
        Object tag = getTag(AbstractC3247l.f36913g);
        List<String> list = tag instanceof g ? ((g) tag).axOrderList : null;
        List<String> list2 = this.axOrderList;
        int i10 = 0;
        if (list2 == null) {
            if (list == null) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable()) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable() || (getContentDescription() != null && !AbstractC5504s.c(getContentDescription(), ""))) {
                if (!isFocusable() || getContentDescription() == null) {
                    return;
                }
                AbstractC5504s.c(getContentDescription(), "");
                return;
            }
            super.addChildrenForAccessibility(outChildren);
            int childCount = getChildCount();
            while (i10 < childCount) {
                E e10 = E.f37520a;
                View childAt = getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                e10.c(childAt, list);
                i10++;
            }
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (this.accessibilityStateChangeListener == null && accessibilityManager != null) {
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.facebook.react.views.view.f
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z10) {
                    g.n(this.f38490a, z10);
                }
            };
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        }
        int size = list2.size();
        View[] viewArr = new View[size];
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            E e11 = E.f37520a;
            View childAt2 = getChildAt(i11);
            AbstractC5504s.g(childAt2, "getChildAt(...)");
            e11.a(childAt2, this, list2, viewArr);
        }
        while (i10 < size) {
            View view = viewArr[i10];
            if (view != null) {
                if (view.isFocusable()) {
                    outChildren.add(view);
                } else {
                    view.addChildrenForAccessibility(outChildren);
                }
            }
            i10++;
        }
    }

    public final void addViewWithSubviewClippingEnabled$ReactAndroid_release(View child, int i10) {
        AbstractC5504s.h(child, "child");
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        Companion.b(child, true);
        o(child, i10);
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (u(viewArr[i12], Integer.valueOf(i12))) {
                i11++;
            }
        }
        updateSubviewClipStatus$default(this, rect, i10, i11, null, 8, null);
        this.inSubviewClippingLoop = false;
        child.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
    }

    public final void cleanUpAxOrderListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && (accessibilityStateChangeListener = this.accessibilityStateChangeListener) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.accessibilityStateChangeListener = null;
    }

    public final void clearFocusFromJS$ReactAndroid_release() {
        this.focusOnAttach = false;
        super.clearFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (this._overflow != v.f8136b || getTag(AbstractC3247l.f36921o) != null) {
            C3281a.a(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (C.f37387a.b(getPointerEvents())) {
            return super.dispatchGenericMotionEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        AbstractC5504s.h(structure, "structure");
        try {
            super.dispatchProvideStructure(structure);
        } catch (NullPointerException e10) {
            AbstractC7283a.n("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 29 || C7.a.c(this) != 2 || !C3287d.a(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006c A[PHI: r4
  0x006c: PHI (r4v1 android.graphics.BlendMode) = 
  (r4v0 android.graphics.BlendMode)
  (r4v0 android.graphics.BlendMode)
  (r4v0 android.graphics.BlendMode)
  (r4v3 android.graphics.BlendMode)
 binds: [B:35:0x0022, B:37:0x0029, B:39:0x002f, B:43:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        /*
            r11 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.AbstractC5504s.h(r12, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.AbstractC5504s.h(r13, r0)
            float r0 = r13.getElevation()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L17
            r0 = r2
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L1d
            com.facebook.react.views.view.a.a(r12, r2)
        L1d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 0
            if (r2 < r3) goto L6c
            int r2 = C7.a.c(r11)
            r3 = 2
            if (r2 != r3) goto L6c
            boolean r2 = com.facebook.react.uimanager.C3287d.a(r11)
            if (r2 == 0) goto L6c
            int r2 = com.facebook.react.AbstractC3247l.f36925s
            java.lang.Object r2 = r13.getTag(r2)
            boolean r3 = com.facebook.react.views.view.e.a(r2)
            if (r3 == 0) goto L41
            android.graphics.BlendMode r4 = com.facebook.react.U.a(r2)
        L41:
            if (r4 == 0) goto L6c
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            s0.N1.a(r10, r4)
            android.graphics.Rect r2 = r11.getOverflowInset()
            int r3 = r2.left
            float r6 = (float) r3
            int r3 = r2.top
            float r7 = (float) r3
            int r3 = r11.getWidth()
            int r5 = r2.right
            int r5 = -r5
            int r3 = r3 + r5
            float r8 = (float) r3
            int r3 = r11.getHeight()
            int r2 = r2.bottom
            int r2 = -r2
            int r3 = r3 + r2
            float r9 = (float) r3
            r5 = r12
            r5.saveLayer(r6, r7, r8, r9, r10)
            goto L6d
        L6c:
            r5 = r12
        L6d:
            boolean r12 = super.drawChild(r5, r13, r14)
            if (r4 == 0) goto L76
            r5.restore()
        L76:
            if (r0 == 0) goto L7b
            com.facebook.react.views.view.a.a(r5, r1)
        L7b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.g.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        AbstractC5504s.h(view, "view");
        super.endViewTransition(view);
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    public final int getAllChildrenCount$ReactAndroid_release() {
        return this.allChildrenCount;
    }

    public final List<String> getAxOrderList() {
        return this.axOrderList;
    }

    public final View getChildAtWithSubviewClippingEnabled$ReactAndroid_release(int i10) {
        if (i10 < 0 || i10 >= this.allChildrenCount) {
            return null;
        }
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            return viewArr[i10];
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        return !q() ? getDrawingOrderHelper().c(i10, i11) : i11;
    }

    @Override // com.facebook.react.uimanager.F
    public void getClippingRect(Rect outClippingRect) {
        AbstractC5504s.h(outClippingRect, "outClippingRect");
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        outClippingRect.set(rect);
    }

    public final Rect getClippingRect$ReactAndroid_release() {
        return this.clippingRect;
    }

    @Override // A7.c
    public Rect getHitSlopRect() {
        return this.hitSlopRect;
    }

    @Override // com.facebook.react.uimanager.J
    public String getOverflow() {
        v vVar = this._overflow;
        int i10 = vVar == null ? -1 : c.f38492a[vVar.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.K
    public Rect getOverflowInset() {
        return this.overflowInset;
    }

    @Override // com.facebook.react.uimanager.L
    public C getPointerEvents() {
        return this.pointerEvents;
    }

    public boolean getRemoveClippedSubviews() {
        return this._removeClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.U
    public int getZIndexMappedChildIndex(int i10) {
        UiThreadUtil.assertOnUiThread();
        return (q() || !getDrawingOrderHelper().h()) ? i10 : getDrawingOrderHelper().c(getChildCount(), i10);
    }

    public final boolean get_removeClippedSubviews$ReactAndroid_release() {
        return this._removeClippedSubviews;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.needsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
        if (this.focusOnAttach) {
            requestFocusFromJS$ReactAndroid_release();
            this.focusOnAttach = false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        return ReactFeatureFlags.dispatchPointerEvents ? C.f37387a.a(getPointerEvents()) : super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        A7.b bVar = this.onInterceptTouchEventListener;
        if ((bVar == null || !bVar.a(this, event)) && C.f37387a.b(getPointerEvents())) {
            return super.onInterceptTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C3306w.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        return C.f37387a.a(getPointerEvents());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        AbstractC5504s.h(child, "child");
        UiThreadUtil.assertOnUiThread();
        p(child, false);
        if (q()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().f(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        }
        super.onViewAdded(child);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        AbstractC5504s.h(child, "child");
        UiThreadUtil.assertOnUiThread();
        p(child, true);
        if (q()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().g(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        }
        if (child.getParent() != null) {
            x(child.getId());
        }
        super.onViewRemoved(child);
    }

    public void recycleView$ReactAndroid_release() {
        a aVar;
        this.recycleCount++;
        View[] viewArr = this.allChildren;
        if (viewArr != null && (aVar = this.childrenLayoutChangeListener) != null) {
            if (aVar != null) {
                aVar.a();
            }
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View view = viewArr[i11];
                if (view != null) {
                    view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
                }
            }
        }
        s();
        getOverflowInset().setEmpty();
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            AbstractC5504s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        y(null);
        w();
        this.focusOnAttach = false;
    }

    public final void removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release() {
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = this.allChildrenCount;
        for (int i11 = 0; i11 < i10; i11++) {
            View view = viewArr[i11];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        removeAllViewsInLayout();
        this.allChildrenCount = 0;
    }

    public final void removeViewWithSubviewClippingEnabled$ReactAndroid_release(View view) {
        AbstractC5504s.h(view, "view");
        UiThreadUtil.assertOnUiThread();
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
        int iR = r(view);
        if (!u(viewArr[iR], Integer.valueOf(iR))) {
            int i10 = 0;
            for (int i11 = 0; i11 < iR; i11++) {
                if (u(viewArr[i11], Integer.valueOf(i11))) {
                    i10++;
                }
            }
            removeViewsInLayout(iR - i10, 1);
            invalidate();
        }
        v(iR);
    }

    public final void requestFocusFromJS$ReactAndroid_release() {
        if (isAttachedToWindow()) {
            super.requestFocus(130, null);
        } else {
            this.focusOnAttach = true;
        }
    }

    public final void setAxOrderList(List<String> list) {
        this.axOrderList = list;
    }

    public final void setBackfaceVisibility(String backfaceVisibility) {
        AbstractC5504s.h(backfaceVisibility, "backfaceVisibility");
        this.backfaceVisible = AbstractC5504s.c("visible", backfaceVisibility);
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (this.backfaceVisible) {
            setAlpha(this.backfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.backfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C3281a.m(this, Integer.valueOf(i10));
    }

    public final void setBorderColor(int i10, Integer num) {
        C3281a.r(this, (t) t.b().get(i10), num);
    }

    @InterfaceC2154e
    public final void setBorderRadius(float f10) {
        C3281a.s(this, H7.i.f8043a, Float.isNaN(f10) ? null : new C3303t(f10, EnumC3304u.f37832a));
    }

    public final void setBorderStyle(String str) {
        C3281a.t(this, str != null ? k.f8072a.a(str) : null);
    }

    public final void setBorderWidth(int i10, float f10) {
        C3281a.u(this, (t) t.b().get(i10), Float.valueOf(B.g(f10)));
    }

    public final void setClippingRect$ReactAndroid_release(Rect rect) {
        this.clippingRect = rect;
    }

    public void setHitSlopRect(Rect rect) {
        this.hitSlopRect = rect;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean z10) {
        this.needsOffscreenAlphaCompositing = z10;
    }

    @Override // A7.d
    public void setOnInterceptTouchEventListener(A7.b listener) {
        AbstractC5504s.h(listener, "listener");
        this.onInterceptTouchEventListener = listener;
    }

    public final void setOpacityIfPossible(float f10) {
        this.backfaceOpacity = f10;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this._overflow = str == null ? v.f8136b : v.f8135a.a(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.K
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        if (C3287d.a(this) && (getOverflowInset().left != i10 || getOverflowInset().top != i11 || getOverflowInset().right != i12 || getOverflowInset().bottom != i13)) {
            invalidate();
        }
        getOverflowInset().set(i10, i11, i12, i13);
    }

    public void setPointerEvents(C c10) {
        AbstractC5504s.h(c10, "<set-?>");
        this.pointerEvents = c10;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 == this._removeClippedSubviews) {
            return;
        }
        this._removeClippedSubviews = z10;
        this.childrenRemovedWhileTransitioning = null;
        if (z10) {
            Rect rect = new Rect();
            G.a(this, rect);
            this.clippingRect = rect;
            int childCount = getChildCount();
            this.allChildrenCount = childCount;
            View[] viewArr = new View[Math.max(12, childCount)];
            this.childrenLayoutChangeListener = new a(this);
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View childAt = getChildAt(i11);
                viewArr[i11] = childAt;
                childAt.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
                b bVar = Companion;
                AbstractC5504s.e(childAt);
                bVar.b(childAt, false);
            }
            this.allChildren = viewArr;
            updateClippingRect();
            return;
        }
        View[] viewArr2 = this.allChildren;
        if (viewArr2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.childrenLayoutChangeListener == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i12 = this.allChildrenCount;
        for (int i13 = 0; i13 < i12; i13++) {
            View view = viewArr2[i13];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        Rect rect2 = this.clippingRect;
        if (rect2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        getDrawingRect(rect2);
        updateClippingToRect$ReactAndroid_release$default(this, rect2, null, 2, null);
        this.allChildren = null;
        this.clippingRect = null;
        this.allChildrenCount = 0;
        this.childrenLayoutChangeListener = null;
    }

    @InterfaceC2154e
    public final void setTranslucentBackgroundDrawable(Drawable drawable) {
        C3281a.x(this, drawable);
    }

    public final void set_removeClippedSubviews$ReactAndroid_release(boolean z10) {
        this._removeClippedSubviews = z10;
    }

    public void updateClippingRect() {
        updateClippingRect(null);
    }

    public final void updateClippingToRect$ReactAndroid_release(Rect clippingRect, Set<Integer> set) {
        AbstractC5504s.h(clippingRect, "clippingRect");
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i10 = this.allChildrenCount;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            try {
                z(clippingRect, i12, i11, set);
                if (u(viewArr[i12], Integer.valueOf(i12))) {
                    i11++;
                }
                if (i12 - i11 > getChildCount()) {
                    throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + "  excludedViews=" + (set != null ? set.size() : 0));
                }
            } catch (IndexOutOfBoundsException e10) {
                HashSet hashSet = new HashSet();
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    i13 += u(viewArr[i14], Integer.valueOf(i14)) ? 1 : 0;
                    hashSet.add(viewArr[i14]);
                }
                throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + " realClippedSoFar=" + i13 + " uniqueViewsCount=" + hashSet.size() + " excludedViews=" + (set != null ? set.size() : 0), e10);
            }
        }
        this.inSubviewClippingLoop = false;
    }

    @Override // com.facebook.react.uimanager.U
    public void updateDrawingOrder() {
        if (q()) {
            return;
        }
        getDrawingOrderHelper().i();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().h());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.F
    public void updateClippingRect(Set<Integer> set) {
        if (this._removeClippedSubviews) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            G.a(this, rect);
            updateClippingToRect$ReactAndroid_release(rect, set);
        }
    }

    @InterfaceC2154e
    public final void setBorderRadius(float f10, int i10) {
        C3281a.s(this, (H7.i) H7.i.b().get(i10), Float.isNaN(f10) ? null : new C3303t(f10, EnumC3304u.f37832a));
    }

    public final void setBorderRadius(H7.i property, C3303t c3303t) {
        AbstractC5504s.h(property, "property");
        C3281a.s(this, property, c3303t);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
