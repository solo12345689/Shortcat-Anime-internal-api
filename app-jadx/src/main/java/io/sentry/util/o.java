package io.sentry.util;

import com.adjust.sdk.Constants;
import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5197f0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f51423a = Charset.forName(Constants.ENCODING);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f51424a;

        private b() {
            this.f51424a = 0L;
        }

        private static int b(char c10) {
            if (c10 <= 127) {
                return 1;
            }
            return (c10 > 2047 && !Character.isSurrogate(c10)) ? 3 : 2;
        }

        public long a() {
            return this.f51424a;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f51424a += (long) b(cArr[i12]);
            }
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f51424a += (long) b((char) i10);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f51424a += (long) b(str.charAt(i12));
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static List a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
        }
        return arrayList;
    }

    public static long b(InterfaceC5197f0 interfaceC5197f0, ILogger iLogger, B0 b02) {
        if (b02 == null) {
            return 0L;
        }
        try {
            b bVar = new b();
            interfaceC5197f0.a(b02, bVar);
            return bVar.a();
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    public static byte[] c(InterfaceC5197f0 interfaceC5197f0, ILogger iLogger, B0 b02) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f51423a));
                try {
                    interfaceC5197f0.a(b02, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Could not serialize serializable", th2);
            return null;
        }
    }

    public static Map d(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
