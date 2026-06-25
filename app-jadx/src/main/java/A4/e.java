package A4;

import A4.i;
import H4.c;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import tg.K;
import v4.InterfaceC6845d;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f276b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i.a {
        private final boolean c(Uri uri) {
            return AbstractC5504s.c(uri.getScheme(), "content");
        }

        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            if (c(uri)) {
                return new e(uri, mVar);
            }
            return null;
        }
    }

    public e(Uri uri, G4.m mVar) {
        this.f275a = uri;
        this.f276b = mVar;
    }

    private final Bundle d() {
        H4.c cVarB = this.f276b.n().b();
        c.a aVar = cVarB instanceof c.a ? (c.a) cVarB : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f7909a;
        H4.c cVarA = this.f276b.n().a();
        c.a aVar2 = cVarA instanceof c.a ? (c.a) cVarA : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f7909a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    @Override // A4.i
    public Object a(Zd.e eVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.f276b.g().getContentResolver();
        if (b(this.f275a)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f275a, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f275a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f275a)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f275a);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f275a + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f275a, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f275a + "'.").toString());
            }
        }
        return new m(q.b(K.d(K.k(inputStreamOpenInputStream)), this.f276b.g(), new x4.e(this.f275a)), contentResolver.getType(this.f275a), x4.f.DISK);
    }

    public final boolean b(Uri uri) {
        return AbstractC5504s.c(uri.getAuthority(), "com.android.contacts") && AbstractC5504s.c(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        return AbstractC5504s.c(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC5504s.c(pathSegments.get(size + (-3)), "audio") && AbstractC5504s.c(pathSegments.get(size + (-2)), "albums");
    }
}
