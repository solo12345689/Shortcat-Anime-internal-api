.class public final Lz7/r;
.super Lcom/facebook/react/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/Y;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lz7/a;)V
    .locals 18

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/facebook/react/bridge/ModuleSpec;->Companion:Lcom/facebook/react/bridge/ModuleSpec$Companion;

    .line 5
    .line 6
    new-instance v1, Lz7/i;

    .line 7
    .line 8
    invoke-direct {v1}, Lz7/i;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "AndroidDrawerLayout"

    .line 16
    .line 17
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v1, Lz7/o;

    .line 22
    .line 23
    invoke-direct {v1}, Lz7/o;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "AndroidHorizontalScrollView"

    .line 31
    .line 32
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v1, Lz7/p;

    .line 37
    .line 38
    invoke-direct {v1}, Lz7/p;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "AndroidHorizontalScrollContentView"

    .line 46
    .line 47
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    new-instance v1, Lz7/q;

    .line 52
    .line 53
    invoke-direct {v1}, Lz7/q;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "AndroidProgressBar"

    .line 61
    .line 62
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    new-instance v1, Lz7/c;

    .line 67
    .line 68
    invoke-direct {v1}, Lz7/c;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "RCTSafeAreaView"

    .line 76
    .line 77
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    new-instance v1, Lz7/d;

    .line 82
    .line 83
    invoke-direct {v1}, Lz7/d;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "RCTScrollView"

    .line 91
    .line 92
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    new-instance v1, Lz7/e;

    .line 97
    .line 98
    invoke-direct {v1}, Lz7/e;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v2, "AndroidSwitch"

    .line 106
    .line 107
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    new-instance v1, Lz7/f;

    .line 112
    .line 113
    invoke-direct {v1}, Lz7/f;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v2, "AndroidSwipeRefreshLayout"

    .line 121
    .line 122
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    new-instance v1, Lz7/g;

    .line 127
    .line 128
    invoke-direct {v1}, Lz7/g;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "RCTTextInlineImage"

    .line 136
    .line 137
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    new-instance v1, Lz7/h;

    .line 142
    .line 143
    invoke-direct {v1}, Lz7/h;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const-string v2, "RCTImageView"

    .line 151
    .line 152
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    new-instance v1, Lz7/j;

    .line 157
    .line 158
    invoke-direct {v1}, Lz7/j;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v2, "RCTModalHostView"

    .line 166
    .line 167
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    new-instance v1, Lz7/k;

    .line 172
    .line 173
    invoke-direct {v1}, Lz7/k;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "AndroidTextInput"

    .line 181
    .line 182
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    new-instance v1, Lz7/l;

    .line 187
    .line 188
    invoke-direct {v1}, Lz7/l;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const-string v2, "RCTText"

    .line 196
    .line 197
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    new-instance v1, Lz7/m;

    .line 202
    .line 203
    invoke-direct {v1}, Lz7/m;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v2, "RCTView"

    .line 211
    .line 212
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    new-instance v1, Lz7/n;

    .line 217
    .line 218
    invoke-direct {v1}, Lz7/n;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ModuleSpec$Companion;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const-string v1, "UnimplementedNativeView"

    .line 226
    .line 227
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 228
    .line 229
    .line 230
    move-result-object v17

    .line 231
    filled-new-array/range {v3 .. v17}, [Lkotlin/Pair;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move-object/from16 v1, p0

    .line 240
    .line 241
    iput-object v0, v1, Lz7/r;->a:Ljava/util/Map;

    .line 242
    .line 243
    return-void
.end method

.method private static final A()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final B()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final C()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final D()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final E()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final F()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2, v1}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>(LS5/b;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final G()Lcom/facebook/react/bridge/NativeModule;
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/views/image/ReactImageManager;

    .line 2
    .line 3
    const/4 v4, 0x7

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic a()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->G()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->w()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->z()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->C()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic e()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->u()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->s()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->t()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic h()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->y()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic i()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->D()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic j()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->A()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lz7/r;->r(Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->E()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic m()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->v()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic n()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->F()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic o()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->B()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic p()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    invoke-static {}, Lz7/r;->x()Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final q()Ll7/a;
    .locals 25

    .line 1
    invoke-static {}, Lh7/b;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    move-object v14, v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-class v0, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :goto_1
    const-class v23, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 14
    .line 15
    const-class v24, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 16
    .line 17
    const-class v1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 18
    .line 19
    const-class v2, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 20
    .line 21
    const-class v3, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 22
    .line 23
    const-class v4, Lcom/facebook/react/modules/blob/BlobModule;

    .line 24
    .line 25
    const-class v5, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 26
    .line 27
    const-class v6, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 28
    .line 29
    const-class v7, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 30
    .line 31
    const-class v8, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 32
    .line 33
    const-class v9, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 34
    .line 35
    const-class v10, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 36
    .line 37
    const-class v11, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 38
    .line 39
    const-class v12, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 40
    .line 41
    const-class v13, Lcom/facebook/react/modules/intent/IntentModule;

    .line 42
    .line 43
    const-class v15, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 44
    .line 45
    const-class v16, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 46
    .line 47
    const-class v17, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 48
    .line 49
    const-class v18, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 50
    .line 51
    const-class v19, Lcom/facebook/react/modules/share/ShareModule;

    .line 52
    .line 53
    const-class v20, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 54
    .line 55
    const-class v21, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 56
    .line 57
    const-class v22, Lcom/facebook/react/modules/toast/ToastModule;

    .line 58
    .line 59
    filled-new-array/range {v1 .. v24}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LUd/n;->U([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    new-array v2, v1, [Ljava/lang/Class;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, [Ljava/lang/Class;

    .line 75
    .line 76
    new-instance v2, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    array-length v3, v0

    .line 82
    :goto_2
    const-class v4, Lk7/a;

    .line 83
    .line 84
    if-ge v1, v3, :cond_2

    .line 85
    .line 86
    aget-object v5, v0, v1

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/16 v0, 0xa

    .line 101
    .line 102
    invoke-static {v2, v0}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, LUd/S;->e(I)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/16 v1, 0x10

    .line 111
    .line 112
    invoke-static {v0, v1}, Loe/j;->e(II)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    check-cast v3, Lk7/a;

    .line 144
    .line 145
    invoke-interface {v3}, Lk7/a;->name()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    new-instance v6, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 150
    .line 151
    invoke-interface {v3}, Lk7/a;->name()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const-string v9, "getName(...)"

    .line 160
    .line 161
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Lk7/a;->canOverrideExistingModule()Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    invoke-interface {v3}, Lk7/a;->needsEagerInit()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-interface {v3}, Lk7/a;->isCxxModule()Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    sget-object v3, Lcom/facebook/react/module/model/ReactModuleInfo;->g:Lcom/facebook/react/module/model/ReactModuleInfo$a;

    .line 177
    .line 178
    invoke-virtual {v3, v2}, Lcom/facebook/react/module/model/ReactModuleInfo$a;->a(Ljava/lang/Class;)Z

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 183
    .line 184
    .line 185
    invoke-static {v5, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v1, "Required value was null."

    .line 204
    .line 205
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_4
    new-instance v0, Lz7/b;

    .line 210
    .line 211
    invoke-direct {v0, v1}, Lz7/b;-><init>(Ljava/util/Map;)V

    .line 212
    .line 213
    .line 214
    return-object v0
.end method

.method private static final r(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static final s()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final t()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private static final u()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final v()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final w()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .line 1
    invoke-static {}, Lh7/b;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;

    .line 10
    .line 11
    invoke-direct {v0, v2, v1, v2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 16
    .line 17
    invoke-direct {v0, v2, v1, v2}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private static final x()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/view/ReactViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final y()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final z()Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "viewManagerName"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lz7/r;->a:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->provider()Ljavax/inject/Provider;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/facebook/react/bridge/NativeModule;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, p2

    .line 36
    :goto_0
    instance-of v0, p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    return-object p2
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 18

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, v2, v3, v2}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;

    .line 21
    .line 22
    invoke-direct {v4}, Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;

    .line 26
    .line 27
    invoke-direct {v5}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v6, Lcom/facebook/react/views/scroll/ReactScrollViewManager;

    .line 31
    .line 32
    invoke-direct {v6, v2, v3, v2}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>(Lcom/facebook/react/views/scroll/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    new-instance v7, Lcom/facebook/react/views/switchview/ReactSwitchManager;

    .line 36
    .line 37
    invoke-direct {v7}, Lcom/facebook/react/views/switchview/ReactSwitchManager;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v8, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;

    .line 41
    .line 42
    invoke-direct {v8}, Lcom/facebook/react/views/safeareaview/ReactSafeAreaViewManager;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v9, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;

    .line 46
    .line 47
    invoke-direct {v9}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v10, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;

    .line 51
    .line 52
    const/4 v11, 0x3

    .line 53
    invoke-direct {v10, v2, v2, v11, v2}, Lcom/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager;-><init>(LS5/b;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    new-instance v12, Lcom/facebook/react/views/image/ReactImageManager;

    .line 57
    .line 58
    const/16 v16, 0x7

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    invoke-direct/range {v12 .. v17}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(LS5/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    new-instance v13, Lcom/facebook/react/views/modal/ReactModalHostManager;

    .line 69
    .line 70
    invoke-direct {v13}, Lcom/facebook/react/views/modal/ReactModalHostManager;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v14, Lcom/facebook/react/views/textinput/ReactTextInputManager;

    .line 74
    .line 75
    invoke-direct {v14}, Lcom/facebook/react/views/textinput/ReactTextInputManager;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lh7/b;->s()Z

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    if-eqz v15, :cond_0

    .line 83
    .line 84
    new-instance v15, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;

    .line 85
    .line 86
    invoke-direct {v15, v2, v3, v2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    new-instance v15, Lcom/facebook/react/views/text/ReactTextViewManager;

    .line 91
    .line 92
    invoke-direct {v15, v2, v3, v2}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    new-instance v2, Lcom/facebook/react/views/view/ReactViewManager;

    .line 96
    .line 97
    invoke-direct {v2}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v16, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;

    .line 101
    .line 102
    invoke-direct/range {v16 .. v16}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;-><init>()V

    .line 103
    .line 104
    .line 105
    move/from16 p1, v3

    .line 106
    .line 107
    const/16 v3, 0xf

    .line 108
    .line 109
    new-array v3, v3, [Lcom/facebook/react/uimanager/BaseViewManager;

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    aput-object v0, v3, v17

    .line 114
    .line 115
    aput-object v1, v3, p1

    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    aput-object v4, v3, v0

    .line 119
    .line 120
    aput-object v5, v3, v11

    .line 121
    .line 122
    const/4 v0, 0x4

    .line 123
    aput-object v6, v3, v0

    .line 124
    .line 125
    const/4 v0, 0x5

    .line 126
    aput-object v7, v3, v0

    .line 127
    .line 128
    const/4 v0, 0x6

    .line 129
    aput-object v8, v3, v0

    .line 130
    .line 131
    const/4 v0, 0x7

    .line 132
    aput-object v9, v3, v0

    .line 133
    .line 134
    const/16 v0, 0x8

    .line 135
    .line 136
    aput-object v10, v3, v0

    .line 137
    .line 138
    const/16 v0, 0x9

    .line 139
    .line 140
    aput-object v12, v3, v0

    .line 141
    .line 142
    const/16 v0, 0xa

    .line 143
    .line 144
    aput-object v13, v3, v0

    .line 145
    .line 146
    const/16 v0, 0xb

    .line 147
    .line 148
    aput-object v14, v3, v0

    .line 149
    .line 150
    const/16 v0, 0xc

    .line 151
    .line 152
    aput-object v15, v3, v0

    .line 153
    .line 154
    const/16 v0, 0xd

    .line 155
    .line 156
    aput-object v2, v3, v0

    .line 157
    .line 158
    const/16 v0, 0xe

    .line 159
    .line 160
    aput-object v16, v3, v0

    .line 161
    .line 162
    invoke-static {v3}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "AccessibilityInfo"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string v0, "Appearance"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    new-instance p1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-direct {p1, p2, v1, v0, v1}, Lcom/facebook/react/modules/appearance/AppearanceModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/appearance/AppearanceModule$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    const-string v0, "AppState"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance p1, Lcom/facebook/react/modules/appstate/AppStateModule;

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/appstate/AppStateModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    const-string v0, "BlobModule"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    new-instance p1, Lcom/facebook/react/modules/blob/BlobModule;

    .line 64
    .line 65
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/BlobModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    const-string v0, "DevLoadingView"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    new-instance p1, Lcom/facebook/react/modules/devloading/DevLoadingModule;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devloading/DevLoadingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    sget-object v0, Lcom/facebook/react/modules/blob/FileReaderModule;->Companion:Lcom/facebook/react/modules/blob/FileReaderModule$a;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/facebook/react/modules/blob/FileReaderModule$a;->a()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    new-instance p1, Lcom/facebook/react/modules/blob/FileReaderModule;

    .line 96
    .line 97
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/blob/FileReaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_5
    const-string v0, "Clipboard"

    .line 102
    .line 103
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    new-instance p1, Lcom/facebook/react/modules/clipboard/ClipboardModule;

    .line 110
    .line 111
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/clipboard/ClipboardModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_6
    const-string v0, "DialogManagerAndroid"

    .line 116
    .line 117
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    new-instance p1, Lcom/facebook/react/modules/dialog/DialogModule;

    .line 124
    .line 125
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_7
    const-string v0, "FrescoModule"

    .line 130
    .line 131
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    new-instance p1, Lcom/facebook/react/modules/fresco/FrescoModule;

    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    invoke-direct {p1, p2, v0, v1}, Lcom/facebook/react/modules/fresco/FrescoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ZLz6/u;)V

    .line 141
    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_8
    const-string v0, "I18nManager"

    .line 145
    .line 146
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    new-instance p1, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;

    .line 153
    .line 154
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 155
    .line 156
    .line 157
    return-object p1

    .line 158
    :cond_9
    const-string v0, "ImageLoader"

    .line 159
    .line 160
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    new-instance p1, Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 167
    .line 168
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/image/ImageLoaderModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :cond_a
    const-string v0, "ImageStoreManager"

    .line 173
    .line 174
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_b

    .line 179
    .line 180
    new-instance p1, Lcom/facebook/react/modules/camera/ImageStoreManager;

    .line 181
    .line 182
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/camera/ImageStoreManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 183
    .line 184
    .line 185
    return-object p1

    .line 186
    :cond_b
    const-string v0, "IntentAndroid"

    .line 187
    .line 188
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_c

    .line 193
    .line 194
    new-instance p1, Lcom/facebook/react/modules/intent/IntentModule;

    .line 195
    .line 196
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/intent/IntentModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 197
    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_c
    const-string v0, "NativeAnimatedModule"

    .line 201
    .line 202
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_e

    .line 207
    .line 208
    invoke-static {}, Lh7/b;->c()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eqz p1, :cond_d

    .line 213
    .line 214
    return-object v1

    .line 215
    :cond_d
    new-instance p1, Lcom/facebook/react/animated/NativeAnimatedModule;

    .line 216
    .line 217
    invoke-direct {p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 218
    .line 219
    .line 220
    return-object p1

    .line 221
    :cond_e
    const-string v0, "Networking"

    .line 222
    .line 223
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_f

    .line 228
    .line 229
    new-instance p1, Lcom/facebook/react/modules/network/NetworkingModule;

    .line 230
    .line 231
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 232
    .line 233
    .line 234
    return-object p1

    .line 235
    :cond_f
    const-string v0, "PermissionsAndroid"

    .line 236
    .line 237
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_10

    .line 242
    .line 243
    new-instance p1, Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 244
    .line 245
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/permissions/PermissionsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 246
    .line 247
    .line 248
    return-object p1

    .line 249
    :cond_10
    const-string v0, "ShareModule"

    .line 250
    .line 251
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_11

    .line 256
    .line 257
    new-instance p1, Lcom/facebook/react/modules/share/ShareModule;

    .line 258
    .line 259
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/share/ShareModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 260
    .line 261
    .line 262
    return-object p1

    .line 263
    :cond_11
    const-string v0, "StatusBarManager"

    .line 264
    .line 265
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_12

    .line 270
    .line 271
    new-instance p1, Lcom/facebook/react/modules/statusbar/StatusBarModule;

    .line 272
    .line 273
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/statusbar/StatusBarModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 274
    .line 275
    .line 276
    return-object p1

    .line 277
    :cond_12
    const-string v0, "SoundManager"

    .line 278
    .line 279
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_13

    .line 284
    .line 285
    new-instance p1, Lcom/facebook/react/modules/sound/SoundManagerModule;

    .line 286
    .line 287
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/sound/SoundManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 288
    .line 289
    .line 290
    return-object p1

    .line 291
    :cond_13
    const-string v0, "ToastAndroid"

    .line 292
    .line 293
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_14

    .line 298
    .line 299
    new-instance p1, Lcom/facebook/react/modules/toast/ToastModule;

    .line 300
    .line 301
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 302
    .line 303
    .line 304
    return-object p1

    .line 305
    :cond_14
    const-string v0, "Vibration"

    .line 306
    .line 307
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_15

    .line 312
    .line 313
    new-instance p1, Lcom/facebook/react/modules/vibration/VibrationModule;

    .line 314
    .line 315
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/vibration/VibrationModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 316
    .line 317
    .line 318
    return-object p1

    .line 319
    :cond_15
    const-string v0, "WebSocketModule"

    .line 320
    .line 321
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_16

    .line 326
    .line 327
    new-instance p1, Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 328
    .line 329
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 330
    .line 331
    .line 332
    return-object p1

    .line 333
    :cond_16
    const-string v0, "ReactDevToolsSettingsManager"

    .line 334
    .line 335
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_17

    .line 340
    .line 341
    new-instance p1, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;

    .line 342
    .line 343
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 344
    .line 345
    .line 346
    return-object p1

    .line 347
    :cond_17
    const-string v0, "ReactDevToolsRuntimeSettingsModule"

    .line 348
    .line 349
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    if-eqz p1, :cond_18

    .line 354
    .line 355
    new-instance p1, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;

    .line 356
    .line 357
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 358
    .line 359
    .line 360
    return-object p1

    .line 361
    :cond_18
    return-object v1
.end method

.method public getReactModuleInfoProvider()Ll7/a;
    .locals 4

    .line 1
    const-string v0, "No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    invoke-static {}, LU6/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lz7/r;->q()Ll7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider"

    .line 15
    .line 16
    invoke-static {v1}, LU6/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :catch_1
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    :goto_0
    instance-of v3, v1, Ll7/a;

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Ll7/a;

    .line 39
    .line 40
    :cond_2
    if-nez v2, :cond_3

    .line 41
    .line 42
    invoke-direct {p0}, Lz7/r;->q()Ll7/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object v0

    .line 47
    :cond_3
    return-object v2

    .line 48
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 49
    .line 50
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v2

    .line 54
    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :catch_2
    invoke-direct {p0}, Lz7/r;->q()Ll7/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz7/r;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/Collection;

    .line 13
    .line 14
    return-object p1
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz7/r;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-static {p1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
