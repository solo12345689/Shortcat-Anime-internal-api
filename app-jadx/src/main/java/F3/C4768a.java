package f3;

import java.util.Arrays;
import java.util.Objects;
import q2.C6078J;
import q2.C6109x;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4768a implements C6078J.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C6109x f46833g = new C6109x.b().y0("application/id3").P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C6109x f46834h = new C6109x.b().y0("application/x-scte35").P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f46839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46840f;

    public C4768a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f46835a = str;
        this.f46836b = str2;
        this.f46837c = j10;
        this.f46838d = j11;
        this.f46839e = bArr;
    }

    @Override // q2.C6078J.a
    public C6109x a() {
        String str = this.f46835a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f46834h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f46833g;
            default:
                return null;
        }
    }

    @Override // q2.C6078J.a
    public byte[] c() {
        if (a() != null) {
            return this.f46839e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4768a.class == obj.getClass()) {
            C4768a c4768a = (C4768a) obj;
            if (this.f46837c == c4768a.f46837c && this.f46838d == c4768a.f46838d && Objects.equals(this.f46835a, c4768a.f46835a) && Objects.equals(this.f46836b, c4768a.f46836b) && Arrays.equals(this.f46839e, c4768a.f46839e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f46840f == 0) {
            String str = this.f46835a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f46836b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f46837c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f46838d;
            this.f46840f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f46839e);
        }
        return this.f46840f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f46835a + ", id=" + this.f46838d + ", durationMs=" + this.f46837c + ", value=" + this.f46836b;
    }
}
