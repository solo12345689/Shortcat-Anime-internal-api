package yg;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: yg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7250b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f65155a = File.separatorChar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65156b;

    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        f65156b = stringWriter.toString();
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int c(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jF = f(inputStream, outputStream);
        if (jF > 2147483647L) {
            return -1;
        }
        return (int) jF;
    }

    public static int d(Reader reader, Writer writer) throws IOException {
        long jG = g(reader, writer);
        if (jG > 2147483647L) {
            return -1;
        }
        return (int) jG;
    }

    public static void e(InputStream inputStream, Writer writer) throws IOException {
        d(new InputStreamReader(inputStream), writer);
    }

    public static long f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static long g(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static String h(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        e(inputStream, stringWriter);
        return stringWriter.toString();
    }
}
