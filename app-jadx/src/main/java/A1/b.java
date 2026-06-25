package A1;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f103e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f107d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f104a = i10;
        this.f105b = i11;
        this.f106c = i12;
        this.f107d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return c(bVar.f104a + bVar2.f104a, bVar.f105b + bVar2.f105b, bVar.f106c + bVar2.f106c, bVar.f107d + bVar2.f107d);
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.max(bVar.f104a, bVar2.f104a), Math.max(bVar.f105b, bVar2.f105b), Math.max(bVar.f106c, bVar2.f106c), Math.max(bVar.f107d, bVar2.f107d));
    }

    public static b c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f103e : new b(i10, i11, i12, i13);
    }

    public static b d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b e(b bVar, b bVar2) {
        return c(bVar.f104a - bVar2.f104a, bVar.f105b - bVar2.f105b, bVar.f106c - bVar2.f106c, bVar.f107d - bVar2.f107d);
    }

    public static b f(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f107d == bVar.f107d && this.f104a == bVar.f104a && this.f106c == bVar.f106c && this.f105b == bVar.f105b;
    }

    public Insets g() {
        return a.a(this.f104a, this.f105b, this.f106c, this.f107d);
    }

    public int hashCode() {
        return (((((this.f104a * 31) + this.f105b) * 31) + this.f106c) * 31) + this.f107d;
    }

    public String toString() {
        return "Insets{left=" + this.f104a + ", top=" + this.f105b + ", right=" + this.f106c + ", bottom=" + this.f107d + '}';
    }
}
