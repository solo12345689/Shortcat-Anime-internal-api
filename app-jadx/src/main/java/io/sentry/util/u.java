package io.sentry.util;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5267r0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements InterfaceC5218j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f51437a;

    public u(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f51437a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private Object b() throws IOException {
        try {
            return g(null, null);
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    private Object g(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) {
        Map.Entry entry = (Map.Entry) this.f51437a.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (interfaceC5267r0 != null && iLogger != null) {
            return interfaceC5267r0.a(this, iLogger);
        }
        this.f51437a.removeLast();
        return value;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void B() throws IOException {
        Map.Entry entry = (Map.Entry) this.f51437a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f51437a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f51437a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public Object C0(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) {
        return g(iLogger, interfaceC5267r0);
    }

    @Override // io.sentry.InterfaceC5218j1
    public Float H1() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Float.valueOf(((Number) objB).floatValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void I() {
        if (this.f51437a.size() > 1) {
            this.f51437a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public Object N1() {
        return b();
    }

    @Override // io.sentry.InterfaceC5218j1
    public List T1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            a();
            return null;
        }
        try {
            B();
            ArrayList arrayList = new ArrayList();
            if (hasNext()) {
                do {
                    try {
                        arrayList.add(interfaceC5267r0.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.b(EnumC5215i3.WARNING, "Failed to deserialize object in list.", e10);
                    }
                } while (peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
            }
            y();
            return arrayList;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public String X0() throws IOException {
        String str = (String) b();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    public void a() throws IOException {
        if (b() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // io.sentry.InterfaceC5218j1
    public Integer b1() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Integer.valueOf(((Number) objB).intValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public TimeZone c0(ILogger iLogger) {
        String strI1 = i1();
        if (strI1 != null) {
            return TimeZone.getTimeZone(strI1);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51437a.clear();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Long d1() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Long.valueOf(((Number) objB).longValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public boolean hasNext() {
        return !this.f51437a.isEmpty();
    }

    @Override // io.sentry.InterfaceC5218j1
    public String i1() {
        return (String) b();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Map k1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            a();
            return null;
        }
        try {
            x();
            HashMap map = new HashMap();
            if (hasNext()) {
                while (true) {
                    try {
                        map.put(r0(), interfaceC5267r0.a(this, iLogger));
                    } catch (Exception e10) {
                        iLogger.b(EnumC5215i3.WARNING, "Failed to deserialize object in map.", e10);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            I();
            return map;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public void l1(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, N1());
        } catch (Exception e10) {
            iLogger.a(EnumC5215i3.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public double nextDouble() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // io.sentry.InterfaceC5218j1
    public float nextFloat() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // io.sentry.InterfaceC5218j1
    public int nextInt() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // io.sentry.InterfaceC5218j1
    public long nextLong() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return ((Number) objB).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // io.sentry.InterfaceC5218j1
    public io.sentry.vendor.gson.stream.b peek() {
        if (this.f51437a.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) this.f51437a.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.InterfaceC5218j1
    public Double q0() throws IOException {
        Object objB = b();
        if (objB instanceof Number) {
            return Double.valueOf(((Number) objB).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public String r0() throws IOException {
        Map.Entry entry = (Map.Entry) this.f51437a.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // io.sentry.InterfaceC5218j1
    public Date u0(ILogger iLogger) {
        return InterfaceC5218j1.L0(i1(), iLogger);
    }

    @Override // io.sentry.InterfaceC5218j1
    public Boolean w0() {
        return (Boolean) b();
    }

    @Override // io.sentry.InterfaceC5218j1
    public void x() throws IOException {
        Map.Entry entry = (Map.Entry) this.f51437a.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f51437a.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f51437a.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public void y() {
        if (this.f51437a.size() > 1) {
            this.f51437a.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC5218j1
    public void W() {
    }

    @Override // io.sentry.InterfaceC5218j1
    public void F(boolean z10) {
    }
}
