package i3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f48631c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f48630b = str;
        this.f48631c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f48630b, mVar.f48630b) && Arrays.equals(this.f48631c, mVar.f48631c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f48630b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f48631c);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": owner=" + this.f48630b;
    }
}
