package n4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5728d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f53912b;

    public C5728d(String key, Long l10) {
        AbstractC5504s.h(key, "key");
        this.f53911a = key;
        this.f53912b = l10;
    }

    public final String a() {
        return this.f53911a;
    }

    public final Long b() {
        return this.f53912b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5728d)) {
            return false;
        }
        C5728d c5728d = (C5728d) obj;
        return AbstractC5504s.c(this.f53911a, c5728d.f53911a) && AbstractC5504s.c(this.f53912b, c5728d.f53912b);
    }

    public int hashCode() {
        int iHashCode = this.f53911a.hashCode() * 31;
        Long l10 = this.f53912b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f53911a + ", value=" + this.f53912b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5728d(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        AbstractC5504s.h(key, "key");
    }
}
