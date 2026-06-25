package F2;

import F2.C1553h;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import java.util.List;
import java.util.Map;
import t2.a0;
import w2.C6930D;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(InterfaceC6940g interfaceC6940g, String str, byte[] bArr, Map map) throws N {
        C6930D c6930d = new C6930D(interfaceC6940g);
        w2.o oVarA = new o.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        w2.o oVarA2 = oVarA;
        while (true) {
            try {
                w2.m mVar = new w2.m(c6930d, oVarA2);
                try {
                    try {
                        byte[] bArrB = Q9.a.b(mVar);
                        a0.p(mVar);
                        return bArrB;
                    } catch (w2.x e10) {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        oVarA2 = oVarA2.a().j(strC).a();
                        a0.p(mVar);
                    }
                } catch (Throwable th2) {
                    a0.p(mVar);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new N(oVarA, c6930d.q(), c6930d.f(), c6930d.p(), e11);
            }
        }
    }

    public static int b(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return a0.d0(a0.e0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof O) {
            return 6001;
        }
        if (th2 instanceof C1553h.e) {
            return 6003;
        }
        if (th2 instanceof L) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(w2.x xVar, int i10) {
        Map map;
        List list;
        int i11 = xVar.f62894d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = xVar.f62896f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static boolean d(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
