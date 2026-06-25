package H1;

import A1.s;
import H1.j;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import t.C6575z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a */
    private static final C6575z f7640a = new C6575z(2);

    /* JADX INFO: renamed from: b */
    private static final Comparator f7641b = new Comparator() { // from class: H1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements a {

        /* JADX INFO: renamed from: a */
        private final ContentProviderClient f7642a;

        b(Context context, Uri uri) {
            this.f7642a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // H1.e.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f7642a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // H1.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f7642a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a */
        String f7643a;

        /* JADX INFO: renamed from: b */
        String f7644b;

        /* JADX INFO: renamed from: c */
        List f7645c;

        c(String str, String str2, List list) {
            this.f7643a = str;
            this.f7644b = str2;
            this.f7645c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f7643a, cVar.f7643a) && Objects.equals(this.f7644b, cVar.f7644b) && Objects.equals(this.f7645c, cVar.f7645c);
        }

        public int hashCode() {
            return Objects.hash(this.f7643a, this.f7644b, this.f7645c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : z1.h.c(resources, fVar.c());
    }

    static j.a e(Context context, List list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        X3.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f fVar = (f) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = s.h((strH = fVar.h()))) == null || s.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), fVar, context.getResources());
                    if (providerInfoF == null) {
                        return j.a.b(1, null);
                    }
                    arrayList.add(g(context, fVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new j.b[]{new j.b(strH, fVar.i())});
                }
            }
            return j.a.a(0, arrayList);
        } finally {
            X3.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, f fVar, Resources resources) {
        X3.a.c("FontProvider.getProvider");
        try {
            List listD = d(fVar, resources);
            c cVar = new c(fVar.e(), fVar.f(), listD);
            ProviderInfo providerInfo = (ProviderInfo) f7640a.d(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strE = fVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + fVar.f());
            }
            List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f7641b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
                Collections.sort(arrayList, f7641b);
                if (c(listB, arrayList)) {
                    f7640a.f(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            X3.a.f();
            return null;
        } finally {
            X3.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [H1.e$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static H1.j.b[] g(android.content.Context r16, H1.f r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.e.g(android.content.Context, H1.f, java.lang.String, android.os.CancellationSignal):H1.j$b[]");
    }
}
