package w2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: w2.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6933G extends AbstractC6935b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f62782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f62783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f62784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f62785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f62786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f62787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62789m;

    /* JADX INFO: renamed from: w2.G$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends l {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C6933G() {
        this(2000);
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws a {
        Uri uri = oVar.f62825a;
        this.f62784h = uri;
        String str = (String) AbstractC6614a.e(uri.getHost());
        int port = this.f62784h.getPort();
        r(oVar);
        try {
            this.f62787k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f62787k, port);
            if (this.f62787k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f62786j = multicastSocket;
                multicastSocket.joinGroup(this.f62787k);
                this.f62785i = this.f62786j;
            } else {
                this.f62785i = new DatagramSocket(inetSocketAddress);
            }
            this.f62785i.setSoTimeout(this.f62781e);
            this.f62788l = true;
            s(oVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f62784h;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f62784h = null;
        MulticastSocket multicastSocket = this.f62786j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC6614a.e(this.f62787k));
            } catch (IOException unused) {
            }
            this.f62786j = null;
        }
        DatagramSocket datagramSocket = this.f62785i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f62785i = null;
        }
        this.f62787k = null;
        this.f62789m = 0;
        if (this.f62788l) {
            this.f62788l = false;
            q();
        }
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f62789m == 0) {
            try {
                ((DatagramSocket) AbstractC6614a.e(this.f62785i)).receive(this.f62783g);
                int length = this.f62783g.getLength();
                this.f62789m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f62783g.getLength();
        int i12 = this.f62789m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f62782f, length2 - i12, bArr, i10, iMin);
        this.f62789m -= iMin;
        return iMin;
    }

    public C6933G(int i10) {
        this(i10, 8000);
    }

    public C6933G(int i10, int i11) {
        super(true);
        this.f62781e = i11;
        byte[] bArr = new byte[i10];
        this.f62782f = bArr;
        this.f62783g = new DatagramPacket(bArr, 0, i10);
    }
}
