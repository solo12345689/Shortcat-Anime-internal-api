package H7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8089d;

    public m(int i10, int i11, int i12, int i13) {
        this.f8086a = i10;
        this.f8087b = i11;
        this.f8088c = i12;
        this.f8089d = i13;
    }

    public final int a() {
        return this.f8089d;
    }

    public final int b() {
        return this.f8086a;
    }

    public final int c() {
        return this.f8088c;
    }

    public final int d() {
        return this.f8087b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8086a == mVar.f8086a && this.f8087b == mVar.f8087b && this.f8088c == mVar.f8088c && this.f8089d == mVar.f8089d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f8086a) * 31) + Integer.hashCode(this.f8087b)) * 31) + Integer.hashCode(this.f8088c)) * 31) + Integer.hashCode(this.f8089d);
    }

    public String toString() {
        return "ColorEdges(left=" + this.f8086a + ", top=" + this.f8087b + ", right=" + this.f8088c + ", bottom=" + this.f8089d + ")";
    }

    public /* synthetic */ m(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -16777216 : i10, (i14 & 2) != 0 ? -16777216 : i11, (i14 & 4) != 0 ? -16777216 : i12, (i14 & 8) != 0 ? -16777216 : i13);
    }
}
