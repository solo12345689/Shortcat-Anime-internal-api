package q2;

import java.util.Arrays;
import java.util.List;
import q2.C6077I;

/* JADX INFO: renamed from: q2.J */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6078J {

    /* JADX INFO: renamed from: a */
    private final a[] f56579a;

    /* JADX INFO: renamed from: b */
    public final long f56580b;

    public C6078J(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public C6078J a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new C6078J(this.f56580b, (a[]) t2.a0.a1(this.f56579a, aVarArr));
    }

    public C6078J b(C6078J c6078j) {
        return c6078j == null ? this : a(c6078j.f56579a);
    }

    public C6078J c(long j10) {
        return this.f56580b == j10 ? this : new C6078J(j10, this.f56579a);
    }

    public a d(int i10) {
        return this.f56579a[i10];
    }

    public int e() {
        return this.f56579a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6078J.class == obj.getClass()) {
            C6078J c6078j = (C6078J) obj;
            if (Arrays.equals(this.f56579a, c6078j.f56579a) && this.f56580b == c6078j.f56580b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f56579a) * 31) + S9.h.c(this.f56580b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f56579a));
        if (this.f56580b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f56580b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C6078J(long j10, a... aVarArr) {
        this.f56580b = j10;
        this.f56579a = aVarArr;
    }

    public C6078J(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public C6078J(long j10, List list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }

    /* JADX INFO: renamed from: q2.J$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        default C6109x a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(C6077I.b bVar) {
        }
    }
}
