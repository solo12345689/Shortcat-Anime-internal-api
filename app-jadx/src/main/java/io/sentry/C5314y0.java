package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: io.sentry.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5314y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f51557a;

    public C5314y0(int i10) {
        this.f51557a = new A0(i10);
    }

    private void b(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger, Collection collection) {
        interfaceC5223k1.B();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(interfaceC5223k1, iLogger, it.next());
        }
        interfaceC5223k1.y();
    }

    private void c(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger, Date date) {
        try {
            interfaceC5223k1.f(AbstractC5226l.h(date));
        } catch (Exception e10) {
            iLogger.b(EnumC5215i3.ERROR, "Error when serializing Date", e10);
            interfaceC5223k1.l();
        }
    }

    private void d(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger, Map map) {
        interfaceC5223k1.x();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                interfaceC5223k1.e((String) obj);
                a(interfaceC5223k1, iLogger, map.get(obj));
            }
        }
        interfaceC5223k1.I();
    }

    private void e(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger, TimeZone timeZone) {
        try {
            interfaceC5223k1.f(timeZone.getID());
        } catch (Exception e10) {
            iLogger.b(EnumC5215i3.ERROR, "Error when serializing TimeZone", e10);
            interfaceC5223k1.l();
        }
    }

    public void a(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger, Object obj) {
        if (obj == null) {
            interfaceC5223k1.l();
            return;
        }
        if (obj instanceof Character) {
            interfaceC5223k1.f(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            interfaceC5223k1.f((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC5223k1.d(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            interfaceC5223k1.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(interfaceC5223k1, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(interfaceC5223k1, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof B0) {
            ((B0) obj).serialize(interfaceC5223k1, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(interfaceC5223k1, iLogger, (Collection) obj);
            return;
        }
        int i10 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i10 < length) {
                arrayList.add(Boolean.valueOf(zArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i10 < length3) {
                arrayList3.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i10 < length4) {
                arrayList4.add(Character.valueOf(cArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i10 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i10 < length6) {
                arrayList6.add(Long.valueOf(jArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i10 < length7) {
                arrayList7.add(Float.valueOf(fArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i10 < length8) {
                arrayList8.add(Double.valueOf(dArr[i10]));
                i10++;
            }
            b(interfaceC5223k1, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            b(interfaceC5223k1, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(interfaceC5223k1, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(interfaceC5223k1, iLogger, io.sentry.util.o.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            interfaceC5223k1.d(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(interfaceC5223k1, iLogger, io.sentry.util.o.d((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            interfaceC5223k1.f(obj.toString());
            return;
        }
        try {
            a(interfaceC5223k1, iLogger, this.f51557a.d(obj, iLogger));
        } catch (Exception e10) {
            iLogger.b(EnumC5215i3.ERROR, "Failed serializing unknown object.", e10);
            interfaceC5223k1.f("[OBJECT]");
        }
    }
}
