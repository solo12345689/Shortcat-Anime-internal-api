.class public final Lpc/x;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lpe/q;

.field private final c:Lexpo/modules/kotlin/types/b;

.field private final d:Lexpo/modules/kotlin/types/b;

.field private final e:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final f:Lexpo/modules/kotlin/jni/ExpectedType;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 4

    .line 1
    const-string v0, "converterProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eitherType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lexpo/modules/kotlin/types/a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lpe/s;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :goto_0
    const-string v2, "Required value was null."

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iput-object v0, p0, Lpc/x;->a:Lpe/q;

    .line 39
    .line 40
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-static {p2, v3}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lpe/s;

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_1
    if-eqz v1, :cond_2

    .line 58
    .line 59
    iput-object v1, p0, Lpc/x;->b:Lpe/q;

    .line 60
    .line 61
    invoke-interface {p1, v0}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, Lpc/x;->c:Lexpo/modules/kotlin/types/b;

    .line 66
    .line 67
    invoke-interface {p1, v1}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lpc/x;->d:Lexpo/modules/kotlin/types/b;

    .line 72
    .line 73
    invoke-interface {p2}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p0, Lpc/x;->e:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 78
    .line 79
    invoke-interface {p1}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lpc/x;->f:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 2
    .line 3
    iget-object v1, p0, Lpc/x;->e:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 4
    .line 5
    iget-object v2, p0, Lpc/x;->f:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$a;->f([Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/x;->e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/Either;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/Either;
    .locals 3

    .line 1
    const-string p3, "value"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lpc/x;->a:Lpe/q;

    .line 7
    .line 8
    iget-object v0, p0, Lpc/x;->b:Lpe/q;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v1, v1, [Lpe/q;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object p3, v1, v2

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    aput-object v0, v1, p3

    .line 18
    .line 19
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    iget-object v0, p0, Lpc/x;->e:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 24
    .line 25
    iget-object v1, p0, Lpc/x;->c:Lexpo/modules/kotlin/types/b;

    .line 26
    .line 27
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lpc/x;->f:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 32
    .line 33
    iget-object v2, p0, Lpc/x;->d:Lexpo/modules/kotlin/types/b;

    .line 34
    .line 35
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p1, p2, v0, p3}, Lpc/z;->b(Ljava/lang/Object;LUb/d;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v0, Lexpo/modules/kotlin/types/Either;

    .line 52
    .line 53
    invoke-static {p2}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/kotlin/types/Either;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method
