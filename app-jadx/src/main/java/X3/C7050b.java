package x3;

import P9.AbstractC2013w;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7050b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f63804d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC2013w f63805e = AbstractC2013w.B("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC2013w f63806f = AbstractC2013w.D("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC2013w f63807g = AbstractC2013w.B("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC2013w f63808h = AbstractC2013w.D("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63811c;

    private C7050b(int i10, int i11, int i12) {
        this.f63809a = i10;
        this.f63810b = i11;
        this.f63811c = i12;
    }

    public static C7050b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = O9.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(AbstractC2013w.w(TextUtils.split(strE, f63804d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static x3.C7050b b(P9.AbstractC2013w r7) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C7050b.b(P9.w):x3.b");
    }
}
