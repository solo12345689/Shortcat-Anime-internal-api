package xf;

import Ud.AbstractC2262c;
import Ud.AbstractC2273n;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7152d extends AbstractC7151c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64471c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f64472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64473b;

    /* JADX INFO: renamed from: xf.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: xf.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC2262c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f64474c = -1;

        b() {
        }

        @Override // Ud.AbstractC2262c
        protected void b() {
            do {
                int i10 = this.f64474c + 1;
                this.f64474c = i10;
                if (i10 >= C7152d.this.f64472a.length) {
                    break;
                }
            } while (C7152d.this.f64472a[this.f64474c] == null);
            if (this.f64474c >= C7152d.this.f64472a.length) {
                d();
                return;
            }
            Object obj = C7152d.this.f64472a[this.f64474c];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    private C7152d(Object[] objArr, int i10) {
        super(null);
        this.f64472a = objArr;
        this.f64473b = i10;
    }

    private final void f(int i10) {
        Object[] objArr = this.f64472a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f64472a, length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        this.f64472a = objArrCopyOf;
    }

    @Override // xf.AbstractC7151c
    public int b() {
        return this.f64473b;
    }

    @Override // xf.AbstractC7151c
    public void d(int i10, Object value) {
        AbstractC5504s.h(value, "value");
        f(i10);
        if (this.f64472a[i10] == null) {
            this.f64473b = b() + 1;
        }
        this.f64472a[i10] = value;
    }

    @Override // xf.AbstractC7151c
    public Object get(int i10) {
        return AbstractC2273n.i0(this.f64472a, i10);
    }

    @Override // xf.AbstractC7151c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    public C7152d() {
        this(new Object[20], 0);
    }
}
