.class final LAd/e$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAd/e;->g(Landroid/net/Uri;Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:LAd/e;

.field final synthetic d:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/net/Uri;LAd/e;Landroid/widget/ImageView;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 2
    .line 3
    iput-object p2, p0, LAd/e$b;->c:LAd/e;

    .line 4
    .line 5
    iput-object p3, p0, LAd/e$b;->d:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, LAd/e$b;

    .line 2
    .line 3
    iget-object v0, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v1, p0, LAd/e$b;->c:LAd/e;

    .line 6
    .line 7
    iget-object v2, p0, LAd/e$b;->d:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LAd/e$b;-><init>(Landroid/net/Uri;LAd/e;Landroid/widget/ImageView;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LAd/e$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LAd/e$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LAd/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LAd/e$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LAd/e$b;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object p1, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_6

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    sparse-switch v1, :sswitch_data_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :sswitch_0
    const-string v1, "https"

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :sswitch_1
    const-string v1, "http"

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_3
    :goto_0
    new-instance p1, Ljava/net/URL;

    .line 74
    .line 75
    iget-object v1, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 89
    .line 90
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 94
    .line 95
    invoke-virtual {p1, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v1, "getInputStream(...)"

    .line 106
    .line 107
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    goto :goto_2

    .line 115
    :sswitch_2
    const-string v1, "file"

    .line 116
    .line 117
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_4

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    iget-object p1, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    goto :goto_2

    .line 135
    :sswitch_3
    const-string v1, "data"

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_5

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    iget-object p1, p0, LAd/e$b;->b:Landroid/net/Uri;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    const-string p1, "toString(...)"

    .line 151
    .line 152
    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const-string p1, "data:image/"

    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    invoke-static {v5, p1, v1, v2, v4}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_6

    .line 163
    .line 164
    const-string v6, ","

    .line 165
    .line 166
    const/4 v9, 0x6

    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v7, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    invoke-static/range {v5 .. v10}, LDf/r;->j0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    add-int/2addr p1, v3

    .line 175
    invoke-virtual {v5, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string v5, "substring(...)"

    .line 180
    .line 181
    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    array-length v5, p1

    .line 189
    invoke-static {p1, v1, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    goto :goto_2

    .line 194
    :cond_6
    :goto_1
    move-object p1, v4

    .line 195
    :goto_2
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v5, LAd/e$b$a;

    .line 200
    .line 201
    iget-object v6, p0, LAd/e$b;->c:LAd/e;

    .line 202
    .line 203
    iget-object v7, p0, LAd/e$b;->d:Landroid/widget/ImageView;

    .line 204
    .line 205
    invoke-direct {v5, p1, v6, v7, v4}, LAd/e$b$a;-><init>(Landroid/graphics/Bitmap;LAd/e;Landroid/widget/ImageView;LZd/e;)V

    .line 206
    .line 207
    .line 208
    iput v3, p0, LAd/e$b;->a:I

    .line 209
    .line 210
    invoke-static {v1, v5, p0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 214
    if-ne p1, v0, :cond_7

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catch_0
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance v1, LAd/e$b$b;

    .line 222
    .line 223
    iget-object v3, p0, LAd/e$b;->c:LAd/e;

    .line 224
    .line 225
    invoke-direct {v1, v3, v4}, LAd/e$b$b;-><init>(LAd/e;LZd/e;)V

    .line 226
    .line 227
    .line 228
    iput v2, p0, LAd/e$b;->a:I

    .line 229
    .line 230
    invoke-static {p1, v1, p0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v0, :cond_7

    .line 235
    .line 236
    :goto_3
    return-object v0

    .line 237
    :cond_7
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 238
    .line 239
    return-object p1

    .line 240
    nop

    .line 241
    :sswitch_data_0
    .sparse-switch
        0x2eefaa -> :sswitch_3
        0x2ff57c -> :sswitch_2
        0x310888 -> :sswitch_1
        0x5f008eb -> :sswitch_0
    .end sparse-switch
.end method
