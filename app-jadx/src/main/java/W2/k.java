package w2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import t2.AbstractC6614a;
import t2.InterfaceC6621h;
import w2.InterfaceC6940g;
import w2.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC6621h {

    /* JADX INFO: renamed from: e */
    public static final O9.t f62813e = O9.u.a(new O9.t() { // from class: w2.h
        @Override // O9.t
        public final Object get() {
            return com.google.common.util.concurrent.s.b(Executors.newSingleThreadExecutor());
        }
    });

    /* JADX INFO: renamed from: a */
    private final com.google.common.util.concurrent.r f62814a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6940g.a f62815b;

    /* JADX INFO: renamed from: c */
    private final BitmapFactory.Options f62816c;

    /* JADX INFO: renamed from: d */
    private final int f62817d;

    public k(Context context) {
        this((com.google.common.util.concurrent.r) AbstractC6614a.i((com.google.common.util.concurrent.r) f62813e.get()), new p.a(context));
    }

    public static /* synthetic */ Bitmap d(k kVar, byte[] bArr) {
        kVar.getClass();
        return AbstractC6936c.a(bArr, bArr.length, kVar.f62816c, kVar.f62817d);
    }

    public static Bitmap g(InterfaceC6940g interfaceC6940g, Uri uri, BitmapFactory.Options options, int i10) {
        try {
            interfaceC6940g.a(new o(uri));
            byte[] bArrB = n.b(interfaceC6940g);
            return AbstractC6936c.a(bArrB, bArrB.length, options, i10);
        } finally {
            interfaceC6940g.close();
        }
    }

    @Override // t2.InterfaceC6621h
    public com.google.common.util.concurrent.p b(final Uri uri) {
        return this.f62814a.submit(new Callable() { // from class: w2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k kVar = this.f62811a;
                return k.g(kVar.f62815b.a(), uri, kVar.f62816c, kVar.f62817d);
            }
        });
    }

    @Override // t2.InterfaceC6621h
    public com.google.common.util.concurrent.p c(final byte[] bArr) {
        return this.f62814a.submit(new Callable() { // from class: w2.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.d(this.f62809a, bArr);
            }
        });
    }

    public k(com.google.common.util.concurrent.r rVar, InterfaceC6940g.a aVar) {
        this(rVar, aVar, null);
    }

    public k(com.google.common.util.concurrent.r rVar, InterfaceC6940g.a aVar, BitmapFactory.Options options) {
        this(rVar, aVar, options, -1);
    }

    public k(com.google.common.util.concurrent.r rVar, InterfaceC6940g.a aVar, BitmapFactory.Options options, int i10) {
        this.f62814a = rVar;
        this.f62815b = aVar;
        this.f62816c = options;
        this.f62817d = i10;
    }
}
