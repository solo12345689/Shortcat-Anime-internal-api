package Q2;

import Q2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f14351h = new Comparator() { // from class: Q2.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r.b((r.b) obj, (r.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f14352i = new Comparator() { // from class: Q2.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((r.b) obj).f14362c, ((r.b) obj2).f14362c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14353a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14359g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f14355c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f14354b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14356d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14362c;

        private b() {
        }
    }

    public r(int i10) {
        this.f14353a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f14360a - bVar2.f14360a;
    }

    private void d() {
        if (this.f14356d != 1) {
            Collections.sort(this.f14354b, f14351h);
            this.f14356d = 1;
        }
    }

    private void e() {
        if (this.f14356d != 0) {
            Collections.sort(this.f14354b, f14352i);
            this.f14356d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f14359g;
        if (i11 > 0) {
            b[] bVarArr = this.f14355c;
            int i12 = i11 - 1;
            this.f14359g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f14357e;
        this.f14357e = i13 + 1;
        bVar.f14360a = i13;
        bVar.f14361b = i10;
        bVar.f14362c = f10;
        this.f14354b.add(bVar);
        this.f14358f += i10;
        while (true) {
            int i14 = this.f14358f;
            int i15 = this.f14353a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f14354b.get(0);
            int i17 = bVar2.f14361b;
            if (i17 <= i16) {
                this.f14358f -= i17;
                this.f14354b.remove(0);
                int i18 = this.f14359g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f14355c;
                    this.f14359g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f14361b = i17 - i16;
                this.f14358f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f14358f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14354b.size(); i11++) {
            b bVar = (b) this.f14354b.get(i11);
            i10 += bVar.f14361b;
            if (i10 >= f11) {
                return bVar.f14362c;
            }
        }
        if (this.f14354b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f14354b.get(r5.size() - 1)).f14362c;
    }

    public void g() {
        this.f14354b.clear();
        this.f14356d = -1;
        this.f14357e = 0;
        this.f14358f = 0;
    }
}
