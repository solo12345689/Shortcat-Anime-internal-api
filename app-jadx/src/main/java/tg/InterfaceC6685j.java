package tg;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: tg.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC6685j extends Z, ReadableByteChannel {
    String D0();

    byte[] I0(long j10);

    short J0();

    int J1();

    long K0();

    InputStream L();

    String M1();

    int N(N n10);

    boolean Q1(long j10, C6686k c6686k);

    void R0(long j10);

    long U(X x10);

    String V0(long j10);

    long X1();

    C6686k Y0(long j10);

    byte[] e1();

    void f0(C6683h c6683h, long j10);

    boolean f1();

    String i0(long j10);

    long j1();

    InterfaceC6685j peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    C6683h s();

    void skip(long j10);

    String w1(Charset charset);

    boolean y0(long j10);
}
