package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f31619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f31621c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f31623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31626h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f31628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f31629k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31627i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f31622d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f31619a = assetManager;
        this.f31620b = executor;
        this.f31621c = cVar;
        this.f31624f = str;
        this.f31625g = str2;
        this.f31626h = str3;
        this.f31623e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f31619a, this.f31626h);
        } catch (FileNotFoundException e10) {
            this.f31621c.a(9, e10);
        } catch (IOException e11) {
            this.f31621c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f31628j = null;
            this.f31621c.a(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f31628j = g.r(inputStreamG, g.p(inputStreamG, g.f31649b), bArr, cVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th2) {
            try {
                inputStreamG.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void c() {
        if (!this.f31627i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f31661a;
        }
        switch (i10) {
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
                return i.f31665e;
            case 26:
                return i.f31664d;
            case 27:
                return i.f31663c;
            case 28:
            case 29:
            case 30:
                return i.f31662b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f31625g);
        } catch (FileNotFoundException e10) {
            this.f31621c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f31621c.a(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f31621c.b(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f31648a), this.f31624f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f31621c.a(7, e10);
                        return cVarArrX;
                    }
                } catch (IOException e11) {
                    this.f31621c.a(7, e11);
                    return null;
                }
            } catch (IllegalStateException e12) {
                this.f31621c.a(8, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f31621c.a(7, e13);
            }
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f31620b.execute(new Runnable() { // from class: K3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f10857a.f31621c.a(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f31622d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f31623e.exists()) {
            try {
                if (!this.f31623e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f31623e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f31627i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f31622d != null) {
            InputStream inputStreamF = f(this.f31619a);
            if (inputStreamF != null) {
                this.f31628j = i(inputStreamF);
            }
            c[] cVarArr = this.f31628j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f31622d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f31628j;
        byte[] bArr = this.f31622d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f31621c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f31621c.a(8, e11);
            }
            try {
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f31621c.a(5, null);
                    this.f31628j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f31629k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f31628j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f31629k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f31623e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f31629k = null;
            this.f31628j = null;
        }
    }
}
