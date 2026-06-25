package O9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f13093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f13095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13096d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f13097a;

        /* JADX INFO: renamed from: O9.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0208a extends b {
            C0208a(r rVar, CharSequence charSequence) {
                super(rVar, charSequence);
            }

            @Override // O9.r.b
            int f(int i10) {
                return i10 + 1;
            }

            @Override // O9.r.b
            int g(int i10) {
                return a.this.f13097a.c(this.f13099c, i10);
            }
        }

        a(d dVar) {
            this.f13097a = dVar;
        }

        @Override // O9.r.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(r rVar, CharSequence charSequence) {
            return new C0208a(rVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b extends O9.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f13099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f13100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f13101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13102f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f13103g;

        protected b(r rVar, CharSequence charSequence) {
            this.f13100d = rVar.f13093a;
            this.f13101e = rVar.f13094b;
            this.f13103g = rVar.f13096d;
            this.f13099c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // O9.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b() {
            int iG;
            int i10 = this.f13102f;
            while (true) {
                int i11 = this.f13102f;
                if (i11 == -1) {
                    return (String) c();
                }
                iG = g(i11);
                if (iG == -1) {
                    iG = this.f13099c.length();
                    this.f13102f = -1;
                } else {
                    this.f13102f = f(iG);
                }
                int i12 = this.f13102f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f13102f = i13;
                    if (i13 > this.f13099c.length()) {
                        this.f13102f = -1;
                    }
                } else {
                    while (i10 < iG && this.f13100d.e(this.f13099c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f13100d.e(this.f13099c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f13101e || i10 != iG) {
                        break;
                    }
                    i10 = this.f13102f;
                }
            }
            int i14 = this.f13103g;
            if (i14 == 1) {
                iG = this.f13099c.length();
                this.f13102f = -1;
                while (iG > i10 && this.f13100d.e(this.f13099c.charAt(iG - 1))) {
                    iG--;
                }
            } else {
                this.f13103g = i14 - 1;
            }
            return this.f13099c.subSequence(i10, iG).toString();
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        Iterator a(r rVar, CharSequence charSequence);
    }

    private r(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static r d(char c10) {
        return e(d.d(c10));
    }

    public static r e(d dVar) {
        n.j(dVar);
        return new r(new a(dVar));
    }

    private Iterator g(CharSequence charSequence) {
        return this.f13095c.a(this, charSequence);
    }

    public List f(CharSequence charSequence) {
        n.j(charSequence);
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private r(c cVar, boolean z10, d dVar, int i10) {
        this.f13095c = cVar;
        this.f13094b = z10;
        this.f13093a = dVar;
        this.f13096d = i10;
    }
}
