.class public final Lse/U0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/internal/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/U0$a;
    }
.end annotation


# static fields
.field static final synthetic e:[Lpe/m;


# instance fields
.field private final a:Lqf/S;

.field private final b:Lse/a1$a;

.field private final c:Lse/a1$a;

.field private final d:Lse/a1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, Lse/U0;

    .line 4
    .line 5
    const-string v2, "classifier"

    .line 6
    .line 7
    const-string v3, "getClassifier()Lkotlin/reflect/KClassifier;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/F;

    .line 18
    .line 19
    const-string v3, "arguments"

    .line 20
    .line 21
    const-string v5, "getArguments()Ljava/util/List;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Lpe/m;

    .line 32
    .line 33
    aput-object v0, v2, v4

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v2, v0

    .line 37
    .line 38
    sput-object v2, Lse/U0;->e:[Lpe/m;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lqf/S;Lie/a;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lse/U0;->a:Lqf/S;

    .line 3
    instance-of p1, p2, Lse/a1$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lse/a1$a;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    invoke-static {p2}, Lse/a1;->b(Lie/a;)Lse/a1$a;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :cond_2
    :goto_1
    iput-object v0, p0, Lse/U0;->b:Lse/a1$a;

    .line 4
    new-instance p1, Lse/Q0;

    invoke-direct {p1, p0}, Lse/Q0;-><init>(Lse/U0;)V

    invoke-static {p1}, Lse/a1;->b(Lie/a;)Lse/a1$a;

    move-result-object p1

    iput-object p1, p0, Lse/U0;->c:Lse/a1$a;

    .line 5
    new-instance p1, Lse/R0;

    invoke-direct {p1, p0, p2}, Lse/R0;-><init>(Lse/U0;Lie/a;)V

    invoke-static {p1}, Lse/a1;->b(Lie/a;)Lse/a1$a;

    move-result-object p1

    iput-object p1, p0, Lse/U0;->d:Lse/a1$a;

    return-void
.end method

.method public synthetic constructor <init>(Lqf/S;Lie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lse/U0;-><init>(Lqf/S;Lie/a;)V

    return-void
.end method

.method static synthetic j(Lse/U0;)Lpe/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/U0;->y(Lse/U0;)Lpe/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(Lse/U0;Lie/a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lse/U0;->o(Lse/U0;Lie/a;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m(Lse/U0;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/U0;->q(Lse/U0;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic n(Lse/U0;ILkotlin/Lazy;)Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lse/U0;->x(Lse/U0;ILkotlin/Lazy;)Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final o(Lse/U0;Lie/a;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v1, LTd/q;->b:LTd/q;

    .line 19
    .line 20
    new-instance v2, Lse/S0;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lse/S0;-><init>(Lse/U0;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_7

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    add-int/lit8 v5, v3, 0x1

    .line 56
    .line 57
    if-gez v3, :cond_1

    .line 58
    .line 59
    invoke-static {}, LUd/u;->w()V

    .line 60
    .line 61
    .line 62
    :cond_1
    check-cast v4, Lqf/B0;

    .line 63
    .line 64
    invoke-interface {v4}, Lqf/B0;->a()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    sget-object v3, Lpe/s;->c:Lpe/s$a;

    .line 71
    .line 72
    invoke-virtual {v3}, Lpe/s$a;->c()Lpe/s;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-instance v6, Lse/U0;

    .line 78
    .line 79
    invoke-interface {v4}, Lqf/B0;->getType()Lqf/S;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    const-string v8, "getType(...)"

    .line 84
    .line 85
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    new-instance v8, Lse/T0;

    .line 93
    .line 94
    invoke-direct {v8, p0, v3, v1}, Lse/T0;-><init>(Lse/U0;ILkotlin/Lazy;)V

    .line 95
    .line 96
    .line 97
    move-object v3, v8

    .line 98
    :goto_1
    invoke-direct {v6, v7, v3}, Lse/U0;-><init>(Lqf/S;Lie/a;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4}, Lqf/B0;->b()Lqf/N0;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    sget-object v4, Lse/U0$a;->a:[I

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    aget v3, v4, v3

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    if-eq v3, v4, :cond_6

    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    if-eq v3, v4, :cond_5

    .line 118
    .line 119
    const/4 v4, 0x3

    .line 120
    if-ne v3, v4, :cond_4

    .line 121
    .line 122
    sget-object v3, Lpe/s;->c:Lpe/s$a;

    .line 123
    .line 124
    invoke-virtual {v3, v6}, Lpe/s$a;->b(Lpe/q;)Lpe/s;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    new-instance p0, LTd/r;

    .line 130
    .line 131
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :cond_5
    sget-object v3, Lpe/s;->c:Lpe/s$a;

    .line 136
    .line 137
    invoke-virtual {v3, v6}, Lpe/s$a;->a(Lpe/q;)Lpe/s;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_2

    .line 142
    :cond_6
    sget-object v3, Lpe/s;->c:Lpe/s$a;

    .line 143
    .line 144
    invoke-virtual {v3, v6}, Lpe/s$a;->d(Lpe/q;)Lpe/s;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    :goto_2
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move v3, v5

    .line 152
    goto :goto_0

    .line 153
    :cond_7
    return-object v2
.end method

.method private static final q(Lse/U0;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lse/U0;->f()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, LEe/f;->h(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static final r(Lkotlin/Lazy;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final x(Lse/U0;ILkotlin/Lazy;)Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lse/U0;->f()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-class p0, Ljava/lang/Object;

    .line 23
    .line 24
    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of v1, v0, Ljava/lang/reflect/GenericArrayType;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    new-instance p1, Lse/Y0;

    .line 45
    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v0, "Array type has been queried for a non-0th argument: "

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    invoke-static {p2}, Lse/U0;->r(Lkotlin/Lazy;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/reflect/Type;

    .line 80
    .line 81
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string p2, "getLowerBounds(...)"

    .line 93
    .line 94
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, LUd/n;->Y([Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/reflect/Type;

    .line 102
    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const-string p1, "getUpperBounds(...)"

    .line 110
    .line 111
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, LUd/n;->X([Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    move-object p1, p0

    .line 119
    check-cast p1, Ljava/lang/reflect/Type;

    .line 120
    .line 121
    :cond_5
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_6
    new-instance p1, Lse/Y0;

    .line 126
    .line 127
    new-instance p2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v0, "Non-generic type has been queried for arguments: "

    .line 133
    .line 134
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method

.method private static final y(Lse/U0;)Lpe/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lse/U0;->z(Lqf/S;)Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private final z(Lqf/S;)Lpe/f;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lqf/v0;->p()Lye/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lye/e;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_7

    .line 13
    .line 14
    check-cast v0, Lye/e;

    .line 15
    .line 16
    invoke-static {v0}, Lse/j1;->q(Lye/e;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {p1}, Lqf/S;->L0()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, LUd/u;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lqf/B0;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    invoke-interface {p1}, Lqf/B0;->getType()Lqf/S;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-direct {p0, p1}, Lse/U0;->z(Lqf/S;)Lpe/f;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v0, Lse/X;

    .line 55
    .line 56
    invoke-static {p1}, Lre/b;->a(Lpe/f;)Lpe/d;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lse/j1;->f(Ljava/lang/Class;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Lse/X;-><init>(Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    new-instance p1, Lse/Y0;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v1, "Cannot determine classifier for array element type: "

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
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p1, v0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_3
    :goto_0
    new-instance p1, Lse/X;

    .line 96
    .line 97
    invoke-direct {p1, v0}, Lse/X;-><init>(Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_4
    invoke-static {p1}, Lqf/J0;->l(Lqf/S;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_6

    .line 106
    .line 107
    new-instance p1, Lse/X;

    .line 108
    .line 109
    invoke-static {v0}, LEe/f;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    move-object v0, v1

    .line 117
    :goto_1
    invoke-direct {p1, v0}, Lse/X;-><init>(Ljava/lang/Class;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_6
    new-instance p1, Lse/X;

    .line 122
    .line 123
    invoke-direct {p1, v0}, Lse/X;-><init>(Ljava/lang/Class;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_7
    instance-of p1, v0, Lye/m0;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    new-instance p1, Lse/W0;

    .line 132
    .line 133
    check-cast v0, Lye/m0;

    .line 134
    .line 135
    invoke-direct {p1, v2, v0}, Lse/W0;-><init>(Lse/X0;Lye/m0;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_8
    instance-of p1, v0, Lye/l0;

    .line 140
    .line 141
    if-nez p1, :cond_9

    .line 142
    .line 143
    return-object v2

    .line 144
    :cond_9
    new-instance p1, LTd/s;

    .line 145
    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v1, "An operation is not implemented: "

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, "Type alias classifiers are not yet supported"

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-direct {p1, v0}, LTd/s;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1
.end method


# virtual methods
.method public final A()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/S;->O0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()Lpe/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lse/U0;->c:Lse/a1$a;

    .line 2
    .line 3
    sget-object v1, Lse/U0;->e:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lse/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lpe/f;

    .line 13
    .line 14
    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lse/U0;->d:Lse/a1$a;

    .line 2
    .line 3
    sget-object v1, Lse/U0;->e:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lse/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getValue(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lse/U0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 6
    .line 7
    check-cast p1, Lse/U0;

    .line 8
    .line 9
    iget-object v1, p1, Lse/U0;->a:Lqf/S;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lse/U0;->c()Lpe/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lse/U0;->c()Lpe/f;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lse/U0;->e()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lse/U0;->e()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    return p1
.end method

.method public f()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/U0;->b:Lse/a1$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lse/a1$a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/reflect/Type;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    invoke-static {v0}, Lse/j1;->e(Lze/a;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lse/U0;->a:Lqf/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/S;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    invoke-virtual {p0}, Lse/U0;->c()Lpe/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    invoke-virtual {p0}, Lse/U0;->e()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lse/e1;->a:Lse/e1;

    .line 2
    .line 3
    iget-object v1, p0, Lse/U0;->a:Lqf/S;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lse/e1;->l(Lqf/S;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
