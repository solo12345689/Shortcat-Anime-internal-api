package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6895d0 implements InterfaceC6874C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62506a;

    public C6895d0(int i10) {
        this.f62506a = i10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6895d0) && ((C6895d0) obj).f62506a == this.f62506a;
    }

    public int hashCode() {
        return this.f62506a;
    }

    @Override // w.InterfaceC6904i
    public y0 a(s0 s0Var) {
        return new F0(this.f62506a);
    }

    public /* synthetic */ C6895d0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
