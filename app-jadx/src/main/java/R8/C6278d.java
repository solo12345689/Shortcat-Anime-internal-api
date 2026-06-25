package r8;

import java.util.Arrays;
import p8.EnumC5940e;
import r8.AbstractC6289o;

/* JADX INFO: renamed from: r8.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6278d extends AbstractC6289o {

    /* JADX INFO: renamed from: a */
    private final String f58679a;

    /* JADX INFO: renamed from: b */
    private final byte[] f58680b;

    /* JADX INFO: renamed from: c */
    private final EnumC5940e f58681c;

    /* JADX INFO: renamed from: r8.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6289o.a {

        /* JADX INFO: renamed from: a */
        private String f58682a;

        /* JADX INFO: renamed from: b */
        private byte[] f58683b;

        /* JADX INFO: renamed from: c */
        private EnumC5940e f58684c;

        b() {
        }

        @Override // r8.AbstractC6289o.a
        public AbstractC6289o a() {
            String str = "";
            if (this.f58682a == null) {
                str = " backendName";
            }
            if (this.f58684c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6278d(this.f58682a, this.f58683b, this.f58684c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.AbstractC6289o.a
        public AbstractC6289o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f58682a = str;
            return this;
        }

        @Override // r8.AbstractC6289o.a
        public AbstractC6289o.a c(byte[] bArr) {
            this.f58683b = bArr;
            return this;
        }

        @Override // r8.AbstractC6289o.a
        public AbstractC6289o.a d(EnumC5940e enumC5940e) {
            if (enumC5940e == null) {
                throw new NullPointerException("Null priority");
            }
            this.f58684c = enumC5940e;
            return this;
        }
    }

    /* synthetic */ C6278d(String str, byte[] bArr, EnumC5940e enumC5940e, a aVar) {
        this(str, bArr, enumC5940e);
    }

    @Override // r8.AbstractC6289o
    public String b() {
        return this.f58679a;
    }

    @Override // r8.AbstractC6289o
    public byte[] c() {
        return this.f58680b;
    }

    @Override // r8.AbstractC6289o
    public EnumC5940e d() {
        return this.f58681c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6289o) {
            AbstractC6289o abstractC6289o = (AbstractC6289o) obj;
            if (this.f58679a.equals(abstractC6289o.b())) {
                if (Arrays.equals(this.f58680b, abstractC6289o instanceof C6278d ? ((C6278d) abstractC6289o).f58680b : abstractC6289o.c()) && this.f58681c.equals(abstractC6289o.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f58679a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f58680b)) * 1000003) ^ this.f58681c.hashCode();
    }

    private C6278d(String str, byte[] bArr, EnumC5940e enumC5940e) {
        this.f58679a = str;
        this.f58680b = bArr;
        this.f58681c = enumC5940e;
    }
}
