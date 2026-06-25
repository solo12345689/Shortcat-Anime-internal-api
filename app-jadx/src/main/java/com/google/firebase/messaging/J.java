package com.google.firebase.messaging;

import R8.AbstractC2115p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class J implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f43340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Future f43341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n9.i f43342c;

    private J(URL url) {
        this.f43340a = url;
    }

    public static /* synthetic */ void a(J j10, n9.j jVar) {
        j10.getClass();
        try {
            jVar.c(j10.b());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    private byte[] g() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f43340a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC3964b.d(AbstractC3964b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f43340a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static J h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new J(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f43340a);
        }
        byte[] bArrG = g();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrG, 0, bArrG.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f43340a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f43340a);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43341b.cancel(true);
    }

    public n9.i j() {
        return (n9.i) AbstractC2115p.l(this.f43342c);
    }

    public void k(ExecutorService executorService) {
        final n9.j jVar = new n9.j();
        this.f43341b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.I
            @Override // java.lang.Runnable
            public final void run() {
                J.a(this.f43338a, jVar);
            }
        });
        this.f43342c = jVar.a();
    }
}
