package af;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: af.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2614G {
    public static final String a(Xe.d dVar) {
        AbstractC5504s.h(dVar, "<this>");
        return c(dVar.h());
    }

    public static final String b(Xe.f fVar) {
        AbstractC5504s.h(fVar, "<this>");
        if (!e(fVar)) {
            String strB = fVar.b();
            AbstractC5504s.g(strB, "asString(...)");
            return strB;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB2 = fVar.b();
        AbstractC5504s.g(strB2, "asString(...)");
        sb2.append('`' + strB2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List pathSegments) {
        AbstractC5504s.h(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            Xe.f fVar = (Xe.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        return sb2.toString();
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC5504s.h(lowerRendered, "lowerRendered");
        AbstractC5504s.h(lowerPrefix, "lowerPrefix");
        AbstractC5504s.h(upperRendered, "upperRendered");
        AbstractC5504s.h(upperPrefix, "upperPrefix");
        AbstractC5504s.h(foldedPrefix, "foldedPrefix");
        if (Df.r.Q(lowerRendered, lowerPrefix, false, 2, null) && Df.r.Q(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            AbstractC5504s.g(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            AbstractC5504s.g(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (AbstractC5504s.c(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(Xe.f fVar) {
        String strB = fVar.b();
        AbstractC5504s.g(strB, "asString(...)");
        if (AbstractC2609B.f23945a.contains(strB)) {
            return true;
        }
        for (int i10 = 0; i10 < strB.length(); i10++) {
            char cCharAt = strB.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strB.length() == 0 || !Character.isJavaIdentifierStart(strB.codePointAt(0));
    }

    public static final boolean f(String lower, String upper) {
        AbstractC5504s.h(lower, "lower");
        AbstractC5504s.h(upper, "upper");
        if (AbstractC5504s.c(lower, Df.r.K(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (Df.r.A(upper, "?", false, 2, null)) {
            if (AbstractC5504s.c(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(lower);
        sb2.append(")?");
        return AbstractC5504s.c(sb2.toString(), upper);
    }
}
