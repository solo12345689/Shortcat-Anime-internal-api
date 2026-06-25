package tg;

import Ud.AbstractC2273n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f60985h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f60986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f60991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U f60992g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public U() {
        this.f60986a = new byte[8192];
        this.f60990e = true;
        this.f60989d = false;
    }

    public final void a() {
        int i10;
        U u10 = this.f60992g;
        if (u10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC5504s.e(u10);
        if (u10.f60990e) {
            int i11 = this.f60988c - this.f60987b;
            U u11 = this.f60992g;
            AbstractC5504s.e(u11);
            int i12 = 8192 - u11.f60988c;
            U u12 = this.f60992g;
            AbstractC5504s.e(u12);
            if (u12.f60989d) {
                i10 = 0;
            } else {
                U u13 = this.f60992g;
                AbstractC5504s.e(u13);
                i10 = u13.f60987b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            U u14 = this.f60992g;
            AbstractC5504s.e(u14);
            g(u14, i11);
            b();
            V.b(this);
        }
    }

    public final U b() {
        U u10 = this.f60991f;
        if (u10 == this) {
            u10 = null;
        }
        U u11 = this.f60992g;
        AbstractC5504s.e(u11);
        u11.f60991f = this.f60991f;
        U u12 = this.f60991f;
        AbstractC5504s.e(u12);
        u12.f60992g = this.f60992g;
        this.f60991f = null;
        this.f60992g = null;
        return u10;
    }

    public final U c(U segment) {
        AbstractC5504s.h(segment, "segment");
        segment.f60992g = this;
        segment.f60991f = this.f60991f;
        U u10 = this.f60991f;
        AbstractC5504s.e(u10);
        u10.f60992g = segment;
        this.f60991f = segment;
        return segment;
    }

    public final U d() {
        this.f60989d = true;
        return new U(this.f60986a, this.f60987b, this.f60988c, true, false);
    }

    public final U e(int i10) {
        U uC;
        if (i10 <= 0 || i10 > this.f60988c - this.f60987b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            uC = d();
        } else {
            uC = V.c();
            byte[] bArr = this.f60986a;
            byte[] bArr2 = uC.f60986a;
            int i11 = this.f60987b;
            AbstractC2273n.n(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        uC.f60988c = uC.f60987b + i10;
        this.f60987b += i10;
        U u10 = this.f60992g;
        AbstractC5504s.e(u10);
        u10.c(uC);
        return uC;
    }

    public final U f() {
        byte[] bArr = this.f60986a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
        return new U(bArrCopyOf, this.f60987b, this.f60988c, false, true);
    }

    public final void g(U sink, int i10) {
        AbstractC5504s.h(sink, "sink");
        if (!sink.f60990e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f60988c;
        if (i11 + i10 > 8192) {
            if (sink.f60989d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f60987b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f60986a;
            AbstractC2273n.n(bArr, bArr, 0, i12, i11, 2, null);
            sink.f60988c -= sink.f60987b;
            sink.f60987b = 0;
        }
        byte[] bArr2 = this.f60986a;
        byte[] bArr3 = sink.f60986a;
        int i13 = sink.f60988c;
        int i14 = this.f60987b;
        AbstractC2273n.h(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f60988c += i10;
        this.f60987b += i10;
    }

    public U(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        AbstractC5504s.h(data, "data");
        this.f60986a = data;
        this.f60987b = i10;
        this.f60988c = i11;
        this.f60989d = z10;
        this.f60990e = z11;
    }
}
