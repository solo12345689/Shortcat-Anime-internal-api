package x3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import s2.C6403a;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: x3.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7051c {

    /* JADX INFO: renamed from: a */
    public final String f63812a;

    /* JADX INFO: renamed from: b */
    public final String f63813b;

    /* JADX INFO: renamed from: c */
    public final boolean f63814c;

    /* JADX INFO: renamed from: d */
    public final long f63815d;

    /* JADX INFO: renamed from: e */
    public final long f63816e;

    /* JADX INFO: renamed from: f */
    public final g f63817f;

    /* JADX INFO: renamed from: g */
    private final String[] f63818g;

    /* JADX INFO: renamed from: h */
    public final String f63819h;

    /* JADX INFO: renamed from: i */
    public final String f63820i;

    /* JADX INFO: renamed from: j */
    public final C7051c f63821j;

    /* JADX INFO: renamed from: k */
    private final HashMap f63822k;

    /* JADX INFO: renamed from: l */
    private final HashMap f63823l;

    /* JADX INFO: renamed from: m */
    private List f63824m;

    private C7051c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, C7051c c7051c) {
        this.f63812a = str;
        this.f63813b = str2;
        this.f63820i = str4;
        this.f63817f = gVar;
        this.f63818g = strArr;
        this.f63814c = str2 != null;
        this.f63815d = j10;
        this.f63816e = j11;
        this.f63819h = (String) AbstractC6614a.e(str3);
        this.f63821j = c7051c;
        this.f63822k = new HashMap();
        this.f63823l = new HashMap();
    }

    private void b(Map map, C6403a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f63817f, this.f63818g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f63821j, map, i12);
            if ("p".equals(this.f63812a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static C7051c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, C7051c c7051c) {
        return new C7051c(str, null, j10, j11, gVar, strArr, str2, str3, c7051c);
    }

    public static C7051c d(String str) {
        return new C7051c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C7049a c7049a : (C7049a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7049a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c7049a), spannableStringBuilder.getSpanEnd(c7049a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f63812a);
        boolean zEquals2 = "div".equals(this.f63812a);
        if (z10 || zEquals || (zEquals2 && this.f63820i != null)) {
            long j10 = this.f63815d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f63816e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f63824m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f63824m.size(); i10++) {
            ((C7051c) this.f63824m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            C6403a.b bVar = new C6403a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC6614a.e(((C6403a.b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f63819h)) {
            str = this.f63819h;
        }
        if (m(j10) && "div".equals(this.f63812a) && this.f63820i != null) {
            list.add(new Pair(str, this.f63820i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f63819h) ? str : this.f63819h;
            Iterator it = this.f63823l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f63822k.containsKey(str3) ? ((Integer) this.f63822k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (C6403a.b) AbstractC6614a.e((C6403a.b) map3.get(str3)), iIntValue, iIntValue2, ((e) AbstractC6614a.e((e) map2.get(str2))).f63848j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        boolean z11;
        Map map2;
        long j11;
        this.f63822k.clear();
        this.f63823l.clear();
        if ("metadata".equals(this.f63812a)) {
            return;
        }
        if (!"".equals(this.f63819h)) {
            str = this.f63819h;
        }
        String str2 = str;
        if (this.f63814c && z10) {
            k(str2, map).append((CharSequence) AbstractC6614a.e(this.f63813b));
            return;
        }
        if ("br".equals(this.f63812a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f63822k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC6614a.e(((C6403a.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = "p".equals(this.f63812a);
            int i10 = 0;
            while (i10 < g()) {
                C7051c c7051cF = f(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                c7051cF.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map map3 = map;
            if (zEquals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.f63823l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC6614a.e(((C6403a.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public void a(C7051c c7051c) {
        if (this.f63824m == null) {
            this.f63824m = new ArrayList();
        }
        this.f63824m.add(c7051c);
    }

    public C7051c f(int i10) {
        List list = this.f63824m;
        if (list != null) {
            return (C7051c) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f63824m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        n(j10, this.f63819h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f63819h, treeMap);
        o(j10, map, map2, this.f63819h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) AbstractC6614a.e((e) map2.get(pair.first));
                arrayList2.add(new C6403a.b().f(bitmapDecodeByteArray).k(eVar.f63840b).l(0).h(eVar.f63841c, 0).i(eVar.f63843e).n(eVar.f63844f).g(eVar.f63845g).r(eVar.f63848j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) AbstractC6614a.e((e) map2.get(entry.getKey()));
            C6403a.b bVar = (C6403a.b) entry.getValue();
            e((SpannableStringBuilder) AbstractC6614a.e(bVar.e()));
            bVar.h(eVar2.f63841c, eVar2.f63842d);
            bVar.i(eVar2.f63843e);
            bVar.k(eVar2.f63840b);
            bVar.n(eVar2.f63844f);
            bVar.q(eVar2.f63847i, eVar2.f63846h);
            bVar.r(eVar2.f63848j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f63818g;
    }

    public boolean m(long j10) {
        long j11 = this.f63815d;
        if (j11 == -9223372036854775807L && this.f63816e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f63816e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f63816e) {
            return j11 <= j10 && j10 < this.f63816e;
        }
        return true;
    }
}
