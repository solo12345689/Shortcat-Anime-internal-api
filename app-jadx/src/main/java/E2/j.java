package E2;

import E2.k;
import P9.AbstractC2011u;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6109x f4259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2011u f4260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f4264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f4265h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f4267i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f4268j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f4269k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f4270l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f4271m;

        public c(long j10, C6109x c6109x, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, c6109x, list, eVar, list2, list3, list4);
            this.f4267i = Uri.parse(((E2.b) list.get(0)).f4204a);
            i iVarC = eVar.c();
            this.f4270l = iVarC;
            this.f4269k = str;
            this.f4268j = j11;
            this.f4271m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // E2.j
        public String a() {
            return this.f4269k;
        }

        @Override // E2.j
        public D2.f b() {
            return this.f4271m;
        }

        @Override // E2.j
        public i c() {
            return this.f4270l;
        }
    }

    public static j o(long j10, C6109x c6109x, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, c6109x, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, c6109x, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract D2.f b();

    public abstract i c();

    public i n() {
        return this.f4265h;
    }

    private j(long j10, C6109x c6109x, List list, k kVar, List list2, List list3, List list4) {
        AbstractC6614a.a(!list.isEmpty());
        this.f4258a = j10;
        this.f4259b = c6109x;
        this.f4260c = AbstractC2011u.w(list);
        this.f4262e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f4263f = list3;
        this.f4264g = list4;
        this.f4265h = kVar.a(this);
        this.f4261d = kVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends j implements D2.f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f4266i;

        public b(long j10, C6109x c6109x, List list, k.a aVar, List list2, List list3, List list4) {
            super(j10, c6109x, list, aVar, list2, list3, list4);
            this.f4266i = aVar;
        }

        @Override // E2.j
        public String a() {
            return null;
        }

        @Override // E2.j
        public i c() {
            return null;
        }

        @Override // D2.f
        public long d(long j10) {
            return this.f4266i.j(j10);
        }

        @Override // D2.f
        public long e(long j10, long j11) {
            return this.f4266i.h(j10, j11);
        }

        @Override // D2.f
        public long f(long j10, long j11) {
            return this.f4266i.d(j10, j11);
        }

        @Override // D2.f
        public long g(long j10, long j11) {
            return this.f4266i.f(j10, j11);
        }

        @Override // D2.f
        public i h(long j10) {
            return this.f4266i.k(this, j10);
        }

        @Override // D2.f
        public long i(long j10, long j11) {
            return this.f4266i.i(j10, j11);
        }

        @Override // D2.f
        public long j(long j10) {
            return this.f4266i.g(j10);
        }

        @Override // D2.f
        public boolean k() {
            return this.f4266i.l();
        }

        @Override // D2.f
        public long l() {
            return this.f4266i.e();
        }

        @Override // D2.f
        public long m(long j10, long j11) {
            return this.f4266i.c(j10, j11);
        }

        @Override // E2.j
        public D2.f b() {
            return this;
        }
    }
}
