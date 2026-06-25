package E2;

import android.net.Uri;
import t2.Q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4257d;

    public i(String str, long j10, long j11) {
        this.f4256c = str == null ? "" : str;
        this.f4254a = j10;
        this.f4255b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f4255b;
            if (j10 != -1) {
                long j11 = this.f4254a;
                if (j11 + j10 == iVar.f4254a) {
                    long j12 = iVar.f4255b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f4255b;
            if (j13 != -1) {
                long j14 = iVar.f4254a;
                if (j14 + j13 == this.f4254a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return Q.g(str, this.f4256c);
    }

    public String c(String str) {
        return Q.f(str, this.f4256c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f4254a == iVar.f4254a && this.f4255b == iVar.f4255b && this.f4256c.equals(iVar.f4256c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f4257d == 0) {
            this.f4257d = ((((527 + ((int) this.f4254a)) * 31) + ((int) this.f4255b)) * 31) + this.f4256c.hashCode();
        }
        return this.f4257d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f4256c + ", start=" + this.f4254a + ", length=" + this.f4255b + ")";
    }
}
