.class final Lxa/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/T;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/v$c;
    }
.end annotation


# static fields
.field private static final b:Lxa/C;


# instance fields
.field private final a:Lxa/C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxa/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lxa/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxa/v;->b:Lxa/C;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lxa/v;->c()Lxa/C;

    move-result-object v0

    invoke-direct {p0, v0}, Lxa/v;-><init>(Lxa/C;)V

    return-void
.end method

.method private constructor <init>(Lxa/C;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lxa/q;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/C;

    iput-object p1, p0, Lxa/v;->a:Lxa/C;

    return-void
.end method

.method private static b(Lxa/B;)Z
    .locals 1

    .line 1
    sget-object v0, Lxa/v$b;->a:[I

    .line 2
    .line 3
    invoke-interface {p0}, Lxa/B;->c()Lxa/M;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static c()Lxa/C;
    .locals 5

    .line 1
    new-instance v0, Lxa/v$c;

    .line 2
    .line 3
    invoke-static {}, Lxa/o;->c()Lxa/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lxa/v;->d()Lxa/C;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Lxa/C;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object v1, v3, v4

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object v2, v3, v1

    .line 19
    .line 20
    invoke-direct {v0, v3}, Lxa/v$c;-><init>([Lxa/C;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method private static d()Lxa/C;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lxa/C;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    sget-object v0, Lxa/v;->b:Lxa/C;

    .line 22
    .line 23
    return-object v0
.end method

.method private static e(Ljava/lang/Class;Lxa/B;)Lxa/S;
    .locals 8

    .line 1
    const-class v0, Lxa/p;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {p1}, Lxa/v;->b(Lxa/B;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lxa/K;->b()Lxa/I;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {}, Lxa/u;->b()Lxa/u;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lxa/U;->l()Lxa/Y;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {}, Lxa/m;->b()Lxa/k;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {}, Lxa/A;->b()Lxa/y;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    move-object v1, p0

    .line 36
    move-object v2, p1

    .line 37
    invoke-static/range {v1 .. v7}, Lxa/G;->F(Ljava/lang/Class;Lxa/B;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    move-object v0, p0

    .line 43
    move-object v1, p1

    .line 44
    invoke-static {}, Lxa/K;->b()Lxa/I;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {}, Lxa/u;->b()Lxa/u;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {}, Lxa/U;->l()Lxa/Y;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static {}, Lxa/A;->b()Lxa/y;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static/range {v0 .. v6}, Lxa/G;->F(Ljava/lang/Class;Lxa/B;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_1
    move-object v0, p0

    .line 67
    move-object v1, p1

    .line 68
    invoke-static {v1}, Lxa/v;->b(Lxa/B;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_2

    .line 73
    .line 74
    invoke-static {}, Lxa/K;->a()Lxa/I;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {}, Lxa/u;->a()Lxa/u;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {}, Lxa/U;->k()Lxa/Y;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {}, Lxa/m;->a()Lxa/k;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {}, Lxa/A;->a()Lxa/y;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static/range {v0 .. v6}, Lxa/G;->F(Ljava/lang/Class;Lxa/B;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_2
    invoke-static {}, Lxa/K;->a()Lxa/I;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {}, Lxa/u;->a()Lxa/u;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {}, Lxa/U;->k()Lxa/Y;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/4 v5, 0x0

    .line 112
    invoke-static {}, Lxa/A;->a()Lxa/y;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static/range {v0 .. v6}, Lxa/G;->F(Ljava/lang/Class;Lxa/B;Lxa/I;Lxa/u;Lxa/Y;Lxa/k;Lxa/y;)Lxa/G;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lxa/S;
    .locals 2

    .line 1
    invoke-static {p1}, Lxa/U;->h(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxa/v;->a:Lxa/C;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lxa/C;->a(Ljava/lang/Class;)Lxa/B;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lxa/B;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const-class v1, Lxa/p;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lxa/U;->l()Lxa/Y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lxa/m;->b()Lxa/k;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0}, Lxa/B;->b()Lxa/D;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p1, v1, v0}, Lxa/H;->i(Lxa/Y;Lxa/k;Lxa/D;)Lxa/H;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_0
    invoke-static {}, Lxa/U;->k()Lxa/Y;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {}, Lxa/m;->a()Lxa/k;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0}, Lxa/B;->b()Lxa/D;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1, v1, v0}, Lxa/H;->i(Lxa/Y;Lxa/k;Lxa/D;)Lxa/H;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_1
    invoke-static {p1, v0}, Lxa/v;->e(Ljava/lang/Class;Lxa/B;)Lxa/S;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method
