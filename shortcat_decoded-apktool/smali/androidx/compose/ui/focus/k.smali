.class public final Landroidx/compose/ui/focus/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/k$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/focus/k$a;

.field private static final c:Landroidx/compose/ui/focus/k;

.field private static final d:Landroidx/compose/ui/focus/k;

.field private static final e:Landroidx/compose/ui/focus/k;


# instance fields
.field private final a:La0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/focus/k;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/compose/ui/focus/k;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/compose/ui/focus/k;->c:Landroidx/compose/ui/focus/k;

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/ui/focus/k;

    .line 17
    .line 18
    invoke-direct {v0}, Landroidx/compose/ui/focus/k;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/compose/ui/focus/k;->d:Landroidx/compose/ui/focus/k;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/ui/focus/k;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/compose/ui/focus/k;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroidx/compose/ui/focus/k;->e:Landroidx/compose/ui/focus/k;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La0/c;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lq0/m;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/focus/k;->a:La0/c;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic a()Landroidx/compose/ui/focus/k;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/k;->d:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()Landroidx/compose/ui/focus/k;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/k;->c:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Landroidx/compose/ui/focus/k;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/k;->e:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic h(Landroidx/compose/ui/focus/k;IILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/k;->g(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method


# virtual methods
.method public final d(Lkotlin/jvm/functions/Function1;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/focus/k$a;->b()Landroidx/compose/ui/focus/k;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 12
    .line 13
    if-eq v0, v3, :cond_13

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eq v0, v2, :cond_12

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/compose/ui/focus/k;->a:La0/c;

    .line 22
    .line 23
    invoke-virtual {v2}, La0/c;->p()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    const-string v1, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 31
    .line 32
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    iget-object v2, v0, Landroidx/compose/ui/focus/k;->a:La0/c;

    .line 39
    .line 40
    iget-object v4, v2, La0/c;->a:[Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v2}, La0/c;->p()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    move v5, v3

    .line 47
    move v6, v5

    .line 48
    :goto_0
    if-ge v5, v2, :cond_11

    .line 49
    .line 50
    aget-object v7, v4, v5

    .line 51
    .line 52
    check-cast v7, Lq0/m;

    .line 53
    .line 54
    const/16 v8, 0x400

    .line 55
    .line 56
    invoke-static {v8}, LK0/g0;->a(I)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-interface {v7}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-nez v9, :cond_1

    .line 69
    .line 70
    const-string v9, "visitChildren called on an unattached node"

    .line 71
    .line 72
    invoke-static {v9}, LH0/a;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    new-instance v9, La0/c;

    .line 76
    .line 77
    const/16 v10, 0x10

    .line 78
    .line 79
    new-array v11, v10, [Landroidx/compose/ui/e$c;

    .line 80
    .line 81
    invoke-direct {v9, v11, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v7}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    if-nez v11, :cond_2

    .line 93
    .line 94
    invoke-interface {v7}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v9, v7, v3}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v9, v11}, La0/c;->c(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_3
    :goto_1
    invoke-virtual {v9}, La0/c;->p()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_10

    .line 110
    .line 111
    invoke-virtual {v9}, La0/c;->p()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/4 v11, 0x1

    .line 116
    sub-int/2addr v7, v11

    .line 117
    invoke-virtual {v9, v7}, La0/c;->y(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Landroidx/compose/ui/e$c;

    .line 122
    .line 123
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    and-int/2addr v12, v8

    .line 128
    if-nez v12, :cond_4

    .line 129
    .line 130
    invoke-static {v9, v7, v3}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    :goto_2
    if-eqz v7, :cond_3

    .line 135
    .line 136
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    and-int/2addr v12, v8

    .line 141
    if-eqz v12, :cond_f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    :goto_3
    if-eqz v7, :cond_3

    .line 145
    .line 146
    instance-of v14, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 147
    .line 148
    if-eqz v14, :cond_6

    .line 149
    .line 150
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 151
    .line 152
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    invoke-interface {v14}, Landroidx/compose/ui/focus/i;->i()Z

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    if-eqz v14, :cond_5

    .line 161
    .line 162
    invoke-interface {v1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    goto :goto_4

    .line 173
    :cond_5
    sget-object v14, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 174
    .line 175
    invoke-virtual {v14}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    invoke-static {v7, v14, v1}, Landroidx/compose/ui/focus/w;->k(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    :goto_4
    if-eqz v7, :cond_e

    .line 184
    .line 185
    move v6, v11

    .line 186
    goto :goto_9

    .line 187
    :cond_6
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    and-int/2addr v14, v8

    .line 192
    if-eqz v14, :cond_7

    .line 193
    .line 194
    move v14, v11

    .line 195
    goto :goto_5

    .line 196
    :cond_7
    move v14, v3

    .line 197
    :goto_5
    if-eqz v14, :cond_e

    .line 198
    .line 199
    instance-of v14, v7, LK0/m;

    .line 200
    .line 201
    if-eqz v14, :cond_e

    .line 202
    .line 203
    move-object v14, v7

    .line 204
    check-cast v14, LK0/m;

    .line 205
    .line 206
    invoke-virtual {v14}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    move v15, v3

    .line 211
    :goto_6
    if-eqz v14, :cond_d

    .line 212
    .line 213
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 214
    .line 215
    .line 216
    move-result v16

    .line 217
    and-int v16, v16, v8

    .line 218
    .line 219
    if-eqz v16, :cond_8

    .line 220
    .line 221
    move/from16 v16, v11

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_8
    move/from16 v16, v3

    .line 225
    .line 226
    :goto_7
    if-eqz v16, :cond_c

    .line 227
    .line 228
    add-int/lit8 v15, v15, 0x1

    .line 229
    .line 230
    if-ne v15, v11, :cond_9

    .line 231
    .line 232
    move-object v7, v14

    .line 233
    goto :goto_8

    .line 234
    :cond_9
    if-nez v13, :cond_a

    .line 235
    .line 236
    new-instance v13, La0/c;

    .line 237
    .line 238
    new-array v12, v10, [Landroidx/compose/ui/e$c;

    .line 239
    .line 240
    invoke-direct {v13, v12, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 241
    .line 242
    .line 243
    :cond_a
    if-eqz v7, :cond_b

    .line 244
    .line 245
    invoke-virtual {v13, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    :cond_b
    invoke-virtual {v13, v14}, La0/c;->c(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_c
    :goto_8
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    goto :goto_6

    .line 257
    :cond_d
    if-ne v15, v11, :cond_e

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_e
    invoke-static {v13}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    goto :goto_3

    .line 265
    :cond_f
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :cond_10
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_11
    return v6

    .line 276
    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 283
    .line 284
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v1
.end method

.method public final e()La0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/k;->a:La0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic f()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/k;->g(I)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(I)Z
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/k$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/k$b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/k;->d(Lkotlin/jvm/functions/Function1;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method
