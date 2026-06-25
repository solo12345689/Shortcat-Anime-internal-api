package tg;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class P implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f60968b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f60969c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6686k f60970a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ P d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ P e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ P f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final P a(File file, boolean z10) {
            AbstractC5504s.h(file, "<this>");
            String string = file.toString();
            AbstractC5504s.g(string, "toString(...)");
            return b(string, z10);
        }

        public final P b(String str, boolean z10) {
            AbstractC5504s.h(str, "<this>");
            return ug.d.k(str, z10);
        }

        public final P c(Path path, boolean z10) {
            AbstractC5504s.h(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        AbstractC5504s.g(separator, "separator");
        f60969c = separator;
    }

    public P(C6686k bytes) {
        AbstractC5504s.h(bytes, "bytes");
        this.f60970a = bytes;
    }

    public static /* synthetic */ P s(P p10, P p11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return p10.r(p11, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(P other) {
        AbstractC5504s.h(other, "other");
        return b().compareTo(other.b());
    }

    public final C6686k b() {
        return this.f60970a;
    }

    public final P c() {
        int iO = ug.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new P(b().M(0, iO));
    }

    public boolean equals(Object obj) {
        return (obj instanceof P) && AbstractC5504s.c(((P) obj).b(), b());
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        int iO = ug.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < b().K() && b().m(iO) == 92) {
            iO++;
        }
        int iK = b().K();
        int i10 = iO;
        while (iO < iK) {
            if (b().m(iO) == 47 || b().m(iO) == 92) {
                arrayList.add(b().M(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < b().K()) {
            arrayList.add(b().M(i10, b().K()));
        }
        return arrayList;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final boolean isAbsolute() {
        return ug.d.o(this) != -1;
    }

    public final String k() {
        return m().Q();
    }

    public final C6686k m() {
        int iL = ug.d.l(this);
        return iL != -1 ? C6686k.N(b(), iL + 1, 0, 2, null) : (u() == null || b().K() != 2) ? b() : C6686k.f61045e;
    }

    public final P n() {
        if (AbstractC5504s.c(b(), ug.d.f61527d) || AbstractC5504s.c(b(), ug.d.f61524a) || AbstractC5504s.c(b(), ug.d.f61525b) || ug.d.n(this)) {
            return null;
        }
        int iL = ug.d.l(this);
        if (iL == 2 && u() != null) {
            if (b().K() == 3) {
                return null;
            }
            return new P(C6686k.N(b(), 0, 3, 1, null));
        }
        if (iL == 1 && b().L(ug.d.f61525b)) {
            return null;
        }
        if (iL != -1 || u() == null) {
            return iL == -1 ? new P(ug.d.f61527d) : iL == 0 ? new P(C6686k.N(b(), 0, 1, 1, null)) : new P(C6686k.N(b(), 0, iL, 1, null));
        }
        if (b().K() == 2) {
            return null;
        }
        return new P(C6686k.N(b(), 0, 2, 1, null));
    }

    public final P p(P other) {
        AbstractC5504s.h(other, "other");
        if (!AbstractC5504s.c(c(), other.c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listH = h();
        List listH2 = other.h();
        int iMin = Math.min(listH.size(), listH2.size());
        int i10 = 0;
        while (i10 < iMin && AbstractC5504s.c(listH.get(i10), listH2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && b().K() == other.b().K()) {
            return a.e(f60968b, ".", false, 1, null);
        }
        if (listH2.subList(i10, listH2.size()).indexOf(ug.d.f61528e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C6683h c6683h = new C6683h();
        C6686k c6686kM = ug.d.m(other);
        if (c6686kM == null && (c6686kM = ug.d.m(this)) == null) {
            c6686kM = ug.d.s(f60969c);
        }
        int size = listH2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c6683h.A0(ug.d.f61528e);
            c6683h.A0(c6686kM);
        }
        int size2 = listH.size();
        while (i10 < size2) {
            c6683h.A0((C6686k) listH.get(i10));
            c6683h.A0(c6686kM);
            i10++;
        }
        return ug.d.q(c6683h, false);
    }

    public final P q(String child) {
        AbstractC5504s.h(child, "child");
        return ug.d.j(this, ug.d.q(new C6683h().s0(child), false), false);
    }

    public final P r(P child, boolean z10) {
        AbstractC5504s.h(child, "child");
        return ug.d.j(this, child, z10);
    }

    public final Path t() {
        Path path = Paths.get(toString(), new String[0]);
        AbstractC5504s.g(path, "get(...)");
        return path;
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return b().Q();
    }

    public final Character u() {
        if (C6686k.x(b(), ug.d.f61524a, 0, 2, null) != -1 || b().K() < 2 || b().m(1) != 58) {
            return null;
        }
        char cM = (char) b().m(0);
        if (('a' > cM || cM >= '{') && ('A' > cM || cM >= '[')) {
            return null;
        }
        return Character.valueOf(cM);
    }
}
