package j6;

import a6.InterfaceC2583d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5336a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0814a f51659c = new C0814a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2583d f51660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51661b;

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0814a {
        public /* synthetic */ C0814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0814a() {
        }
    }

    public C5336a(InterfaceC2583d animationInformation) {
        AbstractC5504s.h(animationInformation, "animationInformation");
        this.f51660a = animationInformation;
        this.f51661b = -1L;
    }

    @Override // j6.b
    public long a(long j10) {
        long jD = d();
        long jK = 0;
        if (jD == 0) {
            return -1L;
        }
        if (!e() && j10 / jD >= this.f51660a.b()) {
            return -1L;
        }
        long j11 = j10 % jD;
        int iA = this.f51660a.a();
        for (int i10 = 0; i10 < iA && jK <= j11; i10++) {
            jK += (long) this.f51660a.k(i10);
        }
        return j10 + (jK - j11);
    }

    @Override // j6.b
    public int b(long j10, long j11) {
        long jD = d();
        if (jD == 0) {
            return c(0L);
        }
        if (e() || j10 / jD < this.f51660a.b()) {
            return c(j10 % jD);
        }
        return -1;
    }

    public final int c(long j10) {
        int i10 = 0;
        long jK = 0;
        while (true) {
            jK += (long) this.f51660a.k(i10);
            int i11 = i10 + 1;
            if (j10 < jK) {
                return i10;
            }
            i10 = i11;
        }
    }

    public long d() {
        long j10 = this.f51661b;
        if (j10 != -1) {
            return j10;
        }
        this.f51661b = 0L;
        int iA = this.f51660a.a();
        for (int i10 = 0; i10 < iA; i10++) {
            this.f51661b += (long) this.f51660a.k(i10);
        }
        return this.f51661b;
    }

    public boolean e() {
        return this.f51660a.b() == 0;
    }
}
