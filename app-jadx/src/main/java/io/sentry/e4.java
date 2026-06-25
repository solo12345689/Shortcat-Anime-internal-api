package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e4 implements ILogger {
    private String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(EnumC5215i3 enumC5215i3, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            c(enumC5215i3, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC5215i3, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(EnumC5215i3 enumC5215i3, String str, Throwable th2) {
        if (th2 == null) {
            c(enumC5215i3, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC5215i3, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5215i3 enumC5215i3, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC5215i3, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC5215i3 enumC5215i3) {
        return true;
    }
}
