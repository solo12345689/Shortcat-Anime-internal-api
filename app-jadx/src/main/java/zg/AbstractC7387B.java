package zg;

import Oh.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: zg.B */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7387B extends AbstractC7432y implements Iterable {

    /* JADX INFO: renamed from: b */
    static final L f66314b = new a(AbstractC7387B.class, 16);

    /* JADX INFO: renamed from: a */
    InterfaceC7400e[] f66315a;

    /* JADX INFO: renamed from: zg.B$b */
    class b implements Enumeration {

        /* JADX INFO: renamed from: a */
        private int f66316a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f66316a < AbstractC7387B.this.f66315a.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i10 = this.f66316a;
            InterfaceC7400e[] interfaceC7400eArr = AbstractC7387B.this.f66315a;
            if (i10 >= interfaceC7400eArr.length) {
                throw new NoSuchElementException();
            }
            this.f66316a = i10 + 1;
            return interfaceC7400eArr[i10];
        }
    }

    protected AbstractC7387B() {
        this.f66315a = C7402f.f66398d;
    }

    public static AbstractC7387B A(Object obj) {
        if (obj == null || (obj instanceof AbstractC7387B)) {
            return (AbstractC7387B) obj;
        }
        if (obj instanceof InterfaceC7400e) {
            AbstractC7432y abstractC7432yE = ((InterfaceC7400e) obj).e();
            if (abstractC7432yE instanceof AbstractC7387B) {
                return (AbstractC7387B) abstractC7432yE;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC7387B) f66314b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public InterfaceC7400e B(int i10) {
        return this.f66315a[i10];
    }

    public Enumeration D() {
        return new b();
    }

    abstract AbstractC7394b F();

    abstract AbstractC7408i G();

    abstract AbstractC7428u I();

    abstract AbstractC7388C K();

    InterfaceC7400e[] L() {
        return this.f66315a;
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        int length = this.f66315a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f66315a[length].e().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0210a(this.f66315a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (!(abstractC7432y instanceof AbstractC7387B)) {
            return false;
        }
        AbstractC7387B abstractC7387B = (AbstractC7387B) abstractC7432y;
        int size = size();
        if (abstractC7387B.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC7432y abstractC7432yE = this.f66315a[i10].e();
            AbstractC7432y abstractC7432yE2 = abstractC7387B.f66315a[i10].e();
            if (abstractC7432yE != abstractC7432yE2 && !abstractC7432yE.l(abstractC7432yE2)) {
                return false;
            }
        }
        return true;
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return true;
    }

    public int size() {
        return this.f66315a.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f66315a[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new r0(this.f66315a, false);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return new E0(this.f66315a, false);
    }

    AbstractC7394b[] y() {
        int size = size();
        AbstractC7394b[] abstractC7394bArr = new AbstractC7394b[size];
        for (int i10 = 0; i10 < size; i10++) {
            abstractC7394bArr[i10] = AbstractC7394b.A(this.f66315a[i10]);
        }
        return abstractC7394bArr;
    }

    AbstractC7428u[] z() {
        int size = size();
        AbstractC7428u[] abstractC7428uArr = new AbstractC7428u[size];
        for (int i10 = 0; i10 < size; i10++) {
            abstractC7428uArr[i10] = AbstractC7428u.z(this.f66315a[i10]);
        }
        return abstractC7428uArr;
    }

    protected AbstractC7387B(InterfaceC7400e interfaceC7400e) {
        if (interfaceC7400e == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f66315a = new InterfaceC7400e[]{interfaceC7400e};
    }

    protected AbstractC7387B(InterfaceC7400e interfaceC7400e, InterfaceC7400e interfaceC7400e2) {
        if (interfaceC7400e == null) {
            throw new NullPointerException("'element1' cannot be null");
        }
        if (interfaceC7400e2 == null) {
            throw new NullPointerException("'element2' cannot be null");
        }
        this.f66315a = new InterfaceC7400e[]{interfaceC7400e, interfaceC7400e2};
    }

    protected AbstractC7387B(C7402f c7402f) {
        if (c7402f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f66315a = c7402f.g();
    }

    AbstractC7387B(InterfaceC7400e[] interfaceC7400eArr, boolean z10) {
        this.f66315a = z10 ? C7402f.b(interfaceC7400eArr) : interfaceC7400eArr;
    }

    /* JADX INFO: renamed from: zg.B$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return abstractC7387B;
        }
    }
}
