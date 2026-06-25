package i3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f48602g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f48597b = str;
        this.f48598c = i10;
        this.f48599d = i11;
        this.f48600e = j10;
        this.f48601f = j11;
        this.f48602g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f48598c == cVar.f48598c && this.f48599d == cVar.f48599d && this.f48600e == cVar.f48600e && this.f48601f == cVar.f48601f && Objects.equals(this.f48597b, cVar.f48597b) && Arrays.equals(this.f48602g, cVar.f48602g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f48598c) * 31) + this.f48599d) * 31) + ((int) this.f48600e)) * 31) + ((int) this.f48601f)) * 31;
        String str = this.f48597b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
