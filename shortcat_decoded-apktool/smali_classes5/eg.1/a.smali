.class public final Leg/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ldg/v;


# static fields
.field public static final a:Leg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Leg/a;

    .line 2
    .line 3
    invoke-direct {v0}, Leg/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leg/a;->a:Leg/a;

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
.method public a(Ldg/v$a;)Ldg/E;
    .locals 3

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
    const-string v1, "Accept-Encoding"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ldg/C;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ldg/C;->m()Ldg/C$a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "br,gzip"

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ldg/C$a;->b()Ldg/C;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Leg/a;->b(Ldg/E;)Ldg/E;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public final b(Ldg/E;)Ldg/E;
    .locals 5

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkg/e;->b(Ldg/E;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v2, "Content-Encoding"

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {p1, v2, v3, v1, v3}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const-string v3, "br"

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-static {v1, v3, v4}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v1, LRh/b;

    .line 39
    .line 40
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ltg/j;->L()Ljava/io/InputStream;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v3}, LRh/b;-><init>(Ljava/io/InputStream;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Ltg/K;->k(Ljava/io/InputStream;)Ltg/Z;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const-string v3, "gzip"

    .line 61
    .line 62
    invoke-static {v1, v3, v4}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    new-instance v1, Ltg/t;

    .line 69
    .line 70
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {v1, v3}, Ltg/t;-><init>(Ltg/Z;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_0
    invoke-virtual {p1}, Ldg/E;->Y()Ldg/E$a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v2}, Ldg/E$a;->r(Ljava/lang/String;)Ldg/E$a;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v2, "Content-Length"

    .line 90
    .line 91
    invoke-virtual {p1, v2}, Ldg/E$a;->r(Ljava/lang/String;)Ldg/E$a;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object v2, Ldg/F;->a:Ldg/F$a;

    .line 96
    .line 97
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-wide/16 v3, -0x1

    .line 102
    .line 103
    invoke-virtual {v2, v1, v0, v3, v4}, Ldg/F$a;->c(Ltg/j;Ldg/x;J)Ldg/F;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p1, v0}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Ldg/E$a;->c()Ldg/E;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :cond_2
    return-object p1
.end method
