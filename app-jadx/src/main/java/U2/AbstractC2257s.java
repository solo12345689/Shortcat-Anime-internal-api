package U2;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.io.EOFException;
import q2.C6080L;

/* JADX INFO: renamed from: U2.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2257s {
    public static void a(boolean z10, String str) throws C6080L {
        if (!z10) {
            throw C6080L.a(str, null);
        }
    }

    public static int b(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(InterfaceC2256q interfaceC2256q, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return interfaceC2256q.e(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int d(InterfaceC2256q interfaceC2256q, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iL = interfaceC2256q.l(bArr, i10 + i12, i11 - i12);
            if (iL == -1) {
                break;
            }
            i12 += iL;
        }
        return i12;
    }

    public static boolean e(InterfaceC2256q interfaceC2256q, byte[] bArr, int i10, int i11) {
        try {
            interfaceC2256q.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(InterfaceC2256q interfaceC2256q, int i10) {
        try {
            interfaceC2256q.m(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
