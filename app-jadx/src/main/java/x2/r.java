package x2;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import v2.InterfaceC6838b;
import x2.InterfaceC7048a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC7048a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashSet f63787l = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f63788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f63789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f63790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f63791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f63792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f63793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f63794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f63795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC7048a.C0959a f63798k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f63799a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f63799a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (r.this) {
                this.f63799a.open();
                r.this.p();
                r.this.f63789b.f();
            }
        }
    }

    public r(File file, d dVar, InterfaceC6838b interfaceC6838b) {
        this(file, dVar, interfaceC6838b, null, false, false);
    }

    private s A(String str, s sVar) {
        boolean z10;
        if (!this.f63794g) {
            return sVar;
        }
        String name = ((File) AbstractC6614a.e(sVar.f63751e)).getName();
        long j10 = sVar.f63749c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f fVar = this.f63791d;
        if (fVar != null) {
            try {
                fVar.h(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                AbstractC6635w.i("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        s sVarK = ((j) AbstractC6614a.e(this.f63790c.f(str))).k(sVar, jCurrentTimeMillis, z10);
        v(sVar, sVarK);
        return sVarK;
    }

    private static synchronized void B(File file) {
        f63787l.remove(file.getAbsoluteFile());
    }

    private void k(s sVar) {
        this.f63790c.k(sVar.f63747a).a(sVar);
        this.f63796i += sVar.f63749c;
        t(sVar);
    }

    private static void m(File file) throws InterfaceC7048a.C0959a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC6635w.d("SimpleCache", str);
        throw new InterfaceC7048a.C0959a(str);
    }

    private static long n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private s o(String str, long j10, long j11) {
        s sVarD;
        j jVarF = this.f63790c.f(str);
        if (jVarF == null) {
            return s.n(str, j10, j11);
        }
        while (true) {
            sVarD = jVarF.d(j10, j11);
            if (!sVarD.f63750d || ((File) AbstractC6614a.e(sVarD.f63751e)).length() == sVarD.f63749c) {
                break;
            }
            z();
        }
        return sVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!this.f63788a.exists()) {
            try {
                m(this.f63788a);
            } catch (InterfaceC7048a.C0959a e10) {
                this.f63798k = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f63788a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f63788a;
            AbstractC6635w.d("SimpleCache", str);
            this.f63798k = new InterfaceC7048a.C0959a(str);
            return;
        }
        long jR = r(fileArrListFiles);
        this.f63795h = jR;
        if (jR == -1) {
            try {
                this.f63795h = n(this.f63788a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f63788a;
                AbstractC6635w.e("SimpleCache", str2, e11);
                this.f63798k = new InterfaceC7048a.C0959a(str2, e11);
                return;
            }
        }
        try {
            this.f63790c.l(this.f63795h);
            f fVar = this.f63791d;
            if (fVar != null) {
                fVar.e(this.f63795h);
                Map mapB = this.f63791d.b();
                q(this.f63788a, true, fileArrListFiles, mapB);
                this.f63791d.g(mapB.keySet());
            } else {
                q(this.f63788a, true, fileArrListFiles, null);
            }
            this.f63790c.p();
            try {
                this.f63790c.q();
            } catch (IOException e12) {
                AbstractC6635w.e("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f63788a;
            AbstractC6635w.e("SimpleCache", str3, e13);
            this.f63798k = new InterfaceC7048a.C0959a(str3, e13);
        }
    }

    private void q(File file, boolean z10, File[] fileArr, Map map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                q(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!k.m(name) && !name.endsWith(".uid"))) {
                e eVar = map != null ? (e) map.remove(name) : null;
                if (eVar != null) {
                    j10 = eVar.f63741a;
                    j11 = eVar.f63742b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                s sVarK = s.k(file2, j10, j11, this.f63790c);
                if (sVarK != null) {
                    k(sVarK);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long r(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    AbstractC6635w.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean s(File file) {
        return f63787l.add(file.getAbsoluteFile());
    }

    private void t(s sVar) {
        ArrayList arrayList = (ArrayList) this.f63792e.get(sVar.f63747a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC7048a.b) arrayList.get(size)).b(this, sVar);
            }
        }
        this.f63789b.b(this, sVar);
    }

    private void u(i iVar) {
        ArrayList arrayList = (ArrayList) this.f63792e.get(iVar.f63747a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC7048a.b) arrayList.get(size)).e(this, iVar);
            }
        }
        this.f63789b.e(this, iVar);
    }

    private void v(s sVar, i iVar) {
        ArrayList arrayList = (ArrayList) this.f63792e.get(sVar.f63747a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC7048a.b) arrayList.get(size)).d(this, sVar, iVar);
            }
        }
        this.f63789b.d(this, sVar, iVar);
    }

    private static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void y(i iVar) {
        j jVarF = this.f63790c.f(iVar.f63747a);
        if (jVarF == null || !jVarF.j(iVar)) {
            return;
        }
        this.f63796i -= iVar.f63749c;
        if (this.f63791d != null) {
            String name = ((File) AbstractC6614a.e(iVar.f63751e)).getName();
            try {
                this.f63791d.f(name);
            } catch (IOException unused) {
                AbstractC6635w.i("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f63790c.n(jVarF.f63754b);
        u(iVar);
    }

    private void z() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f63790c.g().iterator();
        while (it.hasNext()) {
            for (i iVar : ((j) it.next()).e()) {
                if (((File) AbstractC6614a.e(iVar.f63751e)).length() != iVar.f63749c) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            y((i) arrayList.get(i10));
        }
    }

    @Override // x2.InterfaceC7048a
    public synchronized File a(String str, long j10, long j11) throws Throwable {
        Throwable th2;
        try {
            try {
                AbstractC6614a.g(!this.f63797j);
                l();
                j jVarF = this.f63790c.f(str);
                AbstractC6614a.e(jVarF);
                AbstractC6614a.g(jVarF.g(j10, j11));
                if (!this.f63788a.exists()) {
                    try {
                        m(this.f63788a);
                        z();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f63789b.a(this, str, j10, j11);
                File file = new File(this.f63788a, Integer.toString(this.f63793f.nextInt(10)));
                if (!file.exists()) {
                    m(file);
                }
                return s.q(file, jVarF.f63753a, j10, System.currentTimeMillis());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // x2.InterfaceC7048a
    public synchronized l b(String str) {
        AbstractC6614a.g(!this.f63797j);
        return this.f63790c.h(str);
    }

    @Override // x2.InterfaceC7048a
    public synchronized void c(String str, m mVar) {
        AbstractC6614a.g(!this.f63797j);
        l();
        this.f63790c.d(str, mVar);
        try {
            this.f63790c.q();
        } catch (IOException e10) {
            throw new InterfaceC7048a.C0959a(e10);
        }
    }

    @Override // x2.InterfaceC7048a
    public synchronized i d(String str, long j10, long j11) throws Throwable {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            AbstractC6614a.g(!this.f63797j);
            l();
            s sVarO = o(str, j10, j11);
            if (sVarO.f63750d) {
                return A(str, sVarO);
            }
            if (this.f63790c.k(str).i(j10, sVarO.f63749c)) {
                return sVarO;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // x2.InterfaceC7048a
    public synchronized void e(i iVar) {
        AbstractC6614a.g(!this.f63797j);
        j jVar = (j) AbstractC6614a.e(this.f63790c.f(iVar.f63747a));
        jVar.l(iVar.f63748b);
        this.f63790c.n(jVar.f63754b);
        notifyAll();
    }

    @Override // x2.InterfaceC7048a
    public synchronized void f(i iVar) {
        AbstractC6614a.g(!this.f63797j);
        y(iVar);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:? -> B:10:0x001e). Please report as a decompilation issue!!! */
    @Override // x2.InterfaceC7048a
    public synchronized i g(String str, long j10, long j11) throws Throwable {
        try {
            AbstractC6614a.g(!this.f63797j);
            l();
            while (true) {
                i iVarD = d(str, j10, j11);
                long j12 = j11;
                long j13 = j10;
                String str2 = str;
                if (iVarD != null) {
                    return iVarD;
                }
                try {
                    wait();
                    str = str2;
                    j10 = j13;
                    j11 = j12;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // x2.InterfaceC7048a
    public synchronized void h(File file, long j10) {
        boolean z10 = true;
        AbstractC6614a.g(!this.f63797j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            s sVar = (s) AbstractC6614a.e(s.m(file, j10, this.f63790c));
            j jVar = (j) AbstractC6614a.e(this.f63790c.f(sVar.f63747a));
            AbstractC6614a.g(jVar.g(sVar.f63748b, sVar.f63749c));
            long jA = l.a(jVar.c());
            if (jA != -1) {
                if (sVar.f63748b + sVar.f63749c > jA) {
                    z10 = false;
                }
                AbstractC6614a.g(z10);
            }
            if (this.f63791d == null) {
                k(sVar);
                this.f63790c.q();
                notifyAll();
                return;
            }
            try {
                this.f63791d.h(file.getName(), sVar.f63749c, sVar.f63752f);
                k(sVar);
                try {
                    this.f63790c.q();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new InterfaceC7048a.C0959a(e10);
                }
            } catch (IOException e11) {
                throw new InterfaceC7048a.C0959a(e11);
            }
        }
    }

    public synchronized void l() {
        InterfaceC7048a.C0959a c0959a = this.f63798k;
        if (c0959a != null) {
            throw c0959a;
        }
    }

    public synchronized void x() {
        File file;
        if (this.f63797j) {
            return;
        }
        this.f63792e.clear();
        z();
        try {
            try {
                this.f63790c.q();
                file = this.f63788a;
            } catch (Throwable th2) {
                B(this.f63788a);
                this.f63797j = true;
                throw th2;
            }
        } catch (IOException e10) {
            AbstractC6635w.e("SimpleCache", "Storing index file failed", e10);
            file = this.f63788a;
        }
        B(file);
        this.f63797j = true;
    }

    public r(File file, d dVar, InterfaceC6838b interfaceC6838b, byte[] bArr, boolean z10, boolean z11) {
        this(file, dVar, new k(interfaceC6838b, file, bArr, z10, z11), (interfaceC6838b == null || z11) ? null : new f(interfaceC6838b));
    }

    r(File file, d dVar, k kVar, f fVar) {
        if (s(file)) {
            this.f63788a = file;
            this.f63789b = dVar;
            this.f63790c = kVar;
            this.f63791d = fVar;
            this.f63792e = new HashMap();
            this.f63793f = new Random();
            this.f63794g = dVar.c();
            this.f63795h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
