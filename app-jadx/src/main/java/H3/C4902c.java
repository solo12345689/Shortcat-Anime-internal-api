package h3;

import java.util.Arrays;
import q2.C6077I;
import q2.C6078J;

/* JADX INFO: renamed from: h3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4902c implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47605c;

    public C4902c(byte[] bArr, String str, String str2) {
        this.f47603a = bArr;
        this.f47604b = str;
        this.f47605c = str2;
    }

    @Override // q2.C6078J.a
    public void b(C6077I.b bVar) {
        String str = this.f47604b;
        if (str != null) {
            bVar.q0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4902c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f47603a, ((C4902c) obj).f47603a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f47603a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f47604b, this.f47605c, Integer.valueOf(this.f47603a.length));
    }
}
