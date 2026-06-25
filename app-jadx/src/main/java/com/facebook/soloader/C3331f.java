package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.soloader.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3331f extends E {

    /* JADX INFO: renamed from: a */
    protected final File f38578a;

    /* JADX INFO: renamed from: b */
    protected int f38579b;

    /* JADX INFO: renamed from: c */
    protected final List f38580c;

    public C3331f(File file, int i10) {
        this(file, i10, new String[0]);
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i10, this.f38578a, threadPolicy);
    }

    public File f(String str) {
        File file = new File(this.f38578a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    protected int g(String str, int i10, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f38553b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f38580c.contains(str)) {
            p.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File fileF = f(str);
        if (fileF == null) {
            p.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = fileF.getCanonicalPath();
        p.a("SoLoader", str + " file found at " + canonicalPath);
        if ((i10 & 1) != 0 && (this.f38579b & 2) != 0) {
            p.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f38579b & 1) != 0) {
            i iVar = new i(fileF);
            try {
                t.h(str, iVar, i10, threadPolicy);
                iVar.close();
            } catch (Throwable th2) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            p.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f38553b.a(canonicalPath, i10);
            return 1;
        } catch (UnsatisfiedLinkError e10) {
            throw D.b(str, e10);
        }
    }

    public void h() {
        this.f38579b |= 1;
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f38578a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f38578a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f38579b + ']';
    }

    public C3331f(File file, int i10, String[] strArr) {
        this.f38578a = file;
        this.f38579b = i10;
        this.f38580c = Arrays.asList(strArr);
    }
}
