package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.x;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37669f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f37670g = v.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final K1.e f37671h = new K1.e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f37672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f37673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f37674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f37675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37676e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(int i10, int i11, x xVar, MotionEvent motionEvent, long j10, float f10, float f11, w touchEventCoalescingKeyHelper) {
            AbstractC5504s.h(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            v vVar = (v) v.f37671h.b();
            if (vVar == null) {
                vVar = new v(null);
            }
            v vVar2 = vVar;
            Object objC = Q6.a.c(motionEvent);
            AbstractC5504s.g(objC, "assertNotNull(...)");
            vVar2.h(i10, i11, xVar, (MotionEvent) objC, j10, f10, f11, touchEventCoalescingKeyHelper);
            return vVar2;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37677a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.f37680c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.f37681d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.f37683f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.f37682e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37677a = iArr;
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i10, int i11, x xVar, MotionEvent motionEvent, long j10, float f10, float f11, w wVar) {
        super.init(i10, i11, motionEvent.getEventTime());
        short sB = 0;
        SoftAssertions.assertCondition(j10 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            wVar.a(j10);
        } else if (action == 1) {
            wVar.e(j10);
        } else if (action == 2) {
            sB = wVar.b(j10);
        } else if (action == 3) {
            wVar.e(j10);
        } else if (action == 5 || action == 6) {
            wVar.d(j10);
        }
        this.f37672a = MotionEvent.obtain(motionEvent);
        this.f37673b = xVar;
        this.f37674c = sB;
        this.f37675d = f10;
        this.f37676e = f11;
    }

    private final boolean i() {
        if (this.f37672a != null) {
            return true;
        }
        String TAG = f37670g;
        AbstractC5504s.g(TAG, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        x xVar = (x) Q6.a.c(this.f37673b);
        int i10 = xVar == null ? -1 : b.f37677a[xVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f37673b);
    }

    public final MotionEvent d() {
        Object objC = Q6.a.c(this.f37672a);
        AbstractC5504s.g(objC, "assertNotNull(...)");
        return (MotionEvent) objC;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC5504s.h(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            y.d(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        AbstractC5504s.h(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            int iB = C7.a.b(getViewTag(), getSurfaceId());
            if (iB == 1) {
                y.d(rctEventEmitter, this);
            } else {
                if (iB != 2) {
                    return;
                }
                y.c(rctEventEmitter, this);
            }
        }
    }

    public final x e() {
        Object objC = Q6.a.c(this.f37673b);
        AbstractC5504s.g(objC, "assertNotNull(...)");
        return (x) objC;
    }

    public final float f() {
        return this.f37675d;
    }

    public final float g() {
        return this.f37676e;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f37674c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public int getEventCategory() {
        x xVar = this.f37673b;
        if (xVar == null) {
            return 2;
        }
        int i10 = b.f37677a[xVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 4;
        }
        throw new Td.r();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        x.a aVar = x.f37679b;
        Object objC = Q6.a.c(this.f37673b);
        AbstractC5504s.g(objC, "assertNotNull(...)");
        return aVar.a((x) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        MotionEvent motionEvent = this.f37672a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f37672a = null;
        try {
            f37671h.a(this);
        } catch (IllegalStateException e10) {
            String TAG = f37670g;
            AbstractC5504s.g(TAG, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private v() {
    }
}
