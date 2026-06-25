package Qa;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f14756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f14758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f14761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f14762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f14763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f14764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f14765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f14766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f14767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f14768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f14769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f14773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f14774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f14775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private GestureDetector f14777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f14778x;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f14774t = motionEvent.getX();
            y.this.f14775u = motionEvent.getY();
            y.this.f14776v = 1;
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        boolean a(y yVar);

        boolean b(y yVar);

        void c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, null);
    }

    private boolean j() {
        return this.f14776v != 0;
    }

    public float d() {
        return this.f14761g;
    }

    public float e() {
        return this.f14757c;
    }

    public float f() {
        return this.f14758d;
    }

    public float g() {
        if (!j()) {
            float f10 = this.f14762h;
            if (f10 > 0.0f) {
                return this.f14761g / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.f14778x;
        boolean z11 = (z10 && this.f14761g < this.f14762h) || (!z10 && this.f14761g > this.f14762h);
        float fAbs = Math.abs(1.0f - (this.f14761g / this.f14762h)) * 0.5f;
        if (this.f14762h <= this.f14771q) {
            return 1.0f;
        }
        return z11 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    public long h() {
        return this.f14768n - this.f14769o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f10;
        float f11;
        this.f14768n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f14759e) {
            this.f14777w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f14776v == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f14770p) {
                this.f14756b.c(this);
                this.f14770p = false;
                this.f14763i = 0.0f;
                this.f14776v = 0;
            } else if (j() && z12) {
                this.f14770p = false;
                this.f14763i = 0.0f;
                this.f14776v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f14770p && this.f14760f && !j() && !z12 && z10) {
            this.f14774t = motionEvent.getX();
            this.f14775u = motionEvent.getY();
            this.f14776v = 2;
            this.f14763i = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f11 = this.f14774t;
            f10 = this.f14775u;
            if (motionEvent.getY() < f10) {
                this.f14778x = true;
            } else {
                this.f14778x = false;
            }
        } else {
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += motionEvent.getX(i11);
                    y10 += motionEvent.getY(i11);
                }
            }
            float f12 = i10;
            float f13 = x10 / f12;
            f10 = y10 / f12;
            f11 = f13;
        }
        float fAbs2 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                fAbs += Math.abs(motionEvent.getX(i12) - f11);
                fAbs2 += Math.abs(motionEvent.getY(i12) - f10);
            }
        }
        float f14 = i10;
        float f15 = (fAbs / f14) * 2.0f;
        float f16 = (fAbs2 / f14) * 2.0f;
        float fHypot = j() ? f16 : (float) Math.hypot(f15, f16);
        boolean z15 = this.f14770p;
        this.f14757c = f11;
        this.f14758d = f10;
        if (!j() && this.f14770p && (fHypot < this.f14772r || z13)) {
            this.f14756b.c(this);
            this.f14770p = false;
            this.f14763i = fHypot;
        }
        if (z13) {
            this.f14764j = f15;
            this.f14766l = f15;
            this.f14765k = f16;
            this.f14767m = f16;
            this.f14761g = fHypot;
            this.f14762h = fHypot;
            this.f14763i = fHypot;
        }
        int i13 = j() ? this.f14771q : this.f14772r;
        if (!this.f14770p && fHypot >= i13 && (z15 || Math.abs(fHypot - this.f14763i) > this.f14771q)) {
            this.f14764j = f15;
            this.f14766l = f15;
            this.f14765k = f16;
            this.f14767m = f16;
            this.f14761g = fHypot;
            this.f14762h = fHypot;
            this.f14769o = this.f14768n;
            this.f14770p = this.f14756b.a(this);
        }
        if (actionMasked == 2) {
            this.f14764j = f15;
            this.f14765k = f16;
            this.f14761g = fHypot;
            if (this.f14770p ? this.f14756b.b(this) : true) {
                this.f14766l = this.f14764j;
                this.f14767m = this.f14765k;
                this.f14762h = this.f14761g;
                this.f14769o = this.f14768n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f14759e = z10;
        if (z10 && this.f14777w == null) {
            this.f14777w = new GestureDetector(this.f14755a, new a(), this.f14773s);
        }
    }

    public void m(boolean z10) {
        this.f14760f = z10;
    }

    public y(Context context, b bVar, Handler handler) {
        this.f14776v = 0;
        this.f14755a = context;
        this.f14756b = bVar;
        this.f14771q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f14772r = 0;
        this.f14773s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }
}
