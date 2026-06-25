package fe;

import Ud.AbstractC2279u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class l {
    private static final int a(String str) {
        int iI0;
        char c10 = File.separatorChar;
        int iI02 = Df.r.i0(str, c10, 0, false, 4, null);
        if (iI02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iI0 = Df.r.i0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iI03 = Df.r.i0(str, c10, iI0 + 1, false, 4, null);
            return iI03 >= 0 ? iI03 + 1 : str.length();
        }
        if (iI02 > 0 && str.charAt(iI02 - 1) == ':') {
            return iI02 + 1;
        }
        if (iI02 == -1 && Df.r.Z(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        AbstractC5504s.h(file, "<this>");
        String path = file.getPath();
        AbstractC5504s.g(path, "getPath(...)");
        return a(path) > 0;
    }

    public static final g c(File file) {
        List listM;
        AbstractC5504s.h(file, "<this>");
        String path = file.getPath();
        AbstractC5504s.e(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        AbstractC5504s.g(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listM = AbstractC2279u.m();
        } else {
            List listM0 = Df.r.M0(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listM = arrayList;
        }
        return new g(new File(strSubstring), listM);
    }
}
