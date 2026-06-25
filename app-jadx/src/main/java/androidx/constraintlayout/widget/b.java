package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f28048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0487b f28049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f28051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f28053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28054h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28055a;

        static {
            int[] iArr = new int[EnumC0487b.values().length];
            f28055a = iArr;
            try {
                iArr[EnumC0487b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28055a[EnumC0487b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28055a[EnumC0487b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28055a[EnumC0487b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28055a[EnumC0487b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28055a[EnumC0487b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28055a[EnumC0487b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28055a[EnumC0487b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0487b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, EnumC0487b enumC0487b, Object obj, boolean z10) {
        this.f28048b = str;
        this.f28049c = enumC0487b;
        this.f28047a = z10;
        d(obj);
    }

    public static HashMap a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0487b enumC0487b;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f28307J4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0487b enumC0487b2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == i.f28316K4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == i.f28397U4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == i.f28325L4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0487b2 = EnumC0487b.BOOLEAN_TYPE;
            } else {
                if (index == i.f28341N4) {
                    enumC0487b = EnumC0487b.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f28333M4) {
                    enumC0487b = EnumC0487b.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f28373R4) {
                    enumC0487b = EnumC0487b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i.f28349O4) {
                    enumC0487b = EnumC0487b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i.f28357P4) {
                    enumC0487b = EnumC0487b.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.f28365Q4) {
                    enumC0487b = EnumC0487b.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.f28389T4) {
                    enumC0487b = EnumC0487b.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == i.f28381S4) {
                    enumC0487b = EnumC0487b.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0487b2 = enumC0487b;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new b(string, enumC0487b2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            String str2 = bVar.f28047a ? str : "set" + str;
            try {
                int i10 = a.f28055a[bVar.f28049c.ordinal()];
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (i10) {
                    case 1:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f28050d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f28053g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f28052f);
                        break;
                    case 4:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f28054h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f28054h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f28050d));
                        break;
                    case 7:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f28051e));
                        break;
                    case 8:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f28051e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f28055a[this.f28049c.ordinal()]) {
            case 1:
            case 6:
                this.f28050d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f28053g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f28052f = (String) obj;
                break;
            case 4:
            case 5:
                this.f28054h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f28051e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f28051e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.f28047a = false;
        this.f28048b = bVar.f28048b;
        this.f28049c = bVar.f28049c;
        d(obj);
    }
}
