.class public abstract LQe/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lmf/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQe/e$a;,
        LQe/e$b;,
        LQe/e$c;,
        LQe/e$d;
    }
.end annotation


# static fields
.field public static final b:LQe/e$b;


# instance fields
.field private final a:LQe/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQe/e$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQe/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQe/e;->b:LQe/e$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LQe/v;)V
    .locals 1

    .line 1
    const-string v0, "kotlinClassFinder"

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
    iput-object p1, p0, LQe/e;->a:LQe/v;

    .line 10
    .line 11
    return-void
.end method

.method private final A(Lmf/N$a;)LQe/x;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lmf/N;->c()Lye/h0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, LQe/z;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, LQe/z;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v1

    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, LQe/z;->d()LQe/x;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    return-object v1
.end method

.method private final m(Lmf/N;LZe/p;)I
    .locals 3

    .line 1
    instance-of v0, p2, LSe/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p2, LSe/j;

    .line 8
    .line 9
    invoke-static {p2}, LUe/g;->g(LSe/j;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    return v1

    .line 17
    :cond_1
    instance-of v0, p2, LSe/o;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    check-cast p2, LSe/o;

    .line 22
    .line 23
    invoke-static {p2}, LUe/g;->h(LSe/o;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    instance-of v0, p2, LSe/e;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast p1, Lmf/N$a;

    .line 41
    .line 42
    invoke-virtual {p1}, Lmf/N$a;->g()LSe/c$c;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget-object v0, LSe/c$c;->d:LSe/c$c;

    .line 47
    .line 48
    if-ne p2, v0, :cond_4

    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    return p1

    .line 52
    :cond_4
    invoke-virtual {p1}, Lmf/N$a;->i()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    return v2

    .line 59
    :cond_5
    return v1

    .line 60
    :cond_6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 61
    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v1, "Unsupported message: "

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method private final n(Lmf/N;LQe/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;
    .locals 8

    .line 1
    sget-object v0, LQe/e;->b:LQe/e$b;

    .line 2
    .line 3
    iget-object v6, p0, LQe/e;->a:LQe/v;

    .line 4
    .line 5
    invoke-virtual {p0}, LQe/e;->v()LUe/c;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    move-object v1, p1

    .line 10
    move v2, p3

    .line 11
    move v3, p4

    .line 12
    move-object v4, p5

    .line 13
    move v5, p6

    .line 14
    invoke-virtual/range {v0 .. v7}, LQe/e$b;->a(Lmf/N;ZZLjava/lang/Boolean;ZLQe/v;LUe/c;)LQe/x;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, v1, p1}, LQe/e;->p(Lmf/N;LQe/x;)LQe/x;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-virtual {p0, p1}, LQe/e;->q(LQe/x;)LQe/e$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, LQe/e$a;->a()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_1
    return-object p1
.end method

.method static synthetic o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    if-nez p8, :cond_4

    .line 2
    .line 3
    and-int/lit8 p8, p7, 0x4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p8, :cond_0

    .line 7
    .line 8
    move p3, v0

    .line 9
    :cond_0
    and-int/lit8 p8, p7, 0x8

    .line 10
    .line 11
    if-eqz p8, :cond_1

    .line 12
    .line 13
    move p4, v0

    .line 14
    :cond_1
    and-int/lit8 p8, p7, 0x10

    .line 15
    .line 16
    if-eqz p8, :cond_2

    .line 17
    .line 18
    const/4 p5, 0x0

    .line 19
    :cond_2
    and-int/lit8 p7, p7, 0x20

    .line 20
    .line 21
    if-eqz p7, :cond_3

    .line 22
    .line 23
    move p6, v0

    .line 24
    :cond_3
    invoke-direct/range {p0 .. p6}, LQe/e;->n(Lmf/N;LQe/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    const-string p1, "Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations"

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public static synthetic t(LQe/e;LZe/p;LUe/d;LUe/h;Lmf/d;ZILjava/lang/Object;)LQe/A;
    .locals 6

    .line 1
    if-nez p7, :cond_1

    .line 2
    .line 3
    and-int/lit8 p6, p6, 0x10

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    const/4 p5, 0x0

    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    move v5, p5

    .line 14
    invoke-virtual/range {v0 .. v5}, LQe/e;->s(LZe/p;LUe/d;LUe/h;Lmf/d;Z)LQe/A;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: getCallableSignature"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method private final z(Lmf/N;LSe/o;LQe/e$c;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    sget-object v1, LUe/b;->B:LUe/b$b;

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, LSe/o;->f0()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1, v2}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    invoke-static/range {p2 .. p2}, LWe/h;->f(LSe/o;)Z

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    sget-object v1, LQe/e$c;->a:LQe/e$c;

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lmf/N;->b()LUe/d;

    .line 30
    .line 31
    .line 32
    move-result-object v11

    .line 33
    invoke-virtual/range {p1 .. p1}, Lmf/N;->d()LUe/h;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    const/16 v16, 0x28

    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x1

    .line 43
    const/4 v15, 0x0

    .line 44
    move-object/from16 v10, p2

    .line 45
    .line 46
    invoke-static/range {v10 .. v17}, LQe/f;->b(LSe/o;LUe/d;LUe/h;ZZZILjava/lang/Object;)LQe/A;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_0
    const/16 v10, 0x8

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v6, 0x1

    .line 61
    const/4 v7, 0x0

    .line 62
    move-object/from16 v3, p0

    .line 63
    .line 64
    move-object/from16 v4, p1

    .line 65
    .line 66
    invoke-static/range {v3 .. v11}, LQe/e;->o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_1
    move v10, v9

    .line 72
    move-object v9, v8

    .line 73
    invoke-virtual/range {p1 .. p1}, Lmf/N;->b()LUe/d;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual/range {p1 .. p1}, Lmf/N;->d()LUe/h;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/16 v7, 0x30

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v4, 0x1

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    move-object/from16 v1, p2

    .line 88
    .line 89
    invoke-static/range {v1 .. v8}, LQe/f;->b(LSe/o;LUe/d;LUe/h;ZZZILjava/lang/Object;)LQe/A;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :cond_2
    invoke-virtual {v5}, LQe/A;->a()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v2, 0x2

    .line 105
    const/4 v3, 0x0

    .line 106
    const-string v4, "$delegate"

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    invoke-static {v1, v4, v6, v2, v3}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    sget-object v2, LQe/e$c;->c:LQe/e$c;

    .line 114
    .line 115
    if-ne v0, v2, :cond_3

    .line 116
    .line 117
    const/4 v6, 0x1

    .line 118
    :cond_3
    if-eq v1, v6, :cond_4

    .line 119
    .line 120
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_4
    const/4 v6, 0x1

    .line 126
    const/4 v7, 0x1

    .line 127
    move-object/from16 v3, p0

    .line 128
    .line 129
    move-object/from16 v4, p1

    .line 130
    .line 131
    move-object v8, v9

    .line 132
    move v9, v10

    .line 133
    invoke-direct/range {v3 .. v9}, LQe/e;->n(Lmf/N;LQe/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
.end method


# virtual methods
.method public a(LSe/t;LUe/d;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LVe/a;->h:LZe/i$f;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LZe/i$d;->v(LZe/i$f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "getExtension(...)"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/lang/Iterable;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, LSe/b;

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1, p2}, LQe/e;->d(LSe/b;LUe/d;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-object v0
.end method

.method public b(Lmf/N;LSe/h;)Ljava/util/List;
    .locals 11

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LQe/A;->b:LQe/A$a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lmf/N;->b()LUe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p2}, LSe/h;->G()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-interface {v1, p2}, LUe/d;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    move-object v1, p1

    .line 26
    check-cast v1, Lmf/N$a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lmf/N$a;->e()LXe/b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, LXe/b;->b()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, LWe/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, p2, v1}, LQe/A$a;->a(Ljava/lang/String;Ljava/lang/String;)LQe/A;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/16 v9, 0x3c

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    move-object v2, p0

    .line 52
    move-object v3, p1

    .line 53
    invoke-static/range {v2 .. v10}, LQe/e;->o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public c(Lmf/N;LZe/p;Lmf/d;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "kind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lmf/N;->b()LUe/d;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p1}, Lmf/N;->d()LUe/h;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/16 v7, 0x10

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v1, p0

    .line 29
    move-object v2, p2

    .line 30
    move-object v5, p3

    .line 31
    invoke-static/range {v1 .. v8}, LQe/e;->t(LQe/e;LZe/p;LUe/d;LUe/h;Lmf/d;ZILjava/lang/Object;)LQe/A;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    sget-object p3, LQe/A;->b:LQe/A$a;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p3, p2, v0}, LQe/A$a;->e(LQe/A;I)LQe/A;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/16 v7, 0x3c

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    move-object v0, p0

    .line 52
    move-object v1, p1

    .line 53
    invoke-static/range {v0 .. v8}, LQe/e;->o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public abstract d(LSe/b;LUe/d;)Ljava/lang/Object;
.end method

.method public e(Lmf/N;LZe/p;Lmf/d;ILSe/v;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callableProto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "kind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "proto"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lmf/N;->b()LUe/d;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p1}, Lmf/N;->d()LUe/h;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/16 v7, 0x10

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v1, p0

    .line 34
    move-object v2, p2

    .line 35
    move-object v5, p3

    .line 36
    invoke-static/range {v1 .. v8}, LQe/e;->t(LQe/e;LZe/p;LUe/d;LUe/h;Lmf/d;ZILjava/lang/Object;)LQe/A;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-direct {p0, p1, v2}, LQe/e;->m(Lmf/N;LZe/p;)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    add-int/2addr p4, p3

    .line 47
    sget-object p3, LQe/A;->b:LQe/A$a;

    .line 48
    .line 49
    invoke-virtual {p3, p2, p4}, LQe/A$a;->e(LQe/A;I)LQe/A;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/16 v7, 0x3c

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    move-object v0, p0

    .line 61
    move-object v1, p1

    .line 62
    invoke-static/range {v0 .. v8}, LQe/e;->o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public f(Lmf/N;LSe/o;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LQe/e$c;->b:LQe/e$c;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0}, LQe/e;->z(Lmf/N;LSe/o;LQe/e$c;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public g(Lmf/N;LSe/o;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LQe/e$c;->c:LQe/e$c;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0}, LQe/e;->z(Lmf/N;LSe/o;LQe/e$c;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public h(Lmf/N;LZe/p;Lmf/d;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "kind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lmf/d;->b:Lmf/d;

    .line 17
    .line 18
    if-ne p3, v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, LSe/o;

    .line 22
    .line 23
    sget-object v2, LQe/e$c;->a:LQe/e$c;

    .line 24
    .line 25
    invoke-direct {p0, p1, v0, v2}, LQe/e;->z(Lmf/N;LSe/o;LQe/e$c;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-virtual {p1}, Lmf/N;->b()LUe/d;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {p1}, Lmf/N;->d()LUe/h;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/16 v8, 0x10

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    move-object v2, p0

    .line 43
    move-object v3, p2

    .line 44
    move-object v6, p3

    .line 45
    invoke-static/range {v2 .. v9}, LQe/e;->t(LQe/e;LZe/p;LUe/d;LUe/h;Lmf/d;ZILjava/lang/Object;)LQe/A;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_1
    const/16 v7, 0x3c

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    move-object v1, p1

    .line 64
    move-object v2, v0

    .line 65
    move-object v0, p0

    .line 66
    invoke-static/range {v0 .. v8}, LQe/e;->o(LQe/e;Lmf/N;LQe/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    return-object v1
.end method

.method public i(LSe/r;LUe/d;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LVe/a;->f:LZe/i$f;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LZe/i$d;->v(LZe/i$f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "getExtension(...)"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/lang/Iterable;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, LSe/b;

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1, p2}, LQe/e;->d(LSe/b;LUe/d;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-object v0
.end method

.method public j(Lmf/N$a;)Ljava/util/List;
    .locals 3

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LQe/e;->A(Lmf/N$a;)LQe/x;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, LQe/e$e;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, LQe/e$e;-><init>(LQe/e;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, LQe/e;->r(LQe/x;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v1, v2}, LQe/x;->b(LQe/x$c;[B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "Class for loading annotations is not found: "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lmf/N$a;->a()LXe/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method protected final p(Lmf/N;LQe/x;)LQe/x;
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    instance-of p2, p1, Lmf/N$a;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    check-cast p1, Lmf/N$a;

    .line 13
    .line 14
    invoke-direct {p0, p1}, LQe/e;->A(Lmf/N$a;)LQe/x;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    return-object p2
.end method

.method protected abstract q(LQe/x;)LQe/e$a;
.end method

.method protected r(LQe/x;)[B
    .locals 1

    .line 1
    const-string v0, "kotlinClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method protected final s(LZe/p;LUe/d;LUe/h;Lmf/d;Z)LQe/A;
    .locals 8

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeTable"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "kind"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p1, LSe/e;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object p4, LQe/A;->b:LQe/A$a;

    .line 27
    .line 28
    sget-object p5, LWe/h;->a:LWe/h;

    .line 29
    .line 30
    check-cast p1, LSe/e;

    .line 31
    .line 32
    invoke-virtual {p5, p1, p2, p3}, LWe/h;->b(LSe/e;LUe/d;LUe/h;)LWe/d$b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    invoke-virtual {p4, p1}, LQe/A$a;->b(LWe/d;)LQe/A;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_1
    instance-of v0, p1, LSe/j;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    sget-object p4, LQe/A;->b:LQe/A$a;

    .line 49
    .line 50
    sget-object p5, LWe/h;->a:LWe/h;

    .line 51
    .line 52
    check-cast p1, LSe/j;

    .line 53
    .line 54
    invoke-virtual {p5, p1, p2, p3}, LWe/h;->e(LSe/j;LUe/d;LUe/h;)LWe/d$b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_2
    invoke-virtual {p4, p1}, LQe/A$a;->b(LWe/d;)LQe/A;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_3
    instance-of v0, p1, LSe/o;

    .line 67
    .line 68
    if-eqz v0, :cond_9

    .line 69
    .line 70
    move-object v0, p1

    .line 71
    check-cast v0, LZe/i$d;

    .line 72
    .line 73
    sget-object v2, LVe/a;->d:LZe/i$f;

    .line 74
    .line 75
    const-string v3, "propertySignature"

    .line 76
    .line 77
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v2}, LUe/f;->a(LZe/i$d;LZe/i$f;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, LVe/a$d;

    .line 85
    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_4
    sget-object v2, LQe/e$d;->a:[I

    .line 90
    .line 91
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    aget p4, v2, p4

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    if-eq p4, v2, :cond_8

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    if-eq p4, v2, :cond_6

    .line 102
    .line 103
    const/4 v0, 0x3

    .line 104
    if-eq p4, v0, :cond_5

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_5
    move-object v2, p1

    .line 108
    check-cast v2, LSe/o;

    .line 109
    .line 110
    const/4 v5, 0x1

    .line 111
    const/4 v6, 0x1

    .line 112
    move-object v3, p2

    .line 113
    move-object v4, p3

    .line 114
    move v7, p5

    .line 115
    invoke-static/range {v2 .. v7}, LQe/f;->a(LSe/o;LUe/d;LUe/h;ZZZ)LQe/A;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_6
    move-object v3, p2

    .line 121
    invoke-virtual {v0}, LVe/a$d;->I()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    sget-object p1, LQe/A;->b:LQe/A$a;

    .line 128
    .line 129
    invoke-virtual {v0}, LVe/a$d;->D()LVe/a$c;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    const-string p3, "getSetter(...)"

    .line 134
    .line 135
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v3, p2}, LQe/A$a;->c(LUe/d;LVe/a$c;)LQe/A;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_7
    return-object v1

    .line 144
    :cond_8
    move-object v3, p2

    .line 145
    invoke-virtual {v0}, LVe/a$d;->H()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_9

    .line 150
    .line 151
    sget-object p1, LQe/A;->b:LQe/A$a;

    .line 152
    .line 153
    invoke-virtual {v0}, LVe/a$d;->C()LVe/a$c;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    const-string p3, "getGetter(...)"

    .line 158
    .line 159
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v3, p2}, LQe/A$a;->c(LUe/d;LVe/a$c;)LQe/A;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :cond_9
    return-object v1
.end method

.method protected final u()LQe/v;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/e;->a:LQe/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract v()LUe/c;
.end method

.method protected final w(LXe/b;)Z
    .locals 3

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LXe/b;->e()LXe/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, LXe/b;->h()LXe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "Container"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, LQe/e;->a:LQe/v;

    .line 31
    .line 32
    invoke-virtual {p0}, LQe/e;->v()LUe/c;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v0, p1, v2}, LQe/w;->b(LQe/v;LXe/b;LUe/c;)LQe/x;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    sget-object v0, Lue/a;->a:Lue/a;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lue/a;->c(LQe/x;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    return v1
.end method

.method protected abstract x(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;
.end method

.method protected final y(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;
    .locals 1

    .line 1
    const-string v0, "annotationClassId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "result"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lue/a;->a:Lue/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lue/a;->b()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LQe/e;->x(LXe/b;Lye/h0;Ljava/util/List;)LQe/x$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
