package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.C2924b;
import androidx.media3.ui.G;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: androidx.media3.ui.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2924b extends View implements G {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f31389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f31390B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f31391C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f31392D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ValueAnimator f31393E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f31394F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f31395G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f31396H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f31397I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f31398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f31399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f31400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f31401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f31402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f31403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f31404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f31405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f31406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f31407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f31408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f31409l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f31410l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f31411m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f31412m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f31413n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f31414n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f31415o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f31416o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f31417p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long[] f31418p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f31419q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean[] f31420q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f31421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f31422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f31423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f31424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f31425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f31426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet f31427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f31428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f31429z;

    public C2924b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f31398a = new Rect();
        this.f31399b = new Rect();
        this.f31400c = new Rect();
        this.f31401d = new Rect();
        Paint paint = new Paint();
        this.f31402e = paint;
        Paint paint2 = new Paint();
        this.f31403f = paint2;
        Paint paint3 = new Paint();
        this.f31404g = paint3;
        Paint paint4 = new Paint();
        this.f31405h = paint4;
        Paint paint5 = new Paint();
        this.f31406i = paint5;
        Paint paint6 = new Paint();
        this.f31407j = paint6;
        paint6.setAntiAlias(true);
        this.f31427x = new CopyOnWriteArraySet();
        this.f31428y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f31429z = f10;
        this.f31423t = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, G3.D.f7092e, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(G3.D.f7114p);
                this.f31408k = drawable;
                if (drawable != null) {
                    o(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f31409l = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7100i, iE);
                this.f31411m = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7118r, iE2);
                this.f31413n = typedArrayObtainStyledAttributes.getInt(G3.D.f7098h, 0);
                this.f31415o = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7096g, iE3);
                this.f31417p = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7116q, iE4);
                this.f31419q = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7110n, iE5);
                this.f31421r = typedArrayObtainStyledAttributes.getDimensionPixelSize(G3.D.f7112o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(G3.D.f7106l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(G3.D.f7108m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(G3.D.f7102j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(G3.D.f7120s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(G3.D.f7094f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(G3.D.f7104k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f31409l = iE;
            this.f31411m = iE2;
            this.f31413n = 0;
            this.f31415o = iE3;
            this.f31417p = iE4;
            this.f31419q = iE5;
            this.f31421r = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f31408k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f31424u = sb2;
        this.f31425v = new Formatter(sb2, Locale.getDefault());
        this.f31426w = new Runnable() { // from class: G3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f7136a.u(false);
            }
        };
        Drawable drawable2 = this.f31408k;
        if (drawable2 != null) {
            this.f31422s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f31422s = (Math.max(this.f31419q, Math.max(this.f31417p, this.f31421r)) + 1) / 2;
        }
        this.f31394F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f31393E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: G3.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C2924b.c(this.f7137a, valueAnimator2);
            }
        });
        this.f31410l0 = -9223372036854775807L;
        this.f31390B = -9223372036854775807L;
        this.f31389A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ void c(C2924b c2924b, ValueAnimator valueAnimator) {
        c2924b.getClass();
        c2924b.f31394F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c2924b.invalidate(c2924b.f31398a);
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        if (this.f31410l0 <= 0) {
            return;
        }
        Rect rect = this.f31401d;
        int iR = a0.r(rect.right, rect.left, this.f31399b.right);
        int iCenterY = this.f31401d.centerY();
        if (this.f31408k == null) {
            canvas.drawCircle(iR, iCenterY, (int) ((((this.f31396H || isFocused()) ? this.f31421r : isEnabled() ? this.f31417p : this.f31419q) * this.f31394F) / 2.0f), this.f31407j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f31394F)) / 2;
        int intrinsicHeight = ((int) (this.f31408k.getIntrinsicHeight() * this.f31394F)) / 2;
        this.f31408k.setBounds(iR - intrinsicWidth, iCenterY - intrinsicHeight, iR + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f31408k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f31399b.height();
        int iCenterY = this.f31399b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.f31410l0 <= 0) {
            Rect rect = this.f31399b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f31404g);
            return;
        }
        Rect rect2 = this.f31400c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f31399b.left, i12), this.f31401d.right);
        int i13 = this.f31399b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f31404g);
        }
        int iMax2 = Math.max(i11, this.f31401d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f31403f);
        }
        if (this.f31401d.width() > 0) {
            Rect rect3 = this.f31401d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f31402e);
        }
        if (this.f31416o0 == 0) {
            return;
        }
        long[] jArr = (long[]) AbstractC6614a.e(this.f31418p0);
        boolean[] zArr = (boolean[]) AbstractC6614a.e(this.f31420q0);
        int i14 = this.f31415o / 2;
        for (int i15 = 0; i15 < this.f31416o0; i15++) {
            int iWidth = ((int) ((((long) this.f31399b.width()) * a0.s(jArr[i15], 0L, this.f31410l0)) / this.f31410l0)) - i14;
            Rect rect4 = this.f31399b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f31415o, Math.max(0, iWidth)), iCenterY, r10 + this.f31415o, i10, zArr[i15] ? this.f31406i : this.f31405h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f31390B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f31410l0;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.f31389A);
    }

    private String getProgressText() {
        return a0.s0(this.f31424u, this.f31425v, this.f31412m0);
    }

    private long getScrubberPosition() {
        if (this.f31399b.width() <= 0 || this.f31410l0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f31401d.width()) * this.f31410l0) / ((long) this.f31399b.width());
    }

    private boolean j(float f10, float f11) {
        return this.f31398a.contains((int) f10, (int) f11);
    }

    private void k(float f10) {
        Rect rect = this.f31401d;
        Rect rect2 = this.f31399b;
        rect.right = a0.r((int) f10, rect2.left, rect2.right);
    }

    private static int l(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point m(MotionEvent motionEvent) {
        this.f31428y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f31428y;
    }

    private boolean n(long j10) {
        long j11 = this.f31410l0;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f31396H ? this.f31397I : this.f31412m0;
        long jS = a0.s(j12 + j10, 0L, j11);
        if (jS == j12) {
            return false;
        }
        if (this.f31396H) {
            x(jS);
        } else {
            t(jS);
        }
        v();
        return true;
    }

    private boolean o(Drawable drawable) {
        return p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    private void q(int i10, int i11) {
        Rect rect = this.f31392D;
        if (rect != null && rect.width() == i10 && this.f31392D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f31392D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void t(long j10) {
        this.f31397I = j10;
        this.f31396H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f31427x.iterator();
        while (it.hasNext()) {
            ((G.a) it.next()).G(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z10) {
        removeCallbacks(this.f31426w);
        this.f31396H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f31427x.iterator();
        while (it.hasNext()) {
            ((G.a) it.next()).O(this, this.f31397I, z10);
        }
    }

    private void v() {
        this.f31400c.set(this.f31399b);
        this.f31401d.set(this.f31399b);
        long j10 = this.f31396H ? this.f31397I : this.f31412m0;
        if (this.f31410l0 > 0) {
            int iWidth = (int) ((((long) this.f31399b.width()) * this.f31414n0) / this.f31410l0);
            Rect rect = this.f31400c;
            Rect rect2 = this.f31399b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f31399b.width()) * j10) / this.f31410l0);
            Rect rect3 = this.f31401d;
            Rect rect4 = this.f31399b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f31400c;
            int i10 = this.f31399b.left;
            rect5.right = i10;
            this.f31401d.right = i10;
        }
        invalidate(this.f31398a);
    }

    private void w() {
        Drawable drawable = this.f31408k;
        if (drawable != null && drawable.isStateful() && this.f31408k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void x(long j10) {
        if (this.f31397I == j10) {
            return;
        }
        this.f31397I = j10;
        Iterator it = this.f31427x.iterator();
        while (it.hasNext()) {
            ((G.a) it.next()).K(this, j10);
        }
    }

    @Override // androidx.media3.ui.G
    public void a(G.a aVar) {
        AbstractC6614a.e(aVar);
        this.f31427x.add(aVar);
    }

    @Override // androidx.media3.ui.G
    public void b(long[] jArr, boolean[] zArr, int i10) {
        AbstractC6614a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f31416o0 = i10;
        this.f31418p0 = jArr;
        this.f31420q0 = zArr;
        v();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    @Override // androidx.media3.ui.G
    public long getPreferredUpdateDelay() {
        int iL = l(this.f31429z, this.f31399b.width());
        if (iL == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.f31410l0;
        if (j10 == 0 || j10 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j10 / ((long) iL);
    }

    public void h(long j10) {
        if (this.f31393E.isStarted()) {
            this.f31393E.cancel();
        }
        this.f31393E.setFloatValues(this.f31394F, 0.0f);
        this.f31393E.setDuration(j10);
        this.f31393E.start();
    }

    public void i(boolean z10) {
        if (this.f31393E.isStarted()) {
            this.f31393E.cancel();
        }
        this.f31395G = z10;
        this.f31394F = 0.0f;
        invalidate(this.f31398a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f31408k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f31396H || z10) {
            return;
        }
        u(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f31410l0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f31426w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f31426w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f31396H
            if (r0 == 0) goto L30
            r5 = 0
            r4.u(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2924b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f31395G ? 0 : this.f31422s;
        if (this.f31413n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f31411m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f31409l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f31411m) / 2;
            iMax = (i15 - this.f31409l) / 2;
        }
        this.f31398a.set(paddingLeft, paddingBottom, paddingRight, this.f31411m + paddingBottom);
        Rect rect = this.f31399b;
        Rect rect2 = this.f31398a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f31409l + iMax);
        if (Build.VERSION.SDK_INT >= 29) {
            q(i14, i15);
        }
        v();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f31411m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f31411m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f31408k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f31410l0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f31396H
            if (r8 == 0) goto L76
            int r8 = r7.f31423t
            if (r0 >= r8) goto L3a
            int r8 = r7.f31391C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.f31391C = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
            r7.v()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f31396H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.u(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L76
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.t(r0)
            r7.v()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2924b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f31410l0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (n(-getPositionIncrement())) {
                u(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (n(getPositionIncrement())) {
                u(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void r() {
        if (this.f31393E.isStarted()) {
            this.f31393E.cancel();
        }
        this.f31395G = false;
        this.f31394F = 1.0f;
        invalidate(this.f31398a);
    }

    public void s(long j10) {
        if (this.f31393E.isStarted()) {
            this.f31393E.cancel();
        }
        this.f31395G = false;
        this.f31393E.setFloatValues(this.f31394F, 1.0f);
        this.f31393E.setDuration(j10);
        this.f31393E.start();
    }

    public void setAdMarkerColor(int i10) {
        this.f31405h.setColor(i10);
        invalidate(this.f31398a);
    }

    public void setBufferedColor(int i10) {
        this.f31403f.setColor(i10);
        invalidate(this.f31398a);
    }

    @Override // androidx.media3.ui.G
    public void setBufferedPosition(long j10) {
        if (this.f31414n0 == j10) {
            return;
        }
        this.f31414n0 = j10;
        v();
    }

    @Override // androidx.media3.ui.G
    public void setDuration(long j10) {
        if (this.f31410l0 == j10) {
            return;
        }
        this.f31410l0 = j10;
        if (this.f31396H && j10 == -9223372036854775807L) {
            u(true);
        }
        v();
    }

    @Override // android.view.View, androidx.media3.ui.G
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f31396H || z10) {
            return;
        }
        u(true);
    }

    public void setKeyCountIncrement(int i10) {
        AbstractC6614a.a(i10 > 0);
        this.f31389A = i10;
        this.f31390B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        AbstractC6614a.a(j10 > 0);
        this.f31389A = -1;
        this.f31390B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f31406i.setColor(i10);
        invalidate(this.f31398a);
    }

    public void setPlayedColor(int i10) {
        this.f31402e.setColor(i10);
        invalidate(this.f31398a);
    }

    @Override // androidx.media3.ui.G
    public void setPosition(long j10) {
        if (this.f31412m0 == j10) {
            return;
        }
        this.f31412m0 = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(int i10) {
        this.f31407j.setColor(i10);
        invalidate(this.f31398a);
    }

    public void setUnplayedColor(int i10) {
        this.f31404g.setColor(i10);
        invalidate(this.f31398a);
    }
}
