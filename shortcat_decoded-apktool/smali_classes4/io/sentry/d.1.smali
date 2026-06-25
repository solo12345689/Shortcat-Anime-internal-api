.class public final Lio/sentry/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/d$b;,
        Lio/sentry/d$c;
    }
.end annotation


# static fields
.field static final i:Ljava/lang/Integer;

.field static final j:Ljava/lang/Integer;

.field private static final k:Lio/sentry/d$c;


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;

.field private final b:Lio/sentry/util/a;

.field private c:Ljava/lang/Double;

.field private d:Ljava/lang/Double;

.field private final e:Ljava/lang/String;

.field private f:Z

.field private final g:Z

.field final h:Lio/sentry/ILogger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/d;->i:Ljava/lang/Integer;

    .line 8
    .line 9
    const/16 v0, 0x40

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lio/sentry/d;->j:Ljava/lang/Integer;

    .line 16
    .line 17
    new-instance v0, Lio/sentry/d$c;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, v1}, Lio/sentry/d$c;-><init>(Lio/sentry/d$a;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/sentry/d;->k:Lio/sentry/d$c;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lio/sentry/ILogger;)V
    .locals 8

    .line 1
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lio/sentry/d;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZZLio/sentry/ILogger;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZZLio/sentry/ILogger;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Lio/sentry/util/a;-><init>()V

    iput-object v0, p0, Lio/sentry/d;->b:Lio/sentry/util/a;

    .line 4
    iput-object p1, p0, Lio/sentry/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    iput-object p2, p0, Lio/sentry/d;->c:Ljava/lang/Double;

    .line 6
    iput-object p3, p0, Lio/sentry/d;->d:Ljava/lang/Double;

    .line 7
    iput-object p7, p0, Lio/sentry/d;->h:Lio/sentry/ILogger;

    .line 8
    iput-object p4, p0, Lio/sentry/d;->e:Ljava/lang/String;

    .line 9
    iput-boolean p5, p0, Lio/sentry/d;->f:Z

    .line 10
    iput-boolean p6, p0, Lio/sentry/d;->g:Z

    return-void
.end method

