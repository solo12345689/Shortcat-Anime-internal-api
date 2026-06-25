package w2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f62898a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f62899b;

    public synchronized void a(Map map) {
        this.f62899b = null;
        this.f62898a.clear();
        this.f62898a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f62899b == null) {
                this.f62899b = Collections.unmodifiableMap(new HashMap(this.f62898a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62899b;
    }
}
