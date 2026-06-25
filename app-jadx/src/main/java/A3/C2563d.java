package a3;

import U2.C2253n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t2.C6609I;

/* JADX INFO: renamed from: a3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2563d extends AbstractC2564e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f23752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f23753d;

    public C2563d() {
        super(new C2253n());
        this.f23751b = -9223372036854775807L;
        this.f23752c = new long[0];
        this.f23753d = new long[0];
    }

    private static Boolean g(C6609I c6609i) {
        return Boolean.valueOf(c6609i.M() == 1);
    }

    private static Object h(C6609I c6609i, int i10) {
        if (i10 == 0) {
            return j(c6609i);
        }
        if (i10 == 1) {
            return g(c6609i);
        }
        if (i10 == 2) {
            return n(c6609i);
        }
        if (i10 == 3) {
            return l(c6609i);
        }
        if (i10 == 8) {
            return k(c6609i);
        }
        if (i10 == 10) {
            return m(c6609i);
        }
        if (i10 != 11) {
            return null;
        }
        return i(c6609i);
    }

    private static Date i(C6609I c6609i) {
        Date date = new Date((long) j(c6609i).doubleValue());
        c6609i.c0(2);
        return date;
    }

    private static Double j(C6609I c6609i) {
        return Double.valueOf(Double.longBitsToDouble(c6609i.F()));
    }

    private static HashMap k(C6609I c6609i) {
        int iQ = c6609i.Q();
        HashMap map = new HashMap(iQ);
        for (int i10 = 0; i10 < iQ; i10++) {
            String strN = n(c6609i);
            Object objH = h(c6609i, o(c6609i));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap l(C6609I c6609i) {
        HashMap map = new HashMap();
        while (true) {
            String strN = n(c6609i);
            int iO = o(c6609i);
            if (iO == 9) {
                return map;
            }
            Object objH = h(c6609i, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList m(C6609I c6609i) {
        int iQ = c6609i.Q();
        ArrayList arrayList = new ArrayList(iQ);
        for (int i10 = 0; i10 < iQ; i10++) {
            Object objH = h(c6609i, o(c6609i));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(C6609I c6609i) {
        int iU = c6609i.U();
        int iG = c6609i.g();
        c6609i.c0(iU);
        return new String(c6609i.f(), iG, iU);
    }

    private static int o(C6609I c6609i) {
        return c6609i.M();
    }

    @Override // a3.AbstractC2564e
    protected boolean b(C6609I c6609i) {
        return true;
    }

    @Override // a3.AbstractC2564e
    protected boolean c(C6609I c6609i, long j10) {
        if (o(c6609i) != 2 || !"onMetaData".equals(n(c6609i)) || c6609i.a() == 0 || o(c6609i) != 8) {
            return false;
        }
        HashMap mapK = k(c6609i);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f23751b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23752c = new long[size];
                this.f23753d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23752c = new long[0];
                        this.f23753d = new long[0];
                        break;
                    }
                    this.f23752c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f23753d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f23751b;
    }

    public long[] e() {
        return this.f23753d;
    }

    public long[] f() {
        return this.f23752c;
    }
}
