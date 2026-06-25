package od;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: od.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5863g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55381b;

    public C5863g(String projectId, String scopeKey) {
        AbstractC5504s.h(projectId, "projectId");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f55380a = projectId;
        this.f55381b = scopeKey;
    }

    public final String a() {
        return this.f55380a;
    }

    public final String b() {
        return this.f55381b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5863g)) {
            return false;
        }
        C5863g c5863g = (C5863g) obj;
        return AbstractC5504s.c(this.f55380a, c5863g.f55380a) && AbstractC5504s.c(this.f55381b, c5863g.f55381b);
    }

    public int hashCode() {
        return (this.f55380a.hashCode() * 31) + this.f55381b.hashCode();
    }

    public String toString() {
        return "ExpoProjectInformation(projectId=" + this.f55380a + ", scopeKey=" + this.f55381b + ")";
    }
}
