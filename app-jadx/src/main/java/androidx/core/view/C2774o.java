package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2774o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2776p f29074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f29075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f29076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f29077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f29078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f29082j;

    /* JADX INFO: renamed from: androidx.core.view.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C2774o(Context context, InterfaceC2776p interfaceC2776p) {
        this(context, interfaceC2776p, new b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C2774o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C2774o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C2774o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C2774o.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC2753d0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC2753d0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f29080h == source && this.f29081i == deviceId && this.f29079g == i10) {
            return false;
        }
        this.f29075c.a(this.f29073a, this.f29082j, motionEvent, i10);
        this.f29080h = source;
        this.f29081i = deviceId;
        this.f29079g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f29077e == null) {
            this.f29077e = VelocityTracker.obtain();
        }
        return this.f29076d.a(this.f29077e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        X.a(velocityTracker, motionEvent);
        X.b(velocityTracker, 1000);
        return X.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f29082j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f29077e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f29077e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f29074b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f29078f) && fSignum != 0.0f)) {
            this.f29074b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f29082j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f29078f = this.f29074b.a(fMax) ? fMax : 0.0f;
    }

    C2774o(Context context, InterfaceC2776p interfaceC2776p, b bVar, a aVar) {
        this.f29079g = -1;
        this.f29080h = -1;
        this.f29081i = -1;
        this.f29082j = new int[]{Integer.MAX_VALUE, 0};
        this.f29073a = context;
        this.f29074b = interfaceC2776p;
        this.f29075c = bVar;
        this.f29076d = aVar;
    }
}
