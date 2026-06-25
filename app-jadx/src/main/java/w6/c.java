package w6;

import B5.h;
import E6.k;
import H6.D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements H5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f62934c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6950b f62935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f62936b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapFactory.Options b(int i10, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i10;
            options.inMutable = true;
            return options;
        }

        private a() {
        }
    }

    public c(D poolFactory) {
        AbstractC5504s.h(poolFactory, "poolFactory");
        this.f62935a = new C6950b(poolFactory.h());
        com.facebook.imagepipeline.memory.d dVarD = poolFactory.d();
        AbstractC5504s.g(dVarD, "getFlexByteArrayPool(...)");
        this.f62936b = dVarD;
    }

    @Override // H5.a
    public Bitmap a(int i10, int i11, Bitmap.Config bitmapConfig) throws Throwable {
        k kVar;
        AbstractC5504s.h(bitmapConfig, "bitmapConfig");
        C5.a aVarA = this.f62935a.a((short) i10, (short) i11);
        AbstractC5504s.g(aVarA, "generate(...)");
        try {
            kVar = new k(aVarA);
            try {
                kVar.a1(q6.b.f57656b);
                BitmapFactory.Options optionsB = f62934c.b(kVar.z(), bitmapConfig);
                int size = ((h) aVarA.C()).size();
                Object objC = aVarA.C();
                AbstractC5504s.g(objC, "get(...)");
                C5.a aVarA2 = this.f62936b.a(size + 2);
                Object objC2 = aVarA2.C();
                AbstractC5504s.g(objC2, "get(...)");
                byte[] bArr = (byte[]) objC2;
                ((h) objC).u(0, bArr, 0, size);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, optionsB);
                if (bitmapDecodeByteArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                bitmapDecodeByteArray.setHasAlpha(true);
                bitmapDecodeByteArray.eraseColor(0);
                C5.a.m(aVarA2);
                k.g(kVar);
                C5.a.m(aVarA);
                return bitmapDecodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                C5.a.m(null);
                k.g(kVar);
                C5.a.m(aVarA);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            kVar = null;
        }
    }
}
