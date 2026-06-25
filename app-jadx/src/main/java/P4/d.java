package P4;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f13489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f13490c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f13488a = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13491d = 0;

    private boolean b() {
        return this.f13490c.f13476b != 0;
    }

    private int d() {
        try {
            return this.f13489b.get() & 255;
        } catch (Exception unused) {
            this.f13490c.f13476b = 1;
            return 0;
        }
    }

    private void e() {
        this.f13490c.f13478d.f13464a = n();
        this.f13490c.f13478d.f13465b = n();
        this.f13490c.f13478d.f13466c = n();
        this.f13490c.f13478d.f13467d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f13490c.f13478d;
        bVar.f13468e = (iD & 64) != 0;
        if (z10) {
            bVar.f13474k = g(iPow);
        } else {
            bVar.f13474k = null;
        }
        this.f13490c.f13478d.f13473j = this.f13489b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f13490c;
        cVar.f13477c++;
        cVar.f13479e.add(cVar.f13478d);
    }

    private void f() {
        int iD = d();
        this.f13491d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f13491d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f13489b.get(this.f13488a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f13491d, e10);
                }
                this.f13490c.f13476b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f13489b.get(bArr);
            iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f13490c.f13476b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f13490c.f13477c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f13490c.f13478d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f13488a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f13490c;
                if (cVar.f13478d == null) {
                    cVar.f13478d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f13490c.f13476b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f13490c.f13478d;
        int i10 = (iD & 28) >> 2;
        bVar.f13470g = i10;
        if (i10 == 0) {
            bVar.f13470g = 1;
        }
        bVar.f13469f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f13490c.f13478d;
        bVar2.f13472i = iN * 10;
        bVar2.f13471h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f13490c.f13476b = 1;
            return;
        }
        l();
        if (!this.f13490c.f13482h || b()) {
            return;
        }
        c cVar = this.f13490c;
        cVar.f13475a = g(cVar.f13483i);
        c cVar2 = this.f13490c;
        cVar2.f13486l = cVar2.f13475a[cVar2.f13484j];
    }

    private void l() {
        this.f13490c.f13480f = n();
        this.f13490c.f13481g = n();
        int iD = d();
        c cVar = this.f13490c;
        cVar.f13482h = (iD & 128) != 0;
        cVar.f13483i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f13490c.f13484j = d();
        this.f13490c.f13485k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f13488a;
            if (bArr[0] == 1) {
                this.f13490c.f13487m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f13491d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f13489b.getShort();
    }

    private void o() {
        this.f13489b = null;
        Arrays.fill(this.f13488a, (byte) 0);
        this.f13490c = new c();
        this.f13491d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f13489b.position(Math.min(this.f13489b.position() + iD, this.f13489b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f13489b = null;
        this.f13490c = null;
    }

    public c c() {
        if (this.f13489b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f13490c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f13490c;
            if (cVar.f13477c < 0) {
                cVar.f13476b = 1;
            }
        }
        return this.f13490c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f13489b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f13489b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
