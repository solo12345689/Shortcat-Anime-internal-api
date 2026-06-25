package w2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: w2.D */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6930D implements InterfaceC6940g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6940g f62773a;

    /* JADX INFO: renamed from: b */
    private long f62774b;

    /* JADX INFO: renamed from: c */
    private Uri f62775c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    private Map f62776d = Collections.EMPTY_MAP;

    public C6930D(InterfaceC6940g interfaceC6940g) {
        this.f62773a = (InterfaceC6940g) AbstractC6614a.e(interfaceC6940g);
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) {
        this.f62775c = oVar.f62825a;
        this.f62776d = Collections.EMPTY_MAP;
        try {
            return this.f62773a.a(oVar);
        } finally {
            Uri uriC = c();
            if (uriC != null) {
                this.f62775c = uriC;
            }
            this.f62776d = f();
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62773a.c();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62773a.close();
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        return this.f62773a.f();
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f62773a.i(interfaceC6932F);
    }

    public long p() {
        return this.f62774b;
    }

    public Uri q() {
        return this.f62775c;
    }

    public Map r() {
        return this.f62776d;
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f62773a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f62774b += (long) i12;
        }
        return i12;
    }

    public void s() {
        this.f62774b = 0L;
    }
}
