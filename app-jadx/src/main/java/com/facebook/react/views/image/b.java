package com.facebook.react.views.image;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37896h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f37903g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, Throwable throwable) {
            AbstractC5504s.h(throwable, "throwable");
            return new b(i10, i11, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int i10, int i11) {
            return new b(i10, i11, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b c(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 2, null, str, i12, i13, 0, 0, null);
        }

        public final b d(int i10, int i11) {
            return new b(i10, i11, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b e(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 5, null, str, 0, 0, i12, i13, null);
        }

        public final String f(int i10) {
            if (i10 == 1) {
                return "topError";
            }
            if (i10 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i10 == 3) {
                return "topLoadEnd";
            }
            if (i10 == 4) {
                return "topLoadStart";
            }
            if (i10 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i10).toString());
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, i13, i14, i15, i16);
    }

    private final WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.f37899c);
        writableMapCreateMap.putDouble("width", this.f37900d);
        writableMapCreateMap.putDouble("height", this.f37901e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f37897a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i10 = this.f37897a;
        if (i10 == 1) {
            writableMapCreateMap.putString(LogEvent.LEVEL_ERROR, this.f37898b);
            return writableMapCreateMap;
        }
        if (i10 == 2) {
            writableMapCreateMap.putMap("source", b());
            return writableMapCreateMap;
        }
        if (i10 != 5) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("loaded", this.f37902f);
        writableMapCreateMap.putInt("total", this.f37903g);
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) this.f37902f) / ((double) this.f37903g));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return f37896h.f(this.f37897a);
    }

    /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? 0 : i14, (i17 & 128) != 0 ? 0 : i15, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0 : i16);
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f37897a = i12;
        this.f37898b = str;
        this.f37899c = str2;
        this.f37900d = i13;
        this.f37901e = i14;
        this.f37902f = i15;
        this.f37903g = i16;
    }
}
