.class public LSc/c;
.super LSc/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSc/c$a;
    }
.end annotation


# static fields
.field public static final g:LSc/c$a;


# instance fields
.field private final f:LYc/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LSc/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LSc/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LSc/c;->g:LSc/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LPc/a;LYc/h;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notification"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "store"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, LSc/a;-><init>(Landroid/content/Context;LPc/a;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, LSc/c;->f:LYc/h;

    .line 20
    .line 21
    return-void
.end method

.method private final n(LOc/a;Landroidx/core/app/m$e;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LSc/c;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, LSc/c;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2, v2}, Landroidx/core/app/m$e;->J(Z)Landroidx/core/app/m$e;

    .line 15
    .line 16
    .line 17
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v4, 0x1a

    .line 20
    .line 21
    if-ge v3, v4, :cond_7

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, LOc/a;->N()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    move v4, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v4, v3

    .line 35
    :goto_0
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {p1}, LOc/a;->K()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    move v3, v2

    .line 44
    :cond_2
    if-eqz v3, :cond_3

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    invoke-virtual {p2, p1}, Landroidx/core/app/m$e;->q(I)Landroidx/core/app/m$e;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    if-eqz v0, :cond_5

    .line 58
    .line 59
    invoke-interface {p1}, LOc/a;->P()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    new-instance v0, LDc/e;

    .line 66
    .line 67
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v0, v2}, LDc/e;-><init>(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, LOc/a;->P()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v0, v2}, LDc/e;->b(Ljava/lang/String;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p2, v0}, Landroidx/core/app/m$e;->N(Landroid/net/Uri;)Landroidx/core/app/m$e;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    if-eqz v4, :cond_5

    .line 87
    .line 88
    invoke-virtual {p2, v2}, Landroidx/core/app/m$e;->q(I)Landroidx/core/app/m$e;

    .line 89
    .line 90
    .line 91
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroidx/core/app/m$e;->N(Landroid/net/Uri;)Landroidx/core/app/m$e;

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_1
    if-eqz v1, :cond_7

    .line 97
    .line 98
    invoke-interface {p1}, LOc/a;->G()[J

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Landroidx/core/app/m$e;->T([J)Landroidx/core/app/m$e;

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    if-eqz v3, :cond_7

    .line 109
    .line 110
    const/4 p1, 0x2

    .line 111
    invoke-virtual {p2, p1}, Landroidx/core/app/m$e;->q(I)Landroidx/core/app/m$e;

    .line 112
    .line 113
    .line 114
    :cond_7
    return-void
.end method

.method static synthetic p(LSc/c;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, LSc/c$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LSc/c$b;

    .line 7
    .line 8
    iget v1, v0, LSc/c$b;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LSc/c$b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LSc/c$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LSc/c$b;-><init>(LSc/c;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LSc/c$b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LSc/c$b;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LSc/c$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/core/app/m$e;

    .line 41
    .line 42
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, LSc/a;->a()Landroidx/core/app/m$e;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0}, LSc/c;->t()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p1, v2}, Landroidx/core/app/m$e;->K(I)Landroidx/core/app/m$e;

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, LSc/c;->v()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {p1, v2}, Landroidx/core/app/m$e;->E(I)Landroidx/core/app/m$e;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, LOc/a;->F()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->g(Z)Landroidx/core/app/m$e;

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, LOc/a;->U()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->C(Z)Landroidx/core/app/m$e;

    .line 92
    .line 93
    .line 94
    invoke-interface {v2}, LOc/a;->getTitle()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->p(Ljava/lang/CharSequence;)Landroidx/core/app/m$e;

    .line 99
    .line 100
    .line 101
    invoke-interface {v2}, LOc/a;->getText()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->o(Ljava/lang/CharSequence;)Landroidx/core/app/m$e;

    .line 106
    .line 107
    .line 108
    invoke-interface {v2}, LOc/a;->V()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->P(Ljava/lang/CharSequence;)Landroidx/core/app/m$e;

    .line 113
    .line 114
    .line 115
    new-instance v4, Landroidx/core/app/m$c;

    .line 116
    .line 117
    invoke-direct {v4}, Landroidx/core/app/m$c;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {v2}, LOc/a;->getText()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v4, v5}, Landroidx/core/app/m$c;->h(Ljava/lang/CharSequence;)Landroidx/core/app/m$c;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->O(Landroidx/core/app/m$h;)Landroidx/core/app/m$e;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, LSc/c;->s()Ljava/lang/Number;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    if-eqz v4, :cond_3

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->l(I)Landroidx/core/app/m$e;

    .line 142
    .line 143
    .line 144
    :cond_3
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-interface {v4}, LOc/a;->T()Ljava/lang/Number;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-eqz v4, :cond_4

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->B(I)Landroidx/core/app/m$e;

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-interface {v4}, LOc/a;->Q()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    if-eqz v4, :cond_5

    .line 170
    .line 171
    invoke-virtual {p0, p1, v4}, LSc/c;->m(Landroidx/core/app/m$e;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    invoke-direct {p0, v2, p1}, LSc/c;->n(LOc/a;Landroidx/core/app/m$e;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v2}, LOc/a;->R()Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    invoke-virtual {p1}, Landroidx/core/app/m$e;->e()Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-string v5, "getExtras(...)"

    .line 188
    .line 189
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v2}, LOc/a;->R()Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v5, "body"

    .line 201
    .line 202
    invoke-virtual {v4, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v4}, Landroidx/core/app/m$e;->s(Landroid/os/Bundle;)Landroidx/core/app/m$e;

    .line 206
    .line 207
    .line 208
    :cond_6
    new-instance v2, Landroid/os/Bundle;

    .line 209
    .line 210
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, LSc/a;->g()LPc/a;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, LPc/a;->a()LPc/g;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const-string v5, "getNotificationRequest(...)"

    .line 222
    .line 223
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v4}, LSc/c;->w(LPc/g;)[B

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    const-string v5, "expo.notification_request"

    .line 231
    .line 232
    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v2}, Landroidx/core/app/m$e;->c(Landroid/os/Bundle;)Landroidx/core/app/m$e;

    .line 236
    .line 237
    .line 238
    new-instance v2, LPc/b;

    .line 239
    .line 240
    const-string v4, "expo.modules.notifications.actions.DEFAULT"

    .line 241
    .line 242
    const/4 v5, 0x0

    .line 243
    invoke-direct {v2, v4, v5, v3}, LPc/b;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 244
    .line 245
    .line 246
    sget-object v4, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 247
    .line 248
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-virtual {p0}, LSc/a;->g()LPc/a;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-virtual {v4, v5, v6, v2}, Lexpo/modules/notifications/service/NotificationsService$a;->b(Landroid/content/Context;LPc/a;LPc/b;)Landroid/app/PendingIntent;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {p1, v2}, Landroidx/core/app/m$e;->n(Landroid/app/PendingIntent;)Landroidx/core/app/m$e;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-interface {v2}, LOc/a;->L()Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_9

    .line 272
    .line 273
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    iput-object p1, v0, LSc/c$b;->a:Ljava/lang/Object;

    .line 282
    .line 283
    iput v3, v0, LSc/c$b;->d:I

    .line 284
    .line 285
    invoke-interface {v2, p0, v0}, LOc/a;->M(Landroid/content/Context;LZd/e;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    if-ne p0, v1, :cond_7

    .line 290
    .line 291
    return-object v1

    .line 292
    :cond_7
    move-object v7, p1

    .line 293
    move-object p1, p0

    .line 294
    move-object p0, v7

    .line 295
    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 296
    .line 297
    if-eqz p1, :cond_8

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Landroidx/core/app/m$e;->y(Landroid/graphics/Bitmap;)Landroidx/core/app/m$e;

    .line 300
    .line 301
    .line 302
    :cond_8
    move-object p1, p0

    .line 303
    goto :goto_2

    .line 304
    :cond_9
    invoke-virtual {p0}, LSc/c;->u()Landroid/graphics/Bitmap;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-virtual {p1, p0}, Landroidx/core/app/m$e;->y(Landroid/graphics/Bitmap;)Landroidx/core/app/m$e;

    .line 309
    .line 310
    .line 311
    :goto_2
    invoke-virtual {p1}, Landroidx/core/app/m$e;->d()Landroid/app/Notification;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    const-string p1, "build(...)"

    .line 316
    .line 317
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-object p0
.end method

.method private final v()I
    .locals 5

    .line 1
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LOc/a;->D()LMc/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LSc/a;->h()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getPriorityOverride()LMc/d;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, LMc/d;->k()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, LMc/d;->k()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sget-object v0, LMc/d;->e:LMc/d;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {v1}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPresentAlert()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 43
    .line 44
    int-to-double v3, v0

    .line 45
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :goto_2
    double-to-int v0, v0

    .line 50
    return v0

    .line 51
    :cond_2
    const-wide/16 v1, 0x0

    .line 52
    .line 53
    int-to-double v3, v0

    .line 54
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {v0}, LMc/d;->k()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    return v0

    .line 66
    :cond_4
    const/4 v0, 0x1

    .line 67
    return v0
.end method

.method private final x()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LSc/a;->h()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPlaySound()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, LOc/a;->N()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, LOc/a;->P()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    move v2, v1

    .line 39
    :goto_2
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    return v1

    .line 44
    :cond_3
    return v3
.end method

.method private final y()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LSc/a;->h()Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;->getShouldPlaySound()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, LOc/a;->K()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, LOc/a;->G()[J

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :goto_1
    move v2, v1

    .line 39
    :goto_2
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    return v1

    .line 44
    :cond_3
    return v3
.end method


# virtual methods
.method public m(Landroidx/core/app/m$e;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "format(...)"

    .line 2
    .line 3
    const-string v1, "Could not read category with identifier: %s. %s"

    .line 4
    .line 5
    const-string v2, "expo-notifications"

    .line 6
    .line 7
    const-string v3, "builder"

    .line 8
    .line 9
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "categoryIdentifier"

    .line 13
    .line 14
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x2

    .line 22
    :try_start_0
    iget-object v5, p0, LSc/c;->f:LYc/h;

    .line 23
    .line 24
    invoke-virtual {v5, p2}, LYc/h;->b(Ljava/lang/String;)LPc/c;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, LPc/c;->a()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "getActions(...)"

    .line 35
    .line 36
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    move-object v3, v5

    .line 40
    goto :goto_2

    .line 41
    :catch_0
    move-exception v5

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception v5

    .line 44
    goto :goto_1

    .line 45
    :goto_0
    sget-object v6, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    filled-new-array {p2, v5}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :goto_1
    sget-object v6, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    filled-new-array {p2, v5}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    :cond_0
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, LPc/b;

    .line 109
    .line 110
    instance-of v1, v0, LPc/j;

    .line 111
    .line 112
    if-eqz v1, :cond_1

    .line 113
    .line 114
    check-cast v0, LPc/j;

    .line 115
    .line 116
    invoke-virtual {p0, v0}, LSc/c;->r(LPc/j;)Landroidx/core/app/m$a;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Landroidx/core/app/m$e;->b(Landroidx/core/app/m$a;)Landroidx/core/app/m$e;

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_1
    invoke-virtual {p0, v0}, LSc/c;->q(LPc/b;)Landroidx/core/app/m$a;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Landroidx/core/app/m$e;->b(Landroidx/core/app/m$a;)Landroidx/core/app/m$e;

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_2
    return-void
.end method

.method public o(LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LSc/c;->p(LSc/c;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected final q(LPc/b;)Landroidx/core/app/m$a;
    .locals 3

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 7
    .line 8
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, LSc/a;->g()LPc/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2, p1}, Lexpo/modules/notifications/service/NotificationsService$a;->b(Landroid/content/Context;LPc/a;LPc/b;)Landroid/app/PendingIntent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Landroidx/core/app/m$a$a;

    .line 21
    .line 22
    invoke-virtual {p0}, LSc/c;->t()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1}, LPc/b;->getTitle()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v1, v2, p1, v0}, Landroidx/core/app/m$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/core/app/m$a$a;->b()Landroidx/core/app/m$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "build(...)"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method protected final r(LPc/j;)Landroidx/core/app/m$a;
    .locals 5

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 7
    .line 8
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, LSc/a;->g()LPc/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2, p1}, Lexpo/modules/notifications/service/NotificationsService$a;->b(Landroid/content/Context;LPc/a;LPc/b;)Landroid/app/PendingIntent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Landroidx/core/app/w$e;

    .line 21
    .line 22
    const-string v2, "userTextResponse"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Landroidx/core/app/w$e;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, LPc/j;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Landroidx/core/app/w$e;->e(Ljava/lang/CharSequence;)Landroidx/core/app/w$e;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroidx/core/app/w$e;->a()Landroidx/core/app/w;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "build(...)"

    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Landroidx/core/app/m$a$a;

    .line 45
    .line 46
    invoke-virtual {p0}, LSc/c;->t()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {p1}, LPc/b;->getTitle()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v3, v4, p1, v0}, Landroidx/core/app/m$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Landroidx/core/app/m$a$a;->a(Landroidx/core/app/w;)Landroidx/core/app/m$a$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Landroidx/core/app/m$a$a;->b()Landroidx/core/app/m$a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object p1
