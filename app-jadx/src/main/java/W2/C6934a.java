package w2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6934a extends AbstractC6935b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f62790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f62791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f62792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f62794i;

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0942a extends l {
        public C0942a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C6934a(Context context) {
        super(false);
        this.f62790e = context.getAssets();
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws C0942a {
        try {
            Uri uri = oVar.f62825a;
            this.f62791f = uri;
            String strSubstring = (String) AbstractC6614a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            r(oVar);
            InputStream inputStreamOpen = this.f62790e.open(strSubstring, 1);
            this.f62792g = inputStreamOpen;
            if (inputStreamOpen.skip(oVar.f62831g) < oVar.f62831g) {
                throw new C0942a(null, 2008);
            }
            long j10 = oVar.f62832h;
            if (j10 != -1) {
                this.f62793h = j10;
            } else {
                long jAvailable = this.f62792g.available();
                this.f62793h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f62793h = -1L;
                }
            }
            this.f62794i = true;
            s(oVar);
            return this.f62793h;
        } catch (C0942a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0942a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62791f;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62791f = null;
        try {
            try {
                InputStream inputStream = this.f62792g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C0942a(e10, 2000);
            }
        } finally {
            this.f62792g = null;
            if (this.f62794i) {
                this.f62794i = false;
                q();
            }
        }
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws C0942a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62793h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0942a(e10, 2000);
            }
        }
        int i12 = ((InputStream) a0.l(this.f62792g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f62793h;
        if (j11 != -1) {
            this.f62793h = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}
