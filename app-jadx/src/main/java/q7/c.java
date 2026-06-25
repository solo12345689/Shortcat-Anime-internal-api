package Q7;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadableMap f14383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadableMap f14384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, int i11, a mode, Rect targetRect, Rect thresholdRect, boolean z10) {
        super(i10, i11);
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(targetRect, "targetRect");
        AbstractC5504s.h(thresholdRect, "thresholdRect");
        this.f14381a = mode;
        this.f14382b = z10;
        this.f14383c = d.b(targetRect);
        this.f14384d = d.b(thresholdRect);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected boolean experimental_isSynchronous() {
        return this.f14382b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("mode", this.f14381a.b());
        writableMapCreateMap.putMap("targetRect", this.f14383c);
        writableMapCreateMap.putMap("thresholdRect", this.f14384d);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "modeChange";
    }
}
