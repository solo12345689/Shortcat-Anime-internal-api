.class public final Lcom/facebook/react/views/text/q$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/common/mapbuffer/a;)Lcom/facebook/react/views/text/q;
    .locals 3

    .line 1
    const-string v0, "props"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/views/text/q;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    :pswitch_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/facebook/react/common/mapbuffer/a$c;

    .line 27
    .line 28
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->getKey()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    :pswitch_1
    goto :goto_0

    .line 36
    :pswitch_2
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    double-to-float v1, v1

    .line 41
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->n(Lcom/facebook/react/views/text/q;F)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_3
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->v(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_4
    invoke-static {}, Lcom/facebook/react/uimanager/D$d;->c()Lkotlin/enums/EnumEntries;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/facebook/react/uimanager/D$d;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->p(Lcom/facebook/react/views/text/q;Lcom/facebook/react/uimanager/D$d;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_5
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->b(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_6
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->k(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_7
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    double-to-float v1, v1

    .line 92
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->t(Lcom/facebook/react/views/text/q;F)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_8
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    double-to-float v1, v1

    .line 101
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->s(Lcom/facebook/react/views/text/q;F)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_9
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->r(Lcom/facebook/react/views/text/q;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_a
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 114
    .line 115
    .line 116
    move-result-wide v1

    .line 117
    double-to-float v1, v1

    .line 118
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->u(Lcom/facebook/react/views/text/q;F)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_b
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->q(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_c
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 131
    .line 132
    .line 133
    move-result-wide v1

    .line 134
    double-to-float v1, v1

    .line 135
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->m(Lcom/facebook/react/views/text/q;F)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_d
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    double-to-float v1, v1

    .line 144
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->l(Lcom/facebook/react/views/text/q;F)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :pswitch_e
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->f()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->c(Lcom/facebook/react/views/text/q;Z)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :pswitch_f
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->e()Lcom/facebook/react/common/mapbuffer/a;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->i(Lcom/facebook/react/views/text/q;Lcom/facebook/react/common/mapbuffer/a;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :pswitch_10
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->h(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :pswitch_11
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->j(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :pswitch_12
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 186
    .line 187
    .line 188
    move-result-wide v1

    .line 189
    double-to-float v1, v1

    .line 190
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->g(Lcom/facebook/react/views/text/q;F)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :pswitch_13
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->f(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :pswitch_14
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->c()D

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    double-to-float v1, v1

    .line 209
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->o(Lcom/facebook/react/views/text/q;F)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :pswitch_15
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->d(Lcom/facebook/react/views/text/q;Ljava/lang/Integer;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :pswitch_16
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->b()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {v0, v1}, Lcom/facebook/react/views/text/q;->e(Lcom/facebook/react/views/text/q;Ljava/lang/Integer;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_0
    return-object v0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;)Landroid/text/TextUtils$TruncateAt;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "tail"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 21
    .line 22
    return-object p1

    .line 23
    :sswitch_1
    const-string v0, "head"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 33
    .line 34
    return-object p1

    .line 35
    :sswitch_2
    const-string v0, "clip"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :sswitch_3
    const-string v0, "middle"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 54
    return-object p1

    .line 55
    :sswitch_data_0
    .sparse-switch
        -0x4009266b -> :sswitch_3
        0x2ea350 -> :sswitch_2
        0x30cde0 -> :sswitch_1
        0x363450 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "none"

    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    const-string v0, "normal"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_2
    const/4 p1, 0x2

    .line 25
    return p1
.end method

.method public final d(Lcom/facebook/react/uimanager/Q;I)I
    .locals 2

    .line 1
    const-string v0, "props"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "textAlign"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/Q;->c(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return p2

    .line 15
    :cond_0
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/Q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "justify"

    .line 20
    .line 21
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 p2, 0x1a

    .line 30
    .line 31
    if-lt p1, p2, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_1
    invoke-static {}, Lcom/facebook/react/views/text/q;->a()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final e(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const v2, -0x3de09eb0

    .line 9
    .line 10
    .line 11
    if-eq v1, v2, :cond_4

    .line 12
    .line 13
    const v2, 0x1a3ea

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const v2, 0x1ba6a

    .line 19
    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v1, "rtl"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    const-string v1, "ltr"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :cond_4
    const-string v1, "undefined"

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_5
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "Invalid layoutDirection: "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v1, "ReactNative"

    .line 73
    .line 74
    invoke-static {v1, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_6
    :goto_1
    return v0
.end method

.method public final f(Lcom/facebook/react/uimanager/Q;ZI)I
    .locals 3

    .line 1
    const-string v0, "props"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "textAlign"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/Q;->c(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return p3

    .line 15
    :cond_0
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/Q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p3, 0x0

    .line 20
    if-eqz p1, :cond_7

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x5

    .line 27
    const/4 v2, 0x3

    .line 28
    sparse-switch v0, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :sswitch_0
    const-string v0, "right"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz p2, :cond_2

    .line 42
    .line 43
    return v2

    .line 44
    :cond_2
    return v1

    .line 45
    :sswitch_1
    const-string v0, "left"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    if-eqz p2, :cond_4

    .line 55
    .line 56
    return v1

    .line 57
    :cond_4
    return v2

    .line 58
    :sswitch_2
    const-string p2, "auto"

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :sswitch_3
    const-string p2, "justify"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_5

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    return v2

    .line 77
    :sswitch_4
    const-string p2, "center"

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_6

    .line 84
    .line 85
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v0, "Invalid textAlign: "

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string p2, "ReactNative"

    .line 103
    .line 104
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return p3

    .line 108
    :cond_6
    const/4 p1, 0x1

    .line 109
    return p1

    .line 110
    :cond_7
    return p3

    .line 111
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        -0x4a799570 -> :sswitch_3
        0x2dddaf -> :sswitch_2
        0x32a007 -> :sswitch_1
        0x677c21c -> :sswitch_0
    .end sparse-switch
.end method

.method public final g(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "simple"

    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    const-string v1, "balanced"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    return p1

    .line 25
    :cond_2
    return v0
.end method
