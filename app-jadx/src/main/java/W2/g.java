package W2;

import P9.AbstractC2011u;
import q2.C6109x;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6109x f20691a;

    public g(C6109x c6109x) {
        this.f20691a = c6109x;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(C6609I c6609i) {
        c6609i.c0(4);
        int iZ = c6609i.z();
        int iZ2 = c6609i.z();
        c6609i.c0(4);
        int iZ3 = c6609i.z();
        String strA = a(iZ3);
        if (strA != null) {
            C6109x.b bVar = new C6109x.b();
            bVar.F0(iZ).h0(iZ2).y0(strA);
            return new g(bVar.P());
        }
        AbstractC6635w.i("StreamFormatChunk", "Ignoring track with unsupported compression " + iZ3);
        return null;
    }

    public static a d(int i10, C6609I c6609i) {
        if (i10 == 2) {
            return c(c6609i);
        }
        if (i10 == 1) {
            return e(c6609i);
        }
        AbstractC6635w.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + a0.x0(i10));
        return null;
    }

    private static a e(C6609I c6609i) {
        int iE = c6609i.E();
        String strB = b(iE);
        if (strB == null) {
            AbstractC6635w.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iE);
            return null;
        }
        int iE2 = c6609i.E();
        int iZ = c6609i.z();
        c6609i.c0(6);
        int iL0 = a0.l0(c6609i.E());
        int iE3 = c6609i.a() > 0 ? c6609i.E() : 0;
        C6109x.b bVar = new C6109x.b();
        bVar.y0(strB).T(iE2).z0(iZ);
        if (strB.equals("audio/raw") && iL0 != 0) {
            bVar.s0(iL0);
        }
        if (strB.equals("audio/mp4a-latm") && iE3 > 0) {
            byte[] bArr = new byte[iE3];
            c6609i.q(bArr, 0, iE3);
            bVar.k0(AbstractC2011u.B(bArr));
        }
        return new g(bVar.P());
    }

    @Override // W2.a
    public int getType() {
        return 1718776947;
    }
}
