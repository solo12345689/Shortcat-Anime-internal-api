package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import n.InterfaceC5708e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f25037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f25038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f25039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f25042i = new int[2];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f25037d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.e();
        }
    }

    public S(View view) {
        this.f25037d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f25034a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f25035b = tapTimeout;
        this.f25036c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f25039f;
        if (runnable != null) {
            this.f25037d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f25038e;
        if (runnable2 != null) {
            this.f25037d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        P p10;
        View view = this.f25037d;
        InterfaceC5708e interfaceC5708eB = b();
        if (interfaceC5708eB != null && interfaceC5708eB.b() && (p10 = (P) interfaceC5708eB.o()) != null && p10.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(p10, motionEventObtainNoHistory);
            boolean zE = p10.e(motionEventObtainNoHistory, this.f25041h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f25037d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f25041h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f25034a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f25041h = r6
            java.lang.Runnable r6 = r5.f25038e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.S$a r6 = new androidx.appcompat.widget.S$a
            r6.<init>()
            r5.f25038e = r6
        L52:
            java.lang.Runnable r6 = r5.f25038e
            int r1 = r5.f25035b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f25039f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.S$b r6 = new androidx.appcompat.widget.S$b
            r6.<init>()
            r5.f25039f = r6
        L65:
            java.lang.Runnable r6 = r5.f25039f
            int r1 = r5.f25036c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.S.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f25042i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f25042i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract InterfaceC5708e b();

    protected abstract boolean c();

    protected boolean d() {
        InterfaceC5708e interfaceC5708eB = b();
        if (interfaceC5708eB == null || !interfaceC5708eB.b()) {
            return true;
        }
        interfaceC5708eB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f25037d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f25040g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f25040g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f25037d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f25040g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f25040g = false;
        this.f25041h = -1;
        Runnable runnable = this.f25038e;
        if (runnable != null) {
            this.f25037d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
