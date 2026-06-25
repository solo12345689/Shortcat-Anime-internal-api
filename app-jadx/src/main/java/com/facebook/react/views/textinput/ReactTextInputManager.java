package com.facebook.react.views.textinput;

import Td.InterfaceC2154e;
import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.views.text.q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6343c0;
import s0.AbstractC6346d0;
import y1.AbstractC7194b;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactTextInputManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 ¼\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002½\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\"\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\"H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b)\u0010(J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b*\u0010(J)\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-H\u0017¢\u0006\u0004\b/\u00100J)\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00101J\u001f\u00103\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00102\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\bH\u0007¢\u0006\u0004\b6\u0010\u0011J\u001f\u00109\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010>\u001a\u000207H\u0007¢\u0006\u0004\b?\u0010:J!\u0010A\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bA\u0010=J!\u0010C\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bC\u0010=J!\u0010E\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010=J\u001f\u0010M\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010L\u001a\u00020GH\u0007¢\u0006\u0004\bM\u0010JJ!\u0010O\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010=J\u001f\u0010Q\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010P\u001a\u00020GH\u0007¢\u0006\u0004\bQ\u0010JJ\u001f\u0010S\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010R\u001a\u00020GH\u0007¢\u0006\u0004\bS\u0010JJ\u001f\u0010U\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010T\u001a\u00020GH\u0007¢\u0006\u0004\bU\u0010JJ\u001f\u0010W\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010V\u001a\u000207H\u0007¢\u0006\u0004\bW\u0010:J\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010X\u001a\u00020GH\u0007¢\u0006\u0004\bY\u0010JJ!\u0010[\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b[\u0010=J!\u0010]\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b]\u0010^J!\u0010_\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b_\u0010^J!\u0010`\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b`\u0010^J!\u0010a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\ba\u0010^J\u001f\u0010c\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010b\u001a\u00020GH\u0007¢\u0006\u0004\bc\u0010JJ\u001f\u0010e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010d\u001a\u00020GH\u0007¢\u0006\u0004\be\u0010JJ\u001f\u0010g\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010f\u001a\u00020GH\u0007¢\u0006\u0004\bg\u0010JJ!\u0010h\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bh\u0010^J!\u0010j\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010i\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bj\u0010^J!\u0010l\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010k\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bl\u0010=J!\u0010n\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bn\u0010=J!\u0010p\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bp\u0010=J\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\bH\u0007¢\u0006\u0004\br\u0010\u0011J\u001f\u0010t\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010s\u001a\u00020GH\u0007¢\u0006\u0004\bt\u0010JJ\u001f\u0010v\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\bH\u0007¢\u0006\u0004\bv\u0010\u0011J!\u0010x\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010w\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bx\u0010^J!\u0010z\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010y\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bz\u0010=J!\u0010|\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010GH\u0007¢\u0006\u0004\b|\u0010}J\u001f\u0010\u007f\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010~\u001a\u00020GH\u0007¢\u0006\u0004\b\u007f\u0010JJ\"\u0010\u0081\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0080\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0081\u0001\u0010JJ$\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J$\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0087\u0001\u0010=J$\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0089\u0001\u0010=J$\u0010\u008b\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0005\b\u008b\u0001\u0010FJ\"\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u008c\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u008d\u0001\u0010JJ$\u0010\u008f\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u008f\u0001\u0010=J,\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\u0007\u0010\u0091\u0001\u001a\u000207H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J$\u0010\u0095\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0095\u0001\u0010=J\"\u0010\u0096\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0096\u0001\u0010JJ\"\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0097\u0001\u001a\u00020GH\u0007¢\u0006\u0005\b\u0098\u0001\u0010JJ$\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u009a\u0001\u0010=J,\u0010\u009c\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\u0007\u0010\u009b\u0001\u001a\u000207H\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u0093\u0001J-\u0010\u009d\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J$\u0010 \u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b \u0001\u0010=J\u001a\u0010¡\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0006\b¡\u0001\u0010¢\u0001J$\u0010¥\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u00182\u0007\u0010¤\u0001\u001a\u00020\u0002H\u0014¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001d\u0010§\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0005\b§\u0001\u0010(J>\u0010¬\u0001\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\b2\u0007\u0010©\u0001\u001a\u00020\b2\u0007\u0010ª\u0001\u001a\u00020\b2\u0007\u0010«\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J0\u0010²\u0001\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u00022\b\u0010¯\u0001\u001a\u00030®\u00012\b\u0010±\u0001\u001a\u00030°\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J,\u0010\u000b\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u00022\b\u0010¯\u0001\u001a\u00030®\u00012\b\u0010µ\u0001\u001a\u00030´\u0001¢\u0006\u0005\b\u000b\u0010¶\u0001R)\u0010 \u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b \u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/textinput/j;", "Lcom/facebook/react/uimanager/r;", "<init>", "()V", "", "text", "", "mostRecentEventCount", "Lcom/facebook/react/views/text/i;", "getReactTextUpdate", "(Ljava/lang/String;I)Lcom/facebook/react/views/text/i;", "view", "mode", "LTd/L;", "setImportantForAutofill", "(Lcom/facebook/react/views/textinput/j;I)V", "", "hints", "setAutofillHints", "(Lcom/facebook/react/views/textinput/j;[Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/textinput/j;", "Lcom/facebook/react/views/text/d;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/d;", "Lcom/facebook/react/views/text/o;", "reactTextViewManagerCallback", "(Lcom/facebook/react/views/text/o;)Lcom/facebook/react/views/text/d;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "", "", "getExportedCustomBubblingEventTypeConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "getCommandsMap", "reactEditText", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/textinput/j;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "extraData", "updateExtraData", "(Lcom/facebook/react/views/textinput/j;Ljava/lang/Object;)V", "lineHeight", "setLineHeight", "", "fontSize", "setFontSize", "(Lcom/facebook/react/views/textinput/j;F)V", "fontFamily", "setFontFamily", "(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V", "maxFontSizeMultiplier", "setMaxFontSizeMultiplier", "fontWeight", "setFontWeight", "fontStyle", "setFontStyle", "fontVariant", "setFontVariant", "(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/bridge/ReadableArray;)V", "", "includepad", "setIncludeFontPadding", "(Lcom/facebook/react/views/textinput/j;Z)V", "value", "onSelectionChange", "setOnSelectionChange", "submitBehavior", "setSubmitBehavior", "onContentSizeChange", "setOnContentSizeChange", "onScroll", "setOnScroll", "onKeyPress", "setOnKeyPress", "letterSpacing", "setLetterSpacing", "allowFontScaling", "setAllowFontScaling", "placeholder", "setPlaceholder", "color", "setPlaceholderTextColor", "(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V", "setSelectionColor", "setSelectionHandleColor", "setCursorColor", "caretHidden", "setCaretHidden", "contextMenuHidden", "setContextMenuHidden", "selectTextOnFocus", "setSelectTextOnFocus", "setColor", "underlineColor", "setUnderlineColor", "textAlign", "setTextAlign", "textAlignVertical", "setTextAlignVertical", "resource", "setInlineImageLeft", "padding", "setInlineImagePadding", "editable", "setEditable", "numLines", "setNumLines", "maxLength", "setMaxLength", "autoComplete", "setTextContentType", "autoCorrect", "setAutoCorrect", "(Lcom/facebook/react/views/textinput/j;Ljava/lang/Boolean;)V", "multiline", "setMultiline", "password", "setSecureTextEntry", "Lcom/facebook/react/bridge/Dynamic;", "autoCapitalize", "setAutoCapitalize", "(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/bridge/Dynamic;)V", "keyboardType", "setKeyboardType", "returnKeyType", "setReturnKeyType", "acceptDragAndDropTypes", "setAcceptDragAndDropTypes", "disableFullscreenUI", "setDisableFullscreenUI", "returnKeyLabel", "setReturnKeyLabel", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/textinput/j;IF)V", "borderStyle", "setBorderStyle", "showKeyboardOnFocus", "autoFocus", "setAutoFocus", "textDecorationLineString", "setTextDecorationLine", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/textinput/j;ILjava/lang/Integer;)V", "overflow", "setOverflow", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/textinput/j;)V", "reactContext", "editText", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/textinput/j;)V", "getExportedViewConstants", "left", "top", "right", "bottom", "setPadding", "(Lcom/facebook/react/views/textinput/j;IIII)V", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "Lcom/facebook/react/common/mapbuffer/a;", "state", "(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;", "Lcom/facebook/react/views/text/o;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/o;", "setReactTextViewManagerCallback", "(Lcom/facebook/react/views/text/o;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactTextInputManager extends BaseViewManager<C3320j, com.facebook.react.uimanager.r> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] DRAWABLE_HANDLE_FIELDS;
    private static final String[] DRAWABLE_HANDLE_RESOURCES;
    private static final InputFilter[] EMPTY_FILTERS;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final String TAG;
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    private com.facebook.react.views.text.o reactTextViewManagerCallback;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.ReactTextInputManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void e(C3320j c3320j) {
            if ((c3320j.getStagedInputType() & ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c3320j.getStagedInputType() & 128) == 0) {
                return;
            }
            h(c3320j, 128, 16);
        }

        public final EventDispatcher f(ReactContext reactContext, C3320j c3320j) {
            return f0.c(reactContext, c3320j.getId());
        }

        public final boolean g() {
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC5504s.g(MANUFACTURER, "MANUFACTURER");
            String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return Build.VERSION.SDK_INT == 29 && Df.r.W(lowerCase, Constants.REFERRER_API_XIAOMI, false, 2, null);
        }

        public final void h(C3320j c3320j, int i10, int i11) {
            c3320j.setStagedInputType(((~i10) & c3320j.getStagedInputType()) | i11);
        }

        private Companion() {
        }
    }

    static {
        String simpleName = ReactTextInputManager.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        REACT_PROPS_AUTOFILL_HINTS_MAP = S.l(Td.z.a("birthdate-day", "birthDateDay"), Td.z.a("birthdate-full", "birthDateFull"), Td.z.a("birthdate-month", "birthDateMonth"), Td.z.a("birthdate-year", "birthDateYear"), Td.z.a("cc-csc", "creditCardSecurityCode"), Td.z.a("cc-exp", "creditCardExpirationDate"), Td.z.a("cc-exp-day", "creditCardExpirationDay"), Td.z.a("cc-exp-month", "creditCardExpirationMonth"), Td.z.a("cc-exp-year", "creditCardExpirationYear"), Td.z.a("cc-number", "creditCardNumber"), Td.z.a("email", "emailAddress"), Td.z.a("gender", "gender"), Td.z.a("name", "personName"), Td.z.a("name-family", "personFamilyName"), Td.z.a("name-given", "personGivenName"), Td.z.a("name-middle", "personMiddleName"), Td.z.a("name-middle-initial", "personMiddleInitial"), Td.z.a("name-prefix", "personNamePrefix"), Td.z.a("name-suffix", "personNameSuffix"), Td.z.a("password", "password"), Td.z.a("password-new", "newPassword"), Td.z.a("postal-address", "postalAddress"), Td.z.a("postal-address-country", "addressCountry"), Td.z.a("postal-address-extended", "extendedAddress"), Td.z.a("postal-address-extended-postal-code", "extendedPostalCode"), Td.z.a("postal-address-locality", "addressLocality"), Td.z.a("postal-address-region", "addressRegion"), Td.z.a("postal-code", "postalCode"), Td.z.a("street-address", "streetAddress"), Td.z.a("sms-otp", "smsOTPCode"), Td.z.a("tel", "phoneNumber"), Td.z.a("tel-country-code", "phoneCountryCode"), Td.z.a("tel-national", "phoneNational"), Td.z.a("tel-device", "phoneNumberDevice"), Td.z.a("username", "username"), Td.z.a("username-new", "newUsername"));
        EMPTY_FILTERS = new InputFilter[0];
        DRAWABLE_HANDLE_RESOURCES = new String[]{"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
        DRAWABLE_HANDLE_FIELDS = new String[]{"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    }

    public static final void addEventEmitters$lambda$2(C3284b0 c3284b0, C3320j c3320j, View view, boolean z10) {
        int iC = c3284b0.c();
        EventDispatcher eventDispatcherF = INSTANCE.f(c3284b0, c3320j);
        if (z10) {
            if (eventDispatcherF != null) {
                eventDispatcherF.d(new com.facebook.react.uimanager.events.o(iC, c3320j.getId()));
            }
        } else {
            if (eventDispatcherF != null) {
                eventDispatcherF.d(new com.facebook.react.uimanager.events.c(iC, c3320j.getId()));
            }
            if (eventDispatcherF != null) {
                eventDispatcherF.d(new n(iC, c3320j.getId(), String.valueOf(c3320j.getText())));
            }
        }
    }

    public static final boolean addEventEmitters$lambda$3(C3320j c3320j, C3284b0 c3284b0, TextView textView, int i10, KeyEvent keyEvent) {
        EventDispatcher eventDispatcherF;
        if ((i10 & 255) == 0 && i10 != 0) {
            return true;
        }
        boolean zC = c3320j.C();
        boolean zS = c3320j.S();
        boolean zR = c3320j.R();
        if (zS && (eventDispatcherF = INSTANCE.f(c3284b0, c3320j)) != null) {
            eventDispatcherF.d(new G(c3284b0.c(), c3320j.getId(), String.valueOf(c3320j.getText())));
        }
        if (zR) {
            c3320j.x();
        }
        return zR || zS || !zC || i10 == 5 || i10 == 7;
    }

    private final com.facebook.react.views.text.i getReactTextUpdate(String text, int mostRecentEventCount) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text);
        return new com.facebook.react.views.text.i(spannableStringBuilder, mostRecentEventCount, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    private final void setAutofillHints(C3320j view, String... hints) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setAutofillHints((String[]) Arrays.copyOf(hints, hints.length));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return S.l(Td.z.a("focusTextInput", 1), Td.z.a("blurTextInput", 2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(S.l(Td.z.a("topSubmitEditing", S.f(Td.z.a("phasedRegistrationNames", S.l(Td.z.a("bubbled", "onSubmitEditing"), Td.z.a("captured", "onSubmitEditingCapture"))))), Td.z.a("topEndEditing", S.f(Td.z.a("phasedRegistrationNames", S.l(Td.z.a("bubbled", "onEndEditing"), Td.z.a("captured", "onEndEditingCapture"))))), Td.z.a("topKeyPress", S.f(Td.z.a("phasedRegistrationNames", S.l(Td.z.a("bubbled", "onKeyPress"), Td.z.a("captured", "onKeyPressCapture")))))));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S.f(Td.z.a(com.facebook.react.views.scroll.p.f38149a.a(com.facebook.react.views.scroll.p.f38152d), S.f(Td.z.a("registrationName", "onScroll")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return S.f(Td.z.a("AutoCapitalizationType", S.l(Td.z.a("none", 0), Td.z.a("characters", 4096), Td.z.a("words", 8192), Td.z.a("sentences", 16384))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    protected final com.facebook.react.views.text.o getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.r> getShadowNodeClass() {
        return F.class;
    }

    @B7.a(name = "acceptDragAndDropTypes")
    public final void setAcceptDragAndDropTypes(C3320j view, ReadableArray acceptDragAndDropTypes) {
        AbstractC5504s.h(view, "view");
        if (acceptDragAndDropTypes == null) {
            view.setDragAndDropFilter(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = acceptDragAndDropTypes.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = acceptDragAndDropTypes.getString(i10);
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setDragAndDropFilter(arrayList);
    }

    @B7.a(defaultBoolean = true, name = "allowFontScaling")
    public final void setAllowFontScaling(C3320j view, boolean allowFontScaling) {
        AbstractC5504s.h(view, "view");
        view.setAllowFontScaling(allowFontScaling);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    @B7.a(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAutoCapitalize(com.facebook.react.views.textinput.C3320j r4, com.facebook.react.bridge.Dynamic r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            java.lang.String r0 = "autoCapitalize"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            com.facebook.react.bridge.ReadableType r0 = r5.getType()
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number
            if (r0 != r1) goto L17
            int r5 = r5.asInt()
            goto L58
        L17:
            com.facebook.react.bridge.ReadableType r0 = r5.getType()
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r1) goto L41
            java.lang.String r5 = r5.asString()
            if (r5 == 0) goto L41
            int r0 = r5.hashCode()
            switch(r0) {
                case 3387192: goto L4f;
                case 113318569: goto L43;
                case 490141296: goto L3b;
                case 1245424234: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L41
        L2f:
            java.lang.String r0 = "characters"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L38
            goto L41
        L38:
            r5 = 4096(0x1000, float:5.74E-42)
            goto L58
        L3b:
            java.lang.String r0 = "sentences"
            boolean r5 = r5.equals(r0)
        L41:
            r5 = r2
            goto L58
        L43:
            java.lang.String r0 = "words"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L4c
            goto L41
        L4c:
            r5 = 8192(0x2000, float:1.14794E-41)
            goto L58
        L4f:
            java.lang.String r0 = "none"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L41
            r5 = 0
        L58:
            com.facebook.react.views.textinput.ReactTextInputManager$a r0 = com.facebook.react.views.textinput.ReactTextInputManager.INSTANCE
            r1 = 28672(0x7000, float:4.0178E-41)
            com.facebook.react.views.textinput.ReactTextInputManager.Companion.d(r0, r4, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setAutoCapitalize(com.facebook.react.views.textinput.j, com.facebook.react.bridge.Dynamic):void");
    }

    @B7.a(name = "autoCorrect")
    public final void setAutoCorrect(C3320j view, Boolean autoCorrect) {
        AbstractC5504s.h(view, "view");
        INSTANCE.h(view, 557056, AbstractC5504s.c(autoCorrect, Boolean.TRUE) ? 32768 : AbstractC5504s.c(autoCorrect, Boolean.FALSE) ? 524288 : 0);
    }

    @B7.a(defaultBoolean = false, name = "autoFocus")
    public final void setAutoFocus(C3320j view, boolean autoFocus) {
        AbstractC5504s.h(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @B7.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(C3320j view, int index, Integer color) {
        AbstractC5504s.h(view, "view");
        C3281a.r(view, H7.t.f8115b, color);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(C3320j view, int index, float borderRadius) {
        AbstractC5504s.h(view, "view");
        C3281a.s(view, (H7.i) H7.i.b().get(index), Float.isNaN(borderRadius) ? null : new C3303t(borderRadius, EnumC3304u.f37832a));
    }

    @B7.a(name = "borderStyle")
    public final void setBorderStyle(C3320j view, String borderStyle) {
        AbstractC5504s.h(view, "view");
        C3281a.t(view, borderStyle != null ? H7.k.f8072a.a(borderStyle) : null);
    }

    @B7.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public final void setBorderWidth(C3320j view, int index, float width) {
        AbstractC5504s.h(view, "view");
        C3281a.u(view, (H7.t) H7.t.b().get(index), Float.valueOf(width));
    }

    @B7.a(defaultBoolean = false, name = "caretHidden")
    public final void setCaretHidden(C3320j view, boolean caretHidden) {
        AbstractC5504s.h(view, "view");
        if (view.getStagedInputType() == 32 && INSTANCE.g()) {
            return;
        }
        view.setCursorVisible(!caretHidden);
    }

    @B7.a(customType = "Color", name = "color")
    public final void setColor(C3320j view, Integer color) {
        AbstractC5504s.h(view, "view");
        if (color != null) {
            view.setTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        ColorStateList colorStateListB = com.facebook.react.views.text.a.b(context);
        if (colorStateListB != null) {
            view.setTextColor(colorStateListB);
            return;
        }
        Context context2 = view.getContext();
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Could not get default text color from View Context: " + (context2 != null ? context2.getClass().getCanonicalName() : "null")));
    }

    @B7.a(defaultBoolean = false, name = "contextMenuHidden")
    public final void setContextMenuHidden(C3320j view, boolean contextMenuHidden) {
        AbstractC5504s.h(view, "view");
        view.setContextMenuHidden(contextMenuHidden);
    }

    @B7.a(customType = "Color", name = "cursorColor")
    public final void setCursorColor(C3320j view, Integer color) {
        AbstractC5504s.h(view, "view");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Drawable textCursorDrawable = view.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (color != null) {
                    AbstractC6346d0.a();
                    textCursorDrawable.setColorFilter(AbstractC6343c0.a(color.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                view.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i10 == 28) {
            return;
        }
        try {
            Field declaredField = view.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(view);
            if (i11 == 0) {
                return;
            }
            Drawable drawableE = AbstractC7194b.e(view.getContext(), i11);
            Drawable drawableMutate = drawableE != null ? drawableE.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @B7.a(defaultBoolean = false, name = "disableFullscreenUI")
    public final void setDisableFullscreenUI(C3320j view, boolean disableFullscreenUI) {
        AbstractC5504s.h(view, "view");
        view.setDisableFullscreenUI(disableFullscreenUI);
    }

    @B7.a(defaultBoolean = true, name = "editable")
    public final void setEditable(C3320j view, boolean editable) {
        AbstractC5504s.h(view, "view");
        view.setEnabled(editable);
    }

    @B7.a(name = "fontFamily")
    public final void setFontFamily(C3320j view, String fontFamily) {
        AbstractC5504s.h(view, "view");
        view.setFontFamily(fontFamily);
    }

    @B7.a(defaultFloat = 14.0f, name = "fontSize")
    public final void setFontSize(C3320j view, float fontSize) {
        AbstractC5504s.h(view, "view");
        view.setFontSize(fontSize);
    }

    @B7.a(name = "fontStyle")
    public final void setFontStyle(C3320j view, String fontStyle) {
        AbstractC5504s.h(view, "view");
        view.setFontStyle(fontStyle);
    }

    @B7.a(name = "fontVariant")
    public final void setFontVariant(C3320j view, ReadableArray fontVariant) {
        AbstractC5504s.h(view, "view");
        view.setFontFeatureSettings(com.facebook.react.views.text.p.c(fontVariant));
    }

    @B7.a(name = "fontWeight")
    public final void setFontWeight(C3320j view, String fontWeight) {
        AbstractC5504s.h(view, "view");
        view.setFontWeight(fontWeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x004c  */
    @B7.a(name = "importantForAutofill")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setImportantForAutofill(com.facebook.react.views.textinput.C3320j r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            if (r4 == 0) goto L4c
            int r0 = r4.hashCode()
            r1 = 3521(0xdc1, float:4.934E-42)
            if (r0 == r1) goto L41
            r1 = 119527(0x1d2e7, float:1.67493E-40)
            if (r0 == r1) goto L36
            r1 = 1723649149(0x66bccc7d, float:4.4578852E23)
            if (r0 == r1) goto L2a
            r1 = 1828836387(0x6d01d423, float:2.5112515E27)
            if (r0 == r1) goto L1f
            goto L4c
        L1f:
            java.lang.String r0 = "yesExcludeDescendants"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L28
            goto L4c
        L28:
            r4 = 4
            goto L4d
        L2a:
            java.lang.String r0 = "noExcludeDescendants"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L33
            goto L4c
        L33:
            r4 = 8
            goto L4d
        L36:
            java.lang.String r0 = "yes"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3f
            goto L4c
        L3f:
            r4 = 1
            goto L4d
        L41:
            java.lang.String r0 = "no"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4a
            goto L4c
        L4a:
            r4 = 2
            goto L4d
        L4c:
            r4 = 0
        L4d:
            r2.setImportantForAutofill(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setImportantForAutofill(com.facebook.react.views.textinput.j, java.lang.String):void");
    }

    @B7.a(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding(C3320j view, boolean includepad) {
        AbstractC5504s.h(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @B7.a(name = "inlineImageLeft")
    public final void setInlineImageLeft(C3320j view, String resource) {
        AbstractC5504s.h(view, "view");
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        view.setCompoundDrawablesWithIntrinsicBounds(N7.c.e(context, resource), 0, 0, 0);
    }

    @B7.a(name = "inlineImagePadding")
    public final void setInlineImagePadding(C3320j view, int padding) {
        AbstractC5504s.h(view, "view");
        view.setCompoundDrawablePadding(padding);
    }

    @B7.a(name = "keyboardType")
    public final void setKeyboardType(C3320j view, String keyboardType) {
        AbstractC5504s.h(view, "view");
        int i10 = 1;
        if (Df.r.B(KEYBOARD_TYPE_NUMERIC, keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (Df.r.B(KEYBOARD_TYPE_NUMBER_PAD, keyboardType, true)) {
            i10 = 2;
        } else if (Df.r.B(KEYBOARD_TYPE_DECIMAL_PAD, keyboardType, true)) {
            i10 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (Df.r.B(KEYBOARD_TYPE_EMAIL_ADDRESS, keyboardType, true)) {
            if (INSTANCE.g()) {
                view.setCursorVisible(false);
            }
            i10 = 33;
        } else if (Df.r.B(KEYBOARD_TYPE_PHONE_PAD, keyboardType, true)) {
            i10 = 3;
        } else if (Df.r.B(KEYBOARD_TYPE_VISIBLE_PASSWORD, keyboardType, true)) {
            i10 = 144;
        } else if (Df.r.B(KEYBOARD_TYPE_URI, keyboardType, true)) {
            i10 = 16;
        }
        Companion companion = INSTANCE;
        companion.h(view, 15, i10);
        companion.e(view);
    }

    @B7.a(defaultFloat = 0.0f, name = "letterSpacing")
    public final void setLetterSpacing(C3320j view, float letterSpacing) {
        AbstractC5504s.h(view, "view");
        view.setLetterSpacingPt(letterSpacing);
    }

    @B7.a(defaultFloat = 0.0f, name = "lineHeight")
    public final void setLineHeight(C3320j view, int lineHeight) {
        AbstractC5504s.h(view, "view");
        view.setLineHeight(lineHeight);
    }

    @B7.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public final void setMaxFontSizeMultiplier(C3320j view, float maxFontSizeMultiplier) {
        AbstractC5504s.h(view, "view");
        view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0046 A[PHI: r1
  0x0046: PHI (r1v10 android.text.InputFilter[]) = (r1v8 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]) binds: [B:74:0x006f, B:51:0x0017, B:59:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @B7.a(name = "maxLength")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setMaxLength(com.facebook.react.views.textinput.C3320j r8, java.lang.Integer r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r8, r0)
            android.text.InputFilter[] r0 = r8.getFilters()
            android.text.InputFilter[] r1 = com.facebook.react.views.textinput.ReactTextInputManager.EMPTY_FILTERS
            r2 = 1
            r3 = 0
            if (r9 != 0) goto L48
            kotlin.jvm.internal.AbstractC5504s.e(r0)
            int r9 = r0.length
            if (r9 != 0) goto L16
            goto L17
        L16:
            r2 = r3
        L17:
            if (r2 != 0) goto L46
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.Iterator r0 = kotlin.jvm.internal.AbstractC5489c.a(r0)
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            android.text.InputFilter r2 = (android.text.InputFilter) r2
            boolean r4 = r2 instanceof android.text.InputFilter.LengthFilter
            if (r4 != 0) goto L22
            r9.add(r2)
            goto L22
        L36:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L46
            android.text.InputFilter[] r0 = new android.text.InputFilter[r3]
            java.lang.Object[] r9 = r9.toArray(r0)
            r0 = r9
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            goto L91
        L46:
            r0 = r1
            goto L91
        L48:
            kotlin.jvm.internal.AbstractC5504s.e(r0)
            int r1 = r0.length
            if (r1 != 0) goto L50
            r1 = r2
            goto L51
        L50:
            r1 = r3
        L51:
            if (r1 != 0) goto L84
            int r1 = r0.length
            r4 = r3
            r5 = r4
        L56:
            if (r4 >= r1) goto L6d
            r6 = r0[r4]
            boolean r6 = r6 instanceof android.text.InputFilter.LengthFilter
            if (r6 == 0) goto L6a
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            int r6 = r9.intValue()
            r5.<init>(r6)
            r0[r4] = r5
            r5 = r2
        L6a:
            int r4 = r4 + 1
            goto L56
        L6d:
            if (r5 != 0) goto L91
            int r1 = r0.length
            int r1 = r1 + r2
            android.text.InputFilter[] r1 = new android.text.InputFilter[r1]
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r2 = r0.length
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            int r9 = r9.intValue()
            r3.<init>(r9)
            r0[r2] = r3
            goto L46
        L84:
            android.text.InputFilter[] r0 = new android.text.InputFilter[r2]
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            int r9 = r9.intValue()
            r1.<init>(r9)
            r0[r3] = r1
        L91:
            r8.setFilters(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setMaxLength(com.facebook.react.views.textinput.j, java.lang.Integer):void");
    }

    @B7.a(defaultBoolean = false, name = "multiline")
    public final void setMultiline(C3320j view, boolean multiline) {
        AbstractC5504s.h(view, "view");
        INSTANCE.h(view, multiline ? 0 : 131072, multiline ? 131072 : 0);
    }

    @B7.a(defaultInt = 1, name = "numberOfLines")
    public final void setNumLines(C3320j view, int numLines) {
        AbstractC5504s.h(view, "view");
        view.setLines(numLines);
    }

    @B7.a(defaultBoolean = false, name = "onContentSizeChange")
    public final void setOnContentSizeChange(C3320j view, boolean onContentSizeChange) {
        AbstractC5504s.h(view, "view");
        if (onContentSizeChange) {
            view.setContentSizeWatcher(new m(view));
        } else {
            view.setContentSizeWatcher(null);
        }
    }

    @B7.a(defaultBoolean = false, name = "onKeyPress")
    public final void setOnKeyPress(C3320j view, boolean onKeyPress) {
        AbstractC5504s.h(view, "view");
        view.setOnKeyPress(onKeyPress);
    }

    @B7.a(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(C3320j view, boolean onScroll) {
        AbstractC5504s.h(view, "view");
        if (onScroll) {
            view.setScrollWatcher(new I(view));
        } else {
            view.setScrollWatcher(null);
        }
    }

    @B7.a(defaultBoolean = false, name = "onSelectionChange")
    public final void setOnSelectionChange(C3320j view, boolean onSelectionChange) {
        AbstractC5504s.h(view, "view");
        if (onSelectionChange) {
            view.setSelectionWatcher$ReactAndroid_release(new J(view));
        } else {
            view.setSelectionWatcher$ReactAndroid_release(null);
        }
    }

    @B7.a(name = "overflow")
    public final void setOverflow(C3320j view, String overflow) {
        AbstractC5504s.h(view, "view");
        view.setOverflow(overflow);
    }

    @B7.a(name = "placeholder")
    public final void setPlaceholder(C3320j view, String placeholder) {
        AbstractC5504s.h(view, "view");
        view.setPlaceholder(placeholder);
    }

    @B7.a(customType = "Color", name = "placeholderTextColor")
    public final void setPlaceholderTextColor(C3320j view, Integer color) {
        AbstractC5504s.h(view, "view");
        if (color != null) {
            view.setHintTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        view.setHintTextColor(com.facebook.react.views.text.a.d(context));
    }

    protected final void setReactTextViewManagerCallback(com.facebook.react.views.text.o oVar) {
        this.reactTextViewManagerCallback = oVar;
    }

    @B7.a(name = "returnKeyLabel")
    public final void setReturnKeyLabel(C3320j view, String returnKeyLabel) {
        AbstractC5504s.h(view, "view");
        view.setImeActionLabel(returnKeyLabel, IME_ACTION_ID);
    }

    @B7.a(name = "returnKeyType")
    public final void setReturnKeyType(C3320j view, String returnKeyType) {
        AbstractC5504s.h(view, "view");
        view.setReturnKeyType(returnKeyType);
    }

    @B7.a(defaultBoolean = false, name = "secureTextEntry")
    public final void setSecureTextEntry(C3320j view, boolean password) {
        AbstractC5504s.h(view, "view");
        Companion companion = INSTANCE;
        companion.h(view, 144, password ? 128 : 0);
        companion.e(view);
    }

    @B7.a(defaultBoolean = false, name = "selectTextOnFocus")
    public final void setSelectTextOnFocus(C3320j view, boolean selectTextOnFocus) {
        AbstractC5504s.h(view, "view");
        view.setSelectTextOnFocus(selectTextOnFocus);
    }

    @B7.a(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(C3320j view, Integer color) {
        AbstractC5504s.h(view, "view");
        if (color != null) {
            view.setHighlightColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        view.setHighlightColor(com.facebook.react.views.text.a.c(context));
    }

    @B7.a(customType = "Color", name = "selectionHandleColor")
    public final void setSelectionHandleColor(C3320j view, Integer color) {
        int i10;
        AbstractC5504s.h(view, "view");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable textSelectHandle = view.getTextSelectHandle();
            Drawable drawableMutate = textSelectHandle != null ? textSelectHandle.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleLeft = view.getTextSelectHandleLeft();
            Drawable drawableMutate2 = textSelectHandleLeft != null ? textSelectHandleLeft.mutate() : null;
            if (drawableMutate2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleRight = view.getTextSelectHandleRight();
            Drawable drawableMutate3 = textSelectHandleRight != null ? textSelectHandleRight.mutate() : null;
            if (drawableMutate3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                AbstractC6346d0.a();
                BlendModeColorFilter blendModeColorFilterA = AbstractC6343c0.a(color.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterA);
                drawableMutate2.setColorFilter(blendModeColorFilterA);
                drawableMutate3.setColorFilter(blendModeColorFilterA);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            view.setTextSelectHandle(drawableMutate);
            view.setTextSelectHandleLeft(drawableMutate2);
            view.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int length = DRAWABLE_HANDLE_RESOURCES.length;
        for (int i12 = 0; i12 < length; i12++) {
            try {
                Field declaredField = view.getClass().getDeclaredField(DRAWABLE_HANDLE_RESOURCES[i12]);
                declaredField.setAccessible(true);
                i10 = declaredField.getInt(view);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i10 == 0) {
                return;
            }
            Drawable drawableE = AbstractC7194b.e(view.getContext(), i10);
            Drawable drawableMutate4 = drawableE != null ? drawableE.mutate() : null;
            if (drawableMutate4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate4.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableMutate4);
        }
    }

    @B7.a(name = "submitBehavior")
    public final void setSubmitBehavior(C3320j view, String submitBehavior) {
        AbstractC5504s.h(view, "view");
        view.setSubmitBehavior(submitBehavior);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004f, code lost:
    
        if (r7.equals("auto") == false) goto L68;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @B7.a(name = "textAlign")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlign(com.facebook.react.views.textinput.C3320j r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r6, r0)
            java.lang.String r0 = "justify"
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r7)
            r1 = 3
            r2 = 1
            r3 = 26
            if (r0 == 0) goto L1c
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L18
            com.facebook.react.views.textinput.y.a(r6, r2)
        L18:
            r6.setGravityHorizontal$ReactAndroid_release(r1)
            return
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            if (r0 < r3) goto L24
            com.facebook.react.views.textinput.y.a(r6, r4)
        L24:
            if (r7 == 0) goto L78
            int r0 = r7.hashCode()
            switch(r0) {
                case -1364013995: goto L52;
                case 3005871: goto L49;
                case 3317767: goto L3c;
                case 108511772: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L5a
        L2e:
            java.lang.String r0 = "right"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L37
            goto L5a
        L37:
            r7 = 5
            r6.setGravityHorizontal$ReactAndroid_release(r7)
            return
        L3c:
            java.lang.String r0 = "left"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L45
            goto L5a
        L45:
            r6.setGravityHorizontal$ReactAndroid_release(r1)
            return
        L49:
            java.lang.String r0 = "auto"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L78
            goto L5a
        L52:
            java.lang.String r0 = "center"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L74
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid textAlign: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ReactNative"
            z5.AbstractC7283a.I(r0, r7)
            r6.setGravityHorizontal$ReactAndroid_release(r4)
            return
        L74:
            r6.setGravityHorizontal$ReactAndroid_release(r2)
            return
        L78:
            r6.setGravityHorizontal$ReactAndroid_release(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlign(com.facebook.react.views.textinput.j, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0016, code lost:
    
        if (r5.equals("auto") == false) goto L50;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @B7.a(name = "textAlignVertical")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlignVertical(com.facebook.react.views.textinput.C3320j r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            r0 = 0
            if (r5 == 0) goto L5f
            int r1 = r5.hashCode()
            switch(r1) {
                case -1383228885: goto L37;
                case -1364013995: goto L28;
                case 115029: goto L19;
                case 3005871: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            java.lang.String r1 = "auto"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L5f
            goto L3f
        L19:
            java.lang.String r1 = "top"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L22
            goto L3f
        L22:
            r5 = 48
            r4.setGravityVertical$ReactAndroid_release(r5)
            return
        L28:
            java.lang.String r1 = "center"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto L3f
        L31:
            r5 = 16
            r4.setGravityVertical$ReactAndroid_release(r5)
            return
        L37:
            java.lang.String r1 = "bottom"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L59
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid textAlignVertical: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r5)
            r4.setGravityVertical$ReactAndroid_release(r0)
            return
        L59:
            r5 = 80
            r4.setGravityVertical$ReactAndroid_release(r5)
            return
        L5f:
            r4.setGravityVertical$ReactAndroid_release(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlignVertical(com.facebook.react.views.textinput.j, java.lang.String):void");
    }

    @B7.a(name = "autoComplete")
    public final void setTextContentType(C3320j view, String autoComplete) {
        AbstractC5504s.h(view, "view");
        if (autoComplete == null) {
            setImportantForAutofill(view, 2);
            return;
        }
        if (AbstractC5504s.c("off", autoComplete)) {
            setImportantForAutofill(view, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (!map.containsKey(autoComplete)) {
            AbstractC7283a.I("ReactNative", "Invalid autoComplete: " + autoComplete);
            setImportantForAutofill(view, 2);
            return;
        }
        String[] strArr = new String[1];
        String str = map.get(autoComplete);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        strArr[0] = str;
        setAutofillHints(view, strArr);
    }

    @B7.a(name = "textDecorationLine")
    public final void setTextDecorationLine(C3320j view, String textDecorationLineString) {
        List listM;
        AbstractC5504s.h(view, "view");
        view.setPaintFlags(view.getPaintFlags() & (-25));
        if (textDecorationLineString == null) {
            return;
        }
        List listL = new Df.p(" ").l(textDecorationLineString, 0);
        if (listL.isEmpty()) {
            listM = AbstractC2279u.m();
        } else {
            ListIterator listIterator = listL.listIterator(listL.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM = AbstractC2279u.T0(listL, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM = AbstractC2279u.m();
        }
        for (String str : (String[]) listM.toArray(new String[0])) {
            if (AbstractC5504s.c(str, "underline")) {
                view.setPaintFlags(view.getPaintFlags() | 8);
            } else if (AbstractC5504s.c(str, "line-through")) {
                view.setPaintFlags(view.getPaintFlags() | 16);
            }
        }
    }

    @B7.a(customType = "Color", name = "underlineColorAndroid")
    public final void setUnderlineColor(C3320j view, Integer underlineColor) {
        AbstractC5504s.h(view, "view");
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                Drawable drawableMutate = background.mutate();
                if (drawableMutate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                background = drawableMutate;
            } catch (NullPointerException e10) {
                AbstractC7283a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (underlineColor == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(underlineColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @B7.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public final void showKeyboardOnFocus(C3320j view, boolean showKeyboardOnFocus) {
        AbstractC5504s.h(view, "view");
        view.setShowSoftInputOnFocus(showKeyboardOnFocus);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final C3284b0 reactContext, final C3320j editText) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(editText, "editText");
        editText.setEventDispatcher(INSTANCE.f(reactContext, editText));
        editText.addTextChangedListener(new H(reactContext, editText));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.C
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ReactTextInputManager.addEventEmitters$lambda$2(reactContext, editText, view, z10);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.D
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return ReactTextInputManager.addEventEmitters$lambda$3(editText, reactContext, textView, i10, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.d createShadowNodeInstance() {
        return new F(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C3320j createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        C3320j c3320j = new C3320j(context);
        c3320j.setInputType(c3320j.getInputType() & (-131073));
        c3320j.setReturnKeyType("done");
        c3320j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return c3320j;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C3320j view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.L();
        view.z();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C3320j view, int left, int top, int right, int bottom) {
        AbstractC5504s.h(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C3320j view, Object extraData) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(extraData, "extraData");
        if (extraData instanceof com.facebook.react.views.text.i) {
            com.facebook.react.views.text.i iVar = (com.facebook.react.views.text.i) extraData;
            int iE = (int) iVar.e();
            int iG = (int) iVar.g();
            int iF = (int) iVar.f();
            int iD = (int) iVar.d();
            int length = -1;
            if (iE != -1 || iG != -1 || iF != -1 || iD != -1) {
                if (iE == -1) {
                    iE = view.getPaddingLeft();
                }
                if (iG == -1) {
                    iG = view.getPaddingTop();
                }
                if (iF == -1) {
                    iF = view.getPaddingRight();
                }
                if (iD == -1) {
                    iD = view.getPaddingBottom();
                }
                view.setPadding(iE, iG, iF, iD);
            }
            if (iVar.a()) {
                P7.r.f13545a.a(iVar.h(), view);
            }
            if (view.getSelectionStart() == view.getSelectionEnd()) {
                Editable text = view.getText();
                length = iVar.h().length() - ((text != null ? text.length() : 0) - view.getSelectionStart());
            }
            view.K(iVar);
            view.H(iVar.b(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C3320j view, Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(stateWrapper, "stateWrapper");
        if (C3320j.f38412r0.b()) {
            AbstractC7283a.m(TAG, "updateState: [" + view.getId() + "]");
        }
        if (view.getStateWrapper() == null) {
            view.setPadding(0, 0, 0, 0);
        }
        view.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(view, props, stateDataMapBuffer);
        }
        return null;
    }

    private final void setImportantForAutofill(C3320j view, int mode) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setImportantForAutofill(mode);
    }

    public final com.facebook.react.views.text.d createShadowNodeInstance(com.facebook.react.views.text.o reactTextViewManagerCallback) {
        return new F(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @InterfaceC2154e
    public void receiveCommand(C3320j reactEditText, int commandId, ReadableArray args) {
        AbstractC5504s.h(reactEditText, "reactEditText");
        if (commandId == 1) {
            receiveCommand(reactEditText, "focus", args);
        } else if (commandId == 2) {
            receiveCommand(reactEditText, "blur", args);
        } else {
            if (commandId != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", args);
        }
    }

    public final Object getReactTextUpdate(C3320j view, Q props, com.facebook.react.common.mapbuffer.a state) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(state, "state");
        if (state.getCount() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarF0 = state.F0(0);
        com.facebook.react.common.mapbuffer.a aVarF02 = state.F0(1);
        com.facebook.react.views.text.s sVar = com.facebook.react.views.text.s.f38347a;
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        Spannable spannableM = sVar.m(context, aVarF0, this.reactTextViewManagerCallback);
        q.a aVar = com.facebook.react.views.text.q.f38309C;
        return com.facebook.react.views.text.i.f38276k.a(spannableM, state.getInt(3), aVar.f(props, sVar.t(aVarF0), view.getGravityHorizontal$ReactAndroid_release()), aVar.g(aVarF02.getString(2)), aVar.d(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C3320j reactEditText, String commandId, ReadableArray args) {
        AbstractC5504s.h(reactEditText, "reactEditText");
        AbstractC5504s.h(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1699362314:
                if (!commandId.equals("blurTextInput")) {
                    return;
                }
                break;
            case 3027047:
                if (!commandId.equals("blur")) {
                    return;
                }
                break;
            case 97604824:
                if (!commandId.equals("focus")) {
                    return;
                }
                reactEditText.N();
                return;
            case 1427010500:
                if (commandId.equals("setTextAndSelection")) {
                    if (args != null) {
                        int i10 = args.getInt(0);
                        if (i10 == -1) {
                            return;
                        }
                        int i11 = args.getInt(2);
                        int i12 = args.getInt(3);
                        if (i12 == -1) {
                            i12 = i11;
                        }
                        if (!args.isNull(1)) {
                            reactEditText.J(getReactTextUpdate(args.getString(1), i10));
                        }
                        reactEditText.H(i10, i11, i12);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            case 1690703013:
                if (!commandId.equals("focusTextInput")) {
                    return;
                }
                reactEditText.N();
                return;
            default:
                return;
        }
        reactEditText.y();
    }
}
