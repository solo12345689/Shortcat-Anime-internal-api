package U2;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import q2.C6080L;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f19094a;
    }

    private static boolean a(C6609I c6609i, y yVar, int i10) {
        int iJ = j(c6609i, i10);
        return iJ != -1 && iJ <= yVar.f19099b;
    }

    private static boolean b(C6609I c6609i, int i10) {
        return c6609i.M() == a0.A(c6609i.f(), i10, c6609i.g() - 1, 0);
    }

    private static boolean c(C6609I c6609i, y yVar, boolean z10, a aVar) {
        try {
            long jV = c6609i.V();
            if (!z10) {
                jV *= (long) yVar.f19099b;
            }
            aVar.f19094a = jV;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(C6609I c6609i, y yVar, int i10, a aVar) {
        int iG = c6609i.g();
        long jO = c6609i.O();
        long j10 = jO >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jO >> 4) & 15), yVar) && f((int) ((jO >> 1) & 7), yVar) && !(((jO & 1) > 1L ? 1 : ((jO & 1) == 1L ? 0 : -1)) == 0) && c(c6609i, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(c6609i, yVar, (int) ((jO >> 12) & 15)) && e(c6609i, yVar, (int) ((jO >> 8) & 15)) && b(c6609i, iG);
    }

    private static boolean e(C6609I c6609i, y yVar, int i10) {
        int i11 = yVar.f19102e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f19103f;
        }
        if (i10 == 12) {
            return c6609i.M() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iU = c6609i.U();
            if (i10 == 14) {
                iU *= 10;
            }
            if (iU == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f19106i;
    }

    private static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f19104g - 1 : i10 <= 10 && yVar.f19104g == 2;
    }

    public static boolean h(InterfaceC2256q interfaceC2256q, y yVar, int i10, a aVar) {
        long j10 = interfaceC2256q.j();
        byte[] bArr = new byte[2];
        interfaceC2256q.o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC2256q.g();
            interfaceC2256q.k((int) (j10 - interfaceC2256q.getPosition()));
            return false;
        }
        C6609I c6609i = new C6609I(16);
        System.arraycopy(bArr, 0, c6609i.f(), 0, 2);
        c6609i.a0(AbstractC2257s.d(interfaceC2256q, c6609i.f(), 2, 14));
        interfaceC2256q.g();
        interfaceC2256q.k((int) (j10 - interfaceC2256q.getPosition()));
        return d(c6609i, yVar, i10, aVar);
    }

    public static long i(InterfaceC2256q interfaceC2256q, y yVar) throws C6080L {
        interfaceC2256q.g();
        interfaceC2256q.k(1);
        byte[] bArr = new byte[1];
        interfaceC2256q.o(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC2256q.k(2);
        int i10 = z10 ? 7 : 6;
        C6609I c6609i = new C6609I(i10);
        c6609i.a0(AbstractC2257s.d(interfaceC2256q, c6609i.f(), 0, i10));
        interfaceC2256q.g();
        a aVar = new a();
        if (c(c6609i, yVar, z10, aVar)) {
            return aVar.f19094a;
        }
        throw C6080L.a(null, null);
    }

    public static int j(C6609I c6609i, int i10) {
        switch (i10) {
            case 1:
                return JfifUtil.MARKER_SOFn;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c6609i.M() + 1;
            case 7:
                return c6609i.U() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER << (i10 - 8);
            default:
                return -1;
        }
    }
}
