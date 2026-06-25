package Yh;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23029c;

    private x(int i10, int i11, int i12) {
        this.f23027a = i10;
        this.f23028b = i11;
        this.f23029c = i12;
    }

    public static x d(int i10, int i11, int i12) {
        return new x(i10, i11, i12);
    }

    public int a() {
        return this.f23028b;
    }

    public int b() {
        return this.f23029c;
    }

    public int c() {
        return this.f23027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f23027a == xVar.f23027a && this.f23028b == xVar.f23028b && this.f23029c == xVar.f23029c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f23027a), Integer.valueOf(this.f23028b), Integer.valueOf(this.f23029c));
    }

    public String toString() {
        return "SourceSpan{line=" + this.f23027a + ", column=" + this.f23028b + ", length=" + this.f23029c + "}";
    }
}
