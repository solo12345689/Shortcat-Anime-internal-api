.class final Landroidx/compose/ui/platform/j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/h0;


# static fields
.field public static final b:Landroidx/compose/ui/platform/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/j0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/platform/j0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/platform/j0;->b:Landroidx/compose/ui/platform/j0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    const-class v2, Landroid/content/res/Configuration;

    .line 15
    .line 16
    const-string v3, "windowConfiguration"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 31
    .line 32
    .line 33
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    const-string v3, "null cannot be cast to non-null type android.graphics.Rect"

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v5, "getBounds"

    .line 44
    .line 45
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v1, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v5, "getAppBounds"

    .line 69
    .line 70
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast v1, Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :goto_0
    instance-of v2, v1, Ljava/lang/NoSuchFieldException;

    .line 88
    .line 89
    if-nez v2, :cond_2

    .line 90
    .line 91
    instance-of v2, v1, Ljava/lang/NoSuchMethodException;

    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    instance-of v2, v1, Ljava/lang/IllegalAccessException;

    .line 96
    .line 97
    if-nez v2, :cond_2

    .line 98
    .line 99
    instance-of v2, v1, Ljava/lang/reflect/InvocationTargetException;

    .line 100
    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    throw v1

    .line 105
    :cond_2
    :goto_1
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/d0;->c(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v2, Landroid/graphics/Point;

    .line 117
    .line 118
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    const/4 v4, 0x0

    .line 129
    if-nez v3, :cond_5

    .line 130
    .line 131
    invoke-static {p1}, Landroidx/compose/ui/platform/d0;->b(Landroid/content/Context;)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 136
    .line 137
    add-int v6, v5, v3

    .line 138
    .line 139
    iget v7, v2, Landroid/graphics/Point;->y:I

    .line 140
    .line 141
    if-ne v6, v7, :cond_3

    .line 142
    .line 143
    add-int/2addr v5, v3

    .line 144
    iput v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_3
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 148
    .line 149
    add-int v6, v5, v3

    .line 150
    .line 151
    iget v7, v2, Landroid/graphics/Point;->x:I

    .line 152
    .line 153
    if-ne v6, v7, :cond_4

    .line 154
    .line 155
    add-int/2addr v5, v3

    .line 156
    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 160
    .line 161
    if-ne v5, v3, :cond_5

    .line 162
    .line 163
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 164
    .line 165
    :cond_5
    :goto_3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    iget v5, v2, Landroid/graphics/Point;->x:I

    .line 170
    .line 171
    if-lt v3, v5, :cond_6

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    iget v5, v2, Landroid/graphics/Point;->y:I

    .line 178
    .line 179
    if-ge v3, v5, :cond_a

    .line 180
    .line 181
    :cond_6
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_a

    .line 186
    .line 187
    invoke-static {v1}, Landroidx/compose/ui/platform/d0;->a(Landroid/view/Display;)Landroid/view/DisplayCutout;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-eqz p1, :cond_a

    .line 192
    .line 193
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-ne v1, v3, :cond_7

    .line 200
    .line 201
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 202
    .line 203
    :cond_7
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 204
    .line 205
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 206
    .line 207
    sub-int/2addr v1, v3

    .line 208
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-ne v1, v3, :cond_8

    .line 213
    .line 214
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    add-int/2addr v1, v3

    .line 221
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 222
    .line 223
    :cond_8
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-ne v1, v3, :cond_9

    .line 230
    .line 231
    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 232
    .line 233
    :cond_9
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 234
    .line 235
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 236
    .line 237
    sub-int/2addr v1, v2

    .line 238
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-ne v1, v2, :cond_a

    .line 243
    .line 244
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 245
    .line 246
    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    add-int/2addr v1, p1

    .line 251
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 252
    .line 253
    :cond_a
    return-object v0
.end method
