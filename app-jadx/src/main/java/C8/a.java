package C8;

import android.util.SparseArray;
import java.util.HashMap;
import p8.EnumC5940e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f2894a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f2895b;

    static {
        HashMap map = new HashMap();
        f2895b = map;
        map.put(EnumC5940e.DEFAULT, 0);
        f2895b.put(EnumC5940e.VERY_LOW, 1);
        f2895b.put(EnumC5940e.HIGHEST, 2);
        for (EnumC5940e enumC5940e : f2895b.keySet()) {
            f2894a.append(((Integer) f2895b.get(enumC5940e)).intValue(), enumC5940e);
        }
    }

    public static int a(EnumC5940e enumC5940e) {
        Integer num = (Integer) f2895b.get(enumC5940e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC5940e);
    }

    public static EnumC5940e b(int i10) {
        EnumC5940e enumC5940e = (EnumC5940e) f2894a.get(i10);
        if (enumC5940e != null) {
            return enumC5940e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
