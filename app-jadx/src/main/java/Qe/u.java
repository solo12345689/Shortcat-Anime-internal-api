package Qe;

import Qe.s;
import gf.C4881d;
import gf.EnumC4882e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f14912a = new u();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14913a;

        static {
            int[] iArr = new int[ve.l.values().length];
            try {
                iArr[ve.l.f62119g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve.l.f62120h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve.l.f62121i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve.l.f62122j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ve.l.f62123k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ve.l.f62124l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ve.l.f62125m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ve.l.f62126n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f14913a = iArr;
        }
    }

    private u() {
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s c(s possiblyPrimitiveType) {
        AbstractC5504s.h(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof s.d)) {
            return possiblyPrimitiveType;
        }
        s.d dVar = (s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = C4881d.c(dVar.i().p()).f();
        AbstractC5504s.g(strF, "getInternalName(...)");
        return e(strF);
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s b(String representation) {
        EnumC4882e enumC4882e;
        AbstractC5504s.h(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        EnumC4882e[] enumC4882eArrValues = EnumC4882e.values();
        int length = enumC4882eArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC4882e = null;
                break;
            }
            enumC4882e = enumC4882eArrValues[i10];
            if (enumC4882e.h().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC4882e != null) {
            return new s.d(enumC4882e);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return new s.a(b(strSubstring));
        }
        if (cCharAt == 'L') {
            Df.r.Z(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        return new s.c(strSubstring2);
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c e(String internalName) {
        AbstractC5504s.h(internalName, "internalName");
        return new s.c(internalName);
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s a(ve.l primitiveType) {
        AbstractC5504s.h(primitiveType, "primitiveType");
        switch (a.f14913a[primitiveType.ordinal()]) {
            case 1:
                return s.f14900a.a();
            case 2:
                return s.f14900a.c();
            case 3:
                return s.f14900a.b();
            case 4:
                return s.f14900a.h();
            case 5:
                return s.f14900a.f();
            case 6:
                return s.f14900a.e();
            case 7:
                return s.f14900a.g();
            case 8:
                return s.f14900a.d();
            default:
                throw new Td.r();
        }
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return e("java/lang/Class");
    }

    @Override // Qe.t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String d(s type) {
        String strH;
        AbstractC5504s.h(type, "type");
        if (type instanceof s.a) {
            return '[' + d(((s.a) type).i());
        }
        if (type instanceof s.d) {
            EnumC4882e enumC4882eI = ((s.d) type).i();
            return (enumC4882eI == null || (strH = enumC4882eI.h()) == null) ? "V" : strH;
        }
        if (!(type instanceof s.c)) {
            throw new Td.r();
        }
        return 'L' + ((s.c) type).i() + ';';
    }
}
