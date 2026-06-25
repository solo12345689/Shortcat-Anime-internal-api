package a4;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2567b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23765d;

    public C2567b(int i10, int i11, int i12, int i13) {
        this.f23762a = i10;
        this.f23763b = i11;
        this.f23764c = i12;
        this.f23765d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i10 + ", right: " + i12).toString());
        }
        if (i11 <= i13) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i11 + ", bottom: " + i13).toString());
    }

    public final int a() {
        return this.f23765d - this.f23763b;
    }

    public final int b() {
        return this.f23762a;
    }

    public final int c() {
        return this.f23763b;
    }

    public final int d() {
        return this.f23764c - this.f23762a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C2567b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C2567b c2567b = (C2567b) obj;
        return this.f23762a == c2567b.f23762a && this.f23763b == c2567b.f23763b && this.f23764c == c2567b.f23764c && this.f23765d == c2567b.f23765d;
    }

    public final Rect f() {
        return new Rect(this.f23762a, this.f23763b, this.f23764c, this.f23765d);
    }

    public int hashCode() {
        return (((((this.f23762a * 31) + this.f23763b) * 31) + this.f23764c) * 31) + this.f23765d;
    }

    public String toString() {
        return C2567b.class.getSimpleName() + " { [" + this.f23762a + ',' + this.f23763b + ',' + this.f23764c + ',' + this.f23765d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2567b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC5504s.h(rect, "rect");
    }
}
