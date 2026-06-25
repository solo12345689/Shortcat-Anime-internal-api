package io.sentry;

import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5218j1 extends Closeable {
    static Date L0(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return AbstractC5226l.f(str);
            } catch (Exception unused) {
                return AbstractC5226l.g(str);
            }
        } catch (Exception e10) {
            iLogger.b(EnumC5215i3.ERROR, "Error when deserializing millis timestamp format.", e10);
            return null;
        }
    }

    void B();

    Object C0(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0);

    void F(boolean z10);

    Float H1();

    void I();

    Object N1();

    List T1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0);

    void W();

    String X0();

    Integer b1();

    TimeZone c0(ILogger iLogger);

    Long d1();

    boolean hasNext();

    String i1();

    Map k1(ILogger iLogger, InterfaceC5267r0 interfaceC5267r0);

    void l1(ILogger iLogger, Map map, String str);

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    io.sentry.vendor.gson.stream.b peek();

    Double q0();

    String r0();

    Date u0(ILogger iLogger);

    Boolean w0();

    void x();

    void y();
}