.end method

.method protected s()Ljava/lang/Number;
    .locals 5

    .line 1
    const-string v0, "expo.modules.notifications.default_notification_color"

    .line 2
    .line 3
    invoke-virtual {p0}, LSc/a;->i()LOc/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LOc/a;->I()Ljava/lang/Number;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/16 v4, 0x80

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "getApplicationInfo(...)"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {v3, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-object v0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    const-string v2, "expo-notifications"

    .line 74
    .line 75
    const-string v3, "Could not have fetched default notification color."

    .line 76
    .line 77
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    :cond_0
    return-object v1
.end method

.method protected t()I
    .locals 4

    .line 1
    const-string v0, "expo.modules.notifications.default_notification_icon"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x80

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getApplicationInfo(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return v0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    const-string v1, "expo-notifications"

    .line 47
    .line 48
    const-string v2, "Could not have fetched default notification icon."

    .line 49
    .line 50
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 62
    .line 63
    return v0
.end method

.method protected final u()Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const-string v0, "expo.modules.notifications.large_notification_icon"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x80

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getApplicationInfo(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0}, LSc/a;->d()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-object v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    const-string v1, "expo-notifications"

    .line 59
    .line 60
    const-string v2, "Could not have fetched large notification icon."

    .line 61
    .line 62
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    :cond_0
    const/4 v0, 0x0

    .line 66
    return-object v0
.end method

.method protected final w(LPc/g;)[B
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "obtain(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, LPc/g;->writeToParcel(Landroid/os/Parcel;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {p1}, LPc/g;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v2, "Could not marshalled notification request: "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, "."

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v1, "expo-notifications"

    .line 55
    .line 56
    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    return-object p1
.end method
