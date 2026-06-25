package r8;

import java.util.Arrays;
import p8.C5938c;

/* JADX INFO: renamed from: r8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6282h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5938c f58699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f58700b;

    public C6282h(C5938c c5938c, byte[] bArr) {
        if (c5938c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f58699a = c5938c;
        this.f58700b = bArr;
    }

    public byte[] a() {
        return this.f58700b;
    }

    public C5938c b() {
        return this.f58699a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6282h)) {
            return false;
        }
        C6282h c6282h = (C6282h) obj;
        if (this.f58699a.equals(c6282h.f58699a)) {
            return Arrays.equals(this.f58700b, c6282h.f58700b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f58699a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f58700b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f58699a + ", bytes=[...]}";
    }
}
