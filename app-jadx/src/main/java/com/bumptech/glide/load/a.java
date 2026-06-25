package com.bumptech.glide.load;

import b5.V;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o5.AbstractC5824a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0599a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f35674a;

        C0599a(InputStream inputStream) {
            this.f35674a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.f(this.f35674a);
            } finally {
                this.f35674a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f35675a;

        b(ByteBuffer byteBuffer) {
            this.f35675a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.e(this.f35675a);
            } finally {
                AbstractC5824a.d(this.f35675a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f35676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35677b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
            this.f35676a = parcelFileDescriptorRewinder;
            this.f35677b = bVar;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            V v10;
            V v11 = null;
            try {
                v10 = new V(new FileInputStream(this.f35676a.a().getFileDescriptor()), this.f35677b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType imageTypeF = imageHeaderParser.f(v10);
                v10.g();
                this.f35676a.a();
                return imageTypeF;
            } catch (Throwable th3) {
                th = th3;
                v11 = v10;
                if (v11 != null) {
                    v11.g();
                }
                this.f35676a.a();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f35678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35679b;

        d(ByteBuffer byteBuffer, V4.b bVar) {
            this.f35678a = byteBuffer;
            this.f35679b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f35678a, this.f35679b);
            } finally {
                AbstractC5824a.d(this.f35678a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f35680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35681b;

        e(InputStream inputStream, V4.b bVar) {
            this.f35680a = inputStream;
            this.f35681b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f35680a, this.f35681b);
            } finally {
                this.f35680a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f35682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35683b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
            this.f35682a = parcelFileDescriptorRewinder;
            this.f35683b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            V v10;
            V v11 = null;
            try {
                v10 = new V(new FileInputStream(this.f35682a.a().getFileDescriptor()), this.f35683b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int iC = imageHeaderParser.c(v10, this.f35683b);
                v10.g();
                this.f35682a.a();
                return iC;
            } catch (Throwable th3) {
                th = th3;
                v11 = v10;
                if (v11 != null) {
                    v11.g();
                }
                this.f35682a.a();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f35684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35685b;

        g(ByteBuffer byteBuffer, V4.b bVar) {
            this.f35684a = byteBuffer;
            this.f35685b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f35684a, this.f35685b);
            } finally {
                AbstractC5824a.d(this.f35684a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f35686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35687b;

        h(InputStream inputStream, V4.b bVar) {
            this.f35686a = inputStream;
            this.f35687b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f35686a, this.f35687b);
            } finally {
                this.f35686a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f35688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ V4.b f35689b;

        i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
            this.f35688a = parcelFileDescriptorRewinder;
            this.f35689b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
            V v10;
            V v11 = null;
            try {
                v10 = new V(new FileInputStream(this.f35688a.a().getFileDescriptor()), this.f35689b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zD = imageHeaderParser.d(v10, this.f35689b);
                v10.g();
                this.f35688a.a();
                return zD;
            } catch (Throwable th3) {
                th = th3;
                v11 = v10;
                if (v11 != null) {
                    v11.g();
                }
                this.f35688a.a();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface j {
        boolean a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface k {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, V4.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new V(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, V4.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, k kVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = kVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, V4.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new V(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0599a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = lVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean i(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, V4.b bVar) {
        return l(list, new i(parcelFileDescriptorRewinder, bVar));
    }

    public static boolean j(List list, InputStream inputStream, V4.b bVar) {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new V(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, bVar));
    }

    public static boolean k(List list, ByteBuffer byteBuffer, V4.b bVar) {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, bVar));
    }

    private static boolean l(List list, j jVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jVar.a((ImageHeaderParser) list.get(i10))) {
                return true;
            }
        }
        return false;
    }
}
