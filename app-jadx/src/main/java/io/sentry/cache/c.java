package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5210h3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5197f0;
import io.sentry.O3;
import io.sentry.T2;
import io.sentry.util.p;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: e */
    protected static final Charset f50547e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a */
    protected C5322z3 f50548a;

    /* JADX INFO: renamed from: b */
    protected final io.sentry.util.p f50549b = new io.sentry.util.p(new p.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.p.a
        public final Object a() {
            return this.f50546a.f50548a.getSerializer();
        }
    });

    /* JADX INFO: renamed from: c */
    protected final File f50550c;

    /* JADX INFO: renamed from: d */
    private final int f50551d;

    c(C5322z3 c5322z3, String str, int i10) {
        w.c(str, "Directory is required.");
        this.f50548a = (C5322z3) w.c(c5322z3, "SentryOptions is required.");
        this.f50550c = new File(str);
        this.f50551d = i10;
    }

    private C5265q2 d(C5265q2 c5265q2, T2 t22) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c5265q2.c().iterator();
        while (it.hasNext()) {
            arrayList.add((T2) it.next());
        }
        arrayList.add(t22);
        return new C5265q2(c5265q2.b(), arrayList);
    }

    private O3 e(C5265q2 c5265q2) {
        for (T2 t22 : c5265q2.c()) {
            if (i(t22)) {
                return s(t22);
            }
        }
        return null;
    }

    private boolean i(T2 t22) {
        if (t22 == null) {
            return false;
        }
        return t22.O().b().equals(EnumC5210h3.Session);
    }

    private boolean l(C5265q2 c5265q2) {
        return c5265q2.c().iterator().hasNext();
    }

    private boolean n(O3 o32) {
        return o32.l().equals(O3.b.Ok) && o32.j() != null;
    }

    private void p(File file, File[] fileArr) {
        Boolean boolG;
        int i10;
        File file2;
        C5265q2 c5265q2R;
        T2 t2K;
        O3 o3S;
        C5265q2 c5265q2R2 = r(file);
        if (c5265q2R2 == null || !l(c5265q2R2)) {
            return;
        }
        this.f50548a.getClientReportRecorder().b(io.sentry.clientreport.f.CACHE_OVERFLOW, c5265q2R2);
        O3 o3E = e(c5265q2R2);
        if (o3E == null || !n(o3E) || (boolG = o3E.g()) == null || !boolG.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i10 = 0; i10 < length; i10++) {
            file2 = fileArr[i10];
            c5265q2R = r(file2);
            if (c5265q2R != null && l(c5265q2R)) {
                Iterator it = c5265q2R.c().iterator();
                while (true) {
                    t2K = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T2 t22 = (T2) it.next();
                    if (i(t22) && (o3S = s(t22)) != null && n(o3S)) {
                        Boolean boolG2 = o3S.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f50548a.getLogger().c(EnumC5215i3.ERROR, "Session %s has 2 times the init flag.", o3E.j());
                            return;
                        }
                        if (o3E.j() != null && o3E.j().equals(o3S.j())) {
                            o3S.n();
                            try {
                                t2K = T2.K((InterfaceC5197f0) this.f50549b.a(), o3S);
                                it.remove();
                                break;
                            } catch (IOException e10) {
                                this.f50548a.getLogger().a(EnumC5215i3.ERROR, e10, "Failed to create new envelope item for the session %s", o3E.j());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (t2K != null) {
            C5265q2 c5265q2D = d(c5265q2R, t2K);
            long jLastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f50548a.getLogger().c(EnumC5215i3.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            u(c5265q2D, file2, jLastModified);
            return;
        }
    }

    private C5265q2 r(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C5265q2 c5265q2D = ((InterfaceC5197f0) this.f50549b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return c5265q2D;
            } finally {
            }
        } catch (IOException e10) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    private O3 s(T2 t22) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t22.M()), f50547e));
            try {
                O3 o32 = (O3) ((InterfaceC5197f0) this.f50549b.a()).c(bufferedReader, O3.class);
                bufferedReader.close();
                return o32;
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    private void u(C5265q2 c5265q2, File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC5197f0) this.f50549b.a()).b(c5265q2, fileOutputStream);
                file.setLastModified(j10);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f50548a.getLogger().b(EnumC5215i3.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    private void v(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    protected boolean f() {
        if (this.f50550c.isDirectory() && this.f50550c.canWrite() && this.f50550c.canRead()) {
            return true;
        }
        this.f50548a.getLogger().c(EnumC5215i3.ERROR, "The directory for caching files is inaccessible.: %s", this.f50550c.getAbsolutePath());
        return false;
    }

    protected void t(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f50551d) {
            this.f50548a.getLogger().c(EnumC5215i3.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f50551d) + 1;
            v(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                p(file, fileArr2);
                if (!file.delete()) {
                    this.f50548a.getLogger().c(EnumC5215i3.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
