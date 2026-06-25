.class public final Lpc/w;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lpe/q;

.field private final c:Lpe/q;

.field private final d:Lexpo/modules/kotlin/types/b;

.field private final e:Lexpo/modules/kotlin/types/b;

.field private final f:Lexpo/modules/kotlin/types/b;

.field private final g:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final h:Lexpo/modules/kotlin/jni/ExpectedType;

.field private final i:Lexpo/modules/kotlin/jni/ExpectedType;


# direct methods
.method public constructor <init>(Lpc/X;Lpe/q;)V
    .locals 5

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
    if-eqz v0, :cond_5

    .line 37
    .line 38
    iput-object v0, p0, Lpc/w;->a:Lpe/q;

    .line 39
    .line 40
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static {v3, v4}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lpe/s;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Lpe/s;->c()Lpe/q;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v3, v1

    .line 59
    :goto_1
    if-eqz v3, :cond_4

    .line 60
    .line 61
    iput-object v3, p0, Lpc/w;->b:Lpe/q;

    .line 62
    .line 63
    invoke-interface {p2}, Lpe/q;->e()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const/4 v4, 0x2

    .line 68
    invoke-static {p2, v4}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lpe/s;

    .line 73
    .line 74
    if-eqz p2, :cond_2

    .line 75
    .line 76
    invoke-virtual {p2}, Lpe/s;->c()Lpe/q;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_2
    if-eqz v1, :cond_3

    .line 81
    .line 82
    iput-object v1, p0, Lpc/w;->c:Lpe/q;

    .line 83
    .line 84
    invoke-interface {p1, v0}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, p0, Lpc/w;->d:Lexpo/modules/kotlin/types/b;

    .line 89
    .line 90
    invoke-interface {p1, v3}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Lpc/w;->e:Lexpo/modules/kotlin/types/b;

    .line 95
    .line 96
    invoke-interface {p1, v1}, Lpc/X;->a(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Lpc/w;->f:Lexpo/modules/kotlin/types/b;

    .line 101
    .line 102
    invoke-interface {p2}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iput-object p2, p0, Lpc/w;->g:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 107
    .line 108
    invoke-interface {v0}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    iput-object p2, p0, Lpc/w;->h:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 113
    .line 114
    invoke-interface {p1}, Lexpo/modules/kotlin/types/b;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lpc/w;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 119
    .line 120
    return-void

    .line 121
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 134
    .line 135
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
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
    .locals 4

    .line 1
    sget-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 2
    .line 3
    iget-object v1, p0, Lpc/w;->g:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 4
    .line 5
    iget-object v2, p0, Lpc/w;->h:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 6
    .line 7
    iget-object v3, p0, Lpc/w;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 8
    .line 9
    filled-new-array {v1, v2, v3}, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$a;->f([Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/w;->e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/EitherOfThree;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public e(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/types/EitherOfThree;
    .locals 4

    .line 1
    const-string p3, "value"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lpc/w;->a:Lpe/q;

    .line 7
    .line 8
    iget-object v0, p0, Lpc/w;->b:Lpe/q;

    .line 9
    .line 10
    iget-object v1, p0, Lpc/w;->c:Lpe/q;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    new-array v2, v2, [Lpe/q;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object p3, v2, v3

    .line 17
    .line 18
    const/4 p3, 0x1

    .line 19
    aput-object v0, v2, p3

    .line 20
    .line 21
    const/4 p3, 0x2

    .line 22
    aput-object v1, v2, p3

    .line 23
    .line 24
    invoke-static {v2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iget-object v0, p0, Lpc/w;->g:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 29
    .line 30
    iget-object v1, p0, Lpc/w;->d:Lexpo/modules/kotlin/types/b;

    .line 31
    .line 32
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Lpc/w;->h:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 37
    .line 38
    iget-object v2, p0, Lpc/w;->e:Lexpo/modules/kotlin/types/b;

    .line 39
    .line 40
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, p0, Lpc/w;->i:Lexpo/modules/kotlin/jni/ExpectedType;

    .line 45
    .line 46
    iget-object v3, p0, Lpc/w;->f:Lexpo/modules/kotlin/types/b;

    .line 47
    .line 48
    invoke-static {v2, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {p1, p2, v0, p3}, Lpc/z;->b(Ljava/lang/Object;LUb/d;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v0, Lexpo/modules/kotlin/types/EitherOfThree;

    .line 65
    .line 66
    invoke-static {p2}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/kotlin/types/EitherOfThree;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method
