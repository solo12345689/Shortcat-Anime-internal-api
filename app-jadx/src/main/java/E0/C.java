package E0;

import Ud.AbstractC2279u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f4033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f4036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f4038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f4039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C f4043o;

    public /* synthetic */ C(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public static /* synthetic */ C c(C c10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c10.f4029a : j10;
        long j18 = (i11 & 2) != 0 ? c10.f4030b : j11;
        long j19 = (i11 & 4) != 0 ? c10.f4031c : j12;
        boolean z12 = (i11 & 8) != 0 ? c10.f4032d : z10;
        long j20 = (i11 & 16) != 0 ? c10.f4034f : j13;
        long j21 = (i11 & 32) != 0 ? c10.f4035g : j14;
        boolean z13 = (i11 & 64) != 0 ? c10.f4036h : z11;
        int i12 = (i11 & 128) != 0 ? c10.f4037i : i10;
        if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            j16 = c10.f4038j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c10.b(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    public final void a() {
        C c10 = this.f4043o;
        if (c10 == null) {
            this.f4041m = true;
            this.f4042n = true;
        } else if (c10 != null) {
            c10.a();
        }
    }

    public final C b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        C cD = d(j10, j11, j12, z10, this.f4033e, j13, j14, z11, i10, list, j15);
        C c10 = this.f4043o;
        if (c10 == null) {
            c10 = this;
        }
        cD.f4043o = c10;
        return cD;
    }

    public final C d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        C c10 = new C(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f4040l, null);
        C c11 = this.f4043o;
        if (c11 == null) {
            c11 = this;
        }
        c10.f4043o = c11;
        return c10;
    }

    public final List e() {
        List list = this.f4039k;
        return list == null ? AbstractC2279u.m() : list;
    }

    public final long f() {
        return this.f4029a;
    }

    public final long g() {
        return this.f4040l;
    }

    public final long h() {
        return this.f4031c;
    }

    public final boolean i() {
        return this.f4032d;
    }

    public final float j() {
        return this.f4033e;
    }

    public final long k() {
        return this.f4035g;
    }

    public final boolean l() {
        return this.f4036h;
    }

    public final long m() {
        return this.f4038j;
    }

    public final int n() {
        return this.f4037i;
    }

    public final long o() {
        return this.f4030b;
    }

    public final boolean p() {
        C c10 = this.f4043o;
        return c10 != null ? c10.p() : this.f4041m || this.f4042n;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) B.f(this.f4029a)) + ", uptimeMillis=" + this.f4030b + ", position=" + ((Object) C6224f.s(this.f4031c)) + ", pressed=" + this.f4032d + ", pressure=" + this.f4033e + ", previousUptimeMillis=" + this.f4034f + ", previousPosition=" + ((Object) C6224f.s(this.f4035g)) + ", previousPressed=" + this.f4036h + ", isConsumed=" + p() + ", type=" + ((Object) Q.i(this.f4037i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) C6224f.s(this.f4038j)) + ')';
    }

    public /* synthetic */ C(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15, j16);
    }

    private C(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f4029a = j10;
        this.f4030b = j11;
        this.f4031c = j12;
        this.f4032d = z10;
        this.f4033e = f10;
        this.f4034f = j13;
        this.f4035g = j14;
        this.f4036h = z11;
        this.f4037i = i10;
        this.f4038j = j15;
        this.f4040l = C6224f.f58329b.c();
        this.f4041m = z12;
        this.f4042n = z12;
    }

    public /* synthetic */ C(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? Q.f4086a.d() : i10, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? C6224f.f58329b.c() : j15, null);
    }

    private C(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this.f4039k = list;
        this.f4040l = j16;
    }
}
