.class public final LY0/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/D$a;
    }
.end annotation


# static fields
.field public static final c:LY0/D$a;

.field public static final d:I

.field private static final e:LY0/G;

.field private static final f:LGf/L;


# instance fields
.field private final a:LY0/n;

.field private b:LGf/O;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY0/D$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY0/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY0/D;->c:LY0/D$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LY0/D;->d:I

    .line 12
    .line 13
    new-instance v0, LY0/G;

    .line 14
    .line 15
    invoke-direct {v0}, LY0/G;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, LY0/D;->e:LY0/G;

    .line 19
    .line 20
    sget-object v0, LGf/L;->J:LGf/L$b;

    .line 21
    .line 22
    new-instance v1, LY0/D$c;

    .line 23
    .line 24
    invoke-direct {v1, v0}, LY0/D$c;-><init>(LGf/L$b;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, LY0/D;->f:LGf/L;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(LY0/n;LZd/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LY0/D;->a:LY0/n;

    .line 3
    sget-object p1, LY0/D;->f:LGf/L;

    .line 4
    invoke-static {}, Ld1/p;->a()LGf/K;

    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object p1

    invoke-interface {p1, p2}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object p1

    .line 6
    sget-object v0, LGf/C0;->K:LGf/C0$b;

    invoke-interface {p2, v0}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    move-result-object p2

    check-cast p2, LGf/C0;

    invoke-static {p2}, LGf/X0;->a(LGf/C0;)LGf/A;

    move-result-object p2

    .line 7
    invoke-interface {p1, p2}, LZd/i;->w(LZd/i;)LZd/i;

    move-result-object p1

    .line 8
    invoke-static {p1}, LGf/P;->a(LZd/i;)LGf/O;

    move-result-object p1

    iput-object p1, p0, LY0/D;->b:LGf/O;

    return-void
.end method

.method public synthetic constructor <init>(LY0/n;LZd/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 9
    new-instance p1, LY0/n;

    invoke-direct {p1}, LY0/n;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 10
    sget-object p2, LZd/j;->a:LZd/j;

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2}, LY0/D;-><init>(LY0/n;LZd/i;)V

    return-void
.end method


# virtual methods
.method public a(LY0/q0;LY0/U;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LY0/t0;
    .locals 9

    .line 1
    invoke-virtual {p1}, LY0/q0;->c()LY0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, LY0/C;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    sget-object v0, LY0/D;->e:LY0/G;

    .line 12
    .line 13
    invoke-virtual {p1}, LY0/q0;->c()LY0/u;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LY0/C;

    .line 18
    .line 19
    invoke-virtual {v2}, LY0/C;->p()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, LY0/q0;->f()LY0/L;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p1}, LY0/q0;->d()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-virtual {v0, v2, v3, v4}, LY0/G;->a(Ljava/util/List;LY0/L;I)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v2, p0, LY0/D;->a:LY0/n;

    .line 36
    .line 37
    invoke-static {v0, p1, v2, p2, p4}, LY0/E;->a(Ljava/util/List;LY0/q0;LY0/n;LY0/U;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    invoke-virtual {p4}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v3, v0

    .line 46
    check-cast v3, Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p4}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    new-instance p1, LY0/t0$b;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    const/4 p3, 0x2

    .line 58
    invoke-direct {p1, v4, p2, p3, v1}, LY0/t0$b;-><init>(Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_1
    new-instance v2, LY0/m;

    .line 63
    .line 64
    iget-object v6, p0, LY0/D;->a:LY0/n;

    .line 65
    .line 66
    move-object v5, p1

    .line 67
    move-object v8, p2

    .line 68
    move-object v7, p3

    .line 69
    invoke-direct/range {v2 .. v8}, LY0/m;-><init>(Ljava/util/List;Ljava/lang/Object;LY0/q0;LY0/n;Lkotlin/jvm/functions/Function1;LY0/U;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, LY0/D;->b:LGf/O;

    .line 73
    .line 74
    sget-object v5, LGf/Q;->d:LGf/Q;

    .line 75
    .line 76
    new-instance v6, LY0/D$b;

    .line 77
    .line 78
    invoke-direct {v6, v2, v1}, LY0/D$b;-><init>(LY0/m;LZd/e;)V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x1

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 85
    .line 86
    .line 87
    new-instance p1, LY0/t0$a;

    .line 88
    .line 89
    invoke-direct {p1, v2}, LY0/t0$a;-><init>(LY0/m;)V

    .line 90
    .line 91
    .line 92
    return-object p1
.end method
