package w2;

import android.net.Uri;
import java.util.Map;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: w2.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6931E implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6940g f62777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6939f f62778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62780d;

    public C6931E(InterfaceC6940g interfaceC6940g, InterfaceC6939f interfaceC6939f) {
        this.f62777a = (InterfaceC6940g) AbstractC6614a.e(interfaceC6940g);
        this.f62778b = (InterfaceC6939f) AbstractC6614a.e(interfaceC6939f);
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) {
        long jA = this.f62777a.a(oVar);
        this.f62780d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (oVar.f62832h == -1 && jA != -1) {
            oVar = oVar.f(0L, jA);
        }
        this.f62779c = true;
        this.f62778b.a(oVar);
        return this.f62780d;
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62777a.c();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        try {
            this.f62777a.close();
        } finally {
            if (this.f62779c) {
                this.f62779c = false;
                this.f62778b.close();
            }
        }
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        return this.f62777a.f();
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f62777a.i(interfaceC6932F);
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f62780d == 0) {
            return -1;
        }
        int i12 = this.f62777a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f62778b.write(bArr, i10, i12);
            long j10 = this.f62780d;
            if (j10 != -1) {
                this.f62780d = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
