package w2;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: w2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6938e extends AbstractC6935b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f62805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f62806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62808h;

    public C6938e() {
        super(false);
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws C6080L, l {
        r(oVar);
        this.f62805e = oVar;
        Uri uriNormalizeScheme = oVar.f62825a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC6614a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrV1 = a0.v1(uriNormalizeScheme.getSchemeSpecificPart(), com.amazon.a.a.o.b.f.f34694a);
        if (strArrV1.length != 2) {
            throw C6080L.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrV1[1];
        if (strArrV1[0].contains(";base64")) {
            try {
                this.f62806f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw C6080L.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f62806f = a0.z0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = oVar.f62831g;
        byte[] bArr = this.f62806f;
        if (j10 > bArr.length) {
            this.f62806f = null;
            throw new l(2008);
        }
        int i10 = (int) j10;
        this.f62807g = i10;
        int length = bArr.length - i10;
        this.f62808h = length;
        long j11 = oVar.f62832h;
        if (j11 != -1) {
            this.f62808h = (int) Math.min(length, j11);
        }
        s(oVar);
        long j12 = oVar.f62832h;
        return j12 != -1 ? j12 : this.f62808h;
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        o oVar = this.f62805e;
        if (oVar != null) {
            return oVar.f62825a;
        }
        return null;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        if (this.f62806f != null) {
            this.f62806f = null;
            q();
        }
        this.f62805e = null;
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f62808h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(a0.l(this.f62806f), this.f62807g, bArr, i10, iMin);
        this.f62807g += iMin;
        this.f62808h -= iMin;
        p(iMin);
        return iMin;
    }
}
