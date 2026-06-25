package J2;

import A2.C1005c;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6097l;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f9420l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f9423o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9421m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9422n = -1;

    t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f9409a = (String) AbstractC6614a.e(str);
        this.f9410b = str2;
        this.f9411c = str3;
        this.f9412d = codecCapabilities;
        this.f9416h = z10;
        this.f9417i = z11;
        this.f9418j = z12;
        this.f9413e = z13;
        this.f9414f = z14;
        this.f9415g = z15;
        this.f9419k = z16;
        this.f9420l = AbstractC6079K.t(str2);
    }

    private static boolean A() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean B(String str) {
        return false;
    }

    private static boolean C(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static t E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new t(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && t(codecCapabilities)), n(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((Build.VERSION.SDK_INT >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC6635w.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(a0.n(i10, widthAlignment) * widthAlignment, a0.n(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float f(int i10, int i11) {
        float f10 = 1024.0f;
        if (v(i10, i11, 1024.0f)) {
            return 1024.0f;
        }
        float f11 = 0.0f;
        while (true) {
            float f12 = f10 - f11;
            if (Math.abs(f12) <= 5.0f) {
                return f11;
            }
            float f13 = (f12 / 2.0f) + f11;
            if (v(i10, i11, f13)) {
                f11 = f13;
            } else {
                f10 = f13;
            }
        }
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(C6109x c6109x, boolean z10) {
        Pair pairI = N.i(c6109x);
        String str = c6109x.f57022o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strU = AbstractC6079K.u(this.f9411c);
            if (strU.equals("video/mv-hevc")) {
                return true;
            }
            if (strU.equals("video/hevc")) {
                pairI = N.q(c6109x);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(c6109x.f57022o)) {
            String str2 = this.f9410b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f9420l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !C(this.f9410b, iIntValue))) {
                return true;
            }
        }
        x("codec.profileLevel, " + c6109x.f57018k + ", " + this.f9411c);
        return false;
    }

    private boolean m(C6109x c6109x) {
        return (Objects.equals(c6109x.f57022o, "audio/flac") && c6109x.f56999I == 22 && Build.VERSION.SDK_INT < 34 && this.f9409a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !A();
    }

    private boolean r(C6109x c6109x) {
        return this.f9410b.equals(c6109x.f57022o) || this.f9410b.equals(N.f(c6109x));
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void w(String str) {
        AbstractC6635w.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f9409a + ", " + this.f9410b + "] [" + a0.f60566e + "]");
    }

    private void x(String str) {
        AbstractC6635w.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f9409a + ", " + this.f9410b + "] [" + a0.f60566e + "]");
    }

    private static boolean y(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean z(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9412d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C1005c e(C6109x c6109x, C6109x c6109x2) {
        C6109x c6109x3;
        C6109x c6109x4;
        int i10;
        int i11 = !Objects.equals(c6109x.f57022o, c6109x2.f57022o) ? 8 : 0;
        if (this.f9420l) {
            if (c6109x.f56991A != c6109x2.f56991A) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            boolean z10 = (c6109x.f57029v == c6109x2.f57029v && c6109x.f57030w == c6109x2.f57030w) ? false : true;
            if (!this.f9413e && z10) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            if ((!C6097l.i(c6109x.f56995E) || !C6097l.i(c6109x2.f56995E)) && !Objects.equals(c6109x.f56995E, c6109x2.f56995E)) {
                i11 |= 2048;
            }
            if (z(this.f9409a) && !c6109x.h(c6109x2)) {
                i11 |= 2;
            }
            int i12 = c6109x.f57031x;
            if (i12 != -1 && (i10 = c6109x.f57032y) != -1 && i12 == c6109x2.f57031x && i10 == c6109x2.f57032y && z10) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1005c(this.f9409a, c6109x, c6109x2, c6109x.h(c6109x2) ? 3 : 2, 0);
            }
            c6109x3 = c6109x;
            c6109x4 = c6109x2;
        } else {
            c6109x3 = c6109x;
            c6109x4 = c6109x2;
            if (c6109x3.f56997G != c6109x4.f56997G) {
                i11 |= 4096;
            }
            if (c6109x3.f56998H != c6109x4.f56998H) {
                i11 |= 8192;
            }
            if (c6109x3.f56999I != c6109x4.f56999I) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f9410b)) {
                Pair pairI = N.i(c6109x3);
                Pair pairI2 = N.i(c6109x4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1005c(this.f9409a, c6109x3, c6109x4, 3, 0);
                    }
                }
            }
            if (!c6109x3.h(c6109x4)) {
                i11 |= 32;
            }
            if (y(this.f9410b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1005c(this.f9409a, c6109x3, c6109x4, 1, 0);
            }
        }
        return new C1005c(this.f9409a, c6109x3, c6109x4, 0, i11);
    }

    public float g(int i10, int i11) {
        if (!this.f9420l) {
            return -3.4028235E38f;
        }
        float f10 = this.f9423o;
        if (f10 != -3.4028235E38f && this.f9421m == i10 && this.f9422n == i11) {
            return f10;
        }
        float f11 = f(i10, i11);
        this.f9423o = f11;
        this.f9421m = i10;
        this.f9422n = i11;
        return f11;
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9412d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9412d;
        if (codecCapabilities == null) {
            x("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("channelCount.aCaps");
            return false;
        }
        if (a(this.f9409a, this.f9410b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        x("channelCount.support, " + i10);
        return false;
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9412d;
        if (codecCapabilities == null) {
            x("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        x("sampleRate.support, " + i10);
        return false;
    }

    public boolean o(C6109x c6109x) {
        return r(c6109x) && l(c6109x, false) && m(c6109x);
    }

    public boolean p(C6109x c6109x) {
        int i10;
        int i11;
        if (!r(c6109x) || !l(c6109x, true) || !m(c6109x)) {
            return false;
        }
        if (!this.f9420l) {
            int i12 = c6109x.f56998H;
            return (i12 == -1 || k(i12)) && ((i10 = c6109x.f56997G) == -1 || j(i10));
        }
        int i13 = c6109x.f57029v;
        if (i13 <= 0 || (i11 = c6109x.f57030w) <= 0) {
            return true;
        }
        return v(i13, i11, c6109x.f57033z);
    }

    public boolean q() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f9410b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean s(C6109x c6109x) {
        if (this.f9420l) {
            return this.f9413e;
        }
        Pair pairI = N.i(c6109x);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f9409a;
    }

    public boolean v(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9412d;
        if (codecCapabilities == null) {
            x("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            x("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = z.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                x("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !D(this.f9409a) || !d(videoCapabilities, i11, i10, d10)) {
                x("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            w("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
