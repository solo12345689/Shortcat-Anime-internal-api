package U0;

import Ud.AbstractC2279u;
import b1.AbstractC2968a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.AbstractC6564n;
import t.C6539E;

/* JADX INFO: renamed from: U0.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2197e implements CharSequence {

    /* JADX INFO: renamed from: e */
    public static final c f18805e = new c(null);

    /* JADX INFO: renamed from: f */
    private static final h0.v f18806f = A0.L0();

    /* JADX INFO: renamed from: a */
    private final List f18807a;

    /* JADX INFO: renamed from: b */
    private final String f18808b;

    /* JADX INFO: renamed from: c */
    private final List f18809c;

    /* JADX INFO: renamed from: d */
    private final List f18810d;

    /* JADX INFO: renamed from: U0.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    /* JADX INFO: renamed from: U0.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: U0.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0319e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(((d) obj).h()), Integer.valueOf(((d) obj2).h()));
        }
    }

    public C2197e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f18807a = list;
        this.f18808b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) list.get(i10);
                if (dVar.g() instanceof I0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    AbstractC5504s.f(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(dVar);
                } else if (dVar.g() instanceof B) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    AbstractC5504s.f(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f18809c = arrayList;
        this.f18810d = arrayList2;
        List listR0 = arrayList2 != null ? AbstractC2279u.R0(arrayList2, new C0319e()) : null;
        if (listR0 == null || listR0.isEmpty()) {
            return;
        }
        C6539E c6539eB = AbstractC6564n.b(((d) AbstractC2279u.m0(listR0)).f());
        int size2 = listR0.size();
        for (int i11 = 1; i11 < size2; i11++) {
            d dVar2 = (d) listR0.get(i11);
            while (true) {
                if (c6539eB.f60103b == 0) {
                    break;
                }
                int iF = c6539eB.f();
                if (dVar2.h() >= iF) {
                    c6539eB.l(c6539eB.f60103b - 1);
                } else if (!(dVar2.f() <= iF)) {
                    AbstractC2968a.a("Paragraph overlap not allowed, end " + dVar2.f() + " should be less than or equal to " + iF);
                }
            }
            c6539eB.h(dVar2.f());
        }
    }

    public char a(int i10) {
        return this.f18808b.charAt(i10);
    }

    public final List b() {
        return this.f18807a;
    }

    public int c() {
        return this.f18808b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List d(int i10, int i11) {
        List listM;
        List list = this.f18807a;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.g() instanceof AbstractC2207j) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = AbstractC2279u.m();
        }
        AbstractC5504s.f(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM;
    }

    public final List e() {
        List list = this.f18810d;
        return list == null ? AbstractC2279u.m() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2197e)) {
            return false;
        }
        C2197e c2197e = (C2197e) obj;
        return AbstractC5504s.c(this.f18808b, c2197e.f18808b) && AbstractC5504s.c(this.f18807a, c2197e.f18807a);
    }

    public final List f() {
        return this.f18810d;
    }

    public final List g() {
        List list = this.f18809c;
        return list == null ? AbstractC2279u.m() : list;
    }

    public final List h() {
        return this.f18809c;
    }

    public int hashCode() {
        int iHashCode = this.f18808b.hashCode() * 31;
        List list = this.f18807a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final List i(String str, int i10, int i11) {
        List list = this.f18807a;
        if (list == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) list.get(i12);
            if ((dVar.g() instanceof L0) && AbstractC5504s.c(str, dVar.i()) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                arrayList.add(M0.a(dVar));
            }
        }
        return arrayList;
    }

    public final String j() {
        return this.f18808b;
    }

    public final List k(int i10, int i11) {
        List listM;
        List list = this.f18807a;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.g() instanceof a1) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = AbstractC2279u.m();
        }
        AbstractC5504s.f(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    public final List l(int i10, int i11) {
        List listM;
        List list = this.f18807a;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if ((dVar.g() instanceof b1) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                    listM.add(obj);
                }
            }
        } else {
            listM = AbstractC2279u.m();
        }
        AbstractC5504s.f(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(C2197e c2197e) {
        return AbstractC5504s.c(this.f18807a, c2197e.f18807a);
    }

    public final boolean n(int i10, int i11) {
        List list = this.f18807a;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) list.get(i12);
                if ((dVar.g() instanceof AbstractC2207j) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(String str, int i10, int i11) {
        List list = this.f18807a;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = (d) list.get(i12);
                if ((dVar.g() instanceof L0) && AbstractC5504s.c(str, dVar.i()) && AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C2197e p(C2197e c2197e) {
        b bVar = new b(this);
        bVar.e(c2197e);
        return bVar.l();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: q */
    public C2197e subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            AbstractC2968a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        if (i10 == 0 && i11 == this.f18808b.length()) {
            return this;
        }
        String strSubstring = this.f18808b.substring(i10, i11);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return new C2197e(AbstractC2201g.g(this.f18807a, i10, i11), strSubstring);
    }

    public final C2197e r(long j10) {
        return subSequence(W0.l(j10), W0.k(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f18808b;
    }

    /* JADX INFO: renamed from: U0.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final Object f18822a;

        /* JADX INFO: renamed from: b */
        private final int f18823b;

        /* JADX INFO: renamed from: c */
        private final int f18824c;

        /* JADX INFO: renamed from: d */
        private final String f18825d;

        public d(Object obj, int i10, int i11, String str) {
            this.f18822a = obj;
            this.f18823b = i10;
            this.f18824c = i11;
            this.f18825d = str;
            if (i10 <= i11) {
                return;
            }
            AbstractC2968a.a("Reversed range is not supported");
        }

        public static /* synthetic */ d e(d dVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = dVar.f18822a;
            }
            if ((i12 & 2) != 0) {
                i10 = dVar.f18823b;
            }
            if ((i12 & 4) != 0) {
                i11 = dVar.f18824c;
            }
            if ((i12 & 8) != 0) {
                str = dVar.f18825d;
            }
            return dVar.d(obj, i10, i11, str);
        }

        public final Object a() {
            return this.f18822a;
        }

        public final int b() {
            return this.f18823b;
        }

        public final int c() {
            return this.f18824c;
        }

        public final d d(Object obj, int i10, int i11, String str) {
            return new d(obj, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC5504s.c(this.f18822a, dVar.f18822a) && this.f18823b == dVar.f18823b && this.f18824c == dVar.f18824c && AbstractC5504s.c(this.f18825d, dVar.f18825d);
        }

        public final int f() {
            return this.f18824c;
        }

        public final Object g() {
            return this.f18822a;
        }

        public final int h() {
            return this.f18823b;
        }

        public int hashCode() {
            Object obj = this.f18822a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f18823b)) * 31) + Integer.hashCode(this.f18824c)) * 31) + this.f18825d.hashCode();
        }

        public final String i() {
            return this.f18825d;
        }

        public String toString() {
            return "Range(item=" + this.f18822a + ", start=" + this.f18823b + ", end=" + this.f18824c + ", tag=" + this.f18825d + ')';
        }

        public d(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }
    }

    /* JADX INFO: renamed from: U0.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Appendable {

        /* JADX INFO: renamed from: a */
        private final StringBuilder f18811a;

        /* JADX INFO: renamed from: b */
        private final List f18812b;

        /* JADX INFO: renamed from: c */
        private final List f18813c;

        /* JADX INFO: renamed from: d */
        private final a f18814d;

        /* JADX INFO: renamed from: U0.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private final b f18815a;

            /* JADX INFO: renamed from: b */
            private final List f18816b = new ArrayList();

            public a(b bVar) {
                this.f18815a = bVar;
            }
        }

        public b(int i10) {
            this.f18811a = new StringBuilder(i10);
            this.f18812b = new ArrayList();
            this.f18813c = new ArrayList();
            this.f18814d = new a(this);
        }

        public final void a(I0 i02, int i10, int i11) {
            this.f18813c.add(new C0318b(i02, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: b */
        public b append(char c10) {
            this.f18811a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: c */
        public b append(CharSequence charSequence) {
            if (charSequence instanceof C2197e) {
                e((C2197e) charSequence);
                return this;
            }
            this.f18811a.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d */
        public b append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof C2197e) {
                f((C2197e) charSequence, i10, i11);
                return this;
            }
            this.f18811a.append(charSequence, i10, i11);
            return this;
        }

        public final void e(C2197e c2197e) {
            int length = this.f18811a.length();
            this.f18811a.append(c2197e.j());
            List listB = c2197e.b();
            if (listB != null) {
                int size = listB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d dVar = (d) listB.get(i10);
                    this.f18813c.add(new C0318b(dVar.g(), dVar.h() + length, dVar.f() + length, dVar.i()));
                }
            }
        }

        public final void f(C2197e c2197e, int i10, int i11) {
            int length = this.f18811a.length();
            this.f18811a.append((CharSequence) c2197e.j(), i10, i11);
            List listI = AbstractC2201g.i(c2197e, i10, i11, null, 4, null);
            if (listI != null) {
                int size = listI.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) listI.get(i12);
                    this.f18813c.add(new C0318b(dVar.g(), dVar.h() + length, dVar.f() + length, dVar.i()));
                }
            }
        }

        public final void g(String str) {
            this.f18811a.append(str);
        }

        public final void h() {
            if (this.f18812b.isEmpty()) {
                AbstractC2968a.c("Nothing to pop.");
            }
            ((C0318b) this.f18812b.remove(r0.size() - 1)).a(this.f18811a.length());
        }

        public final void i(int i10) {
            if (!(i10 < this.f18812b.size())) {
                AbstractC2968a.c(i10 + " should be less than " + this.f18812b.size());
            }
            while (this.f18812b.size() - 1 >= i10) {
                h();
            }
        }

        public final int j(AbstractC2207j abstractC2207j) {
            C0318b c0318b = new C0318b(abstractC2207j, this.f18811a.length(), 0, null, 12, null);
            this.f18812b.add(c0318b);
            this.f18813c.add(c0318b);
            return this.f18812b.size() - 1;
        }

        public final int k(I0 i02) {
            C0318b c0318b = new C0318b(i02, this.f18811a.length(), 0, null, 12, null);
            this.f18812b.add(c0318b);
            this.f18813c.add(c0318b);
            return this.f18812b.size() - 1;
        }

        public final C2197e l() {
            String string = this.f18811a.toString();
            List list = this.f18813c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C0318b) list.get(i10)).b(this.f18811a.length()));
            }
            return new C2197e(string, arrayList);
        }

        /* JADX INFO: renamed from: U0.e$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0318b {

            /* JADX INFO: renamed from: e */
            public static final a f18817e = new a(null);

            /* JADX INFO: renamed from: a */
            private final Object f18818a;

            /* JADX INFO: renamed from: b */
            private final int f18819b;

            /* JADX INFO: renamed from: c */
            private int f18820c;

            /* JADX INFO: renamed from: d */
            private final String f18821d;

            /* JADX INFO: renamed from: U0.e$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            public C0318b(Object obj, int i10, int i11, String str) {
                this.f18818a = obj;
                this.f18819b = i10;
                this.f18820c = i11;
                this.f18821d = str;
            }

            public final void a(int i10) {
                this.f18820c = i10;
            }

            public final d b(int i10) {
                int i11 = this.f18820c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    AbstractC2968a.c("Item.end should be set first");
                }
                return new d(this.f18818a, this.f18819b, i10, this.f18821d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0318b)) {
                    return false;
                }
                C0318b c0318b = (C0318b) obj;
                return AbstractC5504s.c(this.f18818a, c0318b.f18818a) && this.f18819b == c0318b.f18819b && this.f18820c == c0318b.f18820c && AbstractC5504s.c(this.f18821d, c0318b.f18821d);
            }

            public int hashCode() {
                Object obj = this.f18818a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f18819b)) * 31) + Integer.hashCode(this.f18820c)) * 31) + this.f18821d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f18818a + ", start=" + this.f18819b + ", end=" + this.f18820c + ", tag=" + this.f18821d + ')';
            }

            public /* synthetic */ C0318b(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public b(C2197e c2197e) {
            this(0, 1, null);
            e(c2197e);
        }
    }

    public /* synthetic */ C2197e(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? AbstractC2279u.m() : list, (i10 & 4) != 0 ? AbstractC2279u.m() : list2);
    }

    public C2197e(String str, List list, List list2) {
        this(AbstractC2201g.e(list, list2), str);
    }

    public /* synthetic */ C2197e(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? AbstractC2279u.m() : list);
    }

    public C2197e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
