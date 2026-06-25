package Pd;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WritableMap f13800b;

    public b(String str, WritableMap writableMap) {
        this.f13799a = str;
        this.f13800b = writableMap;
    }

    @Override // Qd.a
    public WritableMap a() {
        return this.f13800b;
    }

    @Override // Qd.a
    public String getEventName() {
        return this.f13799a;
    }
}
