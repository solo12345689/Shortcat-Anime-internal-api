package androidx.media;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30305a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30306b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30307c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30308d = -1;

    public int a() {
        return this.f30306b;
    }

    public int b() {
        int i10 = this.f30307c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f30308d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f30307c, this.f30305a);
    }

    public int d() {
        return this.f30305a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f30306b == audioAttributesImplBase.a() && this.f30307c == audioAttributesImplBase.b() && this.f30305a == audioAttributesImplBase.d() && this.f30308d == audioAttributesImplBase.f30308d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30306b), Integer.valueOf(this.f30307c), Integer.valueOf(this.f30305a), Integer.valueOf(this.f30308d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f30308d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f30308d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f30305a));
        sb2.append(" content=");
        sb2.append(this.f30306b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f30307c).toUpperCase());
        return sb2.toString();
    }
}
