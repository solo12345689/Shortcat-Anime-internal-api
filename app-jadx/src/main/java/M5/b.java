package M5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Integer f12231a;

    private static int a(Context context) {
        ArrayList arrayList = new ArrayList();
        c(arrayList, f());
        c(arrayList, e());
        c(arrayList, g(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i10 = size - 1;
        return ((Integer) arrayList.get(i10)).intValue() + ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i10)).intValue()) / 2);
    }

    private static int b(Context context) {
        long jG = a.g(context);
        if (jG == -1) {
            return a(context);
        }
        if (jG <= 805306368) {
            return a.f() <= 1 ? 2009 : 2010;
        }
        if (jG <= 1073741824) {
            return a.b() < 1300000 ? 2011 : 2012;
        }
        if (jG <= 1610612736) {
            return a.b() < 1800000 ? 2012 : 2013;
        }
        if (jG <= 2147483648L) {
            return 2013;
        }
        if (jG <= 3221225472L) {
            return 2014;
        }
        return jG <= 5368709120L ? 2015 : 2016;
    }

    private static void c(ArrayList arrayList, int i10) {
        if (i10 != -1) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public static int d(Context context) {
        if (f12231a == null) {
            synchronized (b.class) {
                try {
                    if (f12231a == null) {
                        f12231a = Integer.valueOf(b(context));
                    }
                } finally {
                }
            }
        }
        return f12231a.intValue();
    }

    private static int e() {
        long jB = a.b();
        if (jB == -1) {
            return -1;
        }
        if (jB <= 528000) {
            return 2008;
        }
        if (jB <= 620000) {
            return 2009;
        }
        if (jB <= 1020000) {
            return 2010;
        }
        if (jB <= 1220000) {
            return 2011;
        }
        if (jB <= 1520000) {
            return 2012;
        }
        return jB <= 2020000 ? 2013 : 2014;
    }

    private static int f() {
        int iF = a.f();
        if (iF < 1) {
            return -1;
        }
        if (iF == 1) {
            return 2008;
        }
        return iF <= 3 ? 2011 : 2012;
    }

    private static int g(Context context) {
        long jG = a.g(context);
        if (jG <= 0) {
            return -1;
        }
        if (jG <= 201326592) {
            return 2008;
        }
        if (jG <= 304087040) {
            return 2009;
        }
        if (jG <= 536870912) {
            return 2010;
        }
        if (jG <= 1073741824) {
            return 2011;
        }
        if (jG <= 1610612736) {
            return 2012;
        }
        return jG <= 2147483648L ? 2013 : 2014;
    }
}
