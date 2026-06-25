package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5309x0 implements InterfaceC5218j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.a f51549a;

    public C5309x0(Reader reader) {
        this.f51549a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.InterfaceC5218j1
    public void B() {
        this.f51549a.B();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Object C0(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return interfaceC5267r0.a(this, iLogger);
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void F(boolean z10) {
        this.f51549a.F(z10);
    }

    @Override // io.sentry.InterfaceC5218j1
    public Float H1() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void I() {
        this.f51549a.I();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Object N1() {
        return new C5304w0().e(this);
    }

    @Override // io.sentry.InterfaceC5218j1
    public List T1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) throws IOException {
        if (this.f51549a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f51549a.o();
            return null;
        }
        this.f51549a.B();
        ArrayList arrayList = new ArrayList();
        if (this.f51549a.hasNext()) {
            do {
                try {
                    arrayList.add(interfaceC5267r0.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.b(EnumC5215i3.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (this.f51549a.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f51549a.y();
        return arrayList;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void W() throws IOException {
        this.f51549a.W();
    }

    @Override // io.sentry.InterfaceC5218j1
    public String X0() {
        return this.f51549a.X0();
    }

    public boolean a() {
        return this.f51549a.l();
    }

    public void b() {
        this.f51549a.o();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Integer b1() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f51549a.nextInt());
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public TimeZone c0(ILogger iLogger) throws IOException {
        if (this.f51549a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f51549a.o();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f51549a.X0());
        } catch (Exception e10) {
            iLogger.b(EnumC5215i3.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51549a.close();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Long d1() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f51549a.nextLong());
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public boolean hasNext() {
        return this.f51549a.hasNext();
    }

    @Override // io.sentry.InterfaceC5218j1
    public String i1() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f51549a.X0();
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public Map k1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0) throws IOException {
        if (this.f51549a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f51549a.o();
            return null;
        }
        this.f51549a.x();
        HashMap map = new HashMap();
        if (this.f51549a.hasNext()) {
            while (true) {
                try {
                    map.put(this.f51549a.r0(), interfaceC5267r0.a(this, iLogger));
                } catch (Exception e10) {
                    iLogger.b(EnumC5215i3.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f51549a.I();
        return map;
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
    public double nextDouble() {
        return this.f51549a.nextDouble();
    }

    @Override // io.sentry.InterfaceC5218j1
    public float nextFloat() {
        return (float) this.f51549a.nextDouble();
    }

    @Override // io.sentry.InterfaceC5218j1
    public int nextInt() {
        return this.f51549a.nextInt();
    }

    @Override // io.sentry.InterfaceC5218j1
    public long nextLong() {
        return this.f51549a.nextLong();
    }

    @Override // io.sentry.InterfaceC5218j1
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f51549a.peek();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Double q0() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f51549a.nextDouble());
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public String r0() {
        return this.f51549a.r0();
    }

    @Override // io.sentry.InterfaceC5218j1
    public Date u0(ILogger iLogger) throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return InterfaceC5218j1.L0(this.f51549a.X0(), iLogger);
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public Boolean w0() throws IOException {
        if (this.f51549a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f51549a.l());
        }
        this.f51549a.o();
        return null;
    }

    @Override // io.sentry.InterfaceC5218j1
    public void x() {
        this.f51549a.x();
    }

    @Override // io.sentry.InterfaceC5218j1
    public void y() {
        this.f51549a.y();
    }
}
