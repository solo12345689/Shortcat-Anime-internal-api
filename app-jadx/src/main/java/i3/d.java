package i3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f48606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f48607f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f48603b = str;
        this.f48604c = z10;
        this.f48605d = z11;
        this.f48606e = strArr;
        this.f48607f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f48604c == dVar.f48604c && this.f48605d == dVar.f48605d && Objects.equals(this.f48603b, dVar.f48603b) && Arrays.equals(this.f48606e, dVar.f48606e) && Arrays.equals(this.f48607f, dVar.f48607f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f48604c ? 1 : 0)) * 31) + (this.f48605d ? 1 : 0)) * 31;
        String str = this.f48603b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
