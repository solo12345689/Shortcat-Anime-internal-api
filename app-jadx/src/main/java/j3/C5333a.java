package j3;

import S9.h;
import q2.C6078J;

/* JADX INFO: renamed from: j3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5333a implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f51618e;

    public C5333a(long j10, long j11, long j12, long j13, long j14) {
        this.f51614a = j10;
        this.f51615b = j11;
        this.f51616c = j12;
        this.f51617d = j13;
        this.f51618e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5333a.class == obj.getClass()) {
            C5333a c5333a = (C5333a) obj;
            if (this.f51614a == c5333a.f51614a && this.f51615b == c5333a.f51615b && this.f51616c == c5333a.f51616c && this.f51617d == c5333a.f51617d && this.f51618e == c5333a.f51618e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f51614a)) * 31) + h.c(this.f51615b)) * 31) + h.c(this.f51616c)) * 31) + h.c(this.f51617d)) * 31) + h.c(this.f51618e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f51614a + ", photoSize=" + this.f51615b + ", photoPresentationTimestampUs=" + this.f51616c + ", videoStartPosition=" + this.f51617d + ", videoSize=" + this.f51618e;
    }
}
