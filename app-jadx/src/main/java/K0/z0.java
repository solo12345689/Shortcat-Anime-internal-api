package K0;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z0 {

    /* JADX INFO: renamed from: a */
    private int f10836a;

    /* JADX INFO: renamed from: b */
    private androidx.compose.ui.layout.y[] f10837b = new androidx.compose.ui.layout.y[32];

    /* JADX INFO: renamed from: c */
    private float[] f10838c = new float[32];

    /* JADX INFO: renamed from: d */
    private byte[] f10839d = new byte[32];

    /* JADX INFO: renamed from: e */
    private t.Q f10840e = t.f0.b();

    /* JADX INFO: renamed from: f */
    private final t.Q f10841f = t.f0.b();

    public final void a() {
        int i10 = this.f10836a;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10837b[i11] = null;
            this.f10838c[i11] = Float.NaN;
            this.f10839d[i11] = 0;
        }
        this.f10836a = 0;
    }

    public final boolean b(androidx.compose.ui.layout.y yVar) {
        return AbstractC2273n.R(this.f10837b, yVar);
    }

    public final float c(androidx.compose.ui.layout.y yVar, float f10) {
        int iN0 = AbstractC2273n.n0(this.f10837b, yVar);
        return iN0 < 0 ? f10 : this.f10838c[iN0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r23, K0.T r24, t.C6550P r25) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.z0.d(boolean, K0.T, t.P):void");
    }

    public final void e(androidx.compose.ui.layout.y yVar, float f10) {
        int iN0 = AbstractC2273n.n0(this.f10837b, yVar);
        if (iN0 >= 0) {
            float[] fArr = this.f10838c;
            if (fArr[iN0] != f10) {
                fArr[iN0] = f10;
                this.f10839d[iN0] = 1;
                return;
            } else {
                byte[] bArr = this.f10839d;
                if (bArr[iN0] == 2) {
                    bArr[iN0] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = this.f10836a;
        androidx.compose.ui.layout.y[] yVarArr = this.f10837b;
        if (i10 == yVarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(yVarArr, i11);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            this.f10837b = (androidx.compose.ui.layout.y[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(this.f10838c, i11);
            AbstractC5504s.g(fArrCopyOf, "copyOf(...)");
            this.f10838c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(this.f10839d, i11);
            AbstractC5504s.g(bArrCopyOf, "copyOf(...)");
            this.f10839d = bArrCopyOf;
        }
        this.f10837b[i10] = yVar;
        this.f10839d[i10] = 3;
        this.f10838c[i10] = f10;
        this.f10836a++;
    }
}
