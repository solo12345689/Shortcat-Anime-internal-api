package u;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6704c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f61096a;

    public C6704c(int i10, float f10) {
        this.f61096a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        AbstractC5504s.h(key, "key");
        return this.f61096a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f61096a.entrySet();
        AbstractC5504s.g(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f61096a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        return this.f61096a.put(key, value);
    }

    public final Object e(Object key) {
        AbstractC5504s.h(key, "key");
        return this.f61096a.remove(key);
    }
}
