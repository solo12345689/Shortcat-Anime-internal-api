package M2;

import android.net.Uri;
import java.util.Map;
import t2.AbstractC6614a;
import t2.C6609I;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;

/* JADX INFO: renamed from: M2.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1933x implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6940g f12050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f12053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12054e;

    /* JADX INFO: renamed from: M2.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void b(C6609I c6609i);
    }

    public C1933x(InterfaceC6940g interfaceC6940g, int i10, a aVar) {
        AbstractC6614a.a(i10 > 0);
        this.f12050a = interfaceC6940g;
        this.f12051b = i10;
        this.f12052c = aVar;
        this.f12053d = new byte[1];
        this.f12054e = i10;
    }

    private boolean p() {
        if (this.f12050a.read(this.f12053d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f12053d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f12050a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f12052c.b(new C6609I(bArr, i10));
        }
        return true;
    }

    @Override // w2.InterfaceC6940g
    public long a(w2.o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f12050a.c();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        return this.f12050a.f();
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f12050a.i(interfaceC6932F);
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f12054e == 0) {
            if (!p()) {
                return -1;
            }
            this.f12054e = this.f12051b;
        }
        int i12 = this.f12050a.read(bArr, i10, Math.min(this.f12054e, i11));
        if (i12 != -1) {
            this.f12054e -= i12;
        }
        return i12;
    }
}
