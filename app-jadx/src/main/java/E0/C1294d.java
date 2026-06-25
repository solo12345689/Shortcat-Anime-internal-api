package E0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: renamed from: E0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1294d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4134c;

    public /* synthetic */ C1294d(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f4134c;
    }

    public final long b() {
        return this.f4133b;
    }

    public final long c() {
        return this.f4132a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f4132a + ", position=" + ((Object) C6224f.s(this.f4133b)) + ')';
    }

    public /* synthetic */ C1294d(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private C1294d(long j10, long j11) {
        this.f4132a = j10;
        this.f4133b = j11;
        this.f4134c = C6224f.f58329b.c();
    }

    private C1294d(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.f4134c = j12;
    }
}
