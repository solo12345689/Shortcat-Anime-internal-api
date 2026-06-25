package C;

import i1.EnumC5027t;
import i1.InterfaceC5011d;

/* JADX INFO: renamed from: C.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1145p implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2168e;

    public C1145p(int i10, int i11, int i12, int i13) {
        this.f2165b = i10;
        this.f2166c = i11;
        this.f2167d = i12;
        this.f2168e = i13;
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return this.f2168e;
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return this.f2166c;
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return this.f2167d;
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return this.f2165b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145p)) {
            return false;
        }
        C1145p c1145p = (C1145p) obj;
        return this.f2165b == c1145p.f2165b && this.f2166c == c1145p.f2166c && this.f2167d == c1145p.f2167d && this.f2168e == c1145p.f2168e;
    }

    public int hashCode() {
        return (((((this.f2165b * 31) + this.f2166c) * 31) + this.f2167d) * 31) + this.f2168e;
    }

    public String toString() {
        return "Insets(left=" + this.f2165b + ", top=" + this.f2166c + ", right=" + this.f2167d + ", bottom=" + this.f2168e + ')';
    }
}
