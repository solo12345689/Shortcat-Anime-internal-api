package c3;

import j3.C5333a;
import java.util.List;

/* JADX INFO: renamed from: c3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C3070c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33446b;

    /* JADX INFO: renamed from: c3.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f33448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f33449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f33450d;

        public a(String str, String str2, long j10, long j11) {
            this.f33447a = str;
            this.f33448b = str2;
            this.f33449c = j10;
            this.f33450d = j11;
        }
    }

    public C3070c(long j10, List list) {
        this.f33445a = j10;
        this.f33446b = list;
    }

    public C5333a a(long j10) {
        long j11;
        if (this.f33446b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f33446b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f33446b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f33447a) | z10;
            if (size == 0) {
                j12 -= aVar.f33450d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f33449c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new C5333a(j13, j14, this.f33445a, j15, j16);
    }
}
