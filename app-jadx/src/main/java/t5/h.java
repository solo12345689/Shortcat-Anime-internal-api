package t5;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import r5.InterfaceC6271a;
import s5.InterfaceC6430a;
import t5.f;
import x5.AbstractC7054a;
import x5.c;
import y5.n;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f60810f = h.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f60812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6430a f60814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f60815e = new a(null, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f60816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f60817b;

        a(File file, f fVar) {
            this.f60816a = fVar;
            this.f60817b = file;
        }
    }

    public h(int i10, n nVar, String str, InterfaceC6430a interfaceC6430a) {
        this.f60811a = i10;
        this.f60814d = interfaceC6430a;
        this.f60812b = nVar;
        this.f60813c = str;
    }

    private void j() throws c.a {
        File file = new File((File) this.f60812b.get(), this.f60813c);
        i(file);
        this.f60815e = new a(file, new C6644a(file, this.f60811a, this.f60814d));
    }

    private boolean m() {
        File file;
        a aVar = this.f60815e;
        return aVar.f60816a == null || (file = aVar.f60817b) == null || !file.exists();
    }

    @Override // t5.f
    public void a() {
        l().a();
    }

    @Override // t5.f
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            AbstractC7283a.j(f60810f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // t5.f
    public boolean c(String str, Object obj) {
        return l().c(str, obj);
    }

    @Override // t5.f
    public f.b d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // t5.f
    public boolean e(String str, Object obj) {
        return l().e(str, obj);
    }

    @Override // t5.f
    public InterfaceC6271a f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // t5.f
    public Collection g() {
        return l().g();
    }

    @Override // t5.f
    public long h(f.a aVar) {
        return l().h(aVar);
    }

    void i(File file) throws c.a {
        try {
            x5.c.a(file);
            AbstractC7283a.a(f60810f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e10) {
            this.f60814d.a(InterfaceC6430a.EnumC0896a.WRITE_CREATE_DIR, f60810f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    @Override // t5.f
    public boolean isExternal() {
        try {
            return l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void k() {
        if (this.f60815e.f60816a == null || this.f60815e.f60817b == null) {
            return;
        }
        AbstractC7054a.b(this.f60815e.f60817b);
    }

    synchronized f l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (f) y5.k.g(this.f60815e.f60816a);
    }

    @Override // t5.f
    public long remove(String str) {
        return l().remove(str);
    }
}
