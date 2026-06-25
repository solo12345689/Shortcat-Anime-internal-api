package J2;

import J2.N;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class z {

    /* JADX INFO: renamed from: a */
    private static Boolean f9424a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            v.a();
            int iC = c(supportedPerformancePoints, u.a(i10, i11, (int) d10));
            if (iC == 1 && z.f9424a == null) {
                Boolean unused = z.f9424a = Boolean.valueOf(d());
                if (z.f9424a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z10) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List supportedPerformancePoints;
            try {
                C6109x c6109xP = new C6109x.b().y0("video/avc").P();
                if (c6109xP.f57022o != null) {
                    List listM = N.m(E.f9326a, c6109xP, z10, false);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        if (((t) listM.get(i10)).f9412d != null && (videoCapabilities = ((t) listM.get(i10)).f9412d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            v.a();
                            return c(supportedPerformancePoints, u.a(1280, 720, 60));
                        }
                    }
                }
            } catch (N.c unused) {
            }
            return 0;
        }

        private static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (x.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            return iB2 == 0 ? iB != 2 : (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f9424a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
