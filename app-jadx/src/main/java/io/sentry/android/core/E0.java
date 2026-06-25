package io.sentry.android.core;

import android.content.Context;
import com.adjust.sdk.Constants;
import io.sentry.InterfaceC5192e0;
import io.sentry.M3;
import io.sentry.util.C5288a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f49485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f49486b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final C5288a f49487c = new C5288a();

    public static String a(Context context) {
        InterfaceC5192e0 interfaceC5192e0A = f49487c.a();
        try {
            if (f49485a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f49485a = strC;
                        if (interfaceC5192e0A != null) {
                            interfaceC5192e0A.close();
                        }
                        return strC;
                    }
                    f49485a = b(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = f49485a;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return str;
        } catch (Throwable th3) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f49486b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = M3.a();
            fileOutputStream.write(strA.getBytes(f49486b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
