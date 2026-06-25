package J2;

import P9.AbstractC2011u;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.AbstractC6624k;
import t2.a0;
import u2.AbstractC6726h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a */
    private static final HashMap f9330a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static int f9331b = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public final String f9332a;

        /* JADX INFO: renamed from: b */
        public final boolean f9333b;

        /* JADX INFO: renamed from: c */
        public final boolean f9334c;

        public b(String str, boolean z10, boolean z11) {
            this.f9332a = str;
            this.f9333b = z10;
            this.f9334c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f9332a, bVar.f9332a) && this.f9333b == bVar.f9333b && this.f9334c == bVar.f9334c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f9332a.hashCode() + 31) * 31) + (this.f9333b ? 1231 : 1237)) * 31) + (this.f9334c ? 1231 : 1237);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends Exception {
        /* synthetic */ c(Throwable th2, a aVar) {
            this(th2);
        }

        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e implements d {

        /* JADX INFO: renamed from: a */
        private final int f9335a;

        /* JADX INFO: renamed from: b */
        private MediaCodecInfo[] f9336b;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f9335a = (z10 || z11 || z12) ? 1 : 0;
        }

        private void f() {
            if (this.f9336b == null) {
                this.f9336b = new MediaCodecList(this.f9335a).getCodecInfos();
            }
        }

        @Override // J2.N.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.f9336b[i10];
        }

        @Override // J2.N.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // J2.N.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // J2.N.d
        public int d() {
            f();
            return this.f9336b.length;
        }

        @Override // J2.N.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface f {
        int a(Object obj);
    }

    private static void A(List list, final f fVar) {
        Collections.sort(list, new Comparator() { // from class: J2.M
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return N.a(fVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(t tVar) {
        return (tVar.f9417i ? 2 : 0) + (!tVar.f9418j ? 1 : 0);
    }

    public static /* synthetic */ int c(C6109x c6109x, t tVar) {
        return tVar.o(c6109x) ? 1 : 0;
    }

    public static /* synthetic */ int d(t tVar) {
        String str = tVar.f9409a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && ((t) list.get(0)).f9409a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(t.E("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            A(list, new f() { // from class: J2.K
                @Override // J2.N.f
                public final int a(Object obj) {
                    return N.d((t) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((t) list.get(0)).f9409a)) {
            return;
        }
        list.add((t) list.remove(0));
    }

    public static String f(C6109x c6109x) {
        Pair pairI;
        if ("audio/eac3-joc".equals(c6109x.f57022o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c6109x.f57022o) && (pairI = i(c6109x)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(c6109x.f57022o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List g(E e10, C6109x c6109x, boolean z10, boolean z11) {
        String strF = f(c6109x);
        return strF == null ? AbstractC2011u.A() : e10.b(strF, z10, z11);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair i(C6109x c6109x) {
        return AbstractC6624k.r(c6109x);
    }

    public static t j(String str, boolean z10, boolean z11) {
        List listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return (t) listK.get(0);
    }

    public static synchronized List k(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap map = f9330a;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListL = l(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
            if (z10) {
                arrayListL.isEmpty();
            }
            e(str, arrayListL);
            AbstractC2011u abstractC2011uW = AbstractC2011u.w(arrayListL);
            map.put(bVar, abstractC2011uW);
            return abstractC2011uW;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList l(J2.N.b r16, J2.N.d r17) throws J2.N.c {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.N.l(J2.N$b, J2.N$d):java.util.ArrayList");
    }

    public static List m(E e10, C6109x c6109x, boolean z10, boolean z11) {
        List listB = e10.b(c6109x.f57022o, z10, z11);
        return AbstractC2011u.t().j(listB).j(g(e10, c6109x, z10, z11)).k();
    }

    public static List n(List list, final C6109x c6109x) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: J2.L
            @Override // J2.N.f
            public final int a(Object obj) {
                return N.c(c6109x, (t) obj);
            }
        });
        return arrayList;
    }

    public static List o(List list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: J2.J
            @Override // J2.N.f
            public final int a(Object obj) {
                return N.b((t) obj);
            }
        });
        return AbstractC2011u.w(arrayList);
    }

    public static t p() {
        return j("audio/raw", false, false);
    }

    public static Pair q(C6109x c6109x) {
        String strH = AbstractC6726h.h(c6109x.f57025r);
        if (strH == null) {
            return null;
        }
        return AbstractC6624k.u(strH, a0.v1(strH.trim(), "\\."), c6109x.f56995E);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z10 || !str.endsWith(".secure");
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return x(mediaCodecInfo);
        }
        if (AbstractC6079K.o(str)) {
            return true;
        }
        String strE = O9.c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z(mediaCodecInfo);
        }
        String strE = O9.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
