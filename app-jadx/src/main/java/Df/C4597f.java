package df;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: df.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4597f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.b f45152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45153b;

    public C4597f(Xe.b classId, int i10) {
        AbstractC5504s.h(classId, "classId");
        this.f45152a = classId;
        this.f45153b = i10;
    }

    public final Xe.b a() {
        return this.f45152a;
    }

    public final int b() {
        return this.f45153b;
    }

    public final int c() {
        return this.f45153b;
    }

    public final Xe.b d() {
        return this.f45152a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4597f)) {
            return false;
        }
        C4597f c4597f = (C4597f) obj;
        return AbstractC5504s.c(this.f45152a, c4597f.f45152a) && this.f45153b == c4597f.f45153b;
    }

    public int hashCode() {
        return (this.f45152a.hashCode() * 31) + Integer.hashCode(this.f45153b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f45153b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f45152a);
        int i12 = this.f45153b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
