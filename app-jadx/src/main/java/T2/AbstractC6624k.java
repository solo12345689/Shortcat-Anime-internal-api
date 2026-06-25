package t2;

import P9.AbstractC2011u;
import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.AbstractC6079K;
import q2.C6097l;
import q2.C6109x;

/* JADX INFO: renamed from: t2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6624k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f60597a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f60598b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f60599c = Pattern.compile("^\\D?(\\d+)$");

    public static boolean A(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    private static int B(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (i10 == 51) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int C(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int a(int i10, int i11) {
        if (i10 == 0) {
            return i11 == 0 ? 257 : -1;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                return 513;
            }
            return i11 == 1 ? 514 : -1;
        }
        if (i10 != 2) {
            return -1;
        }
        if (i11 == 1) {
            return 1026;
        }
        return i11 == 2 ? 1028 : -1;
    }

    private static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            case 9:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            case 10:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            case 11:
                return 2048;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int d(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            case 32:
                                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int e(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List g(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String h(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(a0.I("hvc1.%s%d.%X.%c%d", f60598b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static String i(byte[] bArr) {
        C6609I c6609i = new C6609I(bArr);
        c6609i.d0();
        c6609i.c0(4);
        int iM = c6609i.M();
        int iM2 = c6609i.M();
        c6609i.c0(1);
        c6609i.d0();
        c6609i.d0();
        String strJ = c6609i.J(4);
        if (strJ.equals("mp4a")) {
            c6609i.d0();
            c6609i.c0(2);
            C6608H c6608h = new C6608H();
            c6608h.m(c6609i);
            int iH = c6608h.h(5);
            if (iH == 31) {
                iH = c6608h.h(6) + 32;
            }
            strJ = strJ + ".40." + iH;
        }
        return a0.I("iamf.%03X.%03X.%s", Integer.valueOf(iM), Integer.valueOf(iM2), strJ);
    }

    public static byte[] j(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f60597a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static AbstractC2011u k(byte b10, byte b11, byte b12, byte b13) {
        return AbstractC2011u.B(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    private static Integer l(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer m(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair n(String str, String[] strArr) {
        int iY;
        if (strArr.length != 3) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(AbstractC6079K.h(Integer.parseInt(strArr[1], 16))) && (iY = y(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iY), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair o(String str, String[] strArr) {
        if (strArr.length != 4) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int i12 = Integer.parseInt(strArr[3]);
            int iA = a(i10, i11);
            if (iA == -1) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i10 + "." + i11);
                return null;
            }
            int iB = b(i12);
            if (iB != -1) {
                return new Pair(Integer.valueOf(iA), Integer.valueOf(iB));
            }
            AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AC-4 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    private static Pair p(String str, String[] strArr, C6097l c6097l) {
        int i10;
        if (strArr.length < 4) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (c6097l == null || !(c6097l.f56909d != null || (i10 = c6097l.f56908c) == 7 || i10 == 6)) ? 2 : 4096 : 1;
            int iC = c(i12);
            if (iC != -1) {
                return new Pair(Integer.valueOf(i14), Integer.valueOf(iC));
            }
            AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair q(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iE = e(i11);
            if (iE == -1) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iD = d(i10);
            if (iD != -1) {
                return new Pair(Integer.valueOf(iE), Integer.valueOf(iD));
            }
            AbstractC6635w.i("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair r(C6109x c6109x) {
        String str = c6109x.f57018k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(c6109x.f57022o)) {
            return s(c6109x.f57018k, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "ac-4":
                return o(c6109x.f57018k, strArrSplit);
            case "av01":
                return p(c6109x.f57018k, strArrSplit, c6109x.f56995E);
            case "avc1":
            case "avc2":
                return q(c6109x.f57018k, strArrSplit);
            case "hev1":
            case "hvc1":
                return u(c6109x.f57018k, strArrSplit, c6109x.f56995E);
            case "iamf":
                return v(c6109x.f57018k, strArrSplit);
            case "mp4a":
                return n(c6109x.f57018k, strArrSplit);
            case "s263":
                return t(c6109x.f57018k, strArrSplit);
            case "vp09":
                return w(c6109x.f57018k, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair s(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f60599c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM = m(strGroup);
        if (numM == null) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numL = l(str2);
        if (numL != null) {
            return new Pair(numM, numL);
        }
        AbstractC6635w.i("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair t(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair u(String str, String[] strArr, C6097l c6097l) {
        if (strArr.length < 4) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f60599c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (c6097l == null || c6097l.f56908c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numX = x(str2);
        if (numX != null) {
            return new Pair(Integer.valueOf(i10), numX);
        }
        AbstractC6635w.i("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair v(String str, String[] strArr) {
        int i10 = 4;
        if (strArr.length < 4) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i11 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i10 = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i10 = 8;
                    break;
                case "mp4a":
                    i10 = 2;
                    break;
                default:
                    AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair(Integer.valueOf(16777216 | i11 | i10), 0);
        } catch (NumberFormatException e10) {
            AbstractC6635w.j("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e10);
            return null;
        }
    }

    private static Pair w(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iC = C(i10);
            if (iC == -1) {
                AbstractC6635w.i("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iB = B(i11);
            if (iB != -1) {
                return new Pair(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            AbstractC6635w.i("CodecSpecificDataUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer x(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int y(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair z(byte[] bArr) {
        C6609I c6609i = new C6609I(bArr);
        c6609i.b0(9);
        int iM = c6609i.M();
        c6609i.b0(20);
        return Pair.create(Integer.valueOf(c6609i.Q()), Integer.valueOf(iM));
    }
}
