package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class J extends L implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class f36064d = J.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f36065e = {"_id", "_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f36066f = {"_data"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Rect f36067g = new Rect(0, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 384);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Rect f36068h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f36069c;

    public J(Executor executor, B5.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f36069c = contentResolver;
    }

    private E6.k g(Uri uri, y6.g gVar) {
        Cursor cursorQuery;
        E6.k kVarJ;
        if (gVar == null || (cursorQuery = this.f36069c.query(uri, f36065e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (kVarJ = j(gVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                kVarJ.q1(i(cursorQuery.getString(columnIndex)));
            }
            cursorQuery.close();
            return kVarJ;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e10) {
            AbstractC7283a.l(f36064d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private E6.k j(y6.g gVar, long j10) {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iK = k(gVar);
        if (iK == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f36069c, j10, iK, f36066f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) y5.k.g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }

    private static int k(y6.g gVar) {
        Rect rect = f36068h;
        if (v0.b(rect.width(), rect.height(), gVar)) {
            return 3;
        }
        Rect rect2 = f36067g;
        return v0.b(rect2.width(), rect2.height(), gVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(y6.g gVar) {
        Rect rect = f36067g;
        return v0.b(rect.width(), rect.height(), gVar);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b bVar) {
        Uri uriV = bVar.v();
        if (G5.f.i(uriV)) {
            return g(uriV, bVar.r());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
