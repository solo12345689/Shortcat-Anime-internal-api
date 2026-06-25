package D2;

import P9.AbstractC2014x;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f3541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f3542d;

    public b() {
        this(new Random());
    }

    private static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) a0.l((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    private List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f3539a);
        h(jElapsedRealtime, this.f3540b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            E2.b bVar = (E2.b) list.get(i10);
            if (!this.f3539a.containsKey(bVar.f4205b) && !this.f3540b.containsKey(Integer.valueOf(bVar.f4206c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(E2.b bVar, E2.b bVar2) {
        int iCompare = Integer.compare(bVar.f4206c, bVar2.f4206c);
        return iCompare != 0 ? iCompare : bVar.f4205b.compareTo(bVar2.f4205b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((E2.b) list.get(i10)).f4206c));
        }
        return hashSet.size();
    }

    private static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private E2.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((E2.b) list.get(i11)).f4207d;
        }
        int iNextInt = this.f3542d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            E2.b bVar = (E2.b) list.get(i13);
            i12 += bVar.f4207d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (E2.b) AbstractC2014x.d(list);
    }

    public void e(E2.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f4205b, jElapsedRealtime, this.f3539a);
        int i10 = bVar.f4206c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f3540b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(((E2.b) listC.get(i10)).f4206c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f3539a.clear();
        this.f3540b.clear();
        this.f3541c.clear();
    }

    public E2.b j(List list) {
        List listC = c(list);
        if (listC.size() < 2) {
            return (E2.b) AbstractC2014x.c(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: D2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((E2.b) obj, (E2.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((E2.b) listC.get(0)).f4206c;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            E2.b bVar = (E2.b) listC.get(i11);
            if (i10 == bVar.f4206c) {
                arrayList.add(new Pair(bVar.f4205b, Integer.valueOf(bVar.f4207d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (E2.b) listC.get(0);
            }
        }
        E2.b bVar2 = (E2.b) this.f3541c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        E2.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f3541c.put(arrayList, bVarK);
        return bVarK;
    }

    b(Random random) {
        this.f3541c = new HashMap();
        this.f3542d = random;
        this.f3539a = new HashMap();
        this.f3540b = new HashMap();
    }
}
