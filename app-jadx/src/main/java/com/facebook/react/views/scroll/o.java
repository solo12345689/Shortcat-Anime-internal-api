package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.views.scroll.p;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import h7.C4914b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f38136k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f38137l = o.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final K1.e f38138m = new K1.e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f38147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f38148j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int i10, int i11, p pVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
            o oVar = (o) o.f38138m.b();
            if (oVar == null) {
                oVar = new o(null);
            }
            o oVar2 = oVar;
            oVar2.d(i10, i11, pVar, f10, f11, f12, f13, i12, i13, i14, i15);
            return oVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i10, int i11, p pVar, float f10, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.init(i10, i11, jUptimeMillis);
        this.f38147i = pVar;
        this.f38139a = f10;
        this.f38140b = f11;
        this.f38141c = f12;
        this.f38142d = f13;
        this.f38143e = i12;
        this.f38144f = i13;
        this.f38145g = i14;
        this.f38146h = i15;
        this.f38148j = jUptimeMillis;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return this.f38147i == p.f38152d;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("top", 0.0d);
        readableMapBuilder.put("bottom", 0.0d);
        readableMapBuilder.put("left", 0.0d);
        readableMapBuilder.put("right", 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
        readableMapBuilder2.put("x", B.g(this.f38139a));
        readableMapBuilder2.put("y", B.g(this.f38140b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder3 = new ReadableMapBuilder(writableMapCreateMap3);
        readableMapBuilder3.put("width", B.g(this.f38143e));
        readableMapBuilder3.put("height", B.g(this.f38144f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder4 = new ReadableMapBuilder(writableMapCreateMap4);
        readableMapBuilder4.put("width", B.g(this.f38145g));
        readableMapBuilder4.put("height", B.g(this.f38146h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder5 = new ReadableMapBuilder(writableMapCreateMap5);
        readableMapBuilder5.put("x", B.g(this.f38141c));
        readableMapBuilder5.put("y", B.g(this.f38142d));
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, this.f38148j);
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", !C4914b.H());
        return writableMapCreateMap6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        p.a aVar = p.f38149a;
        Object objC = Q6.a.c(this.f38147i);
        AbstractC5504s.g(objC, "assertNotNull(...)");
        return aVar.a((p) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        try {
            f38138m.a(this);
        } catch (IllegalStateException e10) {
            String TAG = f38137l;
            AbstractC5504s.g(TAG, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private o() {
    }
}
