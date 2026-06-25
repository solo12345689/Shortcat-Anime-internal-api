package z2;

import android.media.MediaCodec;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: z2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7278c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f65541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f65542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f65544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f65545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f65548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f65549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f65550j;

    /* JADX INFO: renamed from: z2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f65551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f65552b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f65552b.set(i10, i11);
            this.f65551a.setPattern(this.f65552b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f65551a = cryptoInfo;
            this.f65552b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C7278c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f65549i = cryptoInfo;
        this.f65550j = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f65549i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f65544d == null) {
            int[] iArr = new int[1];
            this.f65544d = iArr;
            this.f65549i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f65544d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f65546f = i10;
        this.f65544d = iArr;
        this.f65545e = iArr2;
        this.f65542b = bArr;
        this.f65541a = bArr2;
        this.f65543c = i11;
        this.f65547g = i12;
        this.f65548h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f65549i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        ((b) AbstractC6614a.e(this.f65550j)).b(i12, i13);
    }
}
