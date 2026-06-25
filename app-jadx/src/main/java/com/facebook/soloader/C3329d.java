package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.facebook.soloader.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3329d extends E implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f38572a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f38573b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f38574c;

    public C3329d(Context context) {
        this.f38574c = l(context);
    }

    private void f(String str, String str2, String str3) {
        synchronized (this.f38573b) {
            try {
                String str4 = str + str2;
                if (!this.f38573b.containsKey(str4)) {
                    this.f38573b.put(str4, new HashSet());
                }
                ((Set) this.f38573b.get(str4)).add(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(String str, String str2) {
        synchronized (this.f38572a) {
            try {
                if (!this.f38572a.containsKey(str)) {
                    this.f38572a.put(str, new HashSet());
                }
                ((Set) this.f38572a.get(str)).add(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h(String str, String str2) throws IOException {
        String strJ = j(str);
        ZipFile zipFile = new ZipFile(strJ);
        try {
            String strN = n(str, str2);
            ZipEntry entry = zipFile.getEntry(strN);
            if (entry != null) {
                i(str, zipFile, entry, str2);
                zipFile.close();
                return;
            }
            p.b("SoLoader", strN + " not found in " + strJ);
            zipFile.close();
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void i(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) throws IOException {
        j jVar = new j(zipFile, zipEntry);
        try {
            for (String str3 : t.b(str2, jVar)) {
                if (!str3.startsWith("/")) {
                    f(str, str2, str3);
                }
            }
            jVar.close();
        } catch (Throwable th2) {
            try {
                jVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static String j(String str) {
        return str.substring(0, str.indexOf(33));
    }

    private Set k(String str, String str2) {
        Set set;
        synchronized (this.f38573b) {
            set = (Set) this.f38573b.get(str + str2);
        }
        return set;
    }

    static Set l(Context context) {
        HashSet hashSet = new HashSet();
        String strM = m(context.getApplicationInfo().sourceDir);
        if (strM != null) {
            hashSet.add(strM);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strM2 = m(str);
                if (strM2 != null) {
                    hashSet.add(strM2);
                }
            }
        }
        return hashSet;
    }

    private static String m(String str) {
        String[] strArrJ = SysUtil.j();
        if (str == null || str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot compute fallback path, apk path is ");
            sb2.append(str == null ? "null" : "empty");
            p.g("SoLoader", sb2.toString());
            return null;
        }
        if (strArrJ == null || strArrJ.length == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot compute fallback path, supportedAbis is ");
            sb3.append(strArrJ == null ? "null" : "empty");
            p.g("SoLoader", sb3.toString());
            return null;
        }
        return str + "!/lib/" + strArrJ[0];
    }

    private static String n(String str, String str2) {
        return str.substring(str.indexOf(33) + 2) + File.separator + str2;
    }

    private void p(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Set setK = k(str, str2);
        if (setK == null) {
            h(str, str2);
            setK = k(str, str2);
        }
        if (setK != null) {
            Iterator it = setK.iterator();
            while (it.hasNext()) {
                SoLoader.s((String) it.next(), i10, threadPolicy);
            }
        }
    }

    private void q() throws IOException {
        int iIndexOf;
        int i10;
        for (String str : this.f38574c) {
            String strSubstring = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(33)) < 0 || (i10 = iIndexOf + 2) >= str.length()) ? null : str.substring(i10);
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(j(str));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            g(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C3329d c3329d = new C3329d(context);
        try {
            c3329d.q();
            return c3329d;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectApkSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f38553b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.f38574c) {
            Set set = (Set) this.f38572a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                p.f("SoLoader", str + " not found on " + str2);
            } else {
                p(str2, str, i10, threadPolicy);
                try {
                    i10 |= 4;
                    SoLoader.f38553b.a(str2 + File.separator + str, i10);
                    p.a("SoLoader", str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e10) {
                    p.h("SoLoader", str + " not found on " + str2 + " flag: " + i10, e10);
                }
            }
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) throws IOException {
        q();
    }

    public boolean o() {
        return !this.f38574c.isEmpty();
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[root = " + this.f38574c.toString() + ']';
    }
}
