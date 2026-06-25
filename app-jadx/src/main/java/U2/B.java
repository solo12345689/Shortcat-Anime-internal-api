package U2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C6078J;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f18879c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18880a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18881b = -1;

    private boolean b(String str) {
        Matcher matcher = f18879c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) a0.l(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) a0.l(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f18880a = i10;
            this.f18881b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f18880a == -1 || this.f18881b == -1) ? false : true;
    }

    public boolean c(C6078J c6078j) {
        for (int i10 = 0; i10 < c6078j.e(); i10++) {
            C6078J.a aVarD = c6078j.d(i10);
            if (aVarD instanceof i3.e) {
                i3.e eVar = (i3.e) aVarD;
                if ("iTunSMPB".equals(eVar.f48609c) && b(eVar.f48610d)) {
                    return true;
                }
            } else if (aVarD instanceof i3.k) {
                i3.k kVar = (i3.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f48622b) && "iTunSMPB".equals(kVar.f48623c) && b(kVar.f48624d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
