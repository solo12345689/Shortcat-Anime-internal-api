package i3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f48614e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f48611b = str;
        this.f48612c = str2;
        this.f48613d = str3;
        this.f48614e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f48611b, fVar.f48611b) && Objects.equals(this.f48612c, fVar.f48612c) && Objects.equals(this.f48613d, fVar.f48613d) && Arrays.equals(this.f48614e, fVar.f48614e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f48611b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48612c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48613d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f48614e);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": mimeType=" + this.f48611b + ", filename=" + this.f48612c + ", description=" + this.f48613d;
    }
}
