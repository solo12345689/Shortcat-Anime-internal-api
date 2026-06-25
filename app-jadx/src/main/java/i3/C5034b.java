package i3;

import java.util.Arrays;

/* JADX INFO: renamed from: i3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5034b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f48596b;

    public C5034b(String str, byte[] bArr) {
        super(str);
        this.f48596b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5034b.class == obj.getClass()) {
            C5034b c5034b = (C5034b) obj;
            if (this.f48620a.equals(c5034b.f48620a) && Arrays.equals(this.f48596b, c5034b.f48596b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f48620a.hashCode()) * 31) + Arrays.hashCode(this.f48596b);
    }
}
