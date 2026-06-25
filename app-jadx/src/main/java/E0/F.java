package E0;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f4056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f4058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f4059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f4060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f4061k;

    public /* synthetic */ F(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean a() {
        return this.f4058h;
    }

    public final boolean b() {
        return this.f4055e;
    }

    public final List c() {
        return this.f4059i;
    }

    public final long d() {
        return this.f4051a;
    }

    public final long e() {
        return this.f4061k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return B.d(this.f4051a, f10.f4051a) && this.f4052b == f10.f4052b && C6224f.j(this.f4053c, f10.f4053c) && C6224f.j(this.f4054d, f10.f4054d) && this.f4055e == f10.f4055e && Float.compare(this.f4056f, f10.f4056f) == 0 && Q.g(this.f4057g, f10.f4057g) && this.f4058h == f10.f4058h && AbstractC5504s.c(this.f4059i, f10.f4059i) && C6224f.j(this.f4060j, f10.f4060j) && C6224f.j(this.f4061k, f10.f4061k);
    }

    public final long f() {
        return this.f4054d;
    }

    public final long g() {
        return this.f4053c;
    }

    public final float h() {
        return this.f4056f;
    }

    public int hashCode() {
        return (((((((((((((((((((B.e(this.f4051a) * 31) + Long.hashCode(this.f4052b)) * 31) + C6224f.o(this.f4053c)) * 31) + C6224f.o(this.f4054d)) * 31) + Boolean.hashCode(this.f4055e)) * 31) + Float.hashCode(this.f4056f)) * 31) + Q.h(this.f4057g)) * 31) + Boolean.hashCode(this.f4058h)) * 31) + this.f4059i.hashCode()) * 31) + C6224f.o(this.f4060j)) * 31) + C6224f.o(this.f4061k);
    }

    public final long i() {
        return this.f4060j;
    }

    public final int j() {
        return this.f4057g;
    }

    public final long k() {
        return this.f4052b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) B.f(this.f4051a)) + ", uptime=" + this.f4052b + ", positionOnScreen=" + ((Object) C6224f.s(this.f4053c)) + ", position=" + ((Object) C6224f.s(this.f4054d)) + ", down=" + this.f4055e + ", pressure=" + this.f4056f + ", type=" + ((Object) Q.i(this.f4057g)) + ", activeHover=" + this.f4058h + ", historical=" + this.f4059i + ", scrollDelta=" + ((Object) C6224f.s(this.f4060j)) + ", originalEventPosition=" + ((Object) C6224f.s(this.f4061k)) + ')';
    }

    private F(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15) {
        this.f4051a = j10;
        this.f4052b = j11;
        this.f4053c = j12;
        this.f4054d = j13;
        this.f4055e = z10;
        this.f4056f = f10;
        this.f4057g = i10;
        this.f4058h = z11;
        this.f4059i = list;
        this.f4060j = j14;
        this.f4061k = j15;
    }
}
