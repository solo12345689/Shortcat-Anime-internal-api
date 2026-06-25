package U0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: U0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2234x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2236y f18874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18876c;

    public C2234x(InterfaceC2236y interfaceC2236y, int i10, int i11) {
        this.f18874a = interfaceC2236y;
        this.f18875b = i10;
        this.f18876c = i11;
    }

    public final int a() {
        return this.f18876c;
    }

    public final InterfaceC2236y b() {
        return this.f18874a;
    }

    public final int c() {
        return this.f18875b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2234x)) {
            return false;
        }
        C2234x c2234x = (C2234x) obj;
        return AbstractC5504s.c(this.f18874a, c2234x.f18874a) && this.f18875b == c2234x.f18875b && this.f18876c == c2234x.f18876c;
    }

    public int hashCode() {
        return (((this.f18874a.hashCode() * 31) + Integer.hashCode(this.f18875b)) * 31) + Integer.hashCode(this.f18876c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f18874a + ", startIndex=" + this.f18875b + ", endIndex=" + this.f18876c + ')';
    }
}
