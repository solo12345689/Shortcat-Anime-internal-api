package O4;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f12959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f12960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f12961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f12962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12965g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f12967i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12969k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12966h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f12968j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f12970l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f12971m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0206b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable f12972n = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (b.this) {
                try {
                    if (b.this.f12967i == null) {
                        return null;
                    }
                    b.this.G0();
                    if (b.this.O()) {
                        b.this.p0();
                        b.this.f12969k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: O4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class ThreadFactoryC0206b implements ThreadFactory {
        private ThreadFactoryC0206b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0206b(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f12974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f12975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12976c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.w(this, false);
        }

        public void b() {
            if (this.f12976c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            b.this.w(this, true);
            this.f12976c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (b.this) {
                try {
                    if (this.f12974a.f12983f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f12974a.f12982e) {
                        this.f12975b[i10] = true;
                    }
                    fileK = this.f12974a.k(i10);
                    b.this.f12959a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f12974a = dVar;
            this.f12975b = dVar.f12982e ? null : new boolean[b.this.f12965g];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f12979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f12980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f12981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f12983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f12984g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f12965g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f12979b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f12980c[i10];
        }

        public File k(int i10) {
            return this.f12981d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f12979b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f12978a = str;
            this.f12979b = new long[b.this.f12965g];
            this.f12980c = new File[b.this.f12965g];
            this.f12981d = new File[b.this.f12965g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f12965g; i10++) {
                sb2.append(i10);
                this.f12980c[i10] = new File(b.this.f12959a, sb2.toString());
                sb2.append(".tmp");
                this.f12981d[i10] = new File(b.this.f12959a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f12987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f12988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f12989d;

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f12989d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f12986a = str;
            this.f12987b = j10;
            this.f12989d = fileArr;
            this.f12988c = jArr;
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f12959a = file;
        this.f12963e = i10;
        this.f12960b = new File(file, "journal");
        this.f12961c = new File(file, "journal.tmp");
        this.f12962d = new File(file, "journal.bkp");
        this.f12965g = i11;
        this.f12964f = j10;
    }

    private static void C(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c E(String str, long j10) {
        o();
        d dVar = (d) this.f12968j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f12984g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f12968j.put(str, dVar);
        } else if (dVar.f12983f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f12983f = cVar;
        this.f12967i.append((CharSequence) "DIRTY");
        this.f12967i.append(' ');
        this.f12967i.append((CharSequence) str);
        this.f12967i.append('\n');
        H(this.f12967i);
        return cVar;
    }

    private static void F0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            C(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        while (this.f12966h > this.f12964f) {
            B0((String) ((Map.Entry) this.f12968j.entrySet().iterator().next()).getKey());
        }
    }

    private static void H(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O() {
        int i10 = this.f12969k;
        return i10 >= 2000 && i10 >= this.f12968j.size();
    }

    public static b S(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                F0(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f12960b.exists()) {
            try {
                bVar.h0();
                bVar.Y();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.z();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.p0();
        return bVar2;
    }

    private void Y() throws IOException {
        C(this.f12961c);
        Iterator it = this.f12968j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f12983f == null) {
                while (i10 < this.f12965g) {
                    this.f12966h += dVar.f12979b[i10];
                    i10++;
                }
            } else {
                dVar.f12983f = null;
                while (i10 < this.f12965g) {
                    C(dVar.j(i10));
                    C(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void h0() {
        O4.c cVar = new O4.c(new FileInputStream(this.f12960b), O4.d.f12997a);
        try {
            String strH = cVar.h();
            String strH2 = cVar.h();
            String strH3 = cVar.h();
            String strH4 = cVar.h();
            String strH5 = cVar.h();
            if (!"libcore.io.DiskLruCache".equals(strH) || !"1".equals(strH2) || !Integer.toString(this.f12963e).equals(strH3) || !Integer.toString(this.f12965g).equals(strH4) || !"".equals(strH5)) {
                throw new IOException("unexpected journal header: [" + strH + ", " + strH2 + ", " + strH4 + ", " + strH5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    k0(cVar.h());
                    i10++;
                } catch (EOFException unused) {
                    this.f12969k = i10 - this.f12968j.size();
                    if (cVar.g()) {
                        p0();
                    } else {
                        this.f12967i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12960b, true), O4.d.f12997a));
                    }
                    O4.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            O4.d.a(cVar);
            throw th2;
        }
    }

    private void k0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f12968j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f12968j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f12968j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f12982e = true;
            dVar.f12983f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f12983f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void o() {
        if (this.f12967i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p0() {
        try {
            Writer writer = this.f12967i;
            if (writer != null) {
                q(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12961c), O4.d.f12997a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f12963e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f12965g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f12968j.values()) {
                    if (dVar.f12983f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f12978a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f12978a + dVar.l() + '\n');
                    }
                }
                q(bufferedWriter);
                if (this.f12960b.exists()) {
                    F0(this.f12960b, this.f12962d, true);
                }
                F0(this.f12961c, this.f12960b, false);
                this.f12962d.delete();
                this.f12967i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f12960b, true), O4.d.f12997a));
            } catch (Throwable th2) {
                q(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static void q(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(c cVar, boolean z10) {
        d dVar = cVar.f12974a;
        if (dVar.f12983f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f12982e) {
            for (int i10 = 0; i10 < this.f12965g; i10++) {
                if (!cVar.f12975b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f12965g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                C(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f12979b[i11];
                long length = fileJ.length();
                dVar.f12979b[i11] = length;
                this.f12966h = (this.f12966h - j10) + length;
            }
        }
        this.f12969k++;
        dVar.f12983f = null;
        if (dVar.f12982e || z10) {
            dVar.f12982e = true;
            this.f12967i.append((CharSequence) "CLEAN");
            this.f12967i.append(' ');
            this.f12967i.append((CharSequence) dVar.f12978a);
            this.f12967i.append((CharSequence) dVar.l());
            this.f12967i.append('\n');
            if (z10) {
                long j11 = this.f12970l;
                this.f12970l = 1 + j11;
                dVar.f12984g = j11;
            }
        } else {
            this.f12968j.remove(dVar.f12978a);
            this.f12967i.append((CharSequence) "REMOVE");
            this.f12967i.append(' ');
            this.f12967i.append((CharSequence) dVar.f12978a);
            this.f12967i.append('\n');
        }
        H(this.f12967i);
        if (this.f12966h > this.f12964f || O()) {
            this.f12971m.submit(this.f12972n);
        }
    }

    public synchronized boolean B0(String str) {
        try {
            o();
            d dVar = (d) this.f12968j.get(str);
            if (dVar != null && dVar.f12983f == null) {
                for (int i10 = 0; i10 < this.f12965g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f12966h -= dVar.f12979b[i10];
                    dVar.f12979b[i10] = 0;
                }
                this.f12969k++;
                this.f12967i.append((CharSequence) "REMOVE");
                this.f12967i.append(' ');
                this.f12967i.append((CharSequence) str);
                this.f12967i.append('\n');
                this.f12968j.remove(str);
                if (O()) {
                    this.f12971m.submit(this.f12972n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public c D(String str) {
        return E(str, -1L);
    }

    public synchronized e J(String str) {
        Throwable th2;
        try {
            try {
                o();
                d dVar = (d) this.f12968j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f12982e) {
                    return null;
                }
                for (File file : dVar.f12980c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f12969k++;
                this.f12967i.append((CharSequence) "READ");
                this.f12967i.append(' ');
                this.f12967i.append((CharSequence) str);
                this.f12967i.append('\n');
                if (O()) {
                    this.f12971m.submit(this.f12972n);
                }
                return new e(this, str, dVar.f12984g, dVar.f12980c, dVar.f12979b, null);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f12967i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f12968j.values())) {
                if (dVar.f12983f != null) {
                    dVar.f12983f.a();
                }
            }
            G0();
            q(this.f12967i);
            this.f12967i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void z() throws IOException {
        close();
        O4.d.b(this.f12959a);
    }
}
