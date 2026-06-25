package mf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: mf.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5693y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f53481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f53483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f53484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Xe.b f53485f;

    public C5693y(Object obj, Object obj2, Object obj3, Object obj4, String filePath, Xe.b classId) {
        AbstractC5504s.h(filePath, "filePath");
        AbstractC5504s.h(classId, "classId");
        this.f53480a = obj;
        this.f53481b = obj2;
        this.f53482c = obj3;
        this.f53483d = obj4;
        this.f53484e = filePath;
        this.f53485f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5693y)) {
            return false;
        }
        C5693y c5693y = (C5693y) obj;
        return AbstractC5504s.c(this.f53480a, c5693y.f53480a) && AbstractC5504s.c(this.f53481b, c5693y.f53481b) && AbstractC5504s.c(this.f53482c, c5693y.f53482c) && AbstractC5504s.c(this.f53483d, c5693y.f53483d) && AbstractC5504s.c(this.f53484e, c5693y.f53484e) && AbstractC5504s.c(this.f53485f, c5693y.f53485f);
    }

    public int hashCode() {
        Object obj = this.f53480a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f53481b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f53482c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f53483d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f53484e.hashCode()) * 31) + this.f53485f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f53480a + ", compilerVersion=" + this.f53481b + ", languageVersion=" + this.f53482c + ", expectedVersion=" + this.f53483d + ", filePath=" + this.f53484e + ", classId=" + this.f53485f + ')';
    }
}
