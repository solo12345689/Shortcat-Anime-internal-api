package t2;

import P9.AbstractC2011u;
import P9.AbstractC2012v;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: t2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6622i {
    public static HashMap a(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static AbstractC2012v b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? AbstractC2012v.k() : AbstractC2012v.d(a(bundle));
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) a0.l(AbstractC6622i.class.getClassLoader()));
        }
    }

    public static AbstractC2011u d(O9.f fVar, List list) {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarT.a(fVar.apply((Bundle) AbstractC6614a.e((Bundle) list.get(i10))));
        }
        return aVarT.k();
    }

    public static Bundle e(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList f(Bundle bundle, String str, ArrayList arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static ArrayList h(Collection collection, O9.f fVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) fVar.apply(it.next()));
        }
        return arrayList;
    }

    public static AbstractC2011u i(List list, O9.f fVar) {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarT.a((Bundle) fVar.apply(list.get(i10)));
        }
        return aVarT.k();
    }

    public static SparseArray j(SparseArray sparseArray, O9.f fVar) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), (Bundle) fVar.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
