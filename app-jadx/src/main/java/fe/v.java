package fe;

import Td.L;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final long a(Reader reader, Writer out, int i10) throws IOException {
        AbstractC5504s.h(reader, "<this>");
        AbstractC5504s.h(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(Reader reader, Function1 action) throws IOException {
        AbstractC5504s.h(reader, "<this>");
        AbstractC5504s.h(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            L l10 = L.f17438a;
            c.a(bufferedReader, null);
        } finally {
        }
    }

    public static final Cf.i d(BufferedReader bufferedReader) {
        AbstractC5504s.h(bufferedReader, "<this>");
        return Cf.l.h(new r(bufferedReader));
    }

    public static final String e(Reader reader) {
        AbstractC5504s.h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
