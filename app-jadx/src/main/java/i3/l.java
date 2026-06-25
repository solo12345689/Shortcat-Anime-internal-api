package i3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f48628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f48629f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f48625b = i10;
        this.f48626c = i11;
        this.f48627d = i12;
        this.f48628e = iArr;
        this.f48629f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f48625b == lVar.f48625b && this.f48626c == lVar.f48626c && this.f48627d == lVar.f48627d && Arrays.equals(this.f48628e, lVar.f48628e) && Arrays.equals(this.f48629f, lVar.f48629f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f48625b) * 31) + this.f48626c) * 31) + this.f48627d) * 31) + Arrays.hashCode(this.f48628e)) * 31) + Arrays.hashCode(this.f48629f);
    }
}
