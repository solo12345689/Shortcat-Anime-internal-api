package R1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2747a0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f15108x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15110b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f15112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f15113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f15114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f15115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f15116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f15117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f15118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f15120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f15121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f15122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f15124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f15126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC0259c f15127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f15128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15129u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f15130v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15111c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f15131w = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0259c abstractC0259c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0259c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f15130v = viewGroup;
        this.f15127s = abstractC0259c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f15124p = i10;
        this.f15123o = i10;
        this.f15110b = viewConfiguration.getScaledTouchSlop();
        this.f15121m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f15122n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15126r = new OverScroller(context, f15108x);
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f15120l.computeCurrentVelocity(1000, this.f15121m);
        p(g(this.f15120l.getXVelocity(this.f15111c), this.f15122n, this.f15121m), g(this.f15120l.getYVelocity(this.f15111c), this.f15122n, this.f15121m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [R1.c$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H(float f10, float f11, int i10) {
        boolean zC = c(f10, f11, i10, 1);
        ?? r02 = zC;
        if (c(f11, f10, i10, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f10, f11, i10, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f11, f10, i10, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f15117i;
            iArr[i10] = iArr[i10] | r04;
            this.f15127s.f(r04, i10);
        }
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f15112d;
        this.f15114f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f15113e;
        this.f15115g[i10] = f11;
        fArr2[i10] = f11;
        this.f15116h[i10] = y((int) f10, (int) f11);
        this.f15119k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f15114f[pointerId] = x10;
                this.f15115g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f15116h[i10] & i11) == i11 && (this.f15125q & i11) != 0 && (this.f15118j[i10] & i11) != i11 && (this.f15117i[i10] & i11) != i11) {
            int i12 = this.f15110b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f15127s.g(i11)) {
                    int[] iArr = this.f15118j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f15117i[i10] & i11) == 0 && fAbs > this.f15110b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f15127s.d(view) > 0;
        boolean z11 = this.f15127s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f15110b) : z11 && Math.abs(f11) > ((float) this.f15110b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f15110b;
        return f12 > ((float) (i10 * i10));
    }

    private float g(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int h(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void i() {
        float[] fArr = this.f15112d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f15113e, 0.0f);
        Arrays.fill(this.f15114f, 0.0f);
        Arrays.fill(this.f15115g, 0.0f);
        Arrays.fill(this.f15116h, 0);
        Arrays.fill(this.f15117i, 0);
        Arrays.fill(this.f15118j, 0);
        this.f15119k = 0;
    }

    private void j(int i10) {
        if (this.f15112d == null || !C(i10)) {
            return;
        }
        this.f15112d[i10] = 0.0f;
        this.f15113e[i10] = 0.0f;
        this.f15114f[i10] = 0.0f;
        this.f15115g[i10] = 0.0f;
        this.f15116h[i10] = 0;
        this.f15117i[i10] = 0;
        this.f15118j[i10] = 0;
        this.f15119k = (~(1 << i10)) & this.f15119k;
    }

    private int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f15130v.getWidth();
        float f10 = width / 2;
        float fQ = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iH = h(i12, (int) this.f15122n, (int) this.f15121m);
        int iH2 = h(i13, (int) this.f15122n, (int) this.f15121m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iH != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iH2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((k(i10, iH, this.f15127s.d(view)) * f14) + (k(i11, iH2, this.f15127s.e(view)) * (f12 / f13)));
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0259c abstractC0259c) {
        c cVarO = o(viewGroup, abstractC0259c);
        cVarO.f15110b = (int) (cVarO.f15110b * (1.0f / f10));
        return cVarO;
    }

    public static c o(ViewGroup viewGroup, AbstractC0259c abstractC0259c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0259c);
    }

    private void p(float f10, float f11) {
        this.f15129u = true;
        this.f15127s.l(this.f15128t, f10, f11);
        this.f15129u = false;
        if (this.f15109a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f15128t.getLeft();
        int top = this.f15128t.getTop();
        if (i12 != 0) {
            i10 = this.f15127s.a(this.f15128t, i10, i12);
            AbstractC2747a0.U(this.f15128t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f15127s.b(this.f15128t, i11, i13);
            AbstractC2747a0.V(this.f15128t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f15127s.k(this.f15128t, i14, i15, i14 - left, i15 - top);
    }

    private void s(int i10) {
        float[] fArr = this.f15112d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f15113e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f15114f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f15115g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f15116h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f15117i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f15118j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f15112d = fArr2;
            this.f15113e = fArr3;
            this.f15114f = fArr4;
            this.f15115g = fArr5;
            this.f15116h = iArr;
            this.f15117i = iArr2;
            this.f15118j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f15128t.getLeft();
        int top = this.f15128t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f15126r.abortAnimation();
            K(0);
            return false;
        }
        this.f15126r.startScroll(left, top, i14, i15, l(this.f15128t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f15130v.getLeft() + this.f15123o ? 1 : 0;
        if (i11 < this.f15130v.getTop() + this.f15123o) {
            i12 |= 4;
        }
        if (i10 > this.f15130v.getRight() - this.f15123o) {
            i12 |= 2;
        }
        return i11 > this.f15130v.getBottom() - this.f15123o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f15109a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f15128t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f15119k) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f15120l == null) {
            this.f15120l = VelocityTracker.obtain();
        }
        this.f15120l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x10, (int) y10);
            I(x10, y10, pointerId);
            R(viewT, pointerId);
            int i12 = this.f15116h[pointerId];
            int i13 = this.f15125q;
            if ((i12 & i13) != 0) {
                this.f15127s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f15109a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f15109a == 1) {
                if (D(this.f15111c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f15111c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f15114f;
                    int i14 = this.f15111c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f15115g[i14]);
                    r(this.f15128t.getLeft() + i15, this.f15128t.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f15112d[pointerId2];
                    float f11 = y12 - this.f15113e[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f15109a != 1) {
                        View viewT2 = t((int) x12, (int) y12);
                        if (f(viewT2, f10, f11) && R(viewT2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f15109a == 1) {
                p(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            I(x13, y13, pointerId3);
            if (this.f15109a != 0) {
                if (B((int) x13, (int) y13)) {
                    R(this.f15128t, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x13, (int) y13), pointerId3);
                int i17 = this.f15116h[pointerId3];
                int i18 = this.f15125q;
                if ((i17 & i18) != 0) {
                    this.f15127s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f15109a == 1 && pointerId4 == this.f15111c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f15111c) {
                    View viewT3 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f15128t;
                    if (viewT3 == view && R(view, pointerId5)) {
                        i10 = this.f15111c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    void K(int i10) {
        this.f15130v.removeCallbacks(this.f15131w);
        if (this.f15109a != i10) {
            this.f15109a = i10;
            this.f15127s.j(i10);
            if (this.f15109a == 0) {
                this.f15128t = null;
            }
        }
    }

    public void L(int i10) {
        this.f15123o = i10;
    }

    public void M(int i10) {
        this.f15125q = i10;
    }

    public void N(float f10) {
        this.f15122n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f15129u) {
            return u(i10, i11, (int) this.f15120l.getXVelocity(this.f15111c), (int) this.f15120l.getYVelocity(this.f15111c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean P(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i10, int i11) {
        this.f15128t = view;
        this.f15111c = -1;
        boolean zU = u(i10, i11, 0, 0);
        if (!zU && this.f15109a == 0 && this.f15128t != null) {
            this.f15128t = null;
        }
        return zU;
    }

    boolean R(View view, int i10) {
        if (view == this.f15128t && this.f15111c == i10) {
            return true;
        }
        if (view == null || !this.f15127s.m(view, i10)) {
            return false;
        }
        this.f15111c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f15111c = -1;
        i();
        VelocityTracker velocityTracker = this.f15120l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15120l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f15130v) {
            this.f15128t = view;
            this.f15111c = i10;
            this.f15127s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f15130v + ")");
    }

    public boolean d(int i10) {
        int length = this.f15112d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f15114f[i11] - this.f15112d[i11];
        float f11 = this.f15115g[i11] - this.f15113e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f15110b) : z11 && Math.abs(f11) > ((float) this.f15110b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i12 = this.f15110b;
        return f12 > ((float) (i12 * i12));
    }

    public boolean m(boolean z10) {
        if (this.f15109a == 2) {
            boolean zComputeScrollOffset = this.f15126r.computeScrollOffset();
            int currX = this.f15126r.getCurrX();
            int currY = this.f15126r.getCurrY();
            int left = currX - this.f15128t.getLeft();
            int top = currY - this.f15128t.getTop();
            if (left != 0) {
                AbstractC2747a0.U(this.f15128t, left);
            }
            if (top != 0) {
                AbstractC2747a0.V(this.f15128t, top);
            }
            if (left != 0 || top != 0) {
                this.f15127s.k(this.f15128t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f15126r.getFinalX() && currY == this.f15126r.getFinalY()) {
                this.f15126r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f15130v.post(this.f15131w);
                } else {
                    K(0);
                }
            }
        }
        return this.f15109a == 2;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f15130v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f15130v.getChildAt(this.f15127s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f15128t;
    }

    public int w() {
        return this.f15124p;
    }

    public int x() {
        return this.f15123o;
    }

    public int z() {
        return this.f15110b;
    }

    /* JADX INFO: renamed from: R1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0259c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
