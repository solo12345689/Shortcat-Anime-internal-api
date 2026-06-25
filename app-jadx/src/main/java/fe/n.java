package fe;

import Df.C1271d;
import Td.L;
import Ud.AbstractC2273n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends l {
    public static void e(File file, String text, Charset charset) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            p(fileOutputStream, text, charset);
            L l10 = L.f17438a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final ByteBuffer f(int i10, CharsetEncoder encoder) {
        AbstractC5504s.h(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        AbstractC5504s.g(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void g(File file, Charset charset, Function1 action) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(charset, "charset");
        AbstractC5504s.h(action, "action");
        v.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final CharsetEncoder h(Charset charset) {
        AbstractC5504s.h(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] i(File file) throws IOException {
        AbstractC5504s.h(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrH = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrH, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrH = Arrays.copyOf(bArrH, i12);
                AbstractC5504s.g(bArrH, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    e eVar = new e(8193);
                    eVar.write(i14);
                    b.b(fileInputStream, eVar, 0, 2, null);
                    int size = eVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = eVar.a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrH, size);
                    AbstractC5504s.g(bArrCopyOf, "copyOf(...)");
                    bArrH = AbstractC2273n.h(bArrA, bArrCopyOf, i10, 0, eVar.size());
                }
            }
            c.a(fileInputStream, null);
            return bArrH;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static List j(File file, Charset charset) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        g(file, charset, new Function1() { // from class: fe.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.k(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L k(ArrayList arrayList, String it) {
        AbstractC5504s.h(it, "it");
        arrayList.add(it);
        return L.f17438a;
    }

    public static String l(File file, Charset charset) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = v.e(inputStreamReader);
            c.a(inputStreamReader, null);
            return strE;
        } finally {
        }
    }

    public static /* synthetic */ String m(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C1271d.f3718b;
        }
        return l(file, charset);
    }

    public static void n(File file, String text, Charset charset) throws IOException {
        AbstractC5504s.h(file, "<this>");
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            p(fileOutputStream, text, charset);
            L l10 = L.f17438a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void o(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C1271d.f3718b;
        }
        n(file, str, charset);
    }

    public static final void p(OutputStream outputStream, String text, Charset charset) throws IOException {
        AbstractC5504s.h(outputStream, "<this>");
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC5504s.g(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderH = h(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC5504s.e(charsetEncoderH);
        ByteBuffer byteBufferF = f(8192, charsetEncoderH);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC5504s.g(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderH.encode(charBufferAllocate, byteBufferF, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferF.array(), 0, byteBufferF.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferF.clear();
            i10 = i12;
        }
    }
}
