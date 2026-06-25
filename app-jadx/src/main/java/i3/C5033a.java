package i3;

import java.util.Arrays;
import java.util.Objects;
import q2.C6077I;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5033a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f48595e;

    public C5033a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f48592b = str;
        this.f48593c = str2;
        this.f48594d = i10;
        this.f48595e = bArr;
    }

    @Override // q2.C6078J.a
    public void b(C6077I.b bVar) {
        bVar.K(this.f48595e, this.f48594d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5033a.class == obj.getClass()) {
            C5033a c5033a = (C5033a) obj;
            if (this.f48594d == c5033a.f48594d && Objects.equals(this.f48592b, c5033a.f48592b) && Objects.equals(this.f48593c, c5033a.f48593c) && Arrays.equals(this.f48595e, c5033a.f48595e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f48594d) * 31;
        String str = this.f48592b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48593c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f48595e);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": mimeType=" + this.f48592b + ", description=" + this.f48593c;
    }
}
