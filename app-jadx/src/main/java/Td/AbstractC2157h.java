package Td;

import ce.AbstractC3097b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: Td.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2157h {
    public static void a(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(th2, "<this>");
        AbstractC5504s.h(exception, "exception");
        if (th2 != exception) {
            AbstractC3097b.f33610a.a(th2, exception);
        }
    }

    public static List b(Throwable th2) {
        AbstractC5504s.h(th2, "<this>");
        return AbstractC3097b.f33610a.c(th2);
    }

    public static String c(Throwable th2) {
        AbstractC5504s.h(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
