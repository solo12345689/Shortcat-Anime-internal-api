package com.facebook.react.common.mapbuffer;

import Df.C1271d;
import Td.I;
import Td.r;
import Ud.F;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.common.mapbuffer.a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import h7.C4914b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002B@B\u0019\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b-\u0010\u0011J\u0017\u0010.\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010'J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0011J\u0017\u00100\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u0010 J\u0017\u00101\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010*J\u0017\u00102\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010'J\u0017\u00103\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020(H\u0016¢\u0006\u0004\b:\u0010;J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0096\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010!R$\u0010F\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010!\u001a\u0004\bE\u00105R\u0014\u0010H\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00105¨\u0006J"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/common/mapbuffer/a;", "Ljava/nio/ByteBuffer;", "buffer", "", "offsetToMapBuffer", "<init>", "(Ljava/nio/ByteBuffer;I)V", com.amazon.device.iap.internal.c.b.as, "u", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "LTd/L;", "G", "()V", "intKey", "v", "(I)I", "bucketIndex", "Lcom/facebook/react/common/mapbuffer/a$b;", "D", "(I)Lcom/facebook/react/common/mapbuffer/a$b;", SubscriberAttributeKt.JSON_NAME_KEY, "expected", "A", "(ILcom/facebook/react/common/mapbuffer/a$b;)I", "bufferPosition", "LTd/I;", "N", "(I)S", "", "F", "(I)D", "I", "", "K", "(I)J", "", "B", "(I)Z", "", "M", "(I)Ljava/lang/String;", "position", "L", "w", "H", "getInt", "getDouble", "getString", "getBoolean", "y", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/nio/ByteBuffer;", "b", "value", "c", "getCount", "count", "z", "offsetForDynamicData", "d", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableMapBuffer extends HybridClassBase implements a {

    /* JADX INFO: renamed from: e */
    private static final a.b[] f36559e = a.b.values();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ByteBuffer buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int offsetToMapBuffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements a.c {

        /* JADX INFO: renamed from: a */
        private final int f36563a;

        public b(int i10) {
            this.f36563a = i10;
        }

        private final void g(a.b bVar) {
            a.b type = getType();
            if (bVar == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + bVar + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            g(a.b.f36584f);
            return ReadableMapBuffer.this.K(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int b() {
            g(a.b.f36580b);
            return ReadableMapBuffer.this.I(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double c() {
            g(a.b.f36581c);
            return ReadableMapBuffer.this.F(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String d() {
            g(a.b.f36582d);
            return ReadableMapBuffer.this.M(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a e() {
            g(a.b.f36583e);
            return ReadableMapBuffer.this.L(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            g(a.b.f36579a);
            return ReadableMapBuffer.this.B(this.f36563a + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return ReadableMapBuffer.this.N(this.f36563a) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return C4914b.h() ? ReadableMapBuffer.f36559e[65535 & ReadableMapBuffer.this.N(this.f36563a + 2)] : a.b.values()[65535 & ReadableMapBuffer.this.N(this.f36563a + 2)];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36565a;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.f36579a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.f36580b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.f36584f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.f36581c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.f36582d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.f36583e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f36565a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private int f36566a;

        /* JADX INFO: renamed from: b */
        private final int f36567b;

        d() {
            this.f36567b = ReadableMapBuffer.this.getCount() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public a.c next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i10 = this.f36566a;
            this.f36566a = i10 + 1;
            return readableMapBuffer.new b(readableMapBuffer.w(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36566a <= this.f36567b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i10) {
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = i10;
        G();
    }

    private final int A(int i10, a.b expected) {
        int iV = v(i10);
        if (iV == -1) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        }
        a.b bVarD = D(iV);
        if (bVarD == expected) {
            return w(iV) + 4;
        }
        throw new IllegalStateException(("Expected " + expected + " for key: " + i10 + ", found " + bVarD + " instead.").toString());
    }

    public final boolean B(int bufferPosition) {
        return I(bufferPosition) == 1;
    }

    private final a.b D(int bucketIndex) {
        int iN = N(w(bucketIndex) + 2) & 65535;
        return C4914b.h() ? f36559e[iN] : a.b.values()[iN];
    }

    public final double F(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void G() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = N(this.buffer.position()) & 65535;
    }

    public final int I(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    public final long K(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    public final ReadableMapBuffer L(int position) {
        return u(z() + this.buffer.getInt(position) + 4);
    }

    public final String M(int bufferPosition) {
        int iZ = z() + this.buffer.getInt(bufferPosition);
        int i10 = this.buffer.getInt(iZ);
        byte[] bArr = new byte[i10];
        this.buffer.position(iZ + 4);
        this.buffer.get(bArr, 0, i10);
        return new String(bArr, C1271d.f3718b);
    }

    public final short N(int bufferPosition) {
        return I.b(this.buffer.getShort(bufferPosition));
    }

    public static final CharSequence P(a.c entry) {
        AbstractC5504s.h(entry, "entry");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(entry.getKey());
        sb2.append('=');
        switch (c.f36565a[entry.getType().ordinal()]) {
            case 1:
                sb2.append(entry.f());
                return sb2;
            case 2:
                sb2.append(entry.b());
                return sb2;
            case 3:
                sb2.append(entry.a());
                return sb2;
            case 4:
                sb2.append(entry.c());
                return sb2;
            case 5:
                sb2.append('\"');
                sb2.append(entry.d());
                sb2.append('\"');
                return sb2;
            case 6:
                sb2.append(entry.e().toString());
                return sb2;
            default:
                throw new r();
        }
    }

    private final ReadableMapBuffer u(int i10) {
        ByteBuffer byteBufferDuplicate = this.buffer.duplicate();
        byteBufferDuplicate.position(i10);
        AbstractC5504s.g(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, i10);
    }

    private final int v(int intKey) {
        C5870f c5870fA = a.f36576V.a();
        int iF = c5870fA.f();
        if (intKey <= c5870fA.i() && iF <= intKey) {
            short sB = I.b((short) intKey);
            int count = getCount() - 1;
            int i10 = 0;
            while (i10 <= count) {
                int i11 = (i10 + count) >>> 1;
                int iN = N(w(i11)) & 65535;
                int i12 = 65535 & sB;
                if (AbstractC5504s.i(iN, i12) < 0) {
                    i10 = i11 + 1;
                } else {
                    if (AbstractC5504s.i(iN, i12) <= 0) {
                        return i11;
                    }
                    count = i11 - 1;
                }
            }
        }
        return -1;
    }

    public final int w(int bucketIndex) {
        return this.offsetToMapBuffer + 8 + (bucketIndex * 12);
    }

    private final int z() {
        return w(getCount());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean H(int i10) {
        return v(i10) != -1;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return AbstractC5504s.c(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i10) {
        return B(A(i10, a.b.f36579a));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i10) {
        return F(A(i10, a.b.f36581c));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i10) {
        return I(A(i10, a.b.f36580b));
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i10) {
        return M(A(i10, a.b.f36582d));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d();
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder("{");
        F.t0(this, sb2, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: Z6.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReadableMapBuffer.P((a.c) obj);
            }
        });
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    /* JADX INFO: renamed from: y */
    public ReadableMapBuffer F0(int i10) {
        return L(A(i10, a.b.f36583e));
    }
}
