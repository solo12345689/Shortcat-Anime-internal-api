package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37362e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final K1.e f37363f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37367d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(int i10, int i11, int i12, int i13, int i14, int i15) {
            A a10 = (A) A.f37363f.b();
            if (a10 == null) {
                a10 = new A(null);
            }
            A a11 = a10;
            a11.c(i10, i11, i12, i13, i14, i15);
            return a11;
        }

        private a() {
        }
    }

    static {
        W6.b.a("OnLayoutEvent", W6.a.f20777a);
        f37363f = new K1.e(20);
    }

    public /* synthetic */ A(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final A d(int i10, int i11, int i12, int i13, int i14, int i15) {
        return f37362e.a(i10, i11, i12, i13, i14, i15);
    }

    protected final void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f37364a = i12;
        this.f37365b = i13;
        this.f37366c = i14;
        this.f37367d = i15;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("x", B.g(this.f37364a));
        readableMapBuilder.put("y", B.g(this.f37365b));
        readableMapBuilder.put("width", B.g(this.f37366c));
        readableMapBuilder.put("height", B.g(this.f37367d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        f37363f.a(this);
    }

    private A() {
    }
}
