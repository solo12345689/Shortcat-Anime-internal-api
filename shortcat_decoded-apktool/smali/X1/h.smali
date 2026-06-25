.class public final LX1/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LT1/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX1/h$a;
    }
.end annotation


# static fields
.field public static final a:LX1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LX1/h;

    .line 2
    .line 3
    invoke-direct {v0}, LX1/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX1/h;->a:LX1/h;

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

.method private final d(Ljava/lang/String;LW1/h;LX1/c;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, LW1/h;->g0()LW1/h$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, LX1/h$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    new-instance p1, LTd/r;

    .line 23
    .line 24
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_1
    new-instance p1, LT1/d;

    .line 29
    .line 30
    const-string p2, "Value not set."

    .line 31
    .line 32
    invoke-direct {p1, p2, v2, v1, v2}, LT1/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :pswitch_2
    invoke-static {p1}, LX1/i;->b(Ljava/lang/String;)LX1/f$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2}, LW1/h;->Y()Landroidx/datastore/preferences/protobuf/f;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/f;->x()[B

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string v0, "value.bytes.toByteArray()"

    .line 49
    .line 50
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_3
    invoke-static {p1}, LX1/i;->h(Ljava/lang/String;)LX1/f$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2}, LW1/h;->f0()LW1/g;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2}, LW1/g;->T()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string v0, "value.stringSet.stringsList"

    .line 70
    .line 71
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p2}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_4
    invoke-static {p1}, LX1/i;->g(Ljava/lang/String;)LX1/f$a;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p2}, LW1/h;->e0()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string v0, "value.string"

    .line 91
    .line 92
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_5
    invoke-static {p1}, LX1/i;->f(Ljava/lang/String;)LX1/f$a;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p2}, LW1/h;->d0()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_6
    invoke-static {p1}, LX1/i;->e(Ljava/lang/String;)LX1/f$a;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p2}, LW1/h;->c0()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_7
    invoke-static {p1}, LX1/i;->c(Ljava/lang/String;)LX1/f$a;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p2}, LW1/h;->a0()D

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_8
    invoke-static {p1}, LX1/i;->d(Ljava/lang/String;)LX1/f$a;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p2}, LW1/h;->b0()F

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_9
    invoke-static {p1}, LX1/i;->a(Ljava/lang/String;)LX1/f$a;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p2}, LW1/h;->X()Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p3, p1, p2}, LX1/c;->i(LX1/f$a;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_a
    new-instance p1, LT1/d;

    .line 180
    .line 181
    const-string p2, "Value case is null."

    .line 182
    .line 183
    invoke-direct {p1, p2, v2, v1, v2}, LT1/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private final f(Ljava/lang/Object;)LW1/h;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p1}, LW1/h$a;->s(Z)LW1/h$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "newBuilder().setBoolean(value).build()"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, LW1/h;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast p1, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v0, p1}, LW1/h$a;->v(F)LW1/h$a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "newBuilder().setFloat(value).build()"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast p1, LW1/h;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_1
    instance-of v0, p1, Ljava/lang/Double;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast p1, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-virtual {v0, v1, v2}, LW1/h$a;->u(D)LW1/h$a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "newBuilder().setDouble(value).build()"

    .line 84
    .line 85
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    check-cast p1, LW1/h;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_2
    instance-of v0, p1, Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast p1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {v0, p1}, LW1/h$a;->x(I)LW1/h$a;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "newBuilder().setInteger(value).build()"

    .line 114
    .line 115
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    check-cast p1, LW1/h;

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    .line 122
    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast p1, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    invoke-virtual {v0, v1, v2}, LW1/h$a;->y(J)LW1/h$a;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "newBuilder().setLong(value).build()"

    .line 144
    .line 145
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast p1, LW1/h;

    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    .line 152
    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast p1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v0, p1}, LW1/h$a;->A(Ljava/lang/String;)LW1/h$a;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-string v0, "newBuilder().setString(value).build()"

    .line 170
    .line 171
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    check-cast p1, LW1/h;

    .line 175
    .line 176
    return-object p1

    .line 177
    :cond_5
    instance-of v0, p1, Ljava/util/Set;

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {}, LW1/g;->U()LW1/g$a;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    .line 190
    .line 191
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast p1, Ljava/util/Set;

    .line 195
    .line 196
    check-cast p1, Ljava/lang/Iterable;

    .line 197
    .line 198
    invoke-virtual {v1, p1}, LW1/g$a;->s(Ljava/lang/Iterable;)LW1/g$a;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {v0, p1}, LW1/h$a;->B(LW1/g$a;)LW1/h$a;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-string v0, "newBuilder()\n           \u2026                 .build()"

    .line 211
    .line 212
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    check-cast p1, LW1/h;

    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_6
    instance-of v0, p1, [B

    .line 219
    .line 220
    if-eqz v0, :cond_7

    .line 221
    .line 222
    invoke-static {}, LW1/h;->h0()LW1/h$a;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast p1, [B

    .line 227
    .line 228
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/f;->f([B)Landroidx/datastore/preferences/protobuf/f;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v0, p1}, LW1/h$a;->t(Landroidx/datastore/preferences/protobuf/f;)LW1/h$a;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    const-string v0, "newBuilder().setBytes(By\u2026.copyFrom(value)).build()"

    .line 241
    .line 242
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    check-cast p1, LW1/h;

    .line 246
    .line 247
    return-object p1

    .line 248
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    new-instance v1, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v2, "PreferencesSerializer does not support type: "

    .line 256
    .line 257
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object p2, LW1/d;->a:LW1/d$a;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LW1/d$a;->a(Ljava/io/InputStream;)LW1/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    new-array p2, p2, [LX1/f$b;

    .line 9
    .line 10
    invoke-static {p2}, LX1/g;->b([LX1/f$b;)LX1/c;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1}, LW1/f;->R()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "preferencesProto.preferencesMap"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, LW1/h;

    .line 54
    .line 55
    sget-object v2, LX1/h;->a:LX1/h;

    .line 56
    .line 57
    const-string v3, "name"

    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v3, "value"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v1, v0, p2}, LX1/h;->d(Ljava/lang/String;LW1/h;LX1/c;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p2}, LX1/f;->d()LX1/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/OutputStream;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LX1/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LX1/h;->g(LX1/f;Ljava/io/OutputStream;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX1/h;->e()LX1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e()LX1/f;
    .locals 1

    .line 1
    invoke-static {}, LX1/g;->a()LX1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(LX1/f;Ljava/io/OutputStream;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, LX1/f;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, LW1/f;->U()LW1/f$a;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LX1/f$a;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1}, LX1/f$a;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p0, v0}, LX1/h;->f(Ljava/lang/Object;)LW1/h;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p3, v1, v0}, LW1/f$a;->s(Ljava/lang/String;LW1/h;)LW1/f$a;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/t$a;->i()Landroidx/datastore/preferences/protobuf/t;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, LW1/f;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/a;->h(Ljava/io/OutputStream;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, LTd/L;->a:LTd/L;

    .line 61
    .line 62
    return-object p1
.end method
