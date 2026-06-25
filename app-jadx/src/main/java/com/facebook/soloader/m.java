package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f38593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f38594g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class a extends G.c implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ZipEntry f38595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f38596d;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f38595c = zipEntry;
            this.f38596d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f38548a.compareTo(aVar.f38548a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f38595c.equals(aVar.f38595c) && this.f38596d == aVar.f38596d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f38596d * 31) + this.f38595c.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected class b extends G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected a[] f38597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ZipFile f38598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G f38599c;

        b(G g10) {
            this.f38598b = new ZipFile(m.this.f38593f);
            this.f38599c = g10;
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] b() {
            return j();
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f38598b.close();
        }

        @Override // com.facebook.soloader.G.e
        public void g(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : j()) {
                InputStream inputStream = this.f38598b.getInputStream(aVar.f38595c);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }

        a[] h() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f38594g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f38598b.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f38596d) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f38599c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] j() {
            a[] aVarArr = this.f38597a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrH = h();
            this.f38597a = aVarArrH;
            return aVarArrH;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f38593f = file;
        this.f38594g = str2;
    }

    @Override // com.facebook.soloader.C3331f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C3331f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f38593f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f38593f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z10 = bVar.h().length != 0;
            bVar.close();
            return z10;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
