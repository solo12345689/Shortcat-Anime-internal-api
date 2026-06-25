package Ad;

import expo.modules.updates.reloadscreen.SpinnerSize;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SpinnerSize f404c;

    public f(boolean z10, int i10, SpinnerSize size) {
        AbstractC5504s.h(size, "size");
        this.f402a = z10;
        this.f403b = i10;
        this.f404c = size;
    }

    public static /* synthetic */ f b(f fVar, boolean z10, int i10, SpinnerSize spinnerSize, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = fVar.f402a;
        }
        if ((i11 & 2) != 0) {
            i10 = fVar.f403b;
        }
        if ((i11 & 4) != 0) {
            spinnerSize = fVar.f404c;
        }
        return fVar.a(z10, i10, spinnerSize);
    }

    public final f a(boolean z10, int i10, SpinnerSize size) {
        AbstractC5504s.h(size, "size");
        return new f(z10, i10, size);
    }

    public final int c() {
        return this.f403b;
    }

    public final boolean d() {
        return this.f402a;
    }

    public final SpinnerSize e() {
        return this.f404c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f402a == fVar.f402a && this.f403b == fVar.f403b && this.f404c == fVar.f404c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f402a) * 31) + Integer.hashCode(this.f403b)) * 31) + this.f404c.hashCode();
    }

    public String toString() {
        return "SpinnerConfiguration(enabled=" + this.f402a + ", color=" + this.f403b + ", size=" + this.f404c + ")";
    }
}
