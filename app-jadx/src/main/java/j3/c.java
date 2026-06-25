package j3;

import P9.AbstractC2004m;
import j3.c;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import q2.C6078J;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51619a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator f51620d = new Comparator() { // from class: j3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return AbstractC2004m.j().e(aVar.f51621a, aVar2.f51621a).e(aVar.f51622b, aVar2.f51622b).d(aVar.f51623c, aVar2.f51623c).i();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51623c;

        public a(long j10, long j11, int i10) {
            AbstractC6614a.a(j10 < j11);
            this.f51621a = j10;
            this.f51622b = j11;
            this.f51623c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f51621a == aVar.f51621a && this.f51622b == aVar.f51622b && this.f51623c == aVar.f51623c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f51621a), Long.valueOf(this.f51622b), Integer.valueOf(this.f51623c));
        }

        public String toString() {
            return a0.I("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f51621a), Long.valueOf(this.f51622b), Integer.valueOf(this.f51623c));
        }
    }

    public c(List list) {
        this.f51619a = list;
        AbstractC6614a.a(!d(list));
    }

    private static boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((a) list.get(0)).f51622b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f51621a < j10) {
                return true;
            }
            j10 = ((a) list.get(i10)).f51622b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f51619a.equals(((c) obj).f51619a);
    }

    public int hashCode() {
        return this.f51619a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f51619a;
    }
}
