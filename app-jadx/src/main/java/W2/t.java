package w2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import t2.AbstractC6614a;
import t2.a0;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC6935b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f62886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f62887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f62888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62889h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6940g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC6932F f62890a;

        @Override // w2.InterfaceC6940g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t a() {
            t tVar = new t();
            InterfaceC6932F interfaceC6932F = this.f62890a;
            if (interfaceC6932F != null) {
                tVar.i(interfaceC6932F);
            }
            return tVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends l {
        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public t() {
        super(false);
    }

    private static RandomAccessFile t(Uri uri) throws b {
        try {
            return new RandomAccessFile((String) AbstractC6614a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, ErrorCodes.PROTOCOL_EXCEPTION);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws b {
        Uri uri = oVar.f62825a;
        this.f62887f = uri;
        r(oVar);
        RandomAccessFile randomAccessFileT = t(uri);
        this.f62886e = randomAccessFileT;
        try {
            randomAccessFileT.seek(oVar.f62831g);
            long length = oVar.f62832h;
            if (length == -1) {
                length = this.f62886e.length() - oVar.f62831g;
            }
            this.f62888g = length;
            if (length < 0) {
                throw new b(null, null, 2008);
            }
            this.f62889h = true;
            s(oVar);
            return this.f62888g;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62887f;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62887f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f62886e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f62886e = null;
            if (this.f62889h) {
                this.f62889h = false;
                q();
            }
        }
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f62888g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) a0.l(this.f62886e)).read(bArr, i10, (int) Math.min(this.f62888g, i11));
            if (i12 > 0) {
                this.f62888g -= (long) i12;
                p(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
