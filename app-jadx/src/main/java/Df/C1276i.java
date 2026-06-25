package Df;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Df.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1276i implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f3766f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f3767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3771e;

    /* JADX INFO: renamed from: Df.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1276i(CharSequence string) {
        AbstractC5504s.h(string, "string");
        this.f3767a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3768b = 0;
        int i10 = this.f3770d;
        int i11 = this.f3769c;
        this.f3769c = this.f3771e + i10;
        return this.f3767a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f3768b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f3771e < 0) {
            this.f3768b = 2;
            return false;
        }
        int length = this.f3767a.length();
        int length2 = this.f3767a.length();
        for (int i13 = this.f3769c; i13 < length2; i13++) {
            char cCharAt = this.f3767a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f3767a.length() && this.f3767a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f3768b = 1;
                this.f3771e = i10;
                this.f3770d = length;
                return true;
            }
        }
        i10 = -1;
        this.f3768b = 1;
        this.f3771e = i10;
        this.f3770d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
