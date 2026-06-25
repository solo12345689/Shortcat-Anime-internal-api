package ua;

/* JADX INFO: renamed from: ua.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6746a extends f {

    /* JADX INFO: renamed from: a */
    private final String f61458a;

    /* JADX INFO: renamed from: b */
    private final String f61459b;

    C6746a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f61458a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f61459b = str2;
    }

    @Override // ua.f
    public String b() {
        return this.f61458a;
    }

    @Override // ua.f
    public String c() {
        return this.f61459b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f61458a.equals(fVar.b()) && this.f61459b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f61458a.hashCode() ^ 1000003) * 1000003) ^ this.f61459b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f61458a + ", version=" + this.f61459b + "}";
    }
}
