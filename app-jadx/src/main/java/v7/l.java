package v7;

import Df.C1271d;
import Df.p;
import Df.r;
import Ud.AbstractC2279u;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import dg.D;
import dg.x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6678c;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.Z;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f62005a = new l();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends D {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f62006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputStream f62007c;

        a(x xVar, InputStream inputStream) {
            this.f62006b = xVar;
            this.f62007c = inputStream;
        }

        @Override // dg.D
        public long a() {
            try {
                return this.f62007c.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // dg.D
        public x b() {
            return this.f62006b;
        }

        @Override // dg.D
        public void f(InterfaceC6684i sink) {
            AbstractC5504s.h(sink, "sink");
            Z zE = null;
            try {
                zE = AbstractC6678c.a().e(this.f62007c);
                sink.O0(zE);
            } finally {
                if (zE != null) {
                    l.f62005a.b(zE);
                }
            }
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Z z10) {
        try {
            z10.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final D c(x xVar, InputStream inputStream) {
        AbstractC5504s.h(inputStream, "inputStream");
        return new a(xVar, inputStream);
    }

    public static final D d(x xVar, String body) {
        AbstractC5504s.h(body, "body");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = body.getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            D.a aVar = D.f45262a;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC5504s.g(byteArray, "toByteArray(...)");
            return D.a.i(aVar, xVar, byteArray, 0, 0, 12, null);
        } catch (IOException unused) {
            return null;
        }
    }

    public static final h e(D requestBody, g listener) {
        AbstractC5504s.h(requestBody, "requestBody");
        AbstractC5504s.h(listener, "listener");
        return new h(requestBody, listener);
    }

    private final InputStream f(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    fe.c.a(readableByteChannelNewChannel, null);
                    fe.c.a(inputStreamOpenStream, null);
                    fe.c.a(fileOutputStream, null);
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final D g(String method) {
        AbstractC5504s.h(method, "method");
        int iHashCode = method.hashCode();
        if (iHashCode == 79599 ? method.equals("PUT") : iHashCode == 2461856 ? method.equals("POST") : iHashCode == 75900968 && method.equals("PATCH")) {
            return D.f45262a.b(null, C6686k.f61045e);
        }
        return null;
    }

    public static final InputStream h(Context context, String fileContentUriStr) {
        List listM;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fileContentUriStr, "fileContentUriStr");
        try {
            Uri uri = Uri.parse(fileContentUriStr);
            String scheme = uri.getScheme();
            if (scheme != null && r.Q(scheme, "http", false, 2, null)) {
                l lVar = f62005a;
                AbstractC5504s.e(uri);
                return lVar.f(context, uri);
            }
            if (!r.Q(fileContentUriStr, "data:", false, 2, null)) {
                return context.getContentResolver().openInputStream(uri);
            }
            List listL = new p(com.amazon.a.a.o.b.f.f34694a).l(fileContentUriStr, 0);
            if (listL.isEmpty()) {
                listM = AbstractC2279u.m();
            } else {
                ListIterator listIterator = listL.listIterator(listL.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM = AbstractC2279u.T0(listL, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = AbstractC2279u.m();
            }
            return new ByteArrayInputStream(Base64.decode(((String[]) listM.toArray(new String[0]))[1], 0));
        } catch (Exception e10) {
            AbstractC7283a.n("ReactNative", "Could not retrieve file for contentUri " + fileContentUriStr, e10);
            return null;
        }
    }

    public static final boolean i(String str) {
        return r.B("gzip", str, true);
    }
}
