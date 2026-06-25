package o3;

import U2.O;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.a f54423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f54425e;

    public u(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC6614a.a((bArr2 == null) ^ (i10 == 0));
        this.f54421a = z10;
        this.f54422b = str;
        this.f54424d = i10;
        this.f54425e = bArr2;
        this.f54423c = new O.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC6635w.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
