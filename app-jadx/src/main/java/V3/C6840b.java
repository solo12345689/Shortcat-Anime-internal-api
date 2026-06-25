package v3;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.d;
import r3.r;
import s2.C6403a;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;
import v3.C6841c;

/* JADX INFO: renamed from: v3.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6840b implements r {

    /* JADX INFO: renamed from: g */
    private static final Pattern f61866g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    private final boolean f61867a;

    /* JADX INFO: renamed from: b */
    private final C6839a f61868b;

    /* JADX INFO: renamed from: d */
    private Map f61870d;

    /* JADX INFO: renamed from: e */
    private float f61871e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    private float f61872f = -3.4028235E38f;

    /* JADX INFO: renamed from: c */
    private final C6609I f61869c = new C6609I();

    public C6840b(List list) {
        if (list == null || list.isEmpty()) {
            this.f61867a = false;
            this.f61868b = null;
            return;
        }
        this.f61867a = true;
        String strJ = a0.J((byte[]) list.get(0));
        AbstractC6614a.a(strJ.startsWith("Format:"));
        this.f61868b = (C6839a) AbstractC6614a.e(C6839a.a(strJ));
        j(new C6609I((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static int d(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static C6403a f(String str, int i10, C6841c c6841c, C6841c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        C6403a.b bVarT = new C6403a.b().o(spannableString).t(i10);
        if (c6841c != null) {
            if (c6841c.f61875c != null) {
                spannableString.setSpan(new ForegroundColorSpan(c6841c.f61875c.intValue()), 0, spannableString.length(), 33);
            }
            if (c6841c.f61882j == 3 && c6841c.f61876d != null) {
                spannableString.setSpan(new BackgroundColorSpan(c6841c.f61876d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = c6841c.f61877e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarT.q(f12 / f11, 1);
            }
            boolean z10 = c6841c.f61878f;
            if (z10 && c6841c.f61879g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c6841c.f61879g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c6841c.f61880h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c6841c.f61881i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = bVar.f61898a;
        if (i11 == -1) {
            i11 = c6841c != null ? c6841c.f61874b : -1;
        }
        bVarT.p(p(i11)).l(o(i11)).i(n(i11));
        PointF pointF = bVar.f61899b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarT.k(e(bVarT.d()));
            bVarT.h(e(bVarT.c()), 0);
        } else {
            bVarT.k(pointF.x / f10);
            bVarT.h(bVar.f61899b.y / f11, 0);
        }
        return bVarT.a();
    }

    private Charset g(C6609I c6609i) {
        Charset charsetW = c6609i.W();
        return charsetW != null ? charsetW : StandardCharsets.UTF_8;
    }

    private void h(String str, C6839a c6839a, List list, List list2) {
        int i10;
        int i11;
        AbstractC6614a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(f.f34694a, c6839a.f61865f);
        if (strArrSplit.length != c6839a.f61865f) {
            AbstractC6635w.i("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        int i12 = c6839a.f61860a;
        if (i12 != -1) {
            try {
                i10 = Integer.parseInt(strArrSplit[i12].trim());
            } catch (RuntimeException unused) {
                AbstractC6635w.i("SsaParser", "Fail to parse layer: " + strArrSplit[c6839a.f61860a]);
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        int i13 = i10;
        long jM = m(strArrSplit[c6839a.f61861b]);
        if (jM == -9223372036854775807L) {
            AbstractC6635w.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[c6839a.f61862c]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            AbstractC6635w.i("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f61870d;
        C6841c c6841c = (map == null || (i11 = c6839a.f61863d) == -1) ? null : (C6841c) map.get(strArrSplit[i11].trim());
        String str2 = strArrSplit[c6839a.f61864e];
        C6403a c6403aF = f(C6841c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), i13, c6841c, C6841c.b.b(str2), this.f61871e, this.f61872f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            ((List) list.get(iD2)).add(c6403aF);
        }
    }

    private void i(C6609I c6609i, List list, List list2, Charset charset) {
        C6839a c6839aA = this.f61867a ? this.f61868b : null;
        while (true) {
            String strY = c6609i.y(charset);
            if (strY == null) {
                return;
            }
            if (strY.startsWith("Format:")) {
                c6839aA = C6839a.a(strY);
            } else if (strY.startsWith("Dialogue:")) {
                if (c6839aA == null) {
                    AbstractC6635w.i("SsaParser", "Skipping dialogue line before complete format: " + strY);
                } else {
                    h(strY, c6839aA, list, list2);
                }
            }
        }
    }

    private void j(C6609I c6609i, Charset charset) {
        while (true) {
            String strY = c6609i.y(charset);
            if (strY == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strY)) {
                k(c6609i, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strY)) {
                this.f61870d = l(c6609i, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strY)) {
                AbstractC6635w.g("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strY)) {
                return;
            }
        }
    }

    private void k(C6609I c6609i, Charset charset) {
        while (true) {
            String strY = c6609i.y(charset);
            if (strY == null) {
                return;
            }
            if (c6609i.a() != 0 && c6609i.l(charset) == 91) {
                return;
            }
            String[] strArrSplit = strY.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (strArrSplit.length == 2) {
                String strE = O9.c.e(strArrSplit[0].trim());
                strE.getClass();
                if (strE.equals("playresx")) {
                    this.f61871e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f61872f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map l(C6609I c6609i, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C6841c.a aVarA = null;
        while (true) {
            String strY = c6609i.y(charset);
            if (strY == null || (c6609i.a() != 0 && c6609i.l(charset) == 91)) {
                break;
            }
            if (strY.startsWith("Format:")) {
                aVarA = C6841c.a.a(strY);
            } else if (strY.startsWith("Style:")) {
                if (aVarA == null) {
                    AbstractC6635w.i("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strY);
                } else {
                    C6841c c6841cB = C6841c.b(strY, aVarA);
                    if (c6841cB != null) {
                        linkedHashMap.put(c6841cB.f61873a, c6841cB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f61866g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) a0.l(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) a0.l(matcher.group(2))) * 60000000) + (Long.parseLong((String) a0.l(matcher.group(3))) * 1000000) + (Long.parseLong((String) a0.l(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int n(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                AbstractC6635w.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                break;
            case 0:
            default:
                AbstractC6635w.i("SsaParser", "Unknown alignment: " + i10);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC6635w.i("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f61869c.Z(bArr, i10 + i11);
        this.f61869c.b0(i10);
        Charset charsetG = g(this.f61869c);
        if (!this.f61867a) {
            j(this.f61869c, charsetG);
        }
        i(this.f61869c, arrayList, arrayList2, charsetG);
        ArrayList arrayList3 = (bVar.f58523a == -9223372036854775807L || !bVar.f58524b) ? null : new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            List list = (List) arrayList.get(i12);
            if (!list.isEmpty() || i12 == 0) {
                if (i12 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue();
                d dVar = new d(list, jLongValue, jLongValue2 - jLongValue);
                long j10 = bVar.f58523a;
                if (j10 == -9223372036854775807L || jLongValue2 >= j10) {
                    interfaceC6627n.accept(dVar);
                } else if (arrayList3 != null) {
                    arrayList3.add(dVar);
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                interfaceC6627n.accept((d) it.next());
            }
        }
    }

    @Override // r3.r
    public int c() {
        return 1;
    }
}
