.class public final Lhc/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ldc/r;

.field private final c:Ldc/r;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldc/r;Ldc/r;)V
    .locals 1

    .line 1
    const-string v0, "name"

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
    iput-object p1, p0, Lhc/k;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lhc/k;->b:Ldc/r;

    .line 12
    .line 13
    iput-object p3, p0, Lhc/k;->c:Ldc/r;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lhc/k;->d(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lhc/k;->e(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhc/k;->b:Ldc/r;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Ldc/r;->o([Ljava/lang/Object;LUb/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v0, Lpc/K;->a:Lpc/K;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static/range {v0 .. v5}, Lpc/K;->b(Lpc/K;Ljava/lang/Object;Lpc/K$a;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final e(Lhc/k;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhc/k;->c:Ldc/r;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Ldc/r;->o([Ljava/lang/Object;LUb/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final c(LUb/d;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V
    .locals 10

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jsObject"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lhc/k;->b:Ldc/r;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Lhc/i;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lhc/i;-><init>(Lhc/k;LUb/d;)V

    .line 19
    .line 20
    .line 21
    move-object v6, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v6, v1

    .line 24
    :goto_0
    iget-object v0, p0, Lhc/k;->c:Ldc/r;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v1, Lhc/j;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1}, Lhc/j;-><init>(Lhc/k;LUb/d;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    move-object v9, v1

    .line 34
    iget-object v3, p0, Lhc/k;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-object p1, p0, Lhc/k;->b:Ldc/r;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, Ldc/a;->i()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    move v4, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v1

    .line 51
    :goto_1
    iget-object p1, p0, Lhc/k;->b:Ldc/r;

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Ldc/a;->e()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    new-array v2, v1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 62
    .line 63
    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 68
    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    :goto_2
    move-object v5, p1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_3
    new-array p1, v1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_4
    iget-object p1, p0, Lhc/k;->c:Ldc/r;

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1}, Ldc/a;->i()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-ne p1, v0, :cond_5

    .line 86
    .line 87
    move v7, v0

    .line 88
    goto :goto_5

    .line 89
    :cond_5
    move v7, v1

    .line 90
    :goto_5
    iget-object p1, p0, Lhc/k;->c:Ldc/r;

    .line 91
    .line 92
    if-eqz p1, :cond_7

    .line 93
    .line 94
    invoke-virtual {p1}, Ldc/a;->e()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    new-array v0, v1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 101
    .line 102
    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 107
    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_6
    :goto_6
    move-object v8, p1

    .line 112
    move-object v2, p2

    .line 113
    goto :goto_8

    .line 114
    :cond_7
    :goto_7
    new-array p1, v1, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :goto_8
    invoke-virtual/range {v2 .. v9}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->registerProperty(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method
