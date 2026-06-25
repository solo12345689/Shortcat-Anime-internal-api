package E2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4207d;

    public b(String str, String str2, int i10, int i11) {
        this.f4204a = str;
        this.f4205b = str2;
        this.f4206c = i10;
        this.f4207d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4206c == bVar.f4206c && this.f4207d == bVar.f4207d && Objects.equals(this.f4204a, bVar.f4204a) && Objects.equals(this.f4205b, bVar.f4205b);
    }

    public int hashCode() {
        return Objects.hash(this.f4204a, this.f4205b, Integer.valueOf(this.f4206c), Integer.valueOf(this.f4207d));
    }
}
