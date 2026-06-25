.class final LDb/k$K0;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->f0(LDb/k$a;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LDb/k$a;

.field final synthetic c:LDb/k;


# direct methods
.method constructor <init>(LDb/k$a;LDb/k;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$K0;->b:LDb/k$a;

    .line 2
    .line 3
    iput-object p2, p0, LDb/k$K0;->c:LDb/k;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, LDb/k$K0;

    .line 2
    .line 3
    iget-object v0, p0, LDb/k$K0;->b:LDb/k$a;

    .line 4
    .line 5
    iget-object v1, p0, LDb/k$K0;->c:LDb/k;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LDb/k$K0;-><init>(LDb/k$a;LDb/k;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LDb/k$K0;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LDb/k$K0;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LDb/k$K0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LDb/k$K0;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, LDb/k$K0;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LDb/k$K0;->b:LDb/k$a;

    .line 12
    .line 13
    invoke-virtual {p1}, LDb/k$a;->a()Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, LDb/k$a;->b()Ldg/e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, LDb/k$a;->c()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1}, LDb/k$a;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1}, LDb/k$a;->e()LUb/u;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v4, 0x0

    .line 34
    :try_start_0
    invoke-interface {v1}, Ldg/e;->b()Ldg/E;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Ldg/E;->j()Ldg/F;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v7, Ljava/io/BufferedInputStream;

    .line 43
    .line 44
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ldg/F;->a()Ljava/io/InputStream;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-direct {v7, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, Ljava/io/FileOutputStream;

    .line 55
    .line 56
    invoke-direct {v6, v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 57
    .line 58
    .line 59
    const/16 v3, 0x400

    .line 60
    .line 61
    new-array v3, v3, [B

    .line 62
    .line 63
    new-instance v8, Lkotlin/jvm/internal/L;

    .line 64
    .line 65
    invoke-direct {v8}, Lkotlin/jvm/internal/L;-><init>()V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v7, v3}, Ljava/io/InputStream;->read([B)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    iput v9, v8, Lkotlin/jvm/internal/L;->a:I

    .line 73
    .line 74
    const/4 v10, -0x1

    .line 75
    if-eq v9, v10, :cond_0

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-virtual {v6, v3, v10, v9}, Ljava/io/FileOutputStream;->write([BII)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto :goto_2

    .line 84
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    .line 85
    .line 86
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-object v6, p0, LDb/k$K0;->c:LDb/k;

    .line 90
    .line 91
    const-string v7, "uri"

    .line 92
    .line 93
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v3, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v7, "status"

    .line 105
    .line 106
    invoke-virtual {v5}, Ldg/E;->o()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-virtual {v3, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    const-string v7, "headers"

    .line 114
    .line 115
    invoke-virtual {v5}, Ldg/E;->E()Ldg/t;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-static {v6, v8}, LDb/k;->Z(LDb/k;Ldg/t;)Landroid/os/Bundle;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-virtual {v3, v7, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;->getMd5()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    move-object v0, v4

    .line 142
    :goto_1
    if-eqz v0, :cond_2

    .line 143
    .line 144
    const-string v0, "md5"

    .line 145
    .line 146
    invoke-static {v6, v2}, LDb/k;->S(LDb/k;Ljava/io/File;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v3, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_2
    invoke-virtual {v5}, Ldg/E;->close()V

    .line 154
    .line 155
    .line 156
    invoke-interface {p1, v3}, LUb/u;->resolve(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    return-object v4

    .line 160
    :goto_2
    invoke-interface {v1}, Ldg/e;->u1()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    invoke-interface {p1, v4}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-object v4

    .line 170
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-eqz v1, :cond_4

    .line 175
    .line 176
    invoke-static {}, LDb/l;->a()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    :cond_4
    invoke-static {}, LDb/l;->a()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    const-string v2, "access$getTAG$p(...)"

    .line 192
    .line 193
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-interface {p1, v1, v2, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    return-object v4

    .line 204
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1
.end method
