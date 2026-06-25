package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f28924k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f28926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f28927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f28928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f28931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f28932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28934j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f28925a) {
                case -1:
                    return (Icon) iconCompat.f28926b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f28926b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f28929e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f28926b, iconCompat.f28929e, iconCompat.f28930f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f28926b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f28926b, false)) : b.a((Bitmap) iconCompat.f28926b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamJ), false));
                        } else {
                            iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f28931g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f28932h;
            if (mode != IconCompat.f28924k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f28925a = -1;
        this.f28927c = null;
        this.f28928d = null;
        this.f28929e = 0;
        this.f28930f = 0;
        this.f28931g = null;
        this.f28932h = f28924k;
        this.f28933i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        K1.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f28926b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Bitmap bitmap) {
        K1.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f28926b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        K1.b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f28929e = i10;
        if (resources != null) {
            try {
                iconCompat.f28926b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f28926b = str;
        }
        iconCompat.f28934j = str;
        return iconCompat;
    }

    private static String p(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i10 = this.f28925a;
        if (i10 == -1) {
            Object obj = this.f28926b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f28926b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f28926b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i10 = this.f28925a;
        if (i10 == -1) {
            return a.a(this.f28926b);
        }
        if (i10 == 2) {
            return this.f28929e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i10 = this.f28925a;
        if (i10 == -1) {
            return a.b(this.f28926b);
        }
        if (i10 == 2) {
            String str = this.f28934j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f28926b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0] : this.f28934j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i10 = this.f28925a;
        return i10 == -1 ? a.c(this.f28926b) : i10;
    }

    public Uri i() {
        int i10 = this.f28925a;
        if (i10 == -1) {
            return a.d(this.f28926b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f28926b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f28926b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e11);
            return null;
        }
    }

    public void k() {
        this.f28932h = PorterDuff.Mode.valueOf(this.f28933i);
        switch (this.f28925a) {
            case -1:
                Parcelable parcelable = this.f28928d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f28926b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f28928d;
                if (parcelable2 != null) {
                    this.f28926b = parcelable2;
                    return;
                }
                byte[] bArr = this.f28927c;
                this.f28926b = bArr;
                this.f28925a = 3;
                this.f28929e = 0;
                this.f28930f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f28927c, Charset.forName("UTF-16"));
                this.f28926b = str;
                if (this.f28925a == 2 && this.f28934j == null) {
                    this.f28934j = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f28926b = this.f28927c;
                return;
        }
    }

    public void l(boolean z10) {
        this.f28933i = this.f28932h.name();
        switch (this.f28925a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f28928d = (Parcelable) this.f28926b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f28928d = (Parcelable) this.f28926b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f28926b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f28927c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f28927c = ((String) this.f28926b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f28927c = (byte[]) this.f28926b;
                return;
            case 4:
            case 6:
                this.f28927c = this.f28926b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f28925a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f28926b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f28926b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f28926b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f28926b);
                break;
        }
        bundle.putInt("type", this.f28925a);
        bundle.putInt("int1", this.f28929e);
        bundle.putInt("int2", this.f28930f);
        bundle.putString("string1", this.f28934j);
        ColorStateList colorStateList = this.f28931g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f28932h;
        if (mode != f28924k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f28925a == -1) {
            return String.valueOf(this.f28926b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(p(this.f28925a));
        switch (this.f28925a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f28926b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f28926b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f28934j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f28929e);
                if (this.f28930f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f28930f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f28926b);
                break;
        }
        if (this.f28931g != null) {
            sb2.append(" tint=");
            sb2.append(this.f28931g);
        }
        if (this.f28932h != f28924k) {
            sb2.append(" mode=");
            sb2.append(this.f28932h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f28927c = null;
        this.f28928d = null;
        this.f28929e = 0;
        this.f28930f = 0;
        this.f28931g = null;
        this.f28932h = f28924k;
        this.f28933i = null;
        this.f28925a = i10;
    }
}
