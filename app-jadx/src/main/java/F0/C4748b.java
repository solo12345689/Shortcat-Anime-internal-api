package f0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4748b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46797a;

    public C4748b(int i10) {
        this.f46797a = i10;
    }

    public final int a() {
        return this.f46797a;
    }

    public final void b(int i10) {
        this.f46797a += i10;
    }

    public final void c(int i10) {
        this.f46797a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4748b) && this.f46797a == ((C4748b) obj).f46797a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f46797a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f46797a + ')';
    }

    public /* synthetic */ C4748b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
