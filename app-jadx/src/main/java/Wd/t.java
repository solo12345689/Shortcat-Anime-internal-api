package wd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63150b;

    public t(String easProjectId, String scopeKey) {
        AbstractC5504s.h(easProjectId, "easProjectId");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f63149a = easProjectId;
        this.f63150b = scopeKey;
    }

    public final String a() {
        return this.f63149a;
    }

    public final String b() {
        return this.f63150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return AbstractC5504s.c(this.f63149a, tVar.f63149a) && AbstractC5504s.c(this.f63150b, tVar.f63150b);
    }

    public int hashCode() {
        return (this.f63149a.hashCode() * 31) + this.f63150b.hashCode();
    }

    public String toString() {
        return "SigningInfo(easProjectId=" + this.f63149a + ", scopeKey=" + this.f63150b + ")";
    }
}
