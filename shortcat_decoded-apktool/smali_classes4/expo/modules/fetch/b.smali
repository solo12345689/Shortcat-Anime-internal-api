.class public final Lexpo/modules/fetch/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/fetch/b$a;
    }
.end annotation


# static fields
.field public static final b:Lexpo/modules/fetch/b$a;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/fetch/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/fetch/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/fetch/b;->b:Lexpo/modules/fetch/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lexpo/modules/fetch/b;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method

.method private final c(Ldg/C;)Ldg/E;
    .locals 4

    .line 1
    new-instance v0, Ldg/E$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ldg/E$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ldg/E$a;->s(Ldg/C;)Ldg/E$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ldg/B;->d:Ldg/B;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ldg/E$a;->p(Ldg/B;)Ldg/E$a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 v0, 0x194

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ldg/E$a;->g(I)Ldg/E$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "File not found"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ldg/E$a;->m(Ljava/lang/String;)Ldg/E$a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v1, Ldg/F;->a:Ldg/F$a;

    .line 29
    .line 30
    sget-object v2, Ldg/x;->e:Ldg/x$a;

    .line 31
    .line 32
    const-string v3, "text/plain"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ldg/x$a;->b(Ljava/lang/String;)Ldg/x;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v0, v2}, Ldg/F$a;->b(Ljava/lang/String;Ldg/x;)Ldg/F;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method private final d(Ljava/lang/String;)Ldg/x;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "application/octet-stream"

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object p1, v0

    .line 10
    :cond_0
    sget-object v1, Ldg/x;->e:Ldg/x$a;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ldg/x$a;->c(Ljava/lang/String;)Ldg/x;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ldg/x$a;->b(Ljava/lang/String;)Ldg/x;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    return-object p1
.end method

.method private final e(Ldg/u;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ldg/u;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x0

    .line 7
    const-string v1, "http://filesystem.local"

    .line 8
    .line 9
    const-string v2, "file://"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LDf/r;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method


# virtual methods
.method public a(Ldg/v$a;)Ldg/E;
    .locals 8

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ldg/C;->p()Ldg/u;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, v1}, Lexpo/modules/fetch/b;->e(Ldg/u;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "file://"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v1, v2, v3, v4, v5}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    const-string p1, "file:///android_asset/"

    .line 35
    .line 36
    invoke-static {v1, p1, v3, v4, v5}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const-string v3, "OK"

    .line 41
    .line 42
    const/16 v4, 0xc8

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v1, p1}, LDf/r;->C0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lexpo/modules/fetch/b;->a:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/content/Context;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lexpo/modules/fetch/b;->b(Landroid/content/Context;Ljava/lang/String;)Ldg/F;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, Ldg/E$a;

    .line 65
    .line 66
    invoke-direct {v1}, Ldg/E$a;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ldg/E$a;->s(Ldg/C;)Ldg/E$a;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v2, Ldg/B;->d:Ldg/B;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ldg/E$a;->p(Ldg/B;)Ldg/E$a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1, v4}, Ldg/E$a;->g(I)Ldg/E$a;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1, v3}, Ldg/E$a;->m(Ljava/lang/String;)Ldg/E$a;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, p1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    return-object p1

    .line 96
    :catch_0
    invoke-direct {p0, v0}, Lexpo/modules/fetch/b;->c(Ldg/C;)Ldg/E;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_1
    new-instance p1, LBb/f;

    .line 102
    .line 103
    invoke-direct {p1}, LBb/f;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    const/4 p1, 0x7

    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v1, "substring(...)"

    .line 113
    .line 114
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Ljava/io/File;

    .line 118
    .line 119
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    invoke-direct {p0, v0}, Lexpo/modules/fetch/b;->c(Ldg/C;)Ldg/E;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_3
    sget-object p1, Ldg/F;->a:Ldg/F$a;

    .line 134
    .line 135
    invoke-static {v1}, Ltg/K;->j(Ljava/io/File;)Ltg/Z;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const-string v6, "getName(...)"

    .line 148
    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, v5}, Lexpo/modules/fetch/b;->d(Ljava/lang/String;)Ldg/x;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-virtual {p1, v2, v5, v6, v7}, Ldg/F$a;->c(Ltg/j;Ldg/x;J)Ldg/F;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance v1, Ldg/E$a;

    .line 165
    .line 166
    invoke-direct {v1}, Ldg/E$a;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v0}, Ldg/E$a;->s(Ldg/C;)Ldg/E$a;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sget-object v1, Ldg/B;->d:Ldg/B;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ldg/E$a;->p(Ldg/B;)Ldg/E$a;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, v4}, Ldg/E$a;->g(I)Ldg/E$a;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0, v3}, Ldg/E$a;->m(Ljava/lang/String;)Ldg/E$a;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0, p1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Ldg/F;
    .locals 8

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "open(...)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Ldg/F;->a:Ldg/F$a;

    .line 25
    .line 26
    invoke-static {p1}, Ltg/K;->k(Ljava/io/InputStream;)Ltg/Z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {p0, p2}, Lexpo/modules/fetch/b;->d(Ljava/lang/String;)Ldg/x;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x0

    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-static/range {v1 .. v7}, Ldg/F$a;->e(Ldg/F$a;Ltg/j;Ldg/x;JILjava/lang/Object;)Ldg/F;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method
