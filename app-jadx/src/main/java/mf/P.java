package mf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class P {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f53387c;

        static {
            int[] iArr = new int[Se.k.values().length];
            try {
                iArr[Se.k.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Se.k.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Se.k.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Se.k.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53385a = iArr;
            int[] iArr2 = new int[InterfaceC7224b.a.values().length];
            try {
                iArr2[InterfaceC7224b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC7224b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC7224b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC7224b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f53386b = iArr2;
            int[] iArr3 = new int[Se.y.values().length];
            try {
                iArr3[Se.y.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Se.y.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Se.y.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Se.y.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Se.y.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Se.y.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f53387c = iArr3;
        }
    }

    public static final AbstractC7242u a(O o10, Se.y yVar) {
        AbstractC5504s.h(o10, "<this>");
        switch (yVar == null ? -1 : a.f53387c[yVar.ordinal()]) {
            case 1:
                AbstractC7242u INTERNAL = AbstractC7241t.f65123d;
                AbstractC5504s.g(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC7242u PRIVATE = AbstractC7241t.f65120a;
                AbstractC5504s.g(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC7242u PRIVATE_TO_THIS = AbstractC7241t.f65121b;
                AbstractC5504s.g(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC7242u PROTECTED = AbstractC7241t.f65122c;
                AbstractC5504s.g(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC7242u PUBLIC = AbstractC7241t.f65124e;
                AbstractC5504s.g(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC7242u LOCAL = AbstractC7241t.f65125f;
                AbstractC5504s.g(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC7242u PRIVATE2 = AbstractC7241t.f65120a;
                AbstractC5504s.g(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final InterfaceC7224b.a b(O o10, Se.k kVar) {
        AbstractC5504s.h(o10, "<this>");
        int i10 = kVar == null ? -1 : a.f53385a[kVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC7224b.a.DECLARATION : InterfaceC7224b.a.SYNTHESIZED : InterfaceC7224b.a.DELEGATION : InterfaceC7224b.a.FAKE_OVERRIDE : InterfaceC7224b.a.DECLARATION;
    }
}
