package Qa;

import Pa.g;
import Ud.AbstractC2273n;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* JADX INFO: renamed from: Qa.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2081d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f14576J = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Void f14577K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f14578L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f14579M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static short f14580N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private i f14581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f14582B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private e f14583C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f14584D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14585E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f14586F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f14587G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f14588H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f14589I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f14590a = new int[12];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f14592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f14594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f14596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f14597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WritableArray f14601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WritableArray f14602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0245d[] f14605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f14607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short f14608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f14609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f14610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f14612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f14613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14615z;

    /* JADX INFO: renamed from: Qa.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2081d handler, MotionEvent event, IllegalArgumentException e10) {
            super(Df.r.j("\n    handler: " + O.b(handler.getClass()).v() + "\n    state: " + handler.S() + "\n    view: " + handler.W() + "\n    orchestrator: " + handler.P() + "\n    isEnabled: " + handler.d0() + "\n    isActive: " + handler.Z() + "\n    isAwaiting: " + handler.a0() + "\n    trackedPointersCount: " + handler.f14591b + "\n    trackedPointers: " + AbstractC2273n.x0(handler.f14590a, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + event + "\n      "), e10);
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(event, "event");
            AbstractC5504s.h(e10, "e");
        }
    }

    /* JADX INFO: renamed from: Qa.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int i10) {
            if (AbstractC2081d.f14578L == null) {
                AbstractC2081d.f14578L = new MotionEvent.PointerProperties[12];
                AbstractC2081d.f14579M = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = AbstractC2081d.f14578L;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    AbstractC5504s.u("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = i10 - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = AbstractC2081d.f14578L;
                if (pointerPropertiesArr2 == null) {
                    AbstractC5504s.u("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = AbstractC2081d.f14579M;
                if (pointerCoordsArr2 == null) {
                    AbstractC5504s.u("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                i10--;
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: Qa.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14616a = new a(null);

        /* JADX INFO: renamed from: Qa.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(AbstractC2081d abstractC2081d, ReadableMap readableMap) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float fH = com.facebook.react.uimanager.B.h(readableMap.getDouble("hitSlop"));
                    abstractC2081d.z0(fH, fH, fH, fH, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                AbstractC5504s.e(map);
                float fH2 = map.hasKey("horizontal") ? com.facebook.react.uimanager.B.h(map.getDouble("horizontal")) : Float.NaN;
                float fH3 = fH2;
                float fH4 = map.hasKey("vertical") ? com.facebook.react.uimanager.B.h(map.getDouble("vertical")) : Float.NaN;
                float fH5 = fH4;
                if (map.hasKey("left")) {
                    fH2 = com.facebook.react.uimanager.B.h(map.getDouble("left"));
                }
                float f10 = fH2;
                if (map.hasKey("top")) {
                    fH4 = com.facebook.react.uimanager.B.h(map.getDouble("top"));
                }
                float f11 = fH4;
                if (map.hasKey("right")) {
                    fH3 = com.facebook.react.uimanager.B.h(map.getDouble("right"));
                }
                float f12 = fH3;
                if (map.hasKey("bottom")) {
                    fH5 = com.facebook.react.uimanager.B.h(map.getDouble("bottom"));
                }
                abstractC2081d.z0(f10, f11, f12, fH5, map.hasKey("width") ? com.facebook.react.uimanager.B.h(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? com.facebook.react.uimanager.B.h(map.getDouble("height")) : Float.NaN);
            }

            private a() {
            }
        }

        protected abstract AbstractC2081d a(Context context);

        public final AbstractC2081d b(Context context, int i10) {
            AbstractC2081d abstractC2081dA = a(context);
            abstractC2081dA.I0(i10);
            return abstractC2081dA;
        }

        public abstract Ra.b c(AbstractC2081d abstractC2081d);

        public abstract String d();

        public abstract Class e();

        public void f(AbstractC2081d handler, ReadableMap config) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            handler.s0();
            if (config.hasKey("shouldCancelWhenOutside")) {
                handler.G0(config.getBoolean("shouldCancelWhenOutside"));
            }
            if (config.hasKey("enabled")) {
                handler.y0(config.getBoolean("enabled"));
            }
            if (config.hasKey("hitSlop")) {
                f14616a.b(handler, config);
            }
            if (config.hasKey("needsPointerData")) {
                handler.C0(config.getBoolean("needsPointerData"));
            }
            if (config.hasKey("manualActivation")) {
                handler.f14611v = config.getBoolean("manualActivation");
            }
            if (config.hasKey("mouseButton")) {
                handler.B0(config.getInt("mouseButton"));
            }
        }
    }

    /* JADX INFO: renamed from: Qa.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0245d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f14618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f14619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14621e;

        public C0245d(int i10, float f10, float f11, float f12, float f13) {
            this.f14617a = i10;
            this.f14618b = f10;
            this.f14619c = f11;
            this.f14620d = f12;
            this.f14621e = f13;
        }

        public final float a() {
            return this.f14620d;
        }

        public final float b() {
            return this.f14621e;
        }

        public final int c() {
            return this.f14617a;
        }

        public final float d() {
            return this.f14618b;
        }

        public final float e() {
            return this.f14619c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0245d)) {
                return false;
            }
            C0245d c0245d = (C0245d) obj;
            return this.f14617a == c0245d.f14617a && Float.compare(this.f14618b, c0245d.f14618b) == 0 && Float.compare(this.f14619c, c0245d.f14619c) == 0 && Float.compare(this.f14620d, c0245d.f14620d) == 0 && Float.compare(this.f14621e, c0245d.f14621e) == 0;
        }

        public final void f(float f10) {
            this.f14620d = f10;
        }

        public final void g(float f10) {
            this.f14621e = f10;
        }

        public final void h(float f10) {
            this.f14618b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f14617a) * 31) + Float.hashCode(this.f14618b)) * 31) + Float.hashCode(this.f14619c)) * 31) + Float.hashCode(this.f14620d)) * 31) + Float.hashCode(this.f14621e);
        }

        public final void i(float f10) {
            this.f14619c = f10;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f14617a + ", x=" + this.f14618b + ", y=" + this.f14619c + ", absoluteX=" + this.f14620d + ", absoluteY=" + this.f14621e + ")";
        }
    }

    public AbstractC2081d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.f14592c = iArr;
        this.f14599j = true;
        C0245d[] c0245dArr = new C0245d[12];
        for (int i11 = 0; i11 < 12; i11++) {
            c0245dArr[i11] = null;
        }
        this.f14605p = c0245dArr;
        this.f14584D = 3;
    }

    private final void A(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C();
        this.f14601l = null;
        this.f14603n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f14605p[pointerId] = new C0245d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f14592c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f14592c[1]);
        C0245d c0245d = this.f14605p[pointerId];
        AbstractC5504s.e(c0245d);
        n(c0245d);
        this.f14605p[pointerId] = null;
        this.f14604o--;
        y();
    }

    private final void C() {
        this.f14602m = null;
        for (C0245d c0245d : this.f14605p) {
            if (c0245d != null) {
                o(c0245d);
            }
        }
    }

    private final int E() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f14591b) {
            int i11 = 0;
            while (true) {
                iArr = this.f14590a;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private final void F0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f14584D = i10;
    }

    private final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC2081d abstractC2081d) {
        abstractC2081d.q();
    }

    private final boolean b0(int i10) {
        int i11 = this.f14585E;
        return i11 == 0 ? i10 == 1 : (i10 & i11) != 0;
    }

    private final boolean e0(int i10) {
        return this.f14590a[i10] != -1;
    }

    private final void h0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f14595f == i10) {
            return;
        }
        if (this.f14604o > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
            r();
        }
        int i11 = this.f14595f;
        this.f14595f = i10;
        if (i10 == 4) {
            short s10 = f14580N;
            f14580N = (short) (s10 + 1);
            this.f14608s = s10;
        }
        i iVar = this.f14581A;
        AbstractC5504s.e(iVar);
        iVar.A(this, i10, i11);
        p0(i10, i11);
    }

    private final boolean i0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f14591b) {
            return true;
        }
        int length = this.f14590a.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.f14590a[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.MotionEvent m(android.view.MotionEvent r26) throws Qa.AbstractC2081d.a {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa.AbstractC2081d.m(android.view.MotionEvent):android.view.MotionEvent");
    }

    private final void n(C0245d c0245d) {
        if (this.f14601l == null) {
            this.f14601l = Arguments.createArray();
        }
        WritableArray writableArray = this.f14601l;
        AbstractC5504s.e(writableArray);
        writableArray.pushMap(u(c0245d));
    }

    private final void o(C0245d c0245d) {
        if (this.f14602m == null) {
            this.f14602m = Arguments.createArray();
        }
        WritableArray writableArray = this.f14602m;
        AbstractC5504s.e(writableArray);
        writableArray.pushMap(u(c0245d));
    }

    private final void r() {
        this.f14603n = 4;
        this.f14601l = null;
        C();
        for (C0245d c0245d : this.f14605p) {
            if (c0245d != null) {
                n(c0245d);
            }
        }
        this.f14604o = 0;
        AbstractC2273n.z(this.f14605p, null, 0, 0, 6, null);
        y();
    }

    private final WritableMap u(C0245d c0245d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(DiagnosticsEntry.ID_KEY, c0245d.c());
        writableMapCreateMap.putDouble("x", com.facebook.react.uimanager.B.g(c0245d.d()));
        writableMapCreateMap.putDouble("y", com.facebook.react.uimanager.B.g(c0245d.e()));
        writableMapCreateMap.putDouble("absoluteX", com.facebook.react.uimanager.B.g(c0245d.a()));
        writableMapCreateMap.putDouble("absoluteY", com.facebook.react.uimanager.B.g(c0245d.b()));
        return writableMapCreateMap;
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f14601l = null;
        this.f14603n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f14605p[pointerId] = new C0245d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f14592c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f14592c[1]);
        this.f14604o++;
        C0245d c0245d = this.f14605p[pointerId];
        AbstractC5504s.e(c0245d);
        n(c0245d);
        C();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z10) {
        if (this.f14594e != null && this.f14599j != z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: Qa.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2081d.b(this.f14575a);
                }
            });
        }
        this.f14599j = z10;
    }

    private final void z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f14601l = null;
        this.f14603n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            C0245d c0245d = this.f14605p[motionEvent.getPointerId(i11)];
            if (c0245d != null && (c0245d.d() != motionEvent.getX(i11) || c0245d.e() != motionEvent.getY(i11))) {
                c0245d.h(motionEvent.getX(i11));
                c0245d.i(motionEvent.getY(i11));
                c0245d.f((motionEvent2.getX(i11) + rawX) - this.f14592c[0]);
                c0245d.g((motionEvent2.getY(i11) + rawY) - this.f14592c[1]);
                n(c0245d);
                i10++;
            }
        }
        if (i10 > 0) {
            C();
            y();
        }
    }

    public final void A0(e eVar) {
        this.f14583C = eVar;
    }

    public final void B() {
        int i10 = this.f14595f;
        if (i10 == 2 || i10 == 4) {
            h0(5);
        }
    }

    protected final void B0(int i10) {
        this.f14585E = i10;
    }

    public final void C0(boolean z10) {
        this.f14606q = z10;
    }

    public final void D() {
        int i10 = this.f14595f;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            k0();
            h0(1);
        }
    }

    protected final void D0(int i10) {
        this.f14614y = i10;
    }

    public final void E0(r rVar) {
        this.f14582B = rVar;
    }

    public final int F() {
        return this.f14600k;
    }

    public final int G() {
        return this.f14586F;
    }

    protected final void G0(boolean z10) {
        this.f14615z = z10;
    }

    public final void H0(boolean z10) {
        this.f14589I = z10;
    }

    public final short I() {
        return this.f14608s;
    }

    public final void I0(int i10) {
        this.f14593d = i10;
    }

    public final float J() {
        return (this.f14609t + this.f14612w) - this.f14592c[0];
    }

    protected final boolean J0(MotionEvent sourceEvent) {
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || b0(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !b0(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float K() {
        return (this.f14610u + this.f14613x) - this.f14592c[1];
    }

    public boolean K0(AbstractC2081d handler) {
        e eVar;
        AbstractC5504s.h(handler, "handler");
        if (handler == this || (eVar = this.f14583C) == null) {
            return false;
        }
        return eVar.b(this, handler);
    }

    public final float L() {
        return this.f14609t;
    }

    public boolean L0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        if (handler == this) {
            return true;
        }
        e eVar = this.f14583C;
        if (eVar != null) {
            return eVar.c(this, handler);
        }
        return false;
    }

    public final float M() {
        return this.f14610u;
    }

    public boolean M0(AbstractC2081d handler) {
        e eVar;
        AbstractC5504s.h(handler, "handler");
        if (handler == this || (eVar = this.f14583C) == null) {
            return false;
        }
        return eVar.d(this, handler);
    }

    public final boolean N() {
        return this.f14606q;
    }

    public final boolean N0(AbstractC2081d handler) {
        e eVar;
        AbstractC5504s.h(handler, "handler");
        if (handler == this || (eVar = this.f14583C) == null) {
            return false;
        }
        return eVar.a(this, handler);
    }

    public final int O() {
        return this.f14614y;
    }

    public final void O0(int i10) {
        if (e0(i10)) {
            return;
        }
        this.f14590a[i10] = E();
        this.f14591b++;
    }

    protected final i P() {
        return this.f14581A;
    }

    public final void P0(int i10) {
        if (e0(i10)) {
            this.f14590a[i10] = -1;
            this.f14591b--;
        }
    }

    public final int Q() {
        return this.f14584D;
    }

    protected final PointF Q0(PointF point) {
        PointF pointFL;
        AbstractC5504s.h(point, "point");
        i iVar = this.f14581A;
        if (iVar != null && (pointFL = iVar.L(this.f14594e, point)) != null) {
            return pointFL;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final boolean R() {
        return this.f14589I;
    }

    public final void R0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            x(event, sourceEvent);
            z(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            z(event, sourceEvent);
            A(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            z(event, sourceEvent);
        }
    }

    public final int S() {
        return this.f14595f;
    }

    public final boolean S0(MotionEvent event) {
        int i10;
        AbstractC5504s.h(event, "event");
        return (!this.f14599j || (i10 = this.f14595f) == 1 || i10 == 3 || i10 == 5 || !e0(event.getPointerId(event.getActionIndex()))) ? false : true;
    }

    public final int T() {
        return this.f14593d;
    }

    public final void T0(InterfaceC5082a closure) {
        AbstractC5504s.h(closure, "closure");
        this.f14598i = true;
        closure.invoke();
        this.f14598i = false;
    }

    public final int U() {
        return this.f14603n;
    }

    public final int V() {
        return this.f14604o;
    }

    public final View W() {
        return this.f14594e;
    }

    public final void X(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i10;
        AbstractC5504s.h(transformedEvent, "transformedEvent");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (!this.f14599j || (i10 = this.f14595f) == 3 || i10 == 1 || i10 == 5 || this.f14591b < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {m(transformedEvent), m(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.f14596g = motionEvent.getX();
            this.f14597h = motionEvent.getY();
            this.f14614y = motionEvent.getPointerCount();
            boolean zG0 = g0(this.f14594e, this.f14596g, this.f14597h);
            this.f14598i = zG0;
            if (this.f14615z && !zG0) {
                int i11 = this.f14595f;
                if (i11 == 4) {
                    q();
                    return;
                } else {
                    if (i11 == 2) {
                        D();
                        return;
                    }
                    return;
                }
            }
            k kVar = k.f14643a;
            this.f14609t = kVar.b(motionEvent, true);
            this.f14610u = kVar.c(motionEvent, true);
            this.f14612w = motionEvent.getRawX() - motionEvent.getX();
            this.f14613x = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                F0(sourceEvent);
            }
            if (com.swmansion.gesturehandler.react.a.c(sourceEvent)) {
                m0(motionEvent, motionEvent2);
            } else {
                l0(motionEvent, motionEvent2);
            }
            if (!AbstractC5504s.c(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (AbstractC5504s.c(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (a unused) {
            D();
        }
    }

    public final boolean Y(AbstractC2081d other) {
        AbstractC5504s.h(other, "other");
        int length = this.f14590a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f14590a[i10] != -1 && other.f14590a[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return this.f14587G;
    }

    public final boolean a0() {
        return this.f14588H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c0(Qa.AbstractC2081d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            android.view.View r0 = r3.f14594e
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L2f
            android.view.View r2 = r4.f14594e
            boolean r2 = kotlin.jvm.internal.AbstractC5504s.c(r0, r2)
            if (r2 == 0) goto L24
            r4 = 1
            return r4
        L24:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L2f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa.AbstractC2081d.c0(Qa.d):boolean");
    }

    public final boolean d0() {
        return this.f14599j;
    }

    public final boolean f0() {
        return this.f14598i;
    }

    public final boolean g0(View view, float f10, float f11) {
        float f12;
        g.a aVar = Pa.g.f13751a;
        AbstractC5504s.e(view);
        if (aVar.e(view)) {
            return aVar.c(view, f10, f11);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f14607r;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            b bVar = f14576J;
            float f17 = bVar.c(f13) ? 0.0f - f13 : 0.0f;
            f = bVar.c(f14) ? 0.0f - f14 : 0.0f;
            if (bVar.c(f15)) {
                width += f15;
            }
            if (bVar.c(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (bVar.c(f18)) {
                if (!bVar.c(f13)) {
                    f17 = width - f18;
                } else if (!bVar.c(f15)) {
                    width = f18 + f17;
                }
            }
            if (bVar.c(f19)) {
                if (!bVar.c(f14)) {
                    f = height - f19;
                } else if (!bVar.c(f16)) {
                    height = f19 + f;
                }
            }
            f12 = f;
            f = f17;
        } else {
            f12 = 0.0f;
        }
        return f <= f10 && f10 <= width && f12 <= f11 && f11 <= height;
    }

    public final void k() {
        l(false);
    }

    public void l(boolean z10) {
        if (!this.f14611v || z10) {
            int i10 = this.f14595f;
            if (i10 == 0 || i10 == 2) {
                h0(4);
            }
        }
    }

    protected abstract void l0(MotionEvent motionEvent, MotionEvent motionEvent2);

    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
    }

    public final void p() {
        if (this.f14595f == 0) {
            h0(2);
        }
    }

    public final void q() {
        int i10 = this.f14595f;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f14588H) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, i iVar) {
        if (this.f14594e != null || this.f14581A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f14590a, -1);
        this.f14591b = 0;
        this.f14595f = 0;
        this.f14594e = view;
        this.f14581A = iVar;
        Activity activityH = H(view != null ? view.getContext() : null);
        View viewFindViewById = activityH != null ? activityH.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.f14592c);
        } else {
            int[] iArr = this.f14592c;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        n0();
    }

    public final void r0() {
        this.f14594e = null;
        this.f14581A = null;
        Arrays.fill(this.f14590a, -1);
        this.f14591b = 0;
        this.f14604o = 0;
        AbstractC2273n.z(this.f14605p, null, 0, 0, 6, null);
        this.f14603n = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.f14602m;
        this.f14602m = null;
        return writableArray;
    }

    public void s0() {
        this.f14606q = false;
        this.f14611v = false;
        this.f14615z = false;
        y0(true);
        this.f14607r = (float[]) f14577K;
        this.f14585E = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.f14601l;
        this.f14601l = null;
        return writableArray;
    }

    public String toString() {
        String simpleName;
        View view = this.f14594e;
        if (view == null) {
            simpleName = null;
        } else {
            AbstractC5504s.e(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f14593d + "]:" + simpleName;
    }

    public final void u0(int i10) {
        this.f14600k = i10;
    }

    public void v(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        r rVar = this.f14582B;
        if (rVar != null) {
            rVar.b(this, event);
        }
    }

    public final void v0(int i10) {
        this.f14586F = i10;
    }

    public void w(int i10, int i11) {
        r rVar = this.f14582B;
        if (rVar != null) {
            rVar.a(this, i10, i11);
        }
    }

    public final void w0(boolean z10) {
        this.f14587G = z10;
    }

    public final void x0(boolean z10) {
        this.f14588H = z10;
    }

    public void y() {
        r rVar;
        if (this.f14601l == null || (rVar = this.f14582B) == null) {
            return;
        }
        rVar.c(this);
    }

    public final void z0(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f14607r == null) {
            this.f14607r = new float[6];
        }
        float[] fArr = this.f14607r;
        AbstractC5504s.e(fArr);
        fArr[0] = f10;
        float[] fArr2 = this.f14607r;
        AbstractC5504s.e(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = this.f14607r;
        AbstractC5504s.e(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = this.f14607r;
        AbstractC5504s.e(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = this.f14607r;
        AbstractC5504s.e(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = this.f14607r;
        AbstractC5504s.e(fArr6);
        fArr6[5] = f15;
        b bVar = f14576J;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (bVar.c(f15) && !bVar.c(f13) && !bVar.c(f11)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    protected void j0() {
    }

    protected void k0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }

    public void t0() {
    }

    protected void p0(int i10, int i11) {
    }
}
