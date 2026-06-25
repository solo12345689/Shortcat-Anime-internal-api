package p1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: p1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5915c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f55691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f55692b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f55693c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected AbstractC5914b f55694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55695e;

    public AbstractC5915c(char[] cArr) {
        this.f55691a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5915c clone() {
        try {
            return (AbstractC5915c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String d() {
        String str = new String(this.f55691a);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f55693c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f55692b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f55692b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public float e() {
        if (this instanceof e) {
            return ((e) this).e();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5915c)) {
            return false;
        }
        AbstractC5915c abstractC5915c = (AbstractC5915c) obj;
        if (this.f55692b == abstractC5915c.f55692b && this.f55693c == abstractC5915c.f55693c && this.f55695e == abstractC5915c.f55695e && Arrays.equals(this.f55691a, abstractC5915c.f55691a)) {
            return Objects.equals(this.f55694d, abstractC5915c.f55694d);
        }
        return false;
    }

    public int f() {
        if (this instanceof e) {
            return ((e) this).f();
        }
        return 0;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f55691a) * 31;
        long j10 = this.f55692b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f55693c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        AbstractC5914b abstractC5914b = this.f55694d;
        return ((i11 + (abstractC5914b != null ? abstractC5914b.hashCode() : 0)) * 31) + this.f55695e;
    }

    public int i() {
        return this.f55695e;
    }

    protected String n() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean p() {
        char[] cArr = this.f55691a;
        return cArr != null && cArr.length >= 1;
    }

    public void r(AbstractC5914b abstractC5914b) {
        this.f55694d = abstractC5914b;
    }

    public void s(long j10) {
        if (this.f55693c != Long.MAX_VALUE) {
            return;
        }
        this.f55693c = j10;
        if (g.f55700a) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        AbstractC5914b abstractC5914b = this.f55694d;
        if (abstractC5914b != null) {
            abstractC5914b.u(this);
        }
    }

    public void t(long j10) {
        this.f55692b = j10;
    }

    public String toString() {
        long j10 = this.f55692b;
        long j11 = this.f55693c;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f55692b + "-" + this.f55693c + ")";
        }
        return n() + " (" + this.f55692b + " : " + this.f55693c + ") <<" + new String(this.f55691a).substring((int) this.f55692b, ((int) this.f55693c) + 1) + ">>";
    }
}
