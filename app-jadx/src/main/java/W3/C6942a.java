package w3;

import P9.AbstractC2011u;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.d;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.InterfaceC6627n;

/* JADX INFO: renamed from: w3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6942a implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f62902d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f62903e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f62904a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f62905b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f62906c = new C6609I();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private s2.C6403a d(android.text.Spanned r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C6942a.d(android.text.Spanned, java.lang.String):s2.a");
    }

    private Charset e(C6609I c6609i) {
        Charset charsetW = c6609i.W();
        return charsetW != null ? charsetW : StandardCharsets.UTF_8;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) AbstractC6614a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) AbstractC6614a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String h(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f62903e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        long j10;
        String strY;
        String str;
        this.f62906c.Z(bArr, i10 + i11);
        this.f62906c.b0(i10);
        Charset charsetE = e(this.f62906c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f58523a == -9223372036854775807L || !bVar.f58524b) ? null : new ArrayList();
        while (true) {
            String strY2 = this.f62906c.y(charsetE);
            if (strY2 == null) {
                break;
            }
            if (!strY2.isEmpty()) {
                try {
                    Integer.parseInt(strY2);
                    strY = this.f62906c.y(charsetE);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    AbstractC6635w.i("SubripParser", "Skipping invalid index: " + strY2);
                }
                if (strY == null) {
                    AbstractC6635w.i("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f62902d.matcher(strY);
                if (matcher.matches()) {
                    long jG = g(matcher, 1);
                    long jG2 = g(matcher, 6);
                    int i12 = 0;
                    this.f62904a.setLength(0);
                    this.f62905b.clear();
                    String strY3 = this.f62906c.y(charsetE);
                    while (!TextUtils.isEmpty(strY3)) {
                        if (this.f62904a.length() > 0) {
                            this.f62904a.append("<br>");
                        }
                        this.f62904a.append(h(strY3, this.f62905b));
                        strY3 = this.f62906c.y(charsetE);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f62904a.toString());
                    while (true) {
                        if (i12 >= this.f62905b.size()) {
                            str = null;
                            break;
                        }
                        str = (String) this.f62905b.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = bVar.f58523a;
                    if (j12 == j10 || jG2 >= j12) {
                        interfaceC6627n.accept(new d(AbstractC2011u.B(d(spannedFromHtml, str)), jG, jG2 - jG));
                    } else if (arrayList != null) {
                        arrayList.add(new d(AbstractC2011u.B(d(spannedFromHtml, str)), jG, jG2 - jG));
                    }
                } else {
                    j10 = j11;
                    AbstractC6635w.i("SubripParser", "Skipping invalid timing: " + strY);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
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