.method public static c(Lio/sentry/j2;Ljava/lang/String;Lio/sentry/z3;)Lio/sentry/d;
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/d;

    .line 2
    .line 3
    invoke-virtual {p2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lio/sentry/d;-><init>(Lio/sentry/ILogger;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lio/sentry/protocol/c;->j()Lio/sentry/T3;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Lio/sentry/T3;->p()Lio/sentry/protocol/x;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v2

    .line 31
    :goto_0
    invoke-virtual {v0, v1}, Lio/sentry/d;->E(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lio/sentry/z3;->retrieveParsedDsn()Lio/sentry/v;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lio/sentry/v;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {v0, p2}, Lio/sentry/d;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lio/sentry/j2;->J()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {v0, p2}, Lio/sentry/d;->z(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lio/sentry/j2;->F()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {v0, p2}, Lio/sentry/d;->x(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lio/sentry/d;->F(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lio/sentry/d;->C(Ljava/lang/Double;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lio/sentry/d;->D(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Lio/sentry/d;->B(Ljava/lang/Double;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string p2, "replay_id"

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v2, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 88
    .line 89
    invoke-virtual {v2}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_1

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0, p1}, Lio/sentry/d;->A(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lio/sentry/j2;->C()Lio/sentry/protocol/c;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, p2}, Lio/sentry/protocol/c;->n(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual {v0}, Lio/sentry/d;->b()V

    .line 114
    .line 115
    .line 116
    return-object v0
.end method

.method private static p(Lio/sentry/protocol/H;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lio/sentry/protocol/H;->URL:Lio/sentry/protocol/H;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private static s(Lio/sentry/h4;)Ljava/lang/Double;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lio/sentry/h4;->c()Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static t(Lio/sentry/h4;)Ljava/lang/Double;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lio/sentry/h4;->d()Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static u(Ljava/lang/Double;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lio/sentry/util/A;->h(Ljava/lang/Double;Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Lio/sentry/d;->k:Lio/sentry/d$c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/text/DecimalFormat;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static v(Lio/sentry/h4;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lio/sentry/h4;->e()Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-replay_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public B(Ljava/lang/Double;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/d;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/d;->d:Ljava/lang/Double;

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public C(Ljava/lang/Double;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/d;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/d;->c:Ljava/lang/Double;

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-sampled"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public E(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-trace_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-transaction"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public G(Lio/sentry/h4;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lio/sentry/d;->v(Lio/sentry/h4;)Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lio/sentry/util/D;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lio/sentry/d;->D(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/h4;->c()Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Lio/sentry/d;->s(Lio/sentry/h4;)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lio/sentry/d;->B(Ljava/lang/Double;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Lio/sentry/h4;->d()Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {p1}, Lio/sentry/d;->t(Lio/sentry/h4;)Ljava/lang/Double;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lio/sentry/d;->a(Ljava/lang/Double;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public H(Lio/sentry/Y;Lio/sentry/z3;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lio/sentry/Y;->H()Lio/sentry/x1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lio/sentry/Y;->G()Lio/sentry/protocol/x;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0}, Lio/sentry/x1;->e()Lio/sentry/protocol/x;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lio/sentry/d;->E(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lio/sentry/z3;->retrieveParsedDsn()Lio/sentry/v;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lio/sentry/v;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Lio/sentry/d;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lio/sentry/d;->z(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lio/sentry/z3;->getEnvironment()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p0, p2}, Lio/sentry/d;->x(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Lio/sentry/protocol/x;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, p1}, Lio/sentry/d;->A(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    const/4 p1, 0x0

    .line 61
    invoke-virtual {p0, p1}, Lio/sentry/d;->F(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lio/sentry/d;->C(Ljava/lang/Double;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lio/sentry/d;->D(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public I(Lio/sentry/protocol/x;Lio/sentry/protocol/x;Lio/sentry/z3;Lio/sentry/h4;Ljava/lang/String;Lio/sentry/protocol/H;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lio/sentry/d;->E(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Lio/sentry/z3;->retrieveParsedDsn()Lio/sentry/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lio/sentry/v;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lio/sentry/d;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lio/sentry/d;->z(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, Lio/sentry/z3;->getEnvironment()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lio/sentry/d;->x(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p6}, Lio/sentry/d;->p(Lio/sentry/protocol/H;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p5, 0x0

    .line 41
    :goto_0
    invoke-virtual {p0, p5}, Lio/sentry/d;->F(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lio/sentry/protocol/x;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Lio/sentry/d;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-static {p4}, Lio/sentry/d;->t(Lio/sentry/h4;)Ljava/lang/Double;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Lio/sentry/d;->C(Ljava/lang/Double;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p4}, Lio/sentry/d;->v(Lio/sentry/h4;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Lio/sentry/util/D;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lio/sentry/d;->D(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p4}, Lio/sentry/d;->s(Lio/sentry/h4;)Ljava/lang/Double;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Lio/sentry/d;->B(Ljava/lang/Double;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public J()Lio/sentry/f4;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lio/sentry/d;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lio/sentry/d;->h()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lio/sentry/d;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    move-object v3, v2

    .line 19
    new-instance v2, Lio/sentry/f4;

    .line 20
    .line 21
    move-object v5, v3

    .line 22
    new-instance v3, Lio/sentry/protocol/x;

    .line 23
    .line 24
    invoke-direct {v3, v0}, Lio/sentry/protocol/x;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v5

    .line 28
    invoke-virtual {p0}, Lio/sentry/d;->g()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p0}, Lio/sentry/d;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {p0}, Lio/sentry/d;->o()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {p0}, Lio/sentry/d;->m()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {p0}, Lio/sentry/d;->j()Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v9}, Lio/sentry/d;->u(Ljava/lang/Double;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {p0}, Lio/sentry/d;->k()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    :goto_0
    move-object v11, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    new-instance v0, Lio/sentry/protocol/x;

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lio/sentry/protocol/x;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    invoke-virtual {p0}, Lio/sentry/d;->i()Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lio/sentry/d;->u(Ljava/lang/Double;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-direct/range {v2 .. v12}, Lio/sentry/f4;-><init>(Lio/sentry/protocol/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/x;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lio/sentry/d;->n()Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v2, v0}, Lio/sentry/f4;->c(Ljava/util/Map;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_1
    move-object v0, v2

    .line 86
    return-object v0
.end method

.method public a(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/d;->c:Ljava/lang/Double;

    .line 2
    .line 3
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lio/sentry/d;->f:Z

    .line 3
    .line 4
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lio/sentry/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-environment"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-public_key"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-release"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-replay_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/d;->d:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/d;->c:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-sampled"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-trace_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-transaction"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public n()Ljava/util/Map;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/d;->b:Lio/sentry/util/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :try_start_0
    iget-object v2, p0, Lio/sentry/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    sget-object v5, Lio/sentry/d$b;->a:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_0

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    const-string v5, "sentry-"

    .line 57
    .line 58
    const-string v6, ""

    .line 59
    .line 60
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-interface {v1}, Lio/sentry/e0;->close()V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-object v0

    .line 76
    :goto_1
    if-eqz v1, :cond_3

    .line 77
    .line 78
    :try_start_1
    invoke-interface {v1}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_2
    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sentry-user_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/d;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/d;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/d;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/d;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Lio/sentry/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lio/sentry/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-environment"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-public_key"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry-release"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/d;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
