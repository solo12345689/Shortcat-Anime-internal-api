package com.facebook.soloader;

import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.soloader.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3330e extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f38576b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Set f38577c = null;

    public C3330e(String str) {
        this.f38575a = str;
    }

    static String g(String str) {
        if ("base".equals(str)) {
            return SoLoader.f38555d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f38555d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f38577c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i10);
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) throws IOException {
        InputStream inputStreamOpen = SoLoader.f38555d.getAssets().open(this.f38575a + ".soloader-manifest");
        try {
            this.f38576b = q.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f38577c = new HashSet(this.f38576b.f38605b);
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String f(String str) {
        Set set = this.f38577c;
        if (set == null || this.f38576b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f38575a) + "!/lib/" + this.f38576b.f38604a + "/" + str;
    }

    protected int h(String str, int i10) {
        String strF = f(str);
        strF.getClass();
        System.load(strF);
        return 1;
    }
}
