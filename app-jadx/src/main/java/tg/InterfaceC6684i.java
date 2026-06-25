package tg;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: tg.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC6684i extends X, WritableByteChannel {
    InterfaceC6684i A0(C6686k c6686k);

    long O0(Z z10);

    InterfaceC6684i S0(long j10);

    InterfaceC6684i V();

    OutputStream V1();

    @Override // tg.X, java.io.Flushable
    void flush();

    InterfaceC6684i g0();

    C6683h s();

    InterfaceC6684i s0(String str);

    InterfaceC6684i write(byte[] bArr);

    InterfaceC6684i write(byte[] bArr, int i10, int i11);

    InterfaceC6684i writeByte(int i10);

    InterfaceC6684i writeInt(int i10);

    InterfaceC6684i writeShort(int i10);

    InterfaceC6684i z1(long j10);
}
