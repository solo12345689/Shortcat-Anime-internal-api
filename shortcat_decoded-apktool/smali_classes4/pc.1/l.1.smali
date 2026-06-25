.class public final Lpc/l;
.super Lpc/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpc/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpc/u;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g([D)Landroid/graphics/Color;
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {p1, v0}, LUd/n;->g0([DI)Ljava/lang/Double;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    :goto_0
    const/4 v2, 0x0

    .line 16
    aget-wide v2, p1, v2

    .line 17
    .line 18
    double-to-float v2, v2

    .line 19
    const/4 v3, 0x1

    .line 20
    aget-wide v3, p1, v3

    .line 21
    .line 22
    double-to-float v3, v3

    .line 23
    const/4 v4, 0x2

    .line 24
    aget-wide v4, p1, v4

    .line 25
    .line 26
    double-to-float p1, v4

    .line 27
    double-to-float v0, v0

    .line 28
    invoke-static {v2, v3, p1, v0}, Lpc/k;->a(FFFF)Landroid/graphics/Color;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "valueOf(...)"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method private final h(I)Landroid/graphics/Color;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/bridge/j;->a(I)Landroid/graphics/Color;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "valueOf(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method private final i(Ljava/lang/String;)Landroid/graphics/Color;
    .locals 5

    .line 1
    invoke-static {}, Lpc/m;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    const-string v1, "valueOf(...)"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x2

    .line 38
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {p1, v2, v3, v0}, Lpc/k;->a(FFFF)Landroid/graphics/Color;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Lcom/facebook/react/bridge/j;->a(I)Landroid/graphics/Color;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p1
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
    .locals 7

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    new-instance v1, Lexpo/modules/kotlin/jni/SingleType;

    .line 4
    .line 5
    sget-object v2, Lec/a;->e:Lec/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    invoke-direct {v1, v2, v3, v4, v3}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lec/a;[Lexpo/modules/kotlin/jni/ExpectedType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lexpo/modules/kotlin/jni/SingleType;

    .line 13
    .line 14
    sget-object v5, Lec/a;->i:Lec/a;

    .line 15
    .line 16
    invoke-direct {v2, v5, v3, v4, v3}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lec/a;[Lexpo/modules/kotlin/jni/ExpectedType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lexpo/modules/kotlin/jni/SingleType;

    .line 20
    .line 21
    sget-object v4, Lec/a;->p:Lec/a;

    .line 22
    .line 23
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 24
    .line 25
    sget-object v6, Lec/a;->d:Lec/a;

    .line 26
    .line 27
    filled-new-array {v6}, [Lec/a;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v5}, [Lexpo/modules/kotlin/jni/ExpectedType;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-direct {v3, v4, v5}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lec/a;[Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v1, v2, v3}, [Lexpo/modules/kotlin/jni/SingleType;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/SingleType;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/l;->j(Ljava/lang/Object;LUb/d;Z)Landroid/graphics/Color;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lpc/l;->k(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Landroid/graphics/Color;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Ljava/lang/Object;LUb/d;Z)Landroid/graphics/Color;
    .locals 1

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p2, p1, Ljava/lang/Integer;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p0, p1}, Lpc/l;->h(I)Landroid/graphics/Color;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    instance-of p2, p1, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lpc/l;->i(Ljava/lang/String;)Landroid/graphics/Color;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    instance-of p2, p1, [D

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    check-cast p1, [D

    .line 37
    .line 38
    invoke-direct {p0, p1}, Lpc/l;->g([D)Landroid/graphics/Color;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v0, "Unknown argument type: "

    .line 59
    .line 60
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2
.end method

.method public k(Lcom/facebook/react/bridge/Dynamic;LUb/d;Z)Landroid/graphics/Color;
    .locals 1

    .line 1
    const-string p2, "value"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    sget-object p3, Lpc/l$a;->a:[I

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    aget p2, p3, p2

    .line 17
    .line 18
    const/4 p3, 0x1

    .line 19
    if-eq p2, p3, :cond_5

    .line 20
    .line 21
    const/4 p3, 0x2

    .line 22
    if-eq p2, p3, :cond_3

    .line 23
    .line 24
    const/4 p3, 0x3

    .line 25
    if-ne p2, p3, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asArray()Lcom/facebook/react/bridge/ReadableArray;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 p3, 0xa

    .line 40
    .line 41
    invoke-static {p1, p3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    const-string v0, "null cannot be cast to non-null type kotlin.Double"

    .line 63
    .line 64
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    check-cast p3, Ljava/lang/Double;

    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 70
    .line 71
    .line 72
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-static {p2}, LUd/u;->X0(Ljava/util/Collection;)[D

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p0, p1}, Lpc/l;->g([D)Landroid/graphics/Color;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :cond_1
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 86
    .line 87
    const-class p2, Lcom/facebook/react/bridge/ReadableArray;

    .line 88
    .line 89
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    new-instance p2, Lexpo/modules/kotlin/exception/UnexpectedException;

    .line 98
    .line 99
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance p3, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v0, "Unknown argument type: "

    .line 109
    .line 110
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-direct {p2, p1}, Lexpo/modules/kotlin/exception/UnexpectedException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p2

    .line 124
    :cond_3
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    invoke-direct {p0, p1}, Lpc/l;->i(Ljava/lang/String;)Landroid/graphics/Color;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_4
    new-instance p1, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 136
    .line 137
    const-class p2, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {p2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-direct {p1, p2}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(Lpe/d;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_5
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 148
    .line 149
    .line 150
    move-result-wide p1

    .line 151
    double-to-int p1, p1

    .line 152
    invoke-direct {p0, p1}, Lpc/l;->h(I)Landroid/graphics/Color;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    return-object p1
.end method
