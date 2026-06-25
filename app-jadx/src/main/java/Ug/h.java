package ug;

import Df.r;
import Td.AbstractC2163n;
import Td.z;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.AbstractC6688m;
import tg.AbstractC6690o;
import tg.C6689n;
import tg.K;
import tg.P;
import tg.X;
import tg.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends AbstractC6690o {

    /* JADX INFO: renamed from: h */
    private static final a f61535h = new a(null);

    /* JADX INFO: renamed from: i */
    private static final P f61536i = P.a.e(P.f60968b, "/", false, 1, null);

    /* JADX INFO: renamed from: e */
    private final ClassLoader f61537e;

    /* JADX INFO: renamed from: f */
    private final AbstractC6690o f61538f;

    /* JADX INFO: renamed from: g */
    private final Lazy f61539g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean c(P p10) {
            return !r.z(p10.k(), ".class", true);
        }

        public final P b() {
            return h.f61536i;
        }

        public final P d(P p10, P base) {
            AbstractC5504s.h(p10, "<this>");
            AbstractC5504s.h(base, "base");
            return b().q(r.J(r.C0(p10.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final List invoke() {
            h hVar = h.this;
            return hVar.x(hVar.f61537e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f61541a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(i entry) {
            AbstractC5504s.h(entry, "entry");
            return Boolean.valueOf(h.f61535h.c(entry.a()));
        }
    }

    public /* synthetic */ h(ClassLoader classLoader, boolean z10, AbstractC6690o abstractC6690o, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? AbstractC6690o.f61068b : abstractC6690o);
    }

    private final String A(P p10) {
        return v(p10).p(f61536i).toString();
    }

    private final P v(P p10) {
        return f61536i.r(p10, true);
    }

    private final List w() {
        return (List) this.f61539g.getValue();
    }

    public final List x(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        AbstractC5504s.g(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        AbstractC5504s.g(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            AbstractC5504s.e(url);
            Pair pairY = y(url);
            if (pairY != null) {
                arrayList.add(pairY);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        AbstractC5504s.g(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        AbstractC5504s.g(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            AbstractC5504s.e(url2);
            Pair pairZ = z(url2);
            if (pairZ != null) {
                arrayList2.add(pairZ);
            }
        }
        return AbstractC2279u.I0(arrayList, arrayList2);
    }

    private final Pair y(URL url) {
        if (AbstractC5504s.c(url.getProtocol(), "file")) {
            return z.a(this.f61538f, P.a.d(P.f60968b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair z(URL url) {
        int iP0;
        String string = url.toString();
        AbstractC5504s.g(string, "toString(...)");
        if (!r.Q(string, "jar:file:", false, 2, null) || (iP0 = r.p0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        P.a aVar = P.f60968b;
        String strSubstring = string.substring(4, iP0);
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return z.a(j.d(P.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f61538f, c.f61541a), f61536i);
    }

    @Override // tg.AbstractC6690o
    public X b(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // tg.AbstractC6690o
    public void c(P source, P target) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // tg.AbstractC6690o
    public void g(P dir, boolean z10) throws IOException {
        AbstractC5504s.h(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // tg.AbstractC6690o
    public void i(P path, boolean z10) throws IOException {
        AbstractC5504s.h(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // tg.AbstractC6690o
    public List k(P dir) throws FileNotFoundException {
        AbstractC5504s.h(dir, "dir");
        String strA = A(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : w()) {
            AbstractC6690o abstractC6690o = (AbstractC6690o) pair.getFirst();
            P p10 = (P) pair.getSecond();
            try {
                List listK = abstractC6690o.k(p10.q(strA));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (f61535h.c((P) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f61535h.d((P) it.next(), p10));
                }
                AbstractC2279u.D(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return AbstractC2279u.b1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // tg.AbstractC6690o
    public C6689n m(P path) {
        AbstractC5504s.h(path, "path");
        if (!f61535h.c(path)) {
            return null;
        }
        String strA = A(path);
        for (Pair pair : w()) {
            C6689n c6689nM = ((AbstractC6690o) pair.getFirst()).m(((P) pair.getSecond()).q(strA));
            if (c6689nM != null) {
                return c6689nM;
            }
        }
        return null;
    }

    @Override // tg.AbstractC6690o
    public AbstractC6688m n(P file) throws FileNotFoundException {
        AbstractC5504s.h(file, "file");
        if (!f61535h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strA = A(file);
        for (Pair pair : w()) {
            try {
                return ((AbstractC6690o) pair.getFirst()).n(((P) pair.getSecond()).q(strA));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // tg.AbstractC6690o
    public X p(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // tg.AbstractC6690o
    public Z q(P file) throws FileNotFoundException {
        Z zK;
        AbstractC5504s.h(file, "file");
        if (!f61535h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        P p10 = f61536i;
        InputStream resourceAsStream = this.f61537e.getResourceAsStream(P.s(p10, file, false, 2, null).p(p10).toString());
        if (resourceAsStream != null && (zK = K.k(resourceAsStream)) != null) {
            return zK;
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    public h(ClassLoader classLoader, boolean z10, AbstractC6690o systemFileSystem) {
        AbstractC5504s.h(classLoader, "classLoader");
        AbstractC5504s.h(systemFileSystem, "systemFileSystem");
        this.f61537e = classLoader;
        this.f61538f = systemFileSystem;
        this.f61539g = AbstractC2163n.b(new b());
        if (z10) {
            w().size();
        }
    }
}
