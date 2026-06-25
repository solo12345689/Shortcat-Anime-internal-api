package Qa;

import Qa.AbstractC2081d;
import Qa.C;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Qa.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079b extends AbstractC2081d {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final a f14561W = new a(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final double f14562X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final double f14563Y;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Handler f14568S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f14569T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private VelocityTracker f14571V;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14564O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f14565P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final long f14566Q = 800;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final long f14567R = 2000;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Runnable f14570U = new Runnable() { // from class: Qa.a
        @Override // java.lang.Runnable
        public final void run() {
            C2079b.X0(this.f14560a);
        }
    };

    /* JADX INFO: renamed from: Qa.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Qa.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0244b extends AbstractC2081d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14572d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f14573b = C2079b.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14574c = "FlingGestureHandler";

        /* JADX INFO: renamed from: Qa.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14574c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14573b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2079b a(Context context) {
            return new C2079b();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ra.a c(C2079b handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.a(handler);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(C2079b handler, ReadableMap config) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfPointers")) {
                handler.Z0(config.getInt("numberOfPointers"));
            }
            if (config.hasKey("direction")) {
                handler.Y0(config.getInt("direction"));
            }
        }
    }

    static {
        k kVar = k.f14643a;
        f14562X = kVar.a(30.0d);
        f14563Y = kVar.a(60.0d);
    }

    private final void V0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        AbstractC5504s.e(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void W0(MotionEvent motionEvent) {
        if (b1(motionEvent)) {
            return;
        }
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(C2079b c2079b) {
        c2079b.D();
    }

    private final void a1(MotionEvent motionEvent) {
        this.f14571V = VelocityTracker.obtain();
        p();
        this.f14569T = 1;
        Handler handler = this.f14568S;
        if (handler == null) {
            this.f14568S = new Handler(Looper.getMainLooper());
        } else {
            AbstractC5504s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f14568S;
        AbstractC5504s.e(handler2);
        handler2.postDelayed(this.f14570U, this.f14566Q);
    }

    private final boolean b1(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        V0(this.f14571V, motionEvent);
        C.a aVar = C.f14545f;
        VelocityTracker velocityTracker = this.f14571V;
        AbstractC5504s.e(velocityTracker);
        C cB = aVar.b(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.add(Boolean.valueOf(c1(this, cB, numArr[i10].intValue(), f14562X)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList2.add(Boolean.valueOf(c1(this, cB, numArr2[i11].intValue(), f14563Y)));
        }
        if (arrayList.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (arrayList2.isEmpty()) {
            z11 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        boolean z12 = z10 | z11;
        boolean z13 = cB.k() > ((double) this.f14567R);
        if (this.f14569T != this.f14564O || !z12 || !z13) {
            return false;
        }
        Handler handler = this.f14568S;
        AbstractC5504s.e(handler);
        handler.removeCallbacksAndMessages(null);
        k();
        return true;
    }

    private static final boolean c1(C2079b c2079b, C c10, int i10, double d10) {
        return (c2079b.f14565P & i10) == i10 && c10.l(C.f14545f.a(i10), d10);
    }

    public final void Y0(int i10) {
        this.f14565P = i10;
    }

    public final void Z0(int i10) {
        this.f14564O = i10;
    }

    @Override // Qa.AbstractC2081d
    protected void j0() {
        Handler handler = this.f14568S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Qa.AbstractC2081d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int iS = S();
            if (iS == 0) {
                a1(sourceEvent);
            }
            if (iS == 2) {
                b1(sourceEvent);
                if (sourceEvent.getPointerCount() > this.f14569T) {
                    this.f14569T = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    W0(sourceEvent);
                }
            }
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        VelocityTracker velocityTracker = this.f14571V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f14571V = null;
        Handler handler = this.f14568S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Qa.AbstractC2081d
    public void s0() {
        super.s0();
        this.f14564O = 1;
        this.f14565P = 1;
    }
}
