package R2;

import Q2.m;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15135a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f15136b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f15137c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f15138d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f15139e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f15140f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f15141g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f15142h = -9223372036854775807L;

    /* JADX INFO: renamed from: R2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0261b {
        void a(IOException iOException);

        void b();
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f15136b) {
            try {
                j10 = f15137c ? f15138d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f15136b) {
            str = f15139e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f15136b) {
            i10 = f15140f;
        }
        return i10;
    }

    public static void l(m mVar, InterfaceC0261b interfaceC0261b) {
        if (m()) {
            if (interfaceC0261b != null) {
                interfaceC0261b.b();
            }
        } else {
            if (mVar == null) {
                mVar = new m("SntpClient");
            }
            mVar.n(new d(), new c(interfaceC0261b), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f15136b) {
            try {
                if (f15142h != -9223372036854775807L && f15141g != -9223372036854775807L) {
                    f15137c = f15137c && SystemClock.elapsedRealtime() - f15142h < f15141g;
                }
                z10 = f15137c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) AbstractC6614a.e(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) AbstractC6614a.e(socketTimeoutException));
        } finally {
        }
    }

    private static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        bArr[i10] = (byte) (r2 >> 24);
        bArr[i10 + 1] = (byte) (r2 >> 16);
        bArr[i10 + 2] = (byte) (r2 >> 8);
        bArr[i10 + 3] = (byte) (j11 + 2208988800L);
        long j13 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j13 >> 24);
        bArr[i10 + 5] = (byte) (j13 >> 16);
        bArr[i10 + 6] = (byte) (j13 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements m.e {
        private d() {
        }

        @Override // Q2.m.e
        public void a() {
            synchronized (b.f15135a) {
                synchronized (b.f15136b) {
                    if (b.f15137c) {
                        return;
                    }
                    long jN = b.n();
                    synchronized (b.f15136b) {
                        long unused = b.f15142h = SystemClock.elapsedRealtime();
                        long unused2 = b.f15138d = jN;
                        boolean unused3 = b.f15137c = true;
                    }
                }
            }
        }

        @Override // Q2.m.e
        public void c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0261b f15143a;

        public c(InterfaceC0261b interfaceC0261b) {
            this.f15143a = interfaceC0261b;
        }

        @Override // Q2.m.b
        public void j(m.e eVar, long j10, long j11) {
            if (this.f15143a != null) {
                if (b.m()) {
                    this.f15143a.b();
                } else {
                    this.f15143a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // Q2.m.b
        public m.c n(m.e eVar, long j10, long j11, IOException iOException, int i10) {
            InterfaceC0261b interfaceC0261b = this.f15143a;
            if (interfaceC0261b != null) {
                interfaceC0261b.a(iOException);
            }
            return m.f14327f;
        }

        @Override // Q2.m.b
        public void h(m.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
