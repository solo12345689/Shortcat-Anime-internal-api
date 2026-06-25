.class public final Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lsb/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;->b(Landroid/content/Context;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 11

    .line 1
    const-class p2, Lcom/facebook/react/views/view/WindowUtilKt;

    .line 2
    .line 3
    const-string v0, "isEdgeToEdgeFeatureFlagOn"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    sget-object v4, LTd/u;->b:LTd/u$a;

    .line 9
    .line 10
    sget v4, Lcom/facebook/react/views/view/WindowUtilKt;->a:I

    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-array v5, v3, [Ljava/lang/Class;

    .line 18
    .line 19
    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, [Ljava/lang/Class;

    .line 24
    .line 25
    new-instance v5, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-array v6, v3, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    array-length v6, v4

    .line 37
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, [Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {p2, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 48
    .line 49
    .line 50
    array-length v6, v5

    .line 51
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 60
    .line 61
    if-nez v5, :cond_0

    .line 62
    .line 63
    move-object v4, v2

    .line 64
    :cond_0
    check-cast v4, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {v4}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v4

    .line 72
    sget-object v5, LTd/u;->b:LTd/u$a;

    .line 73
    .line 74
    invoke-static {v4}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    :goto_0
    invoke-static {v4}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const-string v6, "\' on "

    .line 87
    .line 88
    const-string v7, "Failed to invoke \'"

    .line 89
    .line 90
    const-string v8, "EdgeToEdgePackage"

    .line 91
    .line 92
    const-string v9, "com.facebook.react.views.view.WindowUtilKt"

    .line 93
    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    new-instance v10, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v8, v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    :cond_1
    invoke-static {v4}, LTd/u;->g(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    move-object v4, v2

    .line 127
    :cond_2
    check-cast v4, Ljava/lang/Boolean;

    .line 128
    .line 129
    if-eqz v4, :cond_3

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    move v0, v1

    .line 137
    :goto_1
    if-eqz v0, :cond_7

    .line 138
    .line 139
    const-string v0, "enableEdgeToEdge"

    .line 140
    .line 141
    new-instance v4, Lkotlin/Pair;

    .line 142
    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    move-object v5, v2

    .line 151
    :goto_2
    const-class v10, Landroid/view/Window;

    .line 152
    .line 153
    invoke-direct {v4, v10, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    :try_start_1
    sget v5, Lcom/facebook/react/views/view/WindowUtilKt;->a:I

    .line 161
    .line 162
    new-instance v5, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    aget-object v10, v4, v3

    .line 168
    .line 169
    invoke-virtual {v10}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    check-cast v10, Ljava/lang/Class;

    .line 174
    .line 175
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    new-array v10, v3, [Ljava/lang/Class;

    .line 179
    .line 180
    invoke-interface {v5, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, [Ljava/lang/Class;

    .line 185
    .line 186
    new-instance v10, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    aget-object v4, v4, v3

    .line 192
    .line 193
    invoke-virtual {v4}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-interface {v10, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    new-array v3, v3, [Ljava/lang/Object;

    .line 201
    .line 202
    invoke-interface {v10, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    array-length v4, v5

    .line 207
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, [Ljava/lang/Class;

    .line 212
    .line 213
    invoke-virtual {p2, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 218
    .line 219
    .line 220
    array-length v1, v3

    .line 221
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p2, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    instance-of v1, p2, LTd/L;

    .line 230
    .line 231
    if-nez v1, :cond_5

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_5
    move-object v2, p2

    .line 235
    :goto_3
    check-cast v2, LTd/L;

    .line 236
    .line 237
    invoke-static {v2}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    goto :goto_4

    .line 242
    :catchall_1
    move-exception p2

    .line 243
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 244
    .line 245
    invoke-static {p2}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-static {p2}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    :goto_4
    invoke-static {p2}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-eqz v1, :cond_6

    .line 258
    .line 259
    new-instance v2, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v8, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 281
    .line 282
    .line 283
    :cond_6
    invoke-static {p2}, LTd/u;->g(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    if-eqz p1, :cond_7

    .line 287
    .line 288
    invoke-static {p1}, Lac/a;->a(Landroid/app/Activity;)V

    .line 289
    .line 290
    .line 291
    :cond_7
    return-void
.end method
