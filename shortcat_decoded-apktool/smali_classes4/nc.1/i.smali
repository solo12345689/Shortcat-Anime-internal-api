.class public final Lnc/i;
.super Lexpo/modules/kotlin/types/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpe/q;

.field private final b:Lnc/f;

.field private final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lpe/q;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/kotlin/types/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnc/i;->a:Lpe/q;

    .line 10
    .line 11
    new-instance v0, Lnc/f;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lnc/f;-><init>(Lpe/q;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lnc/i;->b:Lnc/f;

    .line 17
    .line 18
    new-instance p1, Lnc/h;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lnc/h;-><init>(Lnc/i;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lnc/i;->c:Lkotlin/Lazy;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic e(Lnc/i;)Lpe/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lnc/i;->i(Lnc/i;)Lpe/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f(Lexpo/modules/kotlin/sharedobjects/SharedRef;)Lexpo/modules/kotlin/sharedobjects/SharedRef;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lexpo/modules/kotlin/sharedobjects/SharedRef;->O()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Lnc/i;->h()Lpe/q;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Lpe/q;->c()Lpe/f;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v1, v2

    .line 21
    :goto_0
    instance-of v3, v1, Lpe/d;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lpe/d;

    .line 27
    .line 28
    :cond_2
    if-nez v2, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v2, v0}, LUb/n;->a(Lpe/d;Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    :goto_1
    return-object p1

    .line 42
    :cond_4
    new-instance v0, Lcc/o;

    .line 43
    .line 44
    iget-object v1, p0, Lnc/i;->a:Lpe/q;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, v1, p1}, Lcc/o;-><init>(Lpe/q;Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method private static final i(Lnc/i;)Lpe/q;
    .locals 4

    .line 1
    iget-object v0, p0, Lnc/i;->a:Lpe/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lpe/q;->c()Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lpe/d;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lpe/d;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    iget-object v1, p0, Lnc/i;->a:Lpe/q;

    .line 17
    .line 18
    :goto_1
    if-eqz v0, :cond_8

    .line 19
    .line 20
    const-class v3, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 21
    .line 22
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_5

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lpe/q;->e()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lpe/s;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    move-object v0, v2

    .line 48
    :goto_2
    sget-object v1, Lpe/s;->c:Lpe/s$a;

    .line 49
    .line 50
    invoke-virtual {v1}, Lpe/s$a;->c()Lpe/s;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_2
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Lpe/s;->c()Lpe/q;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_4
    invoke-virtual {p0}, Lnc/i;->h()Lpe/q;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v1, "The "

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p0, " type should contain the type of the inner ref"

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_5
    invoke-interface {v0}, Lpe/d;->k()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, Lpe/q;

    .line 116
    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    invoke-interface {v1}, Lpe/q;->c()Lpe/f;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_3

    .line 124
    :cond_6
    move-object v0, v2

    .line 125
    :goto_3
    instance-of v3, v0, Lpe/d;

    .line 126
    .line 127
    if-eqz v3, :cond_7

    .line 128
    .line 129
    check-cast v0, Lpe/d;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    move-object v0, v2

    .line 133
    goto :goto_1

    .line 134
    :cond_8
    return-object v2
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnc/i;->b:Lnc/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnc/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Lexpo/modules/kotlin/jni/ExpectedType;
    .locals 1

    .line 1
    iget-object v0, p0, Lnc/i;->b:Lnc/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnc/f;->c()Lexpo/modules/kotlin/jni/ExpectedType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lnc/i;->g(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Ljava/lang/Object;LUb/d;Z)Lexpo/modules/kotlin/sharedobjects/SharedRef;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnc/i;->b:Lnc/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/types/a;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lnc/i;->f(Lexpo/modules/kotlin/sharedobjects/SharedRef;)Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public final h()Lpe/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lnc/i;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpe/q;

    .line 8
    .line 9
    return-object v0
.end method
