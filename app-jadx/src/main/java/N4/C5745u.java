package n4;

import Ud.AbstractC2279u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import i4.EnumC5035a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import q.InterfaceC6054a;

/* JADX INFO: renamed from: n4.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5745u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f53940u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f53941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC6054a f53942w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i4.s f53944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f53947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f53948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f53951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i4.b f53952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC5035a f53954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f53955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f53956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f53957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f53958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i4.m f53960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f53961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f53962t;

    /* JADX INFO: renamed from: n4.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: n4.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f53963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i4.s f53964b;

        public b(String id2, i4.s state) {
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(state, "state");
            this.f53963a = id2;
            this.f53964b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f53963a, bVar.f53963a) && this.f53964b == bVar.f53964b;
        }

        public int hashCode() {
            return (this.f53963a.hashCode() * 31) + this.f53964b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f53963a + ", state=" + this.f53964b + ')';
        }
    }

    static {
        String strI = i4.i.i("WorkSpec");
        AbstractC5504s.g(strI, "tagWithPrefix(\"WorkSpec\")");
        f53941v = strI;
        f53942w = new InterfaceC6054a() { // from class: n4.t
            @Override // q.InterfaceC6054a
            public final Object apply(Object obj) {
                return C5745u.b((List) obj);
            }
        };
    }

    public C5745u(String id2, i4.s state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, i4.b constraints, int i10, EnumC5035a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, i4.m outOfQuotaPolicy, int i11, int i12) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(workerClassName, "workerClassName");
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(output, "output");
        AbstractC5504s.h(constraints, "constraints");
        AbstractC5504s.h(backoffPolicy, "backoffPolicy");
        AbstractC5504s.h(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f53943a = id2;
        this.f53944b = state;
        this.f53945c = workerClassName;
        this.f53946d = str;
        this.f53947e = input;
        this.f53948f = output;
        this.f53949g = j10;
        this.f53950h = j11;
        this.f53951i = j12;
        this.f53952j = constraints;
        this.f53953k = i10;
        this.f53954l = backoffPolicy;
        this.f53955m = j13;
        this.f53956n = j14;
        this.f53957o = j15;
        this.f53958p = j16;
        this.f53959q = z10;
        this.f53960r = outOfQuotaPolicy;
        this.f53961s = i11;
        this.f53962t = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public static /* synthetic */ C5745u e(C5745u c5745u, String str, i4.s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, i4.b bVar3, int i10, EnumC5035a enumC5035a, long j13, long j14, long j15, long j16, boolean z10, i4.m mVar, int i11, int i12, int i13, Object obj) {
        int i14;
        i4.m mVar2;
        String str4 = (i13 & 1) != 0 ? c5745u.f53943a : str;
        i4.s sVar2 = (i13 & 2) != 0 ? c5745u.f53944b : sVar;
        String str5 = (i13 & 4) != 0 ? c5745u.f53945c : str2;
        String str6 = (i13 & 8) != 0 ? c5745u.f53946d : str3;
        androidx.work.b bVar4 = (i13 & 16) != 0 ? c5745u.f53947e : bVar;
        androidx.work.b bVar5 = (i13 & 32) != 0 ? c5745u.f53948f : bVar2;
        long j17 = (i13 & 64) != 0 ? c5745u.f53949g : j10;
        long j18 = (i13 & 128) != 0 ? c5745u.f53950h : j11;
        long j19 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? c5745u.f53951i : j12;
        i4.b bVar6 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? c5745u.f53952j : bVar3;
        int i15 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? c5745u.f53953k : i10;
        String str7 = str4;
        EnumC5035a enumC5035a2 = (i13 & 2048) != 0 ? c5745u.f53954l : enumC5035a;
        i4.s sVar3 = sVar2;
        long j20 = (i13 & 4096) != 0 ? c5745u.f53955m : j13;
        long j21 = (i13 & 8192) != 0 ? c5745u.f53956n : j14;
        long j22 = (i13 & 16384) != 0 ? c5745u.f53957o : j15;
        long j23 = (i13 & 32768) != 0 ? c5745u.f53958p : j16;
        boolean z11 = (i13 & 65536) != 0 ? c5745u.f53959q : z10;
        long j24 = j23;
        i4.m mVar3 = (i13 & 131072) != 0 ? c5745u.f53960r : mVar;
        int i16 = (i13 & 262144) != 0 ? c5745u.f53961s : i11;
        if ((i13 & 524288) != 0) {
            mVar2 = mVar3;
            i14 = c5745u.f53962t;
        } else {
            i14 = i12;
            mVar2 = mVar3;
        }
        return c5745u.d(str7, sVar3, str5, str6, bVar4, bVar5, j17, j18, j19, bVar6, i15, enumC5035a2, j20, j21, j22, j24, z11, mVar2, i16, i14);
    }

    public final long c() {
        if (i()) {
            return this.f53956n + AbstractC5874j.j(this.f53954l == EnumC5035a.LINEAR ? this.f53955m * ((long) this.f53953k) : (long) Math.scalb(this.f53955m, this.f53953k - 1), 18000000L);
        }
        if (!j()) {
            long jCurrentTimeMillis = this.f53956n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f53949g;
        }
        int i10 = this.f53961s;
        long j10 = this.f53956n;
        if (i10 == 0) {
            j10 += this.f53949g;
        }
        long j11 = this.f53951i;
        long j12 = this.f53950h;
        if (j11 != j12) {
            return j10 + j12 + (i10 == 0 ? ((long) (-1)) * j11 : 0L);
        }
        return j10 + (i10 != 0 ? j12 : 0L);
    }

    public final C5745u d(String id2, i4.s state, String workerClassName, String str, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, i4.b constraints, int i10, EnumC5035a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, i4.m outOfQuotaPolicy, int i11, int i12) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(workerClassName, "workerClassName");
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(output, "output");
        AbstractC5504s.h(constraints, "constraints");
        AbstractC5504s.h(backoffPolicy, "backoffPolicy");
        AbstractC5504s.h(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C5745u(id2, state, workerClassName, str, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5745u)) {
            return false;
        }
        C5745u c5745u = (C5745u) obj;
        return AbstractC5504s.c(this.f53943a, c5745u.f53943a) && this.f53944b == c5745u.f53944b && AbstractC5504s.c(this.f53945c, c5745u.f53945c) && AbstractC5504s.c(this.f53946d, c5745u.f53946d) && AbstractC5504s.c(this.f53947e, c5745u.f53947e) && AbstractC5504s.c(this.f53948f, c5745u.f53948f) && this.f53949g == c5745u.f53949g && this.f53950h == c5745u.f53950h && this.f53951i == c5745u.f53951i && AbstractC5504s.c(this.f53952j, c5745u.f53952j) && this.f53953k == c5745u.f53953k && this.f53954l == c5745u.f53954l && this.f53955m == c5745u.f53955m && this.f53956n == c5745u.f53956n && this.f53957o == c5745u.f53957o && this.f53958p == c5745u.f53958p && this.f53959q == c5745u.f53959q && this.f53960r == c5745u.f53960r && this.f53961s == c5745u.f53961s && this.f53962t == c5745u.f53962t;
    }

    public final int f() {
        return this.f53962t;
    }

    public final int g() {
        return this.f53961s;
    }

    public final boolean h() {
        return !AbstractC5504s.c(i4.b.f48641j, this.f53952j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    public int hashCode() {
        int iHashCode = ((((this.f53943a.hashCode() * 31) + this.f53944b.hashCode()) * 31) + this.f53945c.hashCode()) * 31;
        String str = this.f53946d;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f53947e.hashCode()) * 31) + this.f53948f.hashCode()) * 31) + Long.hashCode(this.f53949g)) * 31) + Long.hashCode(this.f53950h)) * 31) + Long.hashCode(this.f53951i)) * 31) + this.f53952j.hashCode()) * 31) + Integer.hashCode(this.f53953k)) * 31) + this.f53954l.hashCode()) * 31) + Long.hashCode(this.f53955m)) * 31) + Long.hashCode(this.f53956n)) * 31) + Long.hashCode(this.f53957o)) * 31) + Long.hashCode(this.f53958p)) * 31;
        boolean z10 = this.f53959q;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((((iHashCode2 + r12) * 31) + this.f53960r.hashCode()) * 31) + Integer.hashCode(this.f53961s)) * 31) + Integer.hashCode(this.f53962t);
    }

    public final boolean i() {
        return this.f53944b == i4.s.ENQUEUED && this.f53953k > 0;
    }

    public final boolean j() {
        return this.f53950h != 0;
    }

    public final void k(long j10) {
        if (j10 < 900000) {
            i4.i.e().k(f53941v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        l(AbstractC5874j.f(j10, 900000L), AbstractC5874j.f(j10, 900000L));
    }

    public final void l(long j10, long j11) {
        if (j10 < 900000) {
            i4.i.e().k(f53941v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f53950h = AbstractC5874j.f(j10, 900000L);
        if (j11 < 300000) {
            i4.i.e().k(f53941v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f53950h) {
            i4.i.e().k(f53941v, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f53951i = AbstractC5874j.o(j11, 300000L, this.f53950h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f53943a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5745u(String str, i4.s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, i4.b bVar3, int i10, EnumC5035a enumC5035a, long j13, long j14, long j15, long j16, boolean z10, i4.m mVar, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        androidx.work.b bVar4;
        androidx.work.b bVar5;
        i4.s sVar2 = (i13 & 2) != 0 ? i4.s.ENQUEUED : sVar;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.b EMPTY = androidx.work.b.f32690c;
            AbstractC5504s.g(EMPTY, "EMPTY");
            bVar4 = EMPTY;
        } else {
            bVar4 = bVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.b EMPTY2 = androidx.work.b.f32690c;
            AbstractC5504s.g(EMPTY2, "EMPTY");
            bVar5 = EMPTY2;
        } else {
            bVar5 = bVar2;
        }
        this(str, sVar2, str2, str4, bVar4, bVar5, (i13 & 64) != 0 ? 0L : j10, (i13 & 128) != 0 ? 0L : j11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? i4.b.f48641j : bVar3, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 0 : i10, (i13 & 2048) != 0 ? EnumC5035a.EXPONENTIAL : enumC5035a, (i13 & 4096) != 0 ? HTTPTimeoutManager.DEFAULT_TIMEOUT_MS : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? i4.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST : mVar, (262144 & i13) != 0 ? 0 : i11, (i13 & 524288) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5745u(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5745u(String newId, C5745u other) {
        this(newId, other.f53944b, other.f53945c, other.f53946d, new androidx.work.b(other.f53947e), new androidx.work.b(other.f53948f), other.f53949g, other.f53950h, other.f53951i, new i4.b(other.f53952j), other.f53953k, other.f53954l, other.f53955m, other.f53956n, other.f53957o, other.f53958p, other.f53959q, other.f53960r, other.f53961s, 0, 524288, null);
        AbstractC5504s.h(newId, "newId");
        AbstractC5504s.h(other, "other");
    }
}
