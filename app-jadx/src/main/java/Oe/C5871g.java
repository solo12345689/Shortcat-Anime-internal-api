package oe;

import Ud.P;
import ce.AbstractC3098c;
import je.InterfaceC5371a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oe.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5871g implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55405d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f55408c;

    /* JADX INFO: renamed from: oe.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5871g a(long j10, long j11, long j12) {
            return new C5871g(j10, j11, j12);
        }

        private a() {
        }
    }

    public C5871g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f55406a = j10;
        this.f55407b = AbstractC3098c.d(j10, j11, j12);
        this.f55408c = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5871g)) {
            return false;
        }
        if (isEmpty() && ((C5871g) obj).isEmpty()) {
            return true;
        }
        C5871g c5871g = (C5871g) obj;
        return this.f55406a == c5871g.f55406a && this.f55407b == c5871g.f55407b && this.f55408c == c5871g.f55408c;
    }

    public final long f() {
        return this.f55406a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f55406a;
        long j12 = this.f55407b;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f55408c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public final long i() {
        return this.f55407b;
    }

    public boolean isEmpty() {
        long j10 = this.f55408c;
        long j11 = this.f55406a;
        long j12 = this.f55407b;
        return j10 > 0 ? j11 > j12 : j11 < j12;
    }

    public final long l() {
        return this.f55408c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public P iterator() {
        return new C5872h(this.f55406a, this.f55407b, this.f55408c);
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f55408c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f55406a);
            sb2.append("..");
            sb2.append(this.f55407b);
            sb2.append(" step ");
            j10 = this.f55408c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f55406a);
            sb2.append(" downTo ");
            sb2.append(this.f55407b);
            sb2.append(" step ");
            j10 = -this.f55408c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
