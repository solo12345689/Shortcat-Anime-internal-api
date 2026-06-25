package R1;

import L1.B;
import L1.C;
import L1.D;
import R1.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import t.j0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C2746a {

    /* JADX INFO: renamed from: n */
    private static final Rect f15090n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    private static final b.a f15091o = new C0257a();

    /* JADX INFO: renamed from: p */
    private static final b.InterfaceC0258b f15092p = new b();

    /* JADX INFO: renamed from: h */
    private final AccessibilityManager f15097h;

    /* JADX INFO: renamed from: i */
    private final View f15098i;

    /* JADX INFO: renamed from: j */
    private c f15099j;

    /* JADX INFO: renamed from: d */
    private final Rect f15093d = new Rect();

    /* JADX INFO: renamed from: e */
    private final Rect f15094e = new Rect();

    /* JADX INFO: renamed from: f */
    private final Rect f15095f = new Rect();

    /* JADX INFO: renamed from: g */
    private final int[] f15096g = new int[2];

    /* JADX INFO: renamed from: k */
    int f15100k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    int f15101l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    private int f15102m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: R1.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0257a implements b.a {
        C0257a() {
        }

        @Override // R1.b.a
        /* JADX INFO: renamed from: b */
        public void a(B b10, Rect rect) {
            b10.m(rect);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements b.InterfaceC0258b {
        b() {
        }

        @Override // R1.b.InterfaceC0258b
        /* JADX INFO: renamed from: c */
        public B a(j0 j0Var, int i10) {
            return (B) j0Var.n(i10);
        }

        @Override // R1.b.InterfaceC0258b
        /* JADX INFO: renamed from: d */
        public int b(j0 j0Var) {
            return j0Var.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends C {
        c() {
        }

        @Override // L1.C
        public B b(int i10) {
            return B.l0(a.this.H(i10));
        }

        @Override // L1.C
        public B d(int i10) {
            int i11 = i10 == 2 ? a.this.f15100k : a.this.f15101l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // L1.C
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f15098i = view;
        this.f15097h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC2747a0.w(view) == 0) {
            AbstractC2747a0.s0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f15098i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f15098i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        B b10;
        j0 j0VarY = y();
        int i11 = this.f15101l;
        B b11 = i11 == Integer.MIN_VALUE ? null : (B) j0VarY.f(i11);
        if (i10 == 1 || i10 == 2) {
            b10 = (B) R1.b.d(j0VarY, f15092p, f15091o, b11, i10, AbstractC2747a0.y(this.f15098i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f15101l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f15098i, i10, rect2);
            }
            b10 = (B) R1.b.c(j0VarY, f15092p, f15091o, b11, rect2, i10);
        }
        return T(b10 != null ? j0VarY.i(j0VarY.h(b10)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return AbstractC2747a0.Z(this.f15098i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f15097h.isEnabled() || !this.f15097h.isTouchExplorationEnabled() || (i11 = this.f15100k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f15100k = i10;
        this.f15098i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f15102m;
        if (i11 == i10) {
            return;
        }
        this.f15102m = i10;
        U(i10, 128);
        U(i11, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    private boolean n(int i10) {
        if (this.f15100k != i10) {
            return false;
        }
        this.f15100k = Integer.MIN_VALUE;
        this.f15098i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f15101l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        B bH = H(i10);
        accessibilityEventObtain.getText().add(bH.K());
        accessibilityEventObtain.setContentDescription(bH.w());
        accessibilityEventObtain.setScrollable(bH.f0());
        accessibilityEventObtain.setPassword(bH.d0());
        accessibilityEventObtain.setEnabled(bH.W());
        accessibilityEventObtain.setChecked(bH.T());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(bH.s());
        D.c(accessibilityEventObtain, this.f15098i, i10);
        accessibilityEventObtain.setPackageName(this.f15098i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f15098i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private B t(int i10) {
        B bK0 = B.k0();
        bK0.H0(true);
        bK0.J0(true);
        bK0.z0("android.view.View");
        Rect rect = f15090n;
        bK0.v0(rect);
        bK0.w0(rect);
        bK0.W0(this.f15098i);
        N(i10, bK0);
        if (bK0.K() == null && bK0.w() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bK0.m(this.f15094e);
        if (this.f15094e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = bK0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        bK0.U0(this.f15098i.getContext().getPackageName());
        bK0.g1(this.f15098i, i10);
        if (this.f15100k == i10) {
            bK0.s0(true);
            bK0.a(128);
        } else {
            bK0.s0(false);
            bK0.a(64);
        }
        boolean z10 = this.f15101l == i10;
        if (z10) {
            bK0.a(2);
        } else if (bK0.Y()) {
            bK0.a(1);
        }
        bK0.K0(z10);
        this.f15098i.getLocationOnScreen(this.f15096g);
        bK0.n(this.f15093d);
        if (this.f15093d.equals(rect)) {
            bK0.m(this.f15093d);
            if (bK0.f11189b != -1) {
                B bK02 = B.k0();
                for (int i11 = bK0.f11189b; i11 != -1; i11 = bK02.f11189b) {
                    bK02.X0(this.f15098i, -1);
                    bK02.v0(f15090n);
                    N(i11, bK02);
                    bK02.m(this.f15094e);
                    Rect rect2 = this.f15093d;
                    Rect rect3 = this.f15094e;
                    rect2.offset(rect3.left, rect3.top);
                }
                bK02.o0();
            }
            this.f15093d.offset(this.f15096g[0] - this.f15098i.getScrollX(), this.f15096g[1] - this.f15098i.getScrollY());
        }
        if (this.f15098i.getLocalVisibleRect(this.f15095f)) {
            this.f15095f.offset(this.f15096g[0] - this.f15098i.getScrollX(), this.f15096g[1] - this.f15098i.getScrollY());
            if (this.f15093d.intersect(this.f15095f)) {
                bK0.w0(this.f15093d);
                if (E(this.f15093d)) {
                    bK0.q1(true);
                }
            }
        }
        return bK0;
    }

    private B u() {
        B bM0 = B.m0(this.f15098i);
        AbstractC2747a0.X(this.f15098i, bM0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (bM0.r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bM0.d(this.f15098i, ((Integer) arrayList.get(i10)).intValue());
        }
        return bM0;
    }

    private j0 y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        j0 j0Var = new j0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j0Var.j(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return j0Var;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f15101l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List list);

    B H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f15101l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected abstract void N(int i10, B b10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f15098i.isFocused() && !this.f15098i.requestFocus()) || (i11 = this.f15101l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f15101l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f15097h.isEnabled() || (parent = this.f15098i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f15098i, q(i10, i11));
    }

    @Override // androidx.core.view.C2746a
    public C b(View view) {
        if (this.f15099j == null) {
            this.f15099j = new c();
        }
        return this.f15099j;
    }

    @Override // androidx.core.view.C2746a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.C2746a
    public void g(View view, B b10) {
        super.g(view, b10);
        M(b10);
    }

    public final boolean o(int i10) {
        if (this.f15101l != i10) {
            return false;
        }
        this.f15101l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f15097h.isEnabled() && this.f15097h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f15102m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.G(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.G(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.w(android.view.KeyEvent):boolean");
    }

    public final int x() {
        return this.f15100k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void M(B b10) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void O(int i10, boolean z10) {
    }
}
