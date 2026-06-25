package fg;

import Df.C1271d;
import Df.p;
import Df.r;
import Td.AbstractC2156g;
import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.O;
import Ud.S;
import com.revenuecat.purchases.common.Constants;
import dg.C4618A;
import dg.D;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.r;
import dg.t;
import dg.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.U;
import ng.InterfaceC5790a;
import oe.AbstractC5874j;
import oe.C5870f;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.N;
import tg.X;
import tg.Z;

/* JADX INFO: renamed from: fg.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4807e {

    /* JADX INFO: renamed from: a */
    public static final byte[] f47062a;

    /* JADX INFO: renamed from: b */
    public static final t f47063b = t.f45580b.i(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final F f47064c;

    /* JADX INFO: renamed from: d */
    public static final D f47065d;

    /* JADX INFO: renamed from: e */
    private static final N f47066e;

    /* JADX INFO: renamed from: f */
    public static final TimeZone f47067f;

    /* JADX INFO: renamed from: g */
    private static final p f47068g;

    /* JADX INFO: renamed from: h */
    public static final boolean f47069h;

    /* JADX INFO: renamed from: i */
    public static final String f47070i;

    static {
        byte[] bArr = new byte[0];
        f47062a = bArr;
        f47064c = F.a.f(F.f45298a, bArr, null, 1, null);
        f47065d = D.a.k(D.f45262a, bArr, null, 0, 0, 7, null);
        N.a aVar = N.f60963d;
        C6686k.a aVar2 = C6686k.f61044d;
        f47066e = aVar.d(aVar2.e("efbbbf"), aVar2.e("feff"), aVar2.e("fffe"), aVar2.e("0000ffff"), aVar2.e("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC5504s.e(timeZone);
        f47067f = timeZone;
        f47068g = new p("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f47069h = false;
        String name = C4618A.class.getName();
        AbstractC5504s.g(name, "OkHttpClient::class.java.name");
        f47070i = r.D0(r.C0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        AbstractC5504s.h(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        AbstractC5504s.h(strArr, "<this>");
        AbstractC5504s.h(other, "other");
        AbstractC5504s.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(InterfaceC5790a interfaceC5790a, File file) throws IOException {
        AbstractC5504s.h(interfaceC5790a, "<this>");
        AbstractC5504s.h(file, "file");
        X xF = interfaceC5790a.f(file);
        try {
            try {
                interfaceC5790a.h(file);
                fe.c.a(xF, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            L l10 = L.f17438a;
            fe.c.a(xF, null);
            interfaceC5790a.h(file);
            return false;
        }
    }

    public static final boolean G(Socket socket, InterfaceC6685j source) {
        AbstractC5504s.h(socket, "<this>");
        AbstractC5504s.h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.f1();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        AbstractC5504s.h(name, "name");
        return r.B(name, "Authorization", true) || r.B(name, "Cookie", true) || r.B(name, "Proxy-Authorization", true) || r.B(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(InterfaceC6685j interfaceC6685j, Charset charset) {
        AbstractC5504s.h(interfaceC6685j, "<this>");
        AbstractC5504s.h(charset, "default");
        int iN = interfaceC6685j.N(f47066e);
        if (iN == -1) {
            return charset;
        }
        if (iN == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC5504s.g(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iN == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC5504s.g(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iN == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC5504s.g(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iN == 3) {
            return C1271d.f3717a.a();
        }
        if (iN == 4) {
            return C1271d.f3717a.b();
        }
        throw new AssertionError();
    }

    public static final int K(InterfaceC6685j interfaceC6685j) {
        AbstractC5504s.h(interfaceC6685j, "<this>");
        return d(interfaceC6685j.readByte(), 255) | (d(interfaceC6685j.readByte(), 255) << 16) | (d(interfaceC6685j.readByte(), 255) << 8);
    }

    public static final int L(C6683h c6683h, byte b10) throws EOFException {
        AbstractC5504s.h(c6683h, "<this>");
        int i10 = 0;
        while (!c6683h.f1() && c6683h.D(0L) == b10) {
            i10++;
            c6683h.readByte();
        }
        return i10;
    }

    public static final boolean M(Z z10, int i10, TimeUnit timeUnit) {
        AbstractC5504s.h(z10, "<this>");
        AbstractC5504s.h(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = z10.t().e() ? z10.t().c() - jNanoTime : Long.MAX_VALUE;
        z10.t().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C6683h c6683h = new C6683h();
            while (z10.N0(c6683h, 8192L) != -1) {
                c6683h.g();
            }
            if (jC == Long.MAX_VALUE) {
                z10.t().a();
                return true;
            }
            z10.t().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                z10.t().a();
                return false;
            }
            z10.t().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                z10.t().a();
            } else {
                z10.t().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z10) {
        AbstractC5504s.h(name, "name");
        return new ThreadFactory() { // from class: fg.d
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC4807e.O(name, z10, runnable);
            }
        };
    }

    public static final Thread O(String name, boolean z10, Runnable runnable) {
        AbstractC5504s.h(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List P(t tVar) {
        AbstractC5504s.h(tVar, "<this>");
        C5870f c5870fX = AbstractC5874j.x(0, tVar.size());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
        Iterator it = c5870fX.iterator();
        while (it.hasNext()) {
            int iNextInt = ((O) it).nextInt();
            arrayList.add(new mg.c(tVar.f(iNextInt), tVar.p(iNextInt)));
        }
        return arrayList;
    }

    public static final t Q(List list) {
        AbstractC5504s.h(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mg.c cVar = (mg.c) it.next();
            aVar.c(cVar.a().Q(), cVar.b().Q());
        }
        return aVar.e();
    }

    public static final String R(int i10) {
        String hexString = Integer.toHexString(i10);
        AbstractC5504s.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j10) {
        String hexString = Long.toHexString(j10);
        AbstractC5504s.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(u uVar, boolean z10) {
        String strH;
        AbstractC5504s.h(uVar, "<this>");
        if (r.W(uVar.h(), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z10 && uVar.m() == u.f45583k.c(uVar.q())) {
            return strH;
        }
        return strH + ':' + uVar.m();
    }

    public static /* synthetic */ String U(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return T(uVar, z10);
    }

    public static final List V(List list) {
        AbstractC5504s.h(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2279u.d1(list));
        AbstractC5504s.g(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map W(Map map) {
        AbstractC5504s.h(map, "<this>");
        if (map.isEmpty()) {
            return S.i();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        AbstractC5504s.g(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long X(String str, long j10) {
        AbstractC5504s.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Y(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String Z(String str, int i10, int i11) {
        AbstractC5504s.h(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String a0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Z(str, i10, i11);
    }

    public static final Throwable b0(Exception exc, List suppressed) {
        AbstractC5504s.h(exc, "<this>");
        AbstractC5504s.h(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC2156g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        AbstractC5504s.h(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final void c0(InterfaceC6684i interfaceC6684i, int i10) {
        AbstractC5504s.h(interfaceC6684i, "<this>");
        interfaceC6684i.writeByte((i10 >>> 16) & 255);
        interfaceC6684i.writeByte((i10 >>> 8) & 255);
        interfaceC6684i.writeByte(i10 & 255);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c g(final dg.r rVar) {
        AbstractC5504s.h(rVar, "<this>");
        return new r.c() { // from class: fg.c
            @Override // dg.r.c
            public final dg.r a(InterfaceC4624e interfaceC4624e) {
                return AbstractC4807e.h(rVar, interfaceC4624e);
            }
        };
    }

    public static final dg.r h(dg.r this_asFactory, InterfaceC4624e it) {
        AbstractC5504s.h(this_asFactory, "$this_asFactory");
        AbstractC5504s.h(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        AbstractC5504s.h(str, "<this>");
        return f47068g.h(str);
    }

    public static final boolean j(u uVar, u other) {
        AbstractC5504s.h(uVar, "<this>");
        AbstractC5504s.h(other, "other");
        return AbstractC5504s.c(uVar.h(), other.h()) && uVar.m() == other.m() && AbstractC5504s.c(uVar.q(), other.q());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        AbstractC5504s.h(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        AbstractC5504s.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        AbstractC5504s.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC5504s.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        AbstractC5504s.h(strArr, "<this>");
        AbstractC5504s.h(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        AbstractC5504s.g(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC2273n.f0(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        AbstractC5504s.h(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(delimiters, "delimiters");
        while (i10 < i11) {
            if (Df.r.V(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(Z z10, int i10, TimeUnit timeUnit) {
        AbstractC5504s.h(z10, "<this>");
        AbstractC5504s.h(timeUnit, "timeUnit");
        try {
            return M(z10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        AbstractC5504s.h(format, "format");
        AbstractC5504s.h(args, "args");
        U u10 = U.f52264a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC5504s.g(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC5504s.h(strArr, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC5489c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(E e10) {
        AbstractC5504s.h(e10, "<this>");
        String strD = e10.E().d("Content-Length");
        if (strD != null) {
            return X(strD, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2279u.p(Arrays.copyOf(objArr, objArr.length)));
        AbstractC5504s.g(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        AbstractC5504s.h(strArr, "<this>");
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        AbstractC5504s.h(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC5504s.i(cCharAt, 31) <= 0 || AbstractC5504s.i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        AbstractC5504s.h(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
