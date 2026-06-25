package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f37003l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f37004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Choreographer f37005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f37006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f37013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37014k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f37004a = reactContext;
        this.f37006c = new d();
        this.f37007d = -1L;
        this.f37008e = -1L;
        this.f37013j = 60.0d;
        this.f37014k = true;
    }

    private final int h() {
        return this.f37012i - 1;
    }

    private final int i() {
        return (int) ((this.f37008e - this.f37007d) / 1000000.0d);
    }

    public static /* synthetic */ void m(h hVar, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = hVar.f37013j;
        }
        hVar.l(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f37005b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f37005b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(hVar);
        }
    }

    public final int c() {
        return this.f37011h;
    }

    public final int d() {
        return (int) (((this.f37013j * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f37007d == -1) {
            this.f37007d = j10;
        }
        long j11 = this.f37008e;
        this.f37008e = j10;
        if (this.f37006c.d(j11, j10)) {
            this.f37012i++;
        }
        this.f37009f++;
        int iD = d();
        if ((iD - this.f37010g) - 1 >= 4) {
            this.f37011h++;
        }
        this.f37010g = iD;
        Choreographer choreographer = this.f37005b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f37008e == this.f37007d) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.f37008e - this.f37007d);
    }

    public final double f() {
        if (this.f37008e == this.f37007d) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.f37008e - this.f37007d);
    }

    public final int g() {
        return this.f37009f - 1;
    }

    public final boolean j() {
        return this.f37014k;
    }

    public final void k() {
        this.f37007d = -1L;
        this.f37008e = -1L;
        this.f37009f = 0;
        this.f37011h = 0;
        this.f37012i = 0;
    }

    public final void l(double d10) {
        if (!Y6.a.f22864f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f37004a.getNativeModule(UIManagerModule.class);
            if (this.f37004a.isBridgeless()) {
                this.f37014k = true;
            } else {
                this.f37004a.getCatalystInstance().addBridgeIdleDebugListener(this.f37006c);
                this.f37014k = false;
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(this.f37006c);
            }
        }
        this.f37013j = d10;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.f
            @Override // java.lang.Runnable
            public final void run() {
                h.n(this.f37001a);
            }
        });
    }

    public final void o() {
        if (!Y6.a.f22864f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f37004a.getNativeModule(UIManagerModule.class);
            if (!this.f37004a.isBridgeless()) {
                this.f37004a.getCatalystInstance().removeBridgeIdleDebugListener(this.f37006c);
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(null);
            }
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.g
            @Override // java.lang.Runnable
            public final void run() {
                h.p(this.f37002a);
            }
        });
    }
}
