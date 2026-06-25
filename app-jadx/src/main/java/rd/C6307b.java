package rd;

import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: rd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6307b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f58750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f58751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f58752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f58753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f58754e;

    public C6307b(String key, String value, Date lastUpdated, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(lastUpdated, "lastUpdated");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f58750a = key;
        this.f58751b = value;
        this.f58752c = lastUpdated;
        this.f58753d = scopeKey;
    }

    public final long a() {
        return this.f58754e;
    }

    public final String b() {
        return this.f58750a;
    }

    public final Date c() {
        return this.f58752c;
    }

    public final String d() {
        return this.f58753d;
    }

    public final String e() {
        return this.f58751b;
    }

    public final void f(long j10) {
        this.f58754e = j10;
    }
}
