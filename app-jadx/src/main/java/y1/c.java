package Y1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class c extends a {

    /* JADX INFO: renamed from: b */
    private Context f22745b;

    /* JADX INFO: renamed from: c */
    private Uri f22746c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f22745b = context;
        this.f22746c = uri;
    }

    @Override // Y1.a
    public boolean a() {
        return b.a(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public boolean b() {
        return b.b(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // Y1.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // Y1.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f22745b.getContentResolver(), this.f22746c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // Y1.a
    public boolean f() {
        return b.d(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public String i() {
        return b.e(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public String j() {
        return b.g(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public Uri k() {
        return this.f22746c;
    }

    @Override // Y1.a
    public boolean l() {
        return b.h(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public boolean m() {
        return b.i(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public long n() {
        return b.j(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public long o() {
        return b.k(this.f22745b, this.f22746c);
    }

    @Override // Y1.a
    public a[] p() {
        throw new UnsupportedOperationException();
    }
}
