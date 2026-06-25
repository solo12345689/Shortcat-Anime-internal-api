package Xe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21776b;

    private f(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f21775a = str;
        this.f21776b = z10;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f k(String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? q(str) : m(str);
    }

    public static f m(String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean p(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f q(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f21775a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f21775a.compareTo(fVar.f21775a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21776b == fVar.f21776b && this.f21775a.equals(fVar.f21775a);
    }

    public String h() {
        if (this.f21776b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB == null) {
            a(2);
        }
        return strB;
    }

    public int hashCode() {
        return (this.f21775a.hashCode() * 31) + (this.f21776b ? 1 : 0);
    }

    public boolean n() {
        return this.f21776b;
    }

    public String toString() {
        return this.f21775a;
    }
}
