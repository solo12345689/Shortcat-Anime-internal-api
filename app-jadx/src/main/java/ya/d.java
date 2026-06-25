package Ya;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends com.facebook.react.uimanager.events.d implements Wa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, String name, String registrationName) {
        super(i10, i11);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(registrationName, "registrationName");
        this.f22877a = name;
        this.f22878b = registrationName;
    }

    @Override // Wa.b
    public String a() {
        return this.f22878b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f22877a;
    }
}
