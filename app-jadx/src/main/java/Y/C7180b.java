package y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7180b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f64606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f64607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f64608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f64609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f64610e;

    public /* synthetic */ C7180b(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f64606a;
    }

    public final long b() {
        return this.f64610e;
    }

    public final long c() {
        return this.f64609d;
    }

    public final long d() {
        return this.f64608c;
    }

    public final long e() {
        return this.f64607b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7180b)) {
            return false;
        }
        C7180b c7180b = (C7180b) obj;
        return C6385r0.s(this.f64606a, c7180b.f64606a) && C6385r0.s(this.f64607b, c7180b.f64607b) && C6385r0.s(this.f64608c, c7180b.f64608c) && C6385r0.s(this.f64609d, c7180b.f64609d) && C6385r0.s(this.f64610e, c7180b.f64610e);
    }

    public int hashCode() {
        return (((((((C6385r0.y(this.f64606a) * 31) + C6385r0.y(this.f64607b)) * 31) + C6385r0.y(this.f64608c)) * 31) + C6385r0.y(this.f64609d)) * 31) + C6385r0.y(this.f64610e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) C6385r0.z(this.f64606a)) + ", textColor=" + ((Object) C6385r0.z(this.f64607b)) + ", iconColor=" + ((Object) C6385r0.z(this.f64608c)) + ", disabledTextColor=" + ((Object) C6385r0.z(this.f64609d)) + ", disabledIconColor=" + ((Object) C6385r0.z(this.f64610e)) + ')';
    }

    private C7180b(long j10, long j11, long j12, long j13, long j14) {
        this.f64606a = j10;
        this.f64607b = j11;
        this.f64608c = j12;
        this.f64609d = j13;
        this.f64610e = j14;
    }
}
