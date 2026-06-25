package Y1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;
import z1.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class d extends a {

    /* JADX INFO: renamed from: b */
    private Context f22747b;

    /* JADX INFO: renamed from: c */
    private Uri f22748c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f22747b = context;
        this.f22748c = uri;
    }

    private static void q(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                e.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri r(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Y1.a
    public boolean a() {
        return b.a(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public boolean b() {
        return b.b(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public a c(String str) {
        Uri uriR = r(this.f22747b, this.f22748c, "vnd.android.document/directory", str);
        if (uriR != null) {
            return new d(this, this.f22747b, uriR);
        }
        return null;
    }

    @Override // Y1.a
    public a d(String str, String str2) {
        Uri uriR = r(this.f22747b, this.f22748c, str, str2);
        if (uriR != null) {
            return new d(this, this.f22747b, uriR);
        }
        return null;
    }

    @Override // Y1.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f22747b.getContentResolver(), this.f22748c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // Y1.a
    public boolean f() {
        return b.d(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public String i() {
        return b.e(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public String j() {
        return b.g(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public Uri k() {
        return this.f22748c;
    }

    @Override // Y1.a
    public boolean l() {
        return b.h(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public boolean m() {
        return b.i(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public long n() {
        return b.j(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public long o() {
        return b.k(this.f22747b, this.f22748c);
    }

    @Override // Y1.a
    public a[] p() {
        ContentResolver contentResolver = this.f22747b.getContentResolver();
        Uri uri = this.f22748c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f22748c, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            a[] aVarArr = new a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                aVarArr[i10] = new d(this, this.f22747b, uriArr[i10]);
            }
            return aVarArr;
        } finally {
            q(cursorQuery);
        }
    }
}
