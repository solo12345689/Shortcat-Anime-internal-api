package v3;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: renamed from: v3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6841c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f61875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f61876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f61877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f61879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f61880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f61881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f61882j;

    /* JADX INFO: renamed from: v3.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f61893k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f61883a = i10;
            this.f61884b = i11;
            this.f61885c = i12;
            this.f61886d = i13;
            this.f61887e = i14;
            this.f61888f = i15;
            this.f61889g = i16;
            this.f61890h = i17;
            this.f61891i = i18;
            this.f61892j = i19;
            this.f61893k = i20;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), f.f34694a);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strE = O9.c.e(strArrSplit[i20].trim());
                strE.getClass();
                switch (strE) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: v3.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f61894c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f61895d = Pattern.compile(a0.I("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f61896e = Pattern.compile(a0.I("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f61897f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f61899b;

        private b(int i10, PointF pointF) {
            this.f61898a = i10;
            this.f61899b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f61897f.matcher(str);
            if (matcher.find()) {
                return C6841c.e((String) AbstractC6614a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f61894c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC6614a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f61895d.matcher(str);
            Matcher matcher2 = f61896e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    AbstractC6635w.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC6614a.e(strGroup)).trim()), Float.parseFloat(((String) AbstractC6614a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f61894c.matcher(str).replaceAll("");
        }
    }

    private C6841c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f61873a = str;
        this.f61874b = i10;
        this.f61875c = num;
        this.f61876d = num2;
        this.f61877e = f10;
        this.f61878f = z10;
        this.f61879g = z11;
        this.f61880h = z12;
        this.f61881i = z13;
        this.f61882j = i11;
    }

    public static C6841c b(String str, a aVar) {
        boolean z10;
        boolean z11;
        AbstractC6614a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), f.f34694a);
        int length = strArrSplit.length;
        int i10 = aVar.f61893k;
        if (length != i10) {
            AbstractC6635w.i("SsaStyle", a0.I("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f61883a].trim();
            int i11 = aVar.f61884b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f61885c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f61886d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f61887e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f61888f;
            boolean z12 = false;
            boolean z13 = true;
            if (i15 == -1 || !f(strArrSplit[i15].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z12 = true;
            }
            int i16 = aVar.f61889g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = true;
                z13 = z10;
            } else {
                z11 = true;
            }
            int i17 = aVar.f61890h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f61891i;
            boolean z14 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f61892j;
            return new C6841c(strTrim, iE, numH, numH2, fI, z12, z13, z11, z14, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            AbstractC6635w.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC6635w.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            AbstractC6635w.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC6635w.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC6614a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(S9.f.e(((j10 >> 24) & 255) ^ 255), S9.f.e(j10 & 255), S9.f.e((j10 >> 8) & 255), S9.f.e((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            AbstractC6635w.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            AbstractC6635w.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
