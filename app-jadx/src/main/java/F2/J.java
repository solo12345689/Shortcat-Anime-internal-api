package F2;

import B2.K1;
import F2.A;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import o3.p;
import q2.AbstractC6096k;
import q2.C6102q;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A.c f6153d = new A.c() { // from class: F2.D
        @Override // F2.A.c
        public final A a(UUID uuid) {
            return J.o(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f6154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f6155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6156c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, K1 k12) {
            LogSessionId logSessionIdA = k12.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            G.a(AbstractC6614a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private J(UUID uuid) {
        AbstractC6614a.e(uuid);
        AbstractC6614a.b(!AbstractC6096k.f56894b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6154a = uuid;
        MediaDrm mediaDrm = new MediaDrm(v(uuid));
        this.f6155b = mediaDrm;
        this.f6156c = 1;
        if (AbstractC6096k.f56896d.equals(uuid) && C()) {
            y(mediaDrm);
        }
    }

    private static C6102q.b A(UUID uuid, List list) {
        if (!AbstractC6096k.f56896d.equals(uuid)) {
            return (C6102q.b) list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            C6102q.b bVar = (C6102q.b) list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                C6102q.b bVar2 = (C6102q.b) list.get(i10);
                byte[] bArr = (byte[]) AbstractC6614a.e(bVar2.f56949e);
                if (Objects.equals(bVar2.f56948d, bVar.f56948d) && Objects.equals(bVar2.f56947c, bVar.f56947c) && o3.p.c(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) AbstractC6614a.e(((C6102q.b) list.get(i12)).f56949e);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return bVar.b(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            C6102q.b bVar3 = (C6102q.b) list.get(i13);
            if (o3.p.g((byte[]) AbstractC6614a.e(bVar3.f56949e)) == 1) {
                return bVar3;
            }
        }
        return (C6102q.b) list.get(0);
    }

    private boolean B() {
        if (!this.f6154a.equals(AbstractC6096k.f56896d)) {
            return this.f6154a.equals(AbstractC6096k.f56895c);
        }
        String strZ = z(DiagnosticsEntry.VERSION_KEY);
        return (strZ.startsWith("v5.") || strZ.startsWith("14.") || strZ.startsWith("15.") || strZ.startsWith("16.0")) ? false : true;
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static J D(UUID uuid) throws O {
        try {
            return new J(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new O(1, e10);
        } catch (Exception e11) {
            throw new O(2, e11);
        }
    }

    public static /* synthetic */ A o(UUID uuid) {
        try {
            return D(uuid);
        } catch (O unused) {
            AbstractC6635w.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void p(J j10, A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        j10.getClass();
        bVar.a(j10, bArr, i10, i11, bArr2);
    }

    private static byte[] q(byte[] bArr) {
        C6609I c6609i = new C6609I(bArr);
        int iZ = c6609i.z();
        short sB = c6609i.B();
        short sB2 = c6609i.B();
        if (sB != 1 || sB2 != 1) {
            AbstractC6635w.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sB3 = c6609i.B();
        Charset charset = StandardCharsets.UTF_16LE;
        String strK = c6609i.K(sB3, charset);
        if (strK.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strK.indexOf("</DATA>");
        if (iIndexOf == -1) {
            AbstractC6635w.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strK.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strK.substring(iIndexOf);
        int i10 = iZ + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sB);
        byteBufferAllocate.putShort(sB2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String r(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String strZ = z(DiagnosticsEntry.VERSION_KEY);
            if (Objects.equals(strZ, "1.2") || Objects.equals(strZ, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        return AbstractC6096k.f56895c.equals(uuid) ? AbstractC1546a.a(bArr) : bArr;
    }

    private static byte[] t(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        p.a aVarD;
        UUID uuid2 = AbstractC6096k.f56897e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = o3.p.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = o3.p.a(uuid2, q(bArr));
        }
        if (w(uuid) && (aVarD = o3.p.d(bArr)) != null) {
            bArr = o3.p.b(AbstractC6096k.f56894b, aVarD.f54399d, aVarD.f54398c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (bArrE = o3.p.e(bArr, uuid)) != null) {
                return bArrE;
            }
        }
        return bArr;
    }

    private static String u(UUID uuid, String str) {
        return (Build.VERSION.SDK_INT < 26 && AbstractC6096k.f56895c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID v(UUID uuid) {
        return w(uuid) ? AbstractC6096k.f56894b : uuid;
    }

    private static boolean w(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, AbstractC6096k.f56895c);
    }

    private static void y(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // F2.A
    public synchronized void a() {
        int i10 = this.f6156c - 1;
        this.f6156c = i10;
        if (i10 == 0) {
            this.f6155b.release();
        }
    }

    @Override // F2.A
    public Map b(byte[] bArr) {
        return this.f6155b.queryKeyStatus(bArr);
    }

    @Override // F2.A
    public A.d c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6155b.getProvisionRequest();
        return new A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // F2.A
    public void d(final A.b bVar) {
        this.f6155b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: F2.E
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                J.p(this.f6151a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // F2.A
    public byte[] e() {
        return this.f6155b.openSession();
    }

    @Override // F2.A
    public void f(byte[] bArr, byte[] bArr2) {
        this.f6155b.restoreKeys(bArr, bArr2);
    }

    @Override // F2.A
    public void g(byte[] bArr) throws DeniedByServerException {
        this.f6155b.provideProvisionResponse(bArr);
    }

    @Override // F2.A
    public int h() {
        return 2;
    }

    @Override // F2.A
    public boolean j(byte[] bArr, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 31 && B()) {
            MediaDrm mediaDrm = this.f6155b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(v(this.f6154a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !this.f6154a.equals(AbstractC6096k.f56895c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // F2.A
    public void k(byte[] bArr) {
        this.f6155b.closeSession(bArr);
    }

    @Override // F2.A
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (AbstractC6096k.f56895c.equals(this.f6154a)) {
            bArr2 = AbstractC1546a.b(bArr2);
        }
        return this.f6155b.provideKeyResponse(bArr, bArr2);
    }

    @Override // F2.A
    public A.a m(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        C6102q.b bVarA;
        byte[] bArrT;
        String strU;
        if (list != null) {
            bVarA = A(this.f6154a, list);
            bArrT = t(this.f6154a, (byte[]) AbstractC6614a.e(bVarA.f56949e));
            strU = u(this.f6154a, bVarA.f56948d);
        } else {
            bVarA = null;
            bArrT = null;
            strU = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f6155b.getKeyRequest(bArr, bArrT, strU, i10, map);
        byte[] bArrS = s(this.f6154a, keyRequest.getData());
        String strR = r(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strR) && bVarA != null && !TextUtils.isEmpty(bVarA.f56947c)) {
            strR = bVarA.f56947c;
        }
        return new A.a(bArrS, strR, keyRequest.getRequestType());
    }

    @Override // F2.A
    public void n(byte[] bArr, K1 k12) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.f6155b, bArr, k12);
            } catch (UnsupportedOperationException unused) {
                AbstractC6635w.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // F2.A
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public B i(byte[] bArr) {
        return new B(v(this.f6154a), bArr);
    }

    public String z(String str) {
        return this.f6155b.getPropertyString(str);
    }
}
