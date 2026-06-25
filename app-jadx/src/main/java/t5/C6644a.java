package t5;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r5.C6272b;
import r5.InterfaceC6271a;
import s5.InterfaceC6430a;
import t5.f;
import x5.AbstractC7054a;
import x5.c;
import y5.C7205c;

/* JADX INFO: renamed from: t5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6644a implements t5.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f60737f = C6644a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f60738g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f60739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f60740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f60741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6430a f60742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F5.a f60743e;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class C0908a implements x5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f60744a;

        @Override // x5.b
        public void b(File file) {
            c cVarU = C6644a.this.u(file);
            if (cVarU == null || cVarU.f60750a != ".cnt") {
                return;
            }
            this.f60744a.add(new b(cVarU.f60751b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f60744a);
        }

        private C0908a() {
            this.f60744a = new ArrayList();
        }

        @Override // x5.b
        public void a(File file) {
        }

        @Override // x5.b
        public void c(File file) {
        }
    }

    /* JADX INFO: renamed from: t5.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f60746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6272b f60747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f60748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f60749d;

        public C6272b a() {
            return this.f60747b;
        }

        @Override // t5.f.a
        public String getId() {
            return this.f60746a;
        }

        @Override // t5.f.a
        public long getSize() {
            if (this.f60748c < 0) {
                this.f60748c = this.f60747b.size();
            }
            return this.f60748c;
        }

        @Override // t5.f.a
        public long getTimestamp() {
            if (this.f60749d < 0) {
                this.f60749d = this.f60747b.d().lastModified();
            }
            return this.f60749d;
        }

        private b(String str, File file) {
            y5.k.g(file);
            this.f60746a = (String) y5.k.g(str);
            this.f60747b = C6272b.b(file);
            this.f60748c = -1L;
            this.f60749d = -1L;
        }
    }

    /* JADX INFO: renamed from: t5.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60751b;

        public static c b(File file) {
            String strS;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strS = C6644a.s(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strS.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strS, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f60751b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f60751b + this.f60750a;
        }

        public String toString() {
            return this.f60750a + "(" + this.f60751b + ")";
        }

        private c(String str, String str2) {
            this.f60750a = str;
            this.f60751b = str2;
        }
    }

    /* JADX INFO: renamed from: t5.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    /* JADX INFO: renamed from: t5.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f60752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f60753b;

        public e(String str, File file) {
            this.f60752a = str;
            this.f60753b = file;
        }

        public InterfaceC6271a a(Object obj, long j10) throws c.d {
            File fileQ = C6644a.this.q(this.f60752a);
            try {
                x5.c.b(this.f60753b, fileQ);
                if (fileQ.exists()) {
                    fileQ.setLastModified(j10);
                }
                return C6272b.b(fileQ);
            } catch (c.d e10) {
                Throwable cause = e10.getCause();
                C6644a.this.f60742d.a(cause != null ? !(cause instanceof c.C0963c) ? cause instanceof FileNotFoundException ? InterfaceC6430a.EnumC0896a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : InterfaceC6430a.EnumC0896a.WRITE_RENAME_FILE_OTHER : InterfaceC6430a.EnumC0896a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND : InterfaceC6430a.EnumC0896a.WRITE_RENAME_FILE_OTHER, C6644a.f60737f, "commit", e10);
                throw e10;
            }
        }

        @Override // t5.f.b
        public boolean p() {
            return !this.f60753b.exists() || this.f60753b.delete();
        }

        @Override // t5.f.b
        public void q(s5.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f60753b);
                try {
                    C7205c c7205c = new C7205c(fileOutputStream);
                    jVar.a(c7205c);
                    c7205c.flush();
                    long jA = c7205c.a();
                    fileOutputStream.close();
                    if (this.f60753b.length() != jA) {
                        throw new d(jA, this.f60753b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                C6644a.this.f60742d.a(InterfaceC6430a.EnumC0896a.WRITE_UPDATE_FILE_NOT_FOUND, C6644a.f60737f, "updateResource", e10);
                throw e10;
            }
        }

        @Override // t5.f.b
        public InterfaceC6271a r(Object obj) {
            return a(obj, C6644a.this.f60743e.now());
        }
    }

    /* JADX INFO: renamed from: t5.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f implements x5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f60755a;

        private boolean d(File file) {
            c cVarU = C6644a.this.u(file);
            if (cVarU == null) {
                return false;
            }
            String str = cVarU.f60750a;
            if (str == ".tmp") {
                return e(file);
            }
            y5.k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > C6644a.this.f60743e.now() - C6644a.f60738g;
        }

        @Override // x5.b
        public void a(File file) {
            if (!C6644a.this.f60739a.equals(file) && !this.f60755a) {
                file.delete();
            }
            if (this.f60755a && file.equals(C6644a.this.f60741c)) {
                this.f60755a = false;
            }
        }

        @Override // x5.b
        public void b(File file) {
            if (this.f60755a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // x5.b
        public void c(File file) {
            if (this.f60755a || !file.equals(C6644a.this.f60741c)) {
                return;
            }
            this.f60755a = true;
        }

        private f() {
        }
    }

    public C6644a(File file, int i10, InterfaceC6430a interfaceC6430a) {
        y5.k.g(file);
        this.f60739a = file;
        this.f60740b = y(file, interfaceC6430a);
        this.f60741c = new File(file, x(i10));
        this.f60742d = interfaceC6430a;
        B();
        this.f60743e = F5.d.a();
    }

    private boolean A(String str, boolean z10) {
        File fileQ = q(str);
        boolean zExists = fileQ.exists();
        if (z10 && zExists) {
            fileQ.setLastModified(this.f60743e.now());
        }
        return zExists;
    }

    private void B() {
        if (this.f60739a.exists()) {
            if (this.f60741c.exists()) {
                return;
            } else {
                AbstractC7054a.b(this.f60739a);
            }
        }
        try {
            x5.c.a(this.f60741c);
        } catch (c.a unused) {
            this.f60742d.a(InterfaceC6430a.EnumC0896a.WRITE_CREATE_DIR, f60737f, "version directory could not be created: " + this.f60741c, null);
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(w(cVar.f60751b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c u(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && v(cVarB.f60751b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        return this.f60741c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean y(File file, InterfaceC6430a interfaceC6430a) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e10) {
                    e = e10;
                    interfaceC6430a.a(InterfaceC6430a.EnumC0896a.OTHER, f60737f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e11) {
                e = e11;
                canonicalPath = null;
            }
        } catch (Exception e12) {
            interfaceC6430a.a(InterfaceC6430a.EnumC0896a.OTHER, f60737f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    private void z(File file, String str) throws c.a {
        try {
            x5.c.a(file);
        } catch (c.a e10) {
            this.f60742d.a(InterfaceC6430a.EnumC0896a.WRITE_CREATE_DIR, f60737f, str, e10);
            throw e10;
        }
    }

    @Override // t5.f
    public void a() {
        AbstractC7054a.a(this.f60739a);
    }

    @Override // t5.f
    public void b() {
        AbstractC7054a.c(this.f60739a, new f());
    }

    @Override // t5.f
    public boolean c(String str, Object obj) {
        return A(str, true);
    }

    @Override // t5.f
    public f.b d(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str);
        File fileV = v(cVar.f60751b);
        if (!fileV.exists()) {
            z(fileV, "insert");
        }
        try {
            return new e(str, cVar.a(fileV));
        } catch (IOException e10) {
            this.f60742d.a(InterfaceC6430a.EnumC0896a.WRITE_CREATE_TEMPFILE, f60737f, "insert", e10);
            throw e10;
        }
    }

    @Override // t5.f
    public boolean e(String str, Object obj) {
        return A(str, false);
    }

    @Override // t5.f
    public InterfaceC6271a f(String str, Object obj) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return null;
        }
        fileQ.setLastModified(this.f60743e.now());
        return C6272b.c(fileQ);
    }

    @Override // t5.f
    public long h(f.a aVar) {
        return p(((b) aVar).a().d());
    }

    @Override // t5.f
    public boolean isExternal() {
        return this.f60740b;
    }

    File q(String str) {
        return new File(t(str));
    }

    @Override // t5.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List g() {
        C0908a c0908a = new C0908a();
        AbstractC7054a.c(this.f60741c, c0908a);
        return c0908a.d();
    }

    @Override // t5.f
    public long remove(String str) {
        return p(q(str));
    }
}
