.class public final Lpd/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpd/c$a;
    }
.end annotation


# static fields
.field public static final d:Lpd/c$a;

.field private static final e:Ljava/lang/String;


# instance fields
.field private final a:Lexpo/modules/updates/db/UpdatesDatabase;

.field private final b:LPf/a;

.field private final c:Lexpo/modules/updates/db/UpdatesDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpd/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lpd/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpd/c;->d:Lpd/c$a;

    .line 8
    .line 9
    const-class v0, Lpd/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lpd/c;->e:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lexpo/modules/updates/db/UpdatesDatabase;)V
    .locals 2

    .line 1
    const-string v0, "mDatabase"

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
    iput-object p1, p0, Lpd/c;->a:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p1, v0, v1}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lpd/c;->b:LPf/a;

    .line 19
    .line 20
    new-instance p1, Lpd/c$b;

    .line 21
    .line 22
    invoke-direct {p1, p0, v1}, Lpd/c$b;-><init>(Lpd/c;LZd/e;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, p1, v0, v1}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lexpo/modules/updates/db/UpdatesDatabase;

    .line 30
    .line 31
    iput-object p1, p0, Lpd/c;->c:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic a(Lpd/c;)Lexpo/modules/updates/db/UpdatesDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lpd/c;->a:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lpd/c;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lpd/c;->b:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c()Lexpo/modules/updates/db/UpdatesDatabase;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/c;->c:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lpd/c$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpd/c$c;

    .line 7
    .line 8
    iget v1, v0, Lpd/c$c;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpd/c$c;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpd/c$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpd/c$c;-><init>(Lpd/c;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lpd/c$c;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lpd/c$c;->e:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lpd/c$c;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LPf/a;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :catchall_0
    move-exception p2

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, Lpd/c$c;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, LPf/a;

    .line 63
    .line 64
    iget-object v2, v0, Lpd/c$c;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 67
    .line 68
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object p2, p1

    .line 72
    move-object p1, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lpd/c;->b:LPf/a;

    .line 78
    .line 79
    iput-object p1, v0, Lpd/c$c;->a:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object p2, v0, Lpd/c$c;->b:Ljava/lang/Object;

    .line 82
    .line 83
    iput v4, v0, Lpd/c$c;->e:I

    .line 84
    .line 85
    invoke-interface {p2, v5, v0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-ne v2, v1, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    :try_start_1
    iget-object v2, p0, Lpd/c;->a:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 93
    .line 94
    iput-object p2, v0, Lpd/c$c;->a:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v5, v0, Lpd/c$c;->b:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, v0, Lpd/c$c;->e:I

    .line 99
    .line 100
    invoke-interface {p1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    if-ne p1, v1, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v1

    .line 107
    :cond_5
    move-object v6, p2

    .line 108
    move-object p2, p1

    .line 109
    move-object p1, v6

    .line 110
    :goto_3
    invoke-interface {p1, v5}, LPf/a;->e(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object p2

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    move-object v6, p2

    .line 116
    move-object p2, p1

    .line 117
    move-object p1, v6

    .line 118
    :goto_4
    invoke-interface {p1, v5}, LPf/a;->e(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    throw p2
.end method
