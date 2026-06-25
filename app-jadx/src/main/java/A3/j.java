package A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s2.C6403a;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j implements r3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f268c;

    public j(List list) {
        this.f266a = Collections.unmodifiableList(new ArrayList(list));
        this.f267b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f267b;
            jArr[i11] = dVar.f237b;
            jArr[i11 + 1] = dVar.f238c;
        }
        long[] jArr2 = this.f267b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f268c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // r3.j
    public int a(long j10) {
        int iG = a0.g(this.f268c, j10, false, false);
        if (iG < this.f268c.length) {
            return iG;
        }
        return -1;
    }

    @Override // r3.j
    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f266a.size(); i10++) {
            long[] jArr = this.f267b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f266a.get(i10);
                C6403a c6403a = dVar.f236a;
                if (c6403a.f59050e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c6403a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: A3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f237b, ((d) obj2).f237b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f236a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // r3.j
    public long c(int i10) {
        AbstractC6614a.a(i10 >= 0);
        AbstractC6614a.a(i10 < this.f268c.length);
        return this.f268c[i10];
    }

    @Override // r3.j
    public int h() {
        return this.f268c.length;
    }
}
