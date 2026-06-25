package okhttp3.internal.publicsuffix;

import Cf.l;
import Df.r;
import Td.L;
import Ud.AbstractC2279u;
import com.amazon.a.a.o.c.a.b;
import fe.c;
import fg.AbstractC4807e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import og.j;
import tg.C6694t;
import tg.InterfaceC6685j;
import tg.K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "LTd/L;", "e", "d", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final byte[] f55643f = {42};

    /* JADX INFO: renamed from: g */
    private static final List f55644g = AbstractC2279u.e("*");

    /* JADX INFO: renamed from: h */
    private static final PublicSuffixDatabase f55645h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private byte[] publicSuffixExceptionListBytes;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iD;
            boolean z10;
            int iD2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iD = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iD = AbstractC4807e.d(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    iD2 = iD - AbstractC4807e.d(bArr[i14 + i19], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                AbstractC5504s.g(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f55645h;
        }

        private Companion() {
        }
    }

    private final List b(List domainLabels) {
        String str;
        String strB;
        String str2;
        List listM;
        List listM2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = (String) domainLabels.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC5504s.g(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            AbstractC5504s.g(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                AbstractC5504s.u("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = companion.b(bArr2, bArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f55643f;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    AbstractC5504s.u("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strB2 = companion2.b(bArr4, bArr3, i12);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    AbstractC5504s.u("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strB3 = companion3.b(bArr5, bArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return r.M0('!' + str, new char[]{b.f34706a}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f55644g;
        }
        if (strB == null || (listM = r.M0(strB, new char[]{b.f34706a}, false, 0, 6, null)) == null) {
            listM = AbstractC2279u.m();
        }
        if (str2 == null || (listM2 = r.M0(str2, new char[]{b.f34706a}, false, 0, 6, null)) == null) {
            listM2 = AbstractC2279u.m();
        }
        return listM.size() > listM2.size() ? listM : listM2;
    }

    private final void d() {
        try {
            N n10 = new N();
            N n11 = new N();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                InterfaceC6685j interfaceC6685jD = K.d(new C6694t(K.k(resourceAsStream)));
                try {
                    n10.f52259a = interfaceC6685jD.I0(interfaceC6685jD.readInt());
                    n11.f52259a = interfaceC6685jD.I0(interfaceC6685jD.readInt());
                    L l10 = L.f17438a;
                    c.a(interfaceC6685jD, null);
                    synchronized (this) {
                        Object obj = n10.f52259a;
                        AbstractC5504s.e(obj);
                        this.publicSuffixListBytes = (byte[]) obj;
                        Object obj2 = n11.f52259a;
                        AbstractC5504s.e(obj2);
                        this.publicSuffixExceptionListBytes = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    j.f55583a.g().k("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List f(String domain) {
        List listM0 = r.M0(domain, new char[]{b.f34706a}, false, 0, 6, null);
        return AbstractC5504s.c(AbstractC2279u.y0(listM0), "") ? AbstractC2279u.h0(listM0, 1) : listM0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        AbstractC5504s.h(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        AbstractC5504s.g(unicodeDomain, "unicodeDomain");
        List listF = f(unicodeDomain);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return l.I(l.x(AbstractC2279u.c0(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
