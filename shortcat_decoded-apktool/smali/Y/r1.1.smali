.class public final LY/r1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/r1$a;
    }
.end annotation


# static fields
.field public static final d:LY/r1$a;

.field public static final e:I


# instance fields
.field private final a:Lt/E;

.field private final b:Lt/L;

.field private c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/r1$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY/r1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY/r1;->d:LY/r1$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LY/r1;->e:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt/E;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v1, v2, v3}, Lt/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LY/r1;->a:Lt/E;

    .line 13
    .line 14
    new-instance v0, Lt/L;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LY/r1;->b:Lt/L;

    .line 20
    .line 21
    iput-object p1, p0, LY/r1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY/r1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/E;->h(I)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LY/r1;->a:Lt/E;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lt/E;->h(I)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c(III)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/E;->h(I)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LY/r1;->a:Lt/E;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lt/E;->h(I)Z

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LY/r1;->a:Lt/E;

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Lt/E;->h(I)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->b:Lt/L;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LY/r1;->b:Lt/L;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public e(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/E;->h(I)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LY/r1;->b:Lt/L;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public g(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/E;->h(I)Z

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LY/r1;->b:Lt/L;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/r1;->b:Lt/L;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lt/E;->h(I)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final l(LY/d;Lg0/q;)V
    .locals 11

    .line 1
    iget-object v3, p0, LY/r1;->a:Lt/E;

    .line 2
    .line 3
    iget v0, v3, Lt/m;->b:I

    .line 4
    .line 5
    iget-object v1, p0, LY/r1;->b:Lt/L;

    .line 6
    .line 7
    new-instance v2, Lt/L;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    invoke-direct {v2, v5, v6, v4}, Lt/L;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, LY/d;->j()V

    .line 16
    .line 17
    .line 18
    move v4, v5

    .line 19
    move v7, v4

    .line 20
    :goto_0
    if-ge v4, v0, :cond_1

    .line 21
    .line 22
    add-int/lit8 v8, v4, 0x1

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v3, v4}, Lt/m;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    packed-switch v9, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :pswitch_0
    invoke-interface {p1}, LY/d;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    instance-of v9, v4, LY/i;

    .line 37
    .line 38
    if-eqz v9, :cond_0

    .line 39
    .line 40
    move-object v9, v4

    .line 41
    check-cast v9, LY/i;

    .line 42
    .line 43
    invoke-virtual {p2, v9}, Lg0/q;->k(LY/i;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p2, v0

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p2, v0

    .line 53
    move-object v5, p2

    .line 54
    move v4, v8

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    :goto_1
    invoke-virtual {v2, v4}, Lt/L;->k(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, LY/d;->i()V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :pswitch_1
    add-int/lit8 v4, v7, 0x1

    .line 65
    .line 66
    invoke-virtual {v1, v7}, Lt/V;->c(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    const-string v10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    .line 71
    .line 72
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x2

    .line 76
    invoke-static {v9, v10}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 81
    .line 82
    add-int/lit8 v7, v7, 0x2

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Lt/V;->c(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {p1, v9, v4}, LY/d;->d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :goto_2
    move v4, v8

    .line 92
    goto :goto_0

    .line 93
    :pswitch_2
    add-int/lit8 v4, v4, 0x2

    .line 94
    .line 95
    :try_start_1
    invoke-virtual {v3, v8}, Lt/m;->b(I)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    add-int/lit8 v9, v7, 0x1

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Lt/V;->c(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-interface {p1, v8, v7}, LY/d;->e(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    move v7, v9

    .line 109
    goto :goto_0

    .line 110
    :catch_1
    move-exception v0

    .line 111
    move-object p2, v0

    .line 112
    move-object v5, p2

    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :pswitch_3
    add-int/lit8 v4, v4, 0x2

    .line 116
    .line 117
    invoke-virtual {v3, v8}, Lt/m;->b(I)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    add-int/lit8 v9, v7, 0x1

    .line 122
    .line 123
    invoke-virtual {v1, v7}, Lt/V;->c(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-interface {p1, v8, v7}, LY/d;->g(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :pswitch_4
    :try_start_2
    invoke-interface {p1}, LY/d;->clear()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :pswitch_5
    add-int/lit8 v9, v4, 0x2

    .line 136
    .line 137
    :try_start_3
    invoke-virtual {v3, v8}, Lt/m;->b(I)I

    .line 138
    .line 139
    .line 140
    move-result v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    add-int/lit8 v10, v4, 0x3

    .line 142
    .line 143
    :try_start_4
    invoke-virtual {v3, v9}, Lt/m;->b(I)I

    .line 144
    .line 145
    .line 146
    move-result v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 147
    add-int/lit8 v4, v4, 0x4

    .line 148
    .line 149
    :try_start_5
    invoke-virtual {v3, v10}, Lt/m;->b(I)I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    invoke-interface {p1, v8, v9, v10}, LY/d;->c(III)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :catch_2
    move-exception v0

    .line 159
    move-object p2, v0

    .line 160
    move-object v5, p2

    .line 161
    move v4, v10

    .line 162
    goto :goto_4

    .line 163
    :catch_3
    move-exception v0

    .line 164
    move-object p2, v0

    .line 165
    move-object v5, p2

    .line 166
    move v4, v9

    .line 167
    goto :goto_4

    .line 168
    :pswitch_6
    add-int/lit8 v9, v4, 0x2

    .line 169
    .line 170
    :try_start_6
    invoke-virtual {v3, v8}, Lt/m;->b(I)I

    .line 171
    .line 172
    .line 173
    move-result v8
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 174
    add-int/lit8 v4, v4, 0x3

    .line 175
    .line 176
    :try_start_7
    invoke-virtual {v3, v9}, Lt/m;->b(I)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-interface {p1, v8, v9}, LY/d;->b(II)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :pswitch_7
    add-int/lit8 v4, v7, 0x1

    .line 186
    .line 187
    :try_start_8
    invoke-virtual {v1, v7}, Lt/V;->c(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-interface {p1, v7}, LY/d;->h(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    move v7, v4

    .line 195
    goto :goto_2

    .line 196
    :pswitch_8
    invoke-interface {p1}, LY/d;->k()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_1
    :try_start_9
    invoke-virtual {v1}, Lt/V;->d()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    if-ne v7, p2, :cond_2

    .line 205
    .line 206
    move v5, v6

    .line 207
    :cond_2
    if-nez v5, :cond_3

    .line 208
    .line 209
    const-string p2, "Applier operation size mismatch"

    .line 210
    .line 211
    invoke-static {p2}, LY/w;->t(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_3
    invoke-virtual {v1}, Lt/L;->n()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Lt/E;->j()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 218
    .line 219
    .line 220
    invoke-interface {p1}, LY/d;->f()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :goto_4
    :try_start_a
    new-instance v0, LY/j;

    .line 225
    .line 226
    invoke-direct/range {v0 .. v5}, LY/j;-><init>(Lt/V;Lt/V;Lt/m;ILjava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 230
    :goto_5
    invoke-interface {p1}, LY/d;->f()V

    .line 231
    .line 232
    .line 233
    throw p2

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
